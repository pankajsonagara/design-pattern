package com.ciena.learn.dp.chap1.intro;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
