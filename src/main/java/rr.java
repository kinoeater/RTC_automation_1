public class rr {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(127);
        Integer b = Integer.valueOf(127);
        System.out.println(a == b);

        Integer c = Integer.valueOf(128);
        Integer d = Integer.valueOf(128);
        System.out.println(c == d);

        Integer f = Integer.valueOf(1000);
        Integer g = Integer.valueOf(1000);
        System.out.println(f == g);

    }
}
