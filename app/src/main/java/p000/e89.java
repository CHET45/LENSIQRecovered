package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum e89 implements j11<List, Object, List> {
    INSTANCE;

    public static <T> j11<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // p000.j11
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
