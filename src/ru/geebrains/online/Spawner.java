package ru.geebrains.online;

import java.util.HashMap;
import java.util.Map;

class Spawner {
   public Map<String, String> telephoneSpawner = new HashMap<>();
   public Spawner(){
       this.telephoneSpawner = telephoneSpawner;
   }

    public void addTelephone(String kay, String num) {
        telephoneSpawner.put(kay, num);
    }

    public String getTelephone(String user){
      return telephoneSpawner.get(user);
    }



}



