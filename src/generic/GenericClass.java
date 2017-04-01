package generic;

/**
 * This class for use generic
 * 
 * @author rkritchat
 * @since Apr 1, 2017
 * @param <T>
 */
public class GenericClass<T> {
	private T item;

	public GenericClass() {
	}

	public GenericClass(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
