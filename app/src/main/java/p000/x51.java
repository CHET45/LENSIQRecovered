package p000;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
public final class x51 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final x51 f96730a = new x51();

    private x51() {
    }

    @yfb
    @ih4
    /* JADX INFO: renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final BlendModeColorFilter m33215BlendModeColorFilterxETnrds(long j, int i) {
        w51.m24339a();
        return v51.m23776a(j92.m30490toArgb8_81llA(j), C1995bq.m28032toAndroidBlendModes9anfk8(i));
    }

    @yfb
    @ih4
    public final r51 createBlendModeColorFilter(@yfb BlendModeColorFilter blendModeColorFilter) {
        return new r51(j92.Color(blendModeColorFilter.getColor()), C1995bq.toComposeBlendMode(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
