package com.vnkt.project;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	cars obj=(cars) context.getBean("cars");

    	System.out.println("Choose your brand");
    	Scanner sc = new  Scanner(System.in);
    	obj.setBrand(sc.nextLine());

    	System.out.println(obj);


    	System.out.println("Choose your color:");
    	color obj1=(color) context.getBean("color");
    	Scanner scan=new  Scanner(System.in);
    	obj1.setColor(scan.nextLine());
    	System.out.println(obj1);

    	System.out.println("Choose your Tyrebrand:");
    	tyres obj2=(tyres) context.getBean("tyres");
    	Scanner scan1=new  Scanner(System.in);
    	obj2.setTyrebrand(scan1.nextLine());
    	System.out.println(obj2);
    	
    	System.out.println("choose your seat");
    	seat obj3=(seat) context.getBean("seat");
    	Scanner scanner1=new Scanner(System.in);
    	obj3.setSeat(scanner1.nextLine());
    	System.out.println(obj3);
    	

    	System.out.println("You have choosen :"  +obj + obj1 + obj2 +obj3);
    }
}
