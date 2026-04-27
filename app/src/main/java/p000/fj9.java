package p000;

import android.util.Log;
import com.google.firebase.firestore.BuildConfig;

/* JADX INFO: loaded from: classes5.dex */
public class fj9 {

    /* JADX INFO: renamed from: a */
    public static EnumC5854b f36858a = EnumC5854b.WARN;

    /* JADX INFO: renamed from: fj9$a */
    public static /* synthetic */ class C5853a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36859a;

        static {
            int[] iArr = new int[EnumC5854b.values().length];
            f36859a = iArr;
            try {
                iArr[EnumC5854b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36859a[EnumC5854b.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36859a[EnumC5854b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: fj9$b */
    public enum EnumC5854b {
        DEBUG,
        WARN,
        NONE
    }

    public static void debug(String str, String str2, Object... objArr) {
        doLog(EnumC5854b.DEBUG, str, str2, objArr);
    }

    private static void doLog(EnumC5854b enumC5854b, String str, String str2, Object... objArr) {
        if (enumC5854b.ordinal() >= f36858a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", BuildConfig.VERSION_NAME, str) + String.format(str2, objArr);
            int i = C5853a.f36859a[enumC5854b.ordinal()];
            if (i == 1) {
                Log.i("Firestore", str3);
            } else if (i == 2) {
                Log.w("Firestore", str3);
            } else if (i == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean isDebugEnabled() {
        return f36858a.ordinal() >= EnumC5854b.DEBUG.ordinal();
    }

    public static void setLogLevel(EnumC5854b enumC5854b) {
        f36858a = enumC5854b;
    }

    public static void warn(String str, String str2, Object... objArr) {
        doLog(EnumC5854b.WARN, str, str2, objArr);
    }
}
