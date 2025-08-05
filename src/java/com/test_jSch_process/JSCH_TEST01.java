package com.test_jSch_process;

import com.jcraft.jsch.*;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;
import java.util.Vector;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import static org.apache.jasper.Constants.DEFAULT_BUFFER_SIZE;
/**
 *
 * @author Juckkapun.l
 */
public class JSCH_TEST01 {
public static void main(String[] args) 
{
    String user = "sunweb";
    String password = "webdevadmin";
    String host = "192.168.202.95";
    int port=22;

    String remoteFile="/eclaim_upload/data/test.jsp";
    
        String hcode_send = "43641";
        String eclaimNO = "43641000000000219";    

    try
    {
        JSch jsch = new JSch();
        Session session = jsch.getSession(user, host, port);
        session.setPassword(password);
        
        java.util.Properties config = new java.util.Properties(); 
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);

        System.out.println("Establishing Connection...");
        session.connect();
        System.out.println("Connection established.");
        System.out.println("Creating SFTP Channel.");
        ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
        sftpChannel.connect();
        System.out.println("SFTP Channel created.");
        
        String pathfileTest01 = "/eclaim_upload/data/2023/02_20230314/eclaim_11300_OPCS_25660213_141547593/unzip/Attach";
        //String pathfileTest01 = "/eclaim_upload/data/";
        


        //GetAttachFile_SL2003 getAtt = new GetAttachFile_SL2003();
        //getAtt.Filelist("452000", hcode_send, eclaimNO, pathfileTest01);

        sftpChannel.cd(pathfileTest01);
        
         List<SL_attfile> sl_attfile = new ArrayList<SL_attfile>();   
         Vector vec01 = sftpChannel.ls(pathfileTest01);
         //System.out.println("Vector="+vec01.toString()); 
         
         for(int i=0; i<vec01.size();i++){
            String str = vec01.get(i).toString();
            String fileName = str.substring(str.lastIndexOf(" ")+1);
            //System.out.println(fileName ); 
            SL_attfile s1 = new SL_attfile();
            s1.setFilename(fileName);
            s1.setFilepath(pathfileTest01);
                if(fileName.length() > 10)
                {
                sl_attfile.add(s1);
                }
           }    
         
             //show list file Attatch
             for ( SL_attfile filelistShow: sl_attfile)  
             {  
                 System.out.println(filelistShow.getFilename()+"  >>path="+filelistShow.getFilepath()); 
             }           
         
        
        
            String pathfileTest02 = "/eclaim_upload/data/2023/02_20230314/eclaim_11300_OPCS_25660213_141547593/unzip/Attach/43641_43641000000000219_testam01.txt";
            //File file = new File(pathfileTest02);
            InputStream out= null;
            out= sftpChannel.get(pathfileTest02); 
            
           System.out.println(out.available());
           System.out.println(out.read());
           
       System.out.println("End program =======");            
        
        //InputStream out= null;
        //out= sftpChannel.get(remoteFile);
        //BufferedReader br = new BufferedReader(new InputStreamReader(out));
        //String line;
        //while ((line = br.readLine()) != null) 
        //{
        //    System.out.println(line);
        //}
        //br.close();
        
        //1.179.193.8   https://eclaim.nhso.go.th/webComponent/
        sftpChannel.disconnect();
        session.disconnect();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
} 




}
