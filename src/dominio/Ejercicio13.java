package dominio;

public class Ejercicio13 {
    public static double fibonacci12(int n){
        if(n<2){
            return 0;
        }else{
            return fibonacci12(n-1)+fibonacci12(n-2);
        }
    }
    public static double fibonacci13(int n){
        if(n<2){
            return 0;
        }else{
            return fibonacci13(n-1)+fibonacci13(n-2);
        }
    }
    public static boolean equals(double numero){
        if(fibonacci13(13)/fibonacci12(12)==numero){
            return  true;
        }else{
            return false;
        }
    }
}
