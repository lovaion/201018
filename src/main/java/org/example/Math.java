package org.example;

import java.util.ArrayList;

public class Math {


    public ArrayList<Integer> numeriPrimi(int n){
        ArrayList <Integer> primi = new ArrayList<>();
        boolean controllo = true;

        if (n == 2){
            primi.add(n);
        }
        else{
            for (int i = 2; i <=n; i++){
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        controllo = false;
                        break;
                    }
                }
                if (controllo)
                    primi.add(i);

                controllo=true;
            }
        }
        return primi;
    }



}
