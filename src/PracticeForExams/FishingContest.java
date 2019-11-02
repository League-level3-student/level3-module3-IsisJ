package PracticeForExams;

import java.util.HashMap;

public class FishingContest {

    HashMap<String, double[]> allCatches;


    public  FishingContest(HashMap<String, double[]> allCatches){
       this.allCatches = allCatches;

    }

    public double findBiggestFish(String key){
        double biggestFish = 0;
        for(int i=0; i< allCatches.get(key).length; i++){
            if(allCatches.get(key)[i] > biggestFish){
                biggestFish = allCatches.get(key)[i];
            }
        }
        return biggestFish;
    }




    public String findWinner() {
        String winner = "";
        Double heaviestFish = 0.0;
        for(String name : allCatches.keySet()) {
            if(heaviestFish < findBiggestFish(name)) {
                heaviestFish = findBiggestFish(name);
                winner = name;
            }
        }
        return winner;
    }
}
