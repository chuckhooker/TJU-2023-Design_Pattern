package memento;

import memento.function.Memento;
import memento.function.TextEditor;
import memento.function.TextEditorHistory;

public class Main {
	
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        editor.write("Hello ");
        history.addMemento(editor.createMemento());

        editor.write("world ");
        history.addMemento(editor.createMemento());
        
        System.out.println("Current Content: " + editor.getState());

        // Undo
        Memento undoMemento = history.getUndoMemento();
        if (undoMemento != null) {
            editor.restoreFromMemento(undoMemento);
            System.out.println("After Undo: " + editor.getState());
        }

        // Redo
        Memento redoMemento = history.getRedoMemento();
        if (redoMemento != null) {
            editor.restoreFromMemento(redoMemento);
            System.out.println("After Redo: " + editor.getState());
        }
	}

}
