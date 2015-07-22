package com.invisi.snake;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TrdDAO {
	
	List<Kot> koty;
	
	public TrdDAO() {
		koty = new ArrayList<Kot>();
	}
	
	public void add(Kot newCat) {
		koty.add(newCat);
	}
	
	public String[] getAll() {
		String[] catNames = new String[koty.size()];
		
		for(int i = 0 ; i < catNames.length; i++) {
			catNames[i] = koty.get(i).name;
		}
		
		return catNames;
	}
	
	public String[] showDetails(String catName) {
		String[] details = new String[3];
		
		int i = 0;
		for(i=0; i< koty.size(); i++) {
			if(catName.equals(koty.get(i).name)) break;
		}
		
		details[0] = koty.get(i).name;
		details[1] = koty.get(i).age;
		details[2] = koty.get(i).evilness;
		
		return details;
	}
}
