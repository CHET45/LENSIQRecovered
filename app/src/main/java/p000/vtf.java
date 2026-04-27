package p000;

import androidx.mediarouter.media.C1340j;
import java.util.Set;
import p000.nrd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,183:1\n1223#2,6:184\n296#3,2:190\n267#3,4:192\n237#3,7:196\n248#3,3:204\n251#3,2:208\n272#3:210\n298#3,2:211\n273#3:213\n254#3,6:214\n274#3:220\n300#3:221\n1810#4:203\n1672#4:207\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n64#1:184,6\n182#1:190,2\n182#1:192,4\n182#1:196,7\n182#1:204,3\n182#1:208,2\n182#1:210\n182#1:211,2\n182#1:213\n182#1:214,6\n182#1:220\n182#1:221\n182#1:203\n182#1:207\n*E\n"})
public final /* synthetic */ class vtf {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: vtf$a */
    @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", m4010f = "SnapshotFlow.kt", m4011i = {}, m4012l = {66, 67}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14258a<R> extends ugg implements gz6<sdd<R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f92240a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f92241b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e13 f92242c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ y56<T> f92243d;

        /* JADX INFO: renamed from: vtf$a$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sdd<R> f92244a;

            public a(sdd<R> sddVar) {
                this.f92244a = sddVar;
            }

            @Override // p000.t66
            @gib
            public final Object emit(T t, @yfb zy2<? super bth> zy2Var) {
                this.f92244a.setValue(t);
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: vtf$a$b */
        @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", m4010f = "SnapshotFlow.kt", m4011i = {}, m4012l = {68}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f92245a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ y56<T> f92246b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ sdd<R> f92247c;

            /* JADX INFO: renamed from: vtf$a$b$a */
            public static final class a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ sdd<R> f92248a;

                public a(sdd<R> sddVar) {
                    this.f92248a = sddVar;
                }

                @Override // p000.t66
                @gib
                public final Object emit(T t, @yfb zy2<? super bth> zy2Var) {
                    this.f92248a.setValue(t);
                    return bth.f14751a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(y56<? extends T> y56Var, sdd<R> sddVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f92246b = y56Var;
                this.f92247c = sddVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f92246b, this.f92247c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to vtf$a$b for r4v1 'this'  zy2
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p000.tq0
            @p000.gib
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f92245a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p000.y7e.throwOnFailure(r5)
                    goto L2c
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    p000.y7e.throwOnFailure(r5)
                    y56<T> r5 = r4.f92246b
                    vtf$a$b$a r1 = new vtf$a$b$a
                    sdd<R> r3 = r4.f92247c
                    r1.<init>(r3)
                    r4.f92245a = r2
                    java.lang.Object r5 = r5.collect(r1, r4)
                    if (r5 != r0) goto L2c
                    return r0
                L2c:
                    bth r5 = p000.bth.f14751a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.vtf.C14258a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14258a(e13 e13Var, y56<? extends T> y56Var, zy2<? super C14258a> zy2Var) {
            super(2, zy2Var);
            this.f92242c = e13Var;
            this.f92243d = y56Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14258a c14258a = new C14258a(this.f92242c, this.f92243d, zy2Var);
            c14258a.f92241b = obj;
            return c14258a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb sdd<R> sddVar, @gib zy2<? super bth> zy2Var) {
            return ((C14258a) create(sddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to vtf$a<R> for r6v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        @p000.gib
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f92240a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                p000.y7e.throwOnFailure(r7)
                goto L4f
            L1b:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f92241b
                sdd r7 = (p000.sdd) r7
                e13 r1 = r6.f92242c
                a05 r4 = p000.a05.f2a
                boolean r1 = p000.md8.areEqual(r1, r4)
                if (r1 == 0) goto L3c
                y56<T> r1 = r6.f92243d
                vtf$a$a r2 = new vtf$a$a
                r2.<init>(r7)
                r6.f92240a = r3
                java.lang.Object r7 = r1.collect(r2, r6)
                if (r7 != r0) goto L4f
                return r0
            L3c:
                e13 r1 = r6.f92242c
                vtf$a$b r3 = new vtf$a$b
                y56<T> r4 = r6.f92243d
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.f92240a = r2
                java.lang.Object r7 = p000.dg1.withContext(r1, r3, r6)
                if (r7 != r0) goto L4f
                return r0
            L4f:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vtf.C14258a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vtf$b */
    @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m4010f = "SnapshotFlow.kt", m4011i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m4012l = {146, 150, 172}, m4013m = "invokeSuspend", m4014n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @dwf({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,183:1\n138#2,5:184\n138#2,5:189\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n141#1:184,5\n164#1:189,5\n*E\n"})
    public static final class C14259b<T> extends ugg implements gz6<t66<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public /* synthetic */ Object f92249C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ ny6<T> f92250F;

        /* JADX INFO: renamed from: a */
        public Object f92251a;

        /* JADX INFO: renamed from: b */
        public Object f92252b;

        /* JADX INFO: renamed from: c */
        public Object f92253c;

        /* JADX INFO: renamed from: d */
        public Object f92254d;

        /* JADX INFO: renamed from: e */
        public Object f92255e;

        /* JADX INFO: renamed from: f */
        public int f92256f;

        /* JADX INFO: renamed from: m */
        public int f92257m;

        /* JADX INFO: renamed from: vtf$b$a */
        @dwf({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n*L\n1#1,183:1\n52#2:184\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n*L\n118#1:184\n*E\n"})
        public static final class a extends tt8 implements qy6<Object, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ u6b<Object> f92258a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u6b<Object> u6bVar) {
                super(1);
                this.f92258a = u6bVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Object obj) {
                invoke2(obj);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb Object obj) {
                if (obj instanceof y2g) {
                    nrd.C10025a c10025a = nrd.f65391b;
                    ((y2g) obj).m33360recordReadInh_f27i8$runtime_release(nrd.m31201constructorimpl(4));
                }
                this.f92258a.add(obj);
            }
        }

        /* JADX INFO: renamed from: vtf$b$b */
        @dwf({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n+ 2 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n58#2,2:184\n61#2:219\n62#2:223\n296#3,2:186\n267#3,4:188\n237#3,7:192\n248#3,3:200\n251#3,2:204\n272#3:206\n298#3:207\n299#3:209\n273#3:210\n254#3,6:211\n274#3:217\n300#3:218\n1810#4:199\n1672#4:203\n52#5:208\n1747#6,3:220\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n*L\n129#1:184,2\n129#1:219\n129#1:223\n129#1:186,2\n129#1:188,4\n129#1:192,7\n129#1:200,3\n129#1:204,2\n129#1:206\n129#1:207\n129#1:209\n129#1:210\n129#1:211,6\n129#1:217\n129#1:218\n129#1:199\n129#1:203\n130#1:208\n129#1:220,3\n*E\n"})
        public static final class b extends tt8 implements gz6<Set<? extends Object>, ssf, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ au1<Set<Object>> f92259a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(au1<Set<Object>> au1Var) {
                super(2);
                this.f92259a = au1Var;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(Set<? extends Object> set, ssf ssfVar) {
                invoke2(set, ssfVar);
                return bth.f14751a;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(@p000.yfb java.util.Set<? extends java.lang.Object> r17, @p000.yfb p000.ssf r18) {
                /*
                    r16 = this;
                    r0 = r17
                    boolean r1 = r0 instanceof p000.foe
                    r2 = 4
                    if (r1 == 0) goto L66
                    r1 = r0
                    foe r1 = (p000.foe) r1
                    doe r1 = r1.getSet$runtime_release()
                    java.lang.Object[] r3 = r1.f30278b
                    long[] r1 = r1.f30277a
                    int r4 = r1.length
                    int r4 = r4 + (-2)
                    if (r4 < 0) goto L63
                    r5 = 0
                    r6 = r5
                L19:
                    r7 = r1[r6]
                    long r9 = ~r7
                    r11 = 7
                    long r9 = r9 << r11
                    long r9 = r9 & r7
                    r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r9 = r9 & r11
                    int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r9 == 0) goto L5e
                    int r9 = r6 - r4
                    int r9 = ~r9
                    int r9 = r9 >>> 31
                    r10 = 8
                    int r9 = 8 - r9
                    r11 = r5
                L33:
                    if (r11 >= r9) goto L5c
                    r12 = 255(0xff, double:1.26E-321)
                    long r12 = r12 & r7
                    r14 = 128(0x80, double:6.3E-322)
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 >= 0) goto L58
                    int r12 = r6 << 3
                    int r12 = r12 + r11
                    r12 = r3[r12]
                    boolean r13 = r12 instanceof p000.y2g
                    if (r13 == 0) goto L55
                    y2g r12 = (p000.y2g) r12
                    nrd$a r13 = p000.nrd.f65391b
                    int r13 = p000.nrd.m31201constructorimpl(r2)
                    boolean r12 = r12.m33359isReadInh_f27i8$runtime_release(r13)
                    if (r12 == 0) goto L58
                L55:
                    r1 = r16
                    goto L98
                L58:
                    long r7 = r7 >> r10
                    int r11 = r11 + 1
                    goto L33
                L5c:
                    if (r9 != r10) goto L63
                L5e:
                    if (r6 == r4) goto L63
                    int r6 = r6 + 1
                    goto L19
                L63:
                    r1 = r16
                    goto L9d
                L66:
                    r1 = r0
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    boolean r3 = r1 instanceof java.util.Collection
                    if (r3 == 0) goto L77
                    r3 = r1
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto L77
                    goto L63
                L77:
                    java.util.Iterator r1 = r1.iterator()
                L7b:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L63
                    java.lang.Object r3 = r1.next()
                    boolean r4 = r3 instanceof p000.y2g
                    if (r4 == 0) goto L55
                    y2g r3 = (p000.y2g) r3
                    nrd$a r4 = p000.nrd.f65391b
                    int r4 = p000.nrd.m31201constructorimpl(r2)
                    boolean r3 = r3.m33359isReadInh_f27i8$runtime_release(r4)
                    if (r3 == 0) goto L7b
                    goto L55
                L98:
                    au1<java.util.Set<java.lang.Object>> r2 = r1.f92259a
                    r2.mo28705trySendJP2dKIU(r0)
                L9d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.vtf.C14259b.b.invoke2(java.util.Set, ssf):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14259b(ny6<? extends T> ny6Var, zy2<? super C14259b> zy2Var) {
            super(2, zy2Var);
            this.f92250F = ny6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14259b c14259b = new C14259b(this.f92250F, zy2Var);
            c14259b.f92249C = obj;
            return c14259b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb t66<? super T> t66Var, @gib zy2<? super bth> zy2Var) {
            return ((C14259b) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:34:0x00e1, B:38:0x00ea], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:42:0x00f9, B:58:0x0138], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:58:0x0138, B:42:0x00f9], limit reached: 76 */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, t66] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, t66] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vtf.C14259b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @yfb
    @hk2
    public static final <T> i2g<T> collectAsState(@yfb l2g<? extends T> l2gVar, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:47)");
        }
        i2g<T> i2gVarCollectAsState = stf.collectAsState(l2gVar, l2gVar.getValue(), e13Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarCollectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(u6b<Object> u6bVar, Set<? extends Object> set) {
        Object[] objArr = u6bVar.f30278b;
        long[] jArr = u6bVar.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                        return true;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    @yfb
    public static final <T> y56<T> snapshotFlow(@yfb ny6<? extends T> ny6Var) {
        return c76.flow(new C14259b(ny6Var, null));
    }

    @yfb
    @hk2
    public static final <T extends R, R> i2g<R> collectAsState(@yfb y56<? extends T> y56Var, R r, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:63)");
        }
        boolean zChangedInstance = zl2Var.changedInstance(e13Var2) | zl2Var.changedInstance(y56Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C14258a(e13Var2, y56Var, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        i2g<R> i2gVarProduceState = stf.produceState(r, y56Var, e13Var2, (gz6) objRememberedValue, zl2Var, ((i >> 3) & 14) | ((i << 3) & 112) | (i & C1340j.f10444b));
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarProduceState;
    }
}
