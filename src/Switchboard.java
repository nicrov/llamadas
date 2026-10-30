public class Switchboard {
    private Llamadas[] llamadas;
    private int numCalls;

    public Switchboard(int maxNumCalls) {
        llamadas = new Llamadas[maxNumCalls];
        for (int i = 0; i < llamadas.length; i++) {


            llamadas[i] = null;
        }
    }

    public void registerCall(Llamadas llamada) {
        llamadas[numCalls] = llamada;
        numCalls++;

    }

    public int getNumCalls() {
        return numCalls;
    }

    public int getTotalcost() {
        int totalcost = 0;
        for (int i = 0; i < numCalls; i++) {
            totalcost = totalcost + llamadas[i].getcost();
        }
        return totalcost;
    }
}







