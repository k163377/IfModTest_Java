public class Main {
    public static int MAX = 1000000000;

    public static int If(){
        int i = 0;
        int j = 0;

        long start = System.nanoTime();
        while(i < MAX) {
            if((j+=1) == 100) j = 0;
            i++;
        }
        long end = System.nanoTime();

        System.out.println("If  Time:" + (end - start) / 1000000f + "ms");

        return i + j;
    }

    public static int Mod(){
        int i = 0;
        int j = 0;

        long start = System.nanoTime();
        while(i < MAX){
            j = (j+1)%100;
            i++;
        }
        long end = System.nanoTime();

        System.out.println("Mod Time:" + (end - start) / 1000000f + "ms");

        return i + j;
    }

    public static void main(String[] args) {
        int Ifres = If();
        int Modres = Mod();

        System.out.println("If :" + Ifres + "\nMod:" + Modres);
    }
}
