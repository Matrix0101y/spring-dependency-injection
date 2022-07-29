package az.spring.demo;

import org.springframework.stereotype.Component;

@Component("sms")
public class Sms implements Message{

    @Override
    public void send(){
        System.out.println("Sms was sent successfully");
    }

}
