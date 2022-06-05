class Fibonacci {
/** under 50 */
    public static void main(String[] args){
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        while (hi < 50) {
            System.out.println(hi);
            hi = lo + hi;  // new hi
            lo = hi - lo;   // new lo = old hi
        }
    }
}
