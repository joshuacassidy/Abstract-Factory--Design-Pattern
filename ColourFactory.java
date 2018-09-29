import Color.Blue;
import Color.Colour;
import Color.Red;
import Color.Yellow;
import Tool.Tool;

public class ColourFactory extends AbstractFactory {

    @Override
    public Tool getTool(String shapeType){
        return null;
    }

    @Override
    public Colour getColour(String color) {

        if(color == null){
            return null;
        } else {
            if (color.equalsIgnoreCase("red")) {
                return new Red();
            } else if (color.equalsIgnoreCase("yellow")) {
                return new Yellow();
            } else if (color.equalsIgnoreCase("blue")) {
                return new Blue();
            } else {
                return null;
            }
        }
    }
}