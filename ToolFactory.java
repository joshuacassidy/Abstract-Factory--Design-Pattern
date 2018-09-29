import Color.Colour;
import Tool.Tool;
import Tool.Hammer;
import Tool.Screwdriver;
import Tool.Saw;

public class ToolFactory extends AbstractFactory {

    @Override
    public Tool getTool(String toolType){
        if(toolType == null){
            return null;
        } else {

            if (toolType.equalsIgnoreCase("hammer")) {
                return new Hammer();

            } else if (toolType.equalsIgnoreCase("screwdriver")) {
                return new Screwdriver();

            } else if (toolType.equalsIgnoreCase("saw")) {
                return new Saw();
            } else {
                return null;
            }
        }
    }

    @Override
    public Colour getColour(String colour) {
        return null;
    }
}