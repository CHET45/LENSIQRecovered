package p000;

import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class qcd {

    /* JADX INFO: renamed from: qcd$a */
    public static class C11428a {

        /* JADX INFO: renamed from: a */
        public static final Object f73973a = new Object();

        /* JADX INFO: renamed from: b */
        public static Method f73974b;

        /* JADX INFO: renamed from: c */
        public static boolean f73975c;

        private C11428a() {
        }

        @igg({"DiscouragedPrivateApi"})
        /* JADX INFO: renamed from: a */
        public static boolean m20261a(int i) {
            try {
                synchronized (f73973a) {
                    try {
                        if (!f73975c) {
                            f73975c = true;
                            f73974b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = f73974b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: qcd$b */
    @c5e(24)
    public static class C11429b {
        private C11429b() {
        }

        /* JADX INFO: renamed from: a */
        public static boolean m20262a(int i) {
            return Process.isApplicationUid(i);
        }
    }

    private qcd() {
    }

    public static boolean isApplicationUid(int i) {
        return C11429b.m20262a(i);
    }
}
