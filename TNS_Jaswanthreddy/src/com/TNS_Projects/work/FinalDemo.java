package com.TNS_Projects.work;
class Manager { // Corrected class name from "Manger" to "Manager"
    void show() {
        System.out.println("show the parent class");
    }
    
    // Static inner class, or you can move it outside as a separate class
    static class Employee { 
        void show() {
            System.out.println("show the employee class");
        }
    }
}

public class FinalDemo {

    public static void main(String[] args) {
        //final int a = 10;
        //a = 20;  
        //System.out.println(a);

        // Corrected instantiation of the Employee class
        Manager.Employee emp = new Manager.Employee();
        emp.show();
    }

}
