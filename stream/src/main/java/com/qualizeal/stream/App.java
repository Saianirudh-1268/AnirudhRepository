package com.qualizeal.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("program started");
        
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
        	fileInputStream = new FileInputStream("D:\\Team_2\\read.txt");
        	fileOutputStream = new FileOutputStream("D:\\Team_2\\write.txt"); 
        	
        	int info=0;
        	do {
        		info = fileInputStream.read();
        		if(info!=-1) {
        			fileOutputStream.write(info);
        		}
        	}while(info!=-1);
        	System.out.println("DONE");
        }catch(FileNotFoundException fnfEx) {
        	fnfEx.printStackTrace();
        }catch(IOException ioEx) {
        	ioEx.printStackTrace();
        }finally {
        	try {
        		if(fileInputStream!=null) 
            		fileInputStream.close();
        	}catch(IOException ioEx) {
            	ioEx.printStackTrace();
            }
        }
        System.out.println("Program Completed.");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }
}
