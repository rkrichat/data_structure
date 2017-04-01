package generic;

/**
 * This Class for show how generic working
 * 
 * @author rkritchat
 * @since Apr 1, 2017
 */
public class GenericMain {
	public static void main(String[] args) {
		GenericClass<String> stringItem = new GenericClass<String>("Hello");
		showMessage("Generic Integer : ", stringItem);

		GenericClass<Integer> intItem = new GenericClass<Integer>(20);
		intItem.setItem(intItem.getItem() + 90);
		showMessage("Generic Integer : ", intItem);
	}

	/**
	 * This method for showMessage
	 * @param <T>
	 * 
	 * @param description
	 * @param item
	 */
	private static <T> void showMessage(String description, GenericClass<T> item) {
		System.out.println(description + item.getItem());
	}
}
