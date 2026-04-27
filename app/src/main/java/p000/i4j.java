package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class i4j extends e4j {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ bvi f45757m;

    public i4j(bvi bviVar) {
        this.f45757m = bviVar;
    }

    @Override // p000.e4j
    /* JADX INFO: renamed from: b */
    public final void mo6636b() {
        synchronized (this.f45757m.f14972f) {
            try {
                if (this.f45757m.f14978l.get() > 0 && this.f45757m.f14978l.decrementAndGet() > 0) {
                    this.f45757m.f14968b.m3767d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                bvi bviVar = this.f45757m;
                if (bviVar.f14980n != null) {
                    bviVar.f14968b.m3767d("Unbind from service.", new Object[0]);
                    bvi bviVar2 = this.f45757m;
                    bviVar2.f14967a.unbindService(bviVar2.f14979m);
                    this.f45757m.f14973g = false;
                    this.f45757m.f14980n = null;
                    this.f45757m.f14979m = null;
                }
                this.f45757m.m3455x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
