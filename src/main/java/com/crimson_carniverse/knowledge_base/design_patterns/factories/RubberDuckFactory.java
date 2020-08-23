package com.crimson_carniverse.knowledge_base.design_patterns.factories;

import com.crimson_carniverse.knowledge_base.design_patterns.api.Duck;
import com.crimson_carniverse.knowledge_base.design_patterns.models.DuckImpl;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.display_strategies.TextualDisplay;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies.NoFly;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.quacking_strategies.NoQuack;

public class RubberDuckFactory implements DuckFactory {

  @Override
  public Duck getNewDuck() {
    return DuckImpl.builder()
        .displayStrategy(new TextualDisplay())
        .flyingStrategy(new NoFly())
        .quackingStrategy(new NoQuack())
        .build();
  }
}
