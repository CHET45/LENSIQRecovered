package p000;

import android.content.Context;
import java.io.File;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class bt8 {

    /* JADX INFO: renamed from: a */
    public static boolean f14721a = false;

    /* JADX INFO: renamed from: b */
    public static final String f14722b = "LOTTIE";

    /* JADX INFO: renamed from: c */
    public static final int f14723c = 20;

    /* JADX INFO: renamed from: d */
    public static boolean f14724d;

    /* JADX INFO: renamed from: e */
    public static String[] f14725e;

    /* JADX INFO: renamed from: f */
    public static long[] f14726f;

    /* JADX INFO: renamed from: g */
    public static int f14727g;

    /* JADX INFO: renamed from: h */
    public static int f14728h;

    /* JADX INFO: renamed from: i */
    public static ro9 f14729i;

    /* JADX INFO: renamed from: j */
    public static qo9 f14730j;

    /* JADX INFO: renamed from: k */
    public static volatile jbb f14731k;

    /* JADX INFO: renamed from: l */
    public static volatile ebb f14732l;

    /* JADX INFO: renamed from: bt8$a */
    public class C2048a implements qo9 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f14733a;

        public C2048a(Context context) {
            this.f14733a = context;
        }

        @Override // p000.qo9
        @efb
        public File getCacheDir() {
            return new File(this.f14733a.getCacheDir(), "lottie_network_cache");
        }
    }

    private bt8() {
    }

    public static void beginSection(String str) {
        if (f14724d) {
            int i = f14727g;
            if (i == 20) {
                f14728h++;
                return;
            }
            f14725e[i] = str;
            f14726f[i] = System.nanoTime();
            t5h.beginSection(str);
            f14727g++;
        }
    }

    public static float endSection(String str) {
        int i = f14728h;
        if (i > 0) {
            f14728h = i - 1;
            return 0.0f;
        }
        if (!f14724d) {
            return 0.0f;
        }
        int i2 = f14727g - 1;
        f14727g = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f14725e[i2])) {
            t5h.endSection();
            return (System.nanoTime() - f14726f[f14727g]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f14725e[f14727g] + ".");
    }

    @efb
    public static ebb networkCache(@efb Context context) {
        Context applicationContext = context.getApplicationContext();
        ebb ebbVar = f14732l;
        if (ebbVar == null) {
            synchronized (ebb.class) {
                try {
                    ebbVar = f14732l;
                    if (ebbVar == null) {
                        qo9 c2048a = f14730j;
                        if (c2048a == null) {
                            c2048a = new C2048a(applicationContext);
                        }
                        ebbVar = new ebb(c2048a);
                        f14732l = ebbVar;
                    }
                } finally {
                }
            }
        }
        return ebbVar;
    }

    @efb
    public static jbb networkFetcher(@efb Context context) {
        jbb jbbVar = f14731k;
        if (jbbVar == null) {
            synchronized (jbb.class) {
                try {
                    jbbVar = f14731k;
                    if (jbbVar == null) {
                        ebb ebbVarNetworkCache = networkCache(context);
                        ro9 rw3Var = f14729i;
                        if (rw3Var == null) {
                            rw3Var = new rw3();
                        }
                        jbbVar = new jbb(ebbVarNetworkCache, rw3Var);
                        f14731k = jbbVar;
                    }
                } finally {
                }
            }
        }
        return jbbVar;
    }

    public static void setCacheProvider(qo9 qo9Var) {
        f14730j = qo9Var;
    }

    public static void setFetcher(ro9 ro9Var) {
        f14729i = ro9Var;
    }

    public static void setTraceEnabled(boolean z) {
        if (f14724d == z) {
            return;
        }
        f14724d = z;
        if (z) {
            f14725e = new String[20];
            f14726f = new long[20];
        }
    }
}
