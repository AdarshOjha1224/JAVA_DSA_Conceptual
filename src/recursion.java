public class recursion {

    public static int fact(int x){
        if(x!=0) return x * fact(--x);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
