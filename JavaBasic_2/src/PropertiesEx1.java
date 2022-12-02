import java.util.*;

class PropertiesEx1 {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "KR");
	//	prop.setProperty("size", 100);   // String type 
		prop.setProperty("capacity", "100");
		prop.setProperty("size", "100");
		
		Enumeration e = prop.propertyNames();
		
		while (e.hasMoreElements()) {
			
			String element = (String) e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
			
		}
		
		System.out.println();
		prop.setProperty("size", "300");
		
		System.out.println("name=" + prop.getProperty("name", "Jonh"));
		System.out.println("size=" + prop.getProperty("size"));
		System.out.println("capacity=" + prop.getProperty("capacity"));
		System.out.println("number=" + prop.getProperty("number"));  // 없는 key 값일 경우, Null
		
		System.out.println();
		System.out.println(prop);  //{size=300, language=KR, timeout=30, capacity=100}
		System.out.println();
		
		prop.list(System.out);
				
	}
	
}