package p000;

/* JADX INFO: loaded from: classes8.dex */
public class re7 extends ve7 implements a42 {

    /* JADX INFO: renamed from: c */
    public String f78012c = "*";

    @Override // p000.z32
    public String getResourceDescriptor() {
        return this.f78012c;
    }

    @Override // p000.a42
    public void setResourceDescriptor(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f78012c = str;
    }
}
