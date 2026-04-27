package p000;

import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: renamed from: qc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11416qc<I> {
    @efb
    public abstract AbstractC8767lc<I, ?> getContract();

    public void launch(@igg({"UnknownNullness"}) I i) {
        launch(i, null);
    }

    public abstract void launch(@igg({"UnknownNullness"}) I i, @hib ActivityOptionsCompat activityOptionsCompat);

    @ir9
    public abstract void unregister();
}
