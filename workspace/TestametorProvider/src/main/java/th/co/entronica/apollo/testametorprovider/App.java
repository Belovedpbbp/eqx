package th.co.entronica.apollo.testametorprovider;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import th.co.entronica.apollo.testametorprovider.controller.MasterController;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        
        /** REMOVE KEY PROPERTIES **/
//        Properties prop = new Properties();
//        OutputStream output = null;
//        try {
//            output = new FileOutputStream("config.properties");
//            prop.remove("path");
//            prop.store(output, null);
//
//        } catch (IOException io) {
//            io.printStackTrace();
//        }
        MasterController masterController = MasterController.getInstance();
    }
}
