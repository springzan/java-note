import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        Integer a=1;
        Integer b=2;
        System.out.println("before swap: a="+a+",b="+b);
        swap(a,b);
        System.out.println("after swap: a="+a+",b="+b);
        System.out.println("Hello World!");
    }

    private static void swap(Integer a,Integer b){
        try {
            Field field=Integer.class.getDeclaredField("value");
            field.setAccessible(true);
            int temp=a.intValue();
            field.set(a,b);
            field.setInt(b,temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
