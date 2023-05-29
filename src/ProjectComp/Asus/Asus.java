package ProjectComp.Asus;

import ProjectComp.Computer.Notebook;

public class Asus extends Notebook {
    protected Asus (String name) {
        super(name);
    }

    @Override
    public void connect() {
        print("Я - Асус");
    }
}
