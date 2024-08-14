package uz.pdp.springframeworkcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("ioc-settings.xml");
        /*MyBean2 myBean2 = container.getBean(MyBean2.class);
        myBean2.hi();*/

        System.out.println(container.getBean(Person.class));

        BaseDAO baseDAO = container.getBean(BaseDAO.class);

        System.out.println(baseDAO);

        Service service = container.getBean("roleService",Service.class);
        System.out.println(service);
    }
}