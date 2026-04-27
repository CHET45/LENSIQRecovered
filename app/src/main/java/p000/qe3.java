package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p000.a32;
import p000.d84;
import p000.rr2;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@ue3
public final class qe3 {

    /* JADX INFO: renamed from: qe3$b */
    public static final class C11446b implements a32.InterfaceC0029b {

        /* JADX INFO: renamed from: a */
        public Context f74099a;

        private C11446b() {
        }

        @Override // p000.a32.InterfaceC0029b
        public a32 build() {
            s7d.checkBuilderRequirement(this.f74099a, Context.class);
            return new C11447c(this.f74099a);
        }

        @Override // p000.a32.InterfaceC0029b
        public C11446b applicationContext(Context context) {
            this.f74099a = (Context) s7d.checkNotNull(context);
            return this;
        }
    }

    /* JADX INFO: renamed from: qe3$c */
    public static final class C11447c implements a32 {

        /* JADX INFO: renamed from: A */
        public hid<e84> f74100A;

        /* JADX INFO: renamed from: B */
        public hid<d84.InterfaceC4665a> f74101B;

        /* JADX INFO: renamed from: C */
        public hid<dfe> f74102C;

        /* JADX INFO: renamed from: D */
        public hid<hf8> f74103D;

        /* JADX INFO: renamed from: E */
        public hid<lb8> f74104E;

        /* JADX INFO: renamed from: F */
        public hid<rne> f74105F;

        /* JADX INFO: renamed from: G */
        public hid<vne> f74106G;

        /* JADX INFO: renamed from: H */
        public hid<C15808yu> f74107H;

        /* JADX INFO: renamed from: I */
        public hid<xne> f74108I;

        /* JADX INFO: renamed from: J */
        public hid<zne> f74109J;

        /* JADX INFO: renamed from: K */
        public hid<une> f74110K;

        /* JADX INFO: renamed from: L */
        public hid<fne> f74111L;

        /* JADX INFO: renamed from: M */
        public hid<hne> f74112M;

        /* JADX INFO: renamed from: N */
        public hid<ene> f74113N;

        /* JADX INFO: renamed from: O */
        public hid<wb8> f74114O;

        /* JADX INFO: renamed from: P */
        public hid<woe> f74115P;

        /* JADX INFO: renamed from: Q */
        public hid<ExecutorService> f74116Q;

        /* JADX INFO: renamed from: R */
        public hid<a32.InterfaceC0030c> f74117R;

        /* JADX INFO: renamed from: S */
        public hid<ho0> f74118S;

        /* JADX INFO: renamed from: T */
        public hid<String[][]> f74119T;

        /* JADX INFO: renamed from: U */
        public hid<jy1> f74120U;

        /* JADX INFO: renamed from: V */
        public hid<see> f74121V;

        /* JADX INFO: renamed from: W */
        public hid<jee> f74122W;

        /* JADX INFO: renamed from: a */
        public final Context f74123a;

        /* JADX INFO: renamed from: b */
        public final C11447c f74124b;

        /* JADX INFO: renamed from: c */
        public hid<Context> f74125c;

        /* JADX INFO: renamed from: d */
        public hid<ContentResolver> f74126d;

        /* JADX INFO: renamed from: e */
        public hid<LocationManager> f74127e;

        /* JADX INFO: renamed from: f */
        public hid<my1> f74128f;

        /* JADX INFO: renamed from: g */
        public hid<oy1> f74129g;

        /* JADX INFO: renamed from: h */
        public hid<Integer> f74130h;

        /* JADX INFO: renamed from: i */
        public hid<Boolean> f74131i;

        /* JADX INFO: renamed from: j */
        public hid<String[][]> f74132j;

        /* JADX INFO: renamed from: k */
        public hid<qy1> f74133k;

        /* JADX INFO: renamed from: l */
        public hid<Boolean> f74134l;

        /* JADX INFO: renamed from: m */
        public hid<dh9> f74135m;

        /* JADX INFO: renamed from: n */
        public hid<fh9> f74136n;

        /* JADX INFO: renamed from: o */
        public hid<BluetoothManager> f74137o;

        /* JADX INFO: renamed from: p */
        public hid<g91> f74138p;

        /* JADX INFO: renamed from: q */
        public hid<hee> f74139q;

        /* JADX INFO: renamed from: r */
        public hid<ExecutorService> f74140r;

        /* JADX INFO: renamed from: s */
        public hid<woe> f74141s;

        /* JADX INFO: renamed from: t */
        public hid<h42> f74142t;

        /* JADX INFO: renamed from: u */
        public hid<g42> f74143u;

