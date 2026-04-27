package p000;

import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public final class qg7 {

    /* JADX INFO: renamed from: c */
    public static final int[] f74377c = {C3146R.attr.colorError, C3146R.attr.colorOnError, C3146R.attr.colorErrorContainer, C3146R.attr.colorOnErrorContainer};

    /* JADX INFO: renamed from: a */
    public final int[] f74378a;

    /* JADX INFO: renamed from: b */
    @dbg
    public final int f74379b;

    private qg7(@efb @gc0 int[] iArr, @dbg int i) {
        if (i != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f74378a = iArr;
        this.f74379b = i;
    }

    @efb
    public static qg7 create(@efb @gc0 int[] iArr) {
        return new qg7(iArr, 0);
    }

    @efb
    public static qg7 createMaterialDefaults() {
        return create(f74377c, C3146R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @efb
    public int[] getAttributes() {
        return this.f74378a;
    }

    @dbg
    public int getThemeOverlay() {
        return this.f74379b;
    }

    @efb
    public static qg7 create(@efb @gc0 int[] iArr, @dbg int i) {
        return new qg7(iArr, i);
    }
}
