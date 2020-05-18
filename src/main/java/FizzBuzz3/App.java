package FizzBuzz3;

import java.util.*; 

/**
 * Hello!
 * The only reason I've done this with a list instead of just printing each word
 * or integer is to make it easier to test.
 */
public class App 
{

    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        for (String value : fizzBuzz(1,20))
        {
            builder.append(value + " ");
        }
        System.out.println(builder.toString());
    }

    public static List<String> fizzBuzz(int j, int k)
    {
        int fizzes = 0;
        int buzzes = 0;
        int fizzbuzzes = 0;
        int luckies = 0;
        int integers = 0;

        List<String> ans = new ArrayList<>();
        for(int i=j; i<=k; i++)
        {
            if(Integer.toString(i).contains("3"))
            {
                ans.add("lucky");
                luckies++;
            }
            else if(i%15==0)
            {
                ans.add("fizzbuzz");
                fizzbuzzes++;
            }
            else if(i%5==0)
            {
                ans.add("buzz");
                buzzes++;
            }
            else if(i%3==0)
            {
                ans.add("fizz");
                fizzes++;
            }
            else
            {
                ans.add(Integer.toString(i));
                integers++;
            }
        }
        System.out.print("fizz: " + fizzes);
        System.out.print(", buzz: " + buzzes);
        System.out.print(", fizzbuzz: " + fizzbuzzes);
        System.out.print(", lucky: " + luckies);
        System.out.print(", integer: " + integers);
        return ans;
    }
}
