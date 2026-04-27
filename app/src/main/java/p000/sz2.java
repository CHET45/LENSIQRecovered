package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface sz2 extends cn2 {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var);

    <R> R delegateInvalidations(@gib sz2 sz2Var, int i, @yfb ny6<? extends R> ny6Var);

    @ga8
    void disposeUnusedMovableContent(@yfb h0b h0bVar);

    boolean getHasPendingChanges();

    @ga8
    void insertMovableContent(@yfb List<scc<i0b, i0b>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(@yfb Set<? extends Object> set);

    void prepareCompose(@yfb ny6<bth> ny6Var);

    boolean recompose();

    void recordModificationsOf(@yfb Set<? extends Object> set);

    void recordReadOf(@yfb Object obj);

    void recordWriteOf(@yfb Object obj);

    @ga8
    void verifyConsistent();
}
