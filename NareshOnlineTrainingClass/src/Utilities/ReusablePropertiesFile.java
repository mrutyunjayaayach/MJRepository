package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReusablePropertiesFile {
	
	File f;
	FileInputStream fi;
	Properties p;
	
	public ReusablePropertiesFile(String pathname) throws FileNotFoundException{
		
		try {
		f=new File(pathname);
		fi=new FileInputStream(f);
		p=new Properties();
		p.load(fi);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public String getValuefromPropertyFile(String keyname) {
		
		return p.getProperty(keyname);
	
}

}
