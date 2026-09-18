package latremedialquiz.model;

public class SmartDoorLock extends SmartDevices implements Lockable {
    String pin;

    public SmartDoorLock(String id, String nama, int daya, String pin) {
        super(id, nama, daya);
        this.pin = pin;
        setStatus("Locked");
    }

    public String getPin() {
        return pin;
    }

    @Override
    public void lock() {
        setStatus("Locked");
    }

    @Override
    public void unlock() {
        setStatus("Open");
    }

    @Override 
    public String getDeviceDetails() {
        return "Smart Door Lock :" + getNama() + ""
                + " ID: " + getId() + " - Daya: " + getDaya() + " w" + " | Status:  " + getStatus()
                + " | PIN: **************";
    }
}
