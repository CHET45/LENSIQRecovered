package p000;

/* JADX INFO: loaded from: classes8.dex */
public class d61 {
    public static d61 atColumn(int i) {
        return new e61(-1, i, false);
    }

    public static d61 atIndex(int i) {
        return new e61(i, -1, false);
    }

    public static d61 finished() {
        return new e61(-1, -1, true);
    }

    public static d61 none() {
        return null;
    }
}
