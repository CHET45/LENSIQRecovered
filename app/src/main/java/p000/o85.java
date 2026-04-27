package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@se3
@ukd
@xqe("javax.inject.Singleton")
public final class o85 implements go5<Executor> {

    /* JADX INFO: renamed from: o85$a */
    public static final class C10220a {

        /* JADX INFO: renamed from: a */
        public static final o85 f66649a = new o85();

        private C10220a() {
        }
    }

    public static o85 create() {
        return C10220a.f66649a;
    }

    public static Executor executor() {
        return (Executor) u7d.checkNotNullFromProvides(n85.m17805a());
    }

    @Override // p000.gid
    public Executor get() {
        return executor();
    }
}
