package p000;

/* JADX INFO: loaded from: classes8.dex */
public class zpg extends deb {

    /* JADX INFO: renamed from: f */
    public String f105712f;

    public zpg() {
    }

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    @Override // p000.deb
    /* JADX INFO: renamed from: b */
    public String mo9110b() {
        return "literal=" + this.f105712f;
    }

    public String getLiteral() {
        return this.f105712f;
    }

    public void setLiteral(String str) {
        this.f105712f = str;
    }

    public zpg(String str) {
        this.f105712f = str;
    }
}
