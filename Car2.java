package ua.edu.op.asmerteniuk;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Car2 {
    String brand;
    int maxSpeed;

    double mileage;

    public Car2() {
    }

    public Car2(String b, int m, double mil) {
        brand = b;
        maxSpeed = m;
        mileage = mil;


    }

    public Car2(int Maxspeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getInfo() {
        return "Our car is: " + brand + "; Maxspeed:" + maxSpeed + "; Mileage: " + mileage;
    }


    public static void main(String[] args) {
        int MaxMileage = 200000;
        Car2 ourCar1 = new Car2("Toyota", 160, 5000);
        Car2 ourCar2 = new Car2("Audi", 170, 80000);
        Car2 ourCar3 = new Car2("Porshe", 280, 150000);
        Car2 ourCar4 = new Car2("Ferrari", 300, 120000);
        Car2 ourCar5 = new Car2("BMW", 220, 20000);

        Car2[] cars = new Car2[5];
        cars[0] = ourCar1;
        cars[1] = ourCar2;
        cars[2] = ourCar3;
        cars[3] = ourCar4;
        cars[4] = ourCar5;


        System.out.println(ourCar1.getInfo());
        System.out.println(ourCar2.getInfo());
        System.out.println(ourCar3.getInfo());
        System.out.println(ourCar4.getInfo());
        System.out.println(ourCar5.getInfo());

        System.out.println("Update car mileage data, select car : ");
        Scanner scan = new Scanner(System.in);
        int carup = scan.nextInt() - 1;
        while (carup < 0) {
            System.out.println("Write number of car from 1 to 5 ");
            carup = scan.nextInt() - 1;
            if (carup > 0)
                break;
        }
        while (carup > 5) {
            System.out.println("Write number of car from 1 to 5 ");
            carup = scan.nextInt() - 1;
            if (carup < 5)
                break;
        }

        Car2 slectedCar = cars[carup];

        System.out.println("Write new mileage : ");
        double newmileage = scan.nextDouble();
        while (newmileage > 200000) {
            System.out.println("Mileage cant`t be bigger than 200000 km ");
            System.out.println("Write new mileage : ");
            newmileage = scan.nextDouble();
            if (newmileage < 200000)
                break;
        }


        slectedCar.mileage = newmileage;
        if (newmileage > 10000) {
            double speed = (int) slectedCar.maxSpeed * 1.1;
            slectedCar.maxSpeed = (int) speed;

        }


        System.out.println(ourCar1.getInfo());
        System.out.println(ourCar2.getInfo());
        System.out.println(ourCar3.getInfo());
        System.out.println(ourCar4.getInfo());
        System.out.println(ourCar5.getInfo());


    }

}
