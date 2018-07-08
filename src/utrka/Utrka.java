/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utrka;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author zhuang001
 */
public class Utrka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            HashMap<String,Integer> nameMap=new HashMap();
            String[] names=new String[n];
            
            
            
            for (int i = 0; i < n; i++) {
                String name=reader.readLine();
                if (!nameMap.containsKey(name)) {
                    nameMap.put(name, 1);
                } else {
                    nameMap.put(name, nameMap.get(name)+1);
                }
            }
            
            for (int i=0;i<n-1;i++) {
                String name=reader.readLine();
                nameMap.put(name,nameMap.get(name)-1);
            }
            
            for (String key:nameMap.keySet()) {
                if (nameMap.get(key)>0) {
                    System.out.println(key);
                    return;
                }
            }

        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }


}
