package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.blankj.utilcode.util.C2473f;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class mc2 {

    /* JADX INFO: renamed from: a */
    public static final String f60543a = "CommonUtils";

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean isInt(String str) {
        if (!TextUtils.isEmpty(str) && !"null".equalsIgnoreCase(str)) {
            try {
                Integer.valueOf(str);
                return true;
            } catch (Exception e) {
                C2473f.m4176w("CommonUtils", "isInt Exception: ", e);
            }
        }
        return false;
    }

    public static boolean isLightColor(int i) {
        return 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) < 0.5d;
    }

    public static void jump(Context context) {
        if (context != null) {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static String md5Encrypt32(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                int length = bArrDigest.length;
                for (int i = 0; i < length; i++) {
                    int i2 = bArrDigest[i];
                    if (i2 < 0) {
                        i2 += 256;
                    }
                    if (i2 < 16) {
                        sb.append(a43.f347l);
                    }
                    sb.append(Integer.toHexString(i2));
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static String replaceBlank(String str) {
        return !TextUtils.isEmpty(str) ? str.replaceAll("\\s*|\t|\r|\n", "").replaceAll("<[^>]*>", "") : "";
    }

    public static void setTextColor(String str, View... viewArr) {
        int color;
        for (View view : viewArr) {
            if (view != null) {
                try {
                    color = Color.parseColor(str);
                } catch (Exception unused) {
                    color = Color.parseColor("black");
                }
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(color);
                } else {
                    view.setBackgroundColor(color);
                }
            }
        }
    }
}
