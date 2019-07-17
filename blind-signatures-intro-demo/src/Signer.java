import java.math.BigInteger;


public class Signer extends Trans{

	
	static BigInteger d = new BigInteger("23");// RSA decryption key
    static BigInteger n = new BigInteger("42167");// n = p * q in RSA

    
	public static void main(String[] args) {
		//e.g.
		
		Client c=new Client();
		String str="aaa";
		c.m=str;
		c.blindHideMsg(c.m, c.factor, c.e, n);
		Signer s=new Signer();
		s.blindSignature(c.blindHideMsg(c.m, c.factor, c.e, n), d, n);
		BigInteger original=new BigInteger(numtonumstr(atonum(c.m))).modPow(d, n);
		System.out.println("the original signature is:"+original);
		BigInteger blind=c.blindRetriveSig(S.blindSignature(c.blindHideMsg(c.m, c.factor, c.e, n), d, n), c.factor, n);
		System.out.println("the blind signature is:"+blind);
		
		
	}

	/**Blind Signatures - signature*/
	
	//Input 'blinded message' of String type; 'd' and 'n' of BigInteger type
	//return 'blinded signature' of BigInteger type
    public static BigInteger blindSignature(BigInteger blindMsg, BigInteger d, BigInteger n){
        BigInteger blindSig = blindMsg.modPow(d, n);
        return blindSig;
    }
}
