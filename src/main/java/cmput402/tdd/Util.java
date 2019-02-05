package cmput402.tdd;

import java.util.ArrayList;
import java.util.HashMap;

import cmput402.tdd.service.Search;

public class Util {

	public HashMap<String, Float>  countAverageScore(Search search){
		
		HashMap<String, Float> results= new HashMap<String, Float>();
		HashMap<String, ArrayList<Integer>> list = search.returnAll();
		
		for(String name : list.keySet()) {
			
			float avg = (float) list.get(name).get(1)/list.get(name).get(0);
			results.put(name, avg);
		}
		
		return results;
	}
	
public HashMap<String, Integer>  findTopScorer(Search search){
		
		return null;
	}
	
}
