package builderPattern;

import junit.framework.TestCase;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class MealBuilderTest extends TestCase {
    public void testMealBuilderTest() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegBurgerMeal = mealBuilder.prepareVegBurgerMeal();
        vegBurgerMeal.showAllItems();
        System.out.println("COSTS: " + vegBurgerMeal.getCost());
        Meal chickenBurgerMeal = mealBuilder.prepareChickenBurgerMeal();
        chickenBurgerMeal.showAllItems();
        System.out.println("COSTS: "+vegBurgerMeal.getCost());
    }
}
