public class Prob3_1 {
	public static void main(String[] args) {
		int distance , light_velocity=300000;
		int min2sec = 60 , hour2min = 60 , day2hour = 24;
/**
* 初期化の時にlong型は指定しないこと
* long型で指定した数値をint型に変換しようとするためエラーを起こす。
* long型として使用したい時はキャスト指定する際(long)をつけることでlong型として扱える
/
		System.out.println("光が一日に進む距離="+ (long)light_velocity * day2hour * hour2min * min2sec + "キロメートル");
	}
}
