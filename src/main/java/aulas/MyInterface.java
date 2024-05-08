package aulas;

interface MyInterface {
    default void myMethod() {
        System.out.println("Método default em MyInterface");
    }
}

class MyClass implements MyInterface {
    // Implementação padrão do método default
}

class AnotherClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementação personalizada em AnotherClass");
    }
}