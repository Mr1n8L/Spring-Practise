package com.spring.practise;
import org.springframework.stereotype.Component;

@Component
public class DesktopPc implements Computer{

    public void compile(){
        System.out.println("\n");
        System.out.println("Machine started by desktop");
    }
}
