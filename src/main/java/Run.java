import model.TreeNode;
import tree.LeetCode_107;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class Run {
    public static void main(String[] args)  {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        InputStream reader = classLoader.getResourceAsStream("java.xml");
        byte[] buff=new byte[1024];
        try {
            int n;
            StringBuilder stringBuilder=new StringBuilder();
            while ((n=reader.read())!=-1){
                stringBuilder.append((char)n);
            }
            System.out.println(stringBuilder.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
