package p000;

/* JADX INFO: loaded from: classes6.dex */
public final class q1f<T> extends xxd<T> {

    /* JADX INFO: renamed from: a */
    public final xxd<T> f72930a;

    /* JADX INFO: renamed from: b */
    public boolean f72931b;

    /* JADX INFO: renamed from: c */
    public f40<T> f72932c;

    public q1f(xxd<T> xxdVar) {
        this.f72930a = xxdVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void emitLoop() {
        f40<T> f40Var;
        while (true) {
            synchronized (this) {
                try {
                    f40Var = this.f72932c;
                    if (f40Var == null) {
                        this.f72931b = false;
                        return;
                    }
                    this.f72932c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            f40Var.m10502a((xxd<? super T>) this.f72930a);
        }
    }

    @Override // p000.xxd, p000.uu2
    public void accept(@cfb T t) {
        synchronized (this) {
            try {
                if (!this.f72931b) {
                    this.f72931b = true;
                    this.f72930a.accept(t);
                    emitLoop();
                } else {
                    f40<T> f40Var = this.f72932c;
                    if (f40Var == null) {
                        f40Var = new f40<>(4);
                        this.f72932c = f40Var;
                    }
                    f40Var.m10503b(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.xxd
    public boolean hasObservers() {
        return this.f72930a.hasObservers();
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> pxbVar) {
        this.f72930a.subscribe(pxbVar);
    }
}
