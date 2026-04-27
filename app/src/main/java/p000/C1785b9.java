package p000;

/* JADX INFO: renamed from: b9 */
/* JADX INFO: loaded from: classes7.dex */
public class C1785b9 extends npg {

    /* JADX INFO: renamed from: c */
    public volatile int f13005c;

    /* JADX INFO: renamed from: b9$a */
    public class a extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pog f13006a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ epg f13007b;

        public a(pog pogVar, epg epgVar) {
            this.f13006a = pogVar;
            this.f13007b = epgVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f13006a.run(this.f13007b);
            } finally {
                C1785b9.this.runFinished();
            }
        }
    }

    public C1785b9() {
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3001a() {
        while (this.f13005c < testCount()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // p000.npg, p000.pog
    public void run(epg epgVar) {
        this.f13005c = 0;
        super.run(epgVar);
        m3001a();
    }

    public synchronized void runFinished() {
        this.f13005c++;
        notifyAll();
    }

    @Override // p000.npg
    public void runTest(pog pogVar, epg epgVar) {
        new a(pogVar, epgVar).start();
    }

    public C1785b9(Class<? extends qog> cls) {
        super(cls);
    }

    public C1785b9(String str) {
        super(str);
    }

    public C1785b9(Class<? extends qog> cls, String str) {
        super(cls, str);
    }
}
