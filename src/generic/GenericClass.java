package generic;

/**
 * This class for use generic
 * 
 * @author rkritchat
 * @since Apr 1, 2017
 * @param <T>
 */
public class GenericClass<T> {
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	private T item;
}
