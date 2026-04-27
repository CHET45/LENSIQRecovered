package p000;

import android.graphics.drawable.Drawable;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import p000.ymh;

/* JADX INFO: loaded from: classes3.dex */
public final class d7e {

    /* JADX INFO: renamed from: a */
    public static final int f28708a = 8192;

    private d7e() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean copyFileFromAssets(String str, String str2) {
        try {
            String[] list = C2479l.getApp().getAssets().list(str);
            if (list == null || list.length <= 0) {
                return C2481n.m4299f1(str2, C2479l.getApp().getAssets().open(str));
            }
            boolean zCopyFileFromAssets = true;
            for (String str3 : list) {
                zCopyFileFromAssets &= copyFileFromAssets(str + pj4.f71071b + str3, str2 + pj4.f71071b + str3);
            }
            return zCopyFileFromAssets;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean copyFileFromRaw(@wpd int i, String str) {
        return C2481n.m4299f1(str, C2479l.getApp().getResources().openRawResource(i));
    }

    public static int getAnimIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "anim", C2479l.getApp().getPackageName());
    }

    public static int getColorIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "color", C2479l.getApp().getPackageName());
    }

    public static int getDimenIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "dimen", C2479l.getApp().getPackageName());
    }

    public static Drawable getDrawable(@gq4 int i) {
        return lx2.getDrawable(C2479l.getApp(), i);
    }

    public static int getDrawableIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "drawable", C2479l.getApp().getPackageName());
    }

    public static int getIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "id", C2479l.getApp().getPackageName());
    }

    public static int getLayoutIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "layout", C2479l.getApp().getPackageName());
    }

    public static int getMenuIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, tfg.f84554f, C2479l.getApp().getPackageName());
    }

    public static int getMipmapIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "mipmap", C2479l.getApp().getPackageName());
    }

    public static int getStringIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, ymh.InterfaceC15723b.f102127e, C2479l.getApp().getPackageName());
    }

    public static int getStyleIdByName(String str) {
        return C2479l.getApp().getResources().getIdentifier(str, "style", C2479l.getApp().getPackageName());
    }

    public static List<String> readAssets2List(String str) {
        return readAssets2List(str, "");
    }

    public static String readAssets2String(String str) {
        return readAssets2String(str, null);
    }

    public static List<String> readRaw2List(@wpd int i) {
        return readRaw2List(i, "");
    }

    public static String readRaw2String(@wpd int i) {
        return readRaw2String(i, null);
    }

    public static List<String> readAssets2List(String str, String str2) {
        try {
            return C2481n.m4316n0(C2479l.getApp().getResources().getAssets().open(str), str2);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static String readAssets2String(String str, String str2) {
        try {
            byte[] bArrM4314m0 = C2481n.m4314m0(C2479l.getApp().getAssets().open(str));
            if (bArrM4314m0 == null) {
                return "";
            }
            if (C2481n.m4235C0(str2)) {
                return new String(bArrM4314m0);
            }
            try {
                return new String(bArrM4314m0, str2);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "";
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static List<String> readRaw2List(@wpd int i, String str) {
        return C2481n.m4316n0(C2479l.getApp().getResources().openRawResource(i), str);
    }

    public static String readRaw2String(@wpd int i, String str) {
        byte[] bArrM4314m0 = C2481n.m4314m0(C2479l.getApp().getResources().openRawResource(i));
        if (bArrM4314m0 == null) {
            return null;
        }
        if (C2481n.m4235C0(str)) {
            return new String(bArrM4314m0);
        }
        try {
            return new String(bArrM4314m0, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
