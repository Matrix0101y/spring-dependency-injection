package az.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.registerShutdownHook();

        Notification notification = context.getBean("notification", Notification.class);
        notification.alert();

    }
}
