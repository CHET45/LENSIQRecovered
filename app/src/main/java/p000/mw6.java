package p000;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p000.ejd;
import p000.y95;

/* JADX INFO: loaded from: classes3.dex */
public final class mw6 implements y95 {

    /* JADX INFO: renamed from: j */
    public static final String f62543j = "FrameworkMediaDrm";

    /* JADX INFO: renamed from: k */
    @ovh
    public static final y95.InterfaceC15575g f62544k = new y95.InterfaceC15575g() { // from class: dw6
        @Override // p000.y95.InterfaceC15575g
        public final y95 acquireExoMediaDrm(UUID uuid) {
            return mw6.lambda$static$0(uuid);
        }
    };

    /* JADX INFO: renamed from: l */
    public static final String f62545l = "cenc";

    /* JADX INFO: renamed from: m */
    public static final String f62546m = "https://x";

    /* JADX INFO: renamed from: n */
    public static final String f62547n = "<LA_URL>https://x</LA_URL>";

    /* JADX INFO: renamed from: o */
    public static final int f62548o = 2;

    /* JADX INFO: renamed from: g */
    public final UUID f62549g;

    /* JADX INFO: renamed from: h */
    public final MediaDrm f62550h;

    /* JADX INFO: renamed from: i */
    public int f62551i;

    /* JADX INFO: renamed from: mw6$a */
    @c5e(31)
    public static class C9570a {
        private C9570a() {
        }

        public static boolean requiresSecureDecoder(MediaDrm mediaDrm, String str, int i) {
            return mediaDrm.requiresSecureDecoder(str, i);
        }

        public static void setLogSessionIdOnMediaDrmSession(MediaDrm mediaDrm, byte[] bArr, j0d j0dVar) {
            LogSessionId logSessionId = j0dVar.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            kw6.m15052a(v80.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
        }
    }

