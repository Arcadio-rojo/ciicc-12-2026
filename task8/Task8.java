public class Task8 {

    public static int processNumbers(int... numbers) {
        int totalSum = 0;
        
        System.out.println("--- Parameter Cumulative Sums ---");
        
        for (int num : numbers) {
            int cumulativeSum = 0;
            StringBuilder expression = new StringBuilder("(");
            
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
                expression.append(i);
                if (i < num) {
                    expression.append("+");
                }
            }
            expression.append(")");
            
            System.out.println("For parameter " + num + " -> " + num + " = " + expression + " = " + cumulativeSum);
            
            totalSum += num;
        }
        
        return totalSum;
    }

    public static void main(String[] args) {
        int overallTotal = processNumbers(4, 5, 10);
        
        System.out.println("\n---------------------------------");
        System.out.println("Total sum of all parameters: " + overallTotal);
    }
}