/**
 *
 *  @author Bielecki Michał S20136
 *
 */

package zad1;
import java.util.*;

public class ListCreator<T, U> {
	private List _list;
	
	public static <T, U> ListCreator<T, U> collectFrom(List<U> list) {
		ListCreator<T, U> listCreator = new ListCreator<>();
		listCreator._list = list;
		return listCreator;
	}
	public ListCreator<T, U> when(Selector sel) {
		_list = sel.Select(_list);
		return this;
	}
	public List mapEvery(Mapper map) {
		_list = map.Map(_list);
		return _list;
	}
}  
