package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDAtaFromPropertyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fi=new FileInputStream(sc);
		Properties prop = new Properties();
		prop.load(fi);
		System.out.println(prop.getProperty("browsername"));

	}

}
