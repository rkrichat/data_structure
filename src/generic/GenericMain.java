package generic;

/**
 * This Class for show how generic working
 * 
 * @author rkritchat
 * @since Apr 1, 2017
 */
public class GenericMain {
	public static void main(String[] args) {
		GenericClass<String> stringItem = new GenericClass<String>();
		stringItem.setItem("Hello");
		showMessage("Generic Integer : ", stringItem);

		GenericClass<Integer> intItem = new GenericClass<Integer>();
		intItem.setItem(20);
		intItem.setItem(intItem.getItem() + 90);
		showMessage("Generic Integer : ", intItem);
	}

	/**
	 * This method for showMessage
	 * 
	 * @param description
	 * @param item
	 */
	@SuppressWarnings("rawtypes")
	private static void showMessage(String description, GenericClass item) {
		System.out.println(description + item.getItem());
	}
}
