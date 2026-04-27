package p000;

/* JADX INFO: loaded from: classes8.dex */
public class iag extends deb implements u54 {

    /* JADX INFO: renamed from: f */
    public String f46270f;

    public iag() {
    }

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    @Override // p000.u54
    public String getClosingDelimiter() {
        return this.f46270f;
    }

    @Override // p000.u54
    public String getOpeningDelimiter() {
        return this.f46270f;
    }

    public void setDelimiter(String str) {
        this.f46270f = str;
    }

    public iag(String str) {
        this.f46270f = str;
    }
}
