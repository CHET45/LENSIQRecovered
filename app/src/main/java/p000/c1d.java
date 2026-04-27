package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class c1d {
    @nb8
    public static final void throwArrayMissingFieldException(@yfb int[] iArr, @yfb int[] iArr2, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(iArr, "seenArray");
        md8.checkNotNullParameter(iArr2, "goldenMaskArray");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(f0fVar.getElementName((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new ewa(arrayList, f0fVar.getSerialName());
    }

    @nb8
    public static final void throwMissingFieldException(int i, int i2, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(f0fVar.getElementName(i4));
            }
            i3 >>>= 1;
        }
        throw new ewa(arrayList, f0fVar.getSerialName());
    }
}
