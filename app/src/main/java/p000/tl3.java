package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class tl3 extends cf1 {

    /* JADX INFO: renamed from: b */
    public long f85177b;

    /* JADX INFO: renamed from: c */
    public int f85178c;

    /* JADX INFO: renamed from: d */
    public boolean f85179d;

    /* JADX INFO: renamed from: tl3$a */
    public interface InterfaceC13090a<S extends tl3> {
        void releaseOutputBuffer(S s);
    }

    @Override // p000.cf1
    @un1
    public void clear() {
        super.clear();
        this.f85177b = 0L;
        this.f85178c = 0;
        this.f85179d = false;
    }

    public abstract void release();
}
