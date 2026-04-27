package p000;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class x38 implements v38 {

    /* JADX INFO: renamed from: d */
    public static final int f96118d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f96119a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fx8 f96120b = hz8.lazy(g39.f38327c, (ny6) new C14892a());

    /* JADX INFO: renamed from: c */
    @yfb
    public final uuf f96121c;

    /* JADX INFO: renamed from: x38$a */
    public static final class C14892a extends tt8 implements ny6<InputMethodManager> {
        public C14892a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final InputMethodManager invoke() {
            Object systemService = x38.this.f96119a.getContext().getSystemService("input_method");
            md8.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public x38(@yfb View view) {
        this.f96119a = view;
        this.f96121c = new uuf(view);
    }

    private final InputMethodManager getImm() {
        return (InputMethodManager) this.f96120b.getValue();
    }

    @Override // p000.v38
    public void hideSoftInput() {
        this.f96121c.hide();
    }

    @Override // p000.v38
    public boolean isActive() {
        return getImm().isActive(this.f96119a);
    }

    @Override // p000.v38
    public void restartInput() {
        getImm().restartInput(this.f96119a);
    }

    @Override // p000.v38
    public void showSoftInput() {
        this.f96121c.show();
    }

    @Override // p000.v38
    public void startStylusHandwriting() {
        if (Build.VERSION.SDK_INT >= 34) {
            d10.f28205a.startStylusHandwriting(getImm(), this.f96119a);
        }
    }

    @Override // p000.v38
    public void updateCursorAnchorInfo(@yfb CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.f96119a, cursorAnchorInfo);
    }

    @Override // p000.v38
    public void updateExtractedText(int i, @yfb ExtractedText extractedText) {
        getImm().updateExtractedText(this.f96119a, i, extractedText);
    }

    @Override // p000.v38
    public void updateSelection(int i, int i2, int i3, int i4) {
        getImm().updateSelection(this.f96119a, i, i2, i3, i4);
    }
}
