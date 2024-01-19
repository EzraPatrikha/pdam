/**
 * Teks_Delay
 */
public class Teks_Delay {

    public static void main(String[] args) throws InterruptedException {
        String text = "Eggi ganteng mwah <3";

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(200);  // Penundaan 200 milidetik (0,2 detik) antara karakter
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}