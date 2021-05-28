package com.mmt.config.utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import static com.mmt.support.FrameworkConstants.getConfigproperties;

public final class PropertyUtils {

	private PropertyUtils() {}
	
	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<String, String>();
	
	
	
	public static String get(ConfigProperties key) {
		try {
			FileInputStream file = new FileInputStream(getConfigproperties());
			property.load(file);
			
			for(Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		return CONFIGMAP.get(key.name());
	}
	
}
