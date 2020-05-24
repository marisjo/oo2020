
public class Main {

    public static void main(String[] args) {
        Hamburger h=new Hamburger("middle", 1220, false, "Hamburger");
        h.food();
        h.countCalories();
        Banana b=new Banana("high",200,true,"Banana");
        b.food();
        b.countCalories();
    }

}
