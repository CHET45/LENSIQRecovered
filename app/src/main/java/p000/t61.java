package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t61 {
    public static t61 none() {
        return null;
    }

    /* JADX INFO: renamed from: of */
    public static t61 m22390of(m61... m61VarArr) {
        return new u61(m61VarArr);
    }

    public abstract t61 atColumn(int i);

    public abstract t61 atIndex(int i);

    public abstract t61 replaceActiveBlockParser();
}
