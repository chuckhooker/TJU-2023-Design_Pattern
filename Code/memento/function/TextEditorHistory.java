package memento.function;

import java.util.Stack;

public class TextEditorHistory {

	private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void addMemento(Memento memento) {
        undoStack.push(memento);
        redoStack.clear(); 
    }

    public Memento getUndoMemento() {
        if (!undoStack.isEmpty()) {
            Memento memento = undoStack.pop();
            Memento memento1 = undoStack.pop();
            redoStack.push(memento);
            return memento1;
        }
        return null;
    }

    public Memento getRedoMemento() {
        if (!redoStack.isEmpty()) {
            Memento memento = redoStack.pop();
            undoStack.push(memento);
            return memento;
        }
        return null;
    }
}
