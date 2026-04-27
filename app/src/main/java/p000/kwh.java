package p000;

/* JADX INFO: loaded from: classes6.dex */
public class kwh extends jc2 {

    /* JADX INFO: renamed from: c */
    public int f55529c;

    /* JADX INFO: renamed from: d */
    public int f55530d;

    public int getUpdateFileFlagLen() {
        return this.f55530d;
    }

    public int getUpdateFileFlagOffset() {
        return this.f55529c;
    }

    public kwh setUpdateFileFlagLen(int i) {
        this.f55530d = i;
        return this;
    }

    public kwh setUpdateFileFlagOffset(int i) {
        this.f55529c = i;
        return this;
    }

    @Override // p000.jc2
    public String toString() {
        return "UpdateFileOffsetResponse{updateFileFlagOffset=" + this.f55529c + ", updateFileFlagLen=" + this.f55530d + '}';
    }
}
