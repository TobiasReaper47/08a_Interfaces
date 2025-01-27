package com.cc.java;

import com.cc.java.bees.HoneyBee;

public class Bird extends HoneyBee {

    @Override
    public String doYourJob() {
        // TODO Auto-generated method stub
        return "But I`m a biiiiiird!";
    }

    @Override
    public String fly() {
        // TODO Auto-generated method stub
        return "I can fly at 20mph!";
    }

	public String hasFeathers() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasFeathers'");
	}


}
