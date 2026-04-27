package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class rmf {

    /* JADX INFO: renamed from: rmf$a */
    public enum EnumC12156a implements nfg<NoSuchElementException> {
        INSTANCE;

        @Override // p000.nfg
        public NoSuchElementException get() {
            return new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: rmf$b */
    public enum EnumC12157b implements sy6<oof, zjd> {
        INSTANCE;

        @Override // p000.sy6
        public zjd apply(oof v) {
            return new cpf(v);
        }
    }

    /* JADX INFO: renamed from: rmf$c */
    public static final class C12158c<T> implements Iterable<l86<T>> {

        /* JADX INFO: renamed from: a */
        public final Iterable<? extends oof<? extends T>> f78740a;

        public C12158c(Iterable<? extends oof<? extends T>> sources) {
            this.f78740a = sources;
        }

        @Override // java.lang.Iterable
        public Iterator<l86<T>> iterator() {
            return new C12159d(this.f78740a.iterator());
        }
    }

    /* JADX INFO: renamed from: rmf$d */
    public static final class C12159d<T> implements Iterator<l86<T>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends oof<? extends T>> f78741a;

        public C12159d(Iterator<? extends oof<? extends T>> sit) {
            this.f78741a = sit;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f78741a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public l86<T> next() {
            return new cpf(this.f78741a.next());
        }
    }

    private rmf() {
        throw new IllegalStateException("No instances!");
    }

    public static nfg<NoSuchElementException> emptyThrower() {
        return EnumC12156a.INSTANCE;
    }

    public static <T> Iterable<? extends l86<T>> iterableToFlowable(final Iterable<? extends oof<? extends T>> sources) {
        return new C12158c(sources);
    }

    public static <T> sy6<oof<? extends T>, zjd<? extends T>> toFlowable() {
        return EnumC12157b.INSTANCE;
    }
}
