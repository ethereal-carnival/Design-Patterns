package com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies;

public class JetFly implements FlyingStrategy {

  @Override
  public void fly() {
    System.out.println("I fly like a jet.");
  }
}
