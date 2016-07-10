import java.util.ArrayList;

public class LargestProductInSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long startTime = System.currentTimeMillis();
		String large_num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		System.out.println(large_num);
		int prev_index = 1;
		int next_index = 1;
		int count=0;
		int final_prod=1;
		int max_prod = 1;
		ArrayList<Character> num_array = new ArrayList<Character>();
		for (int index = large_num.indexOf('9');
			     index >= 0;
			     index = large_num.indexOf('9', index + 1))
			{
			    //System.out.println(index);
			    num_array.add(0, large_num.charAt(index));
			    count = 1;
			    prev_index = 1;
			    next_index = 1;
			    while(count<4){
			    	/*if(large_num.charAt(index-prev_index)>large_num.charAt(index+next_index)){
			    		num_array.add(0, large_num.charAt(index-prev_index));
			    		prev_index ++;
			    	}else{
			    		num_array.add(num_array.size(), large_num.charAt(index+next_index));
			    		next_index ++;
			    	}*/
			    	
			    	
			    	count ++;
			    }
			    final_prod = 1;
			    for(int j=0; j<num_array.size();j++){
			    	final_prod *=num_array.get(j);
			    }
			    if(max_prod<final_prod){
			    	max_prod = final_prod;
			    	int size_ar = num_array.size();
			    	for(int k=0; k<size_ar; k++){
			    		System.out.print(num_array.get(k));
			    	}
			    	System.out.println("");
			    }
			}
		//long endTime   = System.currentTimeMillis();
		//long totalTime = endTime - startTime;
		//System.out.println(totalTime);

	}

}
