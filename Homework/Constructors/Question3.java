package Homework.Constructors;

class Student {

    int rollNo;
    String name;
    int age;

    Student(){
        System.out.println("Student Constructor");
    }

    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(43,"Kedar",22);
        s1.display();
    }
}