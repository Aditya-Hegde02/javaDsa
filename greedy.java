package javaDSA;

import java.util.Arrays;

public class greedy {
	static int minCoins(int[] coins,int amount) {
		int n=coins.length;
		Arrays.sort(coins);
		int res=0;
		for(int i=n-1;i>=0;i--) {
			if(amount>=coins[i]) {
				int cnt=(amount/coins[i]);
				res+=cnt;
				amount-=(cnt*coins[i]);
			}
			if(amount==0)
				break;
		}
		return res;
	}
	public static void main(String[] args) {
		int[] coins= {5,2,10,1};
		int amount=39;
		System.out.println(minCoins(coins,amount));
	}

}
