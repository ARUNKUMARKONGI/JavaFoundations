abstract class CoffeeTemplate {
    final void makeCoffee() {
        addCondiments();
        brewCoffeeGrounds();
        boilWater();
        pourInCup();

        System.out.println("Coffee is ready!");
    }
    abstract void addCondiments();
    abstract void brewCoffeeGrounds();
    final void boilWater() {
        System.out.println("Boiling water");
    }
    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
class Coffee extends CoffeeTemplate {
    void brewCoffeeGrounds() {
        System.out.println("Brewing coffee grounds");
    }
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

}

public class FinalMethodCoffeeExample {
    public static void main(String[] args) {
        CoffeeTemplate coffee = new Coffee();
        coffee.makeCoffee();
    }
}




//the order of method calling is fixed and wont change