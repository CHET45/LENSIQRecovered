package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public interface dce {
    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q$default, reason: not valid java name */
    static /* synthetic */ long m28641createConstraintsxF2OJ5Q$default(dce dceVar, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i5 & 16) != 0) {
            z = false;
        }
        return dceVar.mo27388createConstraintsxF2OJ5Q(i, i2, i3, i4, z);
    }

    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q */
    long mo27388createConstraintsxF2OJ5Q(int i, int i2, int i3, int i4, boolean z);

    int crossAxisSize(@yfb AbstractC0767t abstractC0767t);

    int mainAxisSize(@yfb AbstractC0767t abstractC0767t);

    @yfb
    vba placeHelper(@yfb AbstractC0767t[] abstractC0767tArr, @yfb InterfaceC0761n interfaceC0761n, int i, @yfb int[] iArr, int i2, int i3, @gib int[] iArr2, int i4, int i5, int i6);

    void populateMainAxisPositions(int i, @yfb int[] iArr, @yfb int[] iArr2, @yfb InterfaceC0761n interfaceC0761n);
}
