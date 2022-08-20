public class Operators {
    public static void main(String[] args){
        int div_int = 15;

        System.out.println("Initial value: " + div_int);
        System.out.println("div_int / 2 = " + (div_int / 2));
        System.out.println("div_int = " + div_int);
        System.out.println();


        System.out.println("PREINCREMENT BY ONE");
        int pre_inc = 5;

        System.out.println("Initial value: " + pre_inc);
        System.out.println("++pre_inc   = " + (++pre_inc));
        System.out.println("pre_inc = " + pre_inc);
        System.out.println();

        System.out.println("PREDECREMENT BY ONE");
        int pre_dec = 5;

        System.out.println("Initial value: " + pre_dec);
        int answer1;
        answer1 = --pre_dec;
        System.out.println("--pre_dec   = " + answer1);
        answer1 = pre_dec;
        System.out.println("pre_dec = " + answer1);
        System.out.println();


        System.out.println("POST INCREMENT BY ONE");
        int post_inc = 5;

        System.out.println("Initial value: " + post_inc);
        System.out.println("post_inc++   = " + (post_inc++));
        System.out.println("post_inc = " + post_inc);
        System.out.println();
        int x = 2;
        int temp;
        // switch case
        switch (x) {
            case 1:
                temp = 1;
                break;
                // execute multiple conditions
            case 2:
            case 3:
            case 4:
                temp = 2;
                break;
            default:
                temp = 3;
                break;
        }

    }
}
