import addit.Anonym;
import addit.Func;
import addit.Nest;

public class HelloWorld{
    public static void main(String[] args) {
        new Anonym().print();
        new Func() {
            @Override
            public void printer() {
                System.out.println("Anonym2");
            }
        }.printer();
        new Nest().outer();
        System.out.println("Test");
    }
}