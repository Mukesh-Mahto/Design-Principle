package com.designPatterns.Creational.factoryMethodPattern.refactoring_guru;

/**
 * <h1>Client Code</h1>
 */
public class DialogButtonExample {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBussinessLogic();
    }

    /**
     * All of the client code should work with factories and products
     * through abstract interfaces. This way it does not care which factory it
     * works with and what kind of product it returns.
     */
    static void runBussinessLogic() {
        dialog.renderWindow();
    }

    /**
     * <h1>The concrete factory is usually chosen depending on configuration or environment options.</h1>
     */
    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }
}
