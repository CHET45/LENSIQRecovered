package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use Optional.of(value) or Optional.absent()")
@gd7(serializable = true)
@by4
public abstract class z6c<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: z6c$a */
    public class C16020a implements Iterable<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f104294a;

        /* JADX INFO: renamed from: z6c$a$a */
        public class a extends AbstractC15914z1<T> {

            /* JADX INFO: renamed from: c */
            public final Iterator<? extends z6c<? extends T>> f104295c;

            public a() {
                this.f104295c = (Iterator) v7d.checkNotNull(C16020a.this.f104294a.iterator());
            }

            @Override // p000.AbstractC15914z1
            @wx1
            /* JADX INFO: renamed from: a */
            public T mo2779a() {
                while (this.f104295c.hasNext()) {
                    z6c<? extends T> next = this.f104295c.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return m26470b();
            }
        }

        public C16020a(final Iterable val$optionals) {
            this.f104294a = val$optionals;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new a();
        }
    }

    public static <T> z6c<T> absent() {
        return C11198q.m19899a();
    }

    public static <T> z6c<T> fromNullable(@wx1 T nullableReference) {
        return nullableReference == null ? absent() : new nad(nullableReference);
    }

    /* JADX INFO: renamed from: of */
    public static <T> z6c<T> m26593of(T reference) {
        return new nad(v7d.checkNotNull(reference));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends z6c<? extends T>> optionals) {
        v7d.checkNotNull(optionals);
        return new C16020a(optionals);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@wx1 Object object);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* JADX INFO: renamed from: or */
    public abstract T mo17830or(T defaultValue);

    /* JADX INFO: renamed from: or */
    public abstract T mo17831or(lfg<? extends T> supplier);

    /* JADX INFO: renamed from: or */
    public abstract z6c<T> mo17832or(z6c<? extends T> secondChoice);

    @wx1
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> z6c<V> transform(lz6<? super T, V> function);
}
