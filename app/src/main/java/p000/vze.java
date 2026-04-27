package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.jvd;
import p000.md2;
import p000.vze;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n183#1,2:3113\n320#1,7:3115\n1328#1,3:3123\n743#1,4:3126\n708#1,4:3130\n726#1,4:3134\n779#1,4:3138\n1021#1,3:3142\n1024#1,3:3152\n1041#1,3:3155\n1044#1,3:3165\n1328#1,3:3182\n1317#1,2:3185\n1#2:3122\n381#3,7:3145\n381#3,7:3158\n381#3,7:3168\n381#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n91#1:3113,2\n103#1:3115,7\n462#1:3123,3\n662#1:3126,4\n678#1:3130,4\n693#1:3134,4\n764#1:3138,4\n992#1:3142,3\n992#1:3152,3\n1007#1:3155,3\n1007#1:3165,3\n1110#1:3182,3\n1148#1:3185,2\n992#1:3145,7\n1007#1:3158,7\n1023#1:3168,7\n1043#1:3175,7\n*E\n"})
public class vze extends kze {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vze$a */
    @dwf({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,17:1\n2921#2:18\n*E\n"})
    public static final class C14314a<T> implements Iterable<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye f92966a;

        public C14314a(vye vyeVar) {
            this.f92966a = vyeVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f92966a.iterator();
        }
    }

    /* JADX INFO: renamed from: vze$b */
    public static final class C14315b implements qy6<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C14315b f92967a = new C14315b();

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        public final Boolean invoke(Object obj) {
            md8.reifiedOperationMarker(3, "R");
            return Boolean.valueOf(Objects.nonNull(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vze$c */
    public /* synthetic */ class C14316c<R> extends n07 implements qy6<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a */
        public static final C14316c f92968a = new C14316c();

        public C14316c() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p000.qy6
        public final Iterator<R> invoke(Iterable<? extends R> iterable) {
            md8.checkNotNullParameter(iterable, "p0");
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vze$d */
    public /* synthetic */ class C14317d<R> extends n07 implements qy6<vye<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a */
        public static final C14317d f92969a = new C14317d();

        public C14317d() {
            super(1, vye.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p000.qy6
        public final Iterator<R> invoke(vye<? extends R> vyeVar) {
            md8.checkNotNullParameter(vyeVar, "p0");
            return vyeVar.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vze$e */
    public /* synthetic */ class C14318e<R> extends n07 implements qy6<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a */
        public static final C14318e f92970a = new C14318e();

        public C14318e() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p000.qy6
        public final Iterator<R> invoke(Iterable<? extends R> iterable) {
            md8.checkNotNullParameter(iterable, "p0");
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vze$f */
    public /* synthetic */ class C14319f<R> extends n07 implements qy6<vye<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a */
        public static final C14319f f92971a = new C14319f();

        public C14319f() {
            super(1, vye.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p000.qy6
        public final Iterator<R> invoke(vye<? extends R> vyeVar) {
            md8.checkNotNullParameter(vyeVar, "p0");
            return vyeVar.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: renamed from: vze$g */
    public static final class C14320g<K, T> implements wb7<T, K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye<T> f92972a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<T, K> f92973b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14320g(vye<? extends T> vyeVar, qy6<? super T, ? extends K> qy6Var) {
            this.f92972a = vyeVar;
            this.f92973b = qy6Var;
        }

        @Override // p000.wb7
        public K keyOf(T t) {
            return this.f92973b.invoke(t);
        }

        @Override // p000.wb7
        public Iterator<T> sourceIterator() {
            return this.f92972a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vze$h */
    public static final class C14321h<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye<T> f92974a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T f92975b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14321h(vye<? extends T> vyeVar, T t) {
            this.f92974a = vyeVar;
            this.f92975b = t;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean iterator$lambda$0(jvd.C8114a c8114a, Object obj, Object obj2) {
            if (c8114a.f52103a || !md8.areEqual(obj2, obj)) {
                return true;
            }
            c8114a.f52103a = true;
            return false;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            final jvd.C8114a c8114a = new jvd.C8114a();
            vye<T> vyeVar = this.f92974a;
            final T t = this.f92975b;
            return vze.filter(vyeVar, new qy6() { // from class: wze
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(vze.C14321h.iterator$lambda$0(c8114a, t, obj));
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vze$i */
    public static final class C14322i<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye<T> f92976a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T[] f92977b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14322i(vye<? extends T> vyeVar, T[] tArr) {
            this.f92976a = vyeVar;
            this.f92977b = tArr;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            vye<T> vyeVar = this.f92976a;
            final T[] tArr = this.f92977b;
            return vze.filterNot(vyeVar, new qy6() { // from class: xze
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(e80.contains(tArr, obj));
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vze$j */
    public static final class C14323j<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable<T> f92978a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vye<T> f92979b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14323j(Iterable<? extends T> iterable, vye<? extends T> vyeVar) {
            this.f92978a = iterable;
            this.f92979b = vyeVar;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            final Collection collectionConvertToListIfNotCollection = q82.convertToListIfNotCollection(this.f92978a);
            return collectionConvertToListIfNotCollection.isEmpty() ? this.f92979b.iterator() : vze.filterNot(this.f92979b, new qy6() { // from class: yze
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(collectionConvertToListIfNotCollection.contains(obj));
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vze$k */
    public static final class C14324k<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye<T> f92980a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vye<T> f92981b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14324k(vye<? extends T> vyeVar, vye<? extends T> vyeVar2) {
            this.f92980a = vyeVar;
            this.f92981b = vyeVar2;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            final List list = vze.toList(this.f92980a);
            return list.isEmpty() ? this.f92981b.iterator() : vze.filterNot(this.f92981b, new qy6() { // from class: zze
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(list.contains(obj));
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vze$l */
    @ck3(m4009c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", m4010f = "_Sequences.kt", m4011i = {0, 1, 1}, m4012l = {2311, 2315}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "$this$sequence", "accumulator"}, m4015s = {"L$0", "L$0", "L$1"})
    public static final class C14325l<R> extends t7e implements gz6<xye<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f92982a;

        /* JADX INFO: renamed from: b */
        public Object f92983b;

        /* JADX INFO: renamed from: c */
        public int f92984c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f92985d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ R f92986e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vye<T> f92987f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ gz6<R, T, R> f92988m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14325l(R r, vye<? extends T> vyeVar, gz6<? super R, ? super T, ? extends R> gz6Var, zy2<? super C14325l> zy2Var) {
            super(2, zy2Var);
            this.f92986e = r;
            this.f92987f = vyeVar;
            this.f92988m = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C14325l c14325l = new C14325l(this.f92986e, this.f92987f, this.f92988m, zy2Var);
            c14325l.f92985d = obj;
            return c14325l;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super R> xyeVar, zy2<? super bth> zy2Var) {
            return ((C14325l) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f92984c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r6.f92983b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r6.f92982a
                java.lang.Object r4 = r6.f92985d
                xye r4 = (p000.xye) r4
                p000.y7e.throwOnFailure(r7)
            L1b:
                r7 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                java.lang.Object r1 = r6.f92985d
                xye r1 = (p000.xye) r1
                p000.y7e.throwOnFailure(r7)
                goto L42
            L2d:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f92985d
                r1 = r7
                xye r1 = (p000.xye) r1
                R r7 = r6.f92986e
                r6.f92985d = r1
                r6.f92984c = r3
                java.lang.Object r7 = r1.yield(r7, r6)
                if (r7 != r0) goto L42
                return r0
            L42:
                R r7 = r6.f92986e
                vye<T> r3 = r6.f92987f
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r1.next()
                gz6<R, T, R> r5 = r6.f92988m
                java.lang.Object r3 = r5.invoke(r7, r3)
                r6.f92985d = r4
                r6.f92982a = r3
                r6.f92983b = r1
                r6.f92984c = r2
                java.lang.Object r7 = r4.yield(r3, r6)
                if (r7 != r0) goto L1b
                return r0
            L6b:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vze.C14325l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vze$m */
    @ck3(m4009c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", m4010f = "_Sequences.kt", m4011i = {0, 1, 1, 1}, m4012l = {2339, 2344}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, m4015s = {"L$0", "L$0", "L$1", "I$0"})
    public static final class C14326m<R> extends t7e implements gz6<xye<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ kz6<Integer, R, T, R> f92989C;

        /* JADX INFO: renamed from: a */
        public Object f92990a;

        /* JADX INFO: renamed from: b */
        public Object f92991b;

        /* JADX INFO: renamed from: c */
        public int f92992c;

        /* JADX INFO: renamed from: d */
        public int f92993d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f92994e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ R f92995f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ vye<T> f92996m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14326m(R r, vye<? extends T> vyeVar, kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var, zy2<? super C14326m> zy2Var) {
            super(2, zy2Var);
            this.f92995f = r;
            this.f92996m = vyeVar;
            this.f92989C = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C14326m c14326m = new C14326m(this.f92995f, this.f92996m, this.f92989C, zy2Var);
            c14326m.f92994e = obj;
            return c14326m;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super R> xyeVar, zy2<? super bth> zy2Var) {
            return ((C14326m) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r8.f92993d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r8.f92992c
                java.lang.Object r3 = r8.f92991b
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r8.f92990a
                java.lang.Object r5 = r8.f92994e
                xye r5 = (p000.xye) r5
                p000.y7e.throwOnFailure(r9)
                r9 = r4
                r4 = r1
                goto L4f
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                java.lang.Object r1 = r8.f92994e
                xye r1 = (p000.xye) r1
                p000.y7e.throwOnFailure(r9)
                goto L45
            L30:
                p000.y7e.throwOnFailure(r9)
                java.lang.Object r9 = r8.f92994e
                r1 = r9
                xye r1 = (p000.xye) r1
                R r9 = r8.f92995f
                r8.f92994e = r1
                r8.f92993d = r3
                java.lang.Object r9 = r1.yield(r9, r8)
                if (r9 != r0) goto L45
                return r0
            L45:
                R r9 = r8.f92995f
                vye<T> r3 = r8.f92996m
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = r1
            L4f:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L7e
                java.lang.Object r1 = r3.next()
                kz6<java.lang.Integer, R, T, R> r6 = r8.f92989C
                int r7 = r4 + 1
                if (r4 >= 0) goto L62
                p000.l82.throwIndexOverflow()
            L62:
                java.lang.Integer r4 = p000.wc1.boxInt(r4)
                java.lang.Object r4 = r6.invoke(r4, r9, r1)
                r8.f92994e = r5
                r8.f92990a = r4
                r8.f92991b = r3
                r8.f92992c = r7
                r8.f92993d = r2
                java.lang.Object r9 = r5.yield(r4, r8)
                if (r9 != r0) goto L7b
                return r0
            L7b:
                r9 = r4
                r4 = r7
                goto L4f
            L7e:
                bth r9 = p000.bth.f14751a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vze.C14326m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: vze$n */
    @ck3(m4009c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", m4010f = "_Sequences.kt", m4011i = {0, 0, 0, 1, 1, 1}, m4012l = {2368, 2371}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class C14327n<S> extends t7e implements gz6<xye<? super S>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f92997a;

        /* JADX INFO: renamed from: b */
        public Object f92998b;

        /* JADX INFO: renamed from: c */
        public int f92999c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f93000d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vye<T> f93001e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<S, T, S> f93002f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14327n(vye<? extends T> vyeVar, gz6<? super S, ? super T, ? extends S> gz6Var, zy2<? super C14327n> zy2Var) {
            super(2, zy2Var);
            this.f93001e = vyeVar;
            this.f93002f = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C14327n c14327n = new C14327n(this.f93001e, this.f93002f, zy2Var);
            c14327n.f93000d = obj;
            return c14327n;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super S> xyeVar, zy2<? super bth> zy2Var) {
            return ((C14327n) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            xye xyeVar;
            Object next;
            Iterator it;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f92999c;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                xyeVar = (xye) this.f93000d;
                Iterator it2 = this.f93001e.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f93000d = xyeVar;
                    this.f92997a = it2;
                    this.f92998b = next;
                    this.f92999c = 1;
                    if (xyeVar.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = it2;
                }
                return bth.f14751a;
            }
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f92998b;
            it = (Iterator) this.f92997a;
            xyeVar = (xye) this.f93000d;
            y7e.throwOnFailure(obj);
            while (it.hasNext()) {
                next = this.f93002f.invoke((S) next, (T) it.next());
                this.f93000d = xyeVar;
                this.f92997a = it;
                this.f92998b = next;
                this.f92999c = 2;
                if (xyeVar.yield(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: vze$o */
    @ck3(m4009c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", m4010f = "_Sequences.kt", m4011i = {0, 0, 0, 1, 1, 1, 1}, m4012l = {2397, 2401}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    public static final class C14328o<S> extends t7e implements gz6<xye<? super S>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f93003a;

        /* JADX INFO: renamed from: b */
        public Object f93004b;

        /* JADX INFO: renamed from: c */
        public int f93005c;

        /* JADX INFO: renamed from: d */
        public int f93006d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f93007e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vye<T> f93008f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<Integer, S, T, S> f93009m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14328o(vye<? extends T> vyeVar, kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var, zy2<? super C14328o> zy2Var) {
            super(2, zy2Var);
            this.f93008f = vyeVar;
            this.f93009m = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C14328o c14328o = new C14328o(this.f93008f, this.f93009m, zy2Var);
            c14328o.f93007e = obj;
            return c14328o;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super S> xyeVar, zy2<? super bth> zy2Var) {
            return ((C14328o) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            xye xyeVar;
            Iterator it;
            Object next;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f93006d;
            int i2 = 1;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                xyeVar = (xye) this.f93007e;
                it = this.f93008f.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    this.f93007e = xyeVar;
                    this.f93003a = it;
                    this.f93004b = next;
                    this.f93006d = 1;
                    if (xyeVar.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return bth.f14751a;
            }
            if (i == 1) {
                next = this.f93004b;
                it = (Iterator) this.f93003a;
                xyeVar = (xye) this.f93007e;
                y7e.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = this.f93005c;
                Object obj2 = this.f93004b;
                it = (Iterator) this.f93003a;
                xyeVar = (xye) this.f93007e;
                y7e.throwOnFailure(obj);
                i2 = i3;
                next = obj2;
            }
            while (it.hasNext()) {
                kz6<Integer, S, T, S> kz6Var = this.f93009m;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    l82.throwIndexOverflow();
                }
                S sInvoke = kz6Var.invoke(wc1.boxInt(i2), (S) next, (T) it.next());
                this.f93007e = xyeVar;
                this.f93003a = it;
                this.f93004b = sInvoke;
                this.f93005c = i4;
                this.f93006d = 2;
                if (xyeVar.yield(sInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = sInvoke;
                i2 = i4;
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vze$p */
    public static final class C14329p<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye<T> f93010a;

        /* JADX WARN: Multi-variable type inference failed */
        public C14329p(vye<? extends T> vyeVar) {
            this.f93010a = vyeVar;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            List mutableList = vze.toMutableList(this.f93010a);
            p82.sort(mutableList);
            return mutableList.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vze$q */
    public static final class C14330q<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye<T> f93011a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator<? super T> f93012b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14330q(vye<? extends T> vyeVar, Comparator<? super T> comparator) {
            this.f93011a = vyeVar;
            this.f93012b = comparator;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            List mutableList = vze.toMutableList(this.f93011a);
            p82.sortWith(mutableList, this.f93012b);
            return mutableList.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vze$r */
    @ck3(m4009c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", m4010f = "_Sequences.kt", m4011i = {0, 0, 0}, m4012l = {2873}, m4013m = "invokeSuspend", m4014n = {"$this$result", "iterator", jk5.f50996b}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C14331r<R> extends t7e implements gz6<xye<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f93013a;

        /* JADX INFO: renamed from: b */
        public Object f93014b;

        /* JADX INFO: renamed from: c */
        public int f93015c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f93016d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vye<T> f93017e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<T, T, R> f93018f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14331r(vye<? extends T> vyeVar, gz6<? super T, ? super T, ? extends R> gz6Var, zy2<? super C14331r> zy2Var) {
            super(2, zy2Var);
            this.f93017e = vyeVar;
            this.f93018f = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C14331r c14331r = new C14331r(this.f93017e, this.f93018f, zy2Var);
            c14331r.f93016d = obj;
            return c14331r;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super R> xyeVar, zy2<? super bth> zy2Var) {
            return ((C14331r) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:6:0x0018). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f93015c
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r6.f93014b
                java.lang.Object r3 = r6.f93013a
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r6.f93016d
                xye r4 = (p000.xye) r4
                p000.y7e.throwOnFailure(r7)
            L18:
                r7 = r1
                goto L3f
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f93016d
                xye r7 = (p000.xye) r7
                vye<T> r1 = r6.f93017e
                java.util.Iterator r1 = r1.iterator()
                boolean r3 = r1.hasNext()
                if (r3 != 0) goto L38
                bth r7 = p000.bth.f14751a
                return r7
            L38:
                java.lang.Object r3 = r1.next()
                r4 = r7
                r7 = r3
                r3 = r1
            L3f:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r3.next()
                gz6<T, T, R> r5 = r6.f93018f
                java.lang.Object r7 = r5.invoke(r7, r1)
                r6.f93016d = r4
                r6.f93013a = r3
                r6.f93014b = r1
                r6.f93015c = r2
                java.lang.Object r7 = r4.yield(r7, r6)
                if (r7 != r0) goto L18
                return r0
            L5e:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vze.C14331r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> boolean all(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            if (!qy6Var.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vyeVar.iterator().hasNext();
    }

    @yfb
    public static <T> Iterable<T> asIterable(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return new C14314a(vyeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <T> vye<T> asSequence(vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vyeVar;
    }

    @yfb
    public static final <T, K, V> Map<K, V> associate(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(it.next());
            linkedHashMap.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K> Map<K, T> associateBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : vyeVar) {
            linkedHashMap.put(qy6Var.invoke(t), t);
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@yfb vye<? extends T> vyeVar, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (T t : vyeVar) {
            m.put(qy6Var.invoke(t), t);
        }
        return m;
    }

    @yfb
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@yfb vye<? extends T> vyeVar, @yfb M m, @yfb qy6<? super T, ? extends scc<? extends K, ? extends V>> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            scc<? extends K, ? extends V> sccVarInvoke = qy6Var.invoke(it.next());
            m.put(sccVarInvoke.getFirst(), sccVarInvoke.getSecond());
        }
        return m;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <K, V> Map<K, V> associateWith(@yfb vye<? extends K> vyeVar, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k : vyeVar) {
            linkedHashMap.put(k, qy6Var.invoke(k));
        }
        return linkedHashMap;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@yfb vye<? extends K> vyeVar, @yfb M m, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "valueSelector");
        for (K k : vyeVar) {
            m.put(k, qy6Var.invoke(k));
        }
        return m;
    }

    @xn8(name = "averageOfByte")
    public static final double averageOfByte(@yfb vye<Byte> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Byte> it = vyeVar.iterator();
        double dByteValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i);
    }

    @xn8(name = "averageOfDouble")
    public static final double averageOfDouble(@yfb vye<Double> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Double> it = vyeVar.iterator();
        double dDoubleValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i);
    }

    @xn8(name = "averageOfFloat")
    public static final double averageOfFloat(@yfb vye<Float> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Float> it = vyeVar.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    @xn8(name = "averageOfInt")
    public static final double averageOfInt(@yfb vye<Integer> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Integer> it = vyeVar.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    @xn8(name = "averageOfLong")
    public static final double averageOfLong(@yfb vye<Long> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Long> it = vyeVar.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i);
    }

    @xn8(name = "averageOfShort")
    public static final double averageOfShort(@yfb vye<Short> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Short> it = vyeVar.iterator();
        double dShortValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> vye<List<T>> chunked(@yfb vye<? extends T> vyeVar, int i) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return windowed(vyeVar, i, i, true);
    }

    public static <T> boolean contains(@yfb vye<? extends T> vyeVar, T t) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return indexOf(vyeVar, t) >= 0;
    }

    public static <T> int count(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                l82.throwCountOverflow();
            }
        }
        return i;
    }

    @yfb
    public static final <T> vye<T> distinct(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return distinctBy(vyeVar, new qy6() { // from class: uze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return vze.distinct$lambda$13$SequencesKt___SequencesKt(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object distinct$lambda$13$SequencesKt___SequencesKt(Object obj) {
        return obj;
    }

    @yfb
    public static final <T, K> vye<T> distinctBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return new xg4(vyeVar, qy6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static <T> vye<T> drop(@yfb vye<? extends T> vyeVar, int i) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        if (i >= 0) {
            return i == 0 ? vyeVar : vyeVar instanceof zr4 ? ((zr4) vyeVar).drop(i) : new vr4(vyeVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final <T> vye<T> dropWhile(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return new bs4(vyeVar, qy6Var);
    }

    public static final <T> T elementAt(@yfb vye<? extends T> vyeVar, final int i) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return (T) elementAtOrElse(vyeVar, i, new qy6() { // from class: qze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return vze.elementAt$lambda$0$SequencesKt___SequencesKt(i, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object elementAt$lambda$0$SequencesKt___SequencesKt(int i, int i2) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + a18.f100c);
    }

    public static final <T> T elementAtOrElse(@yfb vye<? extends T> vyeVar, int i, @yfb qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        if (i < 0) {
            return qy6Var.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : vyeVar) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return qy6Var.invoke(Integer.valueOf(i));
    }

    @gib
    public static final <T> T elementAtOrNull(@yfb vye<? extends T> vyeVar, int i) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : vyeVar) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    @yfb
    public static <T> vye<T> filter(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return new pv5(vyeVar, true, qy6Var);
    }

    @yfb
    public static final <T> vye<T> filterIndexed(@yfb vye<? extends T> vyeVar, @yfb final gz6<? super Integer, ? super T, Boolean> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "predicate");
        return new neh(new pv5(new t08(vyeVar), true, new qy6() { // from class: nze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return Boolean.valueOf(vze.filterIndexed$lambda$2$SequencesKt___SequencesKt(gz6Var, (q08) obj));
            }
        }), new qy6() { // from class: oze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return vze.filterIndexed$lambda$3$SequencesKt___SequencesKt((q08) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean filterIndexed$lambda$2$SequencesKt___SequencesKt(gz6 gz6Var, q08 q08Var) {
        md8.checkNotNullParameter(q08Var, "it");
        return ((Boolean) gz6Var.invoke(Integer.valueOf(q08Var.getIndex()), q08Var.getValue())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object filterIndexed$lambda$3$SequencesKt___SequencesKt(q08 q08Var) {
        md8.checkNotNullParameter(q08Var, "it");
        return q08Var.getValue();
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb gz6<? super Integer, ? super T, Boolean> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "predicate");
        int i = 0;
        for (T t : vyeVar) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            if (gz6Var.invoke(Integer.valueOf(i), t).booleanValue()) {
                c.add(t);
            }
            i = i2;
        }
        return c;
    }

    public static final /* synthetic */ <R> vye<R> filterIsInstance(vye<?> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.needClassReification();
        vye<R> vyeVarFilter = filter(vyeVar, C14315b.f92967a);
        md8.checkNotNull(vyeVarFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return vyeVarFilter;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(vye<?> vyeVar, C c) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (Object obj : vyeVar) {
            md8.reifiedOperationMarker(3, "R");
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    @yfb
    public static final <T> vye<T> filterNot(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return new pv5(vyeVar, false, qy6Var);
    }

    @yfb
    public static final <T> vye<T> filterNotNull(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        vye<T> vyeVarFilterNot = filterNot(vyeVar, new qy6() { // from class: rze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return Boolean.valueOf(vze.filterNotNull$lambda$5$SequencesKt___SequencesKt(obj));
            }
        });
        md8.checkNotNull(vyeVarFilterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return vyeVarFilterNot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean filterNotNull$lambda$5$SequencesKt___SequencesKt(Object obj) {
        return obj == null;
    }

    @yfb
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@yfb vye<? extends T> vyeVar, @yfb C c) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        for (T t : vyeVar) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterNotTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : vyeVar) {
            if (!qy6Var.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C filterTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : vyeVar) {
            if (qy6Var.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @t28
    private static final <T> T find(vye<? extends T> vyeVar, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : vyeVar) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @t28
    private static final <T> T findLast(vye<? extends T> vyeVar, qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        for (T t2 : vyeVar) {
            if (qy6Var.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> T first(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <T, R> R firstNotNullOf(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        R rInvoke;
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = vyeVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @jjf(version = "1.5")
    @t28
    private static final <T, R> R firstNotNullOfOrNull(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @gib
    public static <T> T firstOrNull(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @yfb
    public static final <T, R> vye<R> flatMap(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return new m36(vyeVar, qy6Var, C14317d.f92969a);
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapIndexedIterable")
    @yfb
    public static final <T, R> vye<R> flatMapIndexedIterable(@yfb vye<? extends T> vyeVar, @yfb gz6<? super Integer, ? super T, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        return ize.flatMapIndexed(vyeVar, gz6Var, C14318e.f92970a);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(vye<? extends T> vyeVar, C c, gz6<? super Integer, ? super T, ? extends Iterable<? extends R>> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : vyeVar) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapIndexedSequence")
    @yfb
    public static final <T, R> vye<R> flatMapIndexedSequence(@yfb vye<? extends T> vyeVar, @yfb gz6<? super Integer, ? super T, ? extends vye<? extends R>> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        return ize.flatMapIndexed(vyeVar, gz6Var, C14319f.f92971a);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(vye<? extends T> vyeVar, C c, gz6<? super Integer, ? super T, ? extends vye<? extends R>> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : vyeVar) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            q82.addAll(c, gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapIterable")
    @yfb
    public static final <T, R> vye<R> flatMapIterable(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return new m36(vyeVar, qy6Var, C14316c.f92968a);
    }

    @r9c
    @jjf(version = "1.4")
    @xn8(name = "flatMapIterableTo")
    @yfb
    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb qy6<? super T, ? extends Iterable<? extends R>> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            q82.addAll(c, qy6Var.invoke(it.next()));
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb qy6<? super T, ? extends vye<? extends R>> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            q82.addAll(c, qy6Var.invoke(it.next()));
        }
        return c;
    }

    public static final <T, R> R fold(@yfb vye<? extends T> vyeVar, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            r = gz6Var.invoke(r, it.next());
        }
        return r;
    }

    public static final <T, R> R foldIndexed(@yfb vye<? extends T> vyeVar, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        int i = 0;
        for (T t : vyeVar) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            r = kz6Var.invoke(Integer.valueOf(i), r, t);
            i = i2;
        }
        return r;
    }

    public static final <T> void forEach(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            qy6Var.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(@yfb vye<? extends T> vyeVar, @yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int i = 0;
        for (T t : vyeVar) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            gz6Var.invoke(Integer.valueOf(i), t);
            i = i2;
        }
    }

    @yfb
    public static final <T, K> Map<K, List<T>> groupBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : vyeVar) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return linkedHashMap;
    }

    @yfb
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@yfb vye<? extends T> vyeVar, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        for (T t : vyeVar) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return m;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T, K> wb7<T, K> groupingBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        return new C14320g(vyeVar, qy6Var);
    }

    public static final <T> int indexOf(@yfb vye<? extends T> vyeVar, T t) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        int i = 0;
        for (T t2 : vyeVar) {
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            if (md8.areEqual(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = 0;
        for (T t : vyeVar) {
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            if (qy6Var.invoke(t).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int i = -1;
        int i2 = 0;
        for (T t : vyeVar) {
            if (i2 < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            if (qy6Var.invoke(t).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @yfb
    public static final <T, A extends Appendable> A joinTo(@yfb vye<? extends T> vyeVar, @yfb A a, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super T, ? extends CharSequence> qy6Var) throws IOException {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(a, "buffer");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : vyeVar) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            w8g.appendElement(a, t, qy6Var);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @yfb
    public static final <T> String joinToString(@yfb vye<? extends T> vyeVar, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super T, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return ((StringBuilder) joinTo(vyeVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String joinToString$default(vye vyeVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return joinToString(vyeVar, charSequence, charSequence5, charSequence6, i3, charSequence7, qy6Var);
    }

    public static <T> T last(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> int lastIndexOf(@yfb vye<? extends T> vyeVar, T t) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        int i = -1;
        int i2 = 0;
        for (T t2 : vyeVar) {
            if (i2 < 0) {
                l82.throwIndexOverflow();
            }
            if (md8.areEqual(t, t2)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @gib
    public static final <T> T lastOrNull(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @yfb
    public static <T, R> vye<R> map(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return new neh(vyeVar, qy6Var);
    }

    @yfb
    public static final <T, R> vye<R> mapIndexed(@yfb vye<? extends T> vyeVar, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        return new meh(vyeVar, gz6Var);
    }

    @yfb
    public static final <T, R> vye<R> mapIndexedNotNull(@yfb vye<? extends T> vyeVar, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        return filterNotNull(new meh(vyeVar, gz6Var));
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : vyeVar) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            R rInvoke = gz6Var.invoke(Integer.valueOf(i), t);
            if (rInvoke != null) {
                c.add(rInvoke);
            }
            i = i2;
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(gz6Var, "transform");
        int i = 0;
        for (T t : vyeVar) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            c.add(gz6Var.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @yfb
    public static <T, R> vye<R> mapNotNull(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return filterNotNull(new neh(vyeVar, qy6Var));
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C mapTo(@yfb vye<? extends T> vyeVar, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "transform");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            c.add(qy6Var.invoke(it.next()));
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @gib
    @jjf(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @jjf(version = "1.7")
    @xn8(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T> double maxOf(vye<? extends T> vyeVar, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m32827maxOfOrNull(vye<? extends T> vyeVar, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R maxOfWith(vye<? extends T> vyeVar, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R maxOfWithOrNull(vye<? extends T> vyeVar, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m32829maxOrNull(@yfb vye<Double> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Double> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    public static final double maxOrThrow(@yfb vye<Double> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Double> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T maxWithOrNull(@yfb vye<? extends T> vyeVar, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @xn8(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@yfb vye<? extends T> vyeVar, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @gib
    @jjf(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @jjf(version = "1.7")
    @xn8(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = qy6Var.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = qy6Var.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T> double minOf(vye<? extends T> vyeVar, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m32835minOfOrNull(vye<? extends T> vyeVar, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = qy6Var.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, qy6Var.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R minOfWith(vye<? extends T> vyeVar, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R> R minOfWithOrNull(vye<? extends T> vyeVar, Comparator<? super R> comparator, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m32837minOrNull(@yfb vye<Double> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Double> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    public static final double minOrThrow(@yfb vye<Double> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Double> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T minWithOrNull(@yfb vye<? extends T> vyeVar, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @xn8(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@yfb vye<? extends T> vyeVar, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @yfb
    public static final <T> vye<T> minus(@yfb vye<? extends T> vyeVar, T t) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return new C14321h(vyeVar, t);
    }

    @t28
    private static final <T> vye<T> minusElement(vye<? extends T> vyeVar, T t) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return minus(vyeVar, t);
    }

    public static final <T> boolean none(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return !vyeVar.iterator().hasNext();
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T> vye<T> onEach(@yfb vye<? extends T> vyeVar, @yfb final qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        return map(vyeVar, new qy6() { // from class: sze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return vze.onEach$lambda$14$SequencesKt___SequencesKt(qy6Var, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onEach$lambda$14$SequencesKt___SequencesKt(qy6 qy6Var, Object obj) {
        qy6Var.invoke(obj);
        return obj;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T> vye<T> onEachIndexed(@yfb vye<? extends T> vyeVar, @yfb final gz6<? super Integer, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        return mapIndexed(vyeVar, new gz6() { // from class: tze
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return vze.onEachIndexed$lambda$15$SequencesKt___SequencesKt(gz6Var, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onEachIndexed$lambda$15$SequencesKt___SequencesKt(gz6 gz6Var, int i, Object obj) {
        gz6Var.invoke(Integer.valueOf(i), obj);
        return obj;
    }

    @yfb
    public static final <T> scc<List<T>, List<T>> partition(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : vyeVar) {
            if (qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new scc<>(arrayList, arrayList2);
    }

    @yfb
    public static final <T> vye<T> plus(@yfb vye<? extends T> vyeVar, T t) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return ize.flatten(ize.sequenceOf(vyeVar, ize.sequenceOf(t)));
    }

    @t28
    private static final <T> vye<T> plusElement(vye<? extends T> vyeVar, T t) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return plus(vyeVar, t);
    }

    public static final <S, T extends S> S reduce(@yfb vye<? extends T> vyeVar, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = gz6Var.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(@yfb vye<? extends T> vyeVar, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            next = kz6Var.invoke(Integer.valueOf(i), next, it.next());
            i = i2;
        }
        return next;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceIndexedOrNull(@yfb vye<? extends T> vyeVar, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            next = kz6Var.invoke(Integer.valueOf(i), next, it.next());
            i = i2;
        }
        return next;
    }

    @gib
    @jjf(version = "1.4")
    public static final <S, T extends S> S reduceOrNull(@yfb vye<? extends T> vyeVar, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = gz6Var.invoke(next, it.next());
        }
        return next;
    }

    @yfb
    public static final <T> vye<T> requireNoNulls(@yfb final vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return map(vyeVar, new qy6() { // from class: mze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return vze.requireNoNulls$lambda$16$SequencesKt___SequencesKt(vyeVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object requireNoNulls$lambda$16$SequencesKt___SequencesKt(vye vyeVar, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("null element found in " + vyeVar + a18.f100c);
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> vye<R> runningFold(@yfb vye<? extends T> vyeVar, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        return bze.sequence(new C14325l(r, vyeVar, gz6Var, null));
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> vye<R> runningFoldIndexed(@yfb vye<? extends T> vyeVar, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        return bze.sequence(new C14326m(r, vyeVar, kz6Var, null));
    }

    @jjf(version = "1.4")
    @yfb
    public static final <S, T extends S> vye<S> runningReduce(@yfb vye<? extends T> vyeVar, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        return bze.sequence(new C14327n(vyeVar, gz6Var, null));
    }

    @jjf(version = "1.4")
    @yfb
    public static final <S, T extends S> vye<S> runningReduceIndexed(@yfb vye<? extends T> vyeVar, @yfb kz6<? super Integer, ? super S, ? super T, ? extends S> kz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        return bze.sequence(new C14328o(vyeVar, kz6Var, null));
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> vye<R> scan(@yfb vye<? extends T> vyeVar, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "operation");
        return runningFold(vyeVar, r, gz6Var);
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T, R> vye<R> scanIndexed(@yfb vye<? extends T> vyeVar, R r, @yfb kz6<? super Integer, ? super R, ? super T, ? extends R> kz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(kz6Var, "operation");
        return runningFoldIndexed(vyeVar, r, kz6Var);
    }

    public static final <T> T single(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    @gib
    public static final <T> T singleOrNull(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @yfb
    public static final <T extends Comparable<? super T>> vye<T> sorted(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return new C14329p(vyeVar);
    }

    @yfb
    public static final <T, R extends Comparable<? super R>> vye<T> sortedBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(vyeVar, new md2.C9296a(qy6Var));
    }

    @yfb
    public static final <T, R extends Comparable<? super R>> vye<T> sortedByDescending(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return sortedWith(vyeVar, new md2.C9298c(qy6Var));
    }

    @yfb
    public static final <T extends Comparable<? super T>> vye<T> sortedDescending(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return sortedWith(vyeVar, md2.reverseOrder());
    }

    @yfb
    public static <T> vye<T> sortedWith(@yfb vye<? extends T> vyeVar, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return new C14330q(vyeVar, comparator);
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int sumBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Integer> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += qy6Var.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @t64(warningSince = "1.5")
    @q64(message = "Use sumOf instead.", replaceWith = @i2e(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double sumByDouble(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += qy6Var.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfByte")
    public static final int sumOfByte(@yfb vye<Byte> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Byte> it = vyeVar.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfDouble")
    private static final <T> double sumOfDouble(vye<? extends T> vyeVar, qy6<? super T, Double> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += qy6Var.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfFloat")
    public static final float sumOfFloat(@yfb vye<Float> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Float> it = vyeVar.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfInt")
    private static final <T> int sumOfInt(vye<? extends T> vyeVar, qy6<? super T, Integer> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += qy6Var.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfLong")
    private static final <T> long sumOfLong(vye<? extends T> vyeVar, qy6<? super T, Long> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += qy6Var.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @xn8(name = "sumOfShort")
    public static final int sumOfShort(@yfb vye<Short> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Short> it = vyeVar.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfUInt")
    @ihi(markerClass = {yh5.class})
    private static final <T> int sumOfUInt(vye<? extends T> vyeVar, qy6<? super T, woh> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        int iM33004constructorimpl = woh.m33004constructorimpl(0);
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + qy6Var.invoke(it.next()).m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "sumOfULong")
    @ihi(markerClass = {yh5.class})
    private static final <T> long sumOfULong(vye<? extends T> vyeVar, qy6<? super T, oph> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        long jM31533constructorimpl = oph.m31533constructorimpl(0L);
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + qy6Var.invoke(it.next()).m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @yfb
    public static <T> vye<T> take(@yfb vye<? extends T> vyeVar, int i) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        if (i >= 0) {
            return i == 0 ? ize.emptySequence() : vyeVar instanceof zr4 ? ((zr4) vyeVar).take(i) : new bmg(vyeVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @yfb
    public static final <T> vye<T> takeWhile(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return new cmg(vyeVar, qy6Var);
    }

    @yfb
    public static final <T, C extends Collection<? super T>> C toCollection(@yfb vye<? extends T> vyeVar, @yfb C c) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    @yfb
    public static final <T> HashSet<T> toHashSet(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return (HashSet) toCollection(vyeVar, new HashSet());
    }

    @yfb
    public static <T> List<T> toList(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return l82.emptyList();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return k82.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> toMutableList(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return (List) toCollection(vyeVar, new ArrayList());
    }

    @yfb
    public static final <T> Set<T> toMutableSet(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @yfb
    public static final <T> Set<T> toSet(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return w6f.emptySet();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return v6f.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> vye<List<T>> windowed(@yfb vye<? extends T> vyeVar, int i, int i2, boolean z) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return krf.windowedSequence(vyeVar, i, i2, z, false);
    }

    public static /* synthetic */ vye windowed$default(vye vyeVar, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(vyeVar, i, i2, z);
    }

    @yfb
    public static final <T> vye<q08<T>> withIndex(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return new t08(vyeVar);
    }

    @yfb
    public static final <T, R> vye<scc<T, R>> zip(@yfb vye<? extends T> vyeVar, @yfb vye<? extends R> vyeVar2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(vyeVar2, "other");
        return new bsa(vyeVar, vyeVar2, new gz6() { // from class: lze
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return vkh.m24050to(obj, obj2);
            }
        });
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> vye<scc<T, T>> zipWithNext(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return zipWithNext(vyeVar, new gz6() { // from class: pze
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return vkh.m24050to(obj, obj2);
            }
        });
    }

    public static final <T> boolean any(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T, R> vye<R> chunked(@yfb vye<? extends T> vyeVar, int i, @yfb qy6<? super List<? extends T>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return windowed(vyeVar, i, i, true, qy6Var);
    }

    public static final <T> int count(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Iterator<? extends T> it = vyeVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue() && (i = i + 1) < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
                l82.throwCountOverflow();
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> vye<T> minus(@yfb vye<? extends T> vyeVar, @yfb T[] tArr) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        return tArr.length == 0 ? vyeVar : new C14322i(vyeVar, tArr);
    }

    public static final <T> boolean none(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        Iterator<? extends T> it = vyeVar.iterator();
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public static final <T> vye<T> plus(@yfb vye<? extends T> vyeVar, @yfb T[] tArr) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        return plus((vye) vyeVar, (Iterable) u70.asList(tArr));
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T, R> vye<R> windowed(@yfb vye<? extends T> vyeVar, int i, int i2, boolean z, @yfb qy6<? super List<? extends T>, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        return map(krf.windowedSequence(vyeVar, i, i2, z, true), qy6Var);
    }

    public static /* synthetic */ vye windowed$default(vye vyeVar, int i, int i2, boolean z, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(vyeVar, i, i2, z, qy6Var);
    }

    @yfb
    public static final <T, R, V> vye<V> zip(@yfb vye<? extends T> vyeVar, @yfb vye<? extends R> vyeVar2, @yfb gz6<? super T, ? super R, ? extends V> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(vyeVar2, "other");
        md8.checkNotNullParameter(gz6Var, "transform");
        return new bsa(vyeVar, vyeVar2, gz6Var);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T, R> vye<R> zipWithNext(@yfb vye<? extends T> vyeVar, @yfb gz6<? super T, ? super T, ? extends R> gz6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(gz6Var, "transform");
        return bze.sequence(new C14331r(vyeVar, gz6Var, null));
    }

    @yfb
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@yfb vye<? extends T> vyeVar, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (T t : vyeVar) {
            m.put(qy6Var.invoke(t), qy6Var2.invoke(t));
        }
        return m;
    }

    @yfb
    public static final <T> vye<T> plus(@yfb vye<? extends T> vyeVar, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        return ize.flatten(ize.sequenceOf(vyeVar, v82.asSequence(iterable)));
    }

    @xn8(name = "sumOfDouble")
    public static final double sumOfDouble(@yfb vye<Double> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Double> it = vyeVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @xn8(name = "sumOfInt")
    public static final int sumOfInt(@yfb vye<Integer> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Integer> it = vyeVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @xn8(name = "sumOfLong")
    public static final long sumOfLong(@yfb vye<Long> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Long> it = vyeVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @yfb
    public static final <T, K, V> Map<K, V> associateBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : vyeVar) {
            linkedHashMap.put(qy6Var.invoke(t), qy6Var2.invoke(t));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @gib
    public static final <T> T firstOrNull(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : vyeVar) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @yfb
    public static final <T> vye<T> minus(@yfb vye<? extends T> vyeVar, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        return new C14323j(iterable, vyeVar);
    }

    @yfb
    public static final <T> vye<T> plus(@yfb vye<? extends T> vyeVar, @yfb vye<? extends T> vyeVar2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(vyeVar2, "elements");
        return ize.flatten(ize.sequenceOf(vyeVar, vyeVar2));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T first(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        for (T t : vyeVar) {
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @yfb
    public static final <T> vye<T> minus(@yfb vye<? extends T> vyeVar, @yfb vye<? extends T> vyeVar2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(vyeVar2, "elements");
        return new C14324k(vyeVar2, vyeVar);
    }

    @gib
    public static final <T> T singleOrNull(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        boolean z = false;
        T t = null;
        for (T t2 : vyeVar) {
            if (qy6Var.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    @gib
    public static final <T> T lastOrNull(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        for (T t2 : vyeVar) {
            if (qy6Var.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    public static final <T> T last(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : vyeVar) {
            if (qy6Var.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T single(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : vyeVar) {
            if (qy6Var.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@yfb vye<? extends T> vyeVar, @yfb M m, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(m, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        for (T t : vyeVar) {
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qy6Var2.invoke(t));
        }
        return m;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m32825maxOf(vye<? extends T> vyeVar, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = qy6Var.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, qy6Var.invoke(it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m32828maxOfOrNull(vye<? extends T> vyeVar, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, qy6Var.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m32830maxOrNull(@yfb vye<Float> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Float> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "maxOrThrow")
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m32831maxOrThrow(@yfb vye<Float> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Float> it = vyeVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m32833minOf(vye<? extends T> vyeVar, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = qy6Var.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, qy6Var.invoke(it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m32836minOfOrNull(vye<? extends T> vyeVar, qy6<? super T, Float> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = qy6Var.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, qy6Var.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @gib
    @jjf(version = "1.4")
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m32838minOrNull(@yfb vye<Float> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Float> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @jjf(version = "1.7")
    @xn8(name = "minOrThrow")
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m32839minOrThrow(@yfb vye<Float> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<Float> it = vyeVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @yfb
    public static final <T, K, V> Map<K, List<V>> groupBy(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends K> qy6Var, @yfb qy6<? super T, ? extends V> qy6Var2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        md8.checkNotNullParameter(qy6Var2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : vyeVar) {
            K kInvoke = qy6Var.invoke(t);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(qy6Var2.invoke(t));
        }
        return linkedHashMap;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m32826maxOf(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            while (it.hasNext()) {
                R rInvoke2 = qy6Var.invoke(it.next());
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOrNull(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @yfb
    @xn8(name = "maxOrThrow")
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m32832maxOrThrow(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m32834minOf(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            R rInvoke = qy6Var.invoke(it.next());
            while (it.hasNext()) {
                R rInvoke2 = qy6Var.invoke(it.next());
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(vye<? extends T> vyeVar, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = qy6Var.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @gib
    @jjf(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOrNull(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @jjf(version = "1.7")
    @yfb
    @xn8(name = "minOrThrow")
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m32840minOrThrow(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<? extends T> it = vyeVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }
}
