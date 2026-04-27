package p000;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import androidx.media3.common.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.y95;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ps4 implements y95 {
    public static ps4 getInstance() {
        return new ps4();
    }

    @Override // p000.y95
    public void acquire() {
    }

    @Override // p000.y95
    public void closeSession(byte[] bArr) {
    }

    @Override // p000.y95
    public c93 createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    public int getCryptoType() {
        return 1;
    }

    @Override // p000.y95
    public y95.C15570b getKeyRequest(byte[] bArr, @hib List<DrmInitData.SchemeData> list, int i, @hib HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    @hib
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // p000.y95
    public byte[] getPropertyByteArray(String str) {
        return t0i.f83321f;
    }

    @Override // p000.y95
    public String getPropertyString(String str) {
        return "";
    }

    @Override // p000.y95
    public y95.C15576h getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // p000.y95
    @hib
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    public void release() {
    }

    @Override // p000.y95
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p000.y95
    public void setOnEventListener(@hib y95.InterfaceC15572d interfaceC15572d) {
    }

    @Override // p000.y95
    public void setOnExpirationUpdateListener(@hib y95.InterfaceC15573e interfaceC15573e) {
    }

    @Override // p000.y95
    public void setOnKeyStatusChangeListener(@hib y95.InterfaceC15574f interfaceC15574f) {
    }

    @Override // p000.y95
    public void setPropertyByteArray(String str, byte[] bArr) {
    }

    @Override // p000.y95
    public void setPropertyString(String str, String str2) {
    }
}
