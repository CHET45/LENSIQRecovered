package p000;

import org.opencv.videoio.Videoio;
import p000.do6;
import p000.jvg;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1252:1\n148#2:1253\n81#3:1254\n107#3,2:1255\n81#3:1257\n107#3,2:1258\n81#3:1261\n107#3,2:1262\n81#3:1264\n107#3,2:1265\n81#3:1267\n107#3,2:1268\n81#3:1270\n107#3,2:1271\n81#3:1273\n107#3,2:1274\n81#3:1276\n107#3,2:1277\n81#3:1279\n107#3,2:1280\n81#3:1282\n107#3,2:1283\n1#4:1260\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n*L\n883#1:1253\n878#1:1254\n878#1:1255,2\n883#1:1257\n883#1:1258,2\n943#1:1261\n943#1:1262,2\n953#1:1264\n953#1:1265,2\n959#1:1267\n959#1:1268,2\n965#1:1270\n965#1:1271,2\n971#1:1273\n971#1:1274,2\n983#1:1276\n983#1:1277,2\n1015#1:1279\n1015#1:1280,2\n1016#1:1282\n1016#1:1283,2\n*E\n"})
@e0g(parameters = 0)
public final class z39 {

    /* JADX INFO: renamed from: z */
    public static final int f103986z = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public sqg f103987a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final rsd f103988b;

    /* JADX INFO: renamed from: c */
    @gib
    public final suf f103989c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ow4 f103990d = new ow4();

    /* JADX INFO: renamed from: e */
    @gib
    public ytg f103991e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f103992f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final z6b f103993g;

    /* JADX INFO: renamed from: h */
    @gib
    public mv8 f103994h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final z6b<iug> f103995i;

    /* JADX INFO: renamed from: j */
    @gib
    public C9041lz f103996j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final z6b f103997k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final z6b f103998l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final z6b f103999m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final z6b f104000n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final z6b f104001o;

    /* JADX INFO: renamed from: p */
    public boolean f104002p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final z6b f104003q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final rr8 f104004r;

    /* JADX INFO: renamed from: s */
    @yfb
    public qy6<? super zsg, bth> f104005s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final qy6<zsg, bth> f104006t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final qy6<mw7, bth> f104007u;

    /* JADX INFO: renamed from: v */
    @yfb
    public final icc f104008v;

    /* JADX INFO: renamed from: w */
    public long f104009w;

    /* JADX INFO: renamed from: x */
    @yfb
    public final z6b f104010x;

    /* JADX INFO: renamed from: y */
    @yfb
    public final z6b f104011y;

