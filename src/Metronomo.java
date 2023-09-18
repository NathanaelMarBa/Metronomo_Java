public class Metronomo {

    int i;
    int resul;
Imprimir imp = new Imprimir();
    public void segundero (int bpm) {

        try {
            for ( i = 1; i <= bpm; i++ ){;

                resul = 60000 / bpm;
                imp.Imprimir(i);
                Thread.sleep(resul);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
