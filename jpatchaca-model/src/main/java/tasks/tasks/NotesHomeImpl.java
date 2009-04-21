package tasks.tasks;

import basic.SystemClock;

public class NotesHomeImpl implements NotesHome {

	private final SystemClock clock;

	public NotesHomeImpl(final SystemClock clock) {
		this.clock = clock;
	}

	public NoteView createNote(final String text) {
		return new NoteImpl(clock.getDate(), text);
	}

}
