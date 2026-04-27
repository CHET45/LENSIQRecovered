package p000;

/* JADX INFO: loaded from: classes8.dex */
public class dq5 extends b61 {

    /* JADX INFO: renamed from: f */
    public char f30358f;

    /* JADX INFO: renamed from: g */
    public int f30359g;

    /* JADX INFO: renamed from: h */
    public int f30360h;

    /* JADX INFO: renamed from: i */
    public String f30361i;

    /* JADX INFO: renamed from: j */
    public String f30362j;

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    public char getFenceChar() {
        return this.f30358f;
    }

    public int getFenceIndent() {
        return this.f30360h;
    }

    public int getFenceLength() {
        return this.f30359g;
    }

    public String getInfo() {
        return this.f30361i;
    }

    public String getLiteral() {
        return this.f30362j;
    }

    public void setFenceChar(char c) {
        this.f30358f = c;
    }

    public void setFenceIndent(int i) {
        this.f30360h = i;
    }

    public void setFenceLength(int i) {
        this.f30359g = i;
    }

    public void setInfo(String str) {
        this.f30361i = str;
    }

    public void setLiteral(String str) {
        this.f30362j = str;
    }
}
