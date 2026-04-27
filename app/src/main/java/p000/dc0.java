package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
public final class dc0 {
    private dc0() {
    }

    public static <V> AtomicReference<V> newReference() {
        return new AtomicReference<>();
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(int length) {
        return new AtomicReferenceArray<>(length);
    }

    public static <V> AtomicReference<V> newReference(@agc V initialValue) {
        return new AtomicReference<>(initialValue);
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(E[] array) {
        return new AtomicReferenceArray<>(array);
    }
}
