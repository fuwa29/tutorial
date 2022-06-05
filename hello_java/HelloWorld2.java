class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        // オブジェクトをnewで生成しないと使えないメソッド
        HelloTest var = new HelloTest();
        var.testprint_no_static();

        HelloTest.testprint_no_static();

        // オブジェクトを生成しなくても利用可能
        HelloTest.testprint_static();
    }
}

class HelloTest {

    // static なし
    public void testprint_no_static() {
        System.out.println("+-+-+- Hello World!! in HelloTest !!!  method no-static.");
    }

    // static 付き
    public static void testprint_static() {
        System.out.println("****** Hello World!! in HelloTest !!!  method static. ");
    }
}