    /* JADX INFO: renamed from: z39$a */
    public static final class C15973a extends tt8 implements qy6<mw7, bth> {
        public C15973a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mw7 mw7Var) {
            m33496invokeKlQnJC8(mw7Var.m31071unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m33496invokeKlQnJC8(int i) {
            z39.this.f104004r.m32165runActionKlQnJC8(i);
        }
    }

    /* JADX INFO: renamed from: z39$b */
    public static final class C15974b extends tt8 implements qy6<zsg, bth> {
        public C15974b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(zsg zsgVar) {
            invoke2(zsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb zsg zsgVar) {
            String text = zsgVar.getText();
            C9041lz untransformedText = z39.this.getUntransformedText();
            if (!md8.areEqual(text, untransformedText != null ? untransformedText.getText() : null)) {
                z39.this.setHandleState(ce7.None);
            }
            z39 z39Var = z39.this;
            jvg.C8123a c8123a = jvg.f52112b;
            z39Var.m33494setSelectionPreviewHighlightRange5zctL8(c8123a.m30598getZerod9O1mEE());
            z39.this.m33491setDeletionPreviewHighlightRange5zctL8(c8123a.m30598getZerod9O1mEE());
            z39.this.f104005s.invoke(zsgVar);
            z39.this.getRecomposeScope().invalidate();
        }
    }

    /* JADX INFO: renamed from: z39$c */
    public static final class C15975c extends tt8 implements qy6<zsg, bth> {

        /* JADX INFO: renamed from: a */
        public static final C15975c f104014a = new C15975c();

        public C15975c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(zsg zsgVar) {
            invoke2(zsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb zsg zsgVar) {
        }
    }

    public z39(@yfb sqg sqgVar, @yfb rsd rsdVar, @gib suf sufVar) {
        this.f103987a = sqgVar;
        this.f103988b = rsdVar;
        this.f103989c = sufVar;
        Boolean bool = Boolean.FALSE;
        this.f103992f = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f103993g = xtf.mutableStateOf$default(kn4.m30703boximpl(kn4.m30705constructorimpl(0)), null, 2, null);
        this.f103995i = xtf.mutableStateOf$default(null, null, 2, null);
        this.f103997k = xtf.mutableStateOf$default(ce7.None, null, 2, null);
        this.f103998l = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f103999m = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f104000n = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f104001o = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f104002p = true;
        this.f104003q = xtf.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f104004r = new rr8(sufVar);
        this.f104005s = C15975c.f104014a;
        this.f104006t = new C15974b();
        this.f104007u = new C15973a();
        this.f104008v = C14793wt.Paint();
        this.f104009w = w82.f93556b.m32987getUnspecified0d7_KjU();
        jvg.C8123a c8123a = jvg.f52112b;
        this.f104010x = xtf.mutableStateOf$default(jvg.m30581boximpl(c8123a.m30598getZerod9O1mEE()), null, 2, null);
        this.f104011y = xtf.mutableStateOf$default(jvg.m30581boximpl(c8123a.m30598getZerod9O1mEE()), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDeletionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m33487getDeletionPreviewHighlightRanged9O1mEE() {
        return ((jvg) this.f104011y.getValue()).m30597unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final ce7 getHandleState() {
        return (ce7) this.f103997k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.f103992f.getValue()).booleanValue();
    }

    @yfb
    public final icc getHighlightPaint() {
        return this.f104008v;
    }

    @gib
    public final ytg getInputSession() {
        return this.f103991e;
    }

    @gib
    public final suf getKeyboardController() {
        return this.f103989c;
    }

    @gib
    public final mv8 getLayoutCoordinates() {
        mv8 mv8Var = this.f103994h;
        if (mv8Var == null || !mv8Var.isAttached()) {
            return null;
        }
        return mv8Var;
    }

    @gib
    public final iug getLayoutResult() {
        return this.f103995i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m33488getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((kn4) this.f103993g.getValue()).m30719unboximpl();
    }

    @yfb
    public final qy6<mw7, bth> getOnImeActionPerformed() {
        return this.f104007u;
    }

    @yfb
    public final qy6<zsg, bth> getOnValueChange() {
        return this.f104006t;
    }

    @yfb
    public final ow4 getProcessor() {
        return this.f103990d;
    }

    @yfb
    public final rsd getRecomposeScope() {
        return this.f103988b;
    }

    /* JADX INFO: renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m33489getSelectionBackgroundColor0d7_KjU() {
        return this.f104009w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSelectionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m33490getSelectionPreviewHighlightRanged9O1mEE() {
        return ((jvg) this.f104010x.getValue()).m30597unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.f104001o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.f103998l.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.f104000n.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.f103999m.getValue()).booleanValue();
    }

    @yfb
    public final sqg getTextDelegate() {
        return this.f103987a;
    }

    @gib
    public final C9041lz getUntransformedText() {
        return this.f103996j;
    }

    public final boolean hasHighlight() {
        return (jvg.m30587getCollapsedimpl(m33490getSelectionPreviewHighlightRanged9O1mEE()) && jvg.m30587getCollapsedimpl(m33487getDeletionPreviewHighlightRanged9O1mEE())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.f104003q.getValue()).booleanValue();
    }

    public final boolean isLayoutResultStale() {
        return this.f104002p;
    }

    /* JADX INFO: renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m33491setDeletionPreviewHighlightRange5zctL8(long j) {
        this.f104011y.setValue(jvg.m30581boximpl(j));
    }

    public final void setHandleState(@yfb ce7 ce7Var) {
        this.f103997k.setValue(ce7Var);
    }

    public final void setHasFocus(boolean z) {
        this.f103992f.setValue(Boolean.valueOf(z));
    }

    public final void setInTouchMode(boolean z) {
        this.f104003q.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(@gib ytg ytgVar) {
        this.f103991e = ytgVar;
    }

    public final void setLayoutCoordinates(@gib mv8 mv8Var) {
        this.f103994h = mv8Var;
    }

    public final void setLayoutResult(@gib iug iugVar) {
        this.f103995i.setValue(iugVar);
        this.f104002p = false;
    }

    /* JADX INFO: renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m33492setMinHeightForSingleLineField0680j_4(float f) {
        this.f103993g.setValue(kn4.m30703boximpl(f));
    }

    /* JADX INFO: renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m33493setSelectionBackgroundColor8_81llA(long j) {
        this.f104009w = j;
    }

    /* JADX INFO: renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m33494setSelectionPreviewHighlightRange5zctL8(long j) {
        this.f104010x.setValue(jvg.m30581boximpl(j));
    }

    public final void setShowCursorHandle(boolean z) {
        this.f104001o.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.f103998l.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.f104000n.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.f103999m.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(@yfb sqg sqgVar) {
        this.f103987a = sqgVar;
    }

    public final void setUntransformedText(@gib C9041lz c9041lz) {
        this.f103996j = c9041lz;
    }

    /* JADX INFO: renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m33495updatefnh65Uc(@yfb C9041lz c9041lz, @yfb C9041lz c9041lz2, @yfb yvg yvgVar, boolean z, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb qy6<? super zsg, bth> qy6Var, @yfb tr8 tr8Var, @yfb um6 um6Var, long j) {
        this.f104005s = qy6Var;
        this.f104009w = j;
        rr8 rr8Var = this.f104004r;
        rr8Var.setKeyboardActions(tr8Var);
        rr8Var.setFocusManager(um6Var);
        this.f103996j = c9041lz;
        sqg sqgVarM32655updateTextDelegaterm0N8CA = uqg.m32655updateTextDelegaterm0N8CA(this.f103987a, c9041lz2, yvgVar, c64Var, interfaceC4891b, (Videoio.CAP_PROP_XI_WB_KR & 32) != 0 ? true : z, (Videoio.CAP_PROP_XI_WB_KR & 64) != 0 ? bvg.f14961b.m28171getClipgIe3tQ8() : 0, (Videoio.CAP_PROP_XI_WB_KR & 128) != 0 ? Integer.MAX_VALUE : 0, (Videoio.CAP_PROP_XI_WB_KR & 256) != 0 ? 1 : 0, l82.emptyList());
        if (this.f103987a != sqgVarM32655updateTextDelegaterm0N8CA) {
            this.f104002p = true;
        }
        this.f103987a = sqgVarM32655updateTextDelegaterm0N8CA;
    }
}
