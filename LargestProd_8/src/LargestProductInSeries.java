public class LargestProductInSeries {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String large_num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		int len_num = 12;
		long final_prod = 1;
		long max_prod = 1;
		String numnum = "";
		String final_numnum = "";
		for (int index = large_num.indexOf('9');
			     index >= 0;
			     index = large_num.indexOf('9', index + 1))
			{
			    System.out.println(index);
			    int prev_id = len_num;
			    int next_id = 1;
			    for(int j=0; j<len_num+1; j++){
			    	if(index+next_id<large_num.length()){
			    	numnum = large_num.substring(index-prev_id, index+next_id);
			    	final_prod = 1;
			    	prev_id--;
			    	next_id++;
			    	for (int i=0; i<numnum.length(); i++){
			    		int x = Character.getNumericValue(numnum.charAt(i)); // char to int!!!!!
			    		final_prod *= (x);
			    	}
			    	if(final_prod > max_prod){
			    		max_prod = final_prod;
			    		final_numnum = numnum;
			    	}
			    	}else{
			    		System.out.println(index);
			    		break;
			    	}
			    }
			    
			    
			}
		System.out.println(max_prod);
		System.out.println("for the number " + final_numnum);
			    
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}

}
