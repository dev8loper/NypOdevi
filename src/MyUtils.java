public class MyUtils {
    public static float ucgenCevre(float a,float b, float c) {
        return a+b+c;
    }

    /*
    Bir üçgenin alan formülü: sqrt(u * (u - a) * (u - b) * (u - c))
    u: Çevre / 2 => (a + b + c) / 2
     */
    public static float ucgenAlan(float a,float b, float c) {
        float u = MyUtils.ucgenCevre(a,b,c) / 2;
        return (float) Math.sqrt(u * (u - a) * (u - b) * (u-c));
    }

    public static float cokgenCevre(float ... kenar) {
        float toplam = 0;
        for (float i: kenar) {
            toplam += i;
        }
        return toplam;
    }

    /*
    Bir çokgenin alan formülü: 1/4 * n * a^2 * cot(PI/n)
    n: kenar sayısı
    a: kenarlar
     */
    public static float cokgenAlan(float ... kenar) {
        float n = kenar.length;
        float a = kenar[0];
        return (float) (0.25 * ( n * (float)Math.pow(a, 2) * (1/Math.tan(Math.PI/n)) ));
    }

    /*
    Aşağıda ki fonksiyonlar sırasıyla uygulandı
    1: f(x) = 3 * x^2  - 2*e^x + sqrt(x)
    üstte ki fonksiyonun çıktısı diğer fonk. için girdi olddu
    2: f(x) = 1 / (1 + e^x)
     */
    public static double[] islemA(int dizi[]) {
        double cikti[] = new double[dizi.length];
        int i = 0;
        for (double x: dizi) {
            x = 3 * Math.pow(x, 2) - 2 * Math.pow(Math.E, x) + Math.sqrt(x);
            cikti[i] = 1 / (1 + Math.pow(Math.E, x));
            i++;
        }
        return cikti;
    }
}
