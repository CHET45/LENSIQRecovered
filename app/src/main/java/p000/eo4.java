package p000;

import android.content.ClipData;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class eo4 {

    /* JADX INFO: renamed from: d */
    public static final int f33711d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ClipData f33712a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f33713b;

    /* JADX INFO: renamed from: c */
    public final int f33714c;

    public eo4(@yfb ClipData clipData, @gib Object obj, int i) {
        this.f33712a = clipData;
        this.f33713b = obj;
        this.f33714c = i;
    }

    @yfb
    public final ClipData getClipData() {
        return this.f33712a;
    }

    public final int getFlags() {
        return this.f33714c;
    }

    @gib
    public final Object getLocalState() {
        return this.f33713b;
    }

    public /* synthetic */ eo4(ClipData clipData, Object obj, int i, int i2, jt3 jt3Var) {
        this(clipData, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? 0 : i);
    }
}
