package top.lazyr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        String currentTime = format.format(System.currentTimeMillis());
        System.out.println(currentTime+"执行了该程序");
    }

}
