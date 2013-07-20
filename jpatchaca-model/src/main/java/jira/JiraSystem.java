package jira;

import periods.Period;
import tasks.TaskView;

public interface JiraSystem {

	void addWorklog(TaskView task, Period period, String comment);
	boolean canSendWorklogTo(TaskView task, Period period);

}
