package p000;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w0c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c1c f93048a;

    public /* synthetic */ w0c(c1c c1cVar) {
        this.f93048a = c1cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f93048a.triggerForcefulClose();
    }
}
