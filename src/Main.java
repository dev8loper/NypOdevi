public class Main {
    public static void main(String[] args) {
        System.out.println(MyUtils.ucgenCevre(5,12,13));
        System.out.println(MyUtils.ucgenAlan(12,8,6));
        System.out.println(MyUtils.cokgenCevre(6,6,6,6,6,6));
        System.out.println(MyUtils.cokgenAlan(6,6,6,6,6,6));

        int[] dizi = new int[200];
        for (int i = 0,  j = -99; 100 > j; j++, i++) {
            dizi[i] = j;
        }

        double[] sonuc = MyUtils.islemA(dizi);
        for (double x: sonuc) {
            System.out.println(x);
        }
    }
}
