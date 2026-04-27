package p000;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a2 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC0012a2<T> extends quh<T> {

    /* JADX INFO: renamed from: a */
    public b f147a = b.NOT_READY;

    /* JADX INFO: renamed from: b */
    @wx1
    public T f148b;

    /* JADX INFO: renamed from: a2$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f149a;

        static {
            int[] iArr = new int[b.values().length];
            f149a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f149a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a2$b */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean tryToComputeNext() {
        this.f147a = b.FAILED;
        this.f148b = computeNext();
        if (this.f147a == b.DONE) {
            return false;
        }
        this.f147a = b.READY;
        return true;
    }

    @op1
    @wx1
    /* JADX INFO: renamed from: a */
    public final T m25a() {
        this.f147a = b.DONE;
        return null;
    }

    @wx1
    public abstract T computeNext();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        v7d.checkState(this.f147a != b.FAILED);
        int i = a.f149a[this.f147a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return tryToComputeNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    @op1
    @dgc
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f147a = b.NOT_READY;
        T t = (T) sib.m22018a(this.f148b);
        this.f148b = null;
        return t;
    }

    @dgc
    public final T peek() {
        if (hasNext()) {
            return (T) sib.m22018a(this.f148b);
        }
        throw new NoSuchElementException();
    }
}
