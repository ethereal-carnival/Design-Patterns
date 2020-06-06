package com.crimson_carniverse.knowledge_base.design_patterns.strategies.quacking_strategies;

public class SimpleQuack implements QuackingStrategy {

  @Override
  public void quack() {
    System.out.println("Quack.");
  }
}
