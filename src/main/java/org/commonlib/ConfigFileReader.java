package org.commonlib;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertiesFilePath = ".//config//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertiesFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found");
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	public String getFirstname() {
		String firstname = properties.getProperty("Firstname");
		if (firstname != null)
			return firstname;
		else
			throw new RuntimeException("Firstname is missing in the Fieldname.properties file.");
	}

	public String getLastname() {
		String lastname = properties.getProperty("Lastname");
		if (lastname != null)
			return lastname;
		else
			throw new RuntimeException("Lastname is missing in the Fieldname.properties file.");
	}

	public String getPhoneumber() {
		String phonenumber = properties.getProperty("Phonenumber");
		if (phonenumber != null)
			return phonenumber;
		else
			throw new RuntimeException("Phonenumber is missing in the Fieldname.properties file.");
	}

	public String getEmail() {
		String email = properties.getProperty("Email");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Email is missing in the Fieldname.propertiesile.");
	}

	public String getAddress1() {
		String address = properties.getProperty("Address1");
		if (address != null)
			return address;
		else
			throw new RuntimeException("Address is missing in the Fieldname.properties file.");
	}

	public String getCity() {
		String city = properties.getProperty("City");
		if (city != null)
			return city;
		else
			throw new RuntimeException("City is missing in the Fieldname.properties file.");
	}

	public String getState() {
		String state = properties.getProperty("State");
		if (state != null)
			return state;
		else
			throw new RuntimeException("State is missing in the Fieldname.properties file.");
	}

	public String getPostalcode() {
		String postalcode = properties.getProperty("Postalcode");
		if (postalcode != null)
			return postalcode;
		else
			throw new RuntimeException("Postalcode is missing in the Fieldname.properties file.");
	}

	public String getUsername() {
		String username = properties.getProperty("Username");
		if (username != null)
			return username;
		else
			throw new RuntimeException("Username is missing in the Fieldname.properties file.");
	}

	public String getPassword() {
		String password = properties.getProperty("Password");
		if (password != null)
			return password;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file.");
	}

	public String getConfirmpassword() {
		String confirmpassword = properties.getProperty("Confirmpassword");
		if (confirmpassword != null)
			return confirmpassword;
		else
			throw new RuntimeException("Confirmpassword is missing in the Fieldname.properties file.");
	}
	public String gethuburl() {
		String confirmpassword = properties.getProperty("huburl");
		if (confirmpassword != null)
			return confirmpassword;
		else
			throw new RuntimeException("huburl is missing in the Fieldname.properties file.");
	}
	public String getPDFurl() {
		String confirmpassword = properties.getProperty("PDFurl");
		if (confirmpassword != null)
			return confirmpassword;
		else
			throw new RuntimeException("PDFurl is missing in the Fieldname.properties file.");
	}
}


