class IncTest {

	public static final void main(String args[]) {
		int a;
		int b;

		// 後でインクリメント
		a=5;
		b=a++;
		System.out.println("b=a++ : " + b);   // bの値を画面に出力


		// 前でインクリメント
		a=5;
		b=++a;
		System.out.println("b=++a : " + b);   // bの値を画面に出力

	}

}