package p000;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
public final class lg1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final lg1 f57491a = new lg1();

    private lg1() {
    }

    @do8
    @ih4
    public static final void putSize(@yfb Bundle bundle, @yfb String str, @gib Size size) {
        bundle.putSize(str, size);
    }

    @do8
    @ih4
    public static final void putSizeF(@yfb Bundle bundle, @yfb String str, @gib SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
