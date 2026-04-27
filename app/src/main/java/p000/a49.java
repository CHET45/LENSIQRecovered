package p000;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000.t39;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class a49 implements txc {

    /* JADX INFO: renamed from: n */
    public static final int f363n = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f364a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final v38 f365b;

    /* JADX INFO: renamed from: e */
    @gib
    public z39 f368e;

    /* JADX INFO: renamed from: f */
    @gib
    public osg f369f;

    /* JADX INFO: renamed from: g */
    @gib
    public u8i f370g;

    /* JADX INFO: renamed from: l */
    @gib
    public Rect f375l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final s39 f376m;

    /* JADX INFO: renamed from: c */
    @yfb
    public qy6<? super List<? extends lw4>, bth> f366c = C0054c.f379a;

    /* JADX INFO: renamed from: d */
    @yfb
    public qy6<? super mw7, bth> f367d = C0055d.f380a;

    /* JADX INFO: renamed from: h */
    @yfb
    public zsg f371h = new zsg("", jvg.f52112b.m30598getZerod9O1mEE(), (jvg) null, 4, (jt3) null);

    /* JADX INFO: renamed from: i */
    @yfb
    public nw7 f372i = nw7.f65884h.getDefault();

    /* JADX INFO: renamed from: j */
    @yfb
    public List<WeakReference<jud>> f373j = new ArrayList();

    /* JADX INFO: renamed from: k */
    @yfb
    public final fx8 f374k = hz8.lazy(g39.f38327c, (ny6) new C0052a());

    /* JADX INFO: renamed from: a49$a */
    public static final class C0052a extends tt8 implements ny6<BaseInputConnection> {
        public C0052a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(a49.this.getView(), false);
        }
    }

    /* JADX INFO: renamed from: a49$b */
    public static final class C0053b implements q38 {
        public C0053b() {
        }

        @Override // p000.q38
        public void onConnectionClosed(@yfb jud judVar) {
            int size = a49.this.f373j.size();
            for (int i = 0; i < size; i++) {
                if (md8.areEqual(((WeakReference) a49.this.f373j.get(i)).get(), judVar)) {
                    a49.this.f373j.remove(i);
                    return;
                }
            }
        }

        @Override // p000.q38
        public void onEditCommands(@yfb List<? extends lw4> list) {
            a49.this.f366c.invoke(list);
        }

        @Override // p000.q38
        /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
        public void mo27185onImeActionKlQnJC8(int i) {
            a49.this.f367d.invoke(mw7.m31065boximpl(i));
        }

        @Override // p000.q38
        public void onKeyEvent(@yfb KeyEvent keyEvent) {
            a49.this.getBaseInputConnection().sendKeyEvent(keyEvent);
        }

        @Override // p000.q38
        public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            a49.this.f376m.requestUpdate(z, z2, z3, z4, z5, z6);
        }
    }

    /* JADX INFO: renamed from: a49$c */
    public static final class C0054c extends tt8 implements qy6<List<? extends lw4>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C0054c f379a = new C0054c();

        public C0054c() {
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

    /* JADX INFO: renamed from: a49$d */
    public static final class C0055d extends tt8 implements qy6<mw7, bth> {

        /* JADX INFO: renamed from: a */
        public static final C0055d f380a = new C0055d();

        public C0055d() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mw7 mw7Var) {
            m27186invokeKlQnJC8(mw7Var.m31071unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m27186invokeKlQnJC8(int i) {
        }
    }

    public a49(@yfb View view, @yfb qy6<? super x3a, bth> qy6Var, @yfb v38 v38Var) {
        this.f364a = view;
        this.f365b = v38Var;
        this.f376m = new s39(qy6Var, v38Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.f374k.getValue();
    }

    private final void restartInputImmediately() {
        this.f365b.restartInput();
    }

    @gib
    public final Rect getFocusedRect$foundation_release() {
        return this.f375l;
    }

    @yfb
    public final zsg getState() {
        return this.f371h;
    }

    @yfb
    public final View getView() {
        return this.f364a;
    }

    public final void notifyFocusedRect(@yfb rud rudVar) {
        Rect rect;
        this.f375l = new Rect(p3a.roundToInt(rudVar.getLeft()), p3a.roundToInt(rudVar.getTop()), p3a.roundToInt(rudVar.getRight()), p3a.roundToInt(rudVar.getBottom()));
        if (!this.f373j.isEmpty() || (rect = this.f375l) == null) {
            return;
        }
        this.f364a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void setFocusedRect$foundation_release(@gib Rect rect) {
        this.f375l = rect;
    }

    public final void startInput(@yfb zsg zsgVar, @gib t39.InterfaceC12899a interfaceC12899a, @yfb nw7 nw7Var, @yfb qy6<? super List<? extends lw4>, bth> qy6Var, @yfb qy6<? super mw7, bth> qy6Var2) {
        this.f371h = zsgVar;
        this.f372i = nw7Var;
        this.f366c = qy6Var;
        this.f367d = qy6Var2;
        this.f368e = interfaceC12899a != null ? interfaceC12899a.getLegacyTextFieldState() : null;
        this.f369f = interfaceC12899a != null ? interfaceC12899a.getTextFieldSelectionManager() : null;
        this.f370g = interfaceC12899a != null ? interfaceC12899a.getViewConfiguration() : null;
    }

    public final void updateState(@gib zsg zsgVar, @yfb zsg zsgVar2) {
        boolean z = (jvg.m30586equalsimpl0(this.f371h.m33527getSelectiond9O1mEE(), zsgVar2.m33527getSelectiond9O1mEE()) && md8.areEqual(this.f371h.m33526getCompositionMzsxiRA(), zsgVar2.m33526getCompositionMzsxiRA())) ? false : true;
        this.f371h = zsgVar2;
        int size = this.f373j.size();
        for (int i = 0; i < size; i++) {
            jud judVar = this.f373j.get(i).get();
            if (judVar != null) {
                judVar.setTextFieldValue$foundation_release(zsgVar2);
            }
        }
        this.f376m.invalidate();
        if (md8.areEqual(zsgVar, zsgVar2)) {
            if (z) {
                v38 v38Var = this.f365b;
                int iM30591getMinimpl = jvg.m30591getMinimpl(zsgVar2.m33527getSelectiond9O1mEE());
                int iM30590getMaximpl = jvg.m30590getMaximpl(zsgVar2.m33527getSelectiond9O1mEE());
                jvg jvgVarM33526getCompositionMzsxiRA = this.f371h.m33526getCompositionMzsxiRA();
                int iM30591getMinimpl2 = jvgVarM33526getCompositionMzsxiRA != null ? jvg.m30591getMinimpl(jvgVarM33526getCompositionMzsxiRA.m30597unboximpl()) : -1;
                jvg jvgVarM33526getCompositionMzsxiRA2 = this.f371h.m33526getCompositionMzsxiRA();
                v38Var.updateSelection(iM30591getMinimpl, iM30590getMaximpl, iM30591getMinimpl2, jvgVarM33526getCompositionMzsxiRA2 != null ? jvg.m30590getMaximpl(jvgVarM33526getCompositionMzsxiRA2.m30597unboximpl()) : -1);
                return;
            }
            return;
        }
        if (zsgVar != null && (!md8.areEqual(zsgVar.getText(), zsgVar2.getText()) || (jvg.m30586equalsimpl0(zsgVar.m33527getSelectiond9O1mEE(), zsgVar2.m33527getSelectiond9O1mEE()) && !md8.areEqual(zsgVar.m33526getCompositionMzsxiRA(), zsgVar2.m33526getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.f373j.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jud judVar2 = this.f373j.get(i2).get();
            if (judVar2 != null) {
                judVar2.updateInputState(this.f371h, this.f365b);
            }
        }
    }

    public final void updateTextLayoutResult(@yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb rud rudVar, @yfb rud rudVar2) {
        this.f376m.updateTextLayoutResult(zsgVar, nzbVar, hugVar, rudVar, rudVar2);
    }

    @Override // p000.txc
    @yfb
    public jud createInputConnection(@yfb EditorInfo editorInfo) {
        fx4.m29678updatepLxbY9I$default(editorInfo, this.f371h.getText(), this.f371h.m33527getSelectiond9O1mEE(), this.f372i, null, 8, null);
        u39.updateWithEmojiCompat(editorInfo);
        jud judVar = new jud(this.f371h, new C0053b(), this.f372i.getAutoCorrect(), this.f368e, this.f369f, this.f370g);
        this.f373j.add(new WeakReference<>(judVar));
        return judVar;
    }
}
