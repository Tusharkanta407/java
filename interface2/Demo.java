
class Outer {
    
    interface NestedInterface {
        void display();
    }
}


class Demo implements Outer.NestedInterface {
    @Override
    public void display() {
        System.out.println("Nested Interface Method Implemented.");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}

