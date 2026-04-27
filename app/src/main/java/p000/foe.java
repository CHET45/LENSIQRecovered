package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1726#2,3:64\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n*L\n39#1:64,3\n*E\n"})
@e0g(parameters = 0)
public final class foe<T> implements Set<T>, uo8 {

    /* JADX INFO: renamed from: b */
    public static final int f37256b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final doe<T> f37257a;

    /* JADX INFO: renamed from: foe$a */
    @ck3(m4009c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", m4010f = "ScatterSetWrapper.kt", m4011i = {0, 0, 0, 0, 0, 0, 0, 0}, m4012l = {34}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, m4015s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @dwf({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,63:1\n267#2,4:64\n237#2,7:68\n248#2,3:76\n251#2,2:80\n272#2,2:82\n254#2,6:84\n274#2:90\n1810#3:75\n1672#3:79\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n*L\n33#1:64,4\n33#1:68,7\n33#1:76,3\n33#1:80,2\n33#1:82,2\n33#1:84,6\n33#1:90\n33#1:75\n33#1:79\n*E\n"})
    public static final class C5906a extends t7e implements gz6<xye<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public int f37258C;

        /* JADX INFO: renamed from: F */
        public /* synthetic */ Object f37259F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ foe<T> f37260H;

        /* JADX INFO: renamed from: a */
        public Object f37261a;

        /* JADX INFO: renamed from: b */
        public Object f37262b;

        /* JADX INFO: renamed from: c */
        public int f37263c;

        /* JADX INFO: renamed from: d */
        public int f37264d;

        /* JADX INFO: renamed from: e */
        public int f37265e;

        /* JADX INFO: renamed from: f */
        public int f37266f;

        /* JADX INFO: renamed from: m */
        public long f37267m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5906a(foe<T> foeVar, zy2<? super C5906a> zy2Var) {
            super(2, zy2Var);
            this.f37260H = foeVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5906a c5906a = new C5906a(this.f37260H, zy2Var);
            c5906a.f37259F = obj;
            return c5906a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb xye<? super T> xyeVar, @gib zy2<? super bth> zy2Var) {
            return ((C5906a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, xye] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f37258C
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f37266f
                int r6 = r0.f37265e
                long r7 = r0.f37267m
                int r9 = r0.f37264d
                int r10 = r0.f37263c
                java.lang.Object r11 = r0.f37262b
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f37261a
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f37259F
                xye r13 = (p000.xye) r13
                p000.y7e.throwOnFailure(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                p000.y7e.throwOnFailure(r21)
                java.lang.Object r2 = r0.f37259F
                xye r2 = (p000.xye) r2
                foe<T> r6 = r0.f37260H
                doe r6 = r6.getSet$runtime_release()
                java.lang.Object[] r7 = r6.f30278b
                long[] r6 = r6.f30277a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f37259F = r13
                r0.f37261a = r12
                r0.f37262b = r11
                r0.f37263c = r10
                r0.f37264d = r9
                r0.f37267m = r7
                r0.f37265e = r6
                r0.f37266f = r2
                r0.f37258C = r5
                java.lang.Object r14 = r13.yield(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                bth r1 = p000.bth.f14751a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.foe.C5906a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public foe(@yfb doe<T> doeVar) {
        this.f37257a = doeVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f37257a.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f37257a.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public final doe<T> getSet$runtime_release() {
        return this.f37257a;
    }

    public int getSize() {
        return this.f37257a.getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f37257a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<T> iterator() {
        return bze.iterator(new C5906a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }
}
