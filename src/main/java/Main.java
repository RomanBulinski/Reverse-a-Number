public class Main {


    public int reverseNumb( int num){

        if( num > 0 ){
            String mirrornumb = getString(num);
            return Integer.valueOf( mirrornumb );

        }else{
            num = num * -1;
            String mirrornumb = getString(num);
            return Integer.valueOf( "-"+mirrornumb );
        }

    }

    private String getString(int num) {
        String numbString = String.valueOf(num);
        char[] stringDigit = numbString.toCharArray();
        String mirrornumb = "";
        for (int i = stringDigit.length - 1; i >= 0; i--) {
            mirrornumb = mirrornumb + stringDigit[i];
        }
        return mirrornumb;
    }


}
