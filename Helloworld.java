public class Helloworld {
	/* public 全てのクラスからアクセスできる宣言
	 * class クラスであることを宣言
	 * Helloworld クラスにつけた名前
	 * 波カッコ内でこのクラスのブロック、記述範囲を示す*/
	public static void main(String[] args) {
		/* この一行はメインメソッドの定型文みたいなもの
		 * * static インスタンス化しなくても呼び出せる
		 * void 戻り値を返さない
		 * main メソッドの名前
		 * カッコ内に渡される引数をどういう形で受け取るか記述
		 * 引数はString型の配列argsに収まる*/
		System.out.println("Hello world!!");
		/* Systemクラスのoutフィールドを参照したprintlnにカッコで引数を渡している
		 * 文字列を引数として渡しているのでダブルクォーテーションで囲む
		 * セミコロンで文末を示す*/
	}

}
