package com.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Ibm {
    public static void main(String[] args) {
        Library<String> lib = new Library<String>();
        List<String> str = new ArrayList<>();
        List<String> str1 = new ArrayList<>();
        str.add("1");str.add("2");str.add("3");str.add("4");
        str1.add("3");str1.add("4");str1.add("5");str1.add("6");
        lib.union(str, str1);

        System.out.println(lib.union(str, str1));
        System.out.println(lib.intersection(str, str1));
        System.out.println(lib.subtract(str, str1));
    }

    static class Library<T> {
        public List<T> union(List<T> t1, List<T> t2){
            Set<T> set = new HashSet<>();
            set.addAll(t1);
            set.addAll(t2);

            return new ArrayList<>(set);
        }

        public List<T> intersection(List<T> t1, List<T> t2){
            List<T> intersect = t1.stream().filter(t2::contains).collect(Collectors.toList());
            return !intersect.isEmpty()? intersect :
            Collections.emptyList();
        }

        public List<T> subtract(List<T> t1, List<T> t2){
            return t1.stream()
                    .filter(e -> !t2.contains(e))
                    .collect(Collectors.toList());
        }
    }
}
