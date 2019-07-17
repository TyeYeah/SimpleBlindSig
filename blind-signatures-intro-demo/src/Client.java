import java.math.BigInteger;


public class Client extends Trans{

	BigInteger e = new BigInteger("32663");// RSA encryption key
    BigInteger d = new BigInteger("23");// RSA decryption key
    BigInteger n = new BigInteger("42167");// n = p * q in RSA

    String m = new String("the plain text");// Original message
    BigInteger factor = new BigInteger("37");   // Blind factor

    
	public static void main(String[] args) {
		// TODO 
	}
	/**Blind Signatures - blind*/
	//Input 'message' of String type; 'factor', 'e' and 'n' of BigInteger type
	//return 'blinded message' of BigInteger type
    public static BigInteger blindHideMsg(String m, BigInteger factor, BigInteger e, BigInteger n){
    	BigInteger msg=new BigInteger(numtonumstr(atonum(m)));
        BigInteger hideMsg = msg.multiply(factor.modPow(e, n)).mod(n);
        return hideMsg;
    }

    

    /**Blind Signatures - unblind*/
	//Input 'blinded signature' of String type; 'factor' and 'n' of BigInteger type
	//return theoretical 'real signature' of BigInteger type
    public static BigInteger blindRetriveSig(BigInteger blindSig, BigInteger factor, BigInteger n){
        BigInteger signature = blindSig.multiply(factor.modInverse(n)).mod(n);
        return signature;
    }
}
