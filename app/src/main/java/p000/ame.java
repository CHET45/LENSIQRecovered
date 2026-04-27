package p000;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1143j;

/* JADX INFO: loaded from: classes3.dex */
public final class ame {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C0334a f2124d = new C0334a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final bme f2125a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final zle f2126b;

    /* JADX INFO: renamed from: c */
    public boolean f2127c;

    /* JADX INFO: renamed from: ame$a */
    public static final class C0334a {
        public /* synthetic */ C0334a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final ame create(@yfb bme bmeVar) {
            md8.checkNotNullParameter(bmeVar, "owner");
            return new ame(bmeVar, null);
        }

        private C0334a() {
        }
    }

    public /* synthetic */ ame(bme bmeVar, jt3 jt3Var) {
        this(bmeVar);
    }

    @do8
    @yfb
    public static final ame create(@yfb bme bmeVar) {
        return f2124d.create(bmeVar);
    }

    @yfb
    public final zle getSavedStateRegistry() {
        return this.f2126b;
    }

    @ir9
    public final void performAttach() {
        AbstractC1143j lifecycle = this.f2125a.getLifecycle();
        if (lifecycle.getCurrentState() != AbstractC1143j.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.addObserver(new qud(this.f2125a));
        this.f2126b.performAttach$savedstate_release(lifecycle);
        this.f2127c = true;
    }

    @ir9
    public final void performRestore(@gib Bundle bundle) {
        if (!this.f2127c) {
            performAttach();
        }
        AbstractC1143j lifecycle = this.f2125a.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(AbstractC1143j.b.STARTED)) {
            this.f2126b.performRestore$savedstate_release(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
    }

    @ir9
    public final void performSave(@yfb Bundle bundle) {
        md8.checkNotNullParameter(bundle, "outBundle");
        this.f2126b.performSave(bundle);
    }

    private ame(bme bmeVar) {
        this.f2125a = bmeVar;
        this.f2126b = new zle();
    }
}
