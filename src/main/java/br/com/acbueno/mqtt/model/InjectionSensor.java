package br.com.acbueno.mqtt.model;

import java.util.Random;

import lombok.Data;
import lombok.Setter;

@Data
public class InjectionSensor {


  private String device = null;


  private int rotationSensor;


  private int phaseSensor;


  private int detonationSensor;

  private int butterflyPositionSensor;


  private float oxygenSensor;


  private float mafSensor;

  private Random random = new Random();

  public InjectionSensor(String device) {
    this.device = device;
  }

  public int getRotationSensor() {
    int min = 100;
    int max = 7000;

    return (int) (Math.random() * (max - min) + min);
  }

  public int getPhaseSensor() {
    int min = 1;
    int max = 4;
    return (int) (Math.random() * (max - min) + min);
  }

  public int getDetonationSensor() {
    int min = 1;
    int max = 220;
    return (int) (Math.random() * (max - min) + min);
  }

  public int getButterflyPositionSensor() {
    int min = 0;
    int max = 90;
    return (int) (Math.random() * (max - min) + min);
  }

  public float getOxygenSensor() {
    float min = 0;
    float max = 90;
    return (float) (Math.random() * (max - min) + min);
  }

  public float getMafSensor() {
    float min = 0;
    float max = 90;
    return (float) (Math.random() * (max - min) + min);
  }

  @Override
  public String toString() {
    return "InjectionSensor [device=" + getDevice() +
        ", rotationSensor=" + getRotationSensor() +
        ", phaseSensor=" + getPhaseSensor() +
        ", detonationSensor=" + getDetonationSensor() +
        ", butterflyPositionSensor=" + getButterflyPositionSensor() +
        ", oxygenSensor=" + getOxygenSensor() +
        ", mafSensor=" + getMafSensor() + "]";
  }

}
