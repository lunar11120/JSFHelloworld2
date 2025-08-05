/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject1;
import com.jcraft.jsch.*;
import java.io.*;
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
        
        
        
        InputStream out= null;
        out= sftpChannel.get(remoteFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(out));
        String line;
        while ((line = br.readLine()) != null) 
        {
            System.out.println(line);
        }
        br.close();
        sftpChannel.disconnect();
        session.disconnect();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}    
}
