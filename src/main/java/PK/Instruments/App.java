package PK.Instruments;

import PK.Instruments.Controller.ContextManager;
import PK.Instruments.Utils.ExampleLoader;

public class App 
{
    public static void main( String[] args )
    {
    	ExampleLoader.loadWholeData();
    	
    	ContextManager contextManager = ContextManager.getInstance();
    	contextManager.run();
    }
}