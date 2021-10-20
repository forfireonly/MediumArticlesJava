package passbyvalue;

public class Primitives {
    static int x = 1, z;

    public static void main(String... input) {
        int  y = 2;
        changeZ(x,y,z);
        System.out.println("x outside method" + x);
        System.out.println("y outside method" + y);
        System.out.println("z outside method: " + z);
    }

    static void changeZ(int x, int y, int z) {
        x = 3;
        y = 4;
        z = x + y;
        System.out.println("x inside method" + x);
        System.out.println("y inside method" + y);
        System.out.println("z inside method: " + z);
    }
}
