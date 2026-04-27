package p000;

import android.os.Build;
import com.blankj.utilcode.util.C2481n;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class v15 {
    private v15() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m23670a(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] decrypt3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DESede", str, bArr3, false);
    }

    public static byte[] decryptAES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "AES", str, bArr3, false);
    }

    public static byte[] decryptBase64AES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decryptAES(C2481n.m4288c(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptBase64DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decryptDES(C2481n.m4288c(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptBase64RSA(byte[] bArr, byte[] bArr2, int i, String str) {
        return decryptRSA(C2481n.m4288c(bArr), bArr2, i, str);
    }

    public static byte[] decryptBase64_3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decrypt3DES(C2481n.m4288c(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptDES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DES", str, bArr3, false);
    }

    public static byte[] decryptHexString3DES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decrypt3DES(C2481n.m4308j0(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringAES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decryptAES(C2481n.m4308j0(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringDES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decryptDES(C2481n.m4308j0(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringRSA(String str, byte[] bArr, int i, String str2) {
        return decryptRSA(C2481n.m4308j0(str), bArr, i, str2);
    }

    public static byte[] decryptRSA(byte[] bArr, byte[] bArr2, int i, String str) {
        return rsaTemplate(bArr, bArr2, i, str, false);
    }

    public static byte[] encrypt3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DESede", str, bArr3, true);
    }

    public static byte[] encrypt3DES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return C2481n.m4291d(encrypt3DES(bArr, bArr2, str, bArr3));
    }

    public static String encrypt3DES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return C2481n.m4309k(encrypt3DES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptAES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "AES", str, bArr3, true);
    }

    public static byte[] encryptAES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return C2481n.m4291d(encryptAES(bArr, bArr2, str, bArr3));
    }

    public static String encryptAES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return C2481n.m4309k(encryptAES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptDES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DES", str, bArr3, true);
    }

    public static byte[] encryptDES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return C2481n.m4291d(encryptDES(bArr, bArr2, str, bArr3));
    }

    public static String encryptDES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return C2481n.m4309k(encryptDES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptHmacMD5(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacMD5");
    }

    public static String encryptHmacMD5ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacMD5ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA1(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA1");
    }

    public static String encryptHmacSHA1ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA1ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA224(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA224");
    }

    public static String encryptHmacSHA224ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA224ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA256(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA256");
    }

    public static String encryptHmacSHA256ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA256ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA384(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA384");
    }

    public static String encryptHmacSHA384ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA384ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA512(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA512");
    }

    public static String encryptHmacSHA512ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA512ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptMD2(byte[] bArr) {
        return m23670a(bArr, "MD2");
    }

    public static String encryptMD2ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptMD2ToString(str.getBytes());
    }

    public static byte[] encryptMD5(byte[] bArr) {
        return m23670a(bArr, "MD5");
    }

    public static byte[] encryptMD5File(String str) {
        return encryptMD5File(C2481n.m4235C0(str) ? null : new File(str));
    }

    public static String encryptMD5File2String(String str) {
        return encryptMD5File2String(C2481n.m4235C0(str) ? null : new File(str));
    }

    public static String encryptMD5ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptMD5ToString(str.getBytes());
    }

    public static byte[] encryptRSA(byte[] bArr, byte[] bArr2, int i, String str) {
        return rsaTemplate(bArr, bArr2, i, str, true);
    }

    public static byte[] encryptRSA2Base64(byte[] bArr, byte[] bArr2, int i, String str) {
        return C2481n.m4291d(encryptRSA(bArr, bArr2, i, str));
    }

    public static String encryptRSA2HexString(byte[] bArr, byte[] bArr2, int i, String str) {
        return C2481n.m4309k(encryptRSA(bArr, bArr2, i, str));
    }

    public static byte[] encryptSHA1(byte[] bArr) {
        return m23670a(bArr, lc2.f57149a);
    }

    public static String encryptSHA1ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA1ToString(str.getBytes());
    }

    public static byte[] encryptSHA224(byte[] bArr) {
        return m23670a(bArr, "SHA224");
    }

    public static String encryptSHA224ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA224ToString(str.getBytes());
    }

    public static byte[] encryptSHA256(byte[] bArr) {
        return m23670a(bArr, "SHA-256");
    }

    public static String encryptSHA256ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA256ToString(str.getBytes());
    }

    public static byte[] encryptSHA384(byte[] bArr) {
        return m23670a(bArr, "SHA-384");
    }

    public static String encryptSHA384ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA384ToString(str.getBytes());
    }

    public static byte[] encryptSHA512(byte[] bArr) {
        return m23670a(bArr, "SHA-512");
    }

    public static String encryptSHA512ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA512ToString(str.getBytes());
    }

    private static byte[] hmacTemplate(byte[] bArr, byte[] bArr2, String str) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
                Mac mac = Mac.getInstance(str);
                mac.init(secretKeySpec);
                return mac.doFinal(bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static byte[] joins(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] rc4(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null) {
            return null;
        }
        if (bArr2.length < 1 || bArr2.length > 256) {
            throw new IllegalArgumentException("key must be between 1 and 256 bytes");
        }
        byte[] bArr3 = new byte[256];
        byte[] bArr4 = new byte[256];
        int length = bArr2.length;
        for (int i = 0; i < 256; i++) {
            bArr3[i] = (byte) i;
            bArr4[i] = bArr2[i % length];
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte b = bArr3[i3];
            i2 = (i2 + b + bArr4[i3]) & 255;
            byte b2 = bArr3[i2];
            bArr3[i2] = b;
            bArr3[i3] = b2;
        }
        byte[] bArr5 = new byte[bArr.length];
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            i4 = (i4 + 1) & 255;
            byte b3 = bArr3[i4];
            i2 = (i2 + b3) & 255;
            byte b4 = bArr3[i2];
            bArr3[i2] = b3;
            bArr3[i4] = b4;
            bArr5[i5] = (byte) (bArr3[(b4 + bArr3[i2]) & 255] ^ bArr[i5]);
        }
        return bArr5;
    }

    private static byte[] rsaTemplate(byte[] bArr, byte[] bArr2, int i, String str, boolean z) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                KeyFactory keyFactory = Build.VERSION.SDK_INT < 28 ? KeyFactory.getInstance("RSA", "BC") : KeyFactory.getInstance("RSA");
                Key keyGeneratePublic = z ? keyFactory.generatePublic(new X509EncodedKeySpec(bArr2)) : keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                if (keyGeneratePublic == null) {
                    return null;
                }
                Cipher cipher = Cipher.getInstance(str);
                cipher.init(z ? 1 : 2, keyGeneratePublic);
                int length = bArr.length;
                int i2 = i / 8;
                if (z && str.toLowerCase().endsWith("pkcs1padding")) {
                    i2 -= 11;
                }
                int i3 = length / i2;
                if (i3 <= 0) {
                    return cipher.doFinal(bArr);
                }
                byte[] bArrJoins = new byte[0];
                byte[] bArr3 = new byte[i2];
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    System.arraycopy(bArr, i4, bArr3, 0, i2);
                    bArrJoins = joins(bArrJoins, cipher.doFinal(bArr3));
                    i4 += i2;
                }
                if (i4 == length) {
                    return bArrJoins;
                }
                int i6 = length - i4;
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr, i4, bArr4, 0, i6);
                return joins(bArrJoins, cipher.doFinal(bArr4));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static byte[] symmetricTemplate(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, boolean z) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                SecretKey secretKeyGenerateSecret = "DES".equals(str) ? SecretKeyFactory.getInstance(str).generateSecret(new DESKeySpec(bArr2)) : new SecretKeySpec(bArr2, str);
                Cipher cipher = Cipher.getInstance(str2);
                if (bArr3 == null || bArr3.length == 0) {
                    cipher.init(z ? 1 : 2, secretKeyGenerateSecret);
                } else {
                    cipher.init(z ? 1 : 2, secretKeyGenerateSecret, new IvParameterSpec(bArr3));
                }
                return cipher.doFinal(bArr);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0030: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:16:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] encryptMD5File(java.io.File r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r4 = 262144(0x40000, float:3.67342E-40)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
        L18:
            int r3 = r2.read(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            if (r3 > 0) goto L18
            java.security.MessageDigest r4 = r2.getMessageDigest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            byte[] r4 = r4.digest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r1.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            return r4
        L2f:
            r4 = move-exception
            r0 = r1
            goto L4b
        L32:
            r4 = move-exception
            goto L3d
        L34:
            r4 = move-exception
            goto L3d
        L36:
            r4 = move-exception
            goto L4b
        L38:
            r4 = move-exception
        L39:
            r1 = r0
            goto L3d
        L3b:
            r4 = move-exception
            goto L39
        L3d:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r4 = move-exception
            r4.printStackTrace()
        L4a:
            return r0
        L4b:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v15.encryptMD5File(java.io.File):byte[]");
    }

    public static String encryptMD5File2String(File file) {
        return C2481n.m4309k(encryptMD5File(file));
    }

    public static String encryptHmacMD5ToString(byte[] bArr, byte[] bArr2) {
        return C2481n.m4309k(encryptHmacMD5(bArr, bArr2));
    }

    public static String encryptHmacSHA1ToString(byte[] bArr, byte[] bArr2) {
        return C2481n.m4309k(encryptHmacSHA1(bArr, bArr2));
    }

    public static String encryptHmacSHA224ToString(byte[] bArr, byte[] bArr2) {
        return C2481n.m4309k(encryptHmacSHA224(bArr, bArr2));
    }

    public static String encryptHmacSHA256ToString(byte[] bArr, byte[] bArr2) {
        return C2481n.m4309k(encryptHmacSHA256(bArr, bArr2));
    }

    public static String encryptHmacSHA384ToString(byte[] bArr, byte[] bArr2) {
        return C2481n.m4309k(encryptHmacSHA384(bArr, bArr2));
    }

    public static String encryptHmacSHA512ToString(byte[] bArr, byte[] bArr2) {
        return C2481n.m4309k(encryptHmacSHA512(bArr, bArr2));
    }

    public static String encryptMD2ToString(byte[] bArr) {
        return C2481n.m4309k(encryptMD2(bArr));
    }

    public static String encryptMD5ToString(String str, String str2) {
        if (str == null && str2 == null) {
            return "";
        }
        if (str2 == null) {
            return C2481n.m4309k(encryptMD5(str.getBytes()));
        }
        if (str == null) {
            return C2481n.m4309k(encryptMD5(str2.getBytes()));
        }
        return C2481n.m4309k(encryptMD5((str + str2).getBytes()));
    }

    public static String encryptSHA1ToString(byte[] bArr) {
        return C2481n.m4309k(encryptSHA1(bArr));
    }

    public static String encryptSHA224ToString(byte[] bArr) {
        return C2481n.m4309k(encryptSHA224(bArr));
    }

    public static String encryptSHA256ToString(byte[] bArr) {
        return C2481n.m4309k(encryptSHA256(bArr));
    }

    public static String encryptSHA384ToString(byte[] bArr) {
        return C2481n.m4309k(encryptSHA384(bArr));
    }

    public static String encryptSHA512ToString(byte[] bArr) {
        return C2481n.m4309k(encryptSHA512(bArr));
    }

    public static String encryptMD5ToString(byte[] bArr) {
        return C2481n.m4309k(encryptMD5(bArr));
    }

    public static String encryptMD5ToString(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return "";
        }
        if (bArr2 == null) {
            return C2481n.m4309k(encryptMD5(bArr));
        }
        if (bArr == null) {
            return C2481n.m4309k(encryptMD5(bArr2));
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return C2481n.m4309k(encryptMD5(bArr3));
    }
}
