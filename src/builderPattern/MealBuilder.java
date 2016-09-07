package builderPattern;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class MealBuilder {
    public Meal prepareVegBurgerMeal() {
        Meal meal = new Meal();
        meal.items.add(new VegBurger());
        meal.items.add(new Coke());
        return meal;
    }

    public Meal prepareChickenBurgerMeal() {
        Meal meal = new Meal();
        meal.items.add(new ChickenBurger());
        meal.items.add(new Pepsi());
        return meal;
    }
}
