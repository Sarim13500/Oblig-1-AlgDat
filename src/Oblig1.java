public class Oblig1 {

    public static int maks(int[] a){

        int forelopig = 0;
        int maks=0;


        for(int i=0; i < a.length; i++){
            for(int k=1; k < a.length; k++){
                if(a[k-1] > a[k]){
                    forelopig = a[k-1];
                    a[k-1] = a[k];
                    a[k] = forelopig;
                }
            }
            if (a[i]>maks){
                maks=a[i];
            }

        }
        return maks;
    }

    public static void main(String[] args) {
        int[] a ={2,7,8,0,5,3,6,1};

        for (int i =0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        maks(a);
        for (int i =0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println(maks(a));
    }
}
