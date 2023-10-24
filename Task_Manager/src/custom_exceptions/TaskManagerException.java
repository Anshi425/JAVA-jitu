package custom_exceptions;

@SuppressWarnings("serial")
public class TaskManagerException extends Exception {

	public TaskManagerException(String mesg){
		super(mesg);
	}
}
