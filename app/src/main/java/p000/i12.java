package p000;

/* JADX INFO: loaded from: classes8.dex */
public class i12 extends o3e {

    /* JADX INFO: renamed from: a */
    public final Object f45416a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f45417b;

    /* JADX INFO: renamed from: c */
    public final boolean f45418c;

    /* JADX INFO: renamed from: d */
    public volatile tde f45419d;

    public i12(Class<?> cls, boolean z) {
        this.f45416a = new Object();
        this.f45417b = cls;
        this.f45418c = z;
    }

    @Override // p000.o3e
    public tde getRunner() {
        if (this.f45419d == null) {
            synchronized (this.f45416a) {
                try {
                    if (this.f45419d == null) {
                        this.f45419d = new C14677wm(this.f45418c).safeRunnerForClass(this.f45417b);
                    }
                } finally {
                }
            }
        }
        return this.f45419d;
    }

    public i12(Class<?> cls) {
        this(cls, true);
    }
}
