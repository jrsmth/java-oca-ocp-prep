package ex01classdesign;
public class StaticOuter { 
    public static class StaticNested {
        private int value = 6; 
        private static int number = 13;
    }
    public static void main(String[] args) { 
        StaticNested nested = new StaticNested (); 
        System.out.println(nested.value);
        System.out.println(StaticNested.number);
    } 
    public void testMethod(){
        System.out.println(StaticNested.number);
        System.out.println(new StaticNested().value);
    }
}