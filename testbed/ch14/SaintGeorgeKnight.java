package testbed.ch14;

/**
 * a simple Singleton class with eager instantiation and an embarkOnMission method
 * @author fildim
 */
public class SaintGeorgeKnight {

    private static final SaintGeorgeKnight SINGLETON = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {}

    public static SaintGeorgeKnight getInstance() {
        return SINGLETON;
    }

    public static void embarkOnMission() {
        System.out.println("Embarking on Mission");
    }
}
