
public class PythagTriplets {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int flag_var =0;
		for(int c=5; c<1000; c++){
			for(int b=c-1; b>0; b--){
				for(int a=b-1; a>0; a--){
					if(Math.pow(a, 2)+ Math.pow(b, 2)== Math.pow(c, 2)){
						System.out.println("the numbers are " + a + " " + b+ " " + c);
						if(a+b+c==1000){
							flag_var = 1;
							System.out.println("the wanted numbers are " + a + " " + b+ " " + c);
							long prod = a*b*c;
							System.out.println("the product is " + prod);
							break;
						}
					}
				}
				if(flag_var ==1){
					break;
				}
			}
			if(flag_var ==1){
				break;
			}
		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
