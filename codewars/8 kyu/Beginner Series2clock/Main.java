public class Main {

    public static void main(final String... args) {

    }

    public static int past(int h, int m, int s) {
        return 1000 * ((h != 0 ? h*3600 : 0) + (m != 0 ? m*60 : 0) + (s != 0 ? s : 0));
        //return h * 3600000 + m*60000 + s*1000
    }

}