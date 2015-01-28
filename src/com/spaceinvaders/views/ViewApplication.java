/* 
 * Class :      ViewApplication
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 * <h1>ViewApplication</h1>
 * <p>
 * public class ViewApplication<br/>
 * extends JFrame<br/>
 * implements Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewApplication extends JFrame implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JPanel                  mainContent;
    private     JPanel                  panTop;
    private     JPanel                  panLeft;
    private     JPanel                  panCenter;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Start the application
     * Create the JPanel and initialize the listener
     * Also call for toolBar function and left Panel creation
     */
    public ViewApplication(){
        this.setTitle("Space invaders");
        this.setMinimumSize(DIM_FRAME_MIN);
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo(null); use after pack
        
        this.initComponents();
    }
    
    
    /*
     * Initialize JPanel components used by the program
     */
    private void initComponents(){
        this.mainContent        = new JPanel();
        //this.panCenter          = new ViewGamePanel(this);
        this.panCenter          = new ViewWelcomePanel(this);
        
        this.mainContent.setLayout(new BorderLayout());
        this.mainContent.setBackground(Color.BLACK);
        this.mainContent.add(this.panCenter, BorderLayout.CENTER);
        
        this.setContentPane(this.mainContent);
    }
    
    
    /**
     * Start the game
     */
    public void startGame(){
        System.out.println("Start the game");
        this.mainContent.removeAll();
        this.panCenter = new ViewGamePanel(this);
        this.mainContent.add(this.panCenter, BorderLayout.CENTER);
        this.panCenter.validate();
        this.mainContent.validate();
        this.validate();
        this.repaint();
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
