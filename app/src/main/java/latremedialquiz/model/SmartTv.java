package latremedialquiz.model;

public class SmartTv extends SmartDevices implements Switchable, Connectable {
    int channel;
    int volume;
    connectionType connection;

    public SmartTv(String id, String nama, int daya, int channel, int volume, connectionType connection) {
        super(id, nama, daya);
        this.volume = volume;
        this.connection = connection;
    }

    int getChannel() { return channel; }
    int getVolume() { return volume; }
    public connectionType getConnection() { return connection; }

    @Override
    public void turnOn() { setStatus("Menyala"); }

    @Override
    public void turnOff() { setStatus("Mati"); }

    @Override
    public void connect(connectionType koneksi) {
        System.out.println("Koneksi: " + koneksi);
    }

    @Override
    public void disconnect() {
        System.out.println("smart tv bverhasil terputus.");
    }

    @Override
    public String getDeviceDetails() {
        return "Smart TV [" + getNama() + "]"
                + " *ID: " + getId()  + " - Daya: " + getDaya() + "W" + " |Status: " + getStatus() + " | Koneksi: "
                + connection + " | Channel: " + channel + " | Volume:" + volume;
    }
}