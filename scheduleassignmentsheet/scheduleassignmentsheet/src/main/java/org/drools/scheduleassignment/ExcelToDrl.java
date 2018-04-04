package org.drools.scheduleassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;

public class ExcelToDrl {

	public static void main(String args[]) {

		InputStream is = null;
		try {
			is = new FileInputStream("D:/scheduleAssignment.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		SpreadsheetCompiler sc = new SpreadsheetCompiler();
		String drl = sc.compile(is, InputType.XLS);
		System.out.println("Generate DRL file is –: ");
		System.out.println(drl);
	}

}
