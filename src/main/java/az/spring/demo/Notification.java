package az.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Notification {

    //    private Sms sms = new Sms(); //asilliq yaradir
    //    private Message message = new Sms(); //asilliq yaradir

    private Message message;

    private Employee employee;

    public Notification() {
        System.out.println("Notification constructor worked...");
    }

    //constructor injection
    @Autowired
    public Notification(@Qualifier("email") Message message, Employee employee) {
        this.message = message;
        this.employee = employee;
    }

    //    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    //setter method injection
//    @Autowired
//    @Qualifier("email")
//    public void setMessage(Message message){
//        this.message=message;
//    }

    public void alert() {
        System.out.println("Notification...");
        System.out.println(employee);
        message.send();
    }

    @PostConstruct
    public void myInit(){
        System.out.println("My init method worked.");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("Destry method worked.");
    }

}
