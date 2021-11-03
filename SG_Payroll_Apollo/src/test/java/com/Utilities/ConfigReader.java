package com.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;

	public void ConfigSetup(String Path) throws Exception {
		FileInputStream FIS = new FileInputStream(Path);
	    prop = new Properties();
		prop.load(FIS);
	}
	
	public String GetConfigValue(String Key) {
		return prop.getProperty(Key);
	}

}
