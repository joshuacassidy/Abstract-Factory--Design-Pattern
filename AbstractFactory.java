import Color.Colour;
import Tool.Tool;

public abstract class AbstractFactory {

    abstract Colour getColour(String colour);
    abstract Tool getTool(String shape);

}