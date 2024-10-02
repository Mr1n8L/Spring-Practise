package com.spring.practise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private Computer computer;

    //3 types of injections

    //1st - field injection
    //@Autowired
    //private Machine machine;

    //2nd - constructor injection
    //not necessary but can be used @Autowired, constructor uses it by default
    //public Dev(Machine machine){
    //      this.machine = machine;
    //}

    //3rd - setter injection
    //@Autowired
    //public void setMachine(Machine machine){
    //      this.machine = machine;
    //}

    public void build(){
        computer.compile();
        System.out.println("Spring Boot Practise");
    }
}
