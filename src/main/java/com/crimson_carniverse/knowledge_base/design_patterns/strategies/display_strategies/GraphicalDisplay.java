package com.crimson_carniverse.knowledge_base.design_patterns.strategies.display_strategies;

public class GraphicalDisplay implements DisplayStrategy {

  @Override
  public void display() {
    System.out.println("I'm being displayed graphically.");
  }
}
