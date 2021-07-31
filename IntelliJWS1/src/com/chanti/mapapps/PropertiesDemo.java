package com.chanti.mapapps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws  Exception{

        Properties properties=new Properties();

        //Read data from properties
        FileInputStream fis=new FileInputStream("student.properties");
        properties.load(fis);
        System.out.println("DATA INSIDE FILE\n="+properties);
        System.out.println("ID="+properties.getProperty("id"));
        System.out.println("NAME="+properties.getProperty("name"));
        fis.close();
        //Write data into properties
        FileOutputStream fos=new FileOutputStream("student.properties");
        properties.setProperty("phone","9849098490");
        properties.setProperty("mail","ajay@gmailcom");
        properties.store(fos,"Modified BY CHANTI");
        fos.close();
    }
}
