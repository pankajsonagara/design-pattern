package com.ciena.learn.dp.chap1.intro;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly.");
	}

}
