import util.Pointre;

public class ObjectPropertyEx {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }
    public static void main(String [] args) {
        Pointre p = new Pointre(2,3);
        print(p);
    }

}
