package com.crimson_carniverse.knowledge_base.design_patterns.factories;

import com.crimson_carniverse.knowledge_base.design_patterns.models.Duck;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.display_strategies.GraphicalDisplay;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies.SimpleFly;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.quacking_strategies.SimpleQuack;

public class CityDuckFactory implements DuckFactory {

  @Override
  public Duck getNewDuck() {
    return Duck.builder()
        .displayStrategy(new GraphicalDisplay())
        .flyingStrategy(new SimpleFly())
        .quackingStrategy(new SimpleQuack())
        .build();
  }
}
