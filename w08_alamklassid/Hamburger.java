
public class Hamburger extends Food {


    public Hamburger(String nutritionValue, int calories, boolean healthy, String name) {
        super(nutritionValue, calories, healthy, name);
        
    }

    public void food() {
        //healthy=false;
        super.food();
    }

    public void calories(){
        super.countCalories();
    }
}