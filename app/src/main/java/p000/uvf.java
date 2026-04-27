package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class uvf<T> implements py6<List<T>, List<T>> {

    /* JADX INFO: renamed from: a */
    public final Comparator<? super T> f89246a;

    public uvf(Comparator<? super T> comparator) {
        this.f89246a = comparator;
    }

    @Override // p000.py6
    public List<T> apply(List<T> list) throws Exception {
        Collections.sort(list, this.f89246a);
        return list;
    }
}
