
public class EulerSum {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// TODO Auto-generated method stub
		/*double sum_sq=0;
		double fin_sum=0;
		for(int i=0; i<=10; i++){
			sum_sq += Math.pow(i, 2);
			System.out.println(sum_sq);
			fin_sum +=i;
		}
		
		fin_sum = Math.pow(fin_sum, 2);
		int dif = (int) (fin_sum-sum_sq);
		System.out.println(dif);
		System.out.println(fin_sum);
		System.out.println(sum_sq);*/
		
		int sum=0;
		for(int i=0; i<=100; i++){
			sum += Math.pow(i, 2)*(i-1);
		}
		System.out.println(sum);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		

	}

}