    private mw6(UUID uuid) throws UnsupportedSchemeException {
        v80.checkNotNull(uuid);
        v80.checkArgument(!jk1.f50918l2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f62549g = uuid;
        MediaDrm mediaDrm = new MediaDrm(adjustUuid(uuid));
        this.f62550h = mediaDrm;
        this.f62551i = 1;
        if (jk1.f50928n2.equals(uuid) && needsForceWidevineL3Workaround()) {
            forceWidevineL3(mediaDrm);
        }
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] bArr) {
        jhc jhcVar = new jhc(bArr);
        int littleEndianInt = jhcVar.readLittleEndianInt();
        short littleEndianShort = jhcVar.readLittleEndianShort();
        short littleEndianShort2 = jhcVar.readLittleEndianShort();
        if (littleEndianShort != 1 || littleEndianShort2 != 1) {
            xh9.m25146i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short littleEndianShort3 = jhcVar.readLittleEndianShort();
        Charset charset = StandardCharsets.UTF_16LE;
        String string = jhcVar.readString(littleEndianShort3, charset);
        if (string.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = string.indexOf("</DATA>");
        if (iIndexOf == -1) {
            xh9.m25148w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = string.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + string.substring(iIndexOf);
        int i = littleEndianInt + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(littleEndianShort);
        byteBufferAllocate.putShort(littleEndianShort2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String adjustLicenseServerUrl(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String propertyString = getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] adjustRequestData(UUID uuid, byte[] bArr) {
        return jk1.f50923m2.equals(uuid) ? h22.adjustRequestData(bArr) : bArr;
    }

    private static byte[] adjustRequestInitData(UUID uuid, byte[] bArr) {
        byte[] schemeSpecificData;
        ejd.C5345a psshAtom;
        UUID uuid2 = jk1.f50933o2;
        if (uuid2.equals(uuid)) {
            byte[] schemeSpecificData2 = ejd.parseSchemeSpecificData(bArr, uuid);
            if (schemeSpecificData2 != null) {
                bArr = schemeSpecificData2;
            }
            bArr = ejd.buildPsshAtom(uuid2, addLaUrlAttributeIfMissing(bArr));
        }
        if (cdmRequiresCommonPsshUuid(uuid) && (psshAtom = ejd.parsePsshAtom(bArr)) != null) {
            bArr = ejd.buildPsshAtom(jk1.f50918l2, psshAtom.f33211d, psshAtom.f33210c);
        }
        if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if (("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) && (schemeSpecificData = ejd.parseSchemeSpecificData(bArr, uuid)) != null) {
                return schemeSpecificData;
            }
        }
        return bArr;
    }

    private static String adjustRequestMimeType(UUID uuid, String str) {
        return str;
    }

    private static UUID adjustUuid(UUID uuid) {
        return cdmRequiresCommonPsshUuid(uuid) ? jk1.f50918l2 : uuid;
    }

    private static boolean cdmRequiresCommonPsshUuid(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, jk1.f50923m2);
    }

    private static void forceWidevineL3(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData getSchemeData(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!jk1.f50928n2.equals(uuid)) {
            return list.get(0);
        }
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int length = 0;
            for (int i = 0; i < list.size(); i++) {
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr = (byte[]) v80.checkNotNull(schemeData2.f8211e);
                if (Objects.equals(schemeData2.f8210d, schemeData.f8210d) && Objects.equals(schemeData2.f8209c, schemeData.f8209c) && ejd.isPsshAtom(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                byte[] bArr3 = (byte[]) v80.checkNotNull(list.get(i3).f8211e);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i2, length2);
                i2 += length2;
            }
            return schemeData.copyWithData(bArr2);
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = list.get(i4);
            if (ejd.parseVersion((byte[]) v80.checkNotNull(schemeData3.f8211e)) == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(adjustUuid(uuid));
    }

    @c5e(31)
    private boolean isMediaDrmRequiresSecureDecoderImplemented() {
        if (!this.f62549g.equals(jk1.f50928n2)) {
            return this.f62549g.equals(jk1.f50923m2);
        }
        String propertyString = getPropertyString("version");
        return (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnEventListener$1(y95.InterfaceC15572d interfaceC15572d, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        interfaceC15572d.onEvent(this, bArr, i, i2, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnExpirationUpdateListener$3(y95.InterfaceC15573e interfaceC15573e, MediaDrm mediaDrm, byte[] bArr, long j) {
        interfaceC15573e.onExpirationUpdate(this, bArr, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnKeyStatusChangeListener$2(y95.InterfaceC15574f interfaceC15574f, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new y95.C15571c(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        interfaceC15574f.onKeyStatusChange(this, bArr, arrayList, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y95 lambda$static$0(UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (rvh unused) {
            xh9.m25144e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new ps4();
        }
    }

    private static boolean needsForceWidevineL3Workaround() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    @ovh
    public static mw6 newInstance(UUID uuid) throws rvh {
        try {
            return new mw6(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new rvh(1, e);
        } catch (Exception e2) {
            throw new rvh(2, e2);
        }
    }

    @Override // p000.y95
    @ovh
    public synchronized void acquire() {
        v80.checkState(this.f62551i > 0);
        this.f62551i++;
    }

    @Override // p000.y95
    @ovh
    public void closeSession(byte[] bArr) {
        this.f62550h.closeSession(bArr);
    }

    @Override // p000.y95
    @ovh
    public int getCryptoType() {
        return 2;
    }

    @Override // p000.y95
    @ovh
    @igg({"WrongConstant"})
    public y95.C15570b getKeyRequest(byte[] bArr, @hib List<DrmInitData.SchemeData> list, int i, @hib HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeData;
        byte[] bArrAdjustRequestInitData;
        String strAdjustRequestMimeType;
        if (list != null) {
            schemeData = getSchemeData(this.f62549g, list);
            bArrAdjustRequestInitData = adjustRequestInitData(this.f62549g, (byte[]) v80.checkNotNull(schemeData.f8211e));
            strAdjustRequestMimeType = adjustRequestMimeType(this.f62549g, schemeData.f8210d);
        } else {
            schemeData = null;
            bArrAdjustRequestInitData = null;
            strAdjustRequestMimeType = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f62550h.getKeyRequest(bArr, bArrAdjustRequestInitData, strAdjustRequestMimeType, i, map);
        byte[] bArrAdjustRequestData = adjustRequestData(this.f62549g, keyRequest.getData());
        String strAdjustLicenseServerUrl = adjustLicenseServerUrl(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strAdjustLicenseServerUrl) && schemeData != null && !TextUtils.isEmpty(schemeData.f8209c)) {
            strAdjustLicenseServerUrl = schemeData.f8209c;
        }
        return new y95.C15570b(bArrAdjustRequestData, strAdjustLicenseServerUrl, keyRequest.getRequestType());
    }

    @Override // p000.y95
    @hib
    @ovh
    public PersistableBundle getMetrics() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return this.f62550h.getMetrics();
    }

    @Override // p000.y95
    @c5e(29)
    @ovh
    public List<byte[]> getOfflineLicenseKeySetIds() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f62550h.getOfflineLicenseKeySetIds();
        }
        throw new UnsupportedOperationException();
    }

    @Override // p000.y95
    @ovh
    public byte[] getPropertyByteArray(String str) {
        return this.f62550h.getPropertyByteArray(str);
    }

    @Override // p000.y95
    @ovh
    public String getPropertyString(String str) {
        return this.f62550h.getPropertyString(str);
    }

    @Override // p000.y95
    @ovh
    public y95.C15576h getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f62550h.getProvisionRequest();
        return new y95.C15576h(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p000.y95
    @ovh
    public byte[] openSession() throws MediaDrmException {
        return this.f62550h.openSession();
    }

    @Override // p000.y95
    @hib
    @ovh
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (jk1.f50923m2.equals(this.f62549g)) {
            bArr2 = h22.adjustResponseData(bArr2);
        }
        return this.f62550h.provideKeyResponse(bArr, bArr2);
    }

    @Override // p000.y95
    @ovh
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f62550h.provideProvisionResponse(bArr);
    }

    @Override // p000.y95
    @ovh
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f62550h.queryKeyStatus(bArr);
    }

    @Override // p000.y95
    @ovh
    public synchronized void release() {
        int i = this.f62551i - 1;
        this.f62551i = i;
        if (i == 0) {
            this.f62550h.release();
        }
    }

    @Override // p000.y95
    @c5e(29)
    @ovh
    public void removeOfflineLicense(byte[] bArr) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException();
        }
        this.f62550h.removeOfflineLicense(bArr);
    }

    @Override // p000.y95
    @ovh
    public boolean requiresSecureDecoder(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (Build.VERSION.SDK_INT >= 31 && isMediaDrmRequiresSecureDecoderImplemented()) {
            MediaDrm mediaDrm = this.f62550h;
            return C9570a.requiresSecureDecoder(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(adjustUuid(this.f62549g), bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    zRequiresSecureDecoderComponent = !this.f62549g.equals(jk1.f50923m2);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
            return zRequiresSecureDecoderComponent;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.y95
    @ovh
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f62550h.restoreKeys(bArr, bArr2);
    }

    @Override // p000.y95
    @ovh
    public void setOnEventListener(@hib final y95.InterfaceC15572d interfaceC15572d) {
        this.f62550h.setOnEventListener(interfaceC15572d == null ? null : new MediaDrm.OnEventListener() { // from class: fw6
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.f37863a.lambda$setOnEventListener$1(interfaceC15572d, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // p000.y95
    @c5e(23)
    @ovh
    public void setOnExpirationUpdateListener(@hib final y95.InterfaceC15573e interfaceC15573e) {
        this.f62550h.setOnExpirationUpdateListener(interfaceC15573e == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: ew6
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                this.f34289a.lambda$setOnExpirationUpdateListener$3(interfaceC15573e, mediaDrm, bArr, j);
            }
        }, (Handler) null);
    }

    @Override // p000.y95
    @c5e(23)
    @ovh
    public void setOnKeyStatusChangeListener(@hib final y95.InterfaceC15574f interfaceC15574f) {
        this.f62550h.setOnKeyStatusChangeListener(interfaceC15574f == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: gw6
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
                this.f41724a.lambda$setOnKeyStatusChangeListener$2(interfaceC15574f, mediaDrm, bArr, list, z);
            }
        }, (Handler) null);
    }

    @Override // p000.y95
    @ovh
    public void setPlayerIdForSession(byte[] bArr, j0d j0dVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                C9570a.setLogSessionIdOnMediaDrmSession(this.f62550h, bArr, j0dVar);
            } catch (UnsupportedOperationException unused) {
                xh9.m25148w("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p000.y95
    @ovh
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.f62550h.setPropertyByteArray(str, bArr);
    }

    @Override // p000.y95
    @ovh
    public void setPropertyString(String str, String str2) {
        this.f62550h.setPropertyString(str, str2);
    }

    @Override // p000.y95
    @ovh
    public sv6 createCryptoConfig(byte[] bArr) throws MediaCryptoException {
        return new sv6(adjustUuid(this.f62549g), bArr);
    }
}
