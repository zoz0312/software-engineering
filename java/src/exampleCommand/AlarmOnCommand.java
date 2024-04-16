package src.exampleCommand;

public class AlarmOnCommand implements Command {
    private final Alarm theAlarm;

    public AlarmOnCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    public void execute() {
        theAlarm.start();
    }
}
