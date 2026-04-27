package p000;

import p000.emc;
import p000.fmc;
import p000.vif;

/* JADX INFO: loaded from: classes6.dex */
public class vp7 extends iud {

    /* JADX INFO: renamed from: vp7$a */
    public static class C14206a {

        /* JADX INFO: renamed from: a */
        public static vp7 f91907a = new vp7();

        private C14206a() {
        }
    }

    public static vp7 getInst() {
        return C14206a.f91907a;
    }

    public void initPcmRecorder(emc.C5394d c5394d, fmc.InterfaceC5891a interfaceC5891a) {
        iud.getInst().init(iud.genFrom(c5394d), iud.genFrom(interfaceC5891a));
    }

    public void pausePlay() {
        wif.getInst().pause();
    }

    public void playerInit(String str, vif.InterfaceC14099c interfaceC14099c) {
        wif.getInst().init(str, interfaceC14099c);
    }

    public void startPcmPlay() {
        wif.getInst().play();
    }

    public void stopPlay() {
        wif.getInst().stop();
    }

    public void playerInit(byte[] bArr, vif.InterfaceC14099c interfaceC14099c) {
        wif.getInst().init(bArr, interfaceC14099c);
    }
}
