package com.lion;

public class Lion {
	
	String name;
	boolean isHungry;
	int age;
	
	static int totalDeaths;
	
	static void printKillings() {
		
		System.out.println("Total killings by lions in jungle = " + totalDeaths);
	}
	
	void thinking() {
		if (isHungry==false) {
		System.out.println(name +" is sleeping");
		}
		
		if(isHungry && age > 12) {
			totalDeaths=totalDeaths+2;
			System.out.println(name +" has eaten two animal");
		}
		if(isHungry && age<=12 && age>=2) {
			totalDeaths=totalDeaths+1;
			System.out.println(name+" has eaten one animal");
			
		}
		if(isHungry && age<2) {
			System.out.println(name + " is calling mom");
		}
	}

	public static void main(String[] args) {
	  
		Lion lion1=new Lion();
		Lion lion2=new Lion();
		Lion lion3=new Lion();
		
		lion1.isHungry=true;
		lion1.age=13;
		lion1.totalDeaths=2;
		lion1.name="lion 1";
		lion1.thinking();
		
		
		 printKillings();
		
		    lion2.isHungry=true;
			lion2.age=13;
			lion2.totalDeaths=1;
			lion2.name="lion 2";
			lion2.thinking();
		
			
			lion3.name="lion 3";
			lion3.isHungry=false;
			lion3.thinking();
			
			printKillings();

	}

}
