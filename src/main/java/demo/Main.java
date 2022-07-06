package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
            Doctor d = context.getBean(Doctor.class);
            d.assist();
            d.setQualification("MBBS");
            System.out.println(d); // MBBS
            Doctor d1 = context.getBean(Doctor.class);
            System.out.println(d1); //MBBS again same class because it is singleton class by default
    }
}