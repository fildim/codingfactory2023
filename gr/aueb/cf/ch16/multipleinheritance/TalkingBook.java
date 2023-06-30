package gr.aueb.cf.ch16.multipleinheritance;

public class TalkingBook implements ISpeakable,IReadable{

    @Override
    public void read() {
        System.out.println("read");
    }

    @Override
    public void speak() {
        System.out.println("speak");
    }
}
