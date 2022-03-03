package Cucu_Bdd_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Dec_Mini_Project\\src\\main\\java\\com\\propertyfile\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	public String getUrl() {
		String url=p.getProperty("url");
		return url;
	
	}
	public String getEmail() {
		String email=p.getProperty("email");
		return email;
	}
	public String getPassword() {
		String password=p.getProperty("password");
		return password;
	}
	public String getAdactinurl() {
		String Adactinurl=p.getProperty("Adactinurl");
		return Adactinurl;
		
	}
	public String getUsername() {
		String username=p.getProperty("username");
		return username;
		
	}public String getAdatinPassword() {
		String Password=p.getProperty("Password");
		return Password;
		
	}

}
