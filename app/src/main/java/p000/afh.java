package p000;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public interface afh<R> {

    /* JADX INFO: renamed from: afh$a */
    public interface InterfaceC0213a {
        @hib
        Drawable getCurrentDrawable();

        View getView();

        void setDrawable(Drawable drawable);
    }

    boolean transition(R r, InterfaceC0213a interfaceC0213a);
}
