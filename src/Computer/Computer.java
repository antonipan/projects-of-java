package Computer;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public void on () {
        System.out.println("I turned on. My model: " + name);
    }

    public void load () {
        System.out.println("I load up. My amount of memory.: " + ram);
    }

    public void off () {
        System.out.println("I switched off. " + name);
    }

    public String getName () {
        return this.name;
    }

    public void setName (String newname) {
        this.name = newname;
    }

    public int getRam () {
        return this.ram;
    }

    public void setRam (int newRam) {
        if (newRam > 0) {
            this.ram = newRam;
        } else {
            System.out.println("This volume " + newRam + ". is not available.");
        }
    }
}