        /* JADX INFO: renamed from: v */
        public hid<fee> f74144v;

        /* JADX INFO: renamed from: w */
        public hid<ah9> f74145w;

        /* JADX INFO: renamed from: x */
        public hid<xg9> f74146x;

        /* JADX INFO: renamed from: y */
        public hid<vkb<Boolean>> f74147y;

        /* JADX INFO: renamed from: z */
        public hid<m42> f74148z;

        /* JADX INFO: renamed from: qe3$c$a */
        public class a implements hid<d84.InterfaceC4665a> {
            public a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.hid
            public d84.InterfaceC4665a get() {
                return new C11450f(C11447c.this.f74124b);
            }
        }

        private void initialize(Context context) {
            jo5 jo5VarCreate = p58.create(context);
            this.f74125c = jo5VarCreate;
            this.f74126d = i32.create(jo5VarCreate);
            r32 r32VarCreate = r32.create(this.f74125c);
            this.f74127e = r32VarCreate;
            this.f74128f = ny1.create(this.f74126d, r32VarCreate);
            this.f74129g = zj4.provider(py1.create(this.f74125c));
            this.f74130h = y32.create(this.f74125c);
            this.f74131i = zj4.provider(q32.create(this.f74125c));
            v32 v32VarCreate = v32.create(j32.create(), this.f74130h, this.f74131i);
            this.f74132j = v32VarCreate;
            this.f74133k = zj4.provider(ry1.create(this.f74129g, v32VarCreate));
            this.f74134l = o32.create(this.f74125c, j32.create());
            this.f74135m = eh9.create(this.f74128f, this.f74133k, this.f74130h, j32.create(), this.f74134l);
            this.f74136n = gh9.create(this.f74128f, this.f74133k, this.f74134l, this.f74131i);
            f32 f32VarCreate = f32.create(this.f74125c);
            this.f74137o = f32VarCreate;
            this.f74138p = h91.create(f32VarCreate);
            this.f74139q = iee.create(b32.create());
            hid<ExecutorService> hidVarProvider = zj4.provider(d32.create());
            this.f74140r = hidVarProvider;
            hid<woe> hidVarProvider2 = zj4.provider(e32.create(hidVarProvider));
            this.f74141s = hidVarProvider2;
            i42 i42VarCreate = i42.create(hidVarProvider2);
            this.f74142t = i42VarCreate;
            this.f74143u = zj4.provider(i42VarCreate);
            this.f74144v = gee.create(this.f74125c);
            t32 t32VarCreate = t32.create(j32.create(), ch9.create(), this.f74135m, this.f74136n);
            this.f74145w = t32VarCreate;
            this.f74146x = yg9.create(this.f74125c, t32VarCreate);
            s32 s32VarCreate = s32.create(j32.create(), this.f74146x);
            this.f74147y = s32VarCreate;
            this.f74148z = n42.create(this.f74139q, this.f74144v, s32VarCreate, this.f74145w, g32.create());
            this.f74100A = zj4.provider(f84.create());
            a aVar = new a();
            this.f74101B = aVar;
            this.f74102C = zj4.provider(efe.create(this.f74100A, aVar));
            this.f74103D = zj4.provider(p32.create(j32.create(), jf8.create(), lf8.create()));
            this.f74104E = zj4.provider(mb8.create(one.create(), this.f74103D));
            sne sneVarCreate = sne.create(g32.create());
            this.f74105F = sneVarCreate;
            this.f74106G = wne.create(this.f74139q, this.f74104E, sneVarCreate);
            C16254zu c16254zuCreate = C16254zu.create(j32.create());
            this.f74107H = c16254zuCreate;
            this.f74108I = yne.create(this.f74139q, this.f74104E, this.f74105F, c16254zuCreate);
            this.f74109J = aoe.create(this.f74139q, this.f74104E, this.f74105F, this.f74107H);
            this.f74110K = zj4.provider(x32.create(j32.create(), this.f74106G, this.f74108I, this.f74109J));
            gne gneVarCreate = gne.create(this.f74139q, this.f74145w);
            this.f74111L = gneVarCreate;
            this.f74112M = ine.create(gneVarCreate, g32.create());
            this.f74113N = w32.create(j32.create(), this.f74111L, this.f74112M);
            this.f74114O = xb8.create(this.f74102C);
            this.f74115P = zj4.provider(c32.create());
            hid<ExecutorService> hidVarProvider3 = zj4.provider(h32.create());
            this.f74116Q = hidVarProvider3;
            this.f74117R = n32.create(this.f74140r, this.f74115P, hidVarProvider3);
            this.f74118S = io0.create(this.f74139q, this.f74107H, this.f74104E, this.f74114O);
            u32 u32VarCreate = u32.create(j32.create(), this.f74130h);
            this.f74119T = u32VarCreate;
            this.f74120U = zj4.provider(ky1.create(this.f74129g, u32VarCreate));
            tee teeVarCreate = tee.create(this.f74138p, this.f74139q, this.f74143u, this.f74144v, one.create(), this.f74145w, this.f74148z, this.f74102C, this.f74110K, this.f74113N, this.f74114O, this.f74141s, this.f74117R, this.f74118S, this.f74133k, this.f74120U);
            this.f74121V = teeVarCreate;
            this.f74122W = zj4.provider(teeVarCreate);
        }

