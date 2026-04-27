package p000;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ucc {
    @igg({"UnknownNullness"})
    public static final <F, S> F component1(@yfb tcc<F, S> tccVar) {
        return tccVar.f84271a;
    }

    @igg({"UnknownNullness"})
    public static final <F, S> S component2(@yfb tcc<F, S> tccVar) {
        return tccVar.f84272b;
    }

    @yfb
    public static final <F, S> Pair<F, S> toAndroidPair(@yfb scc<? extends F, ? extends S> sccVar) {
        return new Pair<>(sccVar.getFirst(), sccVar.getSecond());
    }

    @yfb
    public static final <F, S> tcc<F, S> toAndroidXPair(@yfb scc<? extends F, ? extends S> sccVar) {
        return new tcc<>(sccVar.getFirst(), sccVar.getSecond());
    }

    @yfb
    public static final <F, S> scc<F, S> toKotlinPair(@yfb tcc<F, S> tccVar) {
        return new scc<>(tccVar.f84271a, tccVar.f84272b);
    }

    @igg({"UnknownNullness"})
    public static final <F, S> F component1(@yfb Pair<F, S> pair) {
        return (F) pair.first;
    }

    @igg({"UnknownNullness"})
    public static final <F, S> S component2(@yfb Pair<F, S> pair) {
        return (S) pair.second;
    }

    @yfb
    public static final <F, S> scc<F, S> toKotlinPair(@yfb Pair<F, S> pair) {
        return new scc<>(pair.first, pair.second);
    }
}
