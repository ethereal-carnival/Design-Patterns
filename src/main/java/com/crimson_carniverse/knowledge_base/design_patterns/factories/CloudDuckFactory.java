package com.crimson_carniverse.knowledge_base.design_patterns.factories;

import com.crimson_carniverse.knowledge_base.design_patterns.api.Duck;
import com.crimson_carniverse.knowledge_base.design_patterns.models.DuckImpl;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.display_strategies.GraphicalDisplay;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies.JetFly;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.quacking_strategies.DoubleQuack;

public class CloudDuckFactory implements DuckFactory {

  @Override
  public Duck getNewDuck() {
    return DuckImpl.builder()
        .displayStrategy(new GraphicalDisplay())
        .quackingStrategy(new DoubleQuack())
        .flyingStrategy(new JetFly())
        .build();
  }
}
