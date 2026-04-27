package p000;

import p000.wsg;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,678:1\n81#2:679\n107#2,2:680\n261#3,15:682\n261#3,15:697\n261#3,15:712\n261#3,15:727\n261#3,15:742\n267#3,9:757\n261#3,15:766\n261#3,15:781\n261#3,15:796\n261#3,15:811\n1#4:826\n314#5,11:827\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n*L\n174#1:679\n174#1:680,2\n198#1:682,15\n205#1:697,15\n211#1:712,15\n218#1:727,15\n224#1:742,15\n244#1:757,9\n265#1:766,15\n283#1:781,15\n290#1:796,15\n318#1:811,15\n419#1:827,11\n*E\n"})
public final class jeh {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C7882a f50408h = new C7882a(null);

    /* JADX INFO: renamed from: i */
    public static final int f50409i = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final wsg f50410a;

    /* JADX INFO: renamed from: b */
    @gib
    public g48 f50411b;

    /* JADX INFO: renamed from: c */
    @gib
    public final n72 f50412c;

    /* JADX INFO: renamed from: d */
    @gib
    public final l9c f50413d;

    /* JADX INFO: renamed from: e */
    @gib
    public final i2g<C7883b> f50414e;

    /* JADX INFO: renamed from: f */
    @gib
    public final i2g<C7883b> f50415f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final z6b f50416g;

