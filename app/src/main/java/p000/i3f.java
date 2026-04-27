package p000;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.sj3;
import p000.va8;
import p000.vn1;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
public final class i3f extends v2f<i3f> {

    /* JADX INFO: renamed from: u */
    public static final Logger f45599u = Logger.getLogger(i3f.class.getName());

    /* JADX INFO: renamed from: v */
    public static final gkb<? extends Executor> f45600v = baf.forResource(oc7.f67129K);

    /* JADX INFO: renamed from: w */
    public static final le7 f45601w = new C7131c();

    /* JADX INFO: renamed from: x */
    public static final bm3 f45602x = bm3.getDefaultInstance();

    /* JADX INFO: renamed from: y */
    public static final ho2 f45603y = ho2.getDefaultInstance();

    /* JADX INFO: renamed from: z */
    public static final long f45604z = TimeUnit.SECONDS.toMillis(120);

    /* JADX INFO: renamed from: e */
    public final InterfaceC7130b f45609e;

    /* JADX INFO: renamed from: q */
    @eib
    public d21 f45621q;

    /* JADX INFO: renamed from: t */
    @eib
    public x2f f45624t;

    /* JADX INFO: renamed from: a */
    public final va8.C13964b f45605a = new va8.C13964b();

    /* JADX INFO: renamed from: b */
    public final List<d4f> f45606b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List<j3f> f45607c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<y3f.AbstractC15412a> f45608d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public le7 f45610f = f45601w;

    /* JADX INFO: renamed from: g */
    public gkb<? extends Executor> f45611g = f45600v;

    /* JADX INFO: renamed from: h */
    public bm3 f45612h = f45602x;

    /* JADX INFO: renamed from: i */
    public ho2 f45613i = f45603y;

    /* JADX INFO: renamed from: j */
    public long f45614j = f45604z;

    /* JADX INFO: renamed from: k */
    public sj3.AbstractC12615c f45615k = sj3.getSystemTicker();

    /* JADX INFO: renamed from: l */
    public boolean f45616l = true;

    /* JADX INFO: renamed from: m */
    public boolean f45617m = true;

    /* JADX INFO: renamed from: n */
    public boolean f45618n = true;

    /* JADX INFO: renamed from: o */
    public boolean f45619o = false;

    /* JADX INFO: renamed from: p */
    public boolean f45620p = true;

    /* JADX INFO: renamed from: r */
    public da8 f45622r = da8.instance();

    /* JADX INFO: renamed from: s */
    public vn1.InterfaceC14172b f45623s = vn1.getDefaultFactory();

    /* JADX INFO: renamed from: i3f$b */
    public interface InterfaceC7130b {
        ob8 buildClientTransportServers(List<? extends y3f.AbstractC15412a> list);
    }

    /* JADX INFO: renamed from: i3f$c */
    public static final class C7131c extends le7 {
        private C7131c() {
        }

        @Override // p000.le7
        public List<p3f> getServices() {
            return Collections.emptyList();
        }

        @Override // p000.le7
        @eib
        public m3f<?, ?> lookupMethod(String str, @eib String str2) {
            return null;
        }
    }

    public i3f(InterfaceC7130b interfaceC7130b) {
        this.f45609e = (InterfaceC7130b) v7d.checkNotNull(interfaceC7130b, "clientTransportServersBuilder");
    }

