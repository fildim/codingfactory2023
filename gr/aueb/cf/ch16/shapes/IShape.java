package gr.aueb.cf.ch16.shapes;

@FunctionalInterface
public interface IShape {

    /**
     * returns the id of the {@link IShape}
     * @return
     *      the id key
     */
    long getId();
}
