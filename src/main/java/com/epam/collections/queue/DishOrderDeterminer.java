package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> dishQueue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishQueue.add(i);
        }

        int i = 1;
        while (!dishQueue.isEmpty()) {
            if (i == everyDishNumberToEat) {
                result.add(dishQueue.pollFirst());
                i = 1;
            } else {
                Integer element = dishQueue.pollFirst();
                dishQueue.addLast(element);
                i++;
            }
        }
        return result;
    }
}
