package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface rab {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, @hib int[] iArr, @hib int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @hib int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
