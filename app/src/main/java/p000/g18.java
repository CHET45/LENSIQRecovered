package p000;

import java.util.List;
import p000.jvd;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1208#2:365\n1187#2,2:366\n81#3:368\n107#3,2:369\n81#3:371\n107#3,2:372\n1223#4,6:374\n1223#4,6:380\n460#5,11:386\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374,6\n177#1:380,6\n217#1:386,11\n*E\n"})
@e0g(parameters = 0)
public final class g18 {

    /* JADX INFO: renamed from: f */
    public static final int f38219f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f38220a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f7b<C6081a<?, ?>> f38221b = new f7b<>(new C6081a[16], 0);

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f38222c = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d */
    public long f38223d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f38224e = xtf.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: g18$a */
    @dwf({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    public final class C6081a<T, V extends AbstractC16313zy> implements i2g<T> {

        /* JADX INFO: renamed from: C */
        public boolean f38225C;

        /* JADX INFO: renamed from: F */
        public boolean f38226F;

        /* JADX INFO: renamed from: H */
        public long f38227H;

        /* JADX INFO: renamed from: a */
        public T f38229a;

        /* JADX INFO: renamed from: b */
        public T f38230b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final alh<T, V> f38231c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final String f38232d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final z6b f38233e;

        /* JADX INFO: renamed from: f */
        @yfb
        public InterfaceC11178py<T> f38234f;

        /* JADX INFO: renamed from: m */
        @yfb
        public qmg<T, V> f38235m;

        public C6081a(T t, T t2, @yfb alh<T, V> alhVar, @yfb InterfaceC11178py<T> interfaceC11178py, @yfb String str) {
            this.f38229a = t;
            this.f38230b = t2;
            this.f38231c = alhVar;
            this.f38232d = str;
            this.f38233e = xtf.mutableStateOf$default(t, null, 2, null);
            this.f38234f = interfaceC11178py;
            this.f38235m = new qmg<>(this.f38234f, alhVar, this.f38229a, this.f38230b, (AbstractC16313zy) null, 16, (jt3) null);
        }

        @yfb
        public final qmg<T, V> getAnimation() {
            return this.f38235m;
        }

        @yfb
        public final InterfaceC11178py<T> getAnimationSpec() {
            return this.f38234f;
        }

        public final T getInitialValue$animation_core_release() {
            return this.f38229a;
        }

        @yfb
        public final String getLabel() {
            return this.f38232d;
        }

        public final T getTargetValue$animation_core_release() {
            return this.f38230b;
        }

        @yfb
        public final alh<T, V> getTypeConverter() {
            return this.f38231c;
        }

        @Override // p000.i2g
        public T getValue() {
            return this.f38233e.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return this.f38225C;
        }

        public final void onPlayTimeChanged$animation_core_release(long j) {
            g18.this.setRefreshChildNeeded(false);
            if (this.f38226F) {
                this.f38226F = false;
                this.f38227H = j;
            }
            long j2 = j - this.f38227H;
            setValue$animation_core_release(this.f38235m.getValueFromNanos(j2));
            this.f38225C = this.f38235m.isFinishedFromNanos(j2);
        }

        public final void reset$animation_core_release() {
            this.f38226F = true;
        }

        public final void setAnimation$animation_core_release(@yfb qmg<T, V> qmgVar) {
            this.f38235m = qmgVar;
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.f38225C = z;
        }

        public final void setInitialValue$animation_core_release(T t) {
            this.f38229a = t;
        }

        public final void setTargetValue$animation_core_release(T t) {
            this.f38230b = t;
        }

        public void setValue$animation_core_release(T t) {
            this.f38233e.setValue(t);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.f38235m.getTargetValue());
            this.f38226F = true;
        }

        public final void updateValues$animation_core_release(T t, T t2, @yfb InterfaceC11178py<T> interfaceC11178py) {
            this.f38229a = t;
            this.f38230b = t2;
            this.f38234f = interfaceC11178py;
            this.f38235m = new qmg<>(interfaceC11178py, this.f38231c, t, t2, (AbstractC16313zy) null, 16, (jt3) null);
            g18.this.setRefreshChildNeeded(true);
            this.f38225C = false;
            this.f38226F = true;
        }
    }

    /* JADX INFO: renamed from: g18$b */
    @ck3(m4009c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", m4010f = "InfiniteTransition.kt", m4011i = {0, 0, 1, 1}, m4012l = {181, 205}, m4013m = "invokeSuspend", m4014n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C6082b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f38236a;

        /* JADX INFO: renamed from: b */
        public int f38237b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f38238c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ z6b<i2g<Long>> f38239d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ g18 f38240e;

        /* JADX INFO: renamed from: g18$b$a */
        @dwf({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n460#2,11:365\n460#2,11:376\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1$1\n*L\n187#1:365,11\n194#1:376,11\n*E\n"})
        public static final class a extends tt8 implements qy6<Long, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z6b<i2g<Long>> f38241a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ g18 f38242b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8118e f38243c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ x13 f38244d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z6b<i2g<Long>> z6bVar, g18 g18Var, jvd.C8118e c8118e, x13 x13Var) {
                super(1);
                this.f38241a = z6bVar;
                this.f38242b = g18Var;
                this.f38243c = c8118e;
                this.f38244d = x13Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Long l) {
                invoke(l.longValue());
                return bth.f14751a;
            }

            public final void invoke(long j) {
                i2g<Long> value = this.f38241a.getValue();
                long jLongValue = value != null ? value.getValue().longValue() : j;
                int i = 0;
                if (this.f38242b.f38223d == Long.MIN_VALUE || this.f38243c.f52107a != rgg.getDurationScale(this.f38244d.getCoroutineContext())) {
                    this.f38242b.f38223d = j;
                    f7b f7bVar = this.f38242b.f38221b;
                    int size = f7bVar.getSize();
                    if (size > 0) {
                        Object[] content = f7bVar.getContent();
                        int i2 = 0;
                        do {
                            ((C6081a) content[i2]).reset$animation_core_release();
                            i2++;
                        } while (i2 < size);
                    }
                    this.f38243c.f52107a = rgg.getDurationScale(this.f38244d.getCoroutineContext());
                }
                if (this.f38243c.f52107a != 0.0f) {
                    this.f38242b.onFrame((long) ((jLongValue - this.f38242b.f38223d) / this.f38243c.f52107a));
                    return;
                }
                f7b f7bVar2 = this.f38242b.f38221b;
                int size2 = f7bVar2.getSize();
                if (size2 > 0) {
                    Object[] content2 = f7bVar2.getContent();
                    do {
                        ((C6081a) content2[i]).skipToEnd$animation_core_release();
                        i++;
                    } while (i < size2);
                }
            }
        }

        /* JADX INFO: renamed from: g18$b$b */
        public static final class b extends tt8 implements ny6<Float> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x13 f38245a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x13 x13Var) {
                super(0);
                this.f38245a = x13Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Float invoke() {
                return Float.valueOf(rgg.getDurationScale(this.f38245a.getCoroutineContext()));
            }
        }

        /* JADX INFO: renamed from: g18$b$c */
        @ck3(m4009c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", m4010f = "InfiniteTransition.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<Float, zy2<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a */
            public int f38246a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ float f38247b;

            public c(zy2<? super c> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                c cVar = new c(zy2Var);
                cVar.f38247b = ((Number) obj).floatValue();
                return cVar;
            }

            @gib
            public final Object invoke(float f, @gib zy2<? super Boolean> zy2Var) {
                return ((c) create(Float.valueOf(f), zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f38246a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                return wc1.boxBoolean(this.f38247b > 0.0f);
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(Float f, zy2<? super Boolean> zy2Var) {
                return invoke(f.floatValue(), zy2Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6082b(z6b<i2g<Long>> z6bVar, g18 g18Var, zy2<? super C6082b> zy2Var) {
            super(2, zy2Var);
            this.f38239d = z6bVar;
            this.f38240e = g18Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6082b c6082b = new C6082b(this.f38239d, this.f38240e, zy2Var);
            c6082b.f38238c = obj;
            return c6082b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C6082b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
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
                int r1 = r7.f38237b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f38236a
                jvd$e r1 = (p000.jvd.C8118e) r1
                java.lang.Object r4 = r7.f38238c
                x13 r4 = (p000.x13) r4
                p000.y7e.throwOnFailure(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f38236a
                jvd$e r1 = (p000.jvd.C8118e) r1
                java.lang.Object r4 = r7.f38238c
                x13 r4 = (p000.x13) r4
                p000.y7e.throwOnFailure(r8)
                r8 = r4
                goto L56
            L30:
                p000.y7e.throwOnFailure(r8)
                java.lang.Object r8 = r7.f38238c
                x13 r8 = (p000.x13) r8
                jvd$e r1 = new jvd$e
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f52107a = r4
            L40:
                g18$b$a r4 = new g18$b$a
                z6b<i2g<java.lang.Long>> r5 = r7.f38239d
                g18 r6 = r7.f38240e
                r4.<init>(r5, r6, r1, r8)
                r7.f38238c = r8
                r7.f38236a = r1
                r7.f38237b = r3
                java.lang.Object r4 = p000.d18.withInfiniteAnimationFrameNanos(r4, r7)
                if (r4 != r0) goto L56
                return r0
            L56:
                float r4 = r1.f52107a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                g18$b$b r4 = new g18$b$b
                r4.<init>(r8)
                y56 r4 = p000.stf.snapshotFlow(r4)
                g18$b$c r5 = new g18$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f38238c = r8
                r7.f38236a = r1
                r7.f38237b = r2
                java.lang.Object r4 = p000.c76.first(r4, r5, r7)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.g18.C6082b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: g18$c */
    public static final class C6083c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f38249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6083c(int i) {
            super(2);
            this.f38249b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            g18.this.run$animation_core_release(zl2Var, tsd.updateChangedFlags(this.f38249b | 1));
        }
    }

    public g18(@yfb String str) {
        this.f38220a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.f38222c.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isRunning() {
        return ((Boolean) this.f38224e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j) {
        boolean z;
        f7b<C6081a<?, ?>> f7bVar = this.f38221b;
        int size = f7bVar.getSize();
        if (size > 0) {
            C6081a<?, ?>[] content = f7bVar.getContent();
            z = true;
            int i = 0;
            do {
                C6081a<?, ?> c6081a = content[i];
                if (!c6081a.isFinished$animation_core_release()) {
                    c6081a.onPlayTimeChanged$animation_core_release(j);
                }
                if (!c6081a.isFinished$animation_core_release()) {
                    z = false;
                }
                i++;
            } while (i < size);
        } else {
            z = true;
        }
        setRunning(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z) {
        this.f38222c.setValue(Boolean.valueOf(z));
    }

    private final void setRunning(boolean z) {
        this.f38224e.setValue(Boolean.valueOf(z));
    }

    public final void addAnimation$animation_core_release(@yfb C6081a<?, ?> c6081a) {
        this.f38221b.add(c6081a);
        setRefreshChildNeeded(true);
    }

    @yfb
    public final List<C6081a<?, ?>> getAnimations() {
        return this.f38221b.asMutableList();
    }

    @yfb
    public final String getLabel() {
        return this.f38220a;
    }

    public final void removeAnimation$animation_core_release(@yfb C6081a<?, ?> c6081a) {
        this.f38221b.remove(c6081a);
    }

    @hk2
    public final void run$animation_core_release(@gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-318043801);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-318043801, i2, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = xtf.mutableStateOf$default(null, null, 2, null);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            z6b z6bVar = (z6b) objRememberedValue;
            if (isRunning() || getRefreshChildNeeded()) {
                zl2VarStartRestartGroup.startReplaceGroup(1719915818);
                boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                    objRememberedValue2 = new C6082b(z6bVar, this, null);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                jx4.LaunchedEffect(this, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue2, zl2VarStartRestartGroup, i2 & 14);
                zl2VarStartRestartGroup.endReplaceGroup();
            } else {
                zl2VarStartRestartGroup.startReplaceGroup(1721436120);
                zl2VarStartRestartGroup.endReplaceGroup();
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C6083c(i));
        }
    }
}
