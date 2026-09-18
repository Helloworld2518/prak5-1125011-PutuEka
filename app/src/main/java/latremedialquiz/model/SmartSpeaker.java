package latremedialquiz.model;

public class SmartSpeaker extends SmartDevices implements Connectable, Switchable {
    int volume;
    connectionType connection;

    public SmartSpeaker(String id, String nama, int daya, int volume, connectionType connection) {
        super(id, nama, daya);
        this.volume = volume;
        this.connection = connection;
    }

    public int getVolume() {
        return volume;
    }

    public connectionType getConnection() {
        return connection;
    }

    @Override
    public void turnOn() {
        setStatus("Menyala");
    }

    @Override
    public void turnOff() {
        setStatus("Mati");
    }

    @Override
    public void connect(connectionType koneksi) {
        System.out.println("koneksi: " + koneksi);
    }

    @Override
    public void disconnect() {
        System.out.println("Smart Speaker Terputus");
    }

    @Override
    public String getDeviceDetails() {
        return "Smart Speaker [" + getNama() + "]"
                + " ID: " + getId() + " - Daya: " + getDaya() + "w" + " | Status: " + getStatus()
                + " | Koneksi : " + connection + " | Volume : " + volume;
    }
}