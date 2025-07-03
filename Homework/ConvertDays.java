package Homework;

public class ConvertDays {

    public static void main(String[] args) {

        int total = 372;
        int year = total / 365;

        int days = total % 365;
        int weeks = days / 7;

        int remaining = days % 7;

        System.out.println(year);
        System.out.println(weeks);
        System.out.println(remaining);

        //System.out.println(week);
        //System.out.println(day);
    }
}