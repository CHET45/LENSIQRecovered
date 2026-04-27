package p000;

import android.util.Log;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public abstract class cj9 {

    /* JADX INFO: renamed from: a */
    public static cj9 f16708a = null;

    /* JADX INFO: renamed from: b */
    public static final String f16709b = "WM-";

    /* JADX INFO: renamed from: c */
    public static final int f16710c = 23;

    /* JADX INFO: renamed from: d */
    public static final int f16711d = 20;

    /* JADX INFO: renamed from: cj9$a */
    public static class C2332a extends cj9 {

        /* JADX INFO: renamed from: e */
        public int f16712e;

        public C2332a(int loggingLevel) {
            super(loggingLevel);
            this.f16712e = loggingLevel;
        }

        @Override // p000.cj9
        public void debug(String tag, String message, Throwable... throwables) {
            if (this.f16712e > 3 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // p000.cj9
        public void error(String tag, String message, Throwable... throwables) {
            if (this.f16712e <= 6) {
                if (throwables == null || throwables.length < 1) {
                    Log.e(tag, message);
                } else {
                    Log.e(tag, message, throwables[0]);
                }
            }
        }

        @Override // p000.cj9
        public void info(String tag, String message, Throwable... throwables) {
            if (this.f16712e <= 4) {
                if (throwables == null || throwables.length < 1) {
                    Log.i(tag, message);
                } else {
                    Log.i(tag, message, throwables[0]);
                }
            }
        }

        @Override // p000.cj9
        public void verbose(String tag, String message, Throwable... throwables) {
            if (this.f16712e > 2 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // p000.cj9
        public void warning(String tag, String message, Throwable... throwables) {
            if (this.f16712e <= 5) {
                if (throwables == null || throwables.length < 1) {
                    Log.w(tag, message);
                } else {
                    Log.w(tag, message, throwables[0]);
                }
            }
        }
    }

    public cj9(int loggingLevel) {
    }

    public static synchronized cj9 get() {
        try {
            if (f16708a == null) {
                f16708a = new C2332a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16708a;
    }

    public static synchronized void setLogger(cj9 logger) {
        f16708a = logger;
    }

    public static String tagWithPrefix(@efb String tag) {
        int length = tag.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(f16709b);
        int i = f16711d;
        if (length >= i) {
            sb.append(tag.substring(0, i));
        } else {
            sb.append(tag);
        }
        return sb.toString();
    }

    public abstract void debug(String tag, String message, Throwable... throwables);

    public abstract void error(String tag, String message, Throwable... throwables);

    public abstract void info(String tag, String message, Throwable... throwables);

    public abstract void verbose(String tag, String message, Throwable... throwables);

    public abstract void warning(String tag, String message, Throwable... throwables);
}
