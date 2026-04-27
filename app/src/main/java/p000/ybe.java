package p000;

/* JADX INFO: loaded from: classes3.dex */
public class ybe implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f101048a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9576mx<Float, Float> f101049b;

    public ybe(String str, InterfaceC9576mx<Float, Float> interfaceC9576mx) {
        this.f101048a = str;
        this.f101049b = interfaceC9576mx;
    }

    public InterfaceC9576mx<Float, Float> getCornerRadius() {
        return this.f101049b;
    }

    public String getName() {
        return this.f101048a;
    }

    @Override // p000.sw2
    @hib
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new zbe(go9Var, pr0Var, this);
    }
}
