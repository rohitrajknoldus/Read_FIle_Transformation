package com.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

class CommonWords {
        public static void main(String args[]) throws IOException {
            File file = new File("/home/knoldus/ReadFileTransformation/out/production/ReadFileTransformation/com/readFile/Rohit.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            HashMap<String,Integer> map=new HashMap<String,Integer>();
            String str;
            while ((str = br.readLine()) != null) {
                String[] arr=str.split("\\s");
                for (String s : arr) {
                    if (!map.containsKey(s))
                        map.put(s, 1);
                    else
                        map.put(s, map.get(s) + 1);
                }
            }
            System.out.println("The common words in the text file are: \n"+map);
        }
}