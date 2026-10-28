public class Llamadas {
    private String origen;
    private String destino;
    private int duración;
    private int banda;
    private boolean local;

    public Llamadas(String origen, String destino, int duración, int banda, boolean local) {
        this.origen = origen;
        this.destino = destino;
        this.duración = duración;
        this.banda = banda;
        this.local = local;
    }

    @Override
    public String toString() {
        String tipo;
        if (local) {
            tipo = "local";
        } else {
            tipo = "provincial";

        }
        return "Origen" + origen + "Destino" + destino +
                "Duración" + duración + "Banda" + banda +
                "tipo" + tipo;
    }

    public int getcost() {

        if (local) {
            return duración * 15;
        } else {
            if (banda == 1) {
                return duración * 20;
            } else {
                if (banda == 2) {
                    return duración * 25;
                } else {

                    return duración * 30;
                }
            }
        }
    }

}


