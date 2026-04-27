package p000;

import p000.emc;

/* JADX INFO: loaded from: classes6.dex */
public class fmc extends emc {

    /* JADX INFO: renamed from: fmc$a */
    public interface InterfaceC5891a {
        void onDecibel(int i);

        void onError(wxf wxfVar);

        void onRecordBuffer(byte[] bArr, int i, int i2);

        void onRecordReleased();

        void onRecordStarted(boolean z);
    }

    public fmc(emc.C5394d c5394d, InterfaceC5891a interfaceC5891a) {
        super(c5394d, interfaceC5891a);
    }
}
