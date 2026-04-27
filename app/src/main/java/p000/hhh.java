package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class hhh<T> implements zgh<T> {

    /* JADX INFO: renamed from: a */
    public final chh f43655a;

    /* JADX INFO: renamed from: b */
    public final String f43656b;

    /* JADX INFO: renamed from: c */
    public final q15 f43657c;

    /* JADX INFO: renamed from: d */
    public final leh<T, byte[]> f43658d;

    /* JADX INFO: renamed from: e */
    public final ihh f43659e;

    public hhh(chh chhVar, String str, q15 q15Var, leh<T, byte[]> lehVar, ihh ihhVar) {
        this.f43655a = chhVar;
        this.f43656b = str;
        this.f43657c = q15Var;
        this.f43658d = lehVar;
        this.f43659e = ihhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$send$0(Exception exc) {
    }

    /* JADX INFO: renamed from: b */
    public chh m12396b() {
        return this.f43655a;
    }

    @Override // p000.zgh
    public void schedule(p55<T> p55Var, qhh qhhVar) {
        this.f43659e.send(oye.builder().setTransportContext(this.f43655a).mo19102b(p55Var).setTransportName(this.f43656b).mo19103c(this.f43658d).mo19101a(this.f43657c).build(), qhhVar);
    }

    @Override // p000.zgh
    public void send(p55<T> p55Var) {
        schedule(p55Var, new qhh() { // from class: ghh
            @Override // p000.qhh
            public final void onSchedule(Exception exc) {
                hhh.lambda$send$0(exc);
            }
        });
    }
}
