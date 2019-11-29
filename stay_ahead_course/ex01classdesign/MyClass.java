package ex01classdesign;
public class MyClass {
    private String name;
    public MyClass(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
