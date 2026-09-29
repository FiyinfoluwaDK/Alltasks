public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0; 

        
        for (int ratePercent = 5; ratePercent <= 10; ratePercent++) {
            double rate = ratePercent / 100.0;

            System.out.println("\n--- Interest Rate: " + ratePercent + "% ---");
            Sy

            
            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
               
            }
        }
    }
}
