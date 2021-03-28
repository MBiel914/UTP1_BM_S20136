package zad2;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListCreator<T> {
	private List<T> _list;
	
	public static <T> ListCreator<T> collectFrom(List<T> list) {
		ListCreator<T> listCreator = new ListCreator<>();
		listCreator._list = list;
		return listCreator;
	}
	public ListCreator<T> when(Predicate<T> predicat) {
		this._list = _list.stream().filter(predicat).collect(Collectors.<T>toList());
		return this;
	}
	public List<T> mapEvery(Function<T, T> func) {
		this._list = _list.stream().map(func).collect(Collectors.toList());
		return _list;
	}
}  
