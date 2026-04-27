package p000;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class el2 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    @yfb
    public final b79 f33312a;

    public el2(@yfb b79 b79Var) {
        this.f33312a = b79Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@yfb View view) {
        e79 linkInteractionListener = this.f33312a.getLinkInteractionListener();
        if (linkInteractionListener != null) {
            linkInteractionListener.onClick(this.f33312a);
        }
    }
}
