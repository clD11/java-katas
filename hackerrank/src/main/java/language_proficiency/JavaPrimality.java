package language_proficiency;

import java.math.BigInteger;

public class JavaPrimality {
    public String isPrime(int i) {
        return (new BigInteger(String.valueOf(i)).isProbablePrime(100)) ? "prime" : "not prime";
    }
}
