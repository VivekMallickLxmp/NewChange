
class Mobile1 {
 //1)       //instance variable     
        String brand;
        int price;
 //2)       //String name;
        static String name;
        // When you make a variable static means this is common to all the object & can be used.
        public void show()
        // This show method is instance method not the static method because we cannot mentioned here. or a Non-static method & to call a Non-static method we have to create an object.
        {
           System.out.println(brand  + " : "  + price  +  " : "  + name);
        }

        public static void show1(Mobile1 obj ){
           // System.out.println("in static method");
          // System.out.println(brand  + " : "  + price  +  " : "  + name);
           // you cannot use  Non-static  variable inside a static method.
           /* Why ?
           Because when we call show method with  obj1 or obj2  reference which is Non-static object reference . It is very clear that what we want to show . But on the other hand when we call static method show1 with the classname Mobile1 i.e Mobile1.show1() it get confused . */  
           /* Now to call the obj1 or obj2 object you have to call it by reference i.e.
            Mobile1.show1(obj1);
            Mobile1.show1(obj2); & also pass a refernece to the show1 method.
            */
            System.out.println(obj.brand  + " : "  + obj.price  +  " : "  + name);

           System.out.println("HEllo");
        }
    }

    public class Demo
 {
    public static void main(String[] args) 
    /*
    why the main method make static ?
    => Because if we don't make the main method static i.e main is the non-static method then we have to create the object of the Demo class first to call the main method , & as we know the main is the starting point of execution  so without starting the execution how we can create the object & this is a kind of deadlock here.
    
    */
    {
        Mobile1 obj1 = new Mobile1();
        obj1.brand = "Nokia";
        obj1.price = 15000;
        //obj1.name = "Smartphone";
        Mobile1.name = "Smartphone";

        Mobile1 obj2 = new Mobile1();
        obj2.brand = "Samsung";
        obj2.price = 25000;
        //obj2.name = "Smartphone";
        Mobile1.name = "Smartphone";
        // static variable can be called by it's classname also which is a good practice it can be call by it's object also but avoid it.

    //obj1.name = "Phone";
       // The result is Smartphone change to phone in both obj1 & obj2.Because the name is a static variable if we make the name as String from static string the the show error from obj1.name will be removed.
       
      obj1.show();
      obj2.show();

      //Mobile1.show();
      //you cannot call a Non-static method with the help of a class name.
      Mobile1.show1(obj1);
    }      
}
//static keyword means you are making a lass member not an object member.
    

   

