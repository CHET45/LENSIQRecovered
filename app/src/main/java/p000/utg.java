package p000;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,573:1\n1208#2:574\n1187#2,2:575\n728#3,2:577\n460#3,11:580\n1#4:579\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n116#1:574\n116#1:575,2\n260#1:577,2\n324#1:580,11\n*E\n"})
@q64(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@e0g(parameters = 0)
public final class utg implements wxc {

    /* JADX INFO: renamed from: o */
    public static final int f89112o = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f89113a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u38 f89114b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Executor f89115c;

    /* JADX INFO: renamed from: d */
    public boolean f89116d;

    /* JADX INFO: renamed from: e */
    @yfb
    public qy6<? super List<? extends lw4>, bth> f89117e;

    /* JADX INFO: renamed from: f */
    @yfb
    public qy6<? super mw7, bth> f89118f;

    /* JADX INFO: renamed from: g */
    @yfb
    public zsg f89119g;

    /* JADX INFO: renamed from: h */
    @yfb
    public nw7 f89120h;

    /* JADX INFO: renamed from: i */
    @yfb
    public List<WeakReference<kud>> f89121i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final fx8 f89122j;

    /* JADX INFO: renamed from: k */
    @gib
    public Rect f89123k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final ua3 f89124l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final f7b<EnumC13704a> f89125m;

    /* JADX INFO: renamed from: n */
    @gib
    public Runnable f89126n;

    /* JADX INFO: renamed from: utg$a */
    public enum EnumC13704a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* JADX INFO: renamed from: utg$b */
    public /* synthetic */ class C13705b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89132a;

        static {
            int[] iArr = new int[EnumC13704a.values().length];
            try {
                iArr[EnumC13704a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13704a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13704a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13704a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f89132a = iArr;
        }
    }

    /* JADX INFO: renamed from: utg$c */
    public static final class C13706c extends tt8 implements ny6<BaseInputConnection> {
        public C13706c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(utg.this.getView(), false);
        }
    }

    /* JADX INFO: renamed from: utg$d */
    public static final class C13707d implements p38 {
        public C13707d() {
        }

        @Override // p000.p38
        public void onConnectionClosed(@yfb kud kudVar) {
            int size = utg.this.f89121i.size();
            for (int i = 0; i < size; i++) {
                if (md8.areEqual(((WeakReference) utg.this.f89121i.get(i)).get(), kudVar)) {
                    utg.this.f89121i.remove(i);
                    return;
                }
            }
        }

        @Override // p000.p38
        public void onEditCommands(@yfb List<? extends lw4> list) {
            utg.this.f89117e.invoke(list);
        }

        @Override // p000.p38
        /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
        public void mo31718onImeActionKlQnJC8(int i) {
            utg.this.f89118f.invoke(mw7.m31065boximpl(i));
        }

        @Override // p000.p38
        public void onKeyEvent(@yfb KeyEvent keyEvent) {
            utg.this.getBaseInputConnection().sendKeyEvent(keyEvent);
        }

        @Override // p000.p38
        public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            utg.this.f89124l.requestUpdate(z, z2, z3, z4, z5, z6);
        }
    }

    /* JADX INFO: renamed from: utg$e */
    public static final class C13708e extends tt8 implements qy6<List<? extends lw4>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13708e f89135a = new C13708e();

        public C13708e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(List<? extends lw4> list) {
            invoke2(list);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb List<? extends lw4> list) {
        }
    }

    /* JADX INFO: renamed from: utg$f */
    public static final class C13709f extends tt8 implements qy6<mw7, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13709f f89136a = new C13709f();

        public C13709f() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mw7 mw7Var) {
            m32659invokeKlQnJC8(mw7Var.m31071unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m32659invokeKlQnJC8(int i) {
        }
    }

    /* JADX INFO: renamed from: utg$g */
    public static final class C13710g extends tt8 implements qy6<List<? extends lw4>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13710g f89137a = new C13710g();

        public C13710g() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(List<? extends lw4> list) {
            invoke2(list);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb List<? extends lw4> list) {
        }
    }

    /* JADX INFO: renamed from: utg$h */
    public static final class C13711h extends tt8 implements qy6<mw7, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13711h f89138a = new C13711h();

        public C13711h() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mw7 mw7Var) {
            m32660invokeKlQnJC8(mw7Var.m31071unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m32660invokeKlQnJC8(int i) {
        }
    }

    public utg(@yfb View view, @yfb b5d b5dVar, @yfb u38 u38Var, @yfb Executor executor) {
        this.f89113a = view;
        this.f89114b = u38Var;
        this.f89115c = executor;
        this.f89117e = C13708e.f89135a;
        this.f89118f = C13709f.f89136a;
        this.f89119g = new zsg("", jvg.f52112b.m30598getZerod9O1mEE(), (jvg) null, 4, (jt3) null);
        this.f89120h = nw7.f65884h.getDefault();
        this.f89121i = new ArrayList();
        this.f89122j = hz8.lazy(g39.f38327c, (ny6) new C13706c());
        this.f89124l = new ua3(b5dVar, u38Var);
        this.f89125m = new f7b<>(new EnumC13704a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.f89122j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processInputCommands() {
        jvd.C8121h c8121h = new jvd.C8121h();
        jvd.C8121h c8121h2 = new jvd.C8121h();
        f7b<EnumC13704a> f7bVar = this.f89125m;
        int size = f7bVar.getSize();
        if (size > 0) {
            EnumC13704a[] content = f7bVar.getContent();
            int i = 0;
            do {
                processInputCommands$applyToState(content[i], c8121h, c8121h2);
                i++;
            } while (i < size);
        }
        this.f89125m.clear();
        if (md8.areEqual(c8121h.f52110a, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) c8121h2.f52110a;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (md8.areEqual(c8121h.f52110a, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void processInputCommands$applyToState(EnumC13704a enumC13704a, jvd.C8121h<Boolean> c8121h, jvd.C8121h<Boolean> c8121h2) {
        int i = C13705b.f89132a[enumC13704a.ordinal()];
        if (i == 1) {
            ?? r3 = Boolean.TRUE;
            c8121h.f52110a = r3;
            c8121h2.f52110a = r3;
        } else if (i == 2) {
            ?? r32 = Boolean.FALSE;
            c8121h.f52110a = r32;
            c8121h2.f52110a = r32;
        } else if ((i == 3 || i == 4) && !md8.areEqual(c8121h.f52110a, Boolean.FALSE)) {
            c8121h2.f52110a = Boolean.valueOf(enumC13704a == EnumC13704a.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.f89114b.restartInput();
    }

    private final void sendInputCommand(EnumC13704a enumC13704a) {
        this.f89125m.add(enumC13704a);
        if (this.f89126n == null) {
            Runnable runnable = new Runnable() { // from class: ttg
                @Override // java.lang.Runnable
                public final void run() {
                    utg.sendInputCommand$lambda$1(this.f85917a);
                }
            };
            this.f89115c.execute(runnable);
            this.f89126n = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(utg utgVar) {
        utgVar.f89126n = null;
        utgVar.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z) {
        if (z) {
            this.f89114b.showSoftInput();
        } else {
            this.f89114b.hideSoftInput();
        }
    }

    @gib
    public final InputConnection createInputConnection(@yfb EditorInfo editorInfo) {
        if (!this.f89116d) {
            return null;
        }
        xtg.update(editorInfo, this.f89120h, this.f89119g);
        xtg.updateWithEmojiCompat(editorInfo);
        kud kudVar = new kud(this.f89119g, new C13707d(), this.f89120h.getAutoCorrect());
        this.f89121i.add(new WeakReference<>(kudVar));
        return kudVar;
    }

    @yfb
    public final zsg getState$ui_release() {
        return this.f89119g;
    }

    @yfb
    public final View getView() {
        return this.f89113a;
    }

    @Override // p000.wxc
    public void hideSoftwareKeyboard() {
        sendInputCommand(EnumC13704a.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.f89116d;
    }

    @Override // p000.wxc
    @q64(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(@yfb rud rudVar) {
        Rect rect;
        this.f89123k = new Rect(p3a.roundToInt(rudVar.getLeft()), p3a.roundToInt(rudVar.getTop()), p3a.roundToInt(rudVar.getRight()), p3a.roundToInt(rudVar.getBottom()));
        if (!this.f89121i.isEmpty() || (rect = this.f89123k) == null) {
            return;
        }
        this.f89113a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // p000.wxc
    public void showSoftwareKeyboard() {
        sendInputCommand(EnumC13704a.ShowKeyboard);
    }

    @Override // p000.wxc
    public void startInput(@yfb zsg zsgVar, @yfb nw7 nw7Var, @yfb qy6<? super List<? extends lw4>, bth> qy6Var, @yfb qy6<? super mw7, bth> qy6Var2) {
        this.f89116d = true;
        this.f89119g = zsgVar;
        this.f89120h = nw7Var;
        this.f89117e = qy6Var;
        this.f89118f = qy6Var2;
        sendInputCommand(EnumC13704a.StartInput);
    }

    @Override // p000.wxc
    public void stopInput() {
        this.f89116d = false;
        this.f89117e = C13710g.f89137a;
        this.f89118f = C13711h.f89138a;
        this.f89123k = null;
        sendInputCommand(EnumC13704a.StopInput);
    }

    @Override // p000.wxc
    public void updateState(@gib zsg zsgVar, @yfb zsg zsgVar2) {
        boolean z = (jvg.m30586equalsimpl0(this.f89119g.m33527getSelectiond9O1mEE(), zsgVar2.m33527getSelectiond9O1mEE()) && md8.areEqual(this.f89119g.m33526getCompositionMzsxiRA(), zsgVar2.m33526getCompositionMzsxiRA())) ? false : true;
        this.f89119g = zsgVar2;
        int size = this.f89121i.size();
        for (int i = 0; i < size; i++) {
            kud kudVar = this.f89121i.get(i).get();
            if (kudVar != null) {
                kudVar.setMTextFieldValue$ui_release(zsgVar2);
            }
        }
        this.f89124l.invalidate();
        if (md8.areEqual(zsgVar, zsgVar2)) {
            if (z) {
                u38 u38Var = this.f89114b;
                int iM30591getMinimpl = jvg.m30591getMinimpl(zsgVar2.m33527getSelectiond9O1mEE());
                int iM30590getMaximpl = jvg.m30590getMaximpl(zsgVar2.m33527getSelectiond9O1mEE());
                jvg jvgVarM33526getCompositionMzsxiRA = this.f89119g.m33526getCompositionMzsxiRA();
                int iM30591getMinimpl2 = jvgVarM33526getCompositionMzsxiRA != null ? jvg.m30591getMinimpl(jvgVarM33526getCompositionMzsxiRA.m30597unboximpl()) : -1;
                jvg jvgVarM33526getCompositionMzsxiRA2 = this.f89119g.m33526getCompositionMzsxiRA();
                u38Var.updateSelection(iM30591getMinimpl, iM30590getMaximpl, iM30591getMinimpl2, jvgVarM33526getCompositionMzsxiRA2 != null ? jvg.m30590getMaximpl(jvgVarM33526getCompositionMzsxiRA2.m30597unboximpl()) : -1);
                return;
            }
            return;
        }
        if (zsgVar != null && (!md8.areEqual(zsgVar.getText(), zsgVar2.getText()) || (jvg.m30586equalsimpl0(zsgVar.m33527getSelectiond9O1mEE(), zsgVar2.m33527getSelectiond9O1mEE()) && !md8.areEqual(zsgVar.m33526getCompositionMzsxiRA(), zsgVar2.m33526getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.f89121i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            kud kudVar2 = this.f89121i.get(i2).get();
            if (kudVar2 != null) {
                kudVar2.updateInputState(this.f89119g, this.f89114b);
            }
        }
    }

    @Override // p000.wxc
    public void updateTextLayoutResult(@yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb qy6<? super x3a, bth> qy6Var, @yfb rud rudVar, @yfb rud rudVar2) {
        this.f89124l.updateTextLayoutResult(zsgVar, nzbVar, hugVar, qy6Var, rudVar, rudVar2);
    }

    @Override // p000.wxc
    public void startInput() {
        sendInputCommand(EnumC13704a.StartInput);
    }

    public /* synthetic */ utg(View view, b5d b5dVar, u38 u38Var, Executor executor, int i, jt3 jt3Var) {
        this(view, b5dVar, u38Var, (i & 8) != 0 ? xtg.asExecutor(Choreographer.getInstance()) : executor);
    }

    public utg(@yfb View view, @yfb b5d b5dVar) {
        this(view, b5dVar, new w38(view), null, 8, null);
    }
}
