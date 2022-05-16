package org.commonlib;

import java.util.ArrayList;

public class TestUtil {
	static ExcelReader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		try {
			reader = new ExcelReader(".\\DataFiles\\Data.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			String Firstname = reader.getCellData("Sheet1", "Firstname", rowNum);
			System.out.println(Firstname);
			String Lastname = reader.getCellData("Sheet1", "Lastname", rowNum);
			System.out.println(Lastname);
			String Phonenumber = reader.getCellData("Sheet1", "Phonenumber", rowNum);
			System.out.println(Phonenumber);
			String Email = reader.getCellData("Sheet1", "Email", rowNum);
			System.out.println(Email);
			String Address1 = reader.getCellData("Sheet1", "Address1", rowNum);
			System.out.println(Address1);
			String City = reader.getCellData("Sheet1", "City", rowNum);
			System.out.println(City);
			String State = reader.getCellData("Sheet1", "State", rowNum);
			System.out.println(State);
			String Postalcode = reader.getCellData("Sheet1", "Postalcode", rowNum);
			System.out.println(Postalcode);
			String Country = reader.getCellData("Sheet1", "Country", rowNum);
			System.out.println(Country);
			String Username = reader.getCellData("Sheet1", "Username", rowNum);
			System.out.println(Username);
			String Password = reader.getCellData("Sheet1", "Password", rowNum);
			System.out.println(Password);
			String Confirmpassword = reader.getCellData("Sheet1", "Confirmpassword", rowNum);
			System.out.println(Confirmpassword);
			Object[] ob = { Firstname, Lastname, Phonenumber, Email, Address1, City, State, Postalcode, Country,
					Username, Password, Confirmpassword };
			data.add(ob);
		}
		return data;
	}

	{
	}

}
