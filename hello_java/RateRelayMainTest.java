/*
 * RateRelayMainクラスのテスト　（抜粋して確認）
 */

public class RateRelayMainTest {

	// message
	private static final String MSG_E_NOT_ENOUGH;
	private static final String MSG_E_ILLEGAL_OP;
	private static final String MSG_I_START;
	private static final String MSG_I_STOP;
	private static final String MSG_I_TEST;
	private static final String MSG_I_TEST_RELAY;

	// initialize message
	static {
		MSG_E_NOT_ENOUGH = "引数がたりないみたいですよ、もう一回確認してから実行してね。";
		MSG_E_ILLEGAL_OP = "bb";
		MSG_I_START      = "cc";
		MSG_I_STOP       = "dd";
		MSG_I_TEST       = "ee";
		MSG_I_TEST_RELAY = "ff";
	}

	// service category
	private static final String OP_START = "start";
	private static final String OP_STOP  = "stop";
	private static final String OP_TEST  = "test";


	/*
	 * メインクラス
	 */
	public static void main( String [] args ) throws Exception {
		if (args == null || args.length < 2 ) {
			throw new IllegalArgumentException( MSG_E_NOT_ENOUGH );
		}

		System.out.println("メインクラス実行します");

		// サービスオペレーション区分（小文字変換）
		final String operation = args[1].toLowerCase();

		/****************************************************
		 * サービスオペレーション区分により処理を振り分ける
		 ****************************************************/
		if ( OP_START.equals( operation ) ) {
			// サービス開始
			System.out.println("サービス開始。");
			System.out.println("二番目の引数は（そのまま）：　" + args[1]);
			System.out.println("二番目の引数は（変換後は）：　" + operation);
		}
		else if ( OP_STOP.equals( operation ) ) {
			// サービス停止
			System.out.println("サービス停止。");
			System.out.println("二番目の引数は（そのまま）：　" + args[1]);
			System.out.println("二番目の引数は（変換後は）：　" + operation);
		}
		else if ( OP_TEST.equals( operation ) ) {
			// テストモード
			System.out.println("テストモード。");
			System.out.println("二番目の引数は（そのまま）：　" + args[1]);
			System.out.println("二番目の引数は（変換後は）：　" + operation);
		}
		else {
			// 想定外ケース（エラー処理へ）
			System.out.println("想定外です。");
			System.out.println("二番目の引数は（そのまま）：　" + args[1]);
			System.out.println("二番目の引数は（変換後は）：　" + operation);
		}
	}

}
