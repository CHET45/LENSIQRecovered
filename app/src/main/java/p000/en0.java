package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n37#2,2:122\n13346#3,2:124\n1863#4,2:126\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n36#1:122,2\n47#1:124,2\n58#1:126,2\n*E\n"})
public final class en0 {

    /* JADX INFO: renamed from: en0$a */
    @ck3(m4009c = "kotlinx.coroutines.AwaitKt", m4010f = "Await.kt", m4011i = {0}, m4012l = {47}, m4013m = "joinAll", m4014n = {"$this$forEach$iv"}, m4015s = {"L$0"})
    public static final class C5400a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f33563a;

        /* JADX INFO: renamed from: b */
        public int f33564b;

        /* JADX INFO: renamed from: c */
        public int f33565c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f33566d;

        /* JADX INFO: renamed from: e */
        public int f33567e;

        public C5400a(zy2<? super C5400a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f33566d = obj;
            this.f33567e |= Integer.MIN_VALUE;
            return en0.joinAll((jj8[]) null, this);
        }
    }

    /* JADX INFO: renamed from: en0$b */
    @ck3(m4009c = "kotlinx.coroutines.AwaitKt", m4010f = "Await.kt", m4011i = {}, m4012l = {58}, m4013m = "joinAll", m4014n = {}, m4015s = {})
    public static final class C5401b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f33568a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f33569b;

        /* JADX INFO: renamed from: c */
        public int f33570c;

        public C5401b(zy2<? super C5401b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f33569b = obj;
            this.f33570c |= Integer.MIN_VALUE;
            return en0.joinAll((Collection<? extends jj8>) null, this);
        }
    }

    @gib
    public static final <T> Object awaitAll(@yfb a34<? extends T>[] a34VarArr, @yfb zy2<? super List<? extends T>> zy2Var) {
        return a34VarArr.length == 0 ? l82.emptyList() : new cn0(a34VarArr).await(zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object joinAll(@p000.yfb p000.jj8[] r6, @p000.yfb p000.zy2<? super p000.bth> r7) {
        /*
            boolean r0 = r7 instanceof p000.en0.C5400a
            if (r0 == 0) goto L13
            r0 = r7
            en0$a r0 = (p000.en0.C5400a) r0
            int r1 = r0.f33567e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33567e = r1
            goto L18
        L13:
            en0$a r0 = new en0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f33566d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f33567e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f33565c
            int r2 = r0.f33564b
            java.lang.Object r4 = r0.f33563a
            jj8[] r4 = (p000.jj8[]) r4
            p000.y7e.throwOnFailure(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            p000.y7e.throwOnFailure(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f33563a = r7
            r0.f33564b = r2
            r0.f33565c = r6
            r0.f33567e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.en0.joinAll(jj8[], zy2):java.lang.Object");
    }

    @gib
    public static final <T> Object awaitAll(@yfb Collection<? extends a34<? extends T>> collection, @yfb zy2<? super List<? extends T>> zy2Var) {
        return collection.isEmpty() ? l82.emptyList() : new cn0((a34[]) collection.toArray(new a34[0])).await(zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object joinAll(@p000.yfb java.util.Collection<? extends p000.jj8> r4, @p000.yfb p000.zy2<? super p000.bth> r5) {
        /*
            boolean r0 = r5 instanceof p000.en0.C5401b
            if (r0 == 0) goto L13
            r0 = r5
            en0$b r0 = (p000.en0.C5401b) r0
            int r1 = r0.f33570c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33570c = r1
            goto L18
        L13:
            en0$b r0 = new en0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f33569b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f33570c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f33568a
            java.util.Iterator r4 = (java.util.Iterator) r4
            p000.y7e.throwOnFailure(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            jj8 r5 = (p000.jj8) r5
            r0.f33568a = r4
            r0.f33570c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            bth r4 = p000.bth.f14751a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.en0.joinAll(java.util.Collection, zy2):java.lang.Object");
    }
}
