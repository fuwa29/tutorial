/*
 * RateRelayMain�N���X�̃e�X�g�@�i�������Ċm�F�j
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
		MSG_E_NOT_ENOUGH = "����������Ȃ��݂����ł���A�������m�F���Ă�����s���ĂˁB";
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
	 * ���C���N���X
	 */
	public static void main( String [] args ) throws Exception {
		if (args == null || args.length < 2 ) {
			throw new IllegalArgumentException( MSG_E_NOT_ENOUGH );
		}

		System.out.println("���C���N���X���s���܂�");

		// �T�[�r�X�I�y���[�V�����敪�i�������ϊ��j
		final String operation = args[1].toLowerCase();

		/****************************************************
		 * �T�[�r�X�I�y���[�V�����敪�ɂ�菈����U�蕪����
		 ****************************************************/
		if ( OP_START.equals( operation ) ) {
			// �T�[�r�X�J�n
			System.out.println("�T�[�r�X�J�n�B");
			System.out.println("��Ԗڂ̈����́i���̂܂܁j�F�@" + args[1]);
			System.out.println("��Ԗڂ̈����́i�ϊ���́j�F�@" + operation);
		}
		else if ( OP_STOP.equals( operation ) ) {
			// �T�[�r�X��~
			System.out.println("�T�[�r�X��~�B");
			System.out.println("��Ԗڂ̈����́i���̂܂܁j�F�@" + args[1]);
			System.out.println("��Ԗڂ̈����́i�ϊ���́j�F�@" + operation);
		}
		else if ( OP_TEST.equals( operation ) ) {
			// �e�X�g���[�h
			System.out.println("�e�X�g���[�h�B");
			System.out.println("��Ԗڂ̈����́i���̂܂܁j�F�@" + args[1]);
			System.out.println("��Ԗڂ̈����́i�ϊ���́j�F�@" + operation);
		}
		else {
			// �z��O�P�[�X�i�G���[�����ցj
			System.out.println("�z��O�ł��B");
			System.out.println("��Ԗڂ̈����́i���̂܂܁j�F�@" + args[1]);
			System.out.println("��Ԗڂ̈����́i�ϊ���́j�F�@" + operation);
		}
	}

}
