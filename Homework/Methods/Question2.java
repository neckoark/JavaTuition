package Homework.Methods;

public class Question2 {
    public static void main(String[] args) {

            Box box = new Box();
            box.volume();

    }


}

class Box{
    int height, width, depth;

    void volume(){
        System.out.println("Volume of Box is " + height*width*depth);
    }
}