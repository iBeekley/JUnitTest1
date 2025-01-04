package com.promineotech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
	    if (a > 0 && b > 0) {
	        return a + b;
	    } else {
	        throw new IllegalArgumentException("Both parameters must be positive!");
	    }
	}
	
	public boolean FastestLapCheck(double curFastest, double newLap) {
		return curFastest > newLap;
	}
	
    int getRandom() {
        Random random = new Random();
        return random.nextInt(10) + 1; //1-10
    }

    public int randomNumberSquared() {
        int random = getRandom(); 
        return random * random;   
    }
}
