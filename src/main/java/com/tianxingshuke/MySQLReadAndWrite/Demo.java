package com.tianxingshuke.MySQLReadAndWrite;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	
	@Test
	public void testMyTest() throws Exception{
//		 InputStream inputStream = new ClassPathResource("a.txt").getInputStream();
//		InputStream inputStream = Demo.class.getResourceAsStream("a.txt");
//		byte[] b = new byte[1024];
//		int len = 0;
//		while((len = inputStream.read(b))!=-1){
//			System.out.println(new String(b,0,len));
//		}
//		inputStream.close();
		
		String path = getClassFile(Demo.class).getAbsolutePath();
	}
	
	
	public static File getClassFile(Class clazz){
        URL path = clazz.getResource(clazz.getName().substring(clazz.getName().lastIndexOf(".")+1)+".classs");
        if(path == null){
            String name = clazz.getName().replaceAll("[.]", "/");
            path = clazz.getResource("/"+name+".class");
        }
        return new File(path.getFile());
    }
}
