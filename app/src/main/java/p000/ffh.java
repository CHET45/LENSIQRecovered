package p000;

import androidx.mediarouter.media.C1340j;
import p000.p7e;
import p000.v7e;
import p000.yeh;
import p000.yeh.C15635a;
import p000.yeh.C15638d;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2183:1\n1882#1,7:2256\n1882#1,7:2263\n1882#1,7:2270\n1882#1,7:2277\n1882#1,7:2284\n1882#1,7:2291\n1882#1,7:2298\n1882#1,7:2305\n1223#2,6:2184\n1223#2,6:2190\n1223#2,6:2196\n1223#2,6:2202\n1223#2,6:2208\n1223#2,6:2214\n1223#2,6:2220\n1223#2,6:2226\n1223#2,6:2232\n1223#2,6:2238\n1223#2,6:2244\n1223#2,6:2250\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1967#1:2256,7\n1998#1:2263,7\n2029#1:2270,7\n2060#1:2277,7\n2091#1:2284,7\n2122#1:2291,7\n2152#1:2298,7\n2182#1:2305,7\n91#1:2184,6\n93#1:2190,6\n820#1:2196,6\n824#1:2202,6\n835#1:2208,6\n1779#1:2214,6\n1780#1:2220,6\n1812#1:2226,6\n1825#1:2232,6\n1829#1:2238,6\n1900#1:2244,6\n1923#1:2250,6\n*E\n"})
public final class ffh {

    /* JADX INFO: renamed from: a */
    public static final int f36457a = 1;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qy6<mue<?>, bth> f36458b = C5795q.f36496a;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final fx8 f36459c = hz8.lazy(g39.f38327c, (ny6) C5779a.f36465a);

    /* JADX INFO: renamed from: d */
    public static final float f36460d = -1.0f;

    /* JADX INFO: renamed from: e */
    public static final float f36461e = -2.0f;

    /* JADX INFO: renamed from: f */
    public static final float f36462f = -3.0f;

    /* JADX INFO: renamed from: g */
    public static final float f36463g = -4.0f;

    /* JADX INFO: renamed from: h */
    public static final float f36464h = -5.0f;

    /* JADX INFO: renamed from: ffh$a */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$SeekableStateObserver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2183:1\n1#2:2184\n*E\n"})
    public static final class C5779a extends tt8 implements ny6<cuf> {

        /* JADX INFO: renamed from: a */
        public static final C5779a f36465a = new C5779a();

        /* JADX INFO: renamed from: ffh$a$a */
        public static final class a extends tt8 implements qy6<ny6<? extends bth>, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f36466a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(ny6<? extends bth> ny6Var) {
                invoke2((ny6<bth>) ny6Var);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb ny6<bth> ny6Var) {
                ny6Var.invoke();
            }
        }

