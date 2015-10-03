import com.flipkart.kloud.authn.AuthTokenService;
import com.flipkart.kloud.authn.PrivateKeyCredential;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by abhiramk on 02/10/15.
 */
public class AuthNTest {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
        PrivateKeyCredential privateKeyCredential = PrivateKeyCredential.
                fromPemFile("fk-fraud-engine", "/Users/abhiramk/fk-fraud-engine.pem");
//        AuthTokenService authTokenService = new AuthTokenService("https://kloud-authn-0001.ch.flipkart.com/openid-connect-server-webapp/", privateKeyCredential);
        AuthTokenService authTokenService = new AuthTokenService("http://authn.nm.flipkart.com", privateKeyCredential);
        String header = authTokenService.fetchToken("http://flo-oms-transit-b2c.nm.flipkart.com:80").toAuthorizationHeader();
        System.out.println(header);

    }
}
