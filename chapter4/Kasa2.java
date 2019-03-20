/**
java言語プログラミングレッスン　上巻
p90　演習問題List4-2
*/

import java.io.*;

public class Kasa2 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			System.out.println("降水確率を入力してください");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			if(n<0 || n>100){
				System.out.println("降水確率は0~100の間で入力してください");
			}else if(n>=50){
				System.out.println("傘を忘れずにね");
			}else{
				System.out.println("傘はいりません");
			}
			System.out.println("いってらっしゃい");
		} catch (IOException e){
				System.out.println(e);
		} catch (NumberFormatException e){
				System.out.println("数字の形式が正しくありません");
		}
	}
}
	
