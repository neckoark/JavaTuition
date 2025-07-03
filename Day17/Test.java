package Day17;

class Demo{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sub();
        add();
        d.mul();
    }

    static void add(){
        System.out.println("Add");
    }

    void sub(){
        Demo.add();
    }

    void mul(){
        Demo d1 = new Demo();
        d1.sub();
        add();
    }
}
