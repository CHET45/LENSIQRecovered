package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,179:1\n1208#2:180\n1187#2,2:181\n460#3,11:183\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n110#1:180\n110#1:181,2\n113#1:183,11\n*E\n"})
public final class nd1 implements md1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<pd1> f64014a = new f7b<>(new pd1[16], 0);

    /* JADX INFO: renamed from: nd1$a */
    @ck3(m4009c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m4010f = "BringIntoViewRequester.kt", m4011i = {0, 0, 0, 0}, m4012l = {114}, m4013m = "bringIntoView", m4014n = {"rect", "content$iv", "size$iv", "i$iv"}, m4015s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class C9790a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f64015a;

        /* JADX INFO: renamed from: b */
        public Object f64016b;

        /* JADX INFO: renamed from: c */
        public int f64017c;

        /* JADX INFO: renamed from: d */
        public int f64018d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f64019e;

        /* JADX INFO: renamed from: m */
        public int f64021m;

        public C9790a(zy2<? super C9790a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f64019e = obj;
            this.f64021m |= Integer.MIN_VALUE;
            return nd1.this.bringIntoView(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    @Override // p000.md1
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object bringIntoView(@p000.gib p000.rud r8, @p000.yfb p000.zy2<? super p000.bth> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p000.nd1.C9790a
            if (r0 == 0) goto L13
            r0 = r9
            nd1$a r0 = (p000.nd1.C9790a) r0
            int r1 = r0.f64021m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64021m = r1
            goto L18
        L13:
            nd1$a r0 = new nd1$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f64019e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f64021m
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f64018d
            int r2 = r0.f64017c
            java.lang.Object r4 = r0.f64016b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f64015a
            rud r5 = (p000.rud) r5
            p000.y7e.throwOnFailure(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            p000.y7e.throwOnFailure(r9)
            f7b<pd1> r9 = r7.f64014a
            int r2 = r9.getSize()
            if (r2 <= 0) goto L6a
            java.lang.Object[] r9 = r9.getContent()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            pd1 r5 = (p000.pd1) r5
            r0.f64015a = r9
            r0.f64016b = r4
            r0.f64017c = r2
            r0.f64018d = r8
            r0.f64021m = r3
            java.lang.Object r5 = p000.sre.scrollIntoView(r5, r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            bth r8 = p000.bth.f14751a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nd1.bringIntoView(rud, zy2):java.lang.Object");
    }

    @yfb
    public final f7b<pd1> getModifiers() {
        return this.f64014a;
    }
}
