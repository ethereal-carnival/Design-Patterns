package com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies;

public class NoFly implements FlyingStrategy {

  @Override
  public void fly() {
    System.out.println("I don't fly.");
  }
}
