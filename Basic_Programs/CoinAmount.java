package Basic_Programs;

public class CoinAmount  {
	    public static int minCoinsForAmount(int amount) {
	        int[] denominations = {5, 2};
	        int maxCoins = 5;
	        int remainingAmount = amount;
	        int totalCoins = 0;
	        for (int coin : denominations) {
	            if (remainingAmount <= 0) {
	                break;
	            }
	            int numCoins = Math.min(remainingAmount / coin, maxCoins);
	            remainingAmount -= numCoins * coin;
	            totalCoins += numCoins;
	        }
//	       if (remainingAmount > 0) {
//	            return -1;
//	        }
//	        
	      return totalCoins;
	    }
	    
	    public static void main(String[] args) {
	        int amount = 18;
	        int result = minCoinsForAmount(amount);
	        System.out.println("Minimum number of coins required for " + amount + " is: " + result);
	    }
	}


