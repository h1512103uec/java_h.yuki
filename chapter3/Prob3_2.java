import java.io.*;

public class Prob3_2{
	public static void main(String[] args){

		int age_1,age_2;
		String name_1,name_2;
		
//一人目の名前と年齢入力
		System.out.println("一人目の名前を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			name_1 = reader.readLine();
			System.out.println(name_1+"さんの年齢を入力してください");
			String line_str = reader.readLine();
			age_1 = Integer.parseInt(line_str);
//二人目の名前と年齢入力
			System.out.println("次の方の名前を入力してください");
			name_2 = reader.readLine();	
			System.out.println(name_2+"さんの年齢を入力してください");
			line_str = reader.readLine();
			age_2 = Integer.parseInt(line_str);

//年齢の平均計算部分
			System.out.println(name_1 + "さんと" + name_2 + "さんの年齢の平均は" + (double)(age_1+age_2)/2+"歳です");
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
