
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.entronica.apollo.testametorprovider.controller;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import th.co.entronica.apollo.testametorprovider.view.MainForm;

/**
 *
 * @author Pop
 */
public class MainController {

   private boolean openProject = false;
   private String projectName;
   private String projectPath;

   public void newProject(MainForm mainForm) {
   }

   public void showDialogNewProject(MainForm mainForm) {
      JFileChooser chooser = new JFileChooser();
      chooser.setDialogTitle("New Projcet");
      chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
         projectPath = chooser.getSelectedFile().toString();

      } else {
         System.out.println("No Selection");
      }
   }

   public void showDialogOpenProject(MainForm mainForm) {
      JFileChooser open = new JFileChooser();
      open.setDialogTitle("Open Project");
      open.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      if (open.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
         projectPath = open.getCurrentDirectory().toString();
         projectName = open.getSelectedFile().getName();
         
         System.out.println(JFileChooser.APPROVE_OPTION);
      } else {
         System.out.println(JFileChooser.CANCEL_OPTION + "Error, No Select");

      }
   }

   public void createNewProject(String proName) {
      projectName = proName;
      // create File object
      System.out.println(projectPath);
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
