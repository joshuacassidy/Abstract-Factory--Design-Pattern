import Color.Colour;
import Tool.Tool;

public class Main {
    public static void main(String[] args) {

        AbstractFactory toolFactory = FactoryProducer.getFactory("tool");
        Tool tool = toolFactory.getTool("hammer");
        tool.create();

        AbstractFactory colorFactory = FactoryProducer.getFactory("colour");
        Colour colour = colorFactory.getColour("red");
        colour.paint();
    }
}