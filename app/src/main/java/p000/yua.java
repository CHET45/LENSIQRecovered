package p000;

import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public enum yua {
    NAME_ASCENDING(xua.f99418b),
    JVM(null),
    DEFAULT(xua.f99417a);


    /* JADX INFO: renamed from: a */
    public final Comparator<Method> f102998a;

    yua(Comparator comparator) {
        this.f102998a = comparator;
    }

    public Comparator<Method> getComparator() {
        return this.f102998a;
    }
}
