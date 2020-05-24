public class Banana extends Food {

    public Banana(String nutritionValue, int calories, boolean healthy, String name) {
        super(nutritionValue, calories, healthy, name);
    }

    public void food(){
        super.food();
    }

    public void calories(){
        super.countCalories();
    }
}
