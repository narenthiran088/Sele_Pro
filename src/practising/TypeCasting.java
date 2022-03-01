package practising;

public class TypeCasting {

	public static void main(String[] args) {
		
		 typcstng obj = new typcstng();
		
		obj.display();
		obj.quotient();
	}

}


class typcstng{
	
	int i =100;
	long l =i;
	double d = l;
	
	double dd= 100+122.5;
	long ll = (long)d;
    int ii = (int)l;
    
   void display() {
	   
	   System.out.println("Int \tLong \tDouble");
	   
	   System.out.println(i+ "\t" +l+ "\t" +d);
	   
	   System.out.println(ii +"\t" +ll+ "\t" +dd);
   }
	
	
	void quotient() {
		
		int a=20 ,b= 3;
		
		float quo = (float) a/b;
		
		System.out.println("The quotient:"+quo);
		
		
		
	}
}








