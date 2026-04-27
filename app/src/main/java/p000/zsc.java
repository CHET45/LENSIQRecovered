package p000;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2476i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public final class zsc {

    /* JADX INFO: renamed from: l */
    public static final String f105987l = "ro.miui.ui.version.name";

    /* JADX INFO: renamed from: m */
    public static final String f105988m = "ro.build.version.emui";

    /* JADX INFO: renamed from: n */
    public static final String f105989n = "ro.vivo.os.build.display.id";

    /* JADX INFO: renamed from: o */
    public static final String f105990o = "ro.build.version.incremental";

    /* JADX INFO: renamed from: q */
    public static final String f105992q = "ro.letv.release.version";

    /* JADX INFO: renamed from: r */
    public static final String f105993r = "ro.build.uiversion";

    /* JADX INFO: renamed from: s */
    public static final String f105994s = "ro.build.MiFavor_version";

    /* JADX INFO: renamed from: t */
    public static final String f105995t = "ro.rom.version";

    /* JADX INFO: renamed from: u */
    public static final String f105996u = "ro.build.rom.id";

    /* JADX INFO: renamed from: a */
    public static final String[] f105976a = {"huawei"};

    /* JADX INFO: renamed from: b */
    public static final String[] f105977b = {"vivo"};

    /* JADX INFO: renamed from: c */
    public static final String[] f105978c = {"xiaomi"};

    /* JADX INFO: renamed from: d */
    public static final String[] f105979d = {"oppo"};

    /* JADX INFO: renamed from: e */
    public static final String[] f105980e = {"leeco", "letv"};

    /* JADX INFO: renamed from: f */
    public static final String[] f105981f = {"360", "qiku"};

    /* JADX INFO: renamed from: g */
    public static final String[] f105982g = {"zte"};

    /* JADX INFO: renamed from: h */
    public static final String[] f105983h = {"oneplus"};

    /* JADX INFO: renamed from: i */
    public static final String[] f105984i = {"nubia"};

    /* JADX INFO: renamed from: j */
    public static final String[] f105985j = {as9.f11748b};

    /* JADX INFO: renamed from: k */
    public static final String[] f105986k = {"honor"};

    /* JADX INFO: renamed from: p */
    public static final String[] f105991p = {C2476i.f17661x, "ro.build.version.oplusrom.display"};

    /* JADX INFO: renamed from: v */
    public static final String[] f105997v = {"msc.config.magic.version", "ro.build.version.magic"};

    private zsc() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static String m27074a() {
        String brand = getBrand();
        String manufacturer = getManufacturer();
        if (isRightRom(brand, manufacturer, f105976a)) {
            String propertyName = getPropertyName("ro.build.version.emui");
            String[] strArrSplit = propertyName.split(p43.f69617m);
            return strArrSplit.length > 1 ? strArrSplit[1] : propertyName.contains("EmotionUI") ? propertyName.replaceFirst("EmotionUI\\s*", "") : propertyName;
        }
        if (isRightRom(brand, manufacturer, f105977b)) {
            return getPropertyName("ro.vivo.os.build.display.id");
        }
        if (isRightRom(brand, manufacturer, f105978c)) {
            return getPropertyName("ro.build.version.incremental");
        }
        int i = 0;
        if (isRightRom(brand, manufacturer, f105979d)) {
            String[] strArr = f105991p;
            int length = strArr.length;
            while (i < length) {
                String str = strArr[i];
                String propertyName2 = getPropertyName(str);
                if (!TextUtils.isEmpty(str)) {
                    return propertyName2;
                }
                i++;
            }
            return "";
        }
        if (isRightRom(brand, manufacturer, f105980e)) {
            return getPropertyName("ro.letv.release.version");
        }
        if (isRightRom(brand, manufacturer, f105981f)) {
            return getPropertyName("ro.build.uiversion");
        }
        if (isRightRom(brand, manufacturer, f105982g)) {
            return getPropertyName("ro.build.MiFavor_version");
        }
        if (isRightRom(brand, manufacturer, f105983h)) {
            return getPropertyName("ro.rom.version");
        }
        if (isRightRom(brand, manufacturer, f105984i)) {
            return getPropertyName("ro.build.rom.id");
        }
        if (!isRightRom(brand, manufacturer, f105986k)) {
            return getPropertyName("");
        }
        String[] strArr2 = f105997v;
        int length2 = strArr2.length;
        while (i < length2) {
            String str2 = strArr2[i];
            String propertyName3 = getPropertyName(str2);
            if (!TextUtils.isEmpty(str2)) {
                return propertyName3;
            }
            i++;
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27075b() {
        for (String str : f105991p) {
            if (!TextUtils.isEmpty(getPropertyName(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m27076c() {
        return !TextUtils.isEmpty(getPropertyName("ro.build.version.emui"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m27077d() {
        if (!C5487ew.m10307c()) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(String.valueOf(cls.getMethod("getOsBrand", null).invoke(cls, null)));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m27078e() {
        return isRightRom(getBrand(), getManufacturer(), f105986k);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m27079f() {
        return !TextUtils.isEmpty(getPropertyName(f105987l));
    }

    @igg({"PrivateApi"})
    /* JADX INFO: renamed from: g */
    public static boolean m27080g() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return Boolean.parseBoolean(String.valueOf(cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, "persist.sys.miui_optimization", Boolean.valueOf(!"1".equals(String.valueOf(cls.getMethod("get", String.class, String.class).invoke(cls, "ro.miui.cts", "")))))));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return true;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return true;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return true;
        }
    }

    private static String getBrand() {
        return Build.BRAND.toLowerCase();
    }

    private static String getManufacturer() {
        return Build.MANUFACTURER.toLowerCase();
    }

    private static String getPropertyName(String str) {
        return !TextUtils.isEmpty(str) ? getSystemProperty(str) : "";
    }

    private static String getSystemProperty(String str) throws Throwable {
        String systemPropertyByShell = getSystemPropertyByShell(str);
        if (!TextUtils.isEmpty(systemPropertyByShell)) {
            return systemPropertyByShell;
        }
        String systemPropertyByStream = getSystemPropertyByStream(str);
        return (TextUtils.isEmpty(systemPropertyByStream) && Build.VERSION.SDK_INT < 28) ? getSystemPropertyByReflect(str) : systemPropertyByStream;
    }

    @igg({"PrivateApi"})
    private static String getSystemPropertyByReflect(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return "";
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return "";
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    private static String getSystemPropertyByShell(String str) throws Throwable {
        BufferedReader bufferedReader;
        String line;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
                    try {
                        line = bufferedReader.readLine();
                    } catch (IOException e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        e.printStackTrace();
                        if (bufferedReader2 == null) {
                            return "";
                        }
                        bufferedReader2.close();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            }
            if (line == null) {
                bufferedReader.close();
                return "";
            }
            try {
                bufferedReader.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return line;
        } catch (IOException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private static String getSystemPropertyByStream(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @igg({"PrivateApi"})
    /* JADX INFO: renamed from: h */
    public static boolean m27081h() {
        return isRightRom(getBrand(), getManufacturer(), f105985j);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m27082i() {
        return !TextUtils.isEmpty(getPropertyName("ro.vivo.os.build.display.id"));
    }

    private static boolean isRightRom(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }
}
