package com.cjc.cucumber.DemowebShop.Utility;  //18.01.2023 HDF Framework Design

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CommonUtility {

	public static WebDriver driver;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFSheet sh1;
	public static XSSFRow ro;
	public static XSSFCell cl;
	public static String fname;
	public static String lname;
	public static String email;
	public static String password;
	public static String cPassword;
	public static String loginUsername;
	public static String loginPassword;
	
	
	static List<String> l = new ArrayList<String>();
	public static void registrationMethod() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass_Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum();	
		System.out.println(rowCount);
		for (int i = 1; i <= rowCount; i++) 
		{
			for (int j = 0; j < 7; j++)
			{
				String v = sh.getRow(i).getCell(j).getStringCellValue();
				l.add(v);
			}
			fname = l.get(0);
			System.out.println("First Name = "+fname);
			lname = l.get(1);
			System.out.println("Last Name = "+lname);
			email = l.get(2);
			System.out.println("Email = "+email);
			password = l.get(3);
			System.out.println("Password = "+password);
			cPassword = l.get(4);
			System.out.println("Confirm Password = "+cPassword);
			loginUsername = l.get(5);
			System.out.println("Login Username = "+loginUsername);
			loginPassword = l.get(6);
			System.out.println("Login Password = "+loginPassword);
		}
	}
	
	

//	public static FileInputStream filenalCall() throws FileNotFoundException {
//		fi = new FileInputStream("src//test//resources//Datapass_Excel//DemoWebShop.xlsx");
//		return fi;
//	}

//	public static String firstName() throws IOException {
//		fi = new FileInputStream("src//test//resources//Datapass_Excel//DemoWebShop.xlsx");
//		wb = new XSSFWorkbook(fi);
//		sh = wb.getSheet("Sheet1");
//		ro = sh.getRow(1);
//		cl = ro.getCell(0);
//		String fname = cl.getStringCellValue();
//		return fname;
//	}
//
//	public static String lastName() throws IOException {
//		fi = new FileInputStream("src//test//resources//Datapass_Excel//DemoWebShop.xlsx");
//		wb = new XSSFWorkbook(fi);
//		sh = wb.getSheet("Sheet1");
//		ro = sh.getRow(1);
//		cl = ro.getCell(1);
//		String lname = cl.getStringCellValue();
//		return lname;
//	}
//	
//	public static String email() throws IOException {
//		fi = new FileInputStream("src//test//resources//Datapass_Excel//DemoWebShop.xlsx");
//		wb = new XSSFWorkbook(fi);
//		sh = wb.getSheet("Sheet1");
//		ro = sh.getRow(1);
//		cl = ro.getCell(2);
//		String em = cl.getStringCellValue();
//		return em;
//	}
//	
//	public static String password() throws IOException {
//		fi = new FileInputStream("src//test//resources//Datapass_Excel//DemoWebShop.xlsx");
//		wb = new XSSFWorkbook(fi);
//		sh = wb.getSheet("Sheet1");
//		ro = sh.getRow(1);
//		cl = ro.getCell(3);
//		String pass = cl.getStringCellValue();
//		return pass;
//	}
//	
//	public static String confirmPassword() throws IOException {
//		fi = new FileInputStream("src//test//resources//Datapass_Excel//DemoWebShop.xlsx");
//		wb = new XSSFWorkbook(fi);
//		sh = wb.getSheet("Sheet1");
//		ro = sh.getRow(1);
//		cl = ro.getCell(4);
//		String cpass = cl.getStringCellValue();
//		return cpass;
//	}
	
	

//	public static void main(String[] args) throws IOException {
//		registrationMethod();
//	}
	
	
}
