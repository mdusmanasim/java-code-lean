class BarkSize {
    int size;
    String name;

    void bark() {
        if(size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff");
        } else {
            System.out.println("Yip! Yip");
        }
    }
}

class BarkSizeTestDrive {
    public static void main(String argsp[]) {
        BarkSize one = new BarkSize();
        one.size = 70;
        BarkSize two = new BarkSize();
        two.size = 8;
        BarkSize three = new BarkSize();
        three.size = 35;
    

    one.bark();
    two.bark();
    three.bark();
    }
}