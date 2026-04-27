package p000;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import java.util.concurrent.CancellationException;
import p000.jj8;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@c5e(30)
@dwf({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,725:1\n314#2,11:726\n26#3:737\n26#3:738\n26#3:739\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n213#1:726,11\n272#1:737\n273#1:738\n391#1:739\n*E\n"})
public final class roi implements hab, WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: C */
    public float f78888C;

    /* JADX INFO: renamed from: F */
    @gib
    public jj8 f78889F;

    /* JADX INFO: renamed from: H */
    @gib
    public dq1<? super WindowInsetsAnimationController> f78890H;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C10671ow f78891a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final View f78892b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ubf f78893c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final c64 f78894d;

    /* JADX INFO: renamed from: e */
    @gib
    public WindowInsetsAnimationController f78895e;

    /* JADX INFO: renamed from: f */
    public boolean f78896f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final CancellationSignal f78897m = new CancellationSignal();

    /* JADX INFO: renamed from: roi$a */
    public static final class C12185a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12185a f78898a = new C12185a();

        public C12185a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Throwable th) {
        }
    }

    /* JADX INFO: renamed from: roi$b */
    public static final class C12186b extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12186b f78899a = new C12186b();

        public C12186b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Throwable th) {
        }
    }

    /* JADX INFO: renamed from: roi$c */
    @ck3(m4009c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", m4010f = "WindowInsetsConnection.android.kt", m4011i = {0, 0, 0, 1, 1, 1, 2, 2}, m4012l = {320, 346, 371}, m4013m = "fling-huYlsQE", m4014n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, m4015s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
    public static final class C12187c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f78900a;

        /* JADX INFO: renamed from: b */
        public Object f78901b;

        /* JADX INFO: renamed from: c */
        public long f78902c;

        /* JADX INFO: renamed from: d */
        public float f78903d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f78904e;

        /* JADX INFO: renamed from: m */
        public int f78906m;

        public C12187c(zy2<? super C12187c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f78904e = obj;
            this.f78906m |= Integer.MIN_VALUE;
            return roi.this.m32162flinghuYlsQE(0L, 0.0f, false, this);
        }
    }

    /* JADX INFO: renamed from: roi$d */
    @ck3(m4009c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", m4010f = "WindowInsetsConnection.android.kt", m4011i = {}, m4012l = {364}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12188d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f78907C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ jvd.C8118e f78908F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ WindowInsetsAnimationController f78909H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ boolean f78910L;

        /* JADX INFO: renamed from: a */
        public int f78911a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f78912b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f78914d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f78915e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tyf f78916f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f78917m;

        /* JADX INFO: renamed from: roi$d$a */
        @ck3(m4009c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", m4010f = "WindowInsetsConnection.android.kt", m4011i = {}, m4012l = {348}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ jvd.C8118e f78918C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ WindowInsetsAnimationController f78919F;

            /* JADX INFO: renamed from: H */
            public final /* synthetic */ boolean f78920H;

            /* JADX INFO: renamed from: a */
            public int f78921a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f78922b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ float f78923c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ tyf f78924d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f78925e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f78926f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ roi f78927m;

            /* JADX INFO: renamed from: roi$d$a$a, reason: collision with other inner class name */
            public static final class C16517a extends tt8 implements gz6<Float, Float, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f78928a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f78929b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ roi f78930c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ jvd.C8118e f78931d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ WindowInsetsAnimationController f78932e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f78933f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16517a(int i, int i2, roi roiVar, jvd.C8118e c8118e, WindowInsetsAnimationController windowInsetsAnimationController, boolean z) {
                    super(2);
                    this.f78928a = i;
                    this.f78929b = i2;
                    this.f78930c = roiVar;
                    this.f78931d = c8118e;
                    this.f78932e = windowInsetsAnimationController;
                    this.f78933f = z;
                }

                @Override // p000.gz6
                public /* bridge */ /* synthetic */ bth invoke(Float f, Float f2) {
                    invoke(f.floatValue(), f2.floatValue());
                    return bth.f14751a;
                }

                public final void invoke(float f, float f2) {
                    float f3 = this.f78928a;
                    if (f <= this.f78929b && f3 <= f) {
                        this.f78930c.adjustInsets(f);
                        return;
                    }
                    this.f78931d.f52107a = f2;
                    this.f78932e.finish(this.f78933f);
                    this.f78930c.f78895e = null;
                    jj8 jj8Var = this.f78930c.f78889F;
                    if (jj8Var != null) {
                        jj8Var.cancel((CancellationException) new wli());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, float f, tyf tyfVar, int i2, int i3, roi roiVar, jvd.C8118e c8118e, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f78922b = i;
                this.f78923c = f;
                this.f78924d = tyfVar;
                this.f78925e = i2;
                this.f78926f = i3;
                this.f78927m = roiVar;
                this.f78918C = c8118e;
                this.f78919F = windowInsetsAnimationController;
                this.f78920H = z;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f78922b, this.f78923c, this.f78924d, this.f78925e, this.f78926f, this.f78927m, this.f78918C, this.f78919F, this.f78920H, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f78921a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    float f = this.f78922b;
                    float f2 = this.f78923c;
                    tyf tyfVar = this.f78924d;
                    C16517a c16517a = new C16517a(this.f78925e, this.f78926f, this.f78927m, this.f78918C, this.f78919F, this.f78920H);
                    this.f78921a = 1;
                    if (rgg.animateDecay(f, f2, tyfVar, c16517a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12188d(int i, float f, tyf tyfVar, int i2, int i3, jvd.C8118e c8118e, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, zy2<? super C12188d> zy2Var) {
            super(2, zy2Var);
            this.f78914d = i;
            this.f78915e = f;
            this.f78916f = tyfVar;
            this.f78917m = i2;
            this.f78907C = i3;
            this.f78908F = c8118e;
            this.f78909H = windowInsetsAnimationController;
            this.f78910L = z;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12188d c12188d = roi.this.new C12188d(this.f78914d, this.f78915e, this.f78916f, this.f78917m, this.f78907C, this.f78908F, this.f78909H, this.f78910L, zy2Var);
            c12188d.f78912b = obj;
            return c12188d;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12188d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f78911a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f78912b;
                roi roiVar = roi.this;
                roiVar.f78889F = fg1.launch$default(x13Var, null, null, new a(this.f78914d, this.f78915e, this.f78916f, this.f78917m, this.f78907C, roiVar, this.f78908F, this.f78909H, this.f78910L, null), 3, null);
                jj8 jj8Var = roi.this.f78889F;
                if (jj8Var != null) {
                    this.f78911a = 1;
                    if (jj8Var.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            roi.this.f78889F = null;
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: roi$e */
    @ck3(m4009c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", m4010f = "WindowInsetsConnection.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12189e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f78934C;

        /* JADX INFO: renamed from: a */
        public int f78935a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f78936b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f78938d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f78939e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f78940f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ WindowInsetsAnimationController f78941m;

        /* JADX INFO: renamed from: roi$e$a */
        @ck3(m4009c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", m4010f = "WindowInsetsConnection.android.kt", m4011i = {}, m4012l = {374}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f78942a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f78943b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f78944c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ float f78945d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ WindowInsetsAnimationController f78946e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ boolean f78947f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ roi f78948m;

            /* JADX INFO: renamed from: roi$e$a$a, reason: collision with other inner class name */
            public static final class C16518a extends tt8 implements qy6<C13257tw<Float, C14294vy>, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ roi f78949a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16518a(roi roiVar) {
                    super(1);
                    this.f78949a = roiVar;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(C13257tw<Float, C14294vy> c13257tw) {
                    invoke2(c13257tw);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb C13257tw<Float, C14294vy> c13257tw) {
                    this.f78949a.adjustInsets(c13257tw.getValue().floatValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, roi roiVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f78943b = i;
                this.f78944c = i2;
                this.f78945d = f;
                this.f78946e = windowInsetsAnimationController;
                this.f78947f = z;
                this.f78948m = roiVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f78943b, this.f78944c, this.f78945d, this.f78946e, this.f78947f, this.f78948m, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f78942a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    C13257tw c13257twAnimatable$default = C1634ax.Animatable$default(this.f78943b, 0.0f, 2, null);
                    Float fBoxFloat = wc1.boxFloat(this.f78944c);
                    Float fBoxFloat2 = wc1.boxFloat(this.f78945d);
                    C16518a c16518a = new C16518a(this.f78948m);
                    this.f78942a = 1;
                    if (C13257tw.animateTo$default(c13257twAnimatable$default, fBoxFloat, null, fBoxFloat2, c16518a, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                this.f78946e.finish(this.f78947f);
                this.f78948m.f78895e = null;
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12189e(int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, zy2<? super C12189e> zy2Var) {
            super(2, zy2Var);
            this.f78938d = i;
            this.f78939e = i2;
            this.f78940f = f;
            this.f78941m = windowInsetsAnimationController;
            this.f78934C = z;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12189e c12189e = roi.this.new C12189e(this.f78938d, this.f78939e, this.f78940f, this.f78941m, this.f78934C, zy2Var);
            c12189e.f78936b = obj;
            return c12189e;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12189e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f78935a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            x13 x13Var = (x13) this.f78936b;
            roi roiVar = roi.this;
            roiVar.f78889F = fg1.launch$default(x13Var, null, null, new a(this.f78938d, this.f78939e, this.f78940f, this.f78941m, this.f78934C, roiVar, null), 3, null);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: roi$f */
    public static final class C12190f extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12190f f78950a = new C12190f();

        public C12190f() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Throwable th) {
        }
    }

    public roi(@yfb C10671ow c10671ow, @yfb View view, @yfb ubf ubfVar, @yfb c64 c64Var) {
        this.f78891a = c10671ow;
        this.f78892b = view;
        this.f78893c = ubfVar;
        this.f78894d = c64Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f78895e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.f78893c.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), Math.round(f)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f78895e;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.f78895e) != null) {
            windowInsetsAnimationController.finish(this.f78891a.isVisible());
        }
        this.f78895e = null;
        dq1<? super WindowInsetsAnimationController> dq1Var = this.f78890H;
        if (dq1Var != null) {
            dq1Var.resume((Object) null, C12185a.f78898a);
        }
        this.f78890H = null;
        jj8 jj8Var = this.f78889F;
        if (jj8Var != null) {
            jj8Var.cancel((CancellationException) new wli());
        }
        this.f78889F = null;
        this.f78888C = 0.0f;
        this.f78896f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m32162flinghuYlsQE(long r26, float r28, boolean r29, p000.zy2<? super p000.i4i> r30) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.roi.m32162flinghuYlsQE(long, float, boolean, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(zy2<? super WindowInsetsAnimationController> zy2Var) {
        Object result = this.f78895e;
        if (result == null) {
            fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
            fq1Var.initCancellability();
            this.f78890H = fq1Var;
            requestAnimationController();
            result = fq1Var.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.f78896f) {
            return;
        }
        this.f78896f = true;
        WindowInsetsController windowInsetsController = this.f78892b.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.f78891a.getType$foundation_layout_release(), -1L, null, this.f78897m, koi.m14887a(this));
        }
    }

    /* JADX INFO: renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m32163scroll8S9VItk(long j, float f) {
        jj8 jj8Var = this.f78889F;
        if (jj8Var != null) {
            jj8Var.cancel((CancellationException) new wli());
            this.f78889F = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f78895e;
        if (f != 0.0f) {
            if (this.f78891a.isVisible() != (f > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f78888C = 0.0f;
                    requestAnimationController();
                    return this.f78893c.mo32593consumedOffsetsMKHz9U(j);
                }
                int iValueOf = this.f78893c.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int iValueOf2 = this.f78893c.valueOf(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iValueOf3 = this.f78893c.valueOf(currentInsets);
                if (iValueOf3 == (f > 0.0f ? iValueOf2 : iValueOf)) {
                    this.f78888C = 0.0f;
                    return izb.f49009b.m30445getZeroF1C5BW0();
                }
                float f2 = iValueOf3 + f + this.f78888C;
                int iCoerceIn = kpd.coerceIn(Math.round(f2), iValueOf, iValueOf2);
                this.f78888C = f2 - Math.round(f2);
                if (iCoerceIn != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f78893c.adjustInsets(currentInsets, iCoerceIn), 1.0f, 0.0f);
                }
                return this.f78893c.mo32593consumedOffsetsMKHz9U(j);
            }
        }
        return izb.f49009b.m30445getZeroF1C5BW0();
    }

    public final void dispose() {
        dq1<? super WindowInsetsAnimationController> dq1Var = this.f78890H;
        if (dq1Var != null) {
            dq1Var.resume((Object) null, C12186b.f78899a);
        }
        jj8 jj8Var = this.f78889F;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f78895e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!md8.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    @yfb
    public final c64 getDensity() {
        return this.f78894d;
    }

    @yfb
    public final ubf getSideCalculator() {
        return this.f78893c;
    }

    @yfb
    public final View getView() {
        return this.f78892b;
    }

    @yfb
    public final C10671ow getWindowInsets() {
        return this.f78891a;
    }

    public void onCancelled(@gib WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    public void onFinished(@yfb WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // p000.hab
    @gib
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo29969onPostFlingRZ2iAVY(long j, long j2, @yfb zy2<? super i4i> zy2Var) {
        return m32162flinghuYlsQE(j2, this.f78893c.showMotion(i4i.m30157getXimpl(j2), i4i.m30158getYimpl(j2)), true, zy2Var);
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo29970onPostScrollDzOQY0M(long j, long j2, int i) {
        return m32163scroll8S9VItk(j2, this.f78893c.showMotion(izb.m30429getXimpl(j2), izb.m30430getYimpl(j2)));
    }

    @Override // p000.hab
    @gib
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo29971onPreFlingQWom1Mo(long j, @yfb zy2<? super i4i> zy2Var) {
        return m32162flinghuYlsQE(j, this.f78893c.hideMotion(i4i.m30157getXimpl(j), i4i.m30158getYimpl(j)), false, zy2Var);
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo29972onPreScrollOzD1aCk(long j, int i) {
        return m32163scroll8S9VItk(j, this.f78893c.hideMotion(izb.m30429getXimpl(j), izb.m30430getYimpl(j)));
    }

    public void onReady(@yfb WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        this.f78895e = windowInsetsAnimationController;
        this.f78896f = false;
        dq1<? super WindowInsetsAnimationController> dq1Var = this.f78890H;
        if (dq1Var != null) {
            dq1Var.resume(windowInsetsAnimationController, C12190f.f78950a);
        }
        this.f78890H = null;
    }
}
