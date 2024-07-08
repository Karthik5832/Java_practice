package src;

class Test {
    int i = 10;

    static{
        System.out.println("Static Block Starts");
    }

    {
        System.out.println("Non static block printed");
    }
    Test(){
        int i = 20;
        System.out.println(this.i);

    }
    public static void main(String[] args){
        new Test();
        System.out.println("Main Starts");
        Pattern2 t1 = new Pattern2();
        t1.pattern2NestedLoop(5);

    }
}
