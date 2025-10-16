package interfaceTest;

interface A {
    default void show() { System.out.println("A"); }
}
interface B extends A {
    default void show() { System.out.println("B"); }
}
class C implements B {
    public static void main(String[] args) {
    	A a=new C();
        a.show();
    }
}
