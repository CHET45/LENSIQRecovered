package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum u60 implements nfg<List<Object>>, sy6<Object, List<Object>> {
    INSTANCE;

    public static <T, O> sy6<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static <T> nfg<List<T>> asSupplier() {
        return INSTANCE;
    }

    @Override // p000.sy6
    public List<Object> apply(Object o) {
        return new ArrayList();
    }

    @Override // p000.nfg
    public List<Object> get() {
        return new ArrayList();
    }
}
