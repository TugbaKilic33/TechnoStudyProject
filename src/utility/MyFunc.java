package utility;

import technoStudy.base.BaseDriver;

public class MyFunc {
    public static BaseDriver driver;

    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
