package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w08 implements ep4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final v08 f93042a;

    public w08(@yfb v08 v08Var) {
        this.f93042a = v08Var;
    }

    @Override // p000.ep4
    public void draw(@yfb ov2 ov2Var) {
        this.f93042a.drawIndication(ov2Var);
    }

    @yfb
    public final v08 getIndicationInstance() {
        return this.f93042a;
    }
}
