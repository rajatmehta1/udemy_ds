package com.ksl.ds.hashmap;


/*
 * Hashmap is a greate datastructure providing very fast access O(1)
 *
 * LookUps - O(1)
 * Insert - O(1)..though for open adressing it can increase
 * Delete - O(1)
 *
 * worst case...O(n) it behaves like a linked list when all the data is in one single bucket
 *
 * @author Rajat
 */
public class OpenAdressingHashMap {

    private final int DEFAULT_ARR_SIZE = 10;
    private HashVal[] hashValues;

    public OpenAdressingHashMap() {
        this.hashValues = new HashVal[DEFAULT_ARR_SIZE];
    }


    public int getHashCode(Integer key) {
        return key.intValue()%DEFAULT_ARR_SIZE;
    }


    public void put(Integer key, String value) throws Exception {
        int hcode = this.getHashCode(key);
        if(null == hashValues[hcode])
            hashValues[hcode] = new HashVal(key,value);
        else {
            while(hcode < hashValues.length && null != hashValues[hcode]) {
                hcode++;
            }
            if(null == hashValues[hcode])
                hashValues[hcode] = new HashVal(key,value);
            else throw new Exception("HashMap is full, rehashing needed.");
        }
    }


    public String get(Integer key) throws Exception
    {
        int hcode = this.getHashCode(key);

        if(hashValues[hcode] == null)
            return null;

        if(hcode > hashValues.length) {
            return null;
        }
        else {
            for(int i = hcode ; i < hashValues.length ; i++) {
                if(null == hashValues[i])
                    break;
                if( hashValues[i].key == key )
                    return hashValues[i].getValue().toString();
            }
            return null;
        }

    }


    public static class HashVal<Integer,String> {
        private Integer key;
        private String value;

        public HashVal(Integer tkey, String tval) {
            this.key = tkey;
            this.value = tval;
        }

        public String getValue() {
            return this.value;
        }
        public Integer getKey() {
           return this.key;
        }
    }




}
