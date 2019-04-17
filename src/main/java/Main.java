public class Main {


    public int reverseNumb( int num){

        String numbString = String.valueOf(num);

        char[] stringDigit = numbString.toCharArray();
        String mirrornumb = "";

        for( int i = stringDigit.length-1; i>=0; i--  ){
            mirrornumb = mirrornumb + stringDigit[i]   ;
        }

        return Integer.valueOf( mirrornumb );

    }




}
