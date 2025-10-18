package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	private static Properties properties;

	static {
		try {
			FileInputStream file = new FileInputStream("src/test/java/configration.properties");
			properties = new Properties();
			properties.load(file);
		} catch (IOException e) {
			throw new RuntimeException("❌ Failed to load config.properties file!", e);
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}
