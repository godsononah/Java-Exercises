public class Barker {
    public static void main(String[] args) {
        barker("Fred", 3);
    }
    public static void barker(String name, int num) {
        int x = 0;
        while (x < num) {
            System.out.println(name + " says Woof! Woof!");
            x = x + 1;
        }
    }
}