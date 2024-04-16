package com.yarihanov_khasan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(4, 5, 6, 6, 8));
        Set<Integer> uniqueArray = new HashSet<>();
        AtomicBoolean isDuplicate = new AtomicBoolean(false);

        array.forEach(e -> {
            if (!uniqueArray.add(e)) {
                isDuplicate.set(true);
            }
        });

        System.out.println(isDuplicate);
    }
}