package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum d89 implements i11<List, Object, List> {
    INSTANCE;

    public static <T> i11<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // p000.i11
    public List apply(List t1, Object t2) {
        t1.add(t2);
        return t1;
    }
}
