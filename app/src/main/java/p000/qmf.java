package p000;

import io.reactivex.Observable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class qmf {

    /* JADX INFO: renamed from: qmf$a */
    public enum EnumC11557a implements Callable<NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: qmf$b */
    public enum EnumC11558b implements py6<pof, zjd> {
        INSTANCE;

        @Override // p000.py6
        public zjd apply(pof pofVar) {
            return new bpf(pofVar);
        }
    }

    /* JADX INFO: renamed from: qmf$c */
    public static final class C11559c<T> implements Iterable<m86<T>> {

        /* JADX INFO: renamed from: a */
        public final Iterable<? extends pof<? extends T>> f74932a;

        public C11559c(Iterable<? extends pof<? extends T>> iterable) {
            this.f74932a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<m86<T>> iterator() {
            return new C11560d(this.f74932a.iterator());
        }
    }

    /* JADX INFO: renamed from: qmf$d */
    public static final class C11560d<T> implements Iterator<m86<T>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends pof<? extends T>> f74933a;

        public C11560d(Iterator<? extends pof<? extends T>> it) {
            this.f74933a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f74933a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public m86<T> next() {
            return new bpf(this.f74933a.next());
        }
    }

    /* JADX INFO: renamed from: qmf$e */
    public enum EnumC11561e implements py6<pof, Observable> {
        INSTANCE;

        @Override // p000.py6
        public Observable apply(pof pofVar) {
            return new dpf(pofVar);
        }
    }

    private qmf() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Callable<NoSuchElementException> emptyThrower() {
        return EnumC11557a.INSTANCE;
    }

    public static <T> Iterable<? extends m86<T>> iterableToFlowable(Iterable<? extends pof<? extends T>> iterable) {
        return new C11559c(iterable);
    }

    public static <T> py6<pof<? extends T>, zjd<? extends T>> toFlowable() {
        return EnumC11558b.INSTANCE;
    }

    public static <T> py6<pof<? extends T>, Observable<? extends T>> toObservable() {
        return EnumC11561e.INSTANCE;
    }
}
