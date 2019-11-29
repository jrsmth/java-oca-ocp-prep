package ex01classdesign;
public class TestStaticOuter {
    public static void main(String[] args){
        StaticOuter.StaticNested nested = new StaticOuter.StaticNested();
        //System.out.println(StaticOuter.StaticNested.number);
        //System.out.println(new StaticOuter.StaticNested().value);
    }
}