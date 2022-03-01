package practising;

public class Operators {

	public static void main(String[] args) {
		Arithmatic obj = new Arithmatic(20,3);
		//System.out.println("The quo:"+obj.quotient());
		//System.out.println("The Remains:"+obj.reminder());
		//System.out.println("The Addition:"+obj.addition());
		//System.out.println("The Divv:"+obj.divition());
		//System.out.println("The Diff:"+obj.difference());
	obj.increment();
	}
	
}

class Arithmatic{
	int a,b;
	
	Arithmatic(int x, int y){
		
	
	a=x;
	b=y;
}
double addition() {
	return a+b;
}
double divition() {
	double divition =(double)a/b; // type casting 
	return divition;
}
double difference() {
	return a-b;
}
double product() {
	return a*b;
}
double quotient() {
	return a/b;
}
double reminder() {
	return a%b;
	
}
void increment() {
	int postInc , preInc;
	
	postInc = a++;
	preInc = ++a;
	
	System.out.println("Post Increment:" + postInc);
	System.out.println("Pre Increment:"+ preInc);
	
}
}




