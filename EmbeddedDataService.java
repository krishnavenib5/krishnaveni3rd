package com.noesisinformatica.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class EmbeddedDataService {

    private Map<Long, String> ebbData = new HashMap<Long, String>();
    private long lastUsedId = 1000;

    public EmbeddedDataService(){

        // save some initial ebbData
        saveTerm("First term");
        saveTerm("Second term");
        saveTerm("Another term");
        saveTerm("Miscellaneous term");
        saveTerm("");
    }

    String getTermForId(Long id){
        return ebbData.get(id);
    }

    void saveTerm(String term){

        boolean exists = false;
        for(String t: ebbData.values())
        {
            if(term.equals(t)){
                exists = true;
                break;
            }
        }

        if(!exists)
        {

            long key = getLastUsedId() + 1;
            ebbData.put(key, term);

            setLastUsedId(key);
        }
    }

    Collection<String> getAllTerm(){
        return ebbData.values();
    }

    public long getLastUsedId() {
        return lastUsedId;
    }

    public void setLastUsedId(long lastUsedId) {
        this.lastUsedId = lastUsedId;
    }
}
