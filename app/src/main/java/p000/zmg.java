package p000;

/* JADX INFO: loaded from: classes5.dex */
public class zmg {

    /* JADX INFO: renamed from: c */
    public static final int f105497c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f105498d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f105499e = 1;

    /* JADX INFO: renamed from: a */
    public int f105500a;

    /* JADX INFO: renamed from: b */
    public int f105501b;

    public zmg(int i, int i2) {
        r80.hardAssert((i & 1) == i, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i), 1);
        this.f105501b = i;
        seek(i2);
    }

    public static zmg forSyncEngine() {
        return new zmg(1, 1);
    }

    public static zmg forTargetCache(int i) {
        zmg zmgVar = new zmg(0, i);
        zmgVar.nextId();
        return zmgVar;
    }

    private void seek(int i) {
        r80.hardAssert((i & 1) == this.f105501b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f105500a = i;
    }

    public int nextId() {
        int i = this.f105500a;
        this.f105500a = i + 2;
        return i;
    }
}
