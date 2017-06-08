package codingpractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class SumEqualsToNeighbours {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		String firstString = null;
		String nextString=null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for (int n = 1; n<= 5;n++){
				switch(n){
				case 1:a=Integer.parseInt(br.readLine());
				break;
				case 2:b=Integer.parseInt(br.readLine());
				break;
				case 3:firstString=br.readLine();
				break;
				case 4:c=Integer.parseInt(br.readLine());
				break;
				case 5:nextString=br.readLine();
				break;
				}
			}
		} catch (Exception e) {

		}
		StringBuilder sb=new StringBuilder();
		check(sb, getIntArray(firstString));
		printValue(sb);
		sb=new StringBuilder();
		check(sb, getIntArray(nextString));
		printValue(sb);
	}


	private static void printValue(StringBuilder sb) {
		try {    
			  BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
			  String string = sb.length()<=0?"NO":"YES";
			log.write(string+"\n");
			  log.flush();
			}
			catch (Exception e) {
			  e.printStackTrace();
			}
	}


	private static void check(StringBuilder sb, int[] values) {
		int before=0;
		int after=0;
		for(int i=0;i<values.length;i++){
			for(int j=i-1;j>=0;j--){
				before+=values[j];
			}
			for(int k=i+1;k<values.length;k++){
				after+=values[k];
			}
			if(before==after){
				sb.append(values[i]);
			}
			before=0;
			after=0;
		}
	}
	
	
	static int[] getIntArray(String arrays){
		String[] arr=arrays.split(" ");
		int[] intarr=new int[arr.length];

		for(int i=0;i<arr.length;i++){
			intarr[i]=Integer.parseInt(arr[i]);
		}


		return intarr;
	}

}
