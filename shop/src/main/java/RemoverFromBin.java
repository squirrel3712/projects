package main.java;

public class RemoverFromBin {
    public  void removeDevicesFromBin(Bin bin, int number) {
        if (!bin.getListOfDevices().isEmpty()) {
            bin.getListOfDevices().remove(number);
        }
    }
}
