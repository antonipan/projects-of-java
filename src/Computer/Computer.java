package Computer;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;

    // beehive
    public void on () {
        System.out.println("I turned on. My model: " + name);
    }
    public void load () {
        System.out.println("I load up. My amount of memory.: " + ram);
    }
    public void off () {
        System.out.println("I switched off. " + name);
    }
    // getters
    public String getName () {
        return this.name;
    }
    public int getRam () {
        return this.ram;
    }
    public int getHdd () {
        return this.hdd;
    }
    // setters
    public void setName (String newName) {
        this.name = newName;
    }
    public void setRam (int newRam) {
        if (newRam > 0) {
            this.ram = newRam;
        } else {
            System.out.println("This volume " + newRam + ". is not available.");
        }
    }
    public void setHdd (int newHdd) {
        this.hdd = newHdd;
    }
    public void setWeight(double newWeigt) {
        this.weight = newWeigt;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", weight=" + weight +
                '}';
    }



}
