class IncTest {

	public static final void main(String args[]) {
		int a;
		int b;

		// ��ŃC���N�������g
		a=5;
		b=a++;
		System.out.println("b=a++ : " + b);   // b�̒l����ʂɏo��


		// �O�ŃC���N�������g
		a=5;
		b=++a;
		System.out.println("b=++a : " + b);   // b�̒l����ʂɏo��

	}

}