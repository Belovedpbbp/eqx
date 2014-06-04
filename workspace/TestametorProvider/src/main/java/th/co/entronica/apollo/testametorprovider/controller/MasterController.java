
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.entronica.apollo.testametorprovider.controller;

import th.co.entronica.apollo.testametorprovider.view.MainForm;
import th.co.entronica.apollo.testametorprovider.view.content.ExecuteScriptPanel;
import th.co.entronica.apollo.testametorprovider.view.content.ManageScriptPanel;

/**
 *
 * @author Pop
 */
public class MasterController {

   private static MasterController instance;
   private MainController mainController;
   private MainForm mainForm;
   private ManageScriptController manageScriptController;
   private ManageScriptPanel manageScriptPanel;
   private ExecuteScriptPanel executeScriptPanel;
   private ExecuteScriptController executeScriptController;

   private MasterController() {
      init();
   }

   public static MasterController getInstance() {

      if (instance == null) {
         instance = new MasterController();
      }

      return instance;
   }

   private void init() {
      initMainForm();
      initManageScript();
      initExecScript();
   }

   private void initMainForm() {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            mainController = new MainController();
            setMainForm(new MainForm(mainController));
            getMainForm().setVisible(true);
         }
      });
   }

   /**
    * @return the mainController
    */
   public MainController getMainController() {
      return mainController;
   }

   /**
    * @param mainController the mainController to set
    */
   public void setMainController(MainController mainController) {
      this.mainController = mainController;
   }

   private void initManageScript() {


      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            setManageScriptController(new ManageScriptController());
            setManageScriptPanel(new ManageScriptPanel(getManageScriptController()));
         }
      });
   }

   /**
    * @return the mainForm
    */
   public MainForm getMainForm() {
      return mainForm;
   }

   /**
    * @param mainForm the mainForm to set
    */
   public void setMainForm(MainForm mainForm) {
      this.mainForm = mainForm;
   }

   /**
    * @return the manageScriptController
    */
   public ManageScriptController getManageScriptController() {
      return manageScriptController;
   }

   /**
    * @param manageScriptController the manageScriptController to set
    */
   public void setManageScriptController(ManageScriptController manageScriptController) {
      this.manageScriptController = manageScriptController;
   }

   /**
    * @return the manageScriptPanel
    */
   public ManageScriptPanel getManageScriptPanel() {
      return manageScriptPanel;
   }

   /**
    * @param manageScriptPanel the manageScriptPanel to set
    */
   public void setManageScriptPanel(ManageScriptPanel manageScriptPanel) {
      this.manageScriptPanel = manageScriptPanel;
   }

   private void initExecScript() {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            setExecuteScriptController(new ExecuteScriptController());
            setExecuteScriptPanel(new ExecuteScriptPanel(getExecuteScriptController()));
         }
      });
   }

   /**
    * @return the executeScriptPanel
    */
   public ExecuteScriptPanel getExecuteScriptPanel() {
      return executeScriptPanel;
   }

   /**
    * @param executeScriptPanel the executeScriptPanel to set
    */
   public void setExecuteScriptPanel(ExecuteScriptPanel executeScriptPanel) {
      this.executeScriptPanel = executeScriptPanel;
   }

   /**
    * @return the executeScriptController
    */
   public ExecuteScriptController getExecuteScriptController() {
      return executeScriptController;
   }

   /**
    * @param executeScriptController the executeScriptController to set
    */
   public void setExecuteScriptController(ExecuteScriptController executeScriptController) {
      this.executeScriptController = executeScriptController;
   }
}
