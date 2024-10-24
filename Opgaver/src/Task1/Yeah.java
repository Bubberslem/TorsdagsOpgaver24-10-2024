package Task1;

public class Yeah {
    public void methodA(String input) {
        System.out.println("j");  // Print 'j'
        System.out.println("a");  // Print 'a'
        System.out.println("v");  // Print 'v'
        System.out.println("a");  // Print 'a'
        methodB();                 // Call methodB after printing 'Java'
    }

    public void methodB() {
        System.out.println("e");  // Print 'e'
        methodC();                // Call methodC
    }

    public void methodC() {
        System.out.println("r");  // Print 'r'
        methodD();                // Call methodD
    }

    public void methodD() {
        System.out.println(" ");  // Print space
        System.out.println("s");  // Print 's'
        System.out.println("j");  // Print 'j'
        System.out.println("o");  // Print 'o'
        System.out.println("v");  // Print 'v'
        System.out.println("t");  // Print 't'
    }
}
