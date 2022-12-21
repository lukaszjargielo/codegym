package pl.codegym.task.task06.task0604;

/* 
Licznik kotów
*/

public class Kot {
    public static int licznikKotow = 0;

    //tutaj wpisz swój kod
    public Kot() {
        licznikKotow++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        licznikKotow--;
    }

    public static void main(String[] args) {

    }
}