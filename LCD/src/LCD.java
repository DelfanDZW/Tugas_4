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

    public void turnOn() {
        status = "On";
    }

    public void turnOff() {
        status = "Off";
    }

    public void Freeze() {
        status = "Freeze";
    }

    public void setVolume(int vol) {
        volume = vol;
    }

    public void volumeUp() {
        volume ++;
    }

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

    public void displayMessage() {
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume); // Ubah pesan menjadi "Volume: "
        System.out.println("Brightness: " + brightness); // Ubah pesan menjadi "Brightness: "
        System.out.println("Cable: " + cableOptions[cableIndex]); // Ubah pesan menjadi "Cable: "
    }
}
