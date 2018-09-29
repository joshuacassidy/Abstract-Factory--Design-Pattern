public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("tool")){
            return new ToolFactory();

        }else if(choice.equalsIgnoreCase("colour")){
            return new ColourFactory();
        } else {
            return null;
        }
    }
}
