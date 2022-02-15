package org.sql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.neww.BaseClassSyntax;
import org.testng.annotations.Test;


public class Sql extends BaseClassSyntax{
public static void main(String[] args) throws ClassNotFoundException, SQLException {

	 
	
	Connection connection = null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","kev221095");
	String query="Select * from Employees";
	
	PreparedStatement prepareStatement = connection.prepareStatement(query);
	
	ResultSet executeQuery = prepareStatement.executeQuery();
	
	while (executeQuery.next()) {
		
		String string = executeQuery.getString("first_name");
		
		System.out.println(string);}
		
	}
		
	
	File file = new File("C:\\Users\\c j kevin\\eclipse-workspace\\FrameWorkTask\\sql");
	
	Workbook workbook = new XSSFWorkbook();
	Sheet sheet = workbook.createSheet("data");
	

	}