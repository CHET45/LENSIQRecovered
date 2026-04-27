package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class up2 {
    public static final <T> T getValue(@yfb AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static /* synthetic */ void getValue$annotations(AtomicReference atomicReference) {
    }

    public static final <T> void loop(@yfb AtomicReference<T> atomicReference, @yfb gz6<? super AtomicReference<T>, ? super T, bth> gz6Var) {
        while (true) {
            gz6Var.invoke(atomicReference, (Object) getValue(atomicReference));
        }
    }

    public static final <T> void setValue(@yfb AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }
}
