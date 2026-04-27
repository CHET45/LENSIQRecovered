package p000;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
@e0g(parameters = 1)
public final class gm0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final gm0 f40161a = new gm0();

    /* JADX INFO: renamed from: b */
    public static final int f40162b = 0;

    private gm0() {
    }

    @c5e(23)
    @ih4
    public final int addChildCount(@yfb ViewStructure viewStructure, int i) {
        return viewStructure.addChildCount(i);
    }

    @c5e(23)
    @gib
    @ih4
    public final ViewStructure newChild(@yfb ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    @c5e(23)
    @ih4
    public final void setDimens(@yfb ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    @c5e(23)
    @ih4
    public final void setId(@yfb ViewStructure viewStructure, int i, @gib String str, @gib String str2, @gib String str3) {
        viewStructure.setId(i, str, str2, str3);
    }
}
