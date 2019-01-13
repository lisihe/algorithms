class Gcd {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int gcd = gcd(p, q);
        System.out.printf("The gcd of %d and %d is %d", p, q, gcd);
    }
    /**
    计算两个整数数p和q的最大公约数
     */
    public static int gcd(int p, int q) {
        if(q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}