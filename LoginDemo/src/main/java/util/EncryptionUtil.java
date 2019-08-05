package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class EncryptionUtil {

    /**
     * 暗号化部品
     */
    public String createDigest(String data) throws NoSuchAlgorithmException {

        // 暗号化アルゴリズムを指定
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] byteData = data.getBytes();
        byte[] byteDigest;
        StringBuffer digest = new StringBuffer();

        byteDigest = md.digest(byteData);

        for (int i = 0; i < byteDigest.length; i++) {
            int d = byteDigest[i];
            if (d < 0) {// byte型では128～255が負値のため補正
                d += 256;
            }
            if (d < 16) {// 0～15は16進数で1桁になるため、2桁になるよう頭に0を追加
                digest.append("0");
            }
            // 暗号の1バイトを16進数2けたに変換
            digest.append(Integer.toString(d, 16));
        }

        return digest.toString();
    }
}