    /* JADX INFO: renamed from: jeh$a */
    @dwf({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,678:1\n1#2:679\n*E\n"})
    public static final class C7882a {

        /* JADX INFO: renamed from: jeh$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f50417a;

            static {
                int[] iArr = new int[hki.values().length];
                try {
                    iArr[hki.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hki.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f50417a = iArr;
            }
        }

        public /* synthetic */ C7882a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ long m14072a(C7882a c7882a, long j, ozb ozbVar, hxe hxeVar, int i, Object obj) {
            if ((i & 4) != 0) {
                hxeVar = null;
            }
            return c7882a.m30524mapToTransformedXGyztTk(j, ozbVar, hxeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @do8
        public final C7883b calculateTransformedText(jrg jrgVar, l9c l9cVar, hxe hxeVar) {
            ozb ozbVar = new ozb();
            hrg hrgVar = new hrg(jrgVar, null, null, ozbVar, 6, null);
            l9cVar.transformOutput(hrgVar);
            jvg jvgVarM30581boximpl = null;
            if (hrgVar.getChanges().getChangeCount() == 0) {
                return null;
            }
            long jM30524mapToTransformedXGyztTk = m30524mapToTransformedXGyztTk(jrgVar.m30568getSelectiond9O1mEE(), ozbVar, hxeVar);
            jvg jvgVarM30567getCompositionMzsxiRA = jrgVar.m30567getCompositionMzsxiRA();
            if (jvgVarM30567getCompositionMzsxiRA != null) {
                jvgVarM30581boximpl = jvg.m30581boximpl(jeh.f50408h.m30524mapToTransformedXGyztTk(jvgVarM30567getCompositionMzsxiRA.m30597unboximpl(), ozbVar, hxeVar));
            }
            return new C7883b(hrgVar.m30106toTextFieldCharSequenceudt6zUU$foundation_release(jM30524mapToTransformedXGyztTk, jvgVarM30581boximpl), ozbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @do8
        /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m30523mapFromTransformedxdX6G0(long j, ozb ozbVar) {
            long jM31704mapFromDestjx7JFs = ozbVar.m31704mapFromDestjx7JFs(jvg.m30593getStartimpl(j));
            long jM31704mapFromDestjx7JFs2 = jvg.m30587getCollapsedimpl(j) ? jM31704mapFromDestjx7JFs : ozbVar.m31704mapFromDestjx7JFs(jvg.m30588getEndimpl(j));
            int iMin = Math.min(jvg.m30591getMinimpl(jM31704mapFromDestjx7JFs), jvg.m30591getMinimpl(jM31704mapFromDestjx7JFs2));
            int iMax = Math.max(jvg.m30590getMaximpl(jM31704mapFromDestjx7JFs), jvg.m30590getMaximpl(jM31704mapFromDestjx7JFs2));
            return jvg.m30592getReversedimpl(j) ? kvg.TextRange(iMax, iMin) : kvg.TextRange(iMin, iMax);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @do8
        /* JADX INFO: renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        public final long m30524mapToTransformedXGyztTk(long j, ozb ozbVar, hxe hxeVar) {
            long jM31705mapFromSourcejx7JFs = ozbVar.m31705mapFromSourcejx7JFs(jvg.m30593getStartimpl(j));
            long jM31705mapFromSourcejx7JFs2 = jvg.m30587getCollapsedimpl(j) ? jM31705mapFromSourcejx7JFs : ozbVar.m31705mapFromSourcejx7JFs(jvg.m30588getEndimpl(j));
            int iMin = Math.min(jvg.m30591getMinimpl(jM31705mapFromSourcejx7JFs), jvg.m30591getMinimpl(jM31705mapFromSourcejx7JFs2));
            int iMax = Math.max(jvg.m30590getMaximpl(jM31705mapFromSourcejx7JFs), jvg.m30590getMaximpl(jM31705mapFromSourcejx7JFs2));
            long jTextRange = jvg.m30592getReversedimpl(j) ? kvg.TextRange(iMax, iMin) : kvg.TextRange(iMin, iMax);
            if (!jvg.m30587getCollapsedimpl(j) || jvg.m30587getCollapsedimpl(jTextRange)) {
                return jTextRange;
            }
            hki startAffinity = hxeVar != null ? hxeVar.getStartAffinity() : null;
            int i = startAffinity == null ? -1 : a.f50417a[startAffinity.ordinal()];
            if (i == -1) {
                return jTextRange;
            }
            if (i == 1) {
                return kvg.TextRange(jvg.m30593getStartimpl(jTextRange));
            }
            if (i == 2) {
                return kvg.TextRange(jvg.m30588getEndimpl(jTextRange));
            }
            throw new ceb();
        }

        private C7882a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @do8
        public final C7883b calculateTransformedText(jrg jrgVar, n72 n72Var, hxe hxeVar) {
            jvg jvgVarM30581boximpl;
            ozb ozbVar = new ozb();
            CharSequence visualText = o72.toVisualText(jrgVar, n72Var, ozbVar);
            if (visualText == jrgVar) {
                return null;
            }
            long jM30524mapToTransformedXGyztTk = m30524mapToTransformedXGyztTk(jrgVar.m30568getSelectiond9O1mEE(), ozbVar, hxeVar);
            jvg jvgVarM30567getCompositionMzsxiRA = jrgVar.m30567getCompositionMzsxiRA();
            if (jvgVarM30567getCompositionMzsxiRA != null) {
                jvgVarM30581boximpl = jvg.m30581boximpl(jeh.f50408h.m30524mapToTransformedXGyztTk(jvgVarM30567getCompositionMzsxiRA.m30597unboximpl(), ozbVar, hxeVar));
            } else {
                jvgVarM30581boximpl = null;
            }
            return new C7883b(new jrg(visualText, jM30524mapToTransformedXGyztTk, jvgVarM30581boximpl, null, 8, null), ozbVar);
        }
    }

    /* JADX INFO: renamed from: jeh$b */
    public static final class C7883b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final jrg f50418a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final ozb f50419b;

        public C7883b(@yfb jrg jrgVar, @yfb ozb ozbVar) {
            this.f50418a = jrgVar;
            this.f50419b = ozbVar;
        }

        public static /* synthetic */ C7883b copy$default(C7883b c7883b, jrg jrgVar, ozb ozbVar, int i, Object obj) {
            if ((i & 1) != 0) {
                jrgVar = c7883b.f50418a;
            }
            if ((i & 2) != 0) {
                ozbVar = c7883b.f50419b;
            }
            return c7883b.copy(jrgVar, ozbVar);
        }

        @yfb
        public final jrg component1() {
            return this.f50418a;
        }

        @yfb
        public final ozb component2() {
            return this.f50419b;
        }

        @yfb
        public final C7883b copy(@yfb jrg jrgVar, @yfb ozb ozbVar) {
            return new C7883b(jrgVar, ozbVar);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7883b)) {
                return false;
            }
            C7883b c7883b = (C7883b) obj;
            return md8.areEqual(this.f50418a, c7883b.f50418a) && md8.areEqual(this.f50419b, c7883b.f50419b);
        }

        @yfb
        public final ozb getOffsetMapping() {
            return this.f50419b;
        }

        @yfb
        public final jrg getText() {
            return this.f50418a;
        }

        public int hashCode() {
            return (this.f50418a.hashCode() * 31) + this.f50419b.hashCode();
        }

        @yfb
        public String toString() {
            return "TransformedText(text=" + ((Object) this.f50418a) + ", offsetMapping=" + this.f50419b + ')';
        }
    }

    /* JADX INFO: renamed from: jeh$c */
    public static final class C7884c extends tt8 implements ny6<C7883b> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ n72 f50421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7884c(n72 n72Var) {
            super(0);
            this.f50421b = n72Var;
        }

        @Override // p000.ny6
        @gib
        public final C7883b invoke() {
            jrg value$foundation_release;
            C7883b c7883b;
            C7882a c7882a = jeh.f50408h;
            i2g i2gVar = jeh.this.f50414e;
            if (i2gVar == null || (c7883b = (C7883b) i2gVar.getValue()) == null || (value$foundation_release = c7883b.getText()) == null) {
                value$foundation_release = jeh.this.f50410a.getValue$foundation_release();
            }
            return c7882a.calculateTransformedText(value$foundation_release, this.f50421b, jeh.this.getSelectionWedgeAffinity());
        }
    }

    /* JADX INFO: renamed from: jeh$d */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", m4010f = "TransformedTextFieldState.kt", m4011i = {0, 0}, m4012l = {679}, m4013m = "collectImeNotifications", m4014n = {"this", "notifyImeListener"}, m4015s = {"L$0", "L$1"})
    public static final class C7885d extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f50422a;

        /* JADX INFO: renamed from: b */
        public Object f50423b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f50424c;

        /* JADX INFO: renamed from: e */
        public int f50426e;

        public C7885d(zy2<? super C7885d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f50424c = obj;
            this.f50426e |= Integer.MIN_VALUE;
            return jeh.this.collectImeNotifications(null, this);
        }
    }

    /* JADX INFO: renamed from: jeh$e */
    public static final class C7886e extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ wsg.InterfaceC14790a f50428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7886e(wsg.InterfaceC14790a interfaceC14790a) {
            super(1);
            this.f50428b = interfaceC14790a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            jeh.this.f50410a.removeNotifyImeListener$foundation_release(this.f50428b);
        }
    }

    /* JADX INFO: renamed from: jeh$f */
    public static final class C7887f extends tt8 implements ny6<C7883b> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l9c f50430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7887f(l9c l9cVar) {
            super(0);
            this.f50430b = l9cVar;
        }

        @Override // p000.ny6
        @gib
        public final C7883b invoke() {
            return jeh.f50408h.calculateTransformedText(jeh.this.f50410a.getValue$foundation_release(), this.f50430b, jeh.this.getSelectionWedgeAffinity());
        }
    }

    public jeh(@yfb wsg wsgVar, @gib g48 g48Var, @gib n72 n72Var, @gib l9c l9cVar) {
        this.f50410a = wsgVar;
        this.f50411b = g48Var;
        this.f50412c = n72Var;
        this.f50413d = l9cVar;
        this.f50414e = l9cVar != null ? stf.derivedStateOf(new C7887f(l9cVar)) : null;
        this.f50415f = n72Var != null ? stf.derivedStateOf(new C7884c(n72Var)) : null;
        this.f50416g = xtf.mutableStateOf$default(new hxe(hki.Start), null, 2, null);
    }

    @do8
    private static final C7883b calculateTransformedText(jrg jrgVar, n72 n72Var, hxe hxeVar) {
        return f50408h.calculateTransformedText(jrgVar, n72Var, hxeVar);
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(jeh jehVar, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        wsg wsgVar = jehVar.f50410a;
        g48 g48Var = jehVar.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qy6Var.invoke(wsgVar.getMainBuffer$foundation_release());
        wsgVar.commitEditAsUser(g48Var, z, urgVar);
    }

    @do8
    /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m30510mapFromTransformedxdX6G0(long j, ozb ozbVar) {
        return f50408h.m30523mapFromTransformedxdX6G0(j, ozbVar);
    }

    @do8
    /* JADX INFO: renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m30511mapToTransformedXGyztTk(long j, ozb ozbVar, hxe hxeVar) {
        return f50408h.m30524mapToTransformedXGyztTk(j, ozbVar, hxeVar);
    }

    public static /* synthetic */ void replaceSelectedText$default(jeh jehVar, CharSequence charSequence, boolean z, urg urgVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            urgVar = urg.MergeIfPossible;
        }
        jehVar.replaceSelectedText(charSequence, z, urgVar);
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m30512replaceTextM8tDOmk$default(jeh jehVar, CharSequence charSequence, long j, urg urgVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            urgVar = urg.MergeIfPossible;
        }
        urg urgVar2 = urgVar;
        if ((i & 8) != 0) {
            z = true;
        }
        jehVar.m30518replaceTextM8tDOmk(charSequence, j, urgVar2, z);
    }

    public final void collapseSelectionToEnd() {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(jvg.m30588getEndimpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()), jvg.m30588getEndimpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()));
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    public final void collapseSelectionToMax() {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(jvg.m30590getMaximpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()), jvg.m30590getMaximpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()));
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collectImeNotifications(@p000.yfb p000.wsg.InterfaceC14790a r5, @p000.yfb p000.zy2<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.jeh.C7885d
            if (r0 == 0) goto L13
            r0 = r6
            jeh$d r0 = (p000.jeh.C7885d) r0
            int r1 = r0.f50426e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50426e = r1
            goto L18
        L13:
            jeh$d r0 = new jeh$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50424c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f50426e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.f50423b
            wsg$a r5 = (p000.wsg.InterfaceC14790a) r5
            java.lang.Object r5 = r0.f50422a
            jeh r5 = (p000.jeh) r5
            p000.y7e.throwOnFailure(r6)
            goto L6d
        L39:
            p000.y7e.throwOnFailure(r6)
            r0.f50422a = r4
            r0.f50423b = r5
            r0.f50426e = r3
            fq1 r6 = new fq1
            zy2 r2 = p000.od8.intercepted(r0)
            r6.<init>(r2, r3)
            r6.initCancellability()
            wsg r2 = access$getTextFieldState$p(r4)
            r2.addNotifyImeListener$foundation_release(r5)
            jeh$e r2 = new jeh$e
            r2.<init>(r5)
            r6.invokeOnCancellation(r2)
            java.lang.Object r5 = r6.getResult()
            java.lang.Object r6 = p000.pd8.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L6a
            p000.jk3.probeCoroutineSuspended(r0)
        L6a:
            if (r5 != r1) goto L6d
            return r1
        L6d:
            us8 r5 = new us8
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jeh.collectImeNotifications(wsg$a, zy2):java.lang.Object");
    }

    public final void deleteSelectedText() {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.NeverMerge;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.delete(jvg.m30591getMinimpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()), jvg.m30590getMaximpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()));
        mainBuffer$foundation_release.setSelection(jvg.m30591getMinimpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()), jvg.m30591getMinimpl(mainBuffer$foundation_release.m32033getSelectiond9O1mEE()));
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    public final void editUntransformedTextAsUser(boolean z, @yfb qy6<? super qw4, bth> qy6Var) {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qy6Var.invoke(wsgVar.getMainBuffer$foundation_release());
        wsgVar.commitEditAsUser(g48Var, z, urgVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeh)) {
            return false;
        }
        jeh jehVar = (jeh) obj;
        if (md8.areEqual(this.f50410a, jehVar.f50410a) && md8.areEqual(this.f50412c, jehVar.f50412c)) {
            return md8.areEqual(this.f50413d, jehVar.f50413d);
        }
        return false;
    }

    @yfb
    public final jrg getOutputText() {
        C7883b value;
        jrg text;
        i2g<C7883b> i2gVar = this.f50414e;
        return (i2gVar == null || (value = i2gVar.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final hxe getSelectionWedgeAffinity() {
        return (hxe) this.f50416g.getValue();
    }

    @yfb
    public final jrg getUntransformedText() {
        return this.f50410a.getValue$foundation_release();
    }

    @yfb
    public final jrg getVisualText() {
        C7883b value;
        jrg text;
        i2g<C7883b> i2gVar = this.f50415f;
        return (i2gVar == null || (value = i2gVar.getValue()) == null || (text = value.getText()) == null) ? getOutputText() : text;
    }

    public int hashCode() {
        int iHashCode = this.f50410a.hashCode() * 31;
        n72 n72Var = this.f50412c;
        int iHashCode2 = (iHashCode + (n72Var != null ? n72Var.hashCode() : 0)) * 31;
        l9c l9cVar = this.f50413d;
        return iHashCode2 + (l9cVar != null ? l9cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m30513highlightCharsIn7RAjNK8(int i, long j) {
        long jM30515mapFromTransformedGEjPoXI = m30515mapFromTransformedGEjPoXI(j);
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        wsgVar.getMainBuffer$foundation_release().m32034setHighlightK7f2yys(i, jvg.m30593getStartimpl(jM30515mapFromTransformedGEjPoXI), jvg.m30588getEndimpl(jM30515mapFromTransformedGEjPoXI));
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    /* JADX INFO: renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m30514mapFromTransformedjx7JFs(int i) {
        C7883b value;
        C7883b value2;
        i2g<C7883b> i2gVar = this.f50414e;
        ozb offsetMapping = null;
        ozb offsetMapping2 = (i2gVar == null || (value2 = i2gVar.getValue()) == null) ? null : value2.getOffsetMapping();
        i2g<C7883b> i2gVar2 = this.f50415f;
        if (i2gVar2 != null && (value = i2gVar2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM31704mapFromDestjx7JFs = offsetMapping != null ? offsetMapping.m31704mapFromDestjx7JFs(i) : kvg.TextRange(i);
        return offsetMapping2 != null ? f50408h.m30523mapFromTransformedxdX6G0(jM31704mapFromDestjx7JFs, offsetMapping2) : jM31704mapFromDestjx7JFs;
    }

    /* JADX INFO: renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m30515mapFromTransformedGEjPoXI(long j) {
        C7883b value;
        C7883b value2;
        i2g<C7883b> i2gVar = this.f50414e;
        ozb offsetMapping = null;
        ozb offsetMapping2 = (i2gVar == null || (value2 = i2gVar.getValue()) == null) ? null : value2.getOffsetMapping();
        i2g<C7883b> i2gVar2 = this.f50415f;
        if (i2gVar2 != null && (value = i2gVar2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            j = f50408h.m30523mapFromTransformedxdX6G0(j, offsetMapping);
        }
        return offsetMapping2 != null ? f50408h.m30523mapFromTransformedxdX6G0(j, offsetMapping2) : j;
    }

    /* JADX INFO: renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m30516mapToTransformedjx7JFs(int i) {
        C7883b value;
        C7883b value2;
        i2g<C7883b> i2gVar = this.f50414e;
        ozb offsetMapping = null;
        ozb offsetMapping2 = (i2gVar == null || (value2 = i2gVar.getValue()) == null) ? null : value2.getOffsetMapping();
        i2g<C7883b> i2gVar2 = this.f50415f;
        if (i2gVar2 != null && (value = i2gVar2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM31705mapFromSourcejx7JFs = offsetMapping2 != null ? offsetMapping2.m31705mapFromSourcejx7JFs(i) : kvg.TextRange(i);
        return offsetMapping != null ? f50408h.m30524mapToTransformedXGyztTk(jM31705mapFromSourcejx7JFs, offsetMapping, getSelectionWedgeAffinity()) : jM31705mapFromSourcejx7JFs;
    }

    /* JADX INFO: renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m30517mapToTransformedGEjPoXI(long j) {
        C7883b value;
        C7883b value2;
        i2g<C7883b> i2gVar = this.f50414e;
        ozb offsetMapping = null;
        ozb offsetMapping2 = (i2gVar == null || (value2 = i2gVar.getValue()) == null) ? null : value2.getOffsetMapping();
        i2g<C7883b> i2gVar2 = this.f50415f;
        if (i2gVar2 != null && (value = i2gVar2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            j = C7882a.m14072a(f50408h, j, offsetMapping2, null, 4, null);
        }
        return offsetMapping != null ? f50408h.m30524mapToTransformedXGyztTk(j, offsetMapping, getSelectionWedgeAffinity()) : j;
    }

    public final void placeCursorBeforeCharAt(int i) {
        m30519selectCharsIn5zctL8(kvg.TextRange(i));
    }

    public final void redo() {
        this.f50410a.getUndoState().redo();
    }

    public final void replaceAll(@yfb CharSequence charSequence) {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        nw4.deleteAll(mainBuffer$foundation_release);
        nw4.commitText(mainBuffer$foundation_release, charSequence.toString(), 1);
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    public final void replaceSelectedText(@yfb CharSequence charSequence, boolean z, @yfb urg urgVar) {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        if (z) {
            mainBuffer$foundation_release.commitComposition();
        }
        long jM32033getSelectiond9O1mEE = mainBuffer$foundation_release.m32033getSelectiond9O1mEE();
        mainBuffer$foundation_release.replace(jvg.m30591getMinimpl(jM32033getSelectiond9O1mEE), jvg.m30590getMaximpl(jM32033getSelectiond9O1mEE), charSequence);
        int iM30591getMinimpl = jvg.m30591getMinimpl(jM32033getSelectiond9O1mEE) + charSequence.length();
        mainBuffer$foundation_release.setSelection(iM30591getMinimpl, iM30591getMinimpl);
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m30518replaceTextM8tDOmk(@yfb CharSequence charSequence, long j, @yfb urg urgVar, boolean z) {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        long jM30515mapFromTransformedGEjPoXI = m30515mapFromTransformedGEjPoXI(j);
        mainBuffer$foundation_release.replace(jvg.m30591getMinimpl(jM30515mapFromTransformedGEjPoXI), jvg.m30590getMaximpl(jM30515mapFromTransformedGEjPoXI), charSequence);
        int iM30591getMinimpl = jvg.m30591getMinimpl(jM30515mapFromTransformedGEjPoXI) + charSequence.length();
        mainBuffer$foundation_release.setSelection(iM30591getMinimpl, iM30591getMinimpl);
        wsgVar.commitEditAsUser(g48Var, z, urgVar);
    }

    public final void selectAll() {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(0, mainBuffer$foundation_release.getLength());
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    /* JADX INFO: renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m30519selectCharsIn5zctL8(long j) {
        m30520selectUntransformedCharsIn5zctL8(m30515mapFromTransformedGEjPoXI(j));
    }

    /* JADX INFO: renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m30520selectUntransformedCharsIn5zctL8(long j) {
        wsg wsgVar = this.f50410a;
        g48 g48Var = this.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        wsgVar.getMainBuffer$foundation_release().setSelection(jvg.m30593getStartimpl(j), jvg.m30588getEndimpl(j));
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    public final void setSelectionWedgeAffinity(@yfb hxe hxeVar) {
        this.f50416g.setValue(hxeVar);
    }

    @yfb
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f50410a + ", outputTransformation=" + this.f50413d + ", outputTransformedText=" + this.f50414e + ", codepointTransformation=" + this.f50412c + ", codepointTransformedText=" + this.f50415f + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    public final void undo() {
        this.f50410a.getUndoState().undo();
    }

    public final void update(@gib g48 g48Var) {
        this.f50411b = g48Var;
    }

    @do8
    private static final C7883b calculateTransformedText(jrg jrgVar, l9c l9cVar, hxe hxeVar) {
        return f50408h.calculateTransformedText(jrgVar, l9cVar, hxeVar);
    }

    public /* synthetic */ jeh(wsg wsgVar, g48 g48Var, n72 n72Var, l9c l9cVar, int i, jt3 jt3Var) {
        this(wsgVar, (i & 2) != 0 ? null : g48Var, (i & 4) != 0 ? null : n72Var, (i & 8) != 0 ? null : l9cVar);
    }
}
