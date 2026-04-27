package p000;

import java.util.Map;
import java.util.UUID;
import p000.ar4;
import p000.nr4;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class j55 implements ar4 {

    /* JADX INFO: renamed from: f */
    public final ar4.C1571a f49542f;

    public j55(ar4.C1571a c1571a) {
        this.f49542f = (ar4.C1571a) v80.checkNotNull(c1571a);
    }

    @Override // p000.ar4
    public void acquire(@hib nr4.C10020a c10020a) {
    }

    @Override // p000.ar4
    @hib
    public c93 getCryptoConfig() {
        return null;
    }

    @Override // p000.ar4
    @hib
    public ar4.C1571a getError() {
        return this.f49542f;
    }

    @Override // p000.ar4
    @hib
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // p000.ar4
    public final UUID getSchemeUuid() {
        return jk1.f50913k2;
    }

    @Override // p000.ar4
    public int getState() {
        return 1;
    }

    @Override // p000.ar4
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // p000.ar4
    @hib
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // p000.ar4
    public void release(@hib nr4.C10020a c10020a) {
    }

    @Override // p000.ar4
    public boolean requiresSecureDecoder(String str) {
        return false;
    }
}
