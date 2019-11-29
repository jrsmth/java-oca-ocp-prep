package ex03generics;

public class Container<T> {
	private boolean empty = true;
	private T contents = null;

	public T unload() throws Exception {
		if (contents == null) {
			throw new Exception();
		}
		T temp = contents;
		contents = null;
		empty = true;
		return contents;
	}

	public void load(T contents) {
		this.contents = contents;
	}
}

