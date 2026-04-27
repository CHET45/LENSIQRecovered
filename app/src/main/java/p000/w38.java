package p000;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@q64(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public final class w38 implements u38 {

    /* JADX INFO: renamed from: d */
    public static final int f93172d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f93173a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fx8 f93174b = hz8.lazy(g39.f38327c, (ny6) new C14370a());

    /* JADX INFO: renamed from: c */
    @yfb
    public final uuf f93175c;

    /* JADX INFO: renamed from: w38$a */
    public static final class C14370a extends tt8 implements ny6<InputMethodManager> {
        public C14370a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final InputMethodManager invoke() {
            Object systemService = w38.this.f93173a.getContext().getSystemService("input_method");
            md8.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public w38(@yfb View view) {
        this.f93173a = view;
        this.f93175c = new uuf(view);
    }

    private final InputMethodManager getImm() {
        return (InputMethodManager) this.f93174b.getValue();
    }

    @Override // p000.u38
    public void hideSoftInput() {
        this.f93175c.hide();
    }

    @Override // p000.u38
    public boolean isActive() {
        return getImm().isActive(this.f93173a);
    }

    @Override // p000.u38
    public void restartInput() {
        getImm().restartInput(this.f93173a);
    }

    @Override // p000.u38
    public void showSoftInput() {
        this.f93175c.show();
    }

    @Override // p000.u38
    public void updateCursorAnchorInfo(@yfb CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.f93173a, cursorAnchorInfo);
    }

    @Override // p000.u38
    public void updateExtractedText(int i, @yfb ExtractedText extractedText) {
        getImm().updateExtractedText(this.f93173a, i, extractedText);
    }

    @Override // p000.u38
    public void updateSelection(int i, int i2, int i3, int i4) {
        getImm().updateSelection(this.f93173a, i, i2, i3, i4);
    }
}
