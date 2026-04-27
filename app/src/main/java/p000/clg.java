package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p000.clg;
import p000.kkg;
import p000.nlg;
import p000.ty7;

/* JADX INFO: loaded from: classes5.dex */
@zr7
@gd7
@tx4
public final class clg {

    /* JADX INFO: renamed from: clg$b */
    public static final class C2381b<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final List<C2382c<R, C, V>> f16908a;

        /* JADX INFO: renamed from: b */
        public final kkg<R, C, C2382c<R, C, V>> f16909b;

        private C2381b() {
            this.f16908a = new ArrayList();
            this.f16909b = hh7.create();
        }

        /* JADX INFO: renamed from: a */
        public C2381b<R, C, V> m4065a(C2381b<R, C, V> other, BinaryOperator<V> merger) {
            for (C2382c<R, C, V> c2382c : other.f16908a) {
                m4066b(c2382c.getRowKey(), c2382c.getColumnKey(), c2382c.getValue(), merger);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public void m4066b(R row, C column, V value, BinaryOperator<V> merger) {
            C2382c<R, C, V> c2382c = this.f16909b.get(row, column);
            if (c2382c != null) {
                c2382c.m4068a(value, merger);
                return;
            }
            C2382c<R, C, V> c2382c2 = new C2382c<>(row, column, value);
            this.f16908a.add(c2382c2);
            this.f16909b.put(row, column, c2382c2);
        }

        /* JADX INFO: renamed from: c */
        public ty7<R, C, V> m4067c() {
            return ty7.m22918g(this.f16908a);
        }
    }

    /* JADX INFO: renamed from: clg$c */
    @zr7
    public static final class C2382c<R, C, V> extends nlg.AbstractC9929b<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final R f16910a;

        /* JADX INFO: renamed from: b */
        public final C f16911b;

        /* JADX INFO: renamed from: c */
        public V f16912c;

        public C2382c(R r, C c, V v) {
            this.f16910a = (R) v7d.checkNotNull(r, "row");
            this.f16911b = (C) v7d.checkNotNull(c, "column");
            this.f16912c = (V) v7d.checkNotNull(v, "value");
        }

        /* JADX INFO: renamed from: a */
        public void m4068a(V v, BinaryOperator<V> binaryOperator) {
            v7d.checkNotNull(v, "value");
            this.f16912c = (V) v7d.checkNotNull(binaryOperator.apply(this.f16912c, v), "mergeFunction.apply");
        }

        @Override // p000.kkg.InterfaceC8439a
        public C getColumnKey() {
            return this.f16911b;
        }

        @Override // p000.kkg.InterfaceC8439a
        public R getRowKey() {
            return this.f16910a;
        }

        @Override // p000.kkg.InterfaceC8439a
        public V getValue() {
            return this.f16912c;
        }
    }

    private clg() {
    }

    /* JADX INFO: renamed from: i */
    public static <T, R, C, V> Collector<T, ?, ty7<R, C, V>> m4061i(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction) {
        v7d.checkNotNull(rowFunction, "rowFunction");
        v7d.checkNotNull(columnFunction, "columnFunction");
        v7d.checkNotNull(valueFunction, "valueFunction");
        return Collector.of(new Supplier() { // from class: zkg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ty7.C13286a();
            }
        }, new BiConsumer() { // from class: alg
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                clg.lambda$toImmutableTable$0(rowFunction, columnFunction, valueFunction, (ty7.C13286a) obj, obj2);
            }
        }, new BinaryOperator() { // from class: blg
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ty7.C13286a) obj).m22922a((ty7.C13286a) obj2);
            }
        }, new Function() { // from class: skg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ty7.C13286a) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: j */
    public static <T, R, C, V> Collector<T, ?, ty7<R, C, V>> m4062j(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction) {
        v7d.checkNotNull(rowFunction, "rowFunction");
        v7d.checkNotNull(columnFunction, "columnFunction");
        v7d.checkNotNull(valueFunction, "valueFunction");
        v7d.checkNotNull(mergeFunction, "mergeFunction");
        return Collector.of(new Supplier() { // from class: vkg
            @Override // java.util.function.Supplier
            public final Object get() {
                return clg.lambda$toImmutableTable$1();
            }
        }, new BiConsumer() { // from class: wkg
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                clg.lambda$toImmutableTable$2(rowFunction, columnFunction, valueFunction, mergeFunction, (clg.C2381b) obj, obj2);
            }
        }, new BinaryOperator() { // from class: xkg
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return clg.lambda$toImmutableTable$3(mergeFunction, (clg.C2381b) obj, (clg.C2381b) obj2);
            }
        }, new Function() { // from class: ykg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((clg.C2381b) obj).m4067c();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: k */
    public static <T, R, C, V, I extends kkg<R, C, V>> Collector<T, ?, I> m4063k(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction, Supplier<I> tableSupplier) {
        v7d.checkNotNull(rowFunction);
        v7d.checkNotNull(columnFunction);
        v7d.checkNotNull(valueFunction);
        v7d.checkNotNull(mergeFunction);
        v7d.checkNotNull(tableSupplier);
        return Collector.of(tableSupplier, new BiConsumer() { // from class: tkg
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                clg.lambda$toTable$6(rowFunction, columnFunction, valueFunction, mergeFunction, (kkg) obj, obj2);
            }
        }, new BinaryOperator() { // from class: ukg
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return clg.lambda$toTable$7(mergeFunction, (kkg) obj, (kkg) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: l */
    public static <T, R, C, V, I extends kkg<R, C, V>> Collector<T, ?, I> m4064l(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, Supplier<I> tableSupplier) {
        return m4063k(rowFunction, columnFunction, valueFunction, new BinaryOperator() { // from class: rkg
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return clg.lambda$toTable$5(obj, obj2);
            }
        }, tableSupplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toImmutableTable$0(Function function, Function function2, Function function3, ty7.C13286a c13286a, Object obj) {
        c13286a.put(function.apply(obj), function2.apply(obj), function3.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2381b lambda$toImmutableTable$1() {
        return new C2381b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toImmutableTable$2(Function function, Function function2, Function function3, BinaryOperator binaryOperator, C2381b c2381b, Object obj) {
        c2381b.m4066b(function.apply(obj), function2.apply(obj), function3.apply(obj), binaryOperator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2381b lambda$toImmutableTable$3(BinaryOperator binaryOperator, C2381b c2381b, C2381b c2381b2) {
        return c2381b.m4065a(c2381b2, binaryOperator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$toTable$5(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toTable$6(Function function, Function function2, Function function3, BinaryOperator binaryOperator, kkg kkgVar, Object obj) {
        mergeTables(kkgVar, function.apply(obj), function2.apply(obj), function3.apply(obj), binaryOperator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kkg lambda$toTable$7(BinaryOperator binaryOperator, kkg kkgVar, kkg kkgVar2) {
        for (kkg.InterfaceC8439a interfaceC8439a : kkgVar2.cellSet()) {
            mergeTables(kkgVar, interfaceC8439a.getRowKey(), interfaceC8439a.getColumnKey(), interfaceC8439a.getValue(), binaryOperator);
        }
        return kkgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <R, C, V> void mergeTables(kkg<R, C, V> table, @dgc R row, @dgc C column, @dgc V value, BinaryOperator<V> mergeFunction) {
        v7d.checkNotNull(value);
        V v = table.get(row, column);
        if (v == null) {
            table.put(row, column, value);
            return;
        }
        Object objApply = mergeFunction.apply(v, value);
        if (objApply == null) {
            table.remove(row, column);
        } else {
            table.put(row, column, objApply);
        }
    }
}
