package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class bmc extends mvi {

    /* JADX INFO: renamed from: bmc$a */
    public interface InterfaceC1949a {
        void onError(wxf wxfVar);

        void onPaused();

        void onPercent(int i, int i2, int i3);

        void onResume();

        void onStoped();
    }

    public bmc(Context context) {
        super(context);
    }

    public boolean play(vui vuiVar, InterfaceC1949a interfaceC1949a) {
        setListener(interfaceC1949a);
        return play(vuiVar);
    }

    public boolean rePlay(vui vuiVar, InterfaceC1949a interfaceC1949a) {
        super.m17627D(0);
        return play(vuiVar, interfaceC1949a);
    }

    public bmc(Context context, int i, boolean z, boolean z2, boolean z3) {
        super(context, i, z, z2, z3);
    }
}
