/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test_jSch_process;
import java.io.File;
import java.io.FilenameFilter;
/**
 *
 * @author Juckkapun.l
 */
public class FileFilter implements FilenameFilter {
    public static enum method{
        startWith,endWith,contains,regex
    }
    private method _method;
    private String key;

    public FileFilter(method m,String keyword) {
        _method = m;
        key = keyword;
    }

    public boolean accept(File dir, String name) {
        boolean accept=false;
        switch(_method){
            case startWith:
                accept=name.startsWith(key);break;
            case endWith:
                accept=name.endsWith(key);break;
            case contains:
                accept=name.contains(key);break;
            case regex:
                accept=name.matches(key);break;
        }
        return accept;
    }    
}
