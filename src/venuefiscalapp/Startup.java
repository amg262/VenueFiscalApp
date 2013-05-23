
package venuefiscalapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import outputstrategy.ConsoleAndFileOutput;
import outputstrategy.ConsoleOutput;
import outputstrategy.FileOutput;
import outputstrategy.GuiAndFileOutput;
import outputstrategy.GuiOutput;
import outputstrategy.OutputStrategy;

/**
 *
 * This is a program that will take in the name of a venue or stadium etc.
 * and will you input the attendance it will will output the percent of capacity,
 * the revenue generated based on attendance and average ticket prices. All average
 * ticket prices are factual and researched.
 * 
 * @author Andy
 */
public class Startup {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        
        final String STARTUP_XML = "startupConfig.xml";
        final String LOGIN_BEAN = "loginWindow";
        
        try {
            
        //Dependency injection!
        final AbstractApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {STARTUP_XML});
        
        LoginWindow window = (LoginWindow)context.getBean(LOGIN_BEAN);
        window.setVisible(true); //Setting window to visible
        
        /**
         * Login Information:
         * ------------------
         * user: admin
         * pass: java
         */
        
        } catch (Exception e){
            throw e;
        }
        
        
        
//        
//        final String n = "miller park";
//        double attendance = 320;
//        String name = n.toUpperCase();
//        
//        //Dependency Injection
//        AbstractApplicationContext context = 
//                new ClassPathXmlApplicationContext(new String[] {"startupConfig.xml"});
//        //Tech devices
//        TechDeviceStrategy device = (Terminal)context.getBean("device");
//        
//        //Output Devices
//        OutputStrategy guiOuput = (GuiOutput)context.getBean("guiOuput");
//        OutputStrategy consoleOutput = (ConsoleOutput)context.getBean("consoleOutput");
//        OutputStrategy fileOutput = (FileOutput)context.getBean("fileOutput");
//        OutputStrategy guiAndFileOutput = (GuiAndFileOutput)context.getBean("guiAndFileOutput");
//        OutputStrategy consoleAndFileOutput = (ConsoleAndFileOutput)context.getBean("consoleAndFileOutput");
//    
//        try {
//        
//        device.startCalc();
//        device.inputInfo(name, attendance);
//        device.outputGame(guiOuput);
//        device.outputTotals(guiOuput);
//        
//        device.startCalc();
//        device.inputInfo(name, 20000);
//        device.outputGame(guiOuput);
//        device.outputTotals(guiOuput);
//
//        
//        device.startCalc();
//        device.inputInfo(name, 40000);
//        device.outputGame(guiOuput);
//        device.outputTotals(guiOuput);
//        
//
//        } catch (IllegalArgumentException iarge){
//            System.out.println(iarge.getMessage());
//            
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//    }
    }
}
