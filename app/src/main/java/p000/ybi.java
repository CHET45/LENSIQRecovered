package p000;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import p000.afh;

/* JADX INFO: loaded from: classes4.dex */
public class ybi<R> implements afh<R> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15606a f101060a;

    /* JADX INFO: renamed from: ybi$a */
    public interface InterfaceC15606a {
        Animation build(Context context);
    }

    public ybi(InterfaceC15606a interfaceC15606a) {
        this.f101060a = interfaceC15606a;
    }

    @Override // p000.afh
    public boolean transition(R r, afh.InterfaceC0213a interfaceC0213a) {
        View view = interfaceC0213a.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f101060a.build(view.getContext()));
        return false;
    }
}
