package com.group12_1.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree{
	int numApple;
	Apple apple;
	List<Apple> apl = new ArrayList<Apple>();
	Random rnd = new Random();
	
	public Tree() {
		numApple = rnd.nextInt(100)+20;
	}
	
	public int grow(){
		for(int i = 0; i < numApple; i++)
			apl.add(apple = new Apple(rnd.nextInt(10), rnd.nextBoolean()));
		return apl.size();
	}
}