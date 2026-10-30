public class Exercise5 {
    public static void main(String[] args) {
     Switchboard centralita = new Switchboard(100);
     centralita.registerCall(new Llamadas("555-435679", "463-567429",30,1,true));
        centralita.registerCall(new Llamadas("555-435679", "463-567429",30,5,true));
        centralita.registerCall(new Llamadas("555-435679", "463-567429",50,2,false));
        centralita.registerCall(new Llamadas("555-435679", "463-567429",70,3,true));
        centralita.registerCall(new Llamadas("555-435679", "463-567429",67,4,false));


        System.out.println("nro total llamadas " + centralita.getNumCalls());
        System.out.println("el coste total es " + centralita.getTotalcost());

    }
}
