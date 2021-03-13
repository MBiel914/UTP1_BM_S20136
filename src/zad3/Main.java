/**
 *
 *  @author Bielecki Michał S20136
 *
 */

package zad3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    // Lista destynacji: port_wylotu port_przylotu cena_EUR 
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );
    double ratePLNvsEUR = 4.30;
    List<String> result = dest.stream()
    		.filter(line -> line.split(" ")[0].equals("WAW"))
    		.map(line -> "to " + line.split(" ")[1] + " - price in PLN:	"
    					+ String.format("%.0f", Double.parseDouble(line.split(" ")[2]) * ratePLNvsEUR))
    		.collect(Collectors.toList());

    for (String r : result) System.out.println(r);
  }
}
