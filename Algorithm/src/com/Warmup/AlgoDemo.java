package com.Warmup;

public class AlgoDemo {
	// it contain 50 boxes;
	private int [] theArray= new int[50];
	private int arraysize=10;
	public void generateRandomArray(){
		for(int i=0;i<arraysize;i++){
			theArray[i]= (int) (Math.random()*10+10);//between and 10 and 19
		}
	}
	public void printArray(){
		System.out.println("-------------");
		for (int i = 0; i < arraysize; i++) {
			System.out.print("|"+i+"|");
			System.out.println(theArray[i]+"|");
			System.out.println("-----------");
			
		}
	}
	public int getvalueAtIndex(int index){
		if(index<arraysize)
			return theArray[index];
		return 0;
		
	}
	
	public static void main(String[]k){
		AlgoDemo ad= new AlgoDemo();
		ad.generateRandomArray();
		ad.printArray();
		ad.getvalueAtIndex(8);
	}

}
