class TurnOffCommand extends Command {
    public TurnOffCommand(Receive r) {
        super(r);
    }

    public void execute() {
        r.turnOff();
    }

    public String toString() {
        return "Turn off Command";
    }
}
