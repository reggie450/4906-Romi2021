// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BallCollector extends SubsystemBase {

  //private final Spark m_ball;
  //private final Servo m_Servo;
  private final Servo m_Servo;

  /** Creates a new BallCollector. */
  public BallCollector() {

//m_ball = new Spark(4);
 m_Servo = new  Servo(4);
//m_Servo.setBounds(1.0, 1.48, 1.5, 1.52, 2.0);

 //enableDeadbandElimination(true);



 m_Servo.setBounds(1950, 1504, 1500, 1496, 1050);
   
  }


 public void runCollector(double speed){
  m_Servo.setSpeed(speed);
  

}


public void stopServo() {
  m_Servo.stopMotor();

} 
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
