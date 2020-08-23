package com.crimson_carniverse.knowledge_base.design_patterns.api;

import static com.crimson_carniverse.knowledge_base.design_patterns.api.DuckType.CITY_DUCK;
import static com.crimson_carniverse.knowledge_base.design_patterns.api.DuckType.CLOUD_DUCK;
import static com.crimson_carniverse.knowledge_base.design_patterns.api.DuckType.RUBBER_DUCK;

import com.crimson_carniverse.knowledge_base.design_patterns.api.Duck;
import com.crimson_carniverse.knowledge_base.design_patterns.api.DuckType;
import com.crimson_carniverse.knowledge_base.design_patterns.factories.CityDuckFactory;
import com.crimson_carniverse.knowledge_base.design_patterns.factories.CloudDuckFactory;
import com.crimson_carniverse.knowledge_base.design_patterns.factories.DuckFactory;
import com.crimson_carniverse.knowledge_base.design_patterns.factories.RubberDuckFactory;
import java.util.HashMap;
import java.util.Map;

public class DuckProvider {

  private static Map<DuckType, DuckFactory> map;

  static  {
    map = new HashMap<>();
    map.put(CITY_DUCK, new CityDuckFactory());
    map.put(RUBBER_DUCK, new RubberDuckFactory());
    map.put(CLOUD_DUCK, new CloudDuckFactory());
  }

  public static Duck getNewDuck(DuckType type) {
      return map.get(type).getNewDuck();
  }
}