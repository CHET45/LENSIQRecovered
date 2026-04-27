package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tvf<T> implements sy6<List<T>, List<T>> {

    /* JADX INFO: renamed from: a */
    public final Comparator<? super T> f86111a;

    public tvf(Comparator<? super T> comparator) {
        this.f86111a = comparator;
    }

    @Override // p000.sy6
    public List<T> apply(List<T> t) {
        Collections.sort(t, this.f86111a);
        return t;
    }
}
