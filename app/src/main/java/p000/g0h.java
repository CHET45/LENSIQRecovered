package p000;

/* JADX INFO: loaded from: classes4.dex */
@se3
@ukd({"com.google.android.datatransport.runtime.time.WallTime"})
@xqe
public final class g0h implements go5<g52> {

    /* JADX INFO: renamed from: g0h$a */
    public static final class C6076a {

        /* JADX INFO: renamed from: a */
        public static final g0h f38193a = new g0h();

        private C6076a() {
        }
    }

    public static g0h create() {
        return C6076a.f38193a;
    }

    public static g52 eventClock() {
        return (g52) u7d.checkNotNullFromProvides(f0h.m10406a());
    }

    @Override // p000.gid
    public g52 get() {
        return eventClock();
    }
}
