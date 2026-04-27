package p000;

import p000.ko5;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public final class th9<Z> implements t5e<Z>, ko5.InterfaceC8472f {

    /* JADX INFO: renamed from: e */
    public static final p4d.InterfaceC10791a<th9<?>> f84724e = ko5.threadSafe(20, new C13038a());

    /* JADX INFO: renamed from: a */
    public final b3g f84725a = b3g.newInstance();

    /* JADX INFO: renamed from: b */
    public t5e<Z> f84726b;

    /* JADX INFO: renamed from: c */
    public boolean f84727c;

    /* JADX INFO: renamed from: d */
    public boolean f84728d;

    /* JADX INFO: renamed from: th9$a */
    public class C13038a implements ko5.InterfaceC8470d<th9<?>> {
        @Override // p000.ko5.InterfaceC8470d
        public th9<?> create() {
            return new th9<>();
        }
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static <Z> th9<Z> m22521a(t5e<Z> t5eVar) {
        th9<Z> th9Var = (th9) t7d.checkNotNull(f84724e.acquire());
        th9Var.init(t5eVar);
        return th9Var;
    }

    private void init(t5e<Z> t5eVar) {
        this.f84728d = false;
        this.f84727c = true;
        this.f84726b = t5eVar;
    }

    private void release() {
        this.f84726b = null;
        f84724e.release(this);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m22522b() {
        this.f84725a.throwIfRecycled();
        if (!this.f84727c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f84727c = false;
        if (this.f84728d) {
            recycle();
        }
    }

    @Override // p000.t5e
    @efb
    public Z get() {
        return this.f84726b.get();
    }

    @Override // p000.t5e
    @efb
    public Class<Z> getResourceClass() {
        return this.f84726b.getResourceClass();
    }

    @Override // p000.t5e
    public int getSize() {
        return this.f84726b.getSize();
    }

    @Override // p000.ko5.InterfaceC8472f
    @efb
    public b3g getVerifier() {
        return this.f84725a;
    }

    @Override // p000.t5e
    public synchronized void recycle() {
        this.f84725a.throwIfRecycled();
        this.f84728d = true;
        if (!this.f84727c) {
            this.f84726b.recycle();
            release();
        }
    }
}
