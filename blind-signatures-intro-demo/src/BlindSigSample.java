import java.math.BigInteger;


public class BlindSigSample {
    public static void main(String[] args){
        System.out.println("This is the test of Blind Signatures");
        String msg="this is the plain msg";
        Trans t=new Transform();
        String nummsg=t.numtonumstr(t.atonum(msg));
        
        
        
        
        BigInteger e = new BigInteger("32663");
        BigInteger d = new BigInteger("23");
        BigInteger n = new BigInteger("42167");

        BigInteger m = new BigInteger("123");       //msg
        BigInteger factor = new BigInteger("37");   //blind factor

        
        
        m=new BigInteger(nummsg);
        
        
        BigInteger blindMsg = blindHideMsg(m, factor, e, n);
        BigInteger blindSig = blindSignature(blindMsg, d, n);
        BigInteger sig = blindRetriveSig(blindSig, factor, n);
        System.out.println("Blind signature = " + sig);
        BigInteger realSig = m.modPow(d, n);
        System.out.println("Real Signature = " + realSig);
    }

    /**Blind Signatures - blind*/
    public static BigInteger blindHideMsg(BigInteger msg, BigInteger factor, BigInteger e, BigInteger n){
        BigInteger hideMsg = msg.multiply(factor.modPow(e, n)).mod(n);
        return hideMsg;
    }

    /**Blind Signatures - signature*/
    public static BigInteger blindSignature(BigInteger blindMsg, BigInteger d, BigInteger n){
        BigInteger blindSig = blindMsg.modPow(d, n);
        return blindSig;
    }

    /**Blind Signatures - unblind*/
    public static BigInteger blindRetriveSig(BigInteger blindSig, BigInteger factor, BigInteger n){
        BigInteger signature = blindSig.multiply(factor.modInverse(n)).mod(n);
        return signature;
    }
}