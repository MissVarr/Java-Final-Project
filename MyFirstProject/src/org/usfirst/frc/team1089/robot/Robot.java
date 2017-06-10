package org.usfirst.frc.team1089.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.networktables2.util.Set;

/**
 * Objects to use
 * - Motors (TALON's)
 * - Joysticks
 */
public class Robot extends IterativeRobot {
    private Talon leftTalon, rightTalon, randomTalon; // All your talons
    private Joystick leftStick, rightStick; // All your joysticks
	
    /**
     * Construct fields
     */
    
    public void robotInit() {
    	leftTalon = new Talon(0); // always 0 fam
    	rightTalon = new Talon(1);
    	randomTalon = new Talon(2);
    	
    	leftStick = new Joystick(0); // always 0 fam
    	rightStick = new Joystick(1);
    	}

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * Control robot here.
     */
    public void teleopPeriodic() {
        double left, right;
        left = leftStick.getY();
        leftTalon.set(left);
        
        right = rightStick.getY();
        rightTalon.set(right);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
