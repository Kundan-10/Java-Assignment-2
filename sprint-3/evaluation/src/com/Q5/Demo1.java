  package com.Q5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 implements Serializable{

      public static void main(String[] args) throws FileNotFoundException {
    		Student s=new Student();
    		
    		
    		
    	 	List<Student> li=Arrays.
    				asList(new Student(10,"kundan",100,"kundan10","1234")
    						,new Student(10,"kundan",100,"kundan10","1234"),
    						new Student(10,"kundan",100,"kundan10","1234"),
    						new Student(10,"kundan",100,"kundan10","1234"),
    						new Student(10,"kundan",100,"kundan10","1234"));
    		
    		   
    		
    	 	FileOutputStream FileOutputStream = new FileOutputStream("studentdata.txt");
    		
    		
    	}
	}

   




 
