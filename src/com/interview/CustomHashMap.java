package com.interview;

import java.util.LinkedList;

public class CustomHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 1);
        hm.put("america", 2);
        System.out.println(hm.get("america"));
    }
    private static class HashMap<K, V>{
        static class Node<K, V>{
            K key;
            V value;

            Node(K k, V val){
                this.key = k;
                this.value = val;
            }
        }
        private LinkedList<Node<K, V>>[] buckets;
        private int size;

        public HashMap(){
            init(4);
            size = 0;
        }

        private void init(int i) {
            buckets = new LinkedList[i];
            for (int j = 0; j < buckets.length; j++) {
                buckets[j] = new LinkedList<>();
            }
        }

        public void put(K key, V value){
            int bucketIndex = hashFn(key);
            int dataIndex = getDataIndexFromBucket(bucketIndex, key);

            if(dataIndex != -1){
                Node eNode = buckets[bucketIndex].get(dataIndex);
                eNode.value = value;
            } else {
                Node<K, V> node = new Node(key, value);
                buckets[bucketIndex].add(node);
                size++;
            }
            double lambda = (size * 1.0) / buckets.length;
            if(lambda > 2.0){
                rehash();
            }
        }

        private void rehash() {
        }

        private int hashFn(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int getDataIndexFromBucket(int bucketIndex, K key) {
            for (int i = 0; i < buckets[bucketIndex].size(); i++) {
                Node node = buckets[bucketIndex].get(i);
                if(node.key.equals(key)){
                    return i;
                }
            }
            return -1;
        }

        public V get(K key){
            int bucketIndex = hashFn(key);
            int dataIndex = getDataIndexFromBucket(bucketIndex, key);

            if(dataIndex != -1){
                Node eNode = buckets[bucketIndex].get(dataIndex);
                return (V) eNode.value;
            } else {
                return null;
            }
        }

        public V remove(K key){
            return null;
        }
    }
}
