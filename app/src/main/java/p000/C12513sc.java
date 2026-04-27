package p000;

import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: renamed from: sc */
/* JADX INFO: loaded from: classes.dex */
public final class C12513sc {
    public static final void launch(@yfb AbstractC11416qc<Void> abstractC11416qc, @gib ActivityOptionsCompat activityOptionsCompat) {
        abstractC11416qc.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launch$default(AbstractC11416qc abstractC11416qc, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(abstractC11416qc, activityOptionsCompat);
    }

    @xn8(name = "launchUnit")
    public static final void launchUnit(@yfb AbstractC11416qc<bth> abstractC11416qc, @gib ActivityOptionsCompat activityOptionsCompat) {
        abstractC11416qc.launch(bth.f14751a, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(AbstractC11416qc abstractC11416qc, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(abstractC11416qc, activityOptionsCompat);
    }
}
