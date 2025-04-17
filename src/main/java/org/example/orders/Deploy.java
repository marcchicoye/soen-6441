package org.example.orders;

public class Deploy implements Order {
    @Override
    public void execute() {
        System.out.println("Executing Deploy");
    }
}
