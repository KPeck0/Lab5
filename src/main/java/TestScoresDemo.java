public class TestScoresDemo {
public static void main(String[] args) throws Exception {
    double[] badScores = { 57.5, 66.7, 81.0, 12.0, 91.0 };
    double[] goodScores = { 97.2, 66.7, -91.0, 100.0, 92.0 }; 
    TestScores test = null;
    
    try {
        test = new TestScores(badScores);   
    }
    
    catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    
    try {
        test = new TestScores(goodScores);
    }

    catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    System.out.println("Good scores " + "\n\tThe average of the good scores is " + test.getAverage());

    }
}