        private xg9 locationServicesOkObservableApi23Factory() {
            return yg9.newInstance(this.f74123a, locationServicesStatus());
        }

        private ah9 locationServicesStatus() {
            return t32.provideLocationServicesStatus(a32.AbstractC0031d.m102n(), ch9.create(), this.f74135m, this.f74136n);
        }

        private vkb<Boolean> namedObservableOfBoolean() {
            return s32.provideLocationServicesOkObservable(a32.AbstractC0031d.m102n(), locationServicesOkObservableApi23Factory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public hee rxBleAdapterWrapper() {
            return new hee(a32.AbstractC0031d.m94f());
        }

        @Override // p000.a32
        public wg9 locationServicesOkObservable() {
            return zg9.newInstance(namedObservableOfBoolean());
        }

        @Override // p000.a32
        public jee rxBleClient() {
            return this.f74122W.get();
        }

        private C11447c(Context context) {
            this.f74124b = this;
            this.f74123a = context;
            initialize(context);
        }
    }

    /* JADX INFO: renamed from: qe3$d */
    public static final class C11448d implements rr2.InterfaceC12211a {

        /* JADX INFO: renamed from: a */
        public final C11447c f74150a;

        /* JADX INFO: renamed from: b */
        public final C11451g f74151b;

        /* JADX INFO: renamed from: c */
        public Boolean f74152c;

        /* JADX INFO: renamed from: d */
        public Boolean f74153d;

        /* JADX INFO: renamed from: e */
        public w1h f74154e;

        @Override // p000.rr2.InterfaceC12211a
        public rr2 build() {
            s7d.checkBuilderRequirement(this.f74152c, Boolean.class);
            s7d.checkBuilderRequirement(this.f74153d, Boolean.class);
            s7d.checkBuilderRequirement(this.f74154e, w1h.class);
            return new C11449e(this.f74150a, this.f74151b, this.f74152c, this.f74153d, this.f74154e);
        }

        private C11448d(C11447c c11447c, C11451g c11451g) {
            this.f74150a = c11447c;
            this.f74151b = c11451g;
        }

        @Override // p000.rr2.InterfaceC12211a
        public C11448d autoConnect(boolean z) {
            this.f74152c = (Boolean) s7d.checkNotNull(Boolean.valueOf(z));
            return this;
        }

        @Override // p000.rr2.InterfaceC12211a
        public C11448d operationTimeout(w1h w1hVar) {
            this.f74154e = (w1h) s7d.checkNotNull(w1hVar);
            return this;
        }

        @Override // p000.rr2.InterfaceC12211a
        public C11448d suppressOperationChecks(boolean z) {
            this.f74153d = (Boolean) s7d.checkNotNull(Boolean.valueOf(z));
            return this;
        }
    }

    /* JADX INFO: renamed from: qe3$e */
    public static final class C11449e implements rr2 {

        /* JADX INFO: renamed from: A */
        public hid<gs7> f74155A;

        /* JADX INFO: renamed from: B */
        public hid<de4> f74156B;

        /* JADX INFO: renamed from: C */
        public hid f74157C;

        /* JADX INFO: renamed from: a */
        public final Boolean f74158a;

        /* JADX INFO: renamed from: b */
        public final C11447c f74159b;

        /* JADX INFO: renamed from: c */
        public final C11451g f74160c;

        /* JADX INFO: renamed from: d */
        public final C11449e f74161d;

        /* JADX INFO: renamed from: e */
        public hid<c91> f74162e;

        /* JADX INFO: renamed from: f */
        public hid f74163f;

        /* JADX INFO: renamed from: g */
        public hid<gfe> f74164g;

        /* JADX INFO: renamed from: h */
        public hid<cs2> f74165h;

        /* JADX INFO: renamed from: i */
        public hid<BluetoothGatt> f74166i;

        /* JADX INFO: renamed from: j */
        public hid<qj9> f74167j;

        /* JADX INFO: renamed from: k */
        public hid<w1h> f74168k;

        /* JADX INFO: renamed from: l */
        public hid<y1h> f74169l;

        /* JADX INFO: renamed from: m */
        public hid<zqd> f74170m;

        /* JADX INFO: renamed from: n */
        public hid<n6c> f74171n;

        /* JADX INFO: renamed from: o */
        public hid f74172o;

        /* JADX INFO: renamed from: p */
        public hid f74173p;

        /* JADX INFO: renamed from: q */
        public hid f74174q;

        /* JADX INFO: renamed from: r */
        public hid f74175r;

        /* JADX INFO: renamed from: s */
        public hid<vee> f74176s;

        /* JADX INFO: renamed from: t */
        public hid f74177t;

        /* JADX INFO: renamed from: u */
        public hid<gm9> f74178u;

        /* JADX INFO: renamed from: v */
        public hid<Boolean> f74179v;

        /* JADX INFO: renamed from: w */
        public hid<js7> f74180w;

        /* JADX INFO: renamed from: x */
        public hid<vj9> f74181x;

        /* JADX INFO: renamed from: y */
        public hid<ezg> f74182y;

        /* JADX INFO: renamed from: z */
        public hid<is7> f74183z;

        private w41 bleConnectionCompat() {
            return new w41(this.f74159b.f74123a);
        }

        private void initialize(Boolean bool, Boolean bool2, w1h w1hVar) {
            this.f74162e = zj4.provider(d91.create());
            this.f74163f = zj4.provider(ie4.create(this.f74160c.f74189d, this.f74159b.f74139q, this.f74159b.f74144v));
            this.f74164g = zj4.provider(hfe.create(this.f74159b.f74115P, this.f74162e, this.f74163f, n9b.create()));
            this.f74165h = zj4.provider(ds2.create(this.f74160c.f74189d, this.f74163f, this.f74159b.f74116Q, this.f74159b.f74141s));
            this.f74166i = xr2.create(this.f74162e);
            this.f74167j = rj9.create(yr2.create());
            this.f74168k = p58.create(w1hVar);
            as2 as2VarCreate = as2.create(g32.create(), this.f74168k);
            this.f74169l = as2VarCreate;
            this.f74170m = ard.create(this.f74164g, this.f74166i, as2VarCreate);
            o6c o6cVarCreate = o6c.create(this.f74164g, this.f74166i, this.f74167j, this.f74169l, this.f74159b.f74141s, g32.create(), this.f74170m);
            this.f74171n = o6cVarCreate;
            this.f74172o = zj4.provider(m4f.create(this.f74165h, this.f74166i, o6cVarCreate));
            this.f74173p = zj4.provider(s74.create(this.f74165h, this.f74171n));
            this.f74174q = zj4.provider(wgb.create(m32.create(), l32.create(), k32.create(), this.f74166i, this.f74164g, this.f74173p));
            this.f74175r = zj4.provider(b2b.create(this.f74164g, wr2.create()));
            y34 y34Var = new y34();
            this.f74176s = y34Var;
            hid hidVarProvider = zj4.provider(w1b.create(y34Var, vr2.create()));
            this.f74177t = hidVarProvider;
            this.f74178u = hm9.create(this.f74165h, hidVarProvider, this.f74176s, this.f74171n);
            this.f74179v = p58.create(bool2);
            ks7 ks7VarCreate = ks7.create(yr2.create());
            this.f74180w = ks7VarCreate;
            this.f74181x = wj9.create(ks7VarCreate);
            fzg fzgVarCreate = fzg.create(this.f74180w);
            this.f74182y = fzgVarCreate;
            zr2 zr2VarCreate = zr2.create(this.f74179v, this.f74181x, fzgVarCreate);
            this.f74183z = zr2VarCreate;
            this.f74155A = hs7.create(zr2VarCreate);
            y34.setDelegate(this.f74176s, zj4.provider(wee.create(this.f74165h, this.f74164g, this.f74166i, this.f74172o, this.f74174q, this.f74175r, this.f74173p, this.f74171n, this.f74178u, this.f74159b.f74141s, this.f74155A)));
            this.f74156B = ee4.create(this.f74164g, this.f74162e, this.f74160c.f74189d, this.f74159b.f74137o, this.f74159b.f74141s, this.f74160c.f74196k, this.f74160c.f74195j);
            this.f74157C = zj4.provider(ae4.create(this.f74159b.f74143u, this.f74156B));
        }

        @Override // p000.rr2
        public jr2 connectOperation() {
            return kr2.newInstance(this.f74160c.bluetoothDevice(), bleConnectionCompat(), this.f74164g.get(), this.f74162e.get(), this.f74160c.namedTimeoutConfiguration(), this.f74158a.booleanValue(), (os2) this.f74160c.f74195j.get());
        }

        @Override // p000.rr2
        public Set<qs2> connectionSubscriptionWatchers() {
            return i6f.newSetBuilder(3).add((qs2) this.f74175r.get()).add((qs2) this.f74157C.get()).add(this.f74165h.get()).build();
        }

        @Override // p000.rr2
        public gfe gattCallback() {
            return this.f74164g.get();
        }

        @Override // p000.rr2
        public uee rxBleConnection() {
            return this.f74176s.get();
        }

        private C11449e(C11447c c11447c, C11451g c11451g, Boolean bool, Boolean bool2, w1h w1hVar) {
            this.f74161d = this;
            this.f74159b = c11447c;
            this.f74160c = c11451g;
            this.f74158a = bool;
            initialize(bool, bool2, w1hVar);
        }
    }

    /* JADX INFO: renamed from: qe3$f */
    public static final class C11450f implements d84.InterfaceC4665a {

        /* JADX INFO: renamed from: a */
        public final C11447c f74184a;

        /* JADX INFO: renamed from: b */
        public String f74185b;

        @Override // p000.d84.InterfaceC4665a
        public d84 build() {
            s7d.checkBuilderRequirement(this.f74185b, String.class);
            return new C11451g(this.f74184a, this.f74185b);
        }

        private C11450f(C11447c c11447c) {
            this.f74184a = c11447c;
        }

        @Override // p000.d84.InterfaceC4665a
        public C11450f macAddress(String str) {
            this.f74185b = (String) s7d.checkNotNull(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: qe3$g */
    public static final class C11451g implements d84 {

        /* JADX INFO: renamed from: a */
        public final String f74186a;

        /* JADX INFO: renamed from: b */
        public final C11447c f74187b;

        /* JADX INFO: renamed from: c */
        public final C11451g f74188c;

        /* JADX INFO: renamed from: d */
        public hid<String> f74189d;

        /* JADX INFO: renamed from: e */
        public hid<BluetoothDevice> f74190e;

        /* JADX INFO: renamed from: f */
        public hid<rr2.InterfaceC12211a> f74191f;

        /* JADX INFO: renamed from: g */
        public hid<ft2> f74192g;

        /* JADX INFO: renamed from: h */
        public hid<q01<uee.EnumC13520d>> f74193h;

        /* JADX INFO: renamed from: i */
        public hid f74194i;

        /* JADX INFO: renamed from: j */
        public hid<os2> f74195j;

        /* JADX INFO: renamed from: k */
        public hid<y1h> f74196k;

        /* JADX INFO: renamed from: qe3$g$a */
        public class a implements hid<rr2.InterfaceC12211a> {
            public a() {
            }

            @Override // p000.hid
            public rr2.InterfaceC12211a get() {
                return new C11448d(C11451g.this.f74187b, C11451g.this.f74188c);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BluetoothDevice bluetoothDevice() {
            return y84.provideBluetoothDevice(this.f74186a, this.f74187b.rxBleAdapterWrapper());
        }

        private void initialize(String str) {
            jo5 jo5VarCreate = p58.create(str);
            this.f74189d = jo5VarCreate;
            this.f74190e = y84.create(jo5VarCreate, this.f74187b.f74139q);
            this.f74191f = new a();
            this.f74192g = gt2.create(this.f74187b.f74143u, this.f74191f, this.f74187b.f74115P);
            hid<q01<uee.EnumC13520d>> hidVarProvider = zj4.provider(a94.create());
            this.f74193h = hidVarProvider;
            this.f74194i = zj4.provider(cfe.create(this.f74190e, this.f74192g, hidVarProvider, this.f74187b.f74120U));
            this.f74195j = zj4.provider(z84.create(this.f74193h));
            this.f74196k = c94.create(g32.create());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public y1h namedTimeoutConfiguration() {
            return b94.providesConnectTimeoutConf(g32.provideComputationScheduler());
        }

        @Override // p000.d84
        public yee provideDevice() {
            return (yee) this.f74194i.get();
        }

        private C11451g(C11447c c11447c, String str) {
            this.f74188c = this;
            this.f74187b = c11447c;
            this.f74186a = str;
            initialize(str);
        }
    }

    private qe3() {
    }

    public static a32.InterfaceC0029b builder() {
        return new C11446b();
    }
}
