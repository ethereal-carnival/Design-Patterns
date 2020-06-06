package com.crimson_carniverse.knowledge_base.design_patterns;

import static com.crimson_carniverse.knowledge_base.design_patterns.api.DuckProvider.getNewDuck;
import static com.crimson_carniverse.knowledge_base.design_patterns.api.DuckTypes.CITY_DUCK;
import static com.crimson_carniverse.knowledge_base.design_patterns.api.DuckTypes.CLOUD_DUCK;
import static com.crimson_carniverse.knowledge_base.design_patterns.api.DuckTypes.RUBBER_DUCK;

import com.crimson_carniverse.knowledge_base.design_patterns.models.Duck;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.display_strategies.GraphicalDisplay;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.flying_strategies.JetFly;
import com.crimson_carniverse.knowledge_base.design_patterns.strategies.quacking_strategies.DoubleQuack;

public class Main {

  public static void main(String[] args) throws ReflectiveOperationException {
    Duck cityDuck1 = getNewDuck(CITY_DUCK);
    Duck cityDuck2 = getNewDuck(CITY_DUCK);
    Duck cloudDuck1 = getNewDuck(CLOUD_DUCK);
    Duck rubberDuck1 = getNewDuck(RUBBER_DUCK);

    System.out.println("\nCity Duck 1:");
    printDuck(cityDuck1);

    System.out.println("\nCity Duck 2:");
    printDuck(cityDuck2);

    System.out.println("\nCloud Duck 1:");
    printDuck(cloudDuck1);

    System.out.println("\nRubber Duck 1:");
    printDuck(rubberDuck1);

    Duck customDuck = Duck.builder()
        .quackingStrategy(new DoubleQuack())
        .flyingStrategy(new JetFly())
        .displayStrategy(new GraphicalDisplay())
        .build();

    System.out.println("\nCustom Duck:");
    printDuck(customDuck);
  }

  private static void printDuck(Duck duck) {
    duck.display();
    duck.fly();
    duck.quack();
  }
}
