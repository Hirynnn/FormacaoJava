package comparoTOo;

import java.util.ArrayList;
import java.util.List;

public class Temperatura {

    public static void main(String[] args) {

        List<Double> temperaturaMeses = new ArrayList<>();

        temperaturaMeses.add(3.4);
        temperaturaMeses.add(7.4);
        temperaturaMeses.add(32d);
        temperaturaMeses.add(43.5);
        temperaturaMeses.add(-5.4);
        temperaturaMeses.add(22.3);

        System.out.println(temperaturaMeses);
        Double total = 0d;
        for(Double i:temperaturaMeses){
            total+=i;

        }
        Double media = total/temperaturaMeses.size();

        System.out.println("Media: "+media);
        List maiorMedia= new ArrayList<>();

        for (Double i: temperaturaMeses){
            if (i>=media){

                maiorMedia.add(i);
            }
        }

        System.out.println("Maior ou igual a media"+maiorMedia);

    }
}
