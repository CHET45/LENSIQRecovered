package p000;

import android.view.KeyEvent;
import androidx.compose.p002ui.focus.C0714c;
import androidx.compose.p002ui.focus.C0725n;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p000.jj8;
import p000.mw7;
import p000.sdh;
import p000.xl7;
import p000.xr8;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,768:1\n1#2:769\n314#3,6:770\n323#3:791\n261#4,15:776\n*S KotlinDebug\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n*L\n619#1:770,6\n619#1:791\n619#1:776,15\n*E\n"})
@e0g(parameters = 0)
public final class qrg extends d44 implements uxc, rxe, gn6, nm6, o77, p2d, xq8, mn2, mxa, sxb, iv8 {

    /* JADX INFO: renamed from: t2 */
    public static final int f75401t2 = 8;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public jeh f75402M1;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public lug f75403V1;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public rsg f75404Z1;

    /* JADX INFO: renamed from: a2 */
    @gib
    public g48 f75405a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f75406b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f75407c2;

    /* JADX INFO: renamed from: d2 */
    @gib
    public qr8 f75408d2;

    /* JADX INFO: renamed from: e2 */
    public boolean f75409e2;

    /* JADX INFO: renamed from: f2 */
    @yfb
    public l5b f75410f2;

    /* JADX INFO: renamed from: g2 */
    @gib
    public v6b<bth> f75411g2;

    /* JADX INFO: renamed from: i2 */
    @yfb
    public final acg f75413i2;

    /* JADX INFO: renamed from: j2 */
    @gib
    public xl7.C15183a f75414j2;

    /* JADX INFO: renamed from: l2 */
    @yfb
    public wr8 f75416l2;

    /* JADX INFO: renamed from: m2 */
    public boolean f75417m2;

    /* JADX INFO: renamed from: n2 */
    @gib
    public sli f75418n2;

    /* JADX INFO: renamed from: o2 */
    @gib
    public jj8 f75419o2;

    /* JADX INFO: renamed from: p2 */
    @yfb
    public final yrg f75420p2;

    /* JADX INFO: renamed from: q2 */
    @yfb
    public final C11654r f75421q2;

    /* JADX INFO: renamed from: r2 */
    @gib
    public jj8 f75422r2;

    /* JADX INFO: renamed from: s2 */
    @yfb
    public final ny6<isd> f75423s2;

    /* JADX INFO: renamed from: h2 */
    @yfb
    public final wgg f75412h2 = (wgg) m8877a(vgg.SuspendingPointerInputModifierNode(new C11659w(null)));

    /* JADX INFO: renamed from: k2 */
    @yfb
    public final vn4 f75415k2 = (vn4) m8877a(trg.textFieldDragAndDropNode(new C11647k(), new C11648l(), new C11649m(), (72 & 8) != 0 ? null : null, (72 & 16) != 0 ? null : new C11650n(), (72 & 32) != 0 ? null : new C11651o(), (72 & 64) != 0 ? null : null, (72 & 128) != 0 ? null : new C11652p(), (72 & 256) != 0 ? null : new C11653q()));

