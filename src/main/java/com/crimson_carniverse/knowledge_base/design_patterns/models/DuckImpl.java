package com.crimson_carniverse.knowledge_base.design_patterns.models;

import com.crimson_carniverse.knowledge_base.design_patterns.strategies.display_strategies.DisplayStrategy;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies.FlyingStrategy;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.quacking_strategies.QuackingStrategy;

public class DuckImpl implements com.crimson_carniverse.knowledge_base.design_patterns.api.Duck {

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
  @Override
  public void display() {
    displayStrategy.display();
  }

  @Override
  public void fly() {
    flyingStrategy.fly();
  }

  @Override
  public void quack() {
    quackingStrategy.quack();
  }


  // Builder pattern

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private DuckImpl duck;

    private Builder() {
      duck = new DuckImpl();
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

    public DuckImpl build() {
      return this.duck;
    }
  }
}
