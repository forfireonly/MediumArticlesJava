import static java.lang.System.out;

public class Test{

    public static void main(String []args){
        out.println(Cat.sound);
        
        Cat kitty = new Cat();
        out.println(kitty.sound);
        
        kitty = null;
        out.println(kitty.sound);
    }
}

class Cat{
   static String sound = "Meow"; 
}
