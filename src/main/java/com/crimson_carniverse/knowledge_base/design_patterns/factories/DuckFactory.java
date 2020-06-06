package com.crimson_carniverse.knowledge_base.design_patterns.factories;

import com.crimson_carniverse.knowledge_base.design_patterns.models.Duck;

public interface DuckFactory {
  Duck getNewDuck();
}