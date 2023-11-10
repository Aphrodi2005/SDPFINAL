import java.util.Observable;

// Observer Pattern
class Order extends Observable {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        setChanged();
        notifyObservers(status);
    }
}
