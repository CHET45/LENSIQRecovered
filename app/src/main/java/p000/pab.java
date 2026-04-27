package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface pab extends rab {
    boolean dispatchNestedPreScroll(int i, int i2, @hib int[] iArr, @hib int[] iArr2, int i3);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @hib int[] iArr, int i5);

    boolean hasNestedScrollingParent(int i);

    boolean startNestedScroll(int i, int i2);

    void stopNestedScroll(int i);
}
