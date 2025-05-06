public class App {
    static final int MAX = 4;
    public static void main(String[] args) throws Exception {
        String nomi[] = {"Marco", "Claudio", "Giovanni", "Giuseppe"};
        corridore lista[]= new corridore[MAX];

        System.out.println("Pronti partenza ... VIA!!");

        for(int i=0; i<MAX; i++){
            lista[i]= new corridore(nomi[i]);
            lista[i].start();
        }
    }
}
