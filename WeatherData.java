import java.util.ArrayList;
public class WeatherData
{

private ArrayList<Double> temperatures;

WeatherData(ArrayList<Double> list)
{
    temperatures = list;
}
/**
* Cleans the data by removing from temperatures all values that are less than
* lower and all values that are greater than upper, as described in part (a)
*/

public void cleanData(double lower, double upper)
{
    for (int i = temperatures.size() - 1; i >= 0; i--)
    {
        if (temperatures.get(i) < lower || temperatures.get(i) > upper) temperatures.remove(i);
    }
}

{ /* to be implemented in part (a) */ }
/**
* Returns the length of the longest heat wave found in temperatures, as described in
* part (b)
* Precondition: There is at least one heat wave in temperatures based on threshold.
*/

public int longestHeatWave(double threshold)
{
    int longest = 0;
    int temp = 0;
    for (double i : temperatures)
    {
        if (i > threshold)
        {
            temp++;
        }
        else
        {
            if (longest < temp) longest = temp;
            temp = 0;
        }
    }
    return longest;
}

{ /* to be implemented in part (b) */ }
// There may be instance variables, constructors, and methods that are not shown.

public String toString()
{
    return temperatures.toString();
}
}