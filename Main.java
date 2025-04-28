import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> arrs = new ArrayList<Double>();
        double[] nums = {99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5};
        for (double n : nums) arrs.add(n);
        WeatherData temp = new WeatherData(arrs);
        temp.cleanData(85,120);
        System.out.println(temp);

        ArrayList<Double> arrs2 = new ArrayList<Double>();
        double[] nums2 = {100.5, 98.5, 102.0, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2};
        for (double o : nums2) arrs2.add(o);
        WeatherData temp2 = new WeatherData(arrs2);

        System.out.println(temp2.longestHeatWave(95.2));
        
        System.out.println(temp2.longestHeatWave(100.5));
    }
}