public class Main {
    public static void main(String[] args)
    {
        Complex a=new Complex(4,-2);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.CreateComplex(22, 65);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.CreateComplex(-1, 2);
        System.out.println(f);
    }
}
