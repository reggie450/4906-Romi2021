// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.BallCollector;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class BallPicker extends CommandBase {
  private final double m_duration;
  private final double m_speed;
  private final BallCollector m_collector;
  private long m_startTime;

  /**
   * Creates a new DriveTime. This command will drive your robot for a desired speed and time.
   *
   * @param speed The speed which the robot will drive. Negative is in reverse.
   * @param time How much time to drive in seconds
   * @param drive The drivetrain subsystem on which this command will run
   */
  public BallPicker(double speed, double time, BallCollector collector ) {
    m_speed = speed;
    m_duration = time * 1000;
    m_collector = collector;
    addRequirements(collector);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_startTime = System.currentTimeMillis();
   //m_collector.runCollector(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_collector.runCollector(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  m_collector.stopServo();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - m_startTime) >= m_duration;
  }
}
