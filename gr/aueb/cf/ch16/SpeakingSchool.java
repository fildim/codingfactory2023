package gr.aueb.cf.ch16;

public class SpeakingSchool {

    private Cat cat;

    public SpeakingSchool() {
        cat = new Cat();
    }

    public void learnToSpeak() {
        cat.speak();
    }
}
