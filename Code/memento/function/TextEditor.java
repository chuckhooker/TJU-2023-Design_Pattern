package memento.function;

public class TextEditor {
	
	private String state = "";

    public void write(String text) {
        state += text;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

}
