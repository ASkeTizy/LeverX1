import addit.Anonym;
import addit.Func;
import addit.Nest;

public class HelloWorld{
    public static void main(String[] args) {
        new Anonym().print();
        Func foo = () -> System.out.println("Anonym2");

        new Nest().outer();
        System.out.println("Test");
    }
}