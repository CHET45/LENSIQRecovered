package p000;

import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class nr9<I, O> extends AbstractC11416qc<I> {

    /* JADX INFO: renamed from: c */
    public static final int f65367c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C11997rc<I> f65368a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final i2g<AbstractC8767lc<I, O>> f65369b;

    /* JADX WARN: Multi-variable type inference failed */
    public nr9(@yfb C11997rc<I> c11997rc, @yfb i2g<? extends AbstractC8767lc<I, O>> i2gVar) {
        this.f65368a = c11997rc;
        this.f65369b = i2gVar;
    }

    @Override // p000.AbstractC11416qc
    @yfb
    public AbstractC8767lc<I, ?> getContract() {
        return this.f65369b.getValue();
    }

    @Override // p000.AbstractC11416qc
    public void launch(I i, @gib ActivityOptionsCompat activityOptionsCompat) {
        this.f65368a.launch(i, activityOptionsCompat);
    }

    @Override // p000.AbstractC11416qc
    @q64(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
