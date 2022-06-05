class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        // �I�u�W�F�N�g��new�Ő������Ȃ��Ǝg���Ȃ����\�b�h
        HelloTest var = new HelloTest();
        var.testprint_no_static();

        //HelloTest.testprint_no_static();

        // �I�u�W�F�N�g�𐶐����Ȃ��Ă����p�\
        HelloTest.testprint_static();
    }
}

class HelloTest {

    // static �Ȃ�
    public void testprint_no_static() {
        System.out.println("+-+-+- Hello World!! in HelloTest !!!  method no-static.");
    }

    // static �t��
    public static void testprint_static() {
        System.out.println("****** Hello World!! in HelloTest !!!  method static. ");
    }
}

