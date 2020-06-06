package com.crimson_carniverse.knowledge_base.design_patterns.models;

import com.crimson_carniverse.knowledge_base.design_patterns.strategies.display_strategies.DisplayStrategy;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies.FlyingStrategy;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.quacking_strategies.QuackingStrategy;

public class Duck {

  private DisplayStrategy displayStrategy;
  private FlyingStrategy flyingStrategy;
  private QuackingStrategy quackingStrategy;

  public void setDisplayStrategy(DisplayStrategy displayStrategy) {
    this.displayStrategy = displayStrategy;
  }

  public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
    this.flyingStrategy = flyingStrategy;
  }

  public void setQuackingStrategy(QuackingStrategy quackingStrategy) {
    this.quackingStrategy = quackingStrategy;
  }


  // Duck methods
  public void display() {
    displayStrategy.display();
  }

  public void fly() {
    flyingStrategy.fly();
  }

  public void quack() {
    quackingStrategy.quack();
  }


  // Builder pattern

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private Duck duck;

    private Builder() {
      duck = new Duck();
    }

    public Builder flyingStrategy(FlyingStrategy flyingStrategy) {
      this.duck.setFlyingStrategy(flyingStrategy);
      return this;
    }

    public Builder displayStrategy(DisplayStrategy displayStrategy) {
      this.duck.setDisplayStrategy(displayStrategy);
      return this;
    }

    public Builder quackingStrategy(QuackingStrategy quackingStrategy) {
      this.duck.setQuackingStrategy(quackingStrategy);
      return this;
    }

    public Duck build() {
      return this.duck;
    }
  }
}
