package top.lazyr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        String currentTime = format.format(System.currentTimeMillis());
        writeFile("/home/k8s/logs/"+currentTime+".log",currentTime+"启动了项目");
    }

    /**
     * 将content写入到指定path的文件中
     * @param path
     * @param content
     */
    public static void writeFile(String path,String content){
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
        FileWriter writer = null;
        boolean succeed = true;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new FileWriter(file,true);
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
            succeed = false;
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("文件"+file.getName()+"写入"+(succeed?"成功":"失败"));
        }
    }
}
