package p000;

import androidx.lifecycle.AbstractC1158q;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class he8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final uae f43250a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Set<AbstractC1158q<?>> f43251b;

    public he8(@yfb uae uaeVar) {
        md8.checkNotNullParameter(uaeVar, "database");
        this.f43250a = uaeVar;
        Set<AbstractC1158q<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        md8.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f43251b = setNewSetFromMap;
    }

    @yfb
    public final <T> AbstractC1158q<T> create(@yfb String[] strArr, boolean z, @yfb Callable<T> callable) {
        md8.checkNotNullParameter(strArr, "tableNames");
        md8.checkNotNullParameter(callable, "computeFunction");
        return new abe(this.f43250a, this, z, callable, strArr);
    }

    @yfb
    public final Set<AbstractC1158q<?>> getLiveDataSet$room_runtime_release() {
        return this.f43251b;
    }

    public final void onActive(@yfb AbstractC1158q<?> abstractC1158q) {
        md8.checkNotNullParameter(abstractC1158q, "liveData");
        this.f43251b.add(abstractC1158q);
    }

    public final void onInactive(@yfb AbstractC1158q<?> abstractC1158q) {
        md8.checkNotNullParameter(abstractC1158q, "liveData");
        this.f43251b.remove(abstractC1158q);
    }
}
