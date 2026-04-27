package p000;

/* JADX INFO: loaded from: classes5.dex */
public class ajg implements i52 {

    /* JADX INFO: renamed from: a */
    public static ajg f1772a;

    private ajg() {
    }

    public static ajg getInstance() {
        if (f1772a == null) {
            f1772a = new ajg();
        }
        return f1772a;
    }

    @Override // p000.i52
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
