package gr.aueb.cf.ch19;

public class GenericNodeApp {

    public static void main(String[] args) {

        GenericNode genericNode = new GenericNode();

        genericNode.setValue("coding");

        int val = (int) genericNode.getValue();
    }
}
