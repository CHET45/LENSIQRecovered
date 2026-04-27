package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ide implements zy2<bth> {

    /* JADX INFO: renamed from: a */
    @gib
    public v7e<bth> f46572a;

    public final void await() {
        synchronized (this) {
            while (true) {
                try {
                    v7e<bth> v7eVar = this.f46572a;
                    if (v7eVar == null) {
                        md8.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        y7e.throwOnFailure(v7eVar.m32732unboximpl());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return a05.f2a;
    }

    @gib
    /* JADX INFO: renamed from: getResult-xLWZpok, reason: not valid java name */
    public final v7e<bth> m30210getResultxLWZpok() {
        return this.f46572a;
    }

    @Override // p000.zy2
    public void resumeWith(@yfb Object obj) {
        synchronized (this) {
            this.f46572a = v7e.m32722boximpl(obj);
            md8.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            bth bthVar = bth.f14751a;
        }
    }

    public final void setResult(@gib v7e<bth> v7eVar) {
        this.f46572a = v7eVar;
    }
}
