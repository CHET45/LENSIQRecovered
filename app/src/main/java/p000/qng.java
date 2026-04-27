package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qng extends mng {

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final Runnable f75021c;

    public qng(@yfb Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f75021c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f75021c.run();
    }

    @yfb
    public String toString() {
        return "Task[" + kk3.getClassSimpleName(this.f75021c) + '@' + kk3.getHexAddress(this.f75021c) + ", " + this.f61583a + ", " + vng.taskContextString(this.f61584b) + C4584d2.f28243l;
    }
}