    @hh4("ClientTransportServersBuilder is required, use a constructor")
    public static v2f<?> forPort(int i) {
        throw new UnsupportedOperationException("ClientTransportServersBuilder is required, use a constructor");
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public List<? extends y3f.AbstractC15412a> m12761a() {
        boolean z;
        y3f.AbstractC15412a abstractC15412a;
        ArrayList arrayList = new ArrayList();
        List<j3f> serverInterceptors = ua8.getServerInterceptors();
        List<y3f.AbstractC15412a> serverStreamTracerFactories = ua8.getServerStreamTracerFactories();
        if (serverInterceptors != null) {
            arrayList.addAll(serverStreamTracerFactories);
            this.f45607c.addAll(serverInterceptors);
            z = true;
        } else {
            z = false;
        }
        y3f.AbstractC15412a abstractC15412a2 = null;
        if (!z && this.f45616l) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class cls2 = Boolean.TYPE;
                abstractC15412a = (y3f.AbstractC15412a) cls.getDeclaredMethod("getServerStreamTracerFactory", cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.f45617m), Boolean.valueOf(this.f45618n), Boolean.valueOf(this.f45619o));
            } catch (ClassNotFoundException e) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                abstractC15412a = null;
            } catch (IllegalAccessException e2) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
                abstractC15412a = null;
            } catch (NoSuchMethodException e3) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
                abstractC15412a = null;
            } catch (InvocationTargetException e4) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
                abstractC15412a = null;
            }
            if (abstractC15412a != null) {
                arrayList.add(abstractC15412a);
            }
        }
        if (!z && this.f45620p) {
            try {
                abstractC15412a2 = (y3f.AbstractC15412a) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getServerStreamTracerFactory", null).invoke(null, null);
            } catch (ClassNotFoundException e5) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (IllegalAccessException e6) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (NoSuchMethodException e7) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            } catch (InvocationTargetException e8) {
                f45599u.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            }
            if (abstractC15412a2 != null) {
                arrayList.add(abstractC15412a2);
            }
        }
        arrayList.addAll(this.f45608d);
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p000.v2f
    public u2f build() {
        return new h3f(this, this.f45609e.buildClientTransportServers(m12761a()), fx2.f37909f);
    }

    public da8 getChannelz() {
        return this.f45622r;
    }

    public gkb<? extends Executor> getExecutorPool() {
        return this.f45611g;
    }

    public void setDeadlineTicker(sj3.AbstractC12615c abstractC12615c) {
        this.f45615k = (sj3.AbstractC12615c) v7d.checkNotNull(abstractC12615c, "ticker");
    }

    public void setStatsEnabled(boolean z) {
        this.f45616l = z;
    }

    public void setStatsRecordFinishedRpcs(boolean z) {
        this.f45618n = z;
    }

    public void setStatsRecordRealTimeMetrics(boolean z) {
        this.f45619o = z;
    }

    public void setStatsRecordStartedRpcs(boolean z) {
        this.f45617m = z;
    }

    public void setTracingEnabled(boolean z) {
        this.f45620p = z;
    }

    @Override // p000.v2f
    public i3f addStreamTracerFactory(y3f.AbstractC15412a abstractC15412a) {
        this.f45608d.add((y3f.AbstractC15412a) v7d.checkNotNull(abstractC15412a, "factory"));
        return this;
    }

    @Override // p000.v2f
    public i3f addTransportFilter(d4f d4fVar) {
        this.f45606b.add((d4f) v7d.checkNotNull(d4fVar, "filter"));
        return this;
    }

    @Override // p000.v2f
    public i3f callExecutor(x2f x2fVar) {
        this.f45624t = (x2f) v7d.checkNotNull(x2fVar);
        return this;
    }

    @Override // p000.v2f
    public i3f compressorRegistry(@eib ho2 ho2Var) {
        if (ho2Var == null) {
            ho2Var = f45603y;
        }
        this.f45613i = ho2Var;
        return this;
    }

    @Override // p000.v2f
    public i3f decompressorRegistry(@eib bm3 bm3Var) {
        if (bm3Var == null) {
            bm3Var = f45602x;
        }
        this.f45612h = bm3Var;
        return this;
    }

    @Override // p000.v2f
    public i3f directExecutor() {
        return executor(xya.directExecutor());
    }

    @Override // p000.v2f
    public i3f executor(@eib Executor executor) {
        this.f45611g = executor != null ? new c26<>(executor) : f45600v;
        return this;
    }

    @Override // p000.v2f
    public i3f fallbackHandlerRegistry(@eib le7 le7Var) {
        if (le7Var == null) {
            le7Var = f45601w;
        }
        this.f45610f = le7Var;
        return this;
    }

    @Override // p000.v2f
    public i3f handshakeTimeout(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "handshake timeout is %s, but must be positive", j);
        this.f45614j = ((TimeUnit) v7d.checkNotNull(timeUnit, "unit")).toMillis(j);
        return this;
    }

    @Override // p000.v2f
    public i3f intercept(j3f j3fVar) {
        this.f45607c.add((j3f) v7d.checkNotNull(j3fVar, "interceptor"));
        return this;
    }

    @Override // p000.v2f
    public i3f setBinaryLog(@eib d21 d21Var) {
        this.f45621q = d21Var;
        return this;
    }

    @Override // p000.v2f
    public i3f useTransportSecurity(File file, File file2) {
        throw new UnsupportedOperationException("TLS not supported in ServerImplBuilder");
    }

    @Override // p000.v2f
    public i3f addService(p3f p3fVar) {
        this.f45605a.m23898a((p3f) v7d.checkNotNull(p3fVar, "service"));
        return this;
    }

    @Override // p000.v2f
    public i3f addService(o21 o21Var) {
        return addService(((o21) v7d.checkNotNull(o21Var, "bindableService")).bindService());
    }
}
