// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest;

import org.usfirst.frc1518.CommandBasedTest.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc1518.CommandBasedTest.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton y;
    public JoystickButton b;
    public JoystickButton a;
    public JoystickButton lb;  // JDH - remapped buttons 2/4/16
    public JoystickButton rb;  // JDH - remapped buttons 2/4/16
    public JoystickButton encoderTest;
    public JoystickButton wallLineUp;
    public Joystick gamepad;
    public JoystickButton trigger;
    public JoystickButton rTrigger;
    public JoystickButton reverse;
    public static Joystick leftJoystick;
    public static Joystick rightJoystick;
    public JoystickButton left6;
    //public JoystickButton right3;
    public JoystickButton left3;
    public JoystickButton x;
    public JoystickButton xbstart;
    public JoystickButton back;
    public JoystickButton left4; //down
    public JoystickButton left5; //up
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(1);
        
        leftJoystick = new Joystick(0);
        
        reverse = new JoystickButton(leftJoystick, 8);
        reverse.whenPressed(new ReverseDrive());
        trigger = new JoystickButton(leftJoystick, 1);
        trigger.whileHeld(new Acquire());  // JDH - remapped buttons 2/4/16
        rTrigger = new JoystickButton (rightJoystick, 1);
        rTrigger.whileHeld(new LaunchHigh());
        //right3 = new JoystickButton(rightJoystick, 3);
        //right3.whileHeld(new LiftFangs());
        left3 = new JoystickButton(leftJoystick, 3);
        left3.whileHeld(new RangeCompare());
         //Windswept walks across dusty plains
        gamepad = new Joystick(2);
        a = new JoystickButton(gamepad, 1);
        a.whileHeld(new LaunchLow());
        // a.whileHeld(new LiftFangs());  // JDH - remapped buttons 2/4/16
        b = new JoystickButton(gamepad, 2);
        // b.whileHeld(new LaunchLow());  // JDH - remapped buttons 2/4/16
        y = new JoystickButton(gamepad, 4);
        y.whileHeld(new LaunchHigh());
        lb = new JoystickButton(gamepad, 5);  // JDH - remapped buttons 2/4/16
        lb.whileHeld(new LiftFangs());
        rb = new JoystickButton(gamepad, 6);  // JDH - remapped buttons 2/4/16
        rb.whileHeld(new Acquire());
        wallLineUp = new JoystickButton(leftJoystick, 10);
        xbstart = new JoystickButton(gamepad, 8);
        xbstart.whileHeld(new Lift());
        b = new JoystickButton(gamepad, 2);
        b.whileHeld(new RetractArm());
        x = new JoystickButton(gamepad, 3);
        x.whileHeld(new LiftArm());
        back = new JoystickButton(gamepad, 7);
        back.whileHeld(new UnJam());
        left4 = new JoystickButton(leftJoystick, 4);
        left4.whileHeld(new RightRobot());
        left5 = new JoystickButton(leftJoystick, 5);
        left5.whileHeld(new RabbitTail());
       
	
       // wallLineUp.whenPressed(new Target());
        //encoderTest = new JoystickButton(leftJoystick, 11);
        //encoderTest.whenPressed(new Forward());
        


        // SmartDashboard Buttons

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getGamepad() {
        return gamepad;
    }

    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

