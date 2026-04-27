package p000;

import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yh9 {

    /* JADX INFO: renamed from: a */
    public static final int f101510a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f101511b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f101512c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f101513d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f101514e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    @xc7("lock")
    public static int f101516g = 0;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    public static boolean f101517h = true;

    /* JADX INFO: renamed from: f */
    public static final Object f101515f = new Object();

    /* JADX INFO: renamed from: i */
    @xc7("lock")
    public static InterfaceC15667b f101518i = InterfaceC15667b.f101519a;

    /* JADX INFO: renamed from: yh9$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15666a {
    }

    /* JADX INFO: renamed from: yh9$b */
    public interface InterfaceC15667b {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC15667b f101519a = new a();

        /* JADX INFO: renamed from: yh9$b$a */
        public class a implements InterfaceC15667b {
            @Override // p000.yh9.InterfaceC15667b
            /* JADX INFO: renamed from: d */
            public void mo25921d(String str, String str2) {
            }

            @Override // p000.yh9.InterfaceC15667b
            /* JADX INFO: renamed from: e */
            public void mo25922e(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // p000.yh9.InterfaceC15667b
            /* JADX INFO: renamed from: i */
            public void mo25923i(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // p000.yh9.InterfaceC15667b
            /* JADX INFO: renamed from: w */
            public void mo25924w(String str, String str2) {
                Log.w(str, str2);
            }
        }

        /* JADX INFO: renamed from: d */
        void mo25921d(String str, String str2);

        /* JADX INFO: renamed from: e */
        void mo25922e(String str, String str2);

        /* JADX INFO: renamed from: i */
        void mo25923i(String str, String str2);

        /* JADX INFO: renamed from: w */
        void mo25924w(String str, String str2);
    }

    private yh9() {
    }

    @bkd
    private static String appendThrowableString(String str, @hib Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
    }

    @bkd
    /* JADX INFO: renamed from: d */
    public static void m25913d(@zpf(max = 23) String str, String str2) {
        synchronized (f101515f) {
            try {
                if (f101516g == 0) {
                    f101518i.mo25921d(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: e */
    public static void m25915e(@zpf(max = 23) String str, String str2) {
        synchronized (f101515f) {
            try {
                if (f101516g <= 3) {
                    f101518i.mo25922e(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @bkd
    public static int getLogLevel() {
        int i;
        synchronized (f101515f) {
            i = f101516g;
        }
        return i;
    }

    @bkd
    @hib
    public static String getThrowableString(@hib Throwable th) {
        synchronized (f101515f) {
            try {
                if (th == null) {
                    return null;
                }
                if (isCausedByUnknownHostException(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f101517h) {
                    return Log.getStackTraceString(th).trim().replace("\t", pl8.f71328a);
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: i */
    public static void m25917i(@zpf(max = 23) String str, String str2) {
        synchronized (f101515f) {
            try {
                if (f101516g <= 1) {
                    f101518i.mo25923i(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @bkd
    private static boolean isCausedByUnknownHostException(@hib Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        synchronized (f101515f) {
            f101516g = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (f101515f) {
            f101517h = z;
        }
    }

    public static void setLogger(InterfaceC15667b interfaceC15667b) {
        synchronized (f101515f) {
            f101518i = interfaceC15667b;
        }
    }

    @bkd
    /* JADX INFO: renamed from: w */
    public static void m25919w(@zpf(max = 23) String str, String str2) {
        synchronized (f101515f) {
            try {
                if (f101516g <= 2) {
                    f101518i.mo25924w(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: d */
    public static void m25914d(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        m25913d(str, appendThrowableString(str2, th));
    }

    @bkd
    /* JADX INFO: renamed from: e */
    public static void m25916e(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        m25915e(str, appendThrowableString(str2, th));
    }

    @bkd
    /* JADX INFO: renamed from: i */
    public static void m25918i(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        m25917i(str, appendThrowableString(str2, th));
    }

    @bkd
    /* JADX INFO: renamed from: w */
    public static void m25920w(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        m25919w(str, appendThrowableString(str2, th));
    }
}
