/*
 * Class :      ViewGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.controllers.ControllerGame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;





/**
 * <h1>ViewGame</h1>
 * <p>
 * public class ViewGame<br/>
 * extends JPanel<br/>
 * implements Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewGame extends JPanel implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ControllerGame      controller;
    private     JPanel              panGame;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public ViewGame(ControllerGame pController){
        this.controller = pController;
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLACK);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
