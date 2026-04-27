package p000;

import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: renamed from: rc */
/* JADX INFO: loaded from: classes.dex */
public final class C11997rc<I> {

    /* JADX INFO: renamed from: a */
    @gib
    public AbstractC11416qc<I> f77695a;

    @gib
    public final AbstractC11416qc<I> getLauncher() {
        return this.f77695a;
    }

    public final void launch(@gib I i, @gib ActivityOptionsCompat activityOptionsCompat) {
        bth bthVar;
        AbstractC11416qc<I> abstractC11416qc = this.f77695a;
        if (abstractC11416qc != null) {
            abstractC11416qc.launch(i, activityOptionsCompat);
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        if (bthVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void setLauncher(@gib AbstractC11416qc<I> abstractC11416qc) {
        this.f77695a = abstractC11416qc;
    }

    public final void unregister() {
        bth bthVar;
        AbstractC11416qc<I> abstractC11416qc = this.f77695a;
        if (abstractC11416qc != null) {
            abstractC11416qc.unregister();
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        if (bthVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
