public class Metronomo {

    int s = 0;
    int resul;

    public void segundero (int bpm) {

        try {
            for ( int i = 1; i <= bpm; i++ ){;

                resul = 60000 / bpm;
                System.out.println(i);
                Thread.sleep(resul);

            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
