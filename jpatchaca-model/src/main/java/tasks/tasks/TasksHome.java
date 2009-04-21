package tasks.tasks;

import periods.Period;
import tasks.TasksListener;
import core.ObjectIdentity;
import events.persistence.MustBeCalledInsideATransaction;

public interface TasksHome extends TasksHomeView {

	void createTask(ObjectIdentity identity, String taskName, Double budget)
			throws MustBeCalledInsideATransaction;

	void remove(TaskView task) throws MustBeCalledInsideATransaction;

	void editTask(ObjectIdentity identity, String newName, Double newBudget)
			throws MustBeCalledInsideATransaction;

	// refactor consider moving these methods to periods system
	void addPeriodToTask(ObjectIdentity taskId, Period period)
			throws MustBeCalledInsideATransaction;

	void removePeriodFromTask(TaskView task, Period period)
			throws MustBeCalledInsideATransaction;

	void transferPeriod(ObjectIdentity selectedTask, int selectedPeriod,
			ObjectIdentity targetTask) throws MustBeCalledInsideATransaction;

	void addNoteToTask(ObjectIdentity idOfTask, NoteView note)
			throws MustBeCalledInsideATransaction;

	void stop(ObjectIdentity taskId) throws MustBeCalledInsideATransaction;

	void addTasksListener(TasksListener tasksListener);

}
