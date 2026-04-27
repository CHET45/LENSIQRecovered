package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface mj2 {
    default <T> T get(Class<T> cls) {
        return (T) get(pkd.unqualified(cls));
    }

    default <T> z24<T> getDeferred(Class<T> cls) {
        return getDeferred(pkd.unqualified(cls));
    }

    <T> z24<T> getDeferred(pkd<T> pkdVar);

    default <T> eid<T> getProvider(Class<T> cls) {
        return getProvider(pkd.unqualified(cls));
    }

    <T> eid<T> getProvider(pkd<T> pkdVar);

    default <T> Set<T> setOf(Class<T> cls) {
        return setOf(pkd.unqualified(cls));
    }

    default <T> eid<Set<T>> setOfProvider(Class<T> cls) {
        return setOfProvider(pkd.unqualified(cls));
    }

    <T> eid<Set<T>> setOfProvider(pkd<T> pkdVar);

    default <T> T get(pkd<T> pkdVar) {
        eid<T> provider = getProvider(pkdVar);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    default <T> Set<T> setOf(pkd<T> pkdVar) {
        return setOfProvider(pkdVar).get();
    }
}
