// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.BallCollector;
import frc.robot.subsystems.Drivetrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutoBarrel extends SequentialCommandGroup {
 
  /**
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  /** Creates a new AutoBarrel. */
  public AutoBarrel(Drivetrain drivetrain, BallCollector ballCollector) {
      addCommands(
      new  BallPicker(-.5, 2, ballCollector),
      new WaitCommand(3)
      //new BallPicker(0,0, ballCollector)
      //new WaitCommand(1),
     // new InstantCommand(() -> ballCollector.runBallPicker(1))
       // new WaitCommand(2),
        //new InstantCommand(() -> m_ballCollector.stopServo())
        /*  new DriveDistance(-0.5, 10, drivetrain),
        new TurnDegrees(-0.5, 45, drivetrain),
        new DriveDistance(-0.5, 10, drivetrain),
        new TurnDegrees(0.5, 180, drivetrain)  */
        
        );
  }
}
