package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
@w01
@Deprecated
public abstract class iih<T> {

    /* JADX INFO: renamed from: iih$a */
    public class C7303a extends iih<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lz6 f47132a;

        public C7303a(final lz6 val$nodeToChildrenFunction) {
            this.f47132a = val$nodeToChildrenFunction;
        }

        @Override // p000.iih
        public Iterable<T> children(T root) {
            return (Iterable) this.f47132a.apply(root);
        }
    }

    /* JADX INFO: renamed from: iih$b */
    public class C7304b extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f47133b;

        public C7304b(final Object val$root) {
            this.f47133b = val$root;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        public quh<T> iterator() {
            return iih.this.m13128b(this.f47133b);
        }
    }

    /* JADX INFO: renamed from: iih$c */
    public class C7305c extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f47135b;

        public C7305c(final Object val$root) {
            this.f47135b = val$root;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        public quh<T> iterator() {
            return iih.this.m13127a(this.f47135b);
        }
    }

    /* JADX INFO: renamed from: iih$d */
    public class C7306d extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f47137b;

        public C7306d(final Object val$root) {
            this.f47137b = val$root;
        }

        @Override // java.lang.Iterable
        public quh<T> iterator() {
            return new C7307e(this.f47137b);
        }
    }

    /* JADX INFO: renamed from: iih$e */
    public final class C7307e extends quh<T> implements gmc<T> {

        /* JADX INFO: renamed from: a */
        public final Queue<T> f47139a;

        public C7307e(T root) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f47139a = arrayDeque;
            arrayDeque.add(root);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f47139a.isEmpty();
        }

        @Override // java.util.Iterator, p000.gmc
        public T next() {
            T tRemove = this.f47139a.remove();
            vg8.addAll(this.f47139a, iih.this.children(tRemove));
            return tRemove;
        }

        @Override // p000.gmc
        public T peek() {
            return this.f47139a.element();
        }
    }

    /* JADX INFO: renamed from: iih$f */
    public final class C7308f extends AbstractC0012a2<T> {

        /* JADX INFO: renamed from: c */
        public final ArrayDeque<C7309g<T>> f47141c;

        public C7308f(T root) {
            ArrayDeque<C7309g<T>> arrayDeque = new ArrayDeque<>();
            this.f47141c = arrayDeque;
            arrayDeque.addLast(expand(root));
        }

        private C7309g<T> expand(T t) {
            return new C7309g<>(t, iih.this.children(t).iterator());
        }

        @Override // p000.AbstractC0012a2
        @wx1
        public T computeNext() {
            while (!this.f47141c.isEmpty()) {
                C7309g<T> last = this.f47141c.getLast();
                if (!last.f47144b.hasNext()) {
                    this.f47141c.removeLast();
                    return last.f47143a;
                }
                this.f47141c.addLast(expand(last.f47144b.next()));
            }
            return m25a();
        }
    }

    /* JADX INFO: renamed from: iih$g */
    public static final class C7309g<T> {

        /* JADX INFO: renamed from: a */
        public final T f47143a;

        /* JADX INFO: renamed from: b */
        public final Iterator<T> f47144b;

        public C7309g(T t, Iterator<T> it) {
            this.f47143a = (T) v7d.checkNotNull(t);
            this.f47144b = (Iterator) v7d.checkNotNull(it);
        }
    }

    /* JADX INFO: renamed from: iih$h */
    public final class C7310h extends quh<T> {

        /* JADX INFO: renamed from: a */
        public final Deque<Iterator<T>> f47145a;

        public C7310h(T root) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f47145a = arrayDeque;
            arrayDeque.addLast(wg8.singletonIterator(v7d.checkNotNull(root)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f47145a.isEmpty();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f47145a.getLast();
            T t = (T) v7d.checkNotNull(last.next());
            if (!last.hasNext()) {
                this.f47145a.removeLast();
            }
            Iterator<T> it = iih.this.children(t).iterator();
            if (it.hasNext()) {
                this.f47145a.addLast(it);
            }
            return t;
        }
    }

    @Deprecated
    public static <T> iih<T> using(final lz6<T, ? extends Iterable<T>> nodeToChildrenFunction) {
        v7d.checkNotNull(nodeToChildrenFunction);
        return new C7303a(nodeToChildrenFunction);
    }

    /* JADX INFO: renamed from: a */
    public quh<T> m13127a(T root) {
        return new C7308f(root);
    }

    /* JADX INFO: renamed from: b */
    public quh<T> m13128b(T root) {
        return new C7310h(root);
    }

    @Deprecated
    public final em6<T> breadthFirstTraversal(final T root) {
        v7d.checkNotNull(root);
        return new C7306d(root);
    }

    public abstract Iterable<T> children(T root);

    @Deprecated
    public final em6<T> postOrderTraversal(final T root) {
        v7d.checkNotNull(root);
        return new C7305c(root);
    }

    @Deprecated
    public final em6<T> preOrderTraversal(final T root) {
        v7d.checkNotNull(root);
        return new C7304b(root);
    }
}