    /* JADX INFO: renamed from: qrg$a */
    public static final class C11637a extends tt8 implements ny6<Boolean> {
        public C11637a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            qrg.this.getTextFieldSelectionState().paste();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$b */
    @dwf({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,768:1\n1#2:769\n*E\n"})
    public static final class C11638b extends tt8 implements qy6<List<hug>, Boolean> {
        public C11638b() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb List<hug> list) {
            hug layoutResult = qrg.this.getTextLayoutState().getLayoutResult();
            return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
        }
    }

    /* JADX INFO: renamed from: qrg$c */
    public static final class C11639c extends tt8 implements qy6<C9041lz, Boolean> {
        public C11639c() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb C9041lz c9041lz) {
            if (!qrg.this.getEditable()) {
                return Boolean.FALSE;
            }
            qrg.this.getTextFieldState().replaceAll(c9041lz);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$d */
    public static final class C11640d extends tt8 implements qy6<C9041lz, Boolean> {
        public C11640d() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb C9041lz c9041lz) {
            if (!qrg.this.getEditable()) {
                return Boolean.FALSE;
            }
            jeh.replaceSelectedText$default(qrg.this.getTextFieldState(), c9041lz, true, null, 4, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$e */
    public static final class C11641e extends tt8 implements kz6<Integer, Integer, Boolean, Boolean> {
        public C11641e() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
        }

        @yfb
        public final Boolean invoke(int i, int i2, boolean z) {
            jrg untransformedText = z ? qrg.this.getTextFieldState().getUntransformedText() : qrg.this.getTextFieldState().getVisualText();
            long jM30568getSelectiond9O1mEE = untransformedText.m30568getSelectiond9O1mEE();
            if (!qrg.this.getEnabled() || Math.min(i, i2) < 0 || Math.max(i, i2) > untransformedText.length()) {
                return Boolean.FALSE;
            }
            if (i == jvg.m30593getStartimpl(jM30568getSelectiond9O1mEE) && i2 == jvg.m30588getEndimpl(jM30568getSelectiond9O1mEE)) {
                return Boolean.TRUE;
            }
            long jTextRange = kvg.TextRange(i, i2);
            if (z || i == i2) {
                qrg.this.getTextFieldSelectionState().updateTextToolbarState(cwg.None);
            } else {
                qrg.this.getTextFieldSelectionState().updateTextToolbarState(cwg.Selection);
            }
            if (z) {
                qrg.this.getTextFieldState().m30520selectUntransformedCharsIn5zctL8(jTextRange);
            } else {
                qrg.this.getTextFieldState().m30519selectCharsIn5zctL8(jTextRange);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$f */
    public static final class C11642f extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f75430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11642f(int i) {
            super(0);
            this.f75430b = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            qrg.this.m31987onImeActionPerformedKlQnJC8(this.f75430b);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$g */
    public static final class C11643g extends tt8 implements ny6<Boolean> {
        public C11643g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            if (!qrg.this.isFocused()) {
                C0725n.requestFocus(qrg.this);
            } else if (!qrg.this.getReadOnly()) {
                qrg.this.requireKeyboardController().show();
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$h */
    public static final class C11644h extends tt8 implements ny6<Boolean> {
        public C11644h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            if (!qrg.this.isFocused()) {
                C0725n.requestFocus(qrg.this);
            }
            qrg.this.getTextFieldSelectionState().updateTextToolbarState(cwg.Selection);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$i */
    public static final class C11645i extends tt8 implements ny6<Boolean> {
        public C11645i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            rsg.copy$default(qrg.this.getTextFieldSelectionState(), false, 1, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$j */
    public static final class C11646j extends tt8 implements ny6<Boolean> {
        public C11646j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            qrg.this.getTextFieldSelectionState().cut();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$k */
    public static final class C11647k extends tt8 implements ny6<Set<? extends xpa>> {
        public C11647k() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final Set<? extends xpa> invoke() {
            return ksd.getReceiveContentConfiguration(qrg.this) != null ? prg.f71776b : prg.f71775a;
        }
    }

    /* JADX INFO: renamed from: qrg$l */
    @dwf({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,768:1\n1#2:769\n*E\n"})
    public static final class C11648l extends tt8 implements gz6<u42, w42, Boolean> {
        public C11648l() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final Boolean invoke(@yfb u42 u42Var, @yfb w42 w42Var) {
            u42 clipEntry;
            qrg.this.emitDragExitEvent();
            qrg.this.getTextFieldSelectionState().clearHandleDragging();
            String plainText = tdh.readPlainText(u42Var);
            isd receiveContentConfiguration = ksd.getReceiveContentConfiguration(qrg.this);
            if (receiveContentConfiguration != null) {
                sdh sdhVarOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new sdh(u42Var, w42Var, sdh.C12541a.f81504b.m32308getDragAndDropkB6V9T0(), null, 8, null));
                plainText = (sdhVarOnReceive == null || (clipEntry = sdhVarOnReceive.getClipEntry()) == null) ? null : tdh.readPlainText(clipEntry);
            }
            String str = plainText;
            if (str != null) {
                jeh.replaceSelectedText$default(qrg.this.getTextFieldState(), str, false, null, 6, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: qrg$m */
    public static final class C11649m extends tt8 implements qy6<tn4, bth> {
        public C11649m() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(tn4 tn4Var) {
            invoke2(tn4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb tn4 tn4Var) {
            if (ksd.getReceiveContentConfiguration(qrg.this) != null) {
                zn4.dragAndDropRequestPermission(qrg.this, tn4Var);
            }
        }
    }

    /* JADX INFO: renamed from: qrg$n */
    public static final class C11650n extends tt8 implements qy6<tn4, bth> {
        public C11650n() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(tn4 tn4Var) {
            invoke2(tn4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb tn4 tn4Var) {
            nsd receiveContentListener;
            qrg qrgVar = qrg.this;
            xl7.C15183a c15183a = new xl7.C15183a();
            qrg.this.getInteractionSource().tryEmit(c15183a);
            qrgVar.f75414j2 = c15183a;
            isd receiveContentConfiguration = ksd.getReceiveContentConfiguration(qrg.this);
            if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                return;
            }
            receiveContentListener.onDragEnter();
        }
    }

    /* JADX INFO: renamed from: qrg$o */
    public static final class C11651o extends tt8 implements qy6<izb, bth> {
        public C11651o() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m31988invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m31988invokek4lQ0M(long j) {
            long jM31052fromWindowToDecorationUv8p0NA = mug.m31052fromWindowToDecorationUv8p0NA(qrg.this.getTextLayoutState(), j);
            qrg.this.getTextFieldState().m30519selectCharsIn5zctL8(kvg.TextRange(lug.m30893getOffsetForPosition3MmeM6k$default(qrg.this.getTextLayoutState(), jM31052fromWindowToDecorationUv8p0NA, false, 2, null)));
            qrg.this.getTextFieldSelectionState().m32189updateHandleDraggingUv8p0NA(zd7.Cursor, jM31052fromWindowToDecorationUv8p0NA);
        }
    }

    /* JADX INFO: renamed from: qrg$p */
    public static final class C11652p extends tt8 implements qy6<tn4, bth> {
        public C11652p() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(tn4 tn4Var) {
            invoke2(tn4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb tn4 tn4Var) {
            nsd receiveContentListener;
            qrg.this.emitDragExitEvent();
            qrg.this.getTextFieldSelectionState().clearHandleDragging();
            isd receiveContentConfiguration = ksd.getReceiveContentConfiguration(qrg.this);
            if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                return;
            }
            receiveContentListener.onDragExit();
        }
    }

    /* JADX INFO: renamed from: qrg$q */
    public static final class C11653q extends tt8 implements qy6<tn4, bth> {
        public C11653q() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(tn4 tn4Var) {
            invoke2(tn4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb tn4 tn4Var) {
            qrg.this.emitDragExitEvent();
        }
    }

    /* JADX INFO: renamed from: qrg$r */
    public static final class C11654r implements sr8 {
        public C11654r() {
        }

        private final um6 getFocusManager() {
            return (um6) nn2.currentValueOf(qrg.this, sn2.getLocalFocusManager());
        }

        @Override // p000.sr8
        /* JADX INFO: renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
        public void mo31989defaultKeyboardActionKlQnJC8(int i) {
            mw7.C9571a c9571a = mw7.f62552b;
            if (mw7.m31068equalsimpl0(i, c9571a.m31084getNexteUduSuo())) {
                getFocusManager().mo27519moveFocus3ESFkO8(C0714c.f5215b.m27538getNextdhqQ8s());
            } else if (mw7.m31068equalsimpl0(i, c9571a.m31086getPreviouseUduSuo())) {
                getFocusManager().mo27519moveFocus3ESFkO8(C0714c.f5215b.m27539getPreviousdhqQ8s());
            } else if (mw7.m31068equalsimpl0(i, c9571a.m31082getDoneeUduSuo())) {
                qrg.this.requireKeyboardController().hide();
            }
        }
    }

    /* JADX INFO: renamed from: qrg$s */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {634}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11655s extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f75443a;

        public C11655s(zy2<? super C11655s> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return qrg.this.new C11655s(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11655s) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f75443a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                rsg textFieldSelectionState = qrg.this.getTextFieldSelectionState();
                this.f75443a = 1;
                if (textFieldSelectionState.observeChanges(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: qrg$t */
    public static final class C11656t extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f75446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11656t(int i) {
            super(0);
            this.f75446b = i;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            qrg.this.f75421q2.mo31989defaultKeyboardActionKlQnJC8(this.f75446b);
        }
    }

    /* JADX INFO: renamed from: qrg$u */
    public static final class C11657u extends tt8 implements ny6<bth> {
        public C11657u() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            qrg qrgVar = qrg.this;
            qrgVar.m31987onImeActionPerformedKlQnJC8(qrgVar.getKeyboardOptions().m33109getImeActionOrDefaulteUduSuo$foundation_release());
        }
    }

    /* JADX INFO: renamed from: qrg$v */
    public static final class C11658v extends tt8 implements ny6<bth> {
        public C11658v() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            qrg qrgVar = qrg.this;
            qrgVar.f75418n2 = (sli) nn2.currentValueOf(qrgVar, sn2.getLocalWindowInfo());
            qrg.this.onFocusChange();
        }
    }

    /* JADX INFO: renamed from: qrg$w */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {201}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11659w extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f75449a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f75450b;

        /* JADX INFO: renamed from: qrg$w$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f75452a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f75453b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qrg f75454c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ s2d f75455d;

            /* JADX INFO: renamed from: qrg$w$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {208}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class C16503a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f75456a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rsg f75457b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ s2d f75458c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16503a(rsg rsgVar, s2d s2dVar, zy2<? super C16503a> zy2Var) {
                    super(2, zy2Var);
                    this.f75457b = rsgVar;
                    this.f75458c = s2dVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new C16503a(this.f75457b, this.f75458c, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((C16503a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f75456a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        rsg rsgVar = this.f75457b;
                        s2d s2dVar = this.f75458c;
                        this.f75456a = 1;
                        if (rsgVar.detectTouchMode(s2dVar, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: qrg$w$a$b */
            @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {211}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f75459a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qrg f75460b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ rsg f75461c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ s2d f75462d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ny6<bth> f75463e;

                /* JADX INFO: renamed from: qrg$w$a$b$a, reason: collision with other inner class name */
                public static final class C16504a extends tt8 implements ny6<bth> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ qrg f75464a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16504a(qrg qrgVar) {
                        super(0);
                        this.f75464a = qrgVar;
                    }

                    @Override // p000.ny6
                    public /* bridge */ /* synthetic */ bth invoke() {
                        invoke2();
                        return bth.f14751a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (this.f75464a.f75422r2 != null) {
                            this.f75464a.requireKeyboardController().show();
                        } else {
                            this.f75464a.startInputSession(true);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(qrg qrgVar, rsg rsgVar, s2d s2dVar, ny6<bth> ny6Var, zy2<? super b> zy2Var) {
                    super(2, zy2Var);
                    this.f75460b = qrgVar;
                    this.f75461c = rsgVar;
                    this.f75462d = s2dVar;
                    this.f75463e = ny6Var;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new b(this.f75460b, this.f75461c, this.f75462d, this.f75463e, zy2Var);
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
                    int i = this.f75459a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        l5b interactionSource = this.f75460b.getInteractionSource();
                        rsg rsgVar = this.f75461c;
                        s2d s2dVar = this.f75462d;
                        ny6<bth> ny6Var = this.f75463e;
                        C16504a c16504a = new C16504a(this.f75460b);
                        this.f75459a = 1;
                        if (rsgVar.detectTextFieldTapGestures(s2dVar, interactionSource, ny6Var, c16504a, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: qrg$w$a$c */
            @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {225}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f75465a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rsg f75466b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ s2d f75467c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ny6<bth> f75468d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(rsg rsgVar, s2d s2dVar, ny6<bth> ny6Var, zy2<? super c> zy2Var) {
                    super(2, zy2Var);
                    this.f75466b = rsgVar;
                    this.f75467c = s2dVar;
                    this.f75468d = ny6Var;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new c(this.f75466b, this.f75467c, this.f75468d, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f75465a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        rsg rsgVar = this.f75466b;
                        s2d s2dVar = this.f75467c;
                        ny6<bth> ny6Var = this.f75468d;
                        this.f75465a = 1;
                        if (rsgVar.textFieldSelectionGestures(s2dVar, ny6Var, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: qrg$w$a$d */
            public static final class d extends tt8 implements ny6<bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rsg f75469a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qrg f75470b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(rsg rsgVar, qrg qrgVar) {
                    super(0);
                    this.f75469a = rsgVar;
                    this.f75470b = qrgVar;
                }

                @Override // p000.ny6
                public /* bridge */ /* synthetic */ bth invoke() {
                    invoke2();
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.f75469a.isFocused()) {
                        return;
                    }
                    C0725n.requestFocus(this.f75470b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qrg qrgVar, s2d s2dVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f75454c = qrgVar;
                this.f75455d = s2dVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f75454c, this.f75455d, zy2Var);
                aVar.f75453b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f75452a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f75453b;
                rsg textFieldSelectionState = this.f75454c.getTextFieldSelectionState();
                qrg qrgVar = this.f75454c;
                s2d s2dVar = this.f75455d;
                d dVar = new d(textFieldSelectionState, qrgVar);
                b23 b23Var = b23.f12444d;
                fg1.launch$default(x13Var, null, b23Var, new C16503a(textFieldSelectionState, s2dVar, null), 1, null);
                fg1.launch$default(x13Var, null, b23Var, new b(qrgVar, textFieldSelectionState, s2dVar, dVar, null), 1, null);
                fg1.launch$default(x13Var, null, b23Var, new c(textFieldSelectionState, s2dVar, dVar, null), 1, null);
                return bth.f14751a;
            }
        }

        public C11659w(zy2<? super C11659w> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C11659w c11659w = qrg.this.new C11659w(zy2Var);
            c11659w.f75450b = obj;
            return c11659w;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C11659w) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f75449a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a(qrg.this, (s2d) this.f75450b, null);
                this.f75449a = 1;
                if (y13.coroutineScope(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: qrg$x */
    public static final class C11660x extends tt8 implements ny6<isd> {
        public C11660x() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final isd invoke() {
            return ksd.getReceiveContentConfiguration(qrg.this);
        }
    }

    /* JADX INFO: renamed from: qrg$y */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {ymh.InterfaceC15729h.f102277q}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11661y extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f75472a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ isd f75474c;

        /* JADX INFO: renamed from: qrg$y$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", m4010f = "TextFieldDecoratorModifier.kt", m4011i = {}, m4012l = {708}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<yxc, zy2<?>, Object> {

            /* JADX INFO: renamed from: a */
            public int f75475a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f75476b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qrg f75477c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ isd f75478d;

            /* JADX INFO: renamed from: qrg$y$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C16505a extends n07 implements qy6<mw7, bth> {
                public C16505a(Object obj) {
                    super(1, obj, qrg.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(mw7 mw7Var) {
                    m31990invokeKlQnJC8(mw7Var.m31071unboximpl());
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m31990invokeKlQnJC8(int i) {
                    ((qrg) this.receiver).m31987onImeActionPerformedKlQnJC8(i);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qrg qrgVar, isd isdVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f75477c = qrgVar;
                this.f75478d = isdVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f75477c, this.f75478d, zy2Var);
                aVar.f75476b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb yxc yxcVar, @gib zy2<?> zy2Var) {
                return ((a) create(yxcVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f75475a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    yxc yxcVar = (yxc) this.f75476b;
                    jeh textFieldState = this.f75477c.getTextFieldState();
                    lug textLayoutState = this.f75477c.getTextLayoutState();
                    nw7 imeOptions$foundation_release = this.f75477c.getKeyboardOptions().toImeOptions$foundation_release(this.f75477c.getSingleLine());
                    isd isdVar = this.f75478d;
                    C16505a c16505a = new C16505a(this.f75477c);
                    v6b stylusHandwritingTrigger = this.f75477c.getStylusHandwritingTrigger();
                    u8i u8iVar = (u8i) nn2.currentValueOf(this.f75477c, sn2.getLocalViewConfiguration());
                    this.f75475a = 1;
                    if (C8529kv.platformSpecificTextInputSession(yxcVar, textFieldState, textLayoutState, imeOptions$foundation_release, isdVar, c16505a, stylusHandwritingTrigger, u8iVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11661y(isd isdVar, zy2<? super C11661y> zy2Var) {
            super(2, zy2Var);
            this.f75474c = isdVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return qrg.this.new C11661y(this.f75474c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11661y) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f75472a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                qrg qrgVar = qrg.this;
                a aVar = new a(qrgVar, this.f75474c, null);
                this.f75472a = 1;
                if (vxc.establishTextInputSession(qrgVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: qrg$z */
    public static final class C11662z extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ wr8 f75480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11662z(wr8 wr8Var) {
            super(0);
            this.f75480b = wr8Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            v6b stylusHandwritingTrigger;
            if (!qrg.this.isFocused()) {
                C0725n.requestFocus(qrg.this);
            }
            int iM33110getKeyboardTypePjHm6EE = this.f75480b.m33110getKeyboardTypePjHm6EE();
            xr8.C15260a c15260a = xr8.f99029b;
            if (!xr8.m33241equalsimpl0(iM33110getKeyboardTypePjHm6EE, c15260a.m33260getPasswordPjHm6EE()) && !xr8.m33241equalsimpl0(this.f75480b.m33110getKeyboardTypePjHm6EE(), c15260a.m33259getNumberPasswordPjHm6EE()) && (stylusHandwritingTrigger = qrg.this.getStylusHandwritingTrigger()) != null) {
                stylusHandwritingTrigger.tryEmit(bth.f14751a);
            }
            return Boolean.TRUE;
        }
    }

    public qrg(@yfb jeh jehVar, @yfb lug lugVar, @yfb rsg rsgVar, @gib g48 g48Var, boolean z, boolean z2, @yfb wr8 wr8Var, @gib qr8 qr8Var, boolean z3, @yfb l5b l5bVar) {
        this.f75402M1 = jehVar;
        this.f75403V1 = lugVar;
        this.f75404Z1 = rsgVar;
        this.f75405a2 = g48Var;
        this.f75406b2 = z;
        this.f75407c2 = z2;
        this.f75408d2 = qr8Var;
        this.f75409e2 = z3;
        this.f75410f2 = l5bVar;
        this.f75413i2 = (acg) m8877a(new acg(new C11662z(wr8Var)));
        g48 g48Var2 = this.f75405a2;
        this.f75416l2 = wr8Var.fillUnspecifiedValuesWith$foundation_release(g48Var2 != null ? g48Var2.getKeyboardOptions() : null);
        this.f75420p2 = zrg.createTextFieldKeyEventHandler();
        this.f75421q2 = new C11654r();
        this.f75423s2 = new C11660x();
    }

    private final void disposeInputSession() {
        jj8 jj8Var = this.f75422r2;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        this.f75422r2 = null;
        v6b<bth> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.resetReplayCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDragExitEvent() {
        xl7.C15183a c15183a = this.f75414j2;
        if (c15183a != null) {
            this.f75410f2.tryEmit(new xl7.C15184b(c15183a));
            this.f75414j2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEditable() {
        return this.f75406b2 && !this.f75407c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v6b<bth> getStylusHandwritingTrigger() {
        v6b<bth> v6bVar = this.f75411g2;
        if (v6bVar != null) {
            return v6bVar;
        }
        if (!ccg.isStylusHandwritingSupported()) {
            return null;
        }
        v6b<bth> v6bVarMutableSharedFlow$default = s9f.MutableSharedFlow$default(1, 0, gf1.f39659c, 2, null);
        this.f75411g2 = v6bVarMutableSharedFlow$default;
        return v6bVarMutableSharedFlow$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        sli sliVar = this.f75418n2;
        return this.f75417m2 && (sliVar != null && sliVar.isWindowFocused());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        this.f75404Z1.setFocused(isFocused());
        if (isFocused() && this.f75419o2 == null) {
            this.f75419o2 = fg1.launch$default(getCoroutineScope(), null, null, new C11655s(null), 3, null);
        } else {
            if (isFocused()) {
                return;
            }
            jj8 jj8Var = this.f75419o2;
            if (jj8Var != null) {
                jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
            }
            this.f75419o2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m31987onImeActionPerformedKlQnJC8(int i) {
        qr8 qr8Var;
        mw7.C9571a c9571a = mw7.f62552b;
        if (mw7.m31068equalsimpl0(i, c9571a.m31085getNoneeUduSuo()) || mw7.m31068equalsimpl0(i, c9571a.m31081getDefaulteUduSuo()) || (qr8Var = this.f75408d2) == null) {
            this.f75421q2.mo31989defaultKeyboardActionKlQnJC8(i);
        } else if (qr8Var != null) {
            qr8Var.onKeyboardAction(new C11656t(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final suf requireKeyboardController() {
        suf sufVar = (suf) nn2.currentValueOf(this, sn2.getLocalSoftwareKeyboardController());
        if (sufVar != null) {
            return sufVar;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean z) {
        if (z || this.f75416l2.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            this.f75422r2 = fg1.launch$default(getCoroutineScope(), null, null, new C11661y(ksd.getReceiveContentConfiguration(this), null), 3, null);
        }
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        jrg outputText = this.f75402M1.getOutputText();
        long jM30568getSelectiond9O1mEE = outputText.m30568getSelectiond9O1mEE();
        bye.setEditableText(eyeVar, new C9041lz(outputText.toString(), null, null, 6, null));
        bye.m28186setTextSelectionRangeFDrldGo(eyeVar, jM30568getSelectiond9O1mEE);
        if (!this.f75406b2) {
            bye.disabled(eyeVar);
        }
        bye.setEditable(eyeVar, getEditable());
        bye.getTextLayoutResult$default(eyeVar, null, new C11638b(), 1, null);
        if (getEditable()) {
            bye.setText$default(eyeVar, null, new C11639c(), 1, null);
            bye.insertTextAtCursor$default(eyeVar, null, new C11640d(), 1, null);
        }
        bye.setSelection$default(eyeVar, null, new C11641e(), 1, null);
        int iM33109getImeActionOrDefaulteUduSuo$foundation_release = this.f75416l2.m33109getImeActionOrDefaulteUduSuo$foundation_release();
        bye.m28181onImeAction9UiTYpY$default(eyeVar, iM33109getImeActionOrDefaulteUduSuo$foundation_release, null, new C11642f(iM33109getImeActionOrDefaulteUduSuo$foundation_release), 2, null);
        bye.onClick$default(eyeVar, null, new C11643g(), 1, null);
        bye.onLongClick$default(eyeVar, null, new C11644h(), 1, null);
        if (!jvg.m30587getCollapsedimpl(jM30568getSelectiond9O1mEE)) {
            bye.copyText$default(eyeVar, null, new C11645i(), 1, null);
            if (this.f75406b2 && !this.f75407c2) {
                bye.cutText$default(eyeVar, null, new C11646j(), 1, null);
            }
        }
        if (getEditable()) {
            bye.pasteText$default(eyeVar, null, new C11637a(), 1, null);
        }
        g48 g48Var = this.f75405a2;
        if (g48Var != null) {
            g48Var.applySemantics(eyeVar);
        }
    }

    public final boolean getEnabled() {
        return this.f75406b2;
    }

    @gib
    public final g48 getFilter() {
        return this.f75405a2;
    }

    @yfb
    public final l5b getInteractionSource() {
        return this.f75410f2;
    }

    @gib
    public final qr8 getKeyboardActionHandler() {
        return this.f75408d2;
    }

    @yfb
    public final wr8 getKeyboardOptions() {
        return this.f75416l2;
    }

    public final boolean getReadOnly() {
        return this.f75407c2;
    }

    @Override // p000.rxe
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.f75409e2;
    }

    @yfb
    public final rsg getTextFieldSelectionState() {
        return this.f75404Z1;
    }

    @yfb
    public final jeh getTextFieldState() {
        return this.f75402M1;
    }

    @yfb
    public final lug getTextLayoutState() {
        return this.f75403V1;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        onObservedReadsChanged();
        this.f75404Z1.setReceiveContentConfiguration(this.f75423s2);
    }

    @Override // p000.p2d
    public void onCancelPointerInput() {
        this.f75413i2.onCancelPointerInput();
        this.f75412h2.onCancelPointerInput();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        disposeInputSession();
        this.f75404Z1.setReceiveContentConfiguration(null);
    }

    @Override // p000.nm6
    public void onFocusEvent(@yfb in6 in6Var) {
        if (this.f75417m2 == in6Var.isFocused()) {
            return;
        }
        this.f75417m2 = in6Var.isFocused();
        onFocusChange();
        if (!in6Var.isFocused()) {
            disposeInputSession();
            jeh jehVar = this.f75402M1;
            wsg wsgVar = jehVar.f50410a;
            g48 g48Var = jehVar.f50411b;
            urg urgVar = urg.MergeIfPossible;
            wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
            nw4.finishComposingText(wsgVar.getMainBuffer$foundation_release());
            wsgVar.commitEditAsUser(g48Var, true, urgVar);
            this.f75402M1.collapseSelectionToMax();
        } else if (getEditable()) {
            startInputSession(false);
        }
        this.f75413i2.onFocusEvent(in6Var);
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        this.f75403V1.setDecoratorNodeCoordinates(mv8Var);
    }

    @Override // p000.xq8
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public boolean mo27341onKeyEventZmokQxo(@yfb KeyEvent keyEvent) {
        return this.f75420p2.mo30410onKeyEvent6ptp14s(keyEvent, this.f75402M1, this.f75403V1, this.f75404Z1, this.f75406b2 && !this.f75407c2, this.f75409e2, new C11657u());
    }

    @Override // p000.sxb
    public void onObservedReadsChanged() {
        txb.observeReads(this, new C11658v());
    }

    @Override // p000.p2d
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo27219onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
        this.f75413i2.mo27219onPointerEventH0pRuoY(t1dVar, v1dVar, j);
        this.f75412h2.mo27219onPointerEventH0pRuoY(t1dVar, v1dVar, j);
    }

    @Override // p000.xq8
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo27342onPreKeyEventZmokQxo(@yfb KeyEvent keyEvent) {
        return this.f75420p2.mo30411onPreKeyEventMyFupTE(keyEvent, this.f75402M1, this.f75404Z1, (um6) nn2.currentValueOf(this, sn2.getLocalFocusManager()), requireKeyboardController());
    }

    public final void setEnabled(boolean z) {
        this.f75406b2 = z;
    }

    public final void setFilter(@gib g48 g48Var) {
        this.f75405a2 = g48Var;
    }

    public final void setInteractionSource(@yfb l5b l5bVar) {
        this.f75410f2 = l5bVar;
    }

    public final void setKeyboardActionHandler(@gib qr8 qr8Var) {
        this.f75408d2 = qr8Var;
    }

    public final void setReadOnly(boolean z) {
        this.f75407c2 = z;
    }

    public final void setSingleLine(boolean z) {
        this.f75409e2 = z;
    }

    public final void setTextFieldSelectionState(@yfb rsg rsgVar) {
        this.f75404Z1 = rsgVar;
    }

    public final void setTextFieldState(@yfb jeh jehVar) {
        this.f75402M1 = jehVar;
    }

    public final void setTextLayoutState(@yfb lug lugVar) {
        this.f75403V1 = lugVar;
    }

    public final void updateNode(@yfb jeh jehVar, @yfb lug lugVar, @yfb rsg rsgVar, @gib g48 g48Var, boolean z, boolean z2, @yfb wr8 wr8Var, @gib qr8 qr8Var, boolean z3, @yfb l5b l5bVar) {
        boolean z4 = this.f75406b2;
        boolean z5 = z4 && !this.f75407c2;
        boolean z6 = z && !z2;
        jeh jehVar2 = this.f75402M1;
        wr8 wr8Var2 = this.f75416l2;
        rsg rsgVar2 = this.f75404Z1;
        l5b l5bVar2 = this.f75410f2;
        this.f75402M1 = jehVar;
        this.f75403V1 = lugVar;
        this.f75404Z1 = rsgVar;
        this.f75405a2 = g48Var;
        this.f75406b2 = z;
        this.f75407c2 = z2;
        this.f75416l2 = wr8Var.fillUnspecifiedValuesWith$foundation_release(g48Var != null ? g48Var.getKeyboardOptions() : null);
        this.f75408d2 = qr8Var;
        this.f75409e2 = z3;
        this.f75410f2 = l5bVar;
        if (z6 != z5 || !md8.areEqual(jehVar, jehVar2) || !md8.areEqual(this.f75416l2, wr8Var2)) {
            if (z6 && isFocused()) {
                startInputSession(false);
            } else if (!z6) {
                disposeInputSession();
            }
        }
        if (z4 != z) {
            sxe.invalidateSemantics(this);
        }
        if (!md8.areEqual(rsgVar, rsgVar2)) {
            this.f75412h2.resetPointerInputHandler();
            this.f75413i2.resetPointerInputHandler();
            if (isAttached()) {
                rsgVar.setReceiveContentConfiguration(this.f75423s2);
            }
        }
        if (md8.areEqual(l5bVar, l5bVar2)) {
            return;
        }
        this.f75412h2.resetPointerInputHandler();
        this.f75413i2.resetPointerInputHandler();
    }
}
