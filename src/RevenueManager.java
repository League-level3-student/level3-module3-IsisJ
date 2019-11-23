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

		for(String name : revenue.keySet()) {
			int currentFunds = personalTotalFunds(revenue.get(name));
			
			if(bestFunds<currentFunds) {
				bestFunds = currentFunds;
				topFundraiser = name;
				System.out.println("bestFunds: "+bestFunds);
				System.out.println("bestFunds name: "+name);
			}
			
		}
		return topFundraiser;
	}
	
	private int personalTotalFunds( ArrayList <Integer> revenue) {
		
		int currentFunds = 0;
		
		for(int i=0; i<revenue.size(); i++) {
			currentFunds = currentFunds + revenue.get(i);
		}
		
		return currentFunds;
		
	}
	
}
