/*
 * Version kobayashi 2010/11/12

public class HelloWorld3 {
	public static void main(final String[] koba) {
    	int i = 0;
		String keisuke;
		for (; i<koba.length; ++i) {
			System.out.println(koba[i]);
			keisuke=sub(koba[i]);
			System.out.println(keisuke);
       }
   }
   public static String sub(String yashi) {
       yashi = yashi + "!";
       System.out.println(yashi);
       yashi = yashi + "!";
       return yashi;
   }
}

 */

public class HelloWorld3 {

	public static void main(final String[] koba) {

		String keisuke;


		// �����̐��ƈ����̒l��\������
		System.out.println("koba.length = " + koba.length);
		System.out.println("koba[0]     = " + koba[0]);
		System.out.println("koba[1]     = " + koba[1]);
//		System.out.println("koba[2]     = " + koba[2]);�@�@//�G���[�B�����̐����͈͊O����A�Ɨ�O�ɂȂ�B


		for (int i=0; i<koba.length; i++) {
			System.out.println(koba[i]);
			keisuke=sub(koba[i]);          // sub() �̎��s
			System.out.println(keisuke);
		}
	}

	public static String sub(String yashi) {
		yashi = yashi + "!";
		System.out.println(yashi);
		yashi = yashi + "!";
		return yashi;
	}
}

