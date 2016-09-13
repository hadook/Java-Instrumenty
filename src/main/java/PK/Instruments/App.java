package PK.Instruments;

import PK.Instruments.Controller.ContextManager;

public class App 
{
    public static void main( String[] args )
    {
    	ContextManager contextManager = ContextManager.getInstance();
    	contextManager.run();
    }
}