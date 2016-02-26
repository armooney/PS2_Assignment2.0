package base;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;
	}
		
	public int getiValue() {
			return iValue;
		}
//000000000000000000000000000000000000000000000000000000000000000000	
//methods
	
	public boolean isPrime(){
		for(int i=2; i<getiValue();i++){
			if(getiValue()%i==0)
				return false;
		}
			return true;
	}
//------------------------------------------------------------------		
	
	public boolean isEven(){
		if (getiValue()%2==0)
			return true;
		else 
			return false;
	}
//------------------------------------------------------------------
	public boolean isOdd(){
		if(getiValue()%2==0)
			return false;
		else
			return true;
	}
//000000000000000000000000000000000000000000000000000000000000000000
//static methods int
		
		public static boolean isPrime(int x){
			
			for(int i=2; i<x;i++){
				if(x%i==0)
					return false;
			}
			return true;
		}
	//------------------------------------------------------------------		
		
		public static boolean isEven(int y){
			if (y%2==0)
				return true;
			else 
				return false;
		}
	//------------------------------------------------------------------
		public static boolean isOdd (int z){
			if(z%2==0)
				return false;
			else
				return true;	
		}
//00000000000000000000000000000000000000000000000000000000000000000
//static methods MyInteger		
		public static boolean isPrime(MyInteger x){
			
			for(int i=2; i < (x.getiValue());i++){
				if((x.getiValue())%i==0)
					return false;
			}
			return true;
		}
	//------------------------------------------------------------------		
		
		public static boolean isEven(MyInteger y){
			if ((y.getiValue())%2==0)
				return true;
			else 
				return false;
		}
	//------------------------------------------------------------------
		public static boolean isOdd(MyInteger z){
			if((z.getiValue())%2==0)
				return false;
			else
				return true;
		}
//00000000000000000000000000000000000000000000000000000000000000000		
		
		public boolean equals(int intValue ){
			return getiValue() == intValue;
		}
//----------------------------------------------------------------		
		public boolean equals(MyInteger myInt){
			return equals(myInt.getiValue());
		}
			
//0000000000000000000000000000000000000000000000000000000000000000		
}
	


