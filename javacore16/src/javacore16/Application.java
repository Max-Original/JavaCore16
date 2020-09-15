package javacore16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
		
		
		Class audiCar = Car.class;
		
		System.out.println();
		System.out.println("Class name of object is" + audiCar.getSimpleName());
		
		Constructor[] constructorsOfClassCar = audiCar.getConstructors();
		System.out.println();
		System.out.println("Constructors of Class Car" + Arrays.toString(constructorsOfClassCar));
		System.out.println();
		System.out.println("Package of Class " + audiCar.getPackage());
		System.out.println();
		System.out.println("Class extends from " + audiCar.getSuperclass());
		
		Class[] interfaces = audiCar.getInterfaces();
		System.out.println();
		System.out.println("Class implements next interfaces = " + Arrays.toString(interfaces));

		Field[] fields = audiCar.getFields();
		Field[] declaredFields = audiCar.getDeclaredFields();
			
		System.out.println();
		System.out.println("Class has next public fields " + Arrays.toString(fields));
		System.out.println();
		for (int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];
			System.out.println("All field of class public/private" + field);
		}
		System.out.println();
		Method[] methods = audiCar.getMethods();
		
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println("One of methods " + method);
		}
		System.out.println();
		
		// Second
		Car car2 = new Car("Zaz", true);
		Class carClass = car2.getClass();
		Field brandfield = carClass.getField("brand");
		System.out.println(car2);
		brandfield.set(car2, "ford");
		System.out.println(car2);
		
		//Third
		Car car = new Car("lada", false);
		
		try {
			Method method = car.getClass().getMethod("myMethod", String.class);
			method.invoke(car, "super");
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			Method method = car.getClass().getMethod("myMethod2",int.class, String.class);
			method.invoke(car, 100 ,"super");
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}

}
