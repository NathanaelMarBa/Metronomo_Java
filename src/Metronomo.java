public class Metronomo {

    int i;
    int resul;

    public void segundero (int bpm) {

        try {
            for ( i = 1; i <= bpm; i++ ){;

                resul = 60000 / bpm;
                System.out.println(i);
                Thread.sleep(resul);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
