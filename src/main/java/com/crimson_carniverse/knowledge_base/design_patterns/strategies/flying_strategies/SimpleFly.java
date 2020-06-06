package com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies;

public class SimpleFly implements FlyingStrategy {

  @Override
  public void fly() {
    System.out.println("I fly normally.");
  }
}
