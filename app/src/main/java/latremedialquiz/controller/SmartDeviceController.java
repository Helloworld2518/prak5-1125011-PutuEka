package latremedialquiz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import latremedialquiz.model.SmartDevices;
import latremedialquiz.model.SmartDoorLock;
import latremedialquiz.model.SmartSpeaker;
import latremedialquiz.model.SmartTv;
import latremedialquiz.model.connectionType;
import latremedialquiz.util.ScannerUtil;
import latremedialquiz.view.SmartDeviceView;

public class SmartDeviceController {
    public void start() {
        Scanner scn = new Scanner(System.in);
        List<SmartDevices> perangkat = new ArrayList<>();
        SmartDeviceView view = new SmartDeviceView();

        int chooise = 0;

        while (chooise <= 2) {
            chooise = view.showMainMenu(scn);

            if (chooise == 1) {
                int kategori = view.showCategoryMenu(scn);

                if (kategori == 1) {
                    String id = ScannerUtil.inputString("ID: ", scn);
                    String nama = ScannerUtil.inputString("Nama: ", scn);
                    int daya = ScannerUtil.inputInt("Daya: ", scn);
                    int channel = ScannerUtil.inputInt("Channel: ", scn);
                    int volume = ScannerUtil.inputInt("Volume: ", scn);

                    int Koneksi = ScannerUtil.inputInt("Koneksi\n 1. WiFi\n 2. Blueetooth", scn);

                    connectionType connection = connectionType.None;
                    if (Koneksi == 1) {
                        connection = connectionType.WIFI;
                    } else {
                        connection = connectionType.Blueetooth;
                    }
                    SmartTv tv = new SmartTv(id, nama, daya, channel, volume, connection);

                    perangkat.add(tv);
                    System.out.println("Smart Tv Telah Ditambah");
                } else if (kategori == 2) {
                    String id = ScannerUtil.inputString("ID: ", scn);
                    String nama = ScannerUtil.inputString("Nama: ", scn);
                    int daya = ScannerUtil.inputInt("Daya: ", scn);
                    int volume = ScannerUtil.inputInt("Volume: ", scn);
                    int Koneksi = ScannerUtil.inputInt("Koneksi\n 1. WiFi\n 2. Blueetooth", scn);

                    connectionType connection = connectionType.None;
                    if (Koneksi == 1) {
                        connection = connectionType.WIFI;
                    } else {
                        connection = connectionType.Blueetooth;
                    }

                    SmartSpeaker speaker = new SmartSpeaker(id, nama, daya, volume, connection);
                    perangkat.add(speaker);
                    System.out.println("Speaker berhasil ditambah");
                } else if (kategori == 3) {
                    String id = ScannerUtil.inputString("ID: ", scn);
                    String nama = ScannerUtil.inputString("Nama: ", scn);
                    int daya = ScannerUtil.inputInt("Daya: ", scn);
                    String pin = ScannerUtil.inputString("Pin: ", scn);

                    SmartDoorLock door = new SmartDoorLock(id, nama, daya, pin);
                    perangkat.add(door);

                    System.out.println("Smart door berhasil ditambah");
                } else {
                    System.out.println("Tidak Valid!");
                }
            } else if (chooise == 2) {
                view.displayDevices(perangkat);
            } else {
                System.out.println("Balik Ke Menu");
            }
        }
    }
}