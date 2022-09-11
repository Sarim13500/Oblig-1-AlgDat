public class Oblig1 {


    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a){


        int maks=0;


        for(int i=0; i < a.length; i++){

            if (a[i]>maks){
                maks=a[i];
            }

        }
        return maks;
    }


    public static int ombyttinger(int[] a) {
        //throw new UnsupportedOperationException();

        int forelopig;


        for(int i=0; i < a.length; i++){
            for(int k=1; k < a.length; k++){
                if(a[k-1] > a[k]){
                    forelopig = a[k-1];
                    a[k-1] = a[k];
                    a[k] = forelopig;
                }
            }
            }
        return 0;
        }




    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        //throw new UnsupportedOperationException();

        int ulike = 1;

        for (int i = 1; i < a.length; i++) {


                if (a[i] != a[i-1]) {
                    ulike = ulike + 1;


            }
        }
        return ulike;
    }




    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }


    public static void main(String[] args) {
        int[]a= {1,2,2,2,3,4,4,5,6,6,7,8,9,9};

        System.out.println(antallUlikeSortert(a));


    }




}

