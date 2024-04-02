package com.cjc.cucumber.DemoBlaze.Utility; //20.01.2023 C-BDD Frame Work Designing

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CommonUtility {
	// This Cucumber Behavior Driven Development Framework Performed On the Demo
	// Blaze Shop Web site
	// TestNG Cucumber Behavior Driven Development Framework Script Created By The
	// Harshit Bisen TB-18B Offline.
	public static WebDriver driver;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow ro;
	public static XSSFCell cl;
	public static String signUpName;
	public static String signUpPass;
	public static String loginName;
	public static String loginPass;

	// No Use Of this step because we already provide the path in individual steps
//	public static FileInputStream filenalCall() throws FileNotFoundException {
//		fi = new FileInputStream("src/test/resources/DataPass_Exce/DemoBlaze.xlsx");
//		return fi;
//	}

//	public static String signUpUsername() throws IOException {
//		fi = new FileInputStream("src/test/resources/DataPass_Exce/DemoBlaze.xlsx");
//		wb = new XSSFWorkbook(fi);
//		sh = wb.getSheet("Sheet1");
//		ro = sh.getRow(1);
//		cl = ro.getCell(0);
//		String signupusern = cl.getStringCellValue();
//		return signupusern;
//	}

//	public static String signUpPassword() throws IOException {
//		fi = new FileInputStream("src/test/resources/DataPass_Exce/DemoBlaze.xlsx");
//		wb = new XSSFWorkbook(fi);
//		sh = wb.getSheet("Sheet1");
//		ro = sh.getRow(1);
//		cl = ro.getCell(1);
//		String signupPass = cl.getStringCellValue();
//		return signupPass;
//	}

	static List<String> l = new ArrayList<String>();

	public static void signUpMethod() throws IOException {
		fi = new FileInputStream("src/test/resources/DataPass_Exce/DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum();
		System.out.println(rowCount);
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < 4; j++) {
				String v = sh.getRow(i).getCell(j).getStringCellValue();
				l.add(v);
			}
			signUpName = l.get(0);
			System.out.println(signUpName);
			signUpPass = l.get(1);
			System.out.println(signUpPass);
			loginName = l.get(2);
			System.out.println(loginName);
			loginPass = l.get(3);
			System.out.println(loginPass);
		}

	}

//	public static void main(String[] args) throws IOException {
//		signUpMethod();
//	}
}
