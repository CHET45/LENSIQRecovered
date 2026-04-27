package p000;

/* JADX INFO: loaded from: classes8.dex */
public class se7 extends ve7 implements g3f {

    /* JADX INFO: renamed from: c */
    public short f81517c;

    /* JADX INFO: renamed from: d */
    public String f81518d;

    @Override // p000.f3f
    public short getHttpStatus() {
        return this.f81517c;
    }

    @Override // p000.f3f
    public String getHttpStatusMessage() {
        return this.f81518d;
    }

    @Override // p000.g3f
    public void setHttpStatus(short s) {
        this.f81517c = s;
    }

    @Override // p000.g3f
    public void setHttpStatusMessage(String str) {
        this.f81518d = str;
    }
}
