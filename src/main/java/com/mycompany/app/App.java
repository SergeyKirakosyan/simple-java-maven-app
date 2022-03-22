package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
        return message;
        return message;
    }
public void testSignSHA256CompleteEvenHeight2() {
    ....
    int height = 10;
    ....
    for (int i = 0; i < (1 << height); i++) {
        byte[] signature = xmss.sign(new byte[1024]);
        switch (i) {
            case 0x005b:
                assertEquals(signatures[0], Hex.toHexString(signature));
                break;
            case 0x0822:
                assertEquals(signatures[1], Hex.toHexString(signature));
                break;
            ....
        }
    }
}
    
}
