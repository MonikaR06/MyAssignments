package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		int length=arr.length;
		System.out.println("Length of array:"+length);
		int n=arr.length+1;
		System.out.println("Actual array length:"+n);
		int totalsum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<=length-1;i++) {
			sum=sum+arr[i];
			
		}
		int missNum=totalsum-sum;
		System.out.println(missNum+" is missing element");

	}

}
