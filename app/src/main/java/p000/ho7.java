package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p000.gh3;
import p000.xh3;
import p000.y95;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ho7 implements yea {

    /* JADX INFO: renamed from: a */
    public final gh3.InterfaceC6313a f44400a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f44401b;

    /* JADX INFO: renamed from: c */
    public final boolean f44402c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f44403d;

    public ho7(@hib String str, gh3.InterfaceC6313a interfaceC6313a) {
        this(str, false, interfaceC6313a);
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.f44403d) {
            this.f44403d.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        v80.checkNotNull(str);
        synchronized (this.f44403d) {
            this.f44403d.remove(str);
        }
    }

    @Override // p000.yea
    public byte[] executeKeyRequest(UUID uuid, y95.C15570b c15570b) throws afa {
        String licenseServerUrl = c15570b.getLicenseServerUrl();
        if (this.f44402c || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.f44401b;
        }
        if (TextUtils.isEmpty(licenseServerUrl)) {
            xh3.C15067b c15067b = new xh3.C15067b();
            Uri uri = Uri.EMPTY;
            throw new afa(c15067b.setUri(uri).build(), uri, ox7.m19076of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = jk1.f50933o2;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : jk1.f50923m2.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f44403d) {
            map.putAll(this.f44403d);
        }
        return tr4.executePost(this.f44400a.createDataSource(), licenseServerUrl, c15570b.getData(), map);
    }

    @Override // p000.yea
    public byte[] executeProvisionRequest(UUID uuid, y95.C15576h c15576h) throws afa {
        return tr4.executePost(this.f44400a.createDataSource(), c15576h.getDefaultUrl() + "&signedRequest=" + t0i.fromUtf8Bytes(c15576h.getData()), null, Collections.emptyMap());
    }

    public void setKeyRequestProperty(String str, String str2) {
        v80.checkNotNull(str);
        v80.checkNotNull(str2);
        synchronized (this.f44403d) {
            this.f44403d.put(str, str2);
        }
    }

    public ho7(@hib String str, boolean z, gh3.InterfaceC6313a interfaceC6313a) {
        v80.checkArgument((z && TextUtils.isEmpty(str)) ? false : true);
        this.f44400a = interfaceC6313a;
        this.f44401b = str;
        this.f44402c = z;
        this.f44403d = new HashMap();
    }
}
