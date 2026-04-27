package p000;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class wxe {

    /* JADX INFO: renamed from: c */
    public static final int f95687c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final txe f95688a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Rect f95689b;

    public wxe(@yfb txe txeVar, @yfb Rect rect) {
        this.f95688a = txeVar;
        this.f95689b = rect;
    }

    @yfb
    public final Rect getAdjustedBounds() {
        return this.f95689b;
    }

    @yfb
    public final txe getSemanticsNode() {
        return this.f95688a;
    }
}
