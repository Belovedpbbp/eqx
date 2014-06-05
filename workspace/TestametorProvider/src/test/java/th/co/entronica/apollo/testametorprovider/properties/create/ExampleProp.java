package th.co.entronica.apollo.testametorprovider.properties.create;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ExampleProp {
    public static void main(String[] args) {
        Properties prop = new Properties();
        OutputStream output = null;
        
        try {
            output = new FileOutputStream("testConfig.properties");
            
            /** SET THE PROPERTIES VALUE **/
            prop.setProperty("Name", "Piyanat");
            prop.setProperty("LastName", "Chanangklang");
            prop.setProperty("University", "SUT");
         
            /** SAVE PROPERTIES TO PROJECT ROOT FOLDER **/
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }   
}
