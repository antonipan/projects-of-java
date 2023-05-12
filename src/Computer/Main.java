package Computer;

public class Main {

    public static void main(String[] args) {

        Computer comp = new Computer();
        comp.setRam(33);
        comp.setName("Vendetta");
        Computer comp2 = new Computer();
        System.out.println(comp2.getName());
        comp2.on();
        comp2.load();
        comp2.off();
        System.out.println(comp.getHdd());

    }
}
