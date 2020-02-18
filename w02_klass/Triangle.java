public class Triangle{

    Triangle(){

    }

    public int calculate(int a,int b,int c){
        int circumference;
        circumference=a+b+c;
        return circumference;

    }

    public static void main(String[]args){
        Triangle x=new Triangle();
        System.out.println("Ümbermõõt on "+x.calculate(2,4,7));
    }
}
