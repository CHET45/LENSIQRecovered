package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class dn2 {

    /* JADX INFO: renamed from: a */
    public static final int f30179a = 0;

    public abstract void composeInitial$runtime_release(@yfb sz2 sz2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var);

    public abstract void deletedMovableContent$runtime_release(@yfb i0b i0bVar);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingCallByInformation$runtime_release();

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    @yfb
    public qqc getCompositionLocalScope$runtime_release() {
        return en2.f33571a;
    }

    public abstract int getCompoundHashKey$runtime_release();

    @yfb
    public abstract e13 getEffectCoroutineContext();

    @gib
    public vn2 getObserverHolder$runtime_release() {
        return null;
    }

    @yfb
    public abstract e13 getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(@yfb i0b i0bVar);

    public abstract void invalidate$runtime_release(@yfb sz2 sz2Var);

    public abstract void invalidateScope$runtime_release(@yfb ssd ssdVar);

    public abstract void movableContentStateReleased$runtime_release(@yfb i0b i0bVar, @yfb h0b h0bVar);

    @gib
    public h0b movableContentStateResolve$runtime_release(@yfb i0b i0bVar) {
        return null;
    }

    public void recordInspectionTable$runtime_release(@yfb Set<fn2> set) {
    }

    public void registerComposer$runtime_release(@yfb zl2 zl2Var) {
    }

    public abstract void registerComposition$runtime_release(@yfb sz2 sz2Var);

    public abstract void reportRemovedComposition$runtime_release(@yfb sz2 sz2Var);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(@yfb zl2 zl2Var) {
    }

    public abstract void unregisterComposition$runtime_release(@yfb sz2 sz2Var);
}
