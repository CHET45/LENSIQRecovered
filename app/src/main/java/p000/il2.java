package p000;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
public abstract class il2 implements hl2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f47336a;

    /* JADX INFO: renamed from: b */
    @gib
    public InputMethodManager f47337b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final uuf f47338c;

    public il2(@yfb View view) {
        this.f47336a = view;
        this.f47338c = new uuf(view);
    }

    private final InputMethodManager createImm() {
        Object systemService = this.f47336a.getContext().getSystemService("input_method");
        md8.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public final View m13160a() {
        return this.f47336a;
    }

    @Override // p000.hl2
    public void acceptStylusHandwritingDelegation() {
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final InputMethodManager m13161b() {
        InputMethodManager inputMethodManager = this.f47337b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManagerCreateImm = createImm();
        this.f47337b = inputMethodManagerCreateImm;
        return inputMethodManagerCreateImm;
    }

    @Override // p000.hl2
    public void hideSoftInput() {
        this.f47338c.hide();
    }

    @Override // p000.hl2
    public void prepareStylusHandwritingDelegation() {
    }

    @Override // p000.hl2
    public void restartInput() {
        m13161b().restartInput(this.f47336a);
    }

    @Override // p000.hl2
    public void showSoftInput() {
        this.f47338c.show();
    }

    @Override // p000.hl2
    public void startStylusHandwriting() {
    }

    @Override // p000.hl2
    public void updateCursorAnchorInfo(@yfb CursorAnchorInfo cursorAnchorInfo) {
        m13161b().updateCursorAnchorInfo(this.f47336a, cursorAnchorInfo);
    }

    @Override // p000.hl2
    public void updateExtractedText(int i, @yfb ExtractedText extractedText) {
        m13161b().updateExtractedText(this.f47336a, i, extractedText);
    }

    @Override // p000.hl2
    public void updateSelection(int i, int i2, int i3, int i4) {
        m13161b().updateSelection(this.f47336a, i, i2, i3, i4);
    }
}
