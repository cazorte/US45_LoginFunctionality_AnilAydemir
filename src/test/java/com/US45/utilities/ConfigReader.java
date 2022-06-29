package com.US45.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {


        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("keyword not found!!!");
            e.printStackTrace();
        }


    }



    public static String getProp(String keyword){
        return properties.getProperty(keyword);
    }



}
