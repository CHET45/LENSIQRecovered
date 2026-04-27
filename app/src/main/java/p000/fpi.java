package p000;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class fpi {
    public static Point getDefaultDisplay(Dialog dialog) {
        Display defaultDisplay = dialog.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static String getValueEncoded(String str) {
        if (str == null) {
            return "null";
        }
        String strReplace = str.replace("\n", "");
        int length = strReplace.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strReplace.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                try {
                    return URLEncoder.encode(strReplace, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return strReplace;
    }
}
