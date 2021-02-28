package by.shag.java;

import java.util.PriorityQueue;
import java.util.Queue;

public class VillageShop {
    private Queue<Milk> milkShell = new PriorityQueue<>();
    private Queue<Bread> breadShell = new PriorityQueue<>();

    public Queue<Milk> getMilkShell() {
        return milkShell;
    }

    public Queue<Bread> getBreadShell() {
        return breadShell;
    }

    @Override
    public String toString() {
        return "VillageShop{" +
                "milkShell=" + milkShell +
                ", breadShell=" + breadShell +
                '}';
    }
}
