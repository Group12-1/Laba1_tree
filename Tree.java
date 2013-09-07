package com.group12_1.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree {
	int numApple;
	Apple apple;
	Random rnd = new Random();
	
	List<Apple> apl = new ArrayList<Apple>();
	
	public Tree(){
		numApple = rnd.nextInt(100);
	}
	
	public int grow(){
		for(int i = 0; i < numApple; i++){
			apl.add(apple = new Apple(1, rnd.nextInt(), rnd.nextBoolean()));
		}
		return apl.size();
	}  
}
//dfdf