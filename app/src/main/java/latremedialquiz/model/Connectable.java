package latremedialquiz.model;

public interface Connectable {
    void connect(connectionType type);
    void disconnect();
}
