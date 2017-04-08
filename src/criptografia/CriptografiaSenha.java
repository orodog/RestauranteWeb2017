package criptografia;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CriptografiaSenha {

   public static String encriptarSenha(Object senha) throws Exception {
   
   	// criando um algoritmo de criptografia MD5/SHA1
      MessageDigest m = MessageDigest.getInstance("MD5");
   
   	// preparando a senha para ser criptografada
      m.update(((String) senha).getBytes(), 0, ((String) senha).length());
   
   	// fazendo a criptografia e retornando o resultado..
      return new BigInteger(1, m.digest()).toString(16);
   }

	

}
