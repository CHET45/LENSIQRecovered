package p000;

import java.util.UUID;
import p000.y95;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class od9 implements yea {

    /* JADX INFO: renamed from: a */
    public final byte[] f67338a;

    public od9(byte[] bArr) {
        this.f67338a = (byte[]) v80.checkNotNull(bArr);
    }

    @Override // p000.yea
    public byte[] executeKeyRequest(UUID uuid, y95.C15570b c15570b) {
        return this.f67338a;
    }

    @Override // p000.yea
    public byte[] executeProvisionRequest(UUID uuid, y95.C15576h c15576h) {
        throw new UnsupportedOperationException();
    }
}
