public class Math {
    public static int add(int a, int b) throws InterruptedException {
        Thread.sleep(50);
        return a+b;
    }

    public static int div(int a, int b) throws InterruptedException {
        Thread.sleep(50);
        return a/b;
    }
}