        public C5779a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final cuf invoke() {
            cuf cufVar = new cuf(a.f36466a);
            cufVar.start();
            return cufVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$b */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateDp$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5780b<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<kn4>> {

        /* JADX INFO: renamed from: a */
        public static final C5780b f36467a = new C5780b();

        public C5780b() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<kn4> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final mzf<kn4> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-575880366);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-575880366, i, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1992)");
            }
            mzf<kn4> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, kn4.m30703boximpl(edi.getVisibilityThreshold(kn4.f54774b)), 3, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$c */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateFloat$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5781c<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<Float>> {

        /* JADX INFO: renamed from: a */
        public static final C5781c f36468a = new C5781c();

        public C5781c() {
            super(3);
        }

        @yfb
        @hk2
        public final mzf<Float> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-522164544);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-522164544, i, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1962)");
            }
            mzf<Float> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<Float> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$d */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateInt$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5782d<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C5782d f36469a = new C5782d();

        public C5782d() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<Integer> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final mzf<Integer> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-785273069);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-785273069, i, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2116)");
            }
            mzf<Integer> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, 1, 3, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$e */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5783e<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<a78>> {

        /* JADX INFO: renamed from: a */
        public static final C5783e f36470a = new C5783e();

        public C5783e() {
            super(3);
        }

        @yfb
        @hk2
        public final mzf<a78> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-1953479610);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1953479610, i, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2086)");
            }
            mzf<a78> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, a78.m27192boximpl(b78.IntOffset(1, 1)), 3, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<a78> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$f */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5784f<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<r78>> {

        /* JADX INFO: renamed from: a */
        public static final C5784f f36471a = new C5784f();

        public C5784f() {
            super(3);
        }

        @yfb
        @hk2
        public final mzf<r78> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(967893300);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(967893300, i, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2147)");
            }
            mzf<r78> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, r78.m32079boximpl(s78.IntSize(1, 1)), 3, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<r78> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$g */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateOffset$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5785g<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<izb>> {

        /* JADX INFO: renamed from: a */
        public static final C5785g f36472a = new C5785g();

        public C5785g() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<izb> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final mzf<izb> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(1623385561);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1623385561, i, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2023)");
            }
            mzf<izb> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, izb.m30418boximpl(edi.getVisibilityThreshold(izb.f49009b)), 3, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$h */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5786h<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<rud>> {

        /* JADX INFO: renamed from: a */
        public static final C5786h f36473a = new C5786h();

        public C5786h() {
            super(3);
        }

        @yfb
        @hk2
        public final mzf<rud> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(691336298);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(691336298, i, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2177)");
            }
            mzf<rud> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, edi.getVisibilityThreshold(rud.f79687e), 3, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<rud> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: ffh$i */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateSize$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5787i<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<wpf>> {

        /* JADX INFO: renamed from: a */
        public static final C5787i f36474a = new C5787i();

        public C5787i() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<wpf> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final mzf<wpf> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-1607152761);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1607152761, i, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2054)");
            }
            mzf<wpf> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, wpf.m33057boximpl(edi.getVisibilityThreshold(wpf.f95046b)), 3, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S, T] */
    /* JADX INFO: renamed from: ffh$j */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,2183:1\n*E\n"})
    public static final class C5788j<S, T> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<T>> {

        /* JADX INFO: renamed from: a */
        public static final C5788j f36475a = new C5788j();

        public C5788j() {
            super(3);
        }

        @yfb
        @hk2
        public final mzf<T> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-895531546);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-895531546, i, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1878)");
            }
            mzf<T> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }
    }

    /* JADX INFO: renamed from: ffh$k */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2183:1\n64#2,5:2184\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n1831#1:2184,5\n*E\n"})
    public static final class C5789k extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<S> f36476a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yeh<T> f36477b;

        /* JADX INFO: renamed from: ffh$k$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n1#1,497:1\n1832#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yeh f36478a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yeh f36479b;

            public a(yeh yehVar, yeh yehVar2) {
                this.f36478a = yehVar;
                this.f36479b = yehVar2;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f36478a.removeTransition$animation_core_release(this.f36479b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5789k(yeh<S> yehVar, yeh<T> yehVar2) {
            super(1);
            this.f36476a = yehVar;
            this.f36477b = yehVar2;
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
        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f36476a.addTransition$animation_core_release(this.f36477b);
            return new a(this.f36476a, this.f36477b);
        }
    }

    /* JADX INFO: renamed from: ffh$l */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2183:1\n64#2,5:2184\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1$1\n*L\n1781#1:2184,5\n*E\n"})
    public static final class C5790l extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<S> f36480a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yeh<S>.C15635a<T, V> f36481b;

        /* JADX INFO: renamed from: ffh$l$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1$1\n*L\n1#1,497:1\n1782#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yeh f36482a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yeh.C15635a f36483b;

            public a(yeh yehVar, yeh.C15635a c15635a) {
                this.f36482a = yehVar;
                this.f36483b = c15635a;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f36482a.removeAnimation$animation_core_release(this.f36483b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5790l(yeh<S> yehVar, yeh<S>.C15635a<T, V> c15635a) {
            super(1);
            this.f36480a = yehVar;
            this.f36481b = c15635a;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f36480a, this.f36481b);
        }
    }

    /* JADX INFO: renamed from: ffh$m */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2183:1\n64#2,5:2184\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n1925#1:2184,5\n*E\n"})
    public static final class C5791m extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<S> f36484a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yeh<S>.C15638d<T, V> f36485b;

        /* JADX INFO: renamed from: ffh$m$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n1#1,497:1\n1926#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yeh f36486a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yeh.C15638d f36487b;

            public a(yeh yehVar, yeh.C15638d c15638d) {
                this.f36486a = yehVar;
                this.f36487b = c15638d;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f36486a.removeAnimation$animation_core_release(this.f36487b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5791m(yeh<S> yehVar, yeh<S>.C15638d<T, V> c15638d) {
            super(1);
            this.f36484a = yehVar;
            this.f36485b = c15638d;
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
        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            this.f36484a.addAnimation$animation_core_release(this.f36485b);
            return new a(this.f36484a, this.f36485b);
        }
    }

    /* JADX INFO: renamed from: ffh$n */
    @ck3(m4009c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", m4010f = "Transition.kt", m4011i = {0}, m4012l = {2189}, m4013m = "invokeSuspend", m4014n = {"$this$withLock_u24default$iv"}, m4015s = {"L$0"})
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2183:1\n120#2,10:2184\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n826#1:2184,10\n*E\n"})
    public static final class C5792n extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36488a;

        /* JADX INFO: renamed from: b */
        public Object f36489b;

        /* JADX INFO: renamed from: c */
        public int f36490c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ nfh<T> f36491d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5792n(nfh<T> nfhVar, zy2<? super C5792n> zy2Var) {
            super(2, zy2Var);
            this.f36491d = nfhVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C5792n(this.f36491d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C5792n) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            y7b compositionContinuationMutex$animation_core_release;
            nfh nfhVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f36490c;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ((mue) this.f36491d).observeTotalDuration$animation_core_release();
                compositionContinuationMutex$animation_core_release = ((mue) this.f36491d).getCompositionContinuationMutex$animation_core_release();
                nfh nfhVar2 = this.f36491d;
                this.f36488a = compositionContinuationMutex$animation_core_release;
                this.f36489b = nfhVar2;
                this.f36490c = 1;
                if (compositionContinuationMutex$animation_core_release.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nfhVar = nfhVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nfhVar = (nfh) this.f36489b;
                compositionContinuationMutex$animation_core_release = (y7b) this.f36488a;
                y7e.throwOnFailure(obj);
            }
            try {
                ((mue) nfhVar).setComposedTargetState$animation_core_release(nfhVar.getTargetState());
                dq1 compositionContinuation$animation_core_release = ((mue) nfhVar).getCompositionContinuation$animation_core_release();
                if (compositionContinuation$animation_core_release != null) {
                    v7e.C13927a c13927a = v7e.f90266b;
                    compositionContinuation$animation_core_release.resumeWith(v7e.m32723constructorimpl(nfhVar.getTargetState()));
                }
                ((mue) nfhVar).setCompositionContinuation$animation_core_release(null);
                bth bthVar = bth.f14751a;
                compositionContinuationMutex$animation_core_release.unlock(null);
                return bthVar;
            } catch (Throwable th) {
                compositionContinuationMutex$animation_core_release.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ffh$o */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2183:1\n64#2,5:2184\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$2$1\n*L\n836#1:2184,5\n*E\n"})
    public static final class C5793o extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f36492a;

        /* JADX INFO: renamed from: ffh$o$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$2$1\n*L\n1#1,497:1\n839#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yeh f36493a;

            public a(yeh yehVar) {
                this.f36493a = yehVar;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f36493a.onDisposed$animation_core_release();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5793o(yeh<T> yehVar) {
            super(1);
            this.f36492a = yehVar;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f36492a);
        }
    }

    /* JADX INFO: renamed from: ffh$p */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2183:1\n64#2,5:2184\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n94#1:2184,5\n*E\n"})
    public static final class C5794p extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yeh<T> f36494a;

        /* JADX INFO: renamed from: ffh$p$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n1#1,497:1\n97#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yeh f36495a;

            public a(yeh yehVar) {
                this.f36495a = yehVar;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f36495a.onDisposed$animation_core_release();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5794p(yeh<T> yehVar) {
            super(1);
            this.f36494a = yehVar;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f36494a);
        }
    }

    /* JADX INFO: renamed from: ffh$q */
    public static final class C5795q extends tt8 implements qy6<mue<?>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5795q f36496a = new C5795q();

        public C5795q() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mue<?> mueVar) {
            invoke2(mueVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb mue<?> mueVar) {
            mueVar.onTotalDurationChanged$animation_core_release();
        }
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<kn4> animateDp(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<kn4>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, kn4> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5780b.f36467a;
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        alh<kn4, C14294vy> vectorConverter = g3i.getVectorConverter(kn4.f54774b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<Float> animateFloat(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<Float>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, Float> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5781c.f36468a;
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        alh<Float, C14294vy> vectorConverter = g3i.getVectorConverter(d46.f28382a);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<Integer> animateInt(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<Integer>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, Integer> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5782d.f36469a;
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        alh<Integer, C14294vy> vectorConverter = g3i.getVectorConverter(f68.f35480a);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<a78> animateIntOffset(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<a78>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, a78> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5783e.f36470a;
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        alh<a78, C14830wy> vectorConverter = g3i.getVectorConverter(a78.f545b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<r78> animateIntSize(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<r78>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, r78> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5784f.f36471a;
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        alh<r78, C14830wy> vectorConverter = g3i.getVectorConverter(r78.f77324b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<izb> animateOffset(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<izb>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, izb> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5785g.f36472a;
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        alh<izb, C14830wy> vectorConverter = g3i.getVectorConverter(izb.f49009b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<rud> animateRect(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<rud>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, rud> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5786h.f36473a;
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        alh<rud, C15879yy> vectorConverter = g3i.getVectorConverter(rud.f79687e);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<wpf> animateSize(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<wpf>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, wpf> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C5787i.f36474a;
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        alh<wpf, C14830wy> vectorConverter = g3i.getVectorConverter(wpf.f95046b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S, T, V extends AbstractC16313zy> i2g<T> animateValue(@yfb yeh<S> yehVar, @yfb alh<T, V> alhVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<T>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, ? extends T> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            kz6Var = C5788j.f36475a;
        }
        if ((i2 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i3 = (i >> 9) & 112;
        return createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i3)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i3)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i >> 3) & 112)), alhVar, str, zl2Var, (i & 14) | (57344 & (i << 9)) | ((i << 6) & 458752));
    }

    @vh5
    @yfb
    @hk2
    @ik2(scheme = "[0[0]]")
    public static final <S, T> yeh<T> createChildTransition(@yfb yeh<S> yehVar, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, ? extends T> kz6Var, @gib zl2 zl2Var, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i3 = i & 14;
        if (((i3 ^ 6) <= 4 || !zl2Var.changed(yehVar)) && (i & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = yehVar.getCurrentState();
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        if (yehVar.isSeeking()) {
            objRememberedValue = yehVar.getCurrentState();
        }
        int i4 = (i >> 3) & 112;
        return createChildTransitionInternal(yehVar, kz6Var.invoke(objRememberedValue, zl2Var, Integer.valueOf(i4)), kz6Var.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i4)), str2, zl2Var, i3 | ((i << 6) & 7168));
    }

    @yfb
    @hk2
    @yjd
    public static final <S, T> yeh<T> createChildTransitionInternal(@yfb yeh<S> yehVar, T t, T t2, @yfb String str, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1823)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && zl2Var.changed(yehVar)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new yeh(new b7b(t), yehVar, yehVar.getLabel() + " > " + str);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        yeh<T> yehVar2 = (yeh) objRememberedValue;
        if ((i2 <= 4 || !zl2Var.changed(yehVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zChanged = zl2Var.changed(yehVar2) | z;
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue2 == zl2.f105372a.getEmpty()) {
            objRememberedValue2 = new C5789k(yehVar, yehVar2);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.DisposableEffect(yehVar2, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2Var, 0);
        if (yehVar.isSeeking()) {
            yehVar2.seek(t, t2, yehVar.getLastSeekedTimeNanos$animation_core_release());
        } else {
            yehVar2.updateTarget$animation_core_release(t2);
            yehVar2.setSeeking$animation_core_release(false);
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return yehVar2;
    }

    @yfb
    @hk2
    @p7e({p7e.EnumC10826a.f69934a})
    public static final <S, T, V extends AbstractC16313zy> yeh<S>.C15635a<T, V> createDeferredAnimation(@yfb yeh<S> yehVar, @yfb alh<T, V> alhVar, @gib String str, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1777)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && zl2Var.changed(yehVar)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = yehVar.new C15635a(alhVar, str);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        yeh<S>.C15635a<T, V> c15635a = (yeh.C15635a) objRememberedValue;
        if ((i3 <= 4 || !zl2Var.changed(yehVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance = zl2Var.changedInstance(c15635a) | z;
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == zl2.f105372a.getEmpty()) {
            objRememberedValue2 = new C5790l(yehVar, c15635a);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.DisposableEffect(c15635a, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2Var, 0);
        if (yehVar.isSeeking()) {
            c15635a.setupSeeking$animation_core_release();
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return c15635a;
    }

    @yfb
    @hk2
    @yjd
    public static final <S, T, V extends AbstractC16313zy> i2g<T> createTransitionAnimation(@yfb yeh<S> yehVar, T t, T t2, @yfb fw5<T> fw5Var, @yfb alh<T, V> alhVar, @yfb String str, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1898)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && zl2Var.changed(yehVar)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            Object c15638d = yehVar.new C15638d(t, C12827sy.createZeroVectorFrom(alhVar, t2), alhVar, str);
            zl2Var.updateRememberedValue(c15638d);
            objRememberedValue = c15638d;
        }
        yeh.C15638d c15638d2 = (yeh.C15638d) objRememberedValue;
        if (yehVar.isSeeking()) {
            c15638d2.updateInitialAndTargetValue$animation_core_release(t, t2, fw5Var);
        } else {
            c15638d2.updateTargetValue$animation_core_release(t2, fw5Var);
        }
        if ((i2 <= 4 || !zl2Var.changed(yehVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zChanged = zl2Var.changed(c15638d2) | z;
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue2 == zl2.f105372a.getEmpty()) {
            objRememberedValue2 = new C5791m(yehVar, c15638d2);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.DisposableEffect(c15638d2, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return c15638d2;
    }

    @yfb
    public static final cuf getSeekableStateObserver() {
        return (cuf) f36459c.getValue();
    }

    @yfb
    @hk2
    public static final <T> yeh<T> rememberTransition(@yfb nfh<T> nfhVar, @gib String str, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:818)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && zl2Var.changed(nfhVar)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new yeh((nfh) nfhVar, str);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        yeh<T> yehVar = (yeh) objRememberedValue;
        if (nfhVar instanceof mue) {
            zl2Var.startReplaceGroup(1030282692);
            T currentState = nfhVar.getCurrentState();
            T targetState = nfhVar.getTargetState();
            if ((i3 <= 4 || !zl2Var.changed(nfhVar)) && (i & 6) != 4) {
                z = false;
            }
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (z || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                objRememberedValue2 = new C5792n(nfhVar, null);
                zl2Var.updateRememberedValue(objRememberedValue2);
            }
            jx4.LaunchedEffect(currentState, targetState, (gz6) objRememberedValue2, zl2Var, 0);
            zl2Var.endReplaceGroup();
        } else {
            zl2Var.startReplaceGroup(1030744251);
            yehVar.animateTo$animation_core_release(nfhVar.getTargetState(), zl2Var, 0);
            zl2Var.endReplaceGroup();
        }
        boolean zChanged = zl2Var.changed(yehVar);
        Object objRememberedValue3 = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue3 == zl2.f105372a.getEmpty()) {
            objRememberedValue3 = new C5793o(yehVar);
            zl2Var.updateRememberedValue(objRememberedValue3);
        }
        jx4.DisposableEffect(yehVar, (qy6<? super wf4, ? extends vf4>) objRememberedValue3, zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return yehVar;
    }

    @yfb
    @hk2
    public static final <T> yeh<T> updateTransition(T t, @gib String str, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:89)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = new yeh(t, str);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        yeh<T> yehVar = (yeh) objRememberedValue;
        yehVar.animateTo$animation_core_release(t, zl2Var, (i & 8) | 48 | (i & 14));
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C5794p(yehVar);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.DisposableEffect(yehVar, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2Var, 54);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return yehVar;
    }

    @yfb
    @hk2
    @q64(message = "Use rememberTransition() instead", replaceWith = @i2e(expression = "rememberTransition(transitionState, label)", imports = {}))
    public static final <T> yeh<T> updateTransition(@yfb b7b<T> b7bVar, @gib String str, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:871)");
        }
        yeh<T> yehVarRememberTransition = rememberTransition(b7bVar, str, zl2Var, i & 126, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return yehVarRememberTransition;
    }
}
