package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class m36<T, R, E> implements vye<E> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f59807a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<T, R> f59808b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qy6<R, Iterator<E>> f59809c;

    /* JADX INFO: renamed from: m36$a */
    public static final class C9118a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C9118a f59810a = new C9118a();

        /* JADX INFO: renamed from: b */
        public static final int f59811b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f59812c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f59813d = 2;

        private C9118a() {
        }
    }

    /* JADX INFO: renamed from: m36$b */
    public static final class C9119b implements Iterator<E>, uo8 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f59814a;

        /* JADX INFO: renamed from: b */
        public Iterator<? extends E> f59815b;

        /* JADX INFO: renamed from: c */
        public int f59816c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ m36<T, R, E> f59817d;

        public C9119b(m36<T, R, E> m36Var) {
            this.f59817d = m36Var;
            this.f59814a = m36Var.f59807a.iterator();
        }

        private final boolean ensureItemIterator() {
            Iterator<? extends E> it = this.f59815b;
            if (it != null && it.hasNext()) {
                this.f59816c = 1;
                return true;
            }
            while (this.f59814a.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) this.f59817d.f59809c.invoke(this.f59817d.f59808b.invoke(this.f59814a.next()));
                if (it2.hasNext()) {
                    this.f59815b = it2;
                    this.f59816c = 1;
                    return true;
                }
            }
            this.f59816c = 2;
            this.f59815b = null;
            return false;
        }

        public final Iterator<E> getItemIterator() {
            return this.f59815b;
        }

        public final Iterator<T> getIterator() {
            return this.f59814a;
        }

        public final int getState() {
            return this.f59816c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f59816c;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return ensureItemIterator();
        }

        @Override // java.util.Iterator
        public E next() {
            int i = this.f59816c;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !ensureItemIterator()) {
                throw new NoSuchElementException();
            }
            this.f59816c = 0;
            Iterator<? extends E> it = this.f59815b;
            md8.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setItemIterator(Iterator<? extends E> it) {
            this.f59815b = it;
        }

        public final void setState(int i) {
            this.f59816c = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m36(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var, @yfb qy6<? super R, ? extends Iterator<? extends E>> qy6Var2) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        md8.checkNotNullParameter(qy6Var, "transformer");
        md8.checkNotNullParameter(qy6Var2, "iterator");
        this.f59807a = vyeVar;
        this.f59808b = qy6Var;
        this.f59809c = qy6Var2;
    }

    @Override // p000.vye
    @yfb
    public Iterator<E> iterator() {
        return new C9119b(this);
    }
}
