package p000;

import java.util.Iterator;
import p000.bkc;

/* JADX INFO: loaded from: classes.dex */
public interface ijc extends Iterator<bkc>, uo8 {

    /* JADX INFO: renamed from: ijc$a */
    public enum EnumC7321a {
        AsConic,
        AsQuadratics
    }

    static /* synthetic */ int calculateSize$default(ijc ijcVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return ijcVar.calculateSize(z);
    }

    static /* synthetic */ bkc.EnumC1929a next$default(ijc ijcVar, float[] fArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ijcVar.next(fArr, i);
    }

    int calculateSize(boolean z);

    @yfb
    EnumC7321a getConicEvaluation();

    @yfb
    vic getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    @yfb
    bkc.EnumC1929a next(@yfb float[] fArr, int i);

    @Override // java.util.Iterator
    @yfb
    bkc next();
}
