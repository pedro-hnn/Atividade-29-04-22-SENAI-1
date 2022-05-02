import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Funcoes {

    public static void Ler5Numeros(int n1, int n2, int n3, int n4, int n5){
        Integer[] lista = {n1,n2,n3,n4,n5};

        for(Integer i : lista){
            System.out.println(i);
        }
    }

    public static Double EnviaMedia(Double n1, Double n2, Double n3, Double n4){
        Double nota = n1 + n2 + n3 + n4;

        Double media = nota / 4;
        return media;
    }

    public static List<Integer> RetornaPares(Integer[] lista){
        List<Integer> retorno = new ArrayList<>();
        int index = 0;
        for(Integer i : lista){
            if(i % 2 == 0){
                retorno.add(i);
            }
        }
        return retorno;
    }

    public static List<Integer> RetornaImpares(Integer[] lista){
        List<Integer> retorno = new ArrayList<>();
        int index = 0;
        for(Integer i : lista){
            if(i % 2 != 0){
                retorno.add(i);
            }
        }
        return retorno;
    }
}
