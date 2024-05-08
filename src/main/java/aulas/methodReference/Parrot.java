package aulas.methodReference;

public class Parrot {
    public static void makeSound(String word) {
        LearnToSpeak learner = s -> System.out.println(s);
        ParrotHelper.teacher(word, learner);
    }

    public static void makeSoundUsingMethodReference(String word) {
        LearnToSpeak learner = System.out::println;
        ParrotHelper.teacher(word, learner);
    }
}
