package jimmy.jcore.utils.timers;


public class SlowTimer extends AbstractTimer {

    public SlowTimer(long interval) {
        super(interval);

        start();
    }

    @Override
    protected void runTask() {
        //check all nodes players are in, if moved into new area, send out area enter and area leave events
    }
}
