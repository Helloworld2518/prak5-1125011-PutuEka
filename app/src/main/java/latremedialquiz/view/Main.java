package latremedialquiz.view;

import latremedialquiz.controller.SmartDeviceController;

public class Main {
    public static void start() {
        SmartDeviceController controller = new SmartDeviceController();
        controller.start();
    }
}
