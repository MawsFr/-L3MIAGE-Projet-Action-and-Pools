package model.actions;

import model.scheduler.SequentialScheduler;

public class BadAction extends SequentialScheduler {
	// this variable is only used for schedulers (isScheduler = true)
	/**
	 * Either create a foreseeable action or a scheduler based on the value of
	 * <code>timeToEnd</code>.
	 *
	 * @param timeToEnd
	 * For a foreseeable action, indicate the number of
	 * <code>doStep()</code> calls required. For a scheduler, must be
	 * 0.
	 */
	public BadAction(Action... actions) throws ActionFinishedException {
		super(actions);
	}
}