import java.util.Scanner;

public class Hilo extends Thread{

    Scanner sc = new Scanner(System.in);
    Metronomo m = new Metronomo();
    int bpm;

    @Override
    public void run() {
        Inicio();
    }

    public void Inicio () {
        System.out.println("Cuantos BPM deseas?");
        bpm = sc.nextInt();
        m.segundero(bpm);
    }


}
