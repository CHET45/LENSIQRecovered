package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@q64(message = "Use PlatformTextInputModifierNode instead.")
public class stg {

    /* JADX INFO: renamed from: c */
    public static final int f82848c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final wxc f82849a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final AtomicReference<ytg> f82850b = new AtomicReference<>(null);

    public stg(@yfb wxc wxcVar) {
        this.f82849a = wxcVar;
    }

    @gib
    public final ytg getCurrentInputSession$ui_text_release() {
        return this.f82850b.get();
    }

    @q64(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @i2e(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void hideSoftwareKeyboard() {
        this.f82849a.hideSoftwareKeyboard();
    }

    @q64(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @i2e(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text_release() != null) {
            this.f82849a.showSoftwareKeyboard();
        }
    }

    @yfb
    public ytg startInput(@yfb zsg zsgVar, @yfb nw7 nw7Var, @yfb qy6<? super List<? extends lw4>, bth> qy6Var, @yfb qy6<? super mw7, bth> qy6Var2) {
        this.f82849a.startInput(zsgVar, nw7Var, qy6Var, qy6Var2);
        ytg ytgVar = new ytg(this, this.f82849a);
        this.f82850b.set(ytgVar);
        return ytgVar;
    }

    public void stopInput(@yfb ytg ytgVar) {
        if (v7b.m23844a(this.f82850b, ytgVar, null)) {
            this.f82849a.stopInput();
        }
    }

    @vb8
    @p7e({p7e.EnumC10826a.f69935b})
    public final void stopInput() {
        this.f82849a.stopInput();
    }

    @vb8
    @p7e({p7e.EnumC10826a.f69935b})
    public final void startInput() {
        this.f82849a.startInput();
        this.f82850b.set(new ytg(this, this.f82849a));
    }
}
