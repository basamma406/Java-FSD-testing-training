package Day7;
import java.util.Scanner;

public class After1 {

	public static void main(String[] args) {
		int v=1;
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("enter the number of integers");
	
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
					System.out.println("print duplicate values");
					for(  int i=0;i<10;i++){
						for(int j=i+1;j<10;j++) {
							if (arr[i]==arr[j]) {
								if( v==1 && arr[j]!='0') {
									System.out.println(""+arr[i]);
								}
								arr[j]='0';
								v++;
							}
						}
						v=1;
					}
			}
		}
			


	


