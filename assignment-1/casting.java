class phone{
    public void call(){
        System.out.println("Phone call");
    }
}
class sonyphone extends phone{
    public void call(){
        System.out.println("Phone1 call");
    }
    public void otherFunction(){
        System.out.println("GPS enabled..");
    }
}
class casting{
    public static void main(String[] args) {
        sonyphone s = new sonyphone(); //upcasting type1
        phone p = (phone)s; //upcasting type2
        p.call();
        s.call();
    }
}
