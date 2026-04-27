package p000;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class zd4 implements qs2 {

    /* JADX INFO: renamed from: a */
    public final g42 f104824a;

    /* JADX INFO: renamed from: b */
    public final de4 f104825b;

    @b28
    public zd4(g42 g42Var, de4 de4Var) {
        this.f104824a = g42Var;
        this.f104825b = de4Var;
    }

    @Override // p000.qs2
    public void onConnectionSubscribed() {
    }

    @Override // p000.qs2
    public void onConnectionUnsubscribed() {
        this.f104824a.queue(this.f104825b).subscribe(r07.emptyConsumer(), r07.emptyConsumer());
    }
}
