package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nc2 {

    /* JADX INFO: renamed from: a */
    public static final String f63942a = "CommonUtils";

    public static boolean isCanShowPopup() {
        return vfe.getInstance().getBoolean("KEY_POP_SWITCH", false) && System.currentTimeMillis() >= vfe.getInstance().getLong("KEY_POP_SWITCH_TIME", 0L);
    }

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean isInt(String str) {
        if (!TextUtils.isEmpty(str) && !"null".equalsIgnoreCase(str)) {
            try {
                Integer.valueOf(str);
                return true;
            } catch (Exception e) {
                zi9.m26862w("CommonUtils", "isInt Exception: ", e);
            }
        }
        return false;
    }

    public static boolean isLightColor(int color) {
        return 1.0d - ((((((double) Color.red(color)) * 0.299d) + (((double) Color.green(color)) * 0.587d)) + (((double) Color.blue(color)) * 0.114d)) / 255.0d) < 0.5d;
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

    public static void setTextColor(String color, View... tv) {
        int color2;
        for (View view : tv) {
            if (view != null) {
                try {
                    color2 = Color.parseColor(color);
                } catch (Exception unused) {
                    color2 = Color.parseColor("black");
                }
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(color2);
                } else {
                    view.setBackgroundColor(color2);
                }
            }
        }
    }
}
