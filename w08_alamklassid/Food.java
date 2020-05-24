/**
 * Food
 */
public abstract class Food {

    public String nutritionValue;
    public int calories;
    public boolean healthy;
    public String name;

    public Food(String nutritionValue,int calories,boolean healthy, String name){
        this.nutritionValue=nutritionValue;
        this.calories=calories;
        this.healthy=healthy;
        this.name=name;
    }
    public void food(){
        if(healthy==true){
            System.out.println("This is a "+name+" it is a healthy food.");
        }else{
            System.out.println("This is a "+name+" it is an unhealthy food.");
        }
    }

    public void countCalories(){
        System.out.println("It has "+calories+" calories and a "+nutritionValue+" nutrition value.");
    }
    
}