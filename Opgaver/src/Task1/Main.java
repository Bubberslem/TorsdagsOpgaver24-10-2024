package Task1;

public class Main {
    public static void main(String[] args) {
        Yeah yeah = new Yeah();
        System.out.println("flows.methodA(\"start\");");
        yeah.methodA("start");
        System.out.println("flows.methodB(\"Hello, world\");");
        yeah.methodB();
        System.out.println("flows.methodC(\"Hello, world\");");
        yeah.methodC();
        System.out.println("flows.methodD(25);");
        yeah.methodD();
    }
}
