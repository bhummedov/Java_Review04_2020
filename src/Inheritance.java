public class Inheritance {
    private static int additionPrivateStatic(int a, int b) {
        return a + b;
    }
    {
        Inheritance.additionPrivateStatic(2,3);
    }
    public static int additionPublicStatic(int a, int b){
        return a+b;
        }
        private int additionPrivate(int a, int b){
        return a+b;
    }
    {
        this.additionPrivate(2,3);
    }
    public int additionPublic(int a, int b){
        return a+b;
    }

}
