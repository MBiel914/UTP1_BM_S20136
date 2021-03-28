/**
 *
 *  @author Bielecki Michał S20136
 *
 */

package zad1;

import java.util.List;
import java.util.Set;

public interface Mapper<T, U> {
	public List<T> Map(List<U> list);
}  
