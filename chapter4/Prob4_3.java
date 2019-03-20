/**
Java言語プログラミングレッスン上巻
p102 演習問題4-3
last updated@2019/03/20 20:56
*/

import java.io.*;

public class Prob4_3{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			System.out.println("現在の時間を24時間表記で入力してください");
			String line = reader.readLine();
			int n = Integer.parseInt(line);

			if(n<0 || n>23){
				System.out.println("0~23の間で入力してください");
			}else if(n>=0 && n<12){
				System.out.println("おはようございます");
			}else if(n == 12){
				System.out.println("お昼です");
			}else if(n>12 && n<19){
				System.out.println("こにゃにゃちわー");
			}else if(n>=19 && n<24){
				System.out.println("こんばんは");
			}else System.out.println("Error!");
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("入力された数字の形式が正しくありません");
		}
	}
}
