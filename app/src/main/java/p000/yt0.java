package p000;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yt0 extends j6b {
    public yt0(mt0 mt0Var) {
        super(mt0Var);
    }

    @Override // p000.ip8
    @gib
    public Object get() {
        return mt0.access$getMFooterLayout$p((mt0) this.receiver);
    }

    @Override // p000.xn1, p000.no8
    public String getName() {
        return "mFooterLayout";
    }

    @Override // p000.xn1
    public so8 getOwner() {
        return vvd.getOrCreateKotlinClass(mt0.class);
    }

    @Override // p000.xn1
    public String getSignature() {
        return "getMFooterLayout()Landroid/widget/LinearLayout;";
    }

    @Override // p000.cp8
    public void set(@gib Object obj) {
        ((mt0) this.receiver).f62031l = (LinearLayout) obj;
    }
}
