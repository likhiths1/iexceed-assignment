class student
 {
    String name,city;
    int age;
       student(String name,int age ,String city)
        {
             this.name=name;
             this.age=age;
             this.city=city;
 
        }
 
       public void displaystudent()
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println(city);
           
        }
 }
 
 class employee extends student
  {
    int salary;
    String desig;
 
    employee(String name,int age,String city,int salary,String desig)
    {
        super(name,age,city);
        super.displaystudent();
        this.salary=salary;
        this.desig=desig;
    }
 
    public void displayemployee()
    {
        System.out.println("Age"+age);
        System.out.println("Salary"+salary);
        System.out.println("Designation"+desig);
    }
 
  }
 
  class inheritance
  {
    public static void main(String asd[])
        {
           employee e1= new employee("Ketone",20,"Bangalore",30000,"Trainee eng");
           e1.displayemployee();
        }
  }