package p000;

/* JADX INFO: loaded from: classes7.dex */
public class kpg extends vog {

    /* JADX INFO: renamed from: kpg$a */
    public class C8492a implements ugd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ epg f54926a;

        public C8492a(epg epgVar) throws Exception {
            this.f54926a = epgVar;
        }

        @Override // p000.ugd
        public void protect() throws Exception {
            kpg.this.m14895a();
            kpg.this.basicRun(this.f54926a);
            kpg.this.m14896b();
        }
    }

    public kpg(pog pogVar) {
        super(pogVar);
    }

    /* JADX INFO: renamed from: a */
    public void m14895a() throws Exception {
    }

    /* JADX INFO: renamed from: b */
    public void m14896b() throws Exception {
    }

    @Override // p000.vog, p000.pog
    public void run(epg epgVar) {
        epgVar.runProtected(this, new C8492a(epgVar));
    }
}
