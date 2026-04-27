package p000;

import java.util.concurrent.TimeUnit;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
public class rne {

    /* JADX INFO: renamed from: a */
    public final woe f78807a;

    /* JADX INFO: renamed from: b */
    public final pwb<ife, ife> f78808b;

    /* JADX INFO: renamed from: c */
    public final pwb<ife, ife> f78809c = new C12173e();

    /* JADX INFO: renamed from: d */
    public final pwb<ife, ife> f78810d = new C12175g();

    /* JADX INFO: renamed from: rne$a */
    public class C12169a implements pwb<ife, ife> {

        /* JADX INFO: renamed from: b */
        public final vkb<Long> f78812b;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ woe f78815e;

        /* JADX INFO: renamed from: a */
        public final sy6<ife, ife> f78811a = rne.m21441c();

        /* JADX INFO: renamed from: c */
        public final sy6<ife, vkb<?>> f78813c = new a();

        /* JADX INFO: renamed from: d */
        public final sy6<vkb<ife>, vkb<ife>> f78814d = new b();

        /* JADX INFO: renamed from: rne$a$a */
        public class a implements sy6<ife, vkb<?>> {
            public a() {
            }

            @Override // p000.sy6
            public vkb<?> apply(ife ifeVar) {
                return C12169a.this.f78812b;
            }
        }

        /* JADX INFO: renamed from: rne$a$b */
        public class b implements sy6<vkb<ife>, vkb<ife>> {
            public b() {
            }

            @Override // p000.sy6
            public vkb<ife> apply(vkb<ife> vkbVar) {
                return vkbVar.take(1L);
            }
        }

        /* JADX INFO: renamed from: rne$a$c */
        public class c implements sy6<vkb<ife>, wub<ife>> {
            public c() {
            }

            @Override // p000.sy6
            public wub<ife> apply(vkb<ife> vkbVar) {
                return vkbVar.window(vkbVar.switchMap(C12169a.this.f78813c)).flatMap(C12169a.this.f78814d).map(C12169a.this.f78811a);
            }
        }

        public C12169a(woe woeVar) {
            this.f78815e = woeVar;
            this.f78812b = vkb.timer(10L, TimeUnit.SECONDS, woeVar);
        }

        @Override // p000.pwb
        /* JADX INFO: renamed from: apply */
        public wub<ife> apply2(vkb<ife> vkbVar) {
            return vkbVar.publish(new c());
        }
    }

    /* JADX INFO: renamed from: rne$b */
    public class C12170b implements pwb<ife, ife> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f78820a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f78821b;

        /* JADX INFO: renamed from: rne$b$a */
        public class a implements sy6<vkb<Object>, wub<?>> {
            public a() {
            }

            @Override // p000.sy6
            public wub<?> apply(vkb<Object> vkbVar) {
                C12170b c12170b = C12170b.this;
                return vkbVar.delay(c12170b.f78821b, TimeUnit.MILLISECONDS, rne.this.f78807a);
            }
        }

        public C12170b(int i, long j) {
            this.f78820a = i;
            this.f78821b = j;
        }

