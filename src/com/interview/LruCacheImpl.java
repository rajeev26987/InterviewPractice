package com.interview;

import java.util.*;

public class LruCacheImpl {
    public static void main(String[] args) {
        LruCache cache = new LruCache(5);
        cache.access(1); // 1
        cache.access(2); // 2, 1
        cache.access(3); // 3, 2, 1
        cache.access(4); // 4, 3, 2, 1
        cache.access(5); // 5, 4, 3, 2, 1
        cache.access(6); // 6, 5, 4, 3, 2,
        cache.access(3); // 3, 6, 5, 4, 2
        cache.display();
    }

    static class LruCache{
        Deque<Integer> list;
        Set<Integer> set;
        int cache_size;

        public LruCache(int cache_size) {
            this.list = new LinkedList();
            this.set = new HashSet<>();
            this.cache_size = cache_size;
        }

        void access(int data){
            if(!set.contains(data) && list.size() == cache_size){
                int last = list.removeLast();
                set.remove(last);
            } else{
                list.remove(data);
            }

            list.push(data);
            set.add(data);
        }

        void display(){
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }

    }
}
