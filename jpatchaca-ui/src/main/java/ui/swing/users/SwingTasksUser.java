package ui.swing.users;

import tasks.tasks.TaskView;
import basic.UserOperationCancelledException;

public interface SwingTasksUser {

	boolean isTaskExclusionConfirmed();

	boolean isPeriodExclusionConfirmed();

	TaskView getPeriodMovingTarget();

	String getTextForNote() throws UserOperationCancelledException;
}
