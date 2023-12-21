package Lesson7;

public class Device {
    private String DeviceId;
    private String DeviceName;
    private double price;

    public Device(String DeviceId, String DeviceName, double price) {
        this.DeviceId = DeviceId;
        this.DeviceName = DeviceName;
        this.price = price;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
