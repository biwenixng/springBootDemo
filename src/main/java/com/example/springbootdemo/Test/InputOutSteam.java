package com.example.springbootdemo.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InputOutSteam {
//    public static void main(String[] args) throws IOException {
//        File file = new File("a.txt");
//        FileWriter fileWriter = new FileWriter(file,true);
//        fileWriter.write("草拟吗");
//        fileWriter.write("97");
//        fileWriter.close();
//    }

    /**
     * 复制文件夹
     * @param args
     */
    public static void main(String[] args) throws IOException {
//        File src = new File("E:\\1111");
//        File dest = new File("E:\\2222");
//        dest.mkdirs();
//        File[] files = src.listFiles();
//        for (File file : files) {
//            if (file.isFile()){
//                FileInputStream fis = new FileInputStream(file);
//                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
//                byte[] bytes = new byte[1024];
//                int len;
//                while ((len = fis.read(bytes)) != -1){
//                    fos.write(bytes,0,len);
//                }
//                fos.flush();
//                fos.close();
//                fis.close();
//            }else{
//                new File(file.getName());
//            }
//        }

        FileWriter writer = new FileWriter("a.txt");
        writer.write("好");
        writer.write('好');
        writer.close();
        System.out.println();





    }
}
