public class TestBank {
    public static void main(String[] args) {
	Bank bank = new BIDV();
	double interest = bank.getRateOfInterest();
	System.out.println("Ti le lai suat la: " + interest + " %");
    }
}