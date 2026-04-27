package p000;

/* JADX INFO: loaded from: classes8.dex */
public class p7c extends f89 {

    /* JADX INFO: renamed from: g */
    public int f69930g;

    /* JADX INFO: renamed from: h */
    public char f69931h;

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    public char getDelimiter() {
        return this.f69931h;
    }

    public int getStartNumber() {
        return this.f69930g;
    }

    public void setDelimiter(char c) {
        this.f69931h = c;
    }

    public void setStartNumber(int i) {
        this.f69930g = i;
    }
}
