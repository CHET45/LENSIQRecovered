package p000;

import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
@c5e(33)
public final class s3g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final s3g f80585a = new s3g();

    private s3g() {
    }

    @do8
    @ih4
    public static final boolean isFallbackLineSpacingEnabled(@yfb StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    @do8
    @ih4
    public static final void setLineBreakConfig(@yfb StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(r3g.m20965a().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
