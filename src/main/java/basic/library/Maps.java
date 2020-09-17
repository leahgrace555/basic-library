package basic.library;

import java.util.HashSet;

public class Maps {
    public String weatherReport(int[][] weatherData){
        HashSet<Integer> uniqueTemps = new HashSet<>();

        for(int i = 0; i<weatherData.length;i++){
            for(int j = 0 ; j< weatherData[i].length;j++){
                uniqueTemps.add(weatherData[i][j]);
            }
        }
        int lowTemp = 10000;
        int highTemp = -100000;
        for(Integer bananaTemp: uniqueTemps) {
           if( bananaTemp < lowTemp ) {
               lowTemp=bananaTemp;
           }
           if (bananaTemp > highTemp) {
               highTemp = bananaTemp;
           }
            System.out.println(bananaTemp);
        }

        System.out.println(highTemp);
        System.out.println(lowTemp);
        String returnString = "High: " + highTemp + "\nLow: " + lowTemp;

        for (int k = lowTemp; k < highTemp; k++) {
            if(!uniqueTemps.contains(k)) {
                returnString = returnString + "\nNever saw temperature: " + k;
            }
        }
        return returnString;
    }
}
