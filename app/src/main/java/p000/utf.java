package p000;

import java.util.Arrays;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n1223#2,6:224\n1223#2,6:230\n1223#2,6:236\n1223#2,6:242\n1223#2,6:248\n1223#2,6:254\n1223#2,6:260\n1223#2,6:266\n1223#2,6:272\n1223#2,6:278\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n81#1:224,6\n82#1:230,6\n114#1:236,6\n115#1:242,6\n148#1:248,6\n149#1:254,6\n183#1:260,6\n184#1:266,6\n216#1:272,6\n218#1:278,6\n*E\n"})
public final /* synthetic */ class utf {

    /* JADX INFO: renamed from: utf$a */
    @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", m4010f = "ProduceState.kt", m4011i = {}, m4012l = {83}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13699a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f89092a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f89093b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<sdd<T>, zy2<? super bth>, Object> f89094c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ z6b<T> f89095d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13699a(gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, z6b<T> z6bVar, zy2<? super C13699a> zy2Var) {
            super(2, zy2Var);
            this.f89094c = gz6Var;
            this.f89095d = z6bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C13699a c13699a = new C13699a(this.f89094c, this.f89095d, zy2Var);
            c13699a.f89093b = obj;
            return c13699a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13699a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to utf$a for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        @p000.gib
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f89092a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f89093b
                x13 r6 = (p000.x13) r6
                gz6<sdd<T>, zy2<? super bth>, java.lang.Object> r1 = r5.f89094c
                tdd r3 = new tdd
                z6b<T> r4 = r5.f89095d
                e13 r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f89092a = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.utf.C13699a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: utf$b */
    @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2$1", m4010f = "ProduceState.kt", m4011i = {}, m4012l = {116}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13700b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f89096a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f89097b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<sdd<T>, zy2<? super bth>, Object> f89098c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ z6b<T> f89099d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13700b(gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, z6b<T> z6bVar, zy2<? super C13700b> zy2Var) {
            super(2, zy2Var);
            this.f89098c = gz6Var;
            this.f89099d = z6bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C13700b c13700b = new C13700b(this.f89098c, this.f89099d, zy2Var);
            c13700b.f89097b = obj;
            return c13700b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13700b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to utf$b for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        @p000.gib
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f89096a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f89097b
                x13 r6 = (p000.x13) r6
                gz6<sdd<T>, zy2<? super bth>, java.lang.Object> r1 = r5.f89098c
                tdd r3 = new tdd
                z6b<T> r4 = r5.f89099d
                e13 r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f89096a = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.utf.C13700b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: utf$c */
    @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", m4010f = "ProduceState.kt", m4011i = {}, m4012l = {150}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13701c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f89100a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f89101b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<sdd<T>, zy2<? super bth>, Object> f89102c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ z6b<T> f89103d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13701c(gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, z6b<T> z6bVar, zy2<? super C13701c> zy2Var) {
            super(2, zy2Var);
            this.f89102c = gz6Var;
            this.f89103d = z6bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C13701c c13701c = new C13701c(this.f89102c, this.f89103d, zy2Var);
            c13701c.f89101b = obj;
            return c13701c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13701c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to utf$c for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        @p000.gib
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f89100a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f89101b
                x13 r6 = (p000.x13) r6
                gz6<sdd<T>, zy2<? super bth>, java.lang.Object> r1 = r5.f89102c
                tdd r3 = new tdd
                z6b<T> r4 = r5.f89103d
                e13 r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f89100a = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.utf.C13701c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: utf$d */
    @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4$1", m4010f = "ProduceState.kt", m4011i = {}, m4012l = {185}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13702d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f89104a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f89105b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<sdd<T>, zy2<? super bth>, Object> f89106c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ z6b<T> f89107d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13702d(gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, z6b<T> z6bVar, zy2<? super C13702d> zy2Var) {
            super(2, zy2Var);
            this.f89106c = gz6Var;
            this.f89107d = z6bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C13702d c13702d = new C13702d(this.f89106c, this.f89107d, zy2Var);
            c13702d.f89105b = obj;
            return c13702d;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13702d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to utf$d for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        @p000.gib
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f89104a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f89105b
                x13 r6 = (p000.x13) r6
                gz6<sdd<T>, zy2<? super bth>, java.lang.Object> r1 = r5.f89106c
                tdd r3 = new tdd
                z6b<T> r4 = r5.f89107d
                e13 r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f89104a = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.utf.C13702d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: utf$e */
    @ck3(m4009c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", m4010f = "ProduceState.kt", m4011i = {}, m4012l = {219}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13703e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f89108a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f89109b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<sdd<T>, zy2<? super bth>, Object> f89110c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ z6b<T> f89111d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13703e(gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, z6b<T> z6bVar, zy2<? super C13703e> zy2Var) {
            super(2, zy2Var);
            this.f89110c = gz6Var;
            this.f89111d = z6bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C13703e c13703e = new C13703e(this.f89110c, this.f89111d, zy2Var);
            c13703e.f89109b = obj;
            return c13703e;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13703e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to utf$e for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        @p000.gib
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f89108a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f89109b
                x13 r6 = (p000.x13) r6
                gz6<sdd<T>, zy2<? super bth>, java.lang.Object> r1 = r5.f89110c
                tdd r3 = new tdd
                z6b<T> r4 = r5.f89111d
                e13 r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f89108a = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.utf.C13703e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(10454275, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = xtf.mutableStateOf$default(t, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z6b z6bVar = (z6b) objRememberedValue;
        bth bthVar = bth.f14751a;
        boolean zChangedInstance = zl2Var.changedInstance(gz6Var);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C13699a(gz6Var, z6bVar, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.LaunchedEffect(bthVar, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue2, zl2Var, 6);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @gib Object obj, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1928268701, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = xtf.mutableStateOf$default(t, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z6b z6bVar = (z6b) objRememberedValue;
        boolean zChangedInstance = zl2Var.changedInstance(gz6Var);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C13700b(gz6Var, z6bVar, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.LaunchedEffect(obj, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue2, zl2Var, (i >> 3) & 14);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @gib Object obj, @gib Object obj2, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1703169085, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = xtf.mutableStateOf$default(t, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z6b z6bVar = (z6b) objRememberedValue;
        boolean zChangedInstance = zl2Var.changedInstance(gz6Var);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C13701c(gz6Var, z6bVar, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.LaunchedEffect(obj, obj2, (gz6) objRememberedValue2, zl2Var, (i >> 3) & 126);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @gib Object obj, @gib Object obj2, @gib Object obj3, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1807205155, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:181)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = xtf.mutableStateOf$default(t, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z6b z6bVar = (z6b) objRememberedValue;
        boolean zChangedInstance = zl2Var.changedInstance(gz6Var);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C13702d(gz6Var, z6bVar, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.LaunchedEffect(obj, obj2, obj3, (gz6) objRememberedValue2, zl2Var, (i >> 3) & 1022);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @yfb Object[] objArr, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(490154582, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = xtf.mutableStateOf$default(t, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z6b z6bVar = (z6b) objRememberedValue;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zChangedInstance = zl2Var.changedInstance(gz6Var);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C13703e(gz6Var, z6bVar, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.LaunchedEffect(objArrCopyOf, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue2, zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }
}
