package p000;

import android.util.Log;
import com.bumptech.glide.C2487c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.InterfaceC2493a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.cg3;
import p000.exd;
import p000.gl3;
import p000.ko5;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class fl3<R> implements cg3.InterfaceC2302a, Runnable, Comparable<fl3<?>>, ko5.InterfaceC8472f {

    /* JADX INFO: renamed from: m2 */
    public static final String f36991m2 = "DecodeJob";

    /* JADX INFO: renamed from: C */
    public C2487c f36992C;

    /* JADX INFO: renamed from: F */
    public eq8 f36993F;

    /* JADX INFO: renamed from: H */
    public Priority f36994H;

    /* JADX INFO: renamed from: L */
    public k25 f36995L;

    /* JADX INFO: renamed from: M */
    public int f36996M;

    /* JADX INFO: renamed from: M1 */
    public EnumC5877h f36997M1;

    /* JADX INFO: renamed from: N */
    public int f36998N;

    /* JADX INFO: renamed from: Q */
    public ne4 f36999Q;

    /* JADX INFO: renamed from: V1 */
    public EnumC5876g f37000V1;

    /* JADX INFO: renamed from: X */
    public i7c f37001X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC5871b<R> f37002Y;

    /* JADX INFO: renamed from: Z */
    public int f37003Z;

    /* JADX INFO: renamed from: Z1 */
    public long f37004Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f37006a2;

    /* JADX INFO: renamed from: b2 */
    public Object f37008b2;

    /* JADX INFO: renamed from: c2 */
    public Thread f37010c2;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5874e f37011d;

    /* JADX INFO: renamed from: d2 */
    public eq8 f37012d2;

    /* JADX INFO: renamed from: e */
    public final p4d.InterfaceC10791a<fl3<?>> f37013e;

    /* JADX INFO: renamed from: e2 */
    public eq8 f37014e2;

    /* JADX INFO: renamed from: f2 */
    public Object f37016f2;

    /* JADX INFO: renamed from: g2 */
    public hh3 f37017g2;

    /* JADX INFO: renamed from: h2 */
    public bg3<?> f37018h2;

    /* JADX INFO: renamed from: i2 */
    public volatile cg3 f37019i2;

    /* JADX INFO: renamed from: j2 */
    public volatile boolean f37020j2;

    /* JADX INFO: renamed from: k2 */
    public volatile boolean f37021k2;

    /* JADX INFO: renamed from: l2 */
    public boolean f37022l2;

    /* JADX INFO: renamed from: a */
    public final cl3<R> f37005a = new cl3<>();

    /* JADX INFO: renamed from: b */
    public final List<Throwable> f37007b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final b3g f37009c = b3g.newInstance();

    /* JADX INFO: renamed from: f */
    public final C5873d<?> f37015f = new C5873d<>();

    /* JADX INFO: renamed from: m */
    public final C5875f f37023m = new C5875f();

    /* JADX INFO: renamed from: fl3$a */
    public static /* synthetic */ class C5870a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37024a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f37025b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f37026c;

        static {
            int[] iArr = new int[g15.values().length];
            f37026c = iArr;
            try {
                iArr[g15.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37026c[g15.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC5877h.values().length];
            f37025b = iArr2;
            try {
                iArr2[EnumC5877h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37025b[EnumC5877h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37025b[EnumC5877h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37025b[EnumC5877h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37025b[EnumC5877h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC5876g.values().length];
            f37024a = iArr3;
            try {
                iArr3[EnumC5876g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37024a[EnumC5876g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37024a[EnumC5876g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: fl3$b */
    public interface InterfaceC5871b<R> {
        void onLoadFailed(a77 a77Var);

        void onResourceReady(t5e<R> t5eVar, hh3 hh3Var, boolean z);

        void reschedule(fl3<?> fl3Var);
    }

    /* JADX INFO: renamed from: fl3$c */
    public final class C5872c<Z> implements gl3.InterfaceC6374a<Z> {

        /* JADX INFO: renamed from: a */
        public final hh3 f37027a;

        public C5872c(hh3 hh3Var) {
            this.f37027a = hh3Var;
        }

        @Override // p000.gl3.InterfaceC6374a
        @efb
        public t5e<Z> onResourceDecoded(@efb t5e<Z> t5eVar) {
            return fl3.this.m10973b(this.f37027a, t5eVar);
        }
    }

    /* JADX INFO: renamed from: fl3$d */
    public static class C5873d<Z> {

        /* JADX INFO: renamed from: a */
        public eq8 f37029a;

        /* JADX INFO: renamed from: b */
        public g6e<Z> f37030b;

        /* JADX INFO: renamed from: c */
        public th9<Z> f37031c;

        /* JADX INFO: renamed from: a */
        public void m10976a() {
            this.f37029a = null;
            this.f37030b = null;
            this.f37031c = null;
        }

        /* JADX INFO: renamed from: b */
        public void m10977b(InterfaceC5874e interfaceC5874e, i7c i7cVar) {
            i77.beginSection("DecodeJob.encode");
            try {
                interfaceC5874e.getDiskCache().put(this.f37029a, new nf3(this.f37030b, this.f37031c, i7cVar));
            } finally {
                this.f37031c.m22522b();
                i77.endSection();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m10978c() {
            return this.f37031c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public <X> void m10979d(eq8 eq8Var, g6e<X> g6eVar, th9<X> th9Var) {
            this.f37029a = eq8Var;
            this.f37030b = g6eVar;
            this.f37031c = th9Var;
        }
    }

    /* JADX INFO: renamed from: fl3$e */
    public interface InterfaceC5874e {
        le4 getDiskCache();
    }

    /* JADX INFO: renamed from: fl3$f */
    public static class C5875f {

        /* JADX INFO: renamed from: a */
        public boolean f37032a;

        /* JADX INFO: renamed from: b */
        public boolean f37033b;

        /* JADX INFO: renamed from: c */
        public boolean f37034c;

        private boolean isComplete(boolean z) {
            return (this.f37034c || z || this.f37033b) && this.f37032a;
        }

        /* JADX INFO: renamed from: a */
        public synchronized boolean m10980a() {
            this.f37033b = true;
            return isComplete(false);
        }

        /* JADX INFO: renamed from: b */
        public synchronized boolean m10981b() {
            this.f37034c = true;
            return isComplete(false);
        }

        /* JADX INFO: renamed from: c */
        public synchronized boolean m10982c(boolean z) {
            this.f37032a = true;
            return isComplete(z);
        }

        /* JADX INFO: renamed from: d */
        public synchronized void m10983d() {
            this.f37033b = false;
            this.f37032a = false;
            this.f37034c = false;
        }
    }

    /* JADX INFO: renamed from: fl3$g */
    public enum EnumC5876g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: fl3$h */
    public enum EnumC5877h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public fl3(InterfaceC5874e interfaceC5874e, p4d.InterfaceC10791a<fl3<?>> interfaceC10791a) {
        this.f37011d = interfaceC5874e;
        this.f37013e = interfaceC10791a;
    }

    private <Data> t5e<R> decodeFromData(bg3<?> bg3Var, Data data, hh3 hh3Var) throws a77 {
        if (data == null) {
            bg3Var.cleanup();
            return null;
        }
        try {
            long logTime = si9.getLogTime();
            t5e<R> t5eVarDecodeFromFetcher = decodeFromFetcher(data, hh3Var);
            if (Log.isLoggable(f36991m2, 2)) {
                logWithTimeAndKey("Decoded result " + t5eVarDecodeFromFetcher, logTime);
            }
            return t5eVarDecodeFromFetcher;
        } finally {
            bg3Var.cleanup();
        }
    }

    private <Data> t5e<R> decodeFromFetcher(Data data, hh3 hh3Var) throws a77 {
        return runLoadPath(data, hh3Var, this.f37005a.m4026h(data.getClass()));
    }

    private void decodeFromRetrievedData() {
        t5e<R> t5eVarDecodeFromData;
        if (Log.isLoggable(f36991m2, 2)) {
            logWithTimeAndKey("Retrieved data", this.f37004Z1, "data: " + this.f37016f2 + ", cache key: " + this.f37012d2 + ", fetcher: " + this.f37018h2);
        }
        try {
            t5eVarDecodeFromData = decodeFromData(this.f37018h2, this.f37016f2, this.f37017g2);
        } catch (a77 e) {
            e.m173a(this.f37014e2, this.f37017g2);
            this.f37007b.add(e);
            t5eVarDecodeFromData = null;
        }
        if (t5eVarDecodeFromData != null) {
            notifyEncodeAndRelease(t5eVarDecodeFromData, this.f37017g2, this.f37022l2);
        } else {
            runGenerators();
        }
    }

    private cg3 getNextGenerator() {
        int i = C5870a.f37025b[this.f36997M1.ordinal()];
        if (i == 1) {
            return new v5e(this.f37005a, this);
        }
        if (i == 2) {
            return new lf3(this.f37005a, this);
        }
        if (i == 3) {
            return new ewf(this.f37005a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f36997M1);
    }

    private EnumC5877h getNextStage(EnumC5877h enumC5877h) {
        int i = C5870a.f37025b[enumC5877h.ordinal()];
        if (i == 1) {
            return this.f36999Q.decodeCachedData() ? EnumC5877h.DATA_CACHE : getNextStage(EnumC5877h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f37006a2 ? EnumC5877h.FINISHED : EnumC5877h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return EnumC5877h.FINISHED;
        }
        if (i == 5) {
            return this.f36999Q.decodeCachedResource() ? EnumC5877h.RESOURCE_CACHE : getNextStage(EnumC5877h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC5877h);
    }

    @efb
    private i7c getOptionsWithHardwareConfig(hh3 hh3Var) {
        i7c i7cVar = this.f37001X;
        boolean z = hh3Var == hh3.RESOURCE_DISK_CACHE || this.f37005a.m4042x();
        v6c<Boolean> v6cVar = in4.f47584k;
        Boolean bool = (Boolean) i7cVar.get(v6cVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return i7cVar;
        }
        i7c i7cVar2 = new i7c();
        i7cVar2.putAll(this.f37001X);
        i7cVar2.set(v6cVar, Boolean.valueOf(z));
        return i7cVar2;
    }

    private int getPriority() {
        return this.f36994H.ordinal();
    }

    private void logWithTimeAndKey(String str, long j) {
        logWithTimeAndKey(str, j, null);
    }

    private void notifyComplete(t5e<R> t5eVar, hh3 hh3Var, boolean z) {
        setNotifiedOrThrow();
        this.f37002Y.onResourceReady(t5eVar, hh3Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void notifyEncodeAndRelease(t5e<R> t5eVar, hh3 hh3Var, boolean z) {
        th9 th9Var;
        i77.beginSection("DecodeJob.notifyEncodeAndRelease");
        try {
            if (t5eVar instanceof l18) {
                ((l18) t5eVar).initialize();
            }
            if (this.f37015f.m10978c()) {
                t5eVar = th9.m22521a(t5eVar);
                th9Var = t5eVar;
            } else {
                th9Var = 0;
            }
            notifyComplete(t5eVar, hh3Var, z);
            this.f36997M1 = EnumC5877h.ENCODE;
            try {
                if (this.f37015f.m10978c()) {
                    this.f37015f.m10977b(this.f37011d, this.f37001X);
                }
                onEncodeComplete();
                i77.endSection();
            } finally {
                if (th9Var != 0) {
                    th9Var.m22522b();
                }
            }
        } catch (Throwable th) {
            i77.endSection();
            throw th;
        }
    }

    private void notifyFailed() {
        setNotifiedOrThrow();
        this.f37002Y.onLoadFailed(new a77("Failed to load resource", new ArrayList(this.f37007b)));
        onLoadFailed();
    }

    private void onEncodeComplete() {
        if (this.f37023m.m10980a()) {
            releaseInternal();
        }
    }

    private void onLoadFailed() {
        if (this.f37023m.m10981b()) {
            releaseInternal();
        }
    }

    private void releaseInternal() {
        this.f37023m.m10983d();
        this.f37015f.m10976a();
        this.f37005a.m4019a();
        this.f37020j2 = false;
        this.f36992C = null;
        this.f36993F = null;
        this.f37001X = null;
        this.f36994H = null;
        this.f36995L = null;
        this.f37002Y = null;
        this.f36997M1 = null;
        this.f37019i2 = null;
        this.f37010c2 = null;
        this.f37012d2 = null;
        this.f37016f2 = null;
        this.f37017g2 = null;
        this.f37018h2 = null;
        this.f37004Z1 = 0L;
        this.f37021k2 = false;
        this.f37008b2 = null;
        this.f37007b.clear();
        this.f37013e.release(this);
    }

    private void runGenerators() {
        this.f37010c2 = Thread.currentThread();
        this.f37004Z1 = si9.getLogTime();
        boolean zStartNext = false;
        while (!this.f37021k2 && this.f37019i2 != null && !(zStartNext = this.f37019i2.startNext())) {
            this.f36997M1 = getNextStage(this.f36997M1);
            this.f37019i2 = getNextGenerator();
            if (this.f36997M1 == EnumC5877h.SOURCE) {
                reschedule();
                return;
            }
        }
        if ((this.f36997M1 == EnumC5877h.FINISHED || this.f37021k2) && !zStartNext) {
            notifyFailed();
        }
    }

    private <Data, ResourceType> t5e<R> runLoadPath(Data data, hh3 hh3Var, pc9<Data, ResourceType, R> pc9Var) throws a77 {
        i7c optionsWithHardwareConfig = getOptionsWithHardwareConfig(hh3Var);
        InterfaceC2493a<Data> rewinder = this.f36992C.getRegistry().getRewinder(data);
        try {
            return pc9Var.load(rewinder, optionsWithHardwareConfig, this.f36996M, this.f36998N, new C5872c(hh3Var));
        } finally {
            rewinder.cleanup();
        }
    }

    private void runWrapped() {
        int i = C5870a.f37024a[this.f37000V1.ordinal()];
        if (i == 1) {
            this.f36997M1 = getNextStage(EnumC5877h.INITIALIZE);
            this.f37019i2 = getNextGenerator();
            runGenerators();
        } else if (i == 2) {
            runGenerators();
        } else {
            if (i == 3) {
                decodeFromRetrievedData();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f37000V1);
        }
    }

    private void setNotifiedOrThrow() {
        Throwable th;
        this.f37009c.throwIfRecycled();
        if (!this.f37020j2) {
            this.f37020j2 = true;
            return;
        }
        if (this.f37007b.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f37007b;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* JADX INFO: renamed from: a */
    public fl3<R> m10972a(C2487c c2487c, Object obj, k25 k25Var, eq8 eq8Var, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, ne4 ne4Var, Map<Class<?>, ceh<?>> map, boolean z, boolean z2, boolean z3, i7c i7cVar, InterfaceC5871b<R> interfaceC5871b, int i3) {
        this.f37005a.m4040v(c2487c, obj, eq8Var, i, i2, ne4Var, cls, cls2, priority, i7cVar, map, z, z2, this.f37011d);
        this.f36992C = c2487c;
        this.f36993F = eq8Var;
        this.f36994H = priority;
        this.f36995L = k25Var;
        this.f36996M = i;
        this.f36998N = i2;
        this.f36999Q = ne4Var;
        this.f37006a2 = z3;
        this.f37001X = i7cVar;
        this.f37002Y = interfaceC5871b;
        this.f37003Z = i3;
        this.f37000V1 = EnumC5876g.INITIALIZE;
        this.f37008b2 = obj;
        return this;
    }

    @efb
    /* JADX INFO: renamed from: b */
    public <Z> t5e<Z> m10973b(hh3 hh3Var, @efb t5e<Z> t5eVar) {
        t5e<Z> t5eVarTransform;
        ceh<Z> cehVar;
        g15 encodeStrategy;
        eq8 mf3Var;
        Class<?> cls = t5eVar.get().getClass();
        g6e<Z> g6eVarM4032n = null;
        if (hh3Var != hh3.RESOURCE_DISK_CACHE) {
            ceh<Z> cehVarM4037s = this.f37005a.m4037s(cls);
            cehVar = cehVarM4037s;
            t5eVarTransform = cehVarM4037s.transform(this.f36992C, t5eVar, this.f36996M, this.f36998N);
        } else {
            t5eVarTransform = t5eVar;
            cehVar = null;
        }
        if (!t5eVar.equals(t5eVarTransform)) {
            t5eVar.recycle();
        }
        if (this.f37005a.m4041w(t5eVarTransform)) {
            g6eVarM4032n = this.f37005a.m4032n(t5eVarTransform);
            encodeStrategy = g6eVarM4032n.getEncodeStrategy(this.f37001X);
        } else {
            encodeStrategy = g15.NONE;
        }
        g6e g6eVar = g6eVarM4032n;
        if (!this.f36999Q.isResourceCacheable(!this.f37005a.m4043y(this.f37012d2), hh3Var, encodeStrategy)) {
            return t5eVarTransform;
        }
        if (g6eVar == null) {
            throw new exd.C5512d(t5eVarTransform.get().getClass());
        }
        int i = C5870a.f37026c[encodeStrategy.ordinal()];
        if (i == 1) {
            mf3Var = new mf3(this.f37012d2, this.f36993F);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            mf3Var = new w5e(this.f37005a.m4020b(), this.f37012d2, this.f36993F, this.f36996M, this.f36998N, cehVar, cls, this.f37001X);
        }
        th9 th9VarM22521a = th9.m22521a(t5eVarTransform);
        this.f37015f.m10979d(mf3Var, g6eVar, th9VarM22521a);
        return th9VarM22521a;
    }

    /* JADX INFO: renamed from: c */
    public void m10974c(boolean z) {
        if (this.f37023m.m10982c(z)) {
            releaseInternal();
        }
    }

    public void cancel() {
        this.f37021k2 = true;
        cg3 cg3Var = this.f37019i2;
        if (cg3Var != null) {
            cg3Var.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m10975d() {
        EnumC5877h nextStage = getNextStage(EnumC5877h.INITIALIZE);
        return nextStage == EnumC5877h.RESOURCE_CACHE || nextStage == EnumC5877h.DATA_CACHE;
    }

    @Override // p000.ko5.InterfaceC8472f
    @efb
    public b3g getVerifier() {
        return this.f37009c;
    }

    @Override // p000.cg3.InterfaceC2302a
    public void onDataFetcherFailed(eq8 eq8Var, Exception exc, bg3<?> bg3Var, hh3 hh3Var) {
        bg3Var.cleanup();
        a77 a77Var = new a77("Fetching data failed", exc);
        a77Var.m174b(eq8Var, hh3Var, bg3Var.getDataClass());
        this.f37007b.add(a77Var);
        if (Thread.currentThread() == this.f37010c2) {
            runGenerators();
        } else {
            this.f37000V1 = EnumC5876g.SWITCH_TO_SOURCE_SERVICE;
            this.f37002Y.reschedule(this);
        }
    }

    @Override // p000.cg3.InterfaceC2302a
    public void onDataFetcherReady(eq8 eq8Var, Object obj, bg3<?> bg3Var, hh3 hh3Var, eq8 eq8Var2) {
        this.f37012d2 = eq8Var;
        this.f37016f2 = obj;
        this.f37018h2 = bg3Var;
        this.f37017g2 = hh3Var;
        this.f37014e2 = eq8Var2;
        this.f37022l2 = eq8Var != this.f37005a.m4021c().get(0);
        if (Thread.currentThread() != this.f37010c2) {
            this.f37000V1 = EnumC5876g.DECODE_DATA;
            this.f37002Y.reschedule(this);
        } else {
            i77.beginSection("DecodeJob.decodeFromRetrievedData");
            try {
                decodeFromRetrievedData();
            } finally {
                i77.endSection();
            }
        }
    }

    @Override // p000.cg3.InterfaceC2302a
    public void reschedule() {
        this.f37000V1 = EnumC5876g.SWITCH_TO_SOURCE_SERVICE;
        this.f37002Y.reschedule(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i77.beginSectionFormat("DecodeJob#run(reason=%s, model=%s)", this.f37000V1, this.f37008b2);
        bg3<?> bg3Var = this.f37018h2;
        try {
            try {
                if (this.f37021k2) {
                    notifyFailed();
                    if (bg3Var != null) {
                        bg3Var.cleanup();
                    }
                    i77.endSection();
                    return;
                }
                runWrapped();
                if (bg3Var != null) {
                    bg3Var.cleanup();
                }
                i77.endSection();
            } catch (ho1 e) {
                throw e;
            } catch (Throwable th) {
                if (Log.isLoggable(f36991m2, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DecodeJob threw unexpectedly, isCancelled: ");
                    sb.append(this.f37021k2);
                    sb.append(", stage: ");
                    sb.append(this.f36997M1);
                }
                if (this.f36997M1 != EnumC5877h.ENCODE) {
                    this.f37007b.add(th);
                    notifyFailed();
                }
                if (!this.f37021k2) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (bg3Var != null) {
                bg3Var.cleanup();
            }
            i77.endSection();
            throw th2;
        }
    }

    private void logWithTimeAndKey(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(si9.getElapsedMillis(j));
        sb.append(", load key: ");
        sb.append(this.f36995L);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb fl3<?> fl3Var) {
        int priority = getPriority() - fl3Var.getPriority();
        return priority == 0 ? this.f37003Z - fl3Var.f37003Z : priority;
    }
}
