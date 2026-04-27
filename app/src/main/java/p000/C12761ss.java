package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.oo6;
import p000.v7e;

/* JADX INFO: renamed from: ss */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
@e0g(parameters = 0)
public final class C12761ss implements ywc {

    /* JADX INFO: renamed from: c */
    public static final int f82726c = 8;

    /* JADX INFO: renamed from: a */
    public final Context f82727a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f82728b;

    /* JADX INFO: renamed from: ss$a */
    @ck3(m4009c = "androidx.compose.ui.text.font.AndroidFontLoader", m4010f = "AndroidFontLoader.android.kt", m4011i = {1, 1}, m4012l = {57, 58}, m4013m = "awaitLoad", m4014n = {"this", ypa.f102577q}, m4015s = {"L$0", "L$1"})
    public static final class a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f82729a;

        /* JADX INFO: renamed from: b */
        public Object f82730b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f82731c;

        /* JADX INFO: renamed from: e */
        public int f82733e;

        public a(zy2<? super a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f82731c = obj;
            this.f82733e |= Integer.MIN_VALUE;
            return C12761ss.this.awaitLoad(null, this);
        }
    }

    public C12761ss(@yfb Context context) {
        this.f82727a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.ywc
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitLoad(@p000.yfb p000.xn6 r6, @p000.yfb p000.zy2<? super android.graphics.Typeface> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C12761ss.a
            if (r0 == 0) goto L13
            r0 = r7
            ss$a r0 = (p000.C12761ss.a) r0
            int r1 = r0.f82733e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82733e = r1
            goto L18
        L13:
            ss$a r0 = new ss$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f82731c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f82733e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f82730b
            xn6 r6 = (p000.xn6) r6
            java.lang.Object r0 = r0.f82729a
            ss r0 = (p000.C12761ss) r0
            p000.y7e.throwOnFailure(r7)
            goto L70
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            p000.y7e.throwOnFailure(r7)
            goto L58
        L40:
            p000.y7e.throwOnFailure(r7)
            boolean r7 = r6 instanceof p000.AbstractC11083ps
            if (r7 == 0) goto L59
            ps r6 = (p000.AbstractC11083ps) r6
            ps$a r7 = r6.getTypefaceLoader()
            android.content.Context r2 = r5.f82727a
            r0.f82733e = r4
            java.lang.Object r7 = r7.awaitLoad(r2, r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            return r7
        L59:
            boolean r7 = r6 instanceof p000.i6e
            if (r7 == 0) goto L7f
            r7 = r6
            i6e r7 = (p000.i6e) r7
            android.content.Context r2 = r5.f82727a
            r0.f82729a = r5
            r0.f82730b = r6
            r0.f82733e = r3
            java.lang.Object r7 = p000.C13181ts.access$loadAsync(r7, r2, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
        L70:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            i6e r6 = (p000.i6e) r6
            ip6$e r6 = r6.getVariationSettings()
            android.content.Context r0 = r0.f82727a
            android.graphics.Typeface r6 = p000.gyc.setFontVariationSettings(r7, r6, r0)
            return r6
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C12761ss.awaitLoad(xn6, zy2):java.lang.Object");
    }

    @Override // p000.ywc
    @gib
    public Object getCacheKey() {
        return this.f82728b;
    }

    @Override // p000.ywc
    @gib
    public Typeface loadBlocking(@yfb xn6 xn6Var) {
        Object objM32723constructorimpl;
        Typeface typefaceLoad;
        if (xn6Var instanceof AbstractC11083ps) {
            AbstractC11083ps abstractC11083ps = (AbstractC11083ps) xn6Var;
            return abstractC11083ps.getTypefaceLoader().loadBlocking(this.f82727a, abstractC11083ps);
        }
        if (!(xn6Var instanceof i6e)) {
            return null;
        }
        int iMo30174getLoadingStrategyPKNRLFQ = xn6Var.mo30174getLoadingStrategyPKNRLFQ();
        oo6.C10484a c10484a = oo6.f68233b;
        if (oo6.m31519equalsimpl0(iMo30174getLoadingStrategyPKNRLFQ, c10484a.m31524getBlockingPKNRLFQ())) {
            typefaceLoad = C13181ts.load((i6e) xn6Var, this.f82727a);
        } else {
            if (!oo6.m31519equalsimpl0(iMo30174getLoadingStrategyPKNRLFQ, c10484a.m31525getOptionalLocalPKNRLFQ())) {
                if (oo6.m31519equalsimpl0(iMo30174getLoadingStrategyPKNRLFQ, c10484a.m31523getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) oo6.m31521toStringimpl(xn6Var.mo30174getLoadingStrategyPKNRLFQ())));
            }
            try {
                v7e.C13927a c13927a = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(C13181ts.load((i6e) xn6Var, this.f82727a));
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            typefaceLoad = (Typeface) (v7e.m32729isFailureimpl(objM32723constructorimpl) ? null : objM32723constructorimpl);
        }
        return gyc.setFontVariationSettings(typefaceLoad, ((i6e) xn6Var).getVariationSettings(), this.f82727a);
    }
}
