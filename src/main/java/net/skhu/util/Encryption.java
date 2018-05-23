package net.skhu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encryption {
	public static final String MD5 = "MD5";
	public static Logger logger = LoggerFactory.getLogger(Encryption.class);
	public static String encrypt(String s, String messageDigest) {
		logger.info("encryption start about {} : {}", messageDigest, s);
		try{
			MessageDigest md = MessageDigest.getInstance(messageDigest);
			byte[] passBytes = s.getBytes();
			md.reset();
			byte[] digested = md.digest(passBytes);
			StringBuffer sb = new StringBuffer();
			for(int k=0;k<digested.length;k++) {
				sb.append(Integer.toHexString(0xff & digested[k]));
			}
			logger.info("encryption complete about {} : {}", messageDigest, s);
			return sb.toString();
		}
		catch(NoSuchAlgorithmException e) {
			logger.error("encryption exception about {} : {}", messageDigest, s);
			e.printStackTrace();
			return s;
		}
	}
}
