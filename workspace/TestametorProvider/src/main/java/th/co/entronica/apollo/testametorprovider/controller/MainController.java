
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.entronica.apollo.testametorprovider.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import th.co.entronica.apollo.testametorprovider.view.MainForm;

/**
 *
 * @author Piyanat
 */
public class MainController {

    private boolean openProject = false;
    private String projectName;
    private String projectPath;
    private String configPath;
    private File configPathFile;
    private Properties prop;
    private InputStream input = null;

    public void newProject(MainForm mainForm) {
    }

    /**
     * SHOW DIALOG NEW PROJECT *
     */
    public void showDialogNewProject(MainForm mainForm) {
        JFileChooser newPro = new JFileChooser();

        try {
            newPro.setDialogTitle("New Projcet");
            newPro.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            prop = new Properties();
            input = new FileInputStream("src/main/resources/config.properties");
            prop.load(input);
            configPath = prop.getProperty("path");
            if (configPath == null || configPath.equals("")) {
                if (newPro.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    projectPath = newPro.getSelectedFile().toString();

                } else {
                    System.out.println("No Selection");
                }
            } else {
                configPathFile = new File(configPath);
                newPro.setCurrentDirectory(configPathFile);
                if (newPro.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    projectPath = newPro.getSelectedFile().toString();

                } else {
                    System.out.println("No Selection");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * SHOW DIALOG OPEN PROJECT *
     */
    public void showDialogOpenProject(MainForm mainForm) {
        JFileChooser openPro = new JFileChooser();

        try {
            openPro.setDialogTitle("Open Project");
            openPro.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            prop = new Properties();
            input = new FileInputStream("src/main/resources/config.properties");
//            input = getClass().getResourceAsStream("./src/main/resources/config.properties");
            prop.load(input);
            configPath = prop.getProperty("path");
            if (configPath == null || configPath.equals("")) {
                if (openPro.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    projectPath = openPro.getCurrentDirectory().toString();
                    projectName = openPro.getSelectedFile().getName();

                    System.out.println(JFileChooser.APPROVE_OPTION + " Choose File");
                } else {
                    System.out.println(JFileChooser.CANCEL_OPTION + "Error, No Select");
                }
            } else {
                configPathFile = new File(configPath);
                openPro.setCurrentDirectory(configPathFile);
                if (openPro.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    projectPath = openPro.getCurrentDirectory().toString();
                    projectName = openPro.getSelectedFile().getName();

                    System.out.println(JFileChooser.APPROVE_OPTION + " Choose File");
                } else {
                    System.out.println(JFileChooser.CANCEL_OPTION + " Error, No Select");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createNewProject(String proName) {
        projectName = proName;
        // create File object
        File stockDir = new File(projectPath + "/" + projectName);
        File stockDir1 = new File(projectPath + "/" + projectName + "/TestScript");
        File stockDir2 = new File(projectPath + "/" + projectName + "/TestResult");
        File stockFile = new File(projectPath + "/" + projectName + "/test.config");


        try {
            stockDir.mkdir();
            stockDir1.mkdir();
            stockDir2.mkdir();
            stockFile.createNewFile();

        } catch (IOException ioe) {
            System.out.println("Error while Creating File in Java" + ioe);
        }

        System.out.println("stock file" + stockFile.getPath() + " created ");
    }

    public String getProjectPath() {
        return projectPath;
    }

    public String getProjectName() {
        return projectName;
    }

    /**
     * @return the openProject
     */
    public boolean isOpenProject() {
        return openProject;
    }

    /**
     * @param openProject the openProject to set
     */
    public void setOpenProject(boolean openProject) {
        this.openProject = openProject;
    }
}
