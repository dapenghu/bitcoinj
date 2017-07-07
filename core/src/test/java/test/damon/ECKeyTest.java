package test.damon;

import org.bitcoinj.core.Address;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.NetworkParameters;
import org.junit.*;

/**
 * Created by damonhu on 24/05/2017.
 */
public class ECKeyTest {

    @Test
    public void ECKeyCreate(){
        ECKey key = new ECKey();
        System.out.println(" new key: private = " + key.getPrivateKeyAsHex() + "; public = " + key.getPublicKeyAsHex());
        System.out.println(" address in production network: " + key.toAddress(NetworkParameters.prodNet()));
        System.out.println(" address in test network: " + key.toAddress(NetworkParameters.testNet()));
        System.out.println(" address in test network2: " + key.toAddress(NetworkParameters.testNet2()));
        System.out.println(" address in test network3: " + key.toAddress(NetworkParameters.testNet3()));
        System.out.println(" address in regression network: " + key.toAddress(NetworkParameters.regTests()));
        System.out.println(" address in unit test network: " + key.toAddress(NetworkParameters.unitTests()));

    }
}
