package Euler_Solutions;

import java.math.BigInteger;
import java.util.HashSet;

public class DistinctPowers {
    public static void main(String[] args) {
        HashSet<BigInteger>hs = new HashSet<>();
        for(int i=2;i<=100;i++){
            for (int j=2;j<=100;j++){
                hs.add(BigInteger.valueOf(i).pow(j));
            }
        }
        System.out.println(hs.size());
    }
}
