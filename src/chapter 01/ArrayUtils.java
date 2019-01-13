/**
常用的数组操作 */
class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 1, 7, 0, 4, 4, 6};
        int max = max(arr);
        System.out.printf("The max num is %d\n", max);
        double average = average(arr);
        System.out.printf("The average is %.1f\n", average);
        int[] copy = copy(arr);
        System.out.println("The copy of arr:");
        for(int i: copy) {
            System.out.printf("%d ", i);
        }
        reverse(arr);
        System.out.println("\nThe reverse of arr:");
        for(int i: arr) {
            System.out.printf("%d ", i);
        }
     
        //-----测试矩阵相乘
        int[][] a = {{1, 1}, {2, 0}};
        int[][] b = {{0, 2, 3}, {1, 1, 2}};
        // 矩阵a与矩阵b相乘
        int[][] r = ride(a, b);
        System.out.println("\nThe result of a ride b is:");
        for(int[] line: r) {
            for(int e: line) {
                System.out.printf("%-4d", e);
            }
            System.out.println();
        }
    }

    // 找出数组中的最大元素
    public static int max(int[] a) {
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            max = a[i] > max ? a[i] : max;
        }
        return max;
    }

    // 计算数组元素的平均值
    public static double average(int[] a) {
        int L = a.length;
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / L;
    }

    // 复制数组
    public static int[] copy(int[] a) {
        int L = a.length;
        int b[] = new int[L];
        for(int i = 0; i < L; i++) {
            b[i] = a[i];
        }
        return b;
    }

    // 颠倒数组元素的顺序
    public static void reverse(int[] a) {
        int L = a.length;
        for(int i = 0; i < L / 2; i++) {
            int temp = a[i];
            a[i] = a[L - 1 - i];
            a[L - 1 - i] = temp;
        }
    }

    // 矩阵相乘
    public static int[][] ride(int[][] a, int[][] b) {
        // 确定阶数
        int aM = a.length; // a的行数
        int aN = a[0].length; // a的列数
        int bM = b.length;  // b的行数
        int bN = b[0].length; // b的列数
        if(aN != bM) {
            return null; // 内标不同，不能相乘。
        }
        int[][] r = new int[aM][bN];
        for(int i = 0; i < aM; i++) {
            for(int j = 0; j < bN; j++) {
                int temp = 0;
                for(int k = 0; k < aN; k++) {
                    temp += (a[i][k] * b[k][j]);
                }
                r[i][j] = temp;
            }
        }
        return r;
    }
}