package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n329#2:123\n329#2:142\n101#3,2:124\n33#3,6:126\n103#3:132\n101#3,2:133\n33#3,6:135\n103#3:141\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:123\n100#1:142\n71#1:124,2\n71#1:126,6\n71#1:132\n87#1:133,2\n87#1:135,6\n87#1:141\n*E\n"})
public final class op6 {

    /* JADX INFO: renamed from: op6$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", m4010f = "ForEachGesture.kt", m4011i = {}, m4012l = {77}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C10488a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f68247a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f68248b;

        public C10488a(zy2<? super C10488a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C10488a c10488a = new C10488a(zy2Var);
            c10488a.f68248b = obj;
            return c10488a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C10488a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f68247a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                gn0 gn0Var = (gn0) this.f68248b;
                this.f68247a = 1;
                if (op6.awaitAllPointersUp(gn0Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: op6$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ForEachGestureKt", m4010f = "ForEachGesture.kt", m4011i = {0}, m4012l = {86}, m4013m = "awaitAllPointersUp", m4014n = {"$this$awaitAllPointersUp"}, m4015s = {"L$0"})
    public static final class C10489b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f68249a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f68250b;

        /* JADX INFO: renamed from: c */
        public int f68251c;

        public C10489b(zy2<? super C10489b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f68250b = obj;
            this.f68251c |= Integer.MIN_VALUE;
            return op6.awaitAllPointersUp((gn0) null, this);
        }
    }

    /* JADX INFO: renamed from: op6$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m4010f = "ForEachGesture.kt", m4011i = {0, 1, 2}, m4012l = {104, 107, 112}, m4013m = "invokeSuspend", m4014n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, m4015s = {"L$0", "L$0", "L$0"})
    public static final class C10490c extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f68252a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f68253b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e13 f68254c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<gn0, zy2<? super bth>, Object> f68255d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10490c(e13 e13Var, gz6<? super gn0, ? super zy2<? super bth>, ? extends Object> gz6Var, zy2<? super C10490c> zy2Var) {
            super(2, zy2Var);
            this.f68254c = e13Var;
            this.f68255d = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C10490c c10490c = new C10490c(this.f68254c, this.f68255d, zy2Var);
            c10490c.f68253b = obj;
            return c10490c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C10490c) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [gn0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [gn0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r7.f68252a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.f68253b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r8)
                goto L28
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f68253b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r8 = r1
                goto L3b
            L2a:
                r8 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r7.f68253b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                p000.y7e.throwOnFailure(r8)
                java.lang.Object r8 = r7.f68253b
                gn0 r8 = (p000.gn0) r8
            L3b:
                e13 r1 = r7.f68254c
                boolean r1 = p000.oj8.isActive(r1)
                if (r1 == 0) goto L74
                gz6<gn0, zy2<? super bth>, java.lang.Object> r1 = r7.f68255d     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f68253b = r8     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f68252a = r4     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r8
            L51:
                r7.f68253b = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r7.f68252a = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r8 = p000.op6.awaitAllPointersUp(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r8 != r0) goto L28
                return r0
            L5c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L60:
                e13 r5 = r7.f68254c
                boolean r5 = p000.oj8.isActive(r5)
                if (r5 == 0) goto L73
                r7.f68253b = r1
                r7.f68252a = r2
                java.lang.Object r8 = p000.op6.awaitAllPointersUp(r1, r7)
                if (r8 != r0) goto L28
                return r0
            L73:
                throw r8
            L74:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.op6.C10490c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: op6$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.ForEachGestureKt", m4010f = "ForEachGesture.kt", m4011i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m4012l = {48, 51, 56}, m4013m = "forEachGesture", m4014n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class C10491d extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f68256a;

        /* JADX INFO: renamed from: b */
        public Object f68257b;

        /* JADX INFO: renamed from: c */
        public Object f68258c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f68259d;

        /* JADX INFO: renamed from: e */
        public int f68260e;

        public C10491d(zy2<? super C10491d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f68259d = obj;
            this.f68260e |= Integer.MIN_VALUE;
            return op6.forEachGesture(null, null, this);
        }
    }

    public static final boolean allPointersUp(@yfb gn0 gn0Var) {
        List<h2d> changes = gn0Var.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (changes.get(i).getPressed()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    @gib
    public static final Object awaitAllPointersUp(@yfb s2d s2dVar, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitPointerEventScope = s2dVar.awaitPointerEventScope(new C10488a(null), zy2Var);
        return objAwaitPointerEventScope == pd8.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : bth.f14751a;
    }

    @gib
    public static final Object awaitEachGesture(@yfb s2d s2dVar, @yfb gz6<? super gn0, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitPointerEventScope = s2dVar.awaitPointerEventScope(new C10490c(zy2Var.getContext(), gz6Var, null), zy2Var);
        return objAwaitPointerEventScope == pd8.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : bth.f14751a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [e13, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, s2d] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, s2d] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [s2d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [e13, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    @p000.gib
    @p000.q64(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @p000.i2e(expression = "awaitEachGesture(block)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object forEachGesture(@p000.yfb p000.s2d r8, @p000.yfb p000.gz6<? super p000.s2d, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r9, @p000.yfb p000.zy2<? super p000.bth> r10) {
        /*
            boolean r0 = r10 instanceof p000.op6.C10491d
            if (r0 == 0) goto L13
            r0 = r10
            op6$d r0 = (p000.op6.C10491d) r0
            int r1 = r0.f68260e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68260e = r1
            goto L18
        L13:
            op6$d r0 = new op6$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f68259d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f68260e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.f68258c
            e13 r8 = (p000.e13) r8
            java.lang.Object r9 = r0.f68257b
            gz6 r9 = (p000.gz6) r9
            java.lang.Object r2 = r0.f68256a
            s2d r2 = (p000.s2d) r2
            p000.y7e.throwOnFailure(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.f68258c
            e13 r8 = (p000.e13) r8
            java.lang.Object r9 = r0.f68257b
            gz6 r9 = (p000.gz6) r9
            java.lang.Object r2 = r0.f68256a
            s2d r2 = (p000.s2d) r2
            p000.y7e.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L55
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            r10 = move-exception
            goto L99
        L57:
            java.lang.Object r8 = r0.f68258c
            e13 r8 = (p000.e13) r8
            java.lang.Object r9 = r0.f68257b
            gz6 r9 = (p000.gz6) r9
            java.lang.Object r2 = r0.f68256a
            s2d r2 = (p000.s2d) r2
            p000.y7e.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L55
            goto L85
        L67:
            p000.y7e.throwOnFailure(r10)
            e13 r10 = r0.getContext()
        L6e:
            boolean r2 = p000.oj8.isActive(r10)
            if (r2 == 0) goto Laf
            r0.f68256a = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f68257b = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f68258c = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f68260e = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            return r1
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.f68256a = r2     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f68257b = r9     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f68258c = r8     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f68260e = r4     // Catch: java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L55
            if (r10 != r1) goto L52
            return r1
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = p000.oj8.isActive(r8)
            if (r6 == 0) goto Lae
            r0.f68256a = r2
            r0.f68257b = r9
            r0.f68258c = r8
            r0.f68260e = r3
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)
            if (r10 != r1) goto L52
            return r1
        Lae:
            throw r10
        Laf:
            bth r8 = p000.bth.f14751a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.op6.forEachGesture(s2d, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (allPointersUp(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitAllPointersUp(@p000.yfb p000.gn0 r6, @p000.yfb p000.zy2<? super p000.bth> r7) {
        /*
            boolean r0 = r7 instanceof p000.op6.C10489b
            if (r0 == 0) goto L13
            r0 = r7
            op6$b r0 = (p000.op6.C10489b) r0
            int r1 = r0.f68251c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68251c = r1
            goto L18
        L13:
            op6$b r0 = new op6$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f68250b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f68251c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f68249a
            gn0 r6 = (p000.gn0) r6
            p000.y7e.throwOnFailure(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p000.y7e.throwOnFailure(r7)
            boolean r7 = allPointersUp(r6)
            if (r7 != 0) goto L68
        L3e:
            v1d r7 = p000.v1d.Final
            r0.f68249a = r6
            r0.f68251c = r3
            java.lang.Object r7 = r6.awaitPointerEvent(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            t1d r7 = (p000.t1d) r7
            java.util.List r7 = r7.getChanges()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            h2d r5 = (p000.h2d) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.op6.awaitAllPointersUp(gn0, zy2):java.lang.Object");
    }
}
