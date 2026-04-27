package p000;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface vab {
    int getNestedScrollAxes();

    boolean onNestedFling(@efb View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@efb View view, float f, float f2);

    void onNestedPreScroll(@efb View view, int i, int i2, @efb int[] iArr);

    void onNestedScroll(@efb View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(@efb View view, @efb View view2, int i);

    boolean onStartNestedScroll(@efb View view, @efb View view2, int i);

    void onStopNestedScroll(@efb View view);
}
