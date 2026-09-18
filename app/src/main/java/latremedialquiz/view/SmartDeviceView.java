package latremedialquiz.view;

import java.util.List;
import java.util.Scanner;

import latremedialquiz.model.SmartDevices;
import latremedialquiz.util.ScannerUtil;

public class SmartDeviceView {
    public int showMainMenu(Scanner scn) {
        System.out.println("Menu");
        System.out.println("1. Tambah Perangkat");
        System.out.println("2. Print semua perangkat");
        return ScannerUtil.inputInt("Pilih: ", scn);
    }

    public int showCategoryMenu(Scanner scn) {
        System.out.println("Jenis Perangkat");
        return ScannerUtil.inputInt("1. Smart TV \n 2. Smart Speaker \n 3. Smart Door Lock \n Pilih: ", scn);
    }

    public void displayDevices(List<SmartDevices> perangkat) {
        System.out.println("Output Perangkat");
        for (SmartDevices device : perangkat) {
            System.out.println(device.getDeviceDetails());
        }
    }
}