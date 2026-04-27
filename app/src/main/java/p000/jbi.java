package p000;

import android.view.View;
import p000.afh;

/* JADX INFO: loaded from: classes4.dex */
public class jbi<R> implements afh<R> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7853a f50272a;

    /* JADX INFO: renamed from: jbi$a */
    public interface InterfaceC7853a {
        void animate(View view);
    }

    public jbi(InterfaceC7853a interfaceC7853a) {
        this.f50272a = interfaceC7853a;
    }

    @Override // p000.afh
    public boolean transition(R r, afh.InterfaceC0213a interfaceC0213a) {
        if (interfaceC0213a.getView() == null) {
            return false;
        }
        this.f50272a.animate(interfaceC0213a.getView());
        return false;
    }
}
