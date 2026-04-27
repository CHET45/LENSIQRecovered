package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@w01
@wx4
public abstract class vhh<N> {

    /* JADX INFO: renamed from: a */
    public final bfg<N> f91206a;

    /* JADX INFO: renamed from: vhh$a */
    public class C14076a extends vhh<N> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bfg f91207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14076a(bfg successorFunction, final bfg val$graph) {
            super(successorFunction, null);
            this.f91207b = val$graph;
        }

        @Override // p000.vhh
        /* JADX INFO: renamed from: a */
        public AbstractC14082g<N> mo23966a() {
            return AbstractC14082g.m23968b(this.f91207b);
        }
    }

    /* JADX INFO: renamed from: vhh$b */
    public class C14077b extends vhh<N> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bfg f91208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14077b(bfg successorFunction, final bfg val$tree) {
            super(successorFunction, null);
            this.f91208b = val$tree;
        }

        @Override // p000.vhh
        /* JADX INFO: renamed from: a */
        public AbstractC14082g<N> mo23966a() {
            return AbstractC14082g.m23969c(this.f91208b);
        }
    }

    /* JADX INFO: renamed from: vhh$c */
    public class C14078c implements Iterable<N> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dy7 f91209a;

        public C14078c(final dy7 val$validated) {
            this.f91209a = val$validated;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return vhh.this.mo23966a().m23970a(this.f91209a.iterator());
        }
    }

    /* JADX INFO: renamed from: vhh$d */
    public class C14079d implements Iterable<N> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dy7 f91211a;

        public C14079d(final dy7 val$validated) {
            this.f91211a = val$validated;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return vhh.this.mo23966a().m23972e(this.f91211a.iterator());
        }
    }

    /* JADX INFO: renamed from: vhh$e */
    public class C14080e implements Iterable<N> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dy7 f91213a;

        public C14080e(final dy7 val$validated) {
            this.f91213a = val$validated;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return vhh.this.mo23966a().m23971d(this.f91213a.iterator());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: vhh$f */
    public static abstract class EnumC14081f {

        /* JADX INFO: renamed from: a */
        public static final EnumC14081f f91215a = new a("FRONT", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC14081f f91216b = new b("BACK", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC14081f[] f91217c = $values();

        /* JADX INFO: renamed from: vhh$f$a */
        public enum a extends EnumC14081f {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.vhh.EnumC14081f
            /* JADX INFO: renamed from: a */
            public <T> void mo23967a(Deque<T> deque, T value) {
                deque.addFirst(value);
            }
        }

        /* JADX INFO: renamed from: vhh$f$b */
        public enum b extends EnumC14081f {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.vhh.EnumC14081f
            /* JADX INFO: renamed from: a */
            public <T> void mo23967a(Deque<T> deque, T value) {
                deque.addLast(value);
            }
        }

        private static /* synthetic */ EnumC14081f[] $values() {
            return new EnumC14081f[]{f91215a, f91216b};
        }

        private EnumC14081f(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC14081f valueOf(String name) {
            return (EnumC14081f) Enum.valueOf(EnumC14081f.class, name);
        }

        public static EnumC14081f[] values() {
            return (EnumC14081f[]) f91217c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract <T> void mo23967a(Deque<T> deque, T value);

        public /* synthetic */ EnumC14081f(String str, int i, C14076a c14076a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: vhh$g */
    public static abstract class AbstractC14082g<N> {

        /* JADX INFO: renamed from: a */
        public final bfg<N> f91218a;

        /* JADX INFO: renamed from: vhh$g$a */
        public class a extends AbstractC14082g<N> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Set f91219b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(bfg successorFunction, final Set val$visited) {
                super(successorFunction);
                this.f91219b = val$visited;
            }

            @Override // p000.vhh.AbstractC14082g
            @wx1
            /* JADX INFO: renamed from: f */
            public N mo23973f(Deque<Iterator<? extends N>> horizon) {
                Iterator<? extends N> first = horizon.getFirst();
                while (first.hasNext()) {
                    N next = first.next();
                    Objects.requireNonNull(next);
                    if (this.f91219b.add(next)) {
                        return next;
                    }
                }
                horizon.removeFirst();
                return null;
            }
        }

        /* JADX INFO: renamed from: vhh$g$b */
        public class b extends AbstractC14082g<N> {
            public b(bfg successorFunction) {
                super(successorFunction);
            }

            @Override // p000.vhh.AbstractC14082g
            @wx1
            /* JADX INFO: renamed from: f */
            public N mo23973f(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                if (first.hasNext()) {
                    return (N) v7d.checkNotNull(first.next());
                }
                deque.removeFirst();
                return null;
            }
        }

        /* JADX INFO: renamed from: vhh$g$c */
        public class c extends AbstractC0012a2<N> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Deque f91220c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ EnumC14081f f91221d;

            public c(final Deque val$horizon, final EnumC14081f val$order) {
                this.f91220c = val$horizon;
                this.f91221d = val$order;
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
            @Override // p000.AbstractC0012a2
            @wx1
            public N computeNext() {
                do {
                    N n = (N) AbstractC14082g.this.mo23973f(this.f91220c);
                    if (n != null) {
                        Iterator<? extends N> it = AbstractC14082g.this.f91218a.successors(n).iterator();
                        if (it.hasNext()) {
                            this.f91221d.mo23967a(this.f91220c, it);
                        }
                        return n;
                    }
                } while (!this.f91220c.isEmpty());
                return m25a();
            }
        }

        /* JADX INFO: renamed from: vhh$g$d */
        public class d extends AbstractC0012a2<N> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Deque f91223c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Deque f91224d;

            public d(final Deque val$horizon, final Deque val$ancestorStack) {
                this.f91223c = val$horizon;
                this.f91224d = val$ancestorStack;
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
            @Override // p000.AbstractC0012a2
            @wx1
            public N computeNext() {
                while (true) {
                    N n = (N) AbstractC14082g.this.mo23973f(this.f91223c);
                    if (n == null) {
                        return !this.f91224d.isEmpty() ? (N) this.f91224d.pop() : m25a();
                    }
                    Iterator<? extends N> it = AbstractC14082g.this.f91218a.successors(n).iterator();
                    if (!it.hasNext()) {
                        return n;
                    }
                    this.f91223c.addFirst(it);
                    this.f91224d.push(n);
                }
            }
        }

        public AbstractC14082g(bfg<N> successorFunction) {
            this.f91218a = successorFunction;
        }

        /* JADX INFO: renamed from: b */
        public static <N> AbstractC14082g<N> m23968b(bfg<N> graph) {
            return new a(graph, new HashSet());
        }

        /* JADX INFO: renamed from: c */
        public static <N> AbstractC14082g<N> m23969c(bfg<N> tree) {
            return new b(tree);
        }

        private Iterator<N> topDown(Iterator<? extends N> startNodes, EnumC14081f order) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(startNodes);
            return new c(arrayDeque, order);
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<N> m23970a(Iterator<? extends N> startNodes) {
            return topDown(startNodes, EnumC14081f.f91216b);
        }

        /* JADX INFO: renamed from: d */
        public final Iterator<N> m23971d(Iterator<? extends N> startNodes) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(startNodes);
            return new d(arrayDeque2, arrayDeque);
        }

        /* JADX INFO: renamed from: e */
        public final Iterator<N> m23972e(Iterator<? extends N> startNodes) {
            return topDown(startNodes, EnumC14081f.f91215a);
        }

        @wx1
        /* JADX INFO: renamed from: f */
        public abstract N mo23973f(Deque<Iterator<? extends N>> horizon);
    }

    public /* synthetic */ vhh(bfg bfgVar, C14076a c14076a) {
        this(bfgVar);
    }

    public static <N> vhh<N> forGraph(bfg<N> graph) {
        return new C14076a(graph, graph);
    }

    public static <N> vhh<N> forTree(bfg<N> tree) {
        if (tree instanceof gr0) {
            v7d.checkArgument(((gr0) tree).isDirected(), "Undirected graphs can never be trees.");
        }
        if (tree instanceof cbb) {
            v7d.checkArgument(((cbb) tree).isDirected(), "Undirected networks can never be trees.");
        }
        return new C14077b(tree, tree);
    }

    private dy7<N> validate(Iterable<? extends N> startNodes) {
        dy7<N> dy7VarCopyOf = dy7.copyOf(startNodes);
        quh<N> it = dy7VarCopyOf.iterator();
        while (it.hasNext()) {
            this.f91206a.successors(it.next());
        }
        return dy7VarCopyOf;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC14082g<N> mo23966a();

    public final Iterable<N> breadthFirst(N startNode) {
        return breadthFirst((Iterable) dy7.m9576of(startNode));
    }

    public final Iterable<N> depthFirstPostOrder(N startNode) {
        return depthFirstPostOrder((Iterable) dy7.m9576of(startNode));
    }

    public final Iterable<N> depthFirstPreOrder(N startNode) {
        return depthFirstPreOrder((Iterable) dy7.m9576of(startNode));
    }

    private vhh(bfg<N> successorFunction) {
        this.f91206a = (bfg) v7d.checkNotNull(successorFunction);
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> startNodes) {
        return new C14078c(validate(startNodes));
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> startNodes) {
        return new C14080e(validate(startNodes));
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> startNodes) {
        return new C14079d(validate(startNodes));
    }
}
