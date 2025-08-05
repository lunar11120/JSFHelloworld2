/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test_jSch_process;



import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Juckkapun.l
 */
public class GetAttachFile_SL2003 {
 


    
    public void Filelist(String TRAN_ID, String HCODE_SEND , String ECLAIM_NO ,String PATHFILE) {
        File file;
        String filter;


		String[] filelist = null;
		String[] filelist222 = {"test_am01.pdf","test_am02.jfif"};
        try {
            if (Boolean.TRUE) {
                if (Boolean.TRUE) {
                        //String realPath = PATHFILE + "unzip/Attach";
                        String realPath = PATHFILE ;
                        file = new File(realPath);
    
                        filter = HCODE_SEND + "_" + ECLAIM_NO;
                        filter = ".";
                        System.out.println(">>> Filelist method = "+FileFilter.method.startWith+  "  keyword = "+filter);
		        System.out.println("realPath="+realPath);
                        System.out.println("file exist = "+file.exists());
                        
                        FileFilter ff = new FileFilter(FileFilter.method.contains, filter);


                    if (file.exists()) {
                        System.out.println("run ==== file.exists() ***");
                        filelist = file.list(ff);
                    }
                    
                    //show list file Attatch
                    for ( String filelistShow: filelist)  
                    {  
                        System.out.println(filelistShow);  

                    }  
                    for ( String filelistShow: filelist222)  
                    {  
                        System.out.println(filelistShow);  

                    } 
                    
                }
            }
        } catch (Exception ex) {
		System.out.println(">>> GetAttachFile_SL2003  Exception No Filelist------- ="+ex.getMessage());
        }    
   
    } //filelist endhere   
    
}
