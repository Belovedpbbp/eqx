/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.entronica.apollo.testametorprovider;

import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Pop
 */
public class OutputStreamMonitor extends OutputStream {

    JTextArea textArea ;


    OutputStreamMonitor(JTextArea jTextArea1) {
        
    textArea = jTextArea1;
    }
    
    

    @Override
    public void write(int b) throws IOException {
        textArea.append(""+(char) b);
    
    }

}
