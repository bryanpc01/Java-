package assignments;

public class BoxBryan {
	private int L1,W1,H1,Weight;

	//Constructor #1 - has no parameters and initializes the Box's instance variables to 0.
	public BoxBryan(){
		L1 = 0;
		W1 = 0;
		H1 = 0;
		Weight = 0;
	}
	
	//Constructor #2 - has four integer parameters that initializes the Box object's L,W,H,Weight.
	public BoxBryan(int LENGTH,int WIDTH, int HEIGHT, int WEIGHT){
		L1 = LENGTH;
		W1 = WIDTH;
		H1 = HEIGHT;
		Weight = WEIGHT;
	}
	
	//This class has a method calculateVolume( ) which returns the volume 
	//(formula: L1*W1*H1) of the Box object as a double.
	public double calculateVolume(){
		
		return (double)(this.L1 * this.W1 * this.H1);
	}

	//This class has a method calculateDensity( ) which returns the density 
	//of the Box (formula: weight/volume) as a double, check for divide by 0.
	public double calculateDensity(){
		
		if (this.calculateVolume() == 0){
			System.out.println("\n/*********Hey, I do not know how to divide by zero.*********/");
			System.out.println("/*To calculate density you need a volume not equal to zero.*/\n");
			return Double.NaN;
		}
		else{
			return this.Weight / this.calculateVolume();
		}
	}

	//This class contains a main( ) method which creates an instance of the 
	//Box object with L1=10, W1=5, H1=5, Weight=2600 and computes the Box's 
	//Volume and Density, then outputs the results to the user's screen.
	public static void main(String[] args) {
		BoxBryan Box1 = new BoxBryan(10,5,5,2600);
		
		System.out.println("This is the volume of Box1: " + Box1.calculateVolume());
		System.out.println("This is the density of Box1: " + Box1.calculateDensity());
	}
	

}
