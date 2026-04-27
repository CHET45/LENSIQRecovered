package p000;

import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xh9 {

    /* JADX INFO: renamed from: a */
    public static final int f97841a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f97842b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f97843c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f97844d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f97845e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    @xc7("lock")
    public static int f97847g = 0;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    public static boolean f97848h = true;

    /* JADX INFO: renamed from: f */
    public static final Object f97846f = new Object();

    /* JADX INFO: renamed from: i */
    @xc7("lock")
    public static InterfaceC15083b f97849i = InterfaceC15083b.f97850a;

    /* JADX INFO: renamed from: xh9$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15082a {
    }

    /* JADX INFO: renamed from: xh9$b */
    public interface InterfaceC15083b {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC15083b f97850a = new a();

        /* JADX INFO: renamed from: xh9$b$a */
        public class a implements InterfaceC15083b {
            @Override // p000.xh9.InterfaceC15083b
            /* JADX INFO: renamed from: d */
            public void mo25150d(String str, String str2, @hib Throwable th) {
                xh9.appendThrowableString(str2, th);
            }

            @Override // p000.xh9.InterfaceC15083b
            /* JADX INFO: renamed from: e */
            public void mo25151e(String str, String str2, @hib Throwable th) {
                Log.e(str, xh9.appendThrowableString(str2, th));
            }

            @Override // p000.xh9.InterfaceC15083b
            /* JADX INFO: renamed from: i */
            public void mo25152i(String str, String str2, @hib Throwable th) {
                Log.i(str, xh9.appendThrowableString(str2, th));
            }

            @Override // p000.xh9.InterfaceC15083b
            /* JADX INFO: renamed from: w */
            public void mo25153w(String str, String str2, @hib Throwable th) {
                Log.w(str, xh9.appendThrowableString(str2, th));
            }
        }

        /* JADX INFO: renamed from: d */
        void mo25150d(String str, String str2, @hib Throwable th);

        /* JADX INFO: renamed from: e */
        void mo25151e(String str, String str2, @hib Throwable th);

        /* JADX INFO: renamed from: i */
        void mo25152i(String str, String str2, @hib Throwable th);

        /* JADX INFO: renamed from: w */
        void mo25153w(String str, String str2, @hib Throwable th);
    }

    private xh9() {
    }

    @bkd
    public static String appendThrowableString(String str, @hib Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
    }

    @bkd
    /* JADX INFO: renamed from: d */
    public static void m25142d(@zpf(max = 23) String str, String str2) {
        synchronized (f97846f) {
            try {
                if (f97847g == 0) {
                    f97849i.mo25150d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: e */
    public static void m25144e(@zpf(max = 23) String str, String str2) {
        synchronized (f97846f) {
            try {
                if (f97847g <= 3) {
                    f97849i.mo25151e(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @bkd
    public static int getLogLevel() {
        int i;
        synchronized (f97846f) {
            i = f97847g;
        }
        return i;
    }

    @bkd
    @hib
    public static String getThrowableString(@hib Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f97846f) {
            try {
                if (isCausedByUnknownHostException(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f97848h) {
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
    public static void m25146i(@zpf(max = 23) String str, String str2) {
        synchronized (f97846f) {
            try {
                if (f97847g <= 1) {
                    f97849i.mo25152i(str, str2, null);
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
        synchronized (f97846f) {
            f97847g = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (f97846f) {
            f97848h = z;
        }
    }

    public static void setLogger(InterfaceC15083b interfaceC15083b) {
        synchronized (f97846f) {
            f97849i = interfaceC15083b;
        }
    }

    @bkd
    /* JADX INFO: renamed from: w */
    public static void m25148w(@zpf(max = 23) String str, String str2) {
        synchronized (f97846f) {
            try {
                if (f97847g <= 2) {
                    f97849i.mo25153w(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: d */
    public static void m25143d(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        synchronized (f97846f) {
            try {
                if (f97847g == 0) {
                    f97849i.mo25150d(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: e */
    public static void m25145e(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        synchronized (f97846f) {
            try {
                if (f97847g <= 3) {
                    f97849i.mo25151e(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: i */
    public static void m25147i(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        synchronized (f97846f) {
            try {
                if (f97847g <= 1) {
                    f97849i.mo25152i(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @bkd
    /* JADX INFO: renamed from: w */
    public static void m25149w(@zpf(max = 23) String str, String str2, @hib Throwable th) {
        synchronized (f97846f) {
            try {
                if (f97847g <= 2) {
                    f97849i.mo25153w(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
