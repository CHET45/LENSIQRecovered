package p000;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import p000.C8529kv;
import p000.wsg;

/* JADX INFO: renamed from: kv */
/* JADX INFO: loaded from: classes.dex */
public final class C8529kv {

    /* JADX INFO: renamed from: a */
    public static final boolean f55392a = false;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f55393b = "AndroidTextInputSession";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String[] f55394c = {"*/*", "image/*", "video/*"};

    /* JADX INFO: renamed from: kv$a */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", m4010f = "AndroidTextInputSession.android.kt", m4011i = {}, m4012l = {59}, m4013m = "platformSpecificTextInputSession", m4014n = {}, m4015s = {})
    public static final class a extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f55395a;

        /* JADX INFO: renamed from: b */
        public int f55396b;

        public a(zy2<? super a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f55395a = obj;
            this.f55396b |= Integer.MIN_VALUE;
            return C8529kv.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kv$b */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", m4010f = "AndroidTextInputSession.android.kt", m4011i = {}, m4012l = {82}, m4013m = "platformSpecificTextInputSession", m4014n = {}, m4015s = {})
    public static final class b extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f55397a;

        /* JADX INFO: renamed from: b */
        public int f55398b;

        public b(zy2<? super b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f55397a = obj;
            this.f55398b |= Integer.MIN_VALUE;
            return C8529kv.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kv$c */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", m4010f = "AndroidTextInputSession.android.kt", m4011i = {}, m4012l = {129}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
    public static final class c extends ugg implements gz6<x13, zy2<?>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ nw7 f55399C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ isd f55400F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ qy6<mw7, bth> f55401H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ u8i f55402L;

        /* JADX INFO: renamed from: a */
        public int f55403a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f55404b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ v6b<bth> f55405c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ jeh f55406d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ lug f55407e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ hl2 f55408f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ xxc f55409m;

        /* JADX INFO: renamed from: kv$c$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", m4010f = "AndroidTextInputSession.android.kt", m4011i = {}, m4012l = {84}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f55410a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jeh f55411b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ hl2 f55412c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jeh jehVar, hl2 hl2Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f55411b = jehVar;
                this.f55412c = hl2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(hl2 hl2Var, jrg jrgVar, jrg jrgVar2, boolean z) {
                long jM30568getSelectiond9O1mEE = jrgVar.m30568getSelectiond9O1mEE();
                long jM30568getSelectiond9O1mEE2 = jrgVar2.m30568getSelectiond9O1mEE();
                jvg jvgVarM30567getCompositionMzsxiRA = jrgVar.m30567getCompositionMzsxiRA();
                jvg jvgVarM30567getCompositionMzsxiRA2 = jrgVar2.m30567getCompositionMzsxiRA();
                if (z && jrgVar.m30567getCompositionMzsxiRA() != null && !jrgVar.contentEquals(jrgVar2)) {
                    hl2Var.restartInput();
                } else {
                    if (jvg.m30586equalsimpl0(jM30568getSelectiond9O1mEE, jM30568getSelectiond9O1mEE2) && md8.areEqual(jvgVarM30567getCompositionMzsxiRA, jvgVarM30567getCompositionMzsxiRA2)) {
                        return;
                    }
                    hl2Var.updateSelection(jvg.m30591getMinimpl(jM30568getSelectiond9O1mEE2), jvg.m30590getMaximpl(jM30568getSelectiond9O1mEE2), jvgVarM30567getCompositionMzsxiRA2 != null ? jvg.m30591getMinimpl(jvgVarM30567getCompositionMzsxiRA2.m30597unboximpl()) : -1, jvgVarM30567getCompositionMzsxiRA2 != null ? jvg.m30590getMaximpl(jvgVarM30567getCompositionMzsxiRA2.m30597unboximpl()) : -1);
                }
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f55411b, this.f55412c, zy2Var);
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
                int i = this.f55410a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    jeh jehVar = this.f55411b;
                    final hl2 hl2Var = this.f55412c;
                    wsg.InterfaceC14790a interfaceC14790a = new wsg.InterfaceC14790a() { // from class: mv
                        @Override // p000.wsg.InterfaceC14790a
                        public final void onChange(jrg jrgVar, jrg jrgVar2, boolean z) {
                            C8529kv.c.a.invokeSuspend$lambda$0(hl2Var, jrgVar, jrgVar2, z);
                        }
                    };
                    this.f55410a = 1;
                    if (jehVar.collectImeNotifications(interfaceC14790a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                throw new us8();
            }
        }

        /* JADX INFO: renamed from: kv$c$b */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", m4010f = "AndroidTextInputSession.android.kt", m4011i = {}, m4012l = {115, 116}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f55413a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ v6b<bth> f55414b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ hl2 f55415c;

            /* JADX INFO: renamed from: kv$c$b$a */
            public static final class a extends tt8 implements qy6<Long, bth> {

                /* JADX INFO: renamed from: a */
                public static final a f55416a = new a();

                public a() {
                    super(1);
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(Long l) {
                    invoke(l.longValue());
                    return bth.f14751a;
                }

                public final void invoke(long j) {
                }
            }

            /* JADX INFO: renamed from: kv$c$b$b, reason: collision with other inner class name */
            public static final class C16460b<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ hl2 f55417a;

                public C16460b(hl2 hl2Var) {
                    this.f55417a = hl2Var;
                }

                @Override // p000.t66
                public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                    return emit((bth) obj, (zy2<? super bth>) zy2Var);
                }

                @gib
                public final Object emit(@yfb bth bthVar, @yfb zy2<? super bth> zy2Var) {
                    this.f55417a.startStylusHandwriting();
                    return bth.f14751a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v6b<bth> v6bVar, hl2 hl2Var, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f55414b = v6bVar;
                this.f55415c = hl2Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f55414b, this.f55415c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f55413a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    a aVar = a.f55416a;
                    this.f55413a = 1;
                    if (sya.withFrameMillis(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                        throw new us8();
                    }
                    y7e.throwOnFailure(obj);
                }
                v6b<bth> v6bVar = this.f55414b;
                C16460b c16460b = new C16460b(this.f55415c);
                this.f55413a = 2;
                if (v6bVar.collect(c16460b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new us8();
            }
        }

        /* JADX INFO: renamed from: kv$c$c, reason: collision with other inner class name */
        public static final class C16461c extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jeh f55418a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16461c(jeh jehVar) {
                super(0);
                this.f55418a = jehVar;
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "createInputConnection(value=\"" + ((Object) this.f55418a.getVisualText()) + "\")";
            }
        }

        /* JADX INFO: renamed from: kv$c$d */
        @dwf({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,211:1\n318#2,2:212\n323#2:229\n261#3,15:214\n*S KotlinDebug\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1\n*L\n137#1:212,2\n137#1:229\n137#1:214,15\n*E\n"})
        public static final class d implements ztg {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jeh f55419a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ hl2 f55420b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qy6<mw7, bth> f55421c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ isd f55422d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ va3 f55423e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ lug f55424f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ u8i f55425g;

            /* JADX WARN: Multi-variable type inference failed */
            public d(jeh jehVar, hl2 hl2Var, qy6<? super mw7, bth> qy6Var, isd isdVar, va3 va3Var, lug lugVar, u8i u8iVar) {
                this.f55419a = jehVar;
                this.f55420b = hl2Var;
                this.f55421c = qy6Var;
                this.f55422d = isdVar;
                this.f55423e = va3Var;
                this.f55424f = lugVar;
                this.f55425g = u8iVar;
            }

            @Override // p000.ztg
            @yfb
            public jrg getText() {
                return this.f55419a.getVisualText();
            }

            @Override // p000.ztg
            public boolean onCommitContent(@yfb sdh sdhVar) {
                isd isdVar = this.f55422d;
                if (isdVar != null) {
                    return isdVar.onCommitContent(sdhVar);
                }
                return false;
            }

            @Override // p000.ztg
            /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
            public void mo30777onImeActionKlQnJC8(int i) {
                qy6<mw7, bth> qy6Var = this.f55421c;
                if (qy6Var != null) {
                    qy6Var.invoke(mw7.m31065boximpl(i));
                }
            }

            @Override // p000.ztg
            public int performHandwritingGesture(@yfb HandwritingGesture handwritingGesture) {
                if (Build.VERSION.SDK_INT >= 34) {
                    return fg7.f36512a.performHandwritingGesture$foundation_release(this.f55419a, handwritingGesture, this.f55424f, this.f55425g);
                }
                return 2;
            }

            @Override // p000.ztg
            public boolean previewHandwritingGesture(@yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib CancellationSignal cancellationSignal) {
                if (Build.VERSION.SDK_INT >= 34) {
                    return fg7.f36512a.previewHandwritingGesture$foundation_release(this.f55419a, previewableHandwritingGesture, this.f55424f, cancellationSignal);
                }
                return false;
            }

            @Override // p000.ztg
            public void requestCursorUpdates(int i) {
                this.f55423e.requestUpdates(i);
            }

            @Override // p000.ztg
            public void requestEdit(@yfb qy6<? super qw4, bth> qy6Var) {
                jeh jehVar = this.f55419a;
                wsg wsgVar = jehVar.f50410a;
                g48 g48Var = jehVar.f50411b;
                urg urgVar = urg.MergeIfPossible;
                wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                qy6Var.invoke(wsgVar.getMainBuffer$foundation_release());
                wsgVar.commitEditAsUser(g48Var, false, urgVar);
            }

            @Override // p000.ztg
            public void sendKeyEvent(@yfb KeyEvent keyEvent) {
                this.f55420b.sendKeyEvent(keyEvent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(v6b<bth> v6bVar, jeh jehVar, lug lugVar, hl2 hl2Var, xxc xxcVar, nw7 nw7Var, isd isdVar, qy6<? super mw7, bth> qy6Var, u8i u8iVar, zy2<? super c> zy2Var) {
            super(2, zy2Var);
            this.f55405c = v6bVar;
            this.f55406d = jehVar;
            this.f55407e = lugVar;
            this.f55408f = hl2Var;
            this.f55409m = xxcVar;
            this.f55399C = nw7Var;
            this.f55400F = isdVar;
            this.f55401H = qy6Var;
            this.f55402L = u8iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputConnection invokeSuspend$lambda$2(jeh jehVar, nw7 nw7Var, isd isdVar, hl2 hl2Var, qy6 qy6Var, va3 va3Var, lug lugVar, u8i u8iVar, EditorInfo editorInfo) {
            C8529kv.m15007a(null, new C16461c(jehVar), 1, null);
            d dVar = new d(jehVar, hl2Var, qy6Var, isdVar, va3Var, lugVar, u8iVar);
            fx4.m29677updatepLxbY9I(editorInfo, jehVar.getVisualText(), jehVar.getVisualText().m30568getSelectiond9O1mEE(), nw7Var, isdVar != null ? C8529kv.f55394c : null);
            return new d3g(dVar, editorInfo);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            c cVar = new c(this.f55405c, this.f55406d, this.f55407e, this.f55408f, this.f55409m, this.f55399C, this.f55400F, this.f55401H, this.f55402L, zy2Var);
            cVar.f55404b = obj;
            return cVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<?> zy2Var) {
            return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f55403a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f55404b;
                fg1.launch$default(x13Var, null, b23.f12444d, new a(this.f55406d, this.f55408f, null), 1, null);
                v6b<bth> v6bVar = this.f55405c;
                if (v6bVar != null) {
                    fg1.launch$default(x13Var, null, null, new b(v6bVar, this.f55408f, null), 3, null);
                }
                final va3 va3Var = new va3(this.f55406d, this.f55407e, this.f55408f, x13Var);
                xxc xxcVar = this.f55409m;
                final jeh jehVar = this.f55406d;
                final nw7 nw7Var = this.f55399C;
                final isd isdVar = this.f55400F;
                final hl2 hl2Var = this.f55408f;
                final qy6<mw7, bth> qy6Var = this.f55401H;
                final lug lugVar = this.f55407e;
                final u8i u8iVar = this.f55402L;
                txc txcVar = new txc() { // from class: lv
                    @Override // p000.txc
                    public final InputConnection createInputConnection(EditorInfo editorInfo) {
                        return C8529kv.c.invokeSuspend$lambda$2(jehVar, nw7Var, isdVar, hl2Var, qy6Var, va3Var, lugVar, u8iVar, editorInfo);
                    }
                };
                this.f55403a = 1;
                if (xxcVar.startInputMethod(txcVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            throw new us8();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15007a(String str, ny6 ny6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = f55393b;
        }
        logDebug(str, ny6Var);
    }

    @fdi
    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final void logDebug(String str, ny6<String> ny6Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object platformSpecificTextInputSession(@p000.yfb p000.xxc r12, @p000.yfb p000.jeh r13, @p000.yfb p000.lug r14, @p000.yfb p000.nw7 r15, @p000.gib p000.isd r16, @p000.gib p000.qy6<? super p000.mw7, p000.bth> r17, @p000.gib p000.v6b<p000.bth> r18, @p000.gib p000.u8i r19, @p000.yfb p000.zy2<?> r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof p000.C8529kv.a
            if (r1 == 0) goto L16
            r1 = r0
            kv$a r1 = (p000.C8529kv.a) r1
            int r2 = r1.f55396b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f55396b = r2
        L14:
            r11 = r1
            goto L1c
        L16:
            kv$a r1 = new kv$a
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r11.f55395a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r11.f55396b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            p000.y7e.throwOnFailure(r0)
            goto L55
        L35:
            p000.y7e.throwOnFailure(r0)
            android.view.View r0 = r12.getView()
            hl2 r8 = p000.ol2.ComposeInputMethodManager(r0)
            r11.f55396b = r3
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r18
            r10 = r19
            java.lang.Object r0 = platformSpecificTextInputSession(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L55
            return r1
        L55:
            us8 r0 = new us8
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8529kv.platformSpecificTextInputSession(xxc, jeh, lug, nw7, isd, qy6, v6b, u8i, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @p000.gib
    @p000.fdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object platformSpecificTextInputSession(@p000.yfb p000.xxc r16, @p000.yfb p000.jeh r17, @p000.yfb p000.lug r18, @p000.yfb p000.nw7 r19, @p000.gib p000.isd r20, @p000.gib p000.qy6<? super p000.mw7, p000.bth> r21, @p000.yfb p000.hl2 r22, @p000.gib p000.v6b<p000.bth> r23, @p000.gib p000.u8i r24, @p000.yfb p000.zy2<?> r25) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof p000.C8529kv.b
            if (r1 == 0) goto L15
            r1 = r0
            kv$b r1 = (p000.C8529kv.b) r1
            int r2 = r1.f55398b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f55398b = r2
            goto L1a
        L15:
            kv$b r1 = new kv$b
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f55397a
            java.lang.Object r2 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r3 = r1.f55398b
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 == r4) goto L2f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            p000.y7e.throwOnFailure(r0)
            goto L58
        L33:
            p000.y7e.throwOnFailure(r0)
            kv$c r0 = new kv$c
            r15 = 0
            r5 = r0
            r6 = r23
            r7 = r17
            r8 = r18
            r9 = r22
            r10 = r16
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f55398b = r4
            java.lang.Object r0 = p000.y13.coroutineScope(r0, r1)
            if (r0 != r2) goto L58
            return r2
        L58:
            us8 r0 = new us8
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8529kv.platformSpecificTextInputSession(xxc, jeh, lug, nw7, isd, qy6, hl2, v6b, u8i, zy2):java.lang.Object");
    }
}
