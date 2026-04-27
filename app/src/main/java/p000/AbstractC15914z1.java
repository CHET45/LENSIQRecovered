package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public abstract class AbstractC15914z1<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public b f103640a = b.NOT_READY;

    /* JADX INFO: renamed from: b */
    @wx1
    public T f103641b;

    /* JADX INFO: renamed from: z1$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f103642a;

        static {
            int[] iArr = new int[b.values().length];
            f103642a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103642a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: z1$b */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean tryToComputeNext() {
        this.f103640a = b.FAILED;
        this.f103641b = mo2779a();
        if (this.f103640a == b.DONE) {
            return false;
        }
        this.f103640a = b.READY;
        return true;
    }

    @wx1
    /* JADX INFO: renamed from: a */
    public abstract T mo2779a();

    @op1
    @wx1
    /* JADX INFO: renamed from: b */
    public final T m26470b() {
        this.f103640a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        v7d.checkState(this.f103640a != b.FAILED);
        int i = a.f103642a[this.f103640a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return tryToComputeNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    @lgc
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f103640a = b.NOT_READY;
        T t = (T) uib.m23370a(this.f103641b);
        this.f103641b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
