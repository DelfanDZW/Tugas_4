package LCD;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String[] cableOptions = {"VGA", "DVI", "HDMI", "DisplayPort"};
    private int cableIndex;

    public LCD() {
        status = "Off";
        volume = 0;
        brightness = 0;
        cableIndex = 0;
    }
    // Digunakan untuk mengubah status jadi on
    public void turnOn() {
        status = "On";
    }
    // Digunakan untuk mengubah status jadi on
    public void turnOff() {
        status = "Off";
    }
    // untuk mengubah status menjadi "Freeze", mengatur volume ke 51, brightness ke 38, dan memilih kabel HDMI.
    public void Freeze() {
        status = "Freeze";
    }

    public void setVolume(int vol) {
        volume = vol;
    }
    // dalam program utama untuk menaikkan volume
    public void volumeUp() {
        volume ++;
    }
    // untuk mengatur tingkat kecerahan layar LCD.
    public void setBrightness(int level) {
        brightness = level;
    }

    public void brightnessDown() {
        brightness --;
    }

    public void setCable(int option) {
        if (option >= 0 && option < cableOptions.length) {
            cableIndex = option;
        }
    }
    // Untuk mengeluarkan hasil atau output
    public void displayMessage() {
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume); // Ubah pesan menjadi "Volume: "
        System.out.println("Brightness: " + brightness); // Ubah pesan menjadi "Brightness: "
        System.out.println("Cable: " + cableOptions[cableIndex]); // Ubah pesan menjadi "Cable: "
    }
}
