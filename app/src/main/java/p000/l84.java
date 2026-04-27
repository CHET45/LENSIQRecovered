package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class l84 {
    private static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append(a43.f347l);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase(Locale.CHINA);
    }

    private static String getAndroidId(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getDeviceId(Context context) {
        StringBuilder sb = new StringBuilder();
        String androidId = getAndroidId(context);
        String serial = getSERIAL();
        String strReplace = getDeviceUUID().replace("-", "");
        if (androidId != null && androidId.length() > 0) {
            sb.append(androidId);
            sb.append(es7.f33958g);
        }
        if (serial != null && serial.length() > 0) {
            sb.append(serial);
            sb.append(es7.f33958g);
        }
        if (strReplace != null && strReplace.length() > 0) {
            sb.append(strReplace);
        }
        if (sb.length() > 0) {
            try {
                String strBytesToHex = bytesToHex(getHashByString(sb.toString()));
                if (strBytesToHex != null) {
                    if (strBytesToHex.length() > 0) {
                        return strBytesToHex;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return UUID.randomUUID().toString().replace("-", "");
    }

    private static String getDeviceUUID() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("3883756");
            sb.append(Build.BOARD.length() % 10);
            sb.append(Build.BRAND.length() % 10);
            sb.append(Build.DEVICE.length() % 10);
            sb.append(Build.HARDWARE.length() % 10);
            sb.append(Build.ID.length() % 10);
            sb.append(Build.MODEL.length() % 10);
            sb.append(Build.PRODUCT.length() % 10);
            sb.append(Build.SERIAL.length() % 10);
            return new UUID(sb.toString().hashCode(), r1.hashCode()).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static byte[] getHashByString(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (Exception unused) {
            return "".getBytes();
        }
    }

    private static String getIMEI(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getSERIAL() {
        try {
            return Build.SERIAL;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
