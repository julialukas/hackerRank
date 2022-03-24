package org.example;

    interface Food {
public String getType();
        }
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza"))
            return new Pizza();
        if (order.equalsIgnoreCase("cake"))
            return new Cake();
        return null;

    }
    static class test {
        public static void main(String[] args) {
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood("cake");


            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
    }


}
