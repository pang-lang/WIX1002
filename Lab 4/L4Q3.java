import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        //Write a program that calculates the minimum, maximum, average and standard deviation (s) of the exam score in a subject. 
        //The program will accepts the score and quit if negative score is enter. 
        
        Scanner input = new Scanner(System.in);   
        int score = 0;
        int count = 0; 
        double sd;
        int sum = 0;
        int min = 0;
        int max = 0;
        int sumSquaredScores = 0;
        
        while (score > 0) {
            System.out.print("Enter a score [negative score to quit]: ");
            score = input.nextInt(); 
            sum +=score;
            count++;
            if (score < 0)
                break;          
            if (score > max)
                score = max;
            if (score < min)
                score = min;
        } 
        
        int average = sum / count;
        int sumSquare = sum*sum;
        sumSquaredScores += Math.pow(score, 2);
        sd = Math.pow((sumSquaredScores - (sumSquare / count))/(count-1),0.5);
                
        System.out.println(sum);
        System.out.println("Minimum score: " + min);
        System.out.println("Maximum score: " + max);
        System.out.println("Average score: " + average);
        System.out.println("Standard deviation: " + sd);
    }
}

/*
        double total = 0;
        double min = 0; // scores cant be negative
        double max = 0;
        Scanner scanner = new Scanner(System.in);
        double score;
        double sumSquaredScores = 0;
        int scoreCount;

        for (scoreCount = 0; ; scoreCount++) {
            System.out.print("Enter a score (Negative score to quit): ");
            score = scanner.nextDouble();
            if (score < 0)
                break;
            if (scoreCount == 0)
                min = score;
            if (score > max)
                max = score;
            if (score < min)
                min = score;
            total += score;
            sumSquaredScores += Math.pow(score, 2);
        }
        scanner.close();
        if (scoreCount == 0) {
            System.out.println("No scores entered!");
            return;
        }

        double standardDeviation = Math.pow((sumSquaredScores - (Math.pow(total, 2) / scoreCount)) / (scoreCount - 1), 0.5);
        System.out.printf("Total: %.2f %n", total);
        System.out.printf("Minimum score: %.2f %n", min);
        System.out.printf("Maximum score: %.2f %n", max);
        System.out.printf("Average score: %.2f %n", total / scoreCount );
        System.out.printf("Standard Deviation: %.2f %n", standardDeviation );

        }
    }
*/


/*
        Scanner k = new Scanner(System.in);
        int num, min=0, max=0, cnt=0, sum=0, sum1=0;
        double average, sd;
        String input;
        System.out.print("Enter a score [negative score to quit]:");
        num = k.nextInt();
        input = k.nextLine();
        if (num<0)
            System.exit(0);
        else {
            cnt++;
            sum+=num;
            sum1+=num*num;
            max = num;
            min = num;
    }
        while (num>0) {
            System.out.print("Enter a score [negative score to quit]:");
            num = k.nextInt();
            input = k.nextLine();
            if (num<0)
                break;
            else {
                cnt++;
                sum+=num;
                sum1+=num*num;
                if (num>max)
                    max = num;
                if (num<min)
                    min = num;
        }
    }
        average = sum / cnt;
        sd = Math.sqrt( (sum1 - sum*sum/cnt)/(cnt-1.0));
        System.out.println((sum1 - sum*sum/cnt)/(cnt-1.0));
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.println("Average score: " + average);
        System.out.printf("Standard deviation: %.2f", sd);
        }
    }
*/


