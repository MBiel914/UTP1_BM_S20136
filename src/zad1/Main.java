/**
 *
 *  @author Bielecki Michał S20136
 *
 */

package zad1;
 
import java.util.*;

public class Main {
  public Main() {
    List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);/*<-- tu dopisać inicjację elementów listy */
    System.out.println(test1(src1));

    List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv" );/*<-- tu dopisać inicjację elementów listy */
    System.out.println(test2(src2));
  }

  public List<Integer> test1(List<Integer> src) {
    Selector<List<Integer>> sel;
    Mapper<List<Integer>> map;
    return ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }

public List<Integer> test2(List<String> src) {
	Selector<List<String>> sel;
    Mapper<List<String>> map;
    return  ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }

  public static void main(String[] args) {
    new Main();
  }
}
