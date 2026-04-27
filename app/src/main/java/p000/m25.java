package p000;

/* JADX INFO: loaded from: classes3.dex */
public class m25<Z> implements t5e<Z> {

    /* JADX INFO: renamed from: a */
    public final boolean f59723a;

    /* JADX INFO: renamed from: b */
    public final boolean f59724b;

    /* JADX INFO: renamed from: c */
    public final t5e<Z> f59725c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9104a f59726d;

    /* JADX INFO: renamed from: e */
    public final eq8 f59727e;

    /* JADX INFO: renamed from: f */
    public int f59728f;

    /* JADX INFO: renamed from: m */
    public boolean f59729m;

    /* JADX INFO: renamed from: m25$a */
    public interface InterfaceC9104a {
        void onResourceReleased(eq8 eq8Var, m25<?> m25Var);
    }

    public m25(t5e<Z> t5eVar, boolean z, boolean z2, eq8 eq8Var, InterfaceC9104a interfaceC9104a) {
        this.f59725c = (t5e) t7d.checkNotNull(t5eVar);
        this.f59723a = z;
        this.f59724b = z2;
        this.f59727e = eq8Var;
        this.f59726d = (InterfaceC9104a) t7d.checkNotNull(interfaceC9104a);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m16580a() {
        if (this.f59729m) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f59728f++;
    }

    /* JADX INFO: renamed from: b */
    public t5e<Z> m16581b() {
        return this.f59725c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16582c() {
        return this.f59723a;
    }

    /* JADX INFO: renamed from: d */
    public void m16583d() {
        boolean z;
        synchronized (this) {
            int i = this.f59728f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f59728f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f59726d.onResourceReleased(this.f59727e, this);
        }
    }

    @Override // p000.t5e
    @efb
    public Z get() {
        return this.f59725c.get();
    }

    @Override // p000.t5e
    @efb
    public Class<Z> getResourceClass() {
        return this.f59725c.getResourceClass();
    }

    @Override // p000.t5e
    public int getSize() {
        return this.f59725c.getSize();
    }

    @Override // p000.t5e
    public synchronized void recycle() {
        if (this.f59728f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f59729m) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f59729m = true;
        if (this.f59724b) {
            this.f59725c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f59723a + ", listener=" + this.f59726d + ", key=" + this.f59727e + ", acquired=" + this.f59728f + ", isRecycled=" + this.f59729m + ", resource=" + this.f59725c + '}';
    }
}
