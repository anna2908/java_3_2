public class Main
{
    public static void main(String[] args)
    {
        BmiService service = new BmiService();
        int weight = 80;
        float height = 1.75F;
        float bmi = service.calculate(weight, height);
        System.out.printf("%.1f", bmi);
    }
}