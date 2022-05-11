package clase;

public abstract class TransportHandler {
    TransportHandler nextHandler;

    public void setNextHandler(TransportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void deplaseazaRequest(int distanta);

    public TransportHandler() {
        this.nextHandler = null;
    }
}
