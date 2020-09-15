package javacore16practise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class pruklad = Person.class;
		
		// get name of class
		String nameOfClass = pruklad.getName();
		
		String simpleNameClass = pruklad.getSimpleName();
		
		// get Modifier
		int modifier = pruklad.getModifiers();
		String modifierText = Modifier.toString(modifier);
		
		System.out.println(modifierText + " " + modifier);
		
		System.out.println("is static =" + Modifier.isStatic(modifier));
		System.out.println("is public =" + Modifier.isPublic(modifier));
		System.out.println("is abstract = " + Modifier.isAbstract(modifier));
		
		// package info
		Package classPackage = pruklad.getPackage();
		
		System.out.println(classPackage);
		
		//get superclasses
		Class superClass = pruklad.getSuperclass();
		System.out.println(superClass);
		
		//get interfaces
		Class[] interfaces = pruklad.getInterfaces();
		System.out.println(Arrays.toString(interfaces));
		
		//getConstructor
		Constructor[] constructors = pruklad.getConstructors();
		System.out.println(Arrays.toString(constructors));
		System.out.println(constructors.length);
		
		//get Constructor by parameters
		Constructor singelConstructor = pruklad.getConstructor(String.class, int.class);
		System.out.println(singelConstructor);
		Object newInstancePerson = singelConstructor.newInstance("max", 24);
		System.out.println(newInstancePerson);
		
		//getFields
		//public
		Field[] fields = pruklad.getFields();
		System.out.println(Arrays.toString(fields));
		
		//private
		Field[] declaredFields = pruklad.getDeclaredFields();
		System.out.println(Arrays.toString(declaredFields));
		
		//Field set
		//public
		Field fieldName = pruklad.getField("name");
		fieldName.set(newInstancePerson, "Masha");
		System.out.println(newInstancePerson);
		
		//private
		Field privateLastName = declaredFields[3];
		privateLastName.setAccessible(true);
		System.out.println(privateLastName.get(newInstancePerson));
		
		//Methods
		Method[] methods = pruklad.getMethods();
		System.out.println(Arrays.toString(methods));
		
		methods[4].invoke(newInstancePerson, "Cat");
		System.out.println(newInstancePerson);
		
		methods[10].invoke(newInstancePerson, "Catovich");
		System.out.println(newInstancePerson);
		
	}

}
