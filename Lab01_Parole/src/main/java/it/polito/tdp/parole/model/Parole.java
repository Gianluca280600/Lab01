package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole {
	
	public List<String> l=new ArrayList<String>();
		
	public Parole() {
	}
	
	public void addParola(String p) {
		l.add(p);
	}
	
	public void remParola(String p) {
		l.remove(p);
		
	}
	
	public List<String> getElenco() {
		return l;
	}
	
	public void reset() {
		l.clear();
	}

}
