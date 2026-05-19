public class recursion {

    public static int fact(int x){
        if(x==1) return 1 ;
        else return x * fact(--x);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
