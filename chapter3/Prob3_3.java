import java.io.*;

public class Prob3_3{
	public static void main(String[] args){
	int i;	
	char c;

	System.out.println("文字列を入力してください");
	BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	
		try{
			String line_str = reader.readLine();
			int length_forloop = line_str.length();
			
			for(i=0;i<length_forloop;i++){
				c = line_str.charAt(i);
				System.out.println("\'"+c+"\'の文字コードは "+ (int)c +" です");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
