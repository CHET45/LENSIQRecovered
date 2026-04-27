package p000;

import androidx.compose.foundation.layout.C0629e;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.graphics.C0735b;
import androidx.compose.p002ui.graphics.InterfaceC0736c;
import p000.xl2;
import p000.yeh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n1223#2,3:147\n1226#2,3:151\n1223#2,6:154\n1223#2,6:160\n1#3:150\n350#4,7:166\n33#5,6:173\n33#5,6:214\n68#6,6:179\n74#6:213\n78#6:224\n78#7,11:185\n91#7:223\n456#8,8:196\n464#8,3:210\n467#8,3:220\n3737#9,6:204\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n105#1:147,3\n105#1:151,3\n106#1:154,6\n111#1:160,6\n117#1:166,7\n126#1:173,6\n139#1:214,6\n138#1:179,6\n138#1:213\n138#1:224\n138#1:185,11\n138#1:223\n138#1:196,8\n138#1:210,3\n138#1:220,3\n138#1:204,6\n*E\n"})
public final class a93 {

    /* JADX INFO: renamed from: a93$a */
    public static final class C0099a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ T f686a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f687b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fw5<Float> f688c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f689d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kz6<T, zl2, Integer, bth> f690e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f691f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f692m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0099a(T t, InterfaceC0701e interfaceC0701e, fw5<Float> fw5Var, String str, kz6<? super T, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f686a = t;
            this.f687b = interfaceC0701e;
            this.f688c = fw5Var;
            this.f689d = str;
            this.f690e = kz6Var;
            this.f691f = i;
            this.f692m = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            a93.Crossfade(this.f686a, this.f687b, this.f688c, this.f689d, this.f690e, zl2Var, tsd.updateChangedFlags(this.f691f | 1), this.f692m);
        }
    }

    /* JADX INFO: renamed from: a93$b */
    public static final class C0100b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f693a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f694b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fw5<Float> f695c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<Object, zl2, Integer, bth> f696d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f697e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f698f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0100b(Object obj, InterfaceC0701e interfaceC0701e, fw5<Float> fw5Var, kz6<Object, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f693a = obj;
            this.f694b = interfaceC0701e;
            this.f695c = fw5Var;
            this.f696d = kz6Var;
            this.f697e = i;
            this.f698f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            a93.Crossfade(this.f693a, this.f694b, this.f695c, this.f696d, zl2Var, tsd.updateChangedFlags(this.f697e | 1), this.f698f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: a93$c */
    public static final class C0101c<T> extends tt8 implements qy6<T, T> {

        /* JADX INFO: renamed from: a */
        public static final C0101c f699a = new C0101c();

        public C0101c() {
            super(1);
        }

        @Override // p000.qy6
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: a93$d */
    public static final class C0102d<T> extends tt8 implements qy6<T, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0102d(yeh<T> yehVar) {
            super(1);
            this.f700a = yehVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(T t) {
            return Boolean.valueOf(!md8.areEqual(t, this.f700a.getTargetState()));
        }
    }

    /* JADX INFO: renamed from: a93$e */
    @dwf({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n1967#2:147\n1964#2:148\n1882#2,7:149\n1223#3,6:156\n68#4,6:162\n74#4:196\n78#4:201\n78#5,11:168\n91#5:200\n456#6,8:179\n464#6,3:193\n467#6,3:197\n3737#7,6:187\n81#8:202\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n128#1:147\n128#1:148\n128#1:149,7\n131#1:156,6\n131#1:162,6\n131#1:196\n131#1:201\n131#1:168,11\n131#1:200\n131#1:179,8\n131#1:193,3\n131#1:197,3\n131#1:187,6\n128#1:202\n*E\n"})
    public static final class C0103e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f701a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fw5<Float> f702b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ T f703c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<T, zl2, Integer, bth> f704d;

        /* JADX INFO: renamed from: a93$e$a */
        public static final class a extends tt8 implements qy6<InterfaceC0736c, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<Float> f705a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i2g<Float> i2gVar) {
                super(1);
                this.f705a = i2gVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(InterfaceC0736c interfaceC0736c) {
                invoke2(interfaceC0736c);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb InterfaceC0736c interfaceC0736c) {
                interfaceC0736c.setAlpha(C0103e.invoke$lambda$1(this.f705a));
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: a93$e$b */
        public static final class b<T> extends tt8 implements kz6<yeh.InterfaceC15636b<T>, zl2, Integer, fw5<Float>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fw5<Float> f706a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fw5<Float> fw5Var) {
                super(3);
                this.f706a = fw5Var;
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ fw5<Float> invoke(Object obj, zl2 zl2Var, Integer num) {
                return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
            }

            @yfb
            @bl2(applier = "androidx.compose.ui.UiComposable")
            @hk2
            public final fw5<Float> invoke(@yfb yeh.InterfaceC15636b<T> interfaceC15636b, @gib zl2 zl2Var, int i) {
                zl2Var.startReplaceGroup(438406499);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(438406499, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)");
                }
                fw5<Float> fw5Var = this.f706a;
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
                zl2Var.endReplaceGroup();
                return fw5Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0103e(yeh<T> yehVar, fw5<Float> fw5Var, T t, kz6<? super T, ? super zl2, ? super Integer, bth> kz6Var) {
            super(2);
            this.f701a = yehVar;
            this.f702b = fw5Var;
            this.f703c = t;
            this.f704d = kz6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$1(i2g<Float> i2gVar) {
            return i2gVar.getValue().floatValue();
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
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
        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1426421288, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            yeh<T> yehVar = this.f701a;
            b bVar = new b(this.f702b);
            T t = this.f703c;
            alh<Float, C14294vy> vectorConverter = g3i.getVectorConverter(d46.f28382a);
            Object currentState = yehVar.getCurrentState();
            zl2Var.startReplaceGroup(-438678252);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f = md8.areEqual(currentState, t) ? 1.0f : 0.0f;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            Float fValueOf = Float.valueOf(f);
            Object targetState = yehVar.getTargetState();
            zl2Var.startReplaceGroup(-438678252);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f2 = md8.areEqual(targetState, t) ? 1.0f : 0.0f;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            i2g i2gVarCreateTransitionAnimation = ffh.createTransitionAnimation(yehVar, fValueOf, Float.valueOf(f2), bVar.invoke(yehVar.getSegment(), zl2Var, 0), vectorConverter, "FloatAnimation", zl2Var, 0);
            InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
            boolean zChanged = zl2Var.changed(i2gVarCreateTransitionAnimation);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new a(i2gVarCreateTransitionAnimation);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            InterfaceC0701e interfaceC0701eGraphicsLayer = C0735b.graphicsLayer(aVar, (qy6) objRememberedValue);
            kz6<T, zl2, Integer, bth> kz6Var = this.f704d;
            T t2 = this.f703c;
            zl2Var.startReplaceableGroup(733328855);
            uba ubaVarRememberBoxMeasurePolicy = pc1.rememberBoxMeasurePolicy(InterfaceC9407mm.f61437a.getTopStart(), false, zl2Var, 0);
            zl2Var.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
            qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
            xl2.C15179a c15179a = xl2.f98343p;
            ny6<xl2> constructor = c15179a.getConstructor();
            kz6<pqf<xl2>, zl2, Integer, bth> kz6VarModifierMaterializerOf = bw8.modifierMaterializerOf(interfaceC0701eGraphicsLayer);
            if (zl2Var.getApplier() == null) {
                dl2.invalidApplier();
            }
            zl2Var.startReusableNode();
            if (zl2Var.getInserting()) {
                zl2Var.createNode(constructor);
            } else {
                zl2Var.useNode();
            }
            zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
            twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVarRememberBoxMeasurePolicy, c15179a.getSetMeasurePolicy());
            twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            kz6VarModifierMaterializerOf.invoke(pqf.m31854boximpl(pqf.m31855constructorimpl(zl2Var)), zl2Var, 0);
            zl2Var.startReplaceableGroup(2058660585);
            C0629e c0629e = C0629e.f4557a;
            kz6Var.invoke(t2, zl2Var, 0);
            zl2Var.endReplaceableGroup();
            zl2Var.endNode();
            zl2Var.endReplaceableGroup();
            zl2Var.endReplaceableGroup();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: a93$f */
    public static final class C0104f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f707a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f708b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fw5<Float> f709c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<T, Object> f710d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kz6<T, zl2, Integer, bth> f711e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f712f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f713m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0104f(yeh<T> yehVar, InterfaceC0701e interfaceC0701e, fw5<Float> fw5Var, qy6<? super T, ? extends Object> qy6Var, kz6<? super T, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f707a = yehVar;
            this.f708b = interfaceC0701e;
            this.f709c = fw5Var;
            this.f710d = qy6Var;
            this.f711e = kz6Var;
            this.f712f = i;
            this.f713m = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            a93.Crossfade(this.f707a, this.f708b, this.f709c, this.f710d, this.f711e, zl2Var, tsd.updateChangedFlags(this.f712f | 1), this.f713m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void Crossfade(T r17, @p000.gib androidx.compose.p002ui.InterfaceC0701e r18, @p000.gib p000.fw5<java.lang.Float> r19, @p000.gib java.lang.String r20, @p000.yfb p000.kz6<? super T, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r21, @p000.gib p000.zl2 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a93.Crossfade(java.lang.Object, androidx.compose.ui.e, fw5, java.lang.String, kz6, zl2, int, int):void");
    }

    @hk2
    @q64(level = u64.f86867c, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(Object obj, InterfaceC0701e interfaceC0701e, fw5 fw5Var, kz6 kz6Var, zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(523603005);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? zl2VarStartRestartGroup.changed(obj) : zl2VarStartRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(interfaceC0701e) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(fw5Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= kw1.f55470l;
        } else if ((i & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(kz6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (i5 != 0) {
                fw5Var = C11760qy.tween$default(0, 0, null, 7, null);
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(523603005, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:71)");
            }
            Crossfade(ffh.updateTransition(obj, (String) null, zl2VarStartRestartGroup, i3 & 14, 2), interfaceC0701e, (fw5<Float>) fw5Var, (qy6) null, kz6Var, zl2VarStartRestartGroup, (i3 & 1008) | ((i3 << 3) & 57344), 4);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        fw5 fw5Var2 = fw5Var;
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C0100b(obj, interfaceC0701e2, fw5Var2, kz6Var, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a  */
    @p000.ig5
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void Crossfade(@p000.yfb p000.yeh<T> r16, @p000.gib androidx.compose.p002ui.InterfaceC0701e r17, @p000.gib p000.fw5<java.lang.Float> r18, @p000.gib p000.qy6<? super T, ? extends java.lang.Object> r19, @p000.yfb p000.kz6<? super T, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r20, @p000.gib p000.zl2 r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a93.Crossfade(yeh, androidx.compose.ui.e, fw5, qy6, kz6, zl2, int, int):void");
    }
}
