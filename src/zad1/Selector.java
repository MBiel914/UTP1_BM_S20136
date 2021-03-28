/**
 *
 *  @author Bielecki Michał S20136
 *
 */

package zad1;

import java.util.List;

public interface Selector<T, U> {
	public List Select(List<U> list);
}  
