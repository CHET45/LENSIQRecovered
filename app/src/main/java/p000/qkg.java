package p000;

/* JADX INFO: loaded from: classes8.dex */
public class qkg extends hd3 {

    /* JADX INFO: renamed from: f */
    public boolean f74770f;

    /* JADX INFO: renamed from: g */
    public EnumC11525a f74771g;

    /* JADX INFO: renamed from: qkg$a */
    public enum EnumC11525a {
        LEFT,
        CENTER,
        RIGHT
    }

    public EnumC11525a getAlignment() {
        return this.f74771g;
    }

    public boolean isHeader() {
        return this.f74770f;
    }

    public void setAlignment(EnumC11525a enumC11525a) {
        this.f74771g = enumC11525a;
    }

    public void setHeader(boolean z) {
        this.f74770f = z;
    }
}
