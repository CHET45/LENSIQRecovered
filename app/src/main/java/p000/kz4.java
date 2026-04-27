package p000;

/* JADX INFO: loaded from: classes8.dex */
public class kz4 extends deb implements u54 {

    /* JADX INFO: renamed from: f */
    public String f55714f;

    public kz4() {
    }

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    @Override // p000.u54
    public String getClosingDelimiter() {
        return this.f55714f;
    }

    @Override // p000.u54
    public String getOpeningDelimiter() {
        return this.f55714f;
    }

    public void setDelimiter(String str) {
        this.f55714f = str;
    }

    public kz4(String str) {
        this.f55714f = str;
    }
}
