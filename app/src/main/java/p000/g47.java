package p000;

/* JADX INFO: loaded from: classes6.dex */
public class g47 extends jc2 {

    /* JADX INFO: renamed from: c */
    public String f38427c;

    public g47(String str) {
        setMd5(str);
    }

    public String getMd5() {
        return this.f38427c;
    }

    public void setMd5(String str) {
        this.f38427c = str;
    }

    @Override // p000.jc2
    public String toString() {
        return "GetDevMD5Response{md5='" + this.f38427c + "'} " + super.toString();
    }
}
