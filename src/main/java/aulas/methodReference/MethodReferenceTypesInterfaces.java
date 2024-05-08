package aulas.methodReference;

interface Converter {
    long round(double num);
}

interface StringStart {
    boolean beginningCheck(String prefix);
}

interface StringChecker {
    boolean check();
}

interface StringParameterChecker {
    boolean check(String text);
}

interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

interface EmptyStringCreator {
    String create();
}

interface StringCopier {
    String copy(String value);
}
