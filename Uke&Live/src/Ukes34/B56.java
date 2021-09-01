package Ukes34;

public class B56 {

    //Metoden skal sortere arrayet og ta ut
    public static int[] minmax(int[] a){
        int min = A123.min(a);
        int max = A123.max(a);
        int[] minmaxTabell = {min, max};
        return minmaxTabell;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        int[] minMaxTabell = minmax(array);
        System.out.println(minMaxTabell);
    }
}
