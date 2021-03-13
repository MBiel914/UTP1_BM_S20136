/**
 *
 *  @author Bielecki Michał S20136
 *
 */

package zad1;
import java.util.*;

public class ListCreator<T> {
	public static <T> List<T> collectFrom(List<T> list) {
		return list;
	}
	public ListCreator<T> when(Selector<T> sel) {
		return this;
		
	}
	public ListCreator<T> mapEvery(Mapper<T> map) {
		return this;
		
	}
}  
