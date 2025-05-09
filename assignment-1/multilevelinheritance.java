
class One {
    public void print1() {
        System.out.println("In parent..");
    }
}

class Two extends One {
    public void print2() {
        System.out.println("In child1..");
    }
}

class Three extends Two {
    public void print3() {
        System.out.println("In child2..");
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        Three g = new Three();
        
        g.print1();
        g.print2();
        g.print3();
    }
}
 
