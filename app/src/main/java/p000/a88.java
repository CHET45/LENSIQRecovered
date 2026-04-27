package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class a88 implements k50<int[]> {

    /* JADX INFO: renamed from: a */
    public static final String f613a = "IntegerArrayPool";

    @Override // p000.k50
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // p000.k50
    public String getTag() {
        return f613a;
    }

    @Override // p000.k50
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    @Override // p000.k50
    public int[] newArray(int i) {
        return new int[i];
    }
}
