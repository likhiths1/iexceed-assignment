class A{
    public void display(){
        System.out.println("Super is called");
    }
}
class B extends A{
    public void display(){
        System.out.println("Sub is called");
    }
}
class overriding{
    public static void main(String[] args) {
        A ref;
        A obja = new A();
        B objb = new B();
        ref=obja;
        ref.display();
        ref=objb;
        ref.display();
    }
}