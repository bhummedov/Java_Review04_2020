public class ABC_Test {
    public static void main(String[] args) {
        A obj1 = new A(10);
        System.out.println(obj1.getA());
        B obj2 =new B(2);
        System.out.println(obj2.getA());
        C obj3 = new C(5);
        System.out.println(obj3.getA());
        obj3.setA(40);
        System.out.println(obj3.getA());
    }
}
