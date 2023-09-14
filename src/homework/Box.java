package homework;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    private ArrayList<T> fructs;

    public Box(ArrayList<T> fructs) {
        this.fructs = fructs;
    }

    public void addFruit(T fruct) {
        this.fructs.add(fruct);
    }

    public float getWeight() {
        return (fructs.isEmpty() ? 0 : fructs.size() * fructs.get(0).getWeight());
    }

    public boolean compare(Box box) {
        return (box.getWeight() == this.getWeight());
    }

    public void moveBox(Box<T> box) {
        System.out.printf("Фрукты пересыпаны из %s в %s]\n", this, box);

        while (!this.fructs.isEmpty()) {
            box.addFruit(this.fructs.remove(0));
        }
    }

    @Override
    public String toString() {
        return String.format("%s, В коробке находятся фрукты: %d, вес: %.2f кг.",
                fructs.get(0).getName(), fructs.size(), this.getWeight());
    }
}
