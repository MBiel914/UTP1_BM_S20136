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
    Selector<Integer, Integer> sel = new Selector<Integer, Integer>() {
    	@Override
    	public List<Integer> Select(List<Integer> list){
    		List<Integer> result = new ArrayList<>();
    		for(int item : list)
    			if (item < 10)
    				result.add(item);
    		return result;
    	}
    };
    
    Mapper<Integer, Integer> map = new Mapper<Integer, Integer>() {
    	@Override
    	public List<Integer> Map(List<Integer> list){
    		List<Integer> result = new ArrayList<>();
    		for(int item : list)
    				result.add(item + 10);
    		return result;
    	}
    };
    return ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }

  public List<Integer> test2(List<String> src) {
	  Selector<Integer, String> sel = new Selector<Integer, String>() {
	    	@Override
	    	public List<String> Select(List<String> list){
	    		List<String> result = new ArrayList<>();
	    		for(String item : list)
	    			if (item.length() > 3)
	    				result.add(item);
	    		return result;
	    	}
	    };
	    
	    Mapper<Integer, String> map = new Mapper<Integer, String>() {
	    	@Override
	    	public List<Integer> Map(List<String> list){
	    		List<Integer> result = new ArrayList<>();
	    		for(String item : list)
	    				result.add(item.length() + 10);
	    		return result;
	    	}
	    };
	    return ListCreator.collectFrom(src).when(sel).mapEvery(map);
  }
  
  public static void main(String[] args) {
    new Main();
  }
}