        @Override // p000.pwb
        /* JADX INFO: renamed from: apply */
        public wub<ife> apply2(vkb<ife> vkbVar) {
            return vkbVar.take(this.f78820a, TimeUnit.MILLISECONDS, rne.this.f78807a).repeatWhen(new a());
        }
    }

    /* JADX INFO: renamed from: rne$c */
    public class C12171c implements pwb<ife, ife> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pwb f78824a;

        /* JADX INFO: renamed from: rne$c$a */
        public class a implements sy6<ub7<String, ife>, vkb<ife>> {
            public a() {
            }

            @Override // p000.sy6
            public vkb<ife> apply(ub7<String, ife> ub7Var) {
                return ub7Var.compose(C12171c.this.f78824a);
            }
        }

        /* JADX INFO: renamed from: rne$c$b */
        public class b implements sy6<ife, String> {
            public b() {
            }

            @Override // p000.sy6
            public String apply(ife ifeVar) {
                return ifeVar.getBluetoothDevice().getAddress();
            }
        }

        public C12171c(pwb pwbVar) {
            this.f78824a = pwbVar;
        }

        @Override // p000.pwb
        /* JADX INFO: renamed from: apply */
        public wub<ife> apply2(vkb<ife> vkbVar) {
            return vkbVar.groupBy(new b()).flatMap(new a());
        }
    }

    /* JADX INFO: renamed from: rne$d */
    public class C12172d implements sy6<ife, ife> {
        @Override // p000.sy6
        public ife apply(ife ifeVar) {
            return new ife(ifeVar.getBluetoothDevice(), ifeVar.getRssi(), ifeVar.getTimestampNanos(), ifeVar.getScanRecord(), zme.CALLBACK_TYPE_FIRST_MATCH, ifeVar.isConnectable());
        }
    }

    /* JADX INFO: renamed from: rne$e */
    public class C12173e implements pwb<ife, ife> {
        public C12173e() {
        }

        @Override // p000.pwb
        /* JADX INFO: renamed from: apply */
        public wub<ife> apply2(vkb<ife> vkbVar) {
            return vkbVar.debounce(10L, TimeUnit.SECONDS, rne.this.f78807a).map(rne.m21442d());
        }
    }

    /* JADX INFO: renamed from: rne$f */
    public class C12174f implements sy6<ife, ife> {
        @Override // p000.sy6
        public ife apply(ife ifeVar) {
            return new ife(ifeVar.getBluetoothDevice(), ifeVar.getRssi(), ifeVar.getTimestampNanos(), ifeVar.getScanRecord(), zme.CALLBACK_TYPE_MATCH_LOST, ifeVar.isConnectable());
        }
    }

    /* JADX INFO: renamed from: rne$g */
    public class C12175g implements pwb<ife, ife> {

        /* JADX INFO: renamed from: rne$g$a */
        public class a implements sy6<vkb<ife>, vkb<ife>> {
            public a() {
            }

            @Override // p000.sy6
            public vkb<ife> apply(vkb<ife> vkbVar) {
                return vkb.merge(vkbVar.compose(rne.this.f78808b), vkbVar.compose(rne.this.f78809c));
            }
        }

        public C12175g() {
        }

        @Override // p000.pwb
        /* JADX INFO: renamed from: apply */
        public wub<ife> apply2(vkb<ife> vkbVar) {
            return vkbVar.publish(new a());
        }
    }

    @b28
    public rne(@w8b(a32.C0034g.f247a) woe woeVar) {
        this.f78807a = woeVar;
        this.f78808b = new C12169a(woeVar);
    }

    /* JADX INFO: renamed from: c */
    public static sy6<ife, ife> m21441c() {
        return new C12172d();
    }

    /* JADX INFO: renamed from: d */
    public static sy6<ife, ife> m21442d() {
        return new C12174f();
    }

    private pwb<ife, ife> repeatedWindowTransformer(@h78(from = 0, m12174to = 4999) int i) {
        return new C12170b(i, Math.max(TimeUnit.SECONDS.toMillis(5L) - ((long) i), 0L));
    }

    private pwb<ife, ife> scanModeBalancedTransformer() {
        return repeatedWindowTransformer(2500);
    }

    private pwb<ife, ife> scanModeLowPowerTransformer() {
        return repeatedWindowTransformer(500);
    }

    private static pwb<ife, ife> splitByAddressAndForEach(pwb<ife, ife> pwbVar) {
        return new C12171c(pwbVar);
    }

    /* JADX INFO: renamed from: a */
    public pwb<ife, ife> m21443a(int i) {
        return i != 2 ? i != 4 ? i != 6 ? vwb.identityTransformer() : splitByAddressAndForEach(this.f78810d) : splitByAddressAndForEach(this.f78809c) : splitByAddressAndForEach(this.f78808b);
    }

    /* JADX INFO: renamed from: b */
    public pwb<ife, ife> m21444b(int i) {
        if (i == -1) {
            kfe.m14730w("Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power", new Object[0]);
        } else if (i != 0) {
            return i != 1 ? vwb.identityTransformer() : scanModeBalancedTransformer();
        }
        return scanModeLowPowerTransformer();
    }
}
