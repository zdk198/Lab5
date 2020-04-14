/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */
public class TestScoresDemo {
    public static void main(String[] args) throws Exception
    {
        double[] badScores = { 97.5, 66.7, 88.0, 10.0, 99.0 };
        double[] goodScores = { 97.5, 66.7, -88.0, 100.0, 99.0 }; 
        TestScores test=null;
 
        try
        {
            test = new TestScores(badScores);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
 
        try
        {
            test = new TestScores(goodScores);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
 
        System.out.print("Good scores"+ "\n\tThe average of the good scores is " + test.getAverage());
    }
}
