package Chapter11;

import java.util.Properties;

public class _38_PropertiesEx4 {
	
	public static void main(String args[]) {
		
		Properties sysProp = System.getProperties();
		System.out.println("java.version :" + sysProp.getProperty("java.version"));
		System.out.println("user.anguage :" + sysProp.getProperty("user.language"));
		sysProp.list(System.out);
		
	}
}