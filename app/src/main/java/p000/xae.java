package p000;

import com.google.android.gms.actions.SearchIntents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class xae implements zfg, yfg {

    /* JADX INFO: renamed from: H */
    public static final int f97370H = 15;

    /* JADX INFO: renamed from: L */
    public static final int f97371L = 10;

    /* JADX INFO: renamed from: N */
    public static final int f97373N = 1;

    /* JADX INFO: renamed from: Q */
    public static final int f97374Q = 2;

    /* JADX INFO: renamed from: X */
    public static final int f97375X = 3;

    /* JADX INFO: renamed from: Y */
    public static final int f97376Y = 4;

    /* JADX INFO: renamed from: Z */
    public static final int f97377Z = 5;

    /* JADX INFO: renamed from: C */
    public int f97378C;

    /* JADX INFO: renamed from: a */
    @fdi
    public final int f97379a;

    /* JADX INFO: renamed from: b */
    @gib
    public volatile String f97380b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final long[] f97381c;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final double[] f97382d;

    /* JADX INFO: renamed from: e */
    @un8
    @yfb
    public final String[] f97383e;

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public final byte[][] f97384f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final int[] f97385m;

    /* JADX INFO: renamed from: F */
    @yfb
    public static final C15016b f97369F = new C15016b(null);

    /* JADX INFO: renamed from: M */
    @un8
    @yfb
    public static final TreeMap<Integer, xae> f97372M = new TreeMap<>();

    /* JADX INFO: renamed from: xae$a */
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15015a {
    }

    /* JADX INFO: renamed from: xae$b */
    public static final class C15016b {

        /* JADX INFO: renamed from: xae$b$a */
        public static final class a implements yfg {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ xae f97386a;

            public a(xae xaeVar) {
                this.f97386a = xaeVar;
            }

            @Override // p000.yfg
            public void bindBlob(int i, @yfb byte[] bArr) {
                md8.checkNotNullParameter(bArr, "value");
                this.f97386a.bindBlob(i, bArr);
            }

            @Override // p000.yfg
            public void bindDouble(int i, double d) {
                this.f97386a.bindDouble(i, d);
            }

            @Override // p000.yfg
            public void bindLong(int i, long j) {
                this.f97386a.bindLong(i, j);
            }

            @Override // p000.yfg
            public void bindNull(int i) {
                this.f97386a.bindNull(i);
            }

            @Override // p000.yfg
            public void bindString(int i, @yfb String str) {
                md8.checkNotNullParameter(str, "value");
                this.f97386a.bindString(i, str);
            }

            @Override // p000.yfg
            public void clearBindings() {
                this.f97386a.clearBindings();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f97386a.close();
            }
        }

        public /* synthetic */ C15016b(jt3 jt3Var) {
            this();
        }

        @fdi
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        @fdi
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        @fdi
        public static /* synthetic */ void getQueryPool$annotations() {
        }

        @do8
        @yfb
        public final xae acquire(@yfb String str, int i) {
            md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
            TreeMap<Integer, xae> treeMap = xae.f97372M;
            synchronized (treeMap) {
                Map.Entry<Integer, xae> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    bth bthVar = bth.f14751a;
                    xae xaeVar = new xae(i, null);
                    xaeVar.init(str, i);
                    return xaeVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                xae value = entryCeilingEntry.getValue();
                value.init(str, i);
                md8.checkNotNullExpressionValue(value, "sqliteQuery");
                return value;
            }
        }

        @do8
        @yfb
        public final xae copyFrom(@yfb zfg zfgVar) {
            md8.checkNotNullParameter(zfgVar, "supportSQLiteQuery");
            xae xaeVarAcquire = acquire(zfgVar.getSql(), zfgVar.getArgCount());
            zfgVar.bindTo(new a(xaeVarAcquire));
            return xaeVarAcquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, xae> treeMap = xae.f97372M;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            md8.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }

        private C15016b() {
        }
    }

    public /* synthetic */ xae(int i, jt3 jt3Var) {
        this(i);
    }

    @do8
    @yfb
    public static final xae acquire(@yfb String str, int i) {
        return f97369F.acquire(str, i);
    }

    @do8
    @yfb
    public static final xae copyFrom(@yfb zfg zfgVar) {
        return f97369F.copyFrom(zfgVar);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    @fdi
    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    @fdi
    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    @fdi
    public static /* synthetic */ void getLongBindings$annotations() {
    }

    @fdi
    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // p000.yfg
    public void bindBlob(int i, @yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "value");
        this.f97385m[i] = 5;
        this.f97384f[i] = bArr;
    }

    @Override // p000.yfg
    public void bindDouble(int i, double d) {
        this.f97385m[i] = 3;
        this.f97382d[i] = d;
    }

    @Override // p000.yfg
    public void bindLong(int i, long j) {
        this.f97385m[i] = 2;
        this.f97381c[i] = j;
    }

    @Override // p000.yfg
    public void bindNull(int i) {
        this.f97385m[i] = 1;
    }

    @Override // p000.yfg
    public void bindString(int i, @yfb String str) {
        md8.checkNotNullParameter(str, "value");
        this.f97385m[i] = 4;
        this.f97383e[i] = str;
    }

    @Override // p000.zfg
    public void bindTo(@yfb yfg yfgVar) {
        md8.checkNotNullParameter(yfgVar, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.f97385m[i];
            if (i2 == 1) {
                yfgVar.bindNull(i);
            } else if (i2 == 2) {
                yfgVar.bindLong(i, this.f97381c[i]);
            } else if (i2 == 3) {
                yfgVar.bindDouble(i, this.f97382d[i]);
            } else if (i2 == 4) {
                String str = this.f97383e[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                yfgVar.bindString(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.f97384f[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                yfgVar.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.yfg
    public void clearBindings() {
        Arrays.fill(this.f97385m, 1);
        Arrays.fill(this.f97383e, (Object) null);
        Arrays.fill(this.f97384f, (Object) null);
        this.f97380b = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void copyArgumentsFrom(@yfb xae xaeVar) {
        md8.checkNotNullParameter(xaeVar, "other");
        int argCount = xaeVar.getArgCount() + 1;
        System.arraycopy(xaeVar.f97385m, 0, this.f97385m, 0, argCount);
        System.arraycopy(xaeVar.f97381c, 0, this.f97381c, 0, argCount);
        System.arraycopy(xaeVar.f97383e, 0, this.f97383e, 0, argCount);
        System.arraycopy(xaeVar.f97384f, 0, this.f97384f, 0, argCount);
        System.arraycopy(xaeVar.f97382d, 0, this.f97382d, 0, argCount);
    }

    @Override // p000.zfg
    public int getArgCount() {
        return this.f97378C;
    }

    public final int getCapacity() {
        return this.f97379a;
    }

    @Override // p000.zfg
    @yfb
    public String getSql() {
        String str = this.f97380b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void init(@yfb String str, int i) {
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        this.f97380b = str;
        this.f97378C = i;
    }

    public final void release() {
        TreeMap<Integer, xae> treeMap = f97372M;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f97379a), this);
            f97369F.prunePoolLocked$room_runtime_release();
            bth bthVar = bth.f14751a;
        }
    }

    private xae(int i) {
        this.f97379a = i;
        int i2 = i + 1;
        this.f97385m = new int[i2];
        this.f97381c = new long[i2];
        this.f97382d = new double[i2];
        this.f97383e = new String[i2];
        this.f97384f = new byte[i2][];
    }
}
