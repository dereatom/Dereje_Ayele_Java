package com.company;
public class ConverterApplication {
    public static void main(String[] args) {
        Converter convertIf = new ConverterIf();
        Converter convertSwitch = new ConverterSwitch();

        System.out.format("The 1st month is %s%n", convertSwitch.convertMonth(1));
        System.out.format("The 2nd month is %s%n", convertSwitch.convertMonth(2));
        System.out.format("The 7th month is %s%n", convertIf.convertMonth(7));
        System.out.format("The 12th month is %s%n", convertIf.convertMonth(12));


        System.out.format("The 4th day is %s%n", convertIf.convertDay(4));
        System.out.format("The 2th day is %s%n", convertSwitch.convertDay(2));
        System.out.format("The 7th day is %s%n", convertSwitch.convertDay(7));
    }
}
