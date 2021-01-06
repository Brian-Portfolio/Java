package reflections_api;

import java.lang.Class;
import java.lang.reflect.*;


public class Main {
	
	public static void main(String[] args) {
		try {
			
			Dog d1 = new Dog();
			
			Class obj = d1.getClass();
			
			String n1 = obj.getName();
			
			System.out.println("Name : " + n1);
			
			int modifier =obj.getModifiers();
			
			String mod = Modifier.toString(modifier);
			
			System.out.println("Modifier : "+mod);
			
			Class superClass = obj.getSuperclass();
			System.out.println("SuperClass : "+ superClass.getName());
			
			
		}catch (Exception e){
			System.out.println(e);
		}
	}
}
//Reflection API - works backwards and allows us to inspect various classes, interfaces, constructors, and methods.
//This example we are inspecting the class dog and using the class object "obj" we are calling different methods like 
//getName, getModifiers, and getSuperclass.
