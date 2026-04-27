package p000;

/* JADX INFO: loaded from: classes4.dex */
@se3
@ukd({"com.google.android.datatransport.runtime.time.Monotonic"})
@xqe
public final class h0h implements go5<g52> {

    /* JADX INFO: renamed from: h0h$a */
    public static final class C6670a {

        /* JADX INFO: renamed from: a */
        public static final h0h f41934a = new h0h();

        private C6670a() {
        }
    }

    public static h0h create() {
        return C6670a.f41934a;
    }

    public static g52 uptimeClock() {
        return (g52) u7d.checkNotNullFromProvides(f0h.m10407b());
    }

    @Override // p000.gid
    public g52 get() {
        return uptimeClock();
    }
}
