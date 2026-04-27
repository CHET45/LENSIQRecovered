package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jid {

    /* JADX INFO: renamed from: a */
    @yfb
    public final p53 f50680a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final so1 f50681b;

    public jid(@yfb p53 p53Var, @yfb so1 so1Var) {
        md8.checkNotNullParameter(p53Var, "callingRequest");
        md8.checkNotNullParameter(so1Var, "callingAppInfo");
        this.f50680a = p53Var;
        this.f50681b = so1Var;
    }

    @yfb
    public final so1 getCallingAppInfo() {
        return this.f50681b;
    }

    @yfb
    public final p53 getCallingRequest() {
        return this.f50680a;
    }
}
