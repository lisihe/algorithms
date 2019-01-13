import edu.princeton.cs.algs4.*;

class RedirectTest {
    public static void main(String[] args) {
        // 读取传入的文件名中的整数
        int[] arr = In.readInts(args[0]);
        for(int i: arr) {
            System.out.println(i);
        }
    }
}