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
            Nurse n = (Nurse) context.getBean("nurse"); // takes the id from spring.xml
            n.assist();
            Staff staff = context.getBean(Doctor.class);
            staff.assist();
    }
}