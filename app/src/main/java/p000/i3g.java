package p000;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
public final class i3g implements v3g {
    @Override // p000.v3g
    @yfb
    @ih4
    public StaticLayout create(@yfb x3g x3gVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(x3gVar.getText(), x3gVar.getStart(), x3gVar.getEnd(), x3gVar.getPaint(), x3gVar.getWidth());
        builderObtain.setTextDirection(x3gVar.getTextDir());
        builderObtain.setAlignment(x3gVar.getAlignment());
        builderObtain.setMaxLines(x3gVar.getMaxLines());
        builderObtain.setEllipsize(x3gVar.getEllipsize());
        builderObtain.setEllipsizedWidth(x3gVar.getEllipsizedWidth());
        builderObtain.setLineSpacing(x3gVar.getLineSpacingExtra(), x3gVar.getLineSpacingMultiplier());
        builderObtain.setIncludePad(x3gVar.getIncludePadding());
        builderObtain.setBreakStrategy(x3gVar.getBreakStrategy());
        builderObtain.setHyphenationFrequency(x3gVar.getHyphenationFrequency());
        builderObtain.setIndents(x3gVar.getLeftIndents(), x3gVar.getRightIndents());
        int i = Build.VERSION.SDK_INT;
        j3g.setJustificationMode(builderObtain, x3gVar.getJustificationMode());
        if (i >= 28) {
            l3g.setUseLineSpacingFromFallbacks(builderObtain, x3gVar.getUseFallbackLineSpacing());
        }
        if (i >= 33) {
            s3g.setLineBreakConfig(builderObtain, x3gVar.getLineBreakStyle(), x3gVar.getLineBreakWordStyle());
        }
        return builderObtain.build();
    }

    @Override // p000.v3g
    public boolean isFallbackLineSpacingEnabled(@yfb StaticLayout staticLayout, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return s3g.isFallbackLineSpacingEnabled(staticLayout);
        }
        if (i >= 28) {
            return z;
        }
        return false;
    }
}
