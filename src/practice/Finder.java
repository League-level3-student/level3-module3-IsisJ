package practice;

import java.util.ArrayList;

public class Finder {


	public int lastIndexOf(ArrayList<String> list, String searchKey) {
		int lastIndexOf=-1;
		String inputAtSpecifiedIndex;
		String searchKeyAllLowerCase = searchKey.toLowerCase();
		for(int i = 0; i< list.size(); i++) {
			inputAtSpecifiedIndex = list.get(i).toLowerCase();
			if(inputAtSpecifiedIndex.equals(searchKeyAllLowerCase)) {
				lastIndexOf = i;
			}
			
		}
		
		return lastIndexOf;
	}






}