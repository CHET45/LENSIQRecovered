package p000;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface tab extends vab {
    void onNestedPreScroll(@efb View view, int i, int i2, @efb int[] iArr, int i3);

    void onNestedScroll(@efb View view, int i, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(@efb View view, @efb View view2, int i, int i2);

    boolean onStartNestedScroll(@efb View view, @efb View view2, int i, int i2);

    void onStopNestedScroll(@efb View view, int i);
}
