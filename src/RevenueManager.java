import java.util.ArrayList;
import java.util.HashMap;

public class RevenueManager {
	
	HashMap<String, ArrayList<Integer>> revenue = new HashMap<>();
	
	
	public RevenueManager(HashMap<String, ArrayList<Integer>> revenue){
		this.revenue = revenue;
	}
	
	public int getClassTotal() {
		int classTotalRevenue = 0;
		for(ArrayList<Integer> bakeSaleRevenues : revenue.values()) {
			for(int i=0; i<bakeSaleRevenues.size(); i++) {
				classTotalRevenue = classTotalRevenue + bakeSaleRevenues.get(i);
			}
		}

		return classTotalRevenue;
	}

	public String getTopFundraiser() {
		String topFundraiser = "";
		int bestFunds=0;
		int currentFunds = 0;
		for(String name : revenue.keySet()) {
			currentFunds=0;
			for(int i=0; i<revenue.get(name).size(); i++) {
				currentFunds = currentFunds + revenue.get(name).get(i);
				System.out.println("currentFunds is/from: "+currentFunds+ name);
			}
			if(bestFunds<currentFunds) {
				bestFunds = currentFunds;
				System.out.println("bestFunds: "+bestFunds);
			}
			if(bestFunds>=currentFunds && !(currentFunds ==0)) {
				topFundraiser = name;
				System.out.println("top fundraiser: "+ topFundraiser);
				currentFunds = 0;
			}
		}
		return topFundraiser;
	}
}
