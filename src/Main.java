public class Main {
    public static void main(String[] args) {

        Clovek zaci[] = new Clovek[10];
        zaci[0] = new Clovek("Jan" , 15);
        zaci[1] = new Clovek("Pepa" , 16);
        zaci[2] = new Clovek("Adam" , 17);
        zaci[3] = new Clovek("Nikola" , 18);
        zaci[4] = new Clovek("Krystof" , 18);
        zaci[5] = new Clovek("Silva" , 15);
        zaci[6] = new Clovek("Terka" , 15);
        zaci[7] = new Clovek("Ursula" , 22);
        zaci[8] = new Clovek("Adriana" , 14);
        zaci[9] = new Clovek("Adrian" , 14);

        for (int i = 0; i < zaci.length; i++) {
            for (int j = i+1; j < zaci.length; j++) {
                if(zaci[i].name.compareTo(zaci[j].name) > 0){
                    String x = zaci[i].name;
                    zaci[i].name = zaci[j].name;
                    zaci[j].name = x;

                    int y = zaci[i].vek;
                    zaci[i].vek = zaci[j].vek;
                    zaci[j].vek = y;
                }
            }
        }
        System.out.println("Sorted by name: ");
        for (int i = 0; i < zaci.length; i++) {
            System.out.print(zaci[i].name);
            System.out.print(" - ");
            System.out.print(zaci[i].vek);
            System.out.println(" ");
        }

        for (int i = 0; i < zaci.length; i++) {
            for (int j = i+1; j < zaci.length; j++) {
                if(zaci[i].vek > zaci[j].vek){
                    int y = zaci[i].vek;
                    zaci[i].vek = zaci[j].vek;
                    zaci[j].vek = y;

                    String x = zaci[i].name;
                    zaci[i].name = zaci[j].name;
                    zaci[j].name = x;
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted by age: ");
        for (int i = 0; i < zaci.length; i++) {
            System.out.print(zaci[i].name);
            System.out.print(" - ");
            System.out.print(zaci[i].vek);
            System.out.println("");
        }
    }
}