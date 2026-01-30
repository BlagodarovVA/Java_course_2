package r11_other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchFieldException,
            NoSuchMethodException {
        // 3 варианта создания объектов класса class
        Class employeeClass = Class.forName("r11_other.reflection.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        System.out.println("------------getField------------");
        Field someField =  employeeClass.getField("id");
        System.out.println("Type of id: " + someField.getType());

        System.out.println("------------getFields------------");
        Field [] fields =  employeeClass.getFields();
        for (Field field: fields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("-------------getDeclaredFields-----------");
        Field [] declaredFields =  employeeClass.getDeclaredFields();
        for (Field field: declaredFields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("------------getMethod------------");
        Method someMethod1 =  employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method '" + someMethod1.getName() +
                            "' = " + someMethod1.getReturnType() +
                            ", parameter types: " + Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("-------------getMethod-----------");
        Method someMethod2 =  employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method '" + someMethod2.getName() +
                "' = " + someMethod2.getReturnType() +
                ", parameter types: " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("-------------getMethods-----------");
        Method [] methods =  employeeClass.getMethods();
        for (Method method: methods){
            System.out.println("Name = " + method.getName() +
                               ", return type = " + method.getReturnType() +
                                ", parameter types: " + Arrays.toString(method.getParameterTypes())
            );
        }

        System.out.println("------------getDeclaredMethods------------");
        Method [] declaredMethods =  employeeClass.getDeclaredMethods();
        for (Method method: declaredMethods){
            System.out.println("Name = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types: " + Arrays.toString(method.getParameterTypes())
            );
        }

        System.out.println("-----------getDeclaredMethods - public------------");
        Method [] allMethods =  employeeClass.getDeclaredMethods();
        for (Method method: declaredMethods){
            if(Modifier.isPublic(method.getModifiers())){
                System.out.println("Name = " + method.getName() +
                        ", return type = " + method.getReturnType() +
                        ", parameter types: " + Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("------------getConstructor 1------------");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Count params - " + constructor1.getParameterCount() +
                            ", parms types: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("------------getConstructor 2------------");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Count params - " + constructor2.getParameterCount() +
                            ", parms types: " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("------------getConstructors------------");
        Constructor [] constructors = employeeClass.getConstructors();
        for (Constructor constructor: constructors){
        System.out.println("Count params - " + constructor.getParameterCount() +
                ", parms types: " + Arrays.toString(constructor.getParameterTypes()));
        }



    }
}
