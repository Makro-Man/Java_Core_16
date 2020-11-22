package ua.lviv.lgs.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Car car=new Car("BMW","M6", 2.2,4);
        Class<? extends Car> carClass = car.getClass();
        System.out.println(carClass);

        Class<Car> carCass = Car.class;
        Field[] declaredFields = carClass.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println(field);
        }
        System.out.println();

        Class<Car> caClass = Car.class;
        Method[] declaredMethods = carClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        //task2
        declaredMethods[4].invoke(car,"Mersedes");
        System.out.println();
        System.out.println(car);
    }
}
