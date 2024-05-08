package aulas.methodReference;

class MethodReferenceTypesSolution {

    public static void main(String[] args) {

        // método estático
        Converter methodRef = Math::round;
        System.out.println(methodRef.round(100.1));

        Converter lambda = x -> Math.round(x);
        System.out.println(lambda.round(100.1));

        // método de instância
        var str = "Zoo";
        StringStart methodRef2 = str::startsWith;
        System.out.println(methodRef2.beginningCheck("A")); // false

        StringStart lambda2 = s -> str.startsWith(s);
        System.out.println(lambda2.beginningCheck("A")); // false

        final var str2 = "";
        StringChecker methodRef3 = str2::isEmpty;
        System.out.print(methodRef3.check()); // true

        StringChecker lambda3 = () -> str2.isEmpty();
        System.out.print(lambda3.check()); // true

        // metodo de instancia em um parametro runtime
        StringParameterChecker methodRef4 = String::isEmpty;
        System.out.println(methodRef4.check("Zoo")); // false

        StringParameterChecker lambda4 = s -> s.isEmpty();
        System.out.println(lambda4.check("Zoo")); // false

        StringTwoParameterChecker methodRef5 = String::startsWith;
        System.out.println(methodRef5.check("Zoo", "A")); // false

        StringTwoParameterChecker lambda5 = (s, p) -> s.startsWith(p);
        System.out.println(lambda5.check("Zoo", "A")); // false

        // construtores
        EmptyStringCreator methodRef6 = String::new;
        var myString = methodRef6.create();
        System.out.println(myString.equals("Snake")); // false

        EmptyStringCreator lambda6 = () -> new String();
        myString = lambda6.create();
        System.out.println(myString.equals("Snake")); // false

        StringCopier methodRef7 = String::new;
        myString = methodRef7.copy("Zebra");
        System.out.println(myString.equals("Zebra")); // true

        StringCopier lambda7 = x -> new String(x);
        myString = lambda7.copy("Zebra");
        System.out.println(myString.equals("Zebra")); // true
    }
}
