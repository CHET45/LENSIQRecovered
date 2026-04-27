package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.gh3;
import p000.vv3;

/* JADX INFO: loaded from: classes3.dex */
public final class nt3 implements gh3 {

    /* JADX INFO: renamed from: m */
    public static final String f65556m = "DefaultDataSource";

    /* JADX INFO: renamed from: n */
    public static final String f65557n = "asset";

    /* JADX INFO: renamed from: o */
    public static final String f65558o = "content";

    /* JADX INFO: renamed from: p */
    public static final String f65559p = "rtmp";

    /* JADX INFO: renamed from: q */
    public static final String f65560q = "udp";

    /* JADX INFO: renamed from: r */
    public static final String f65561r = "data";

    /* JADX INFO: renamed from: s */
    public static final String f65562s = "rawresource";

    /* JADX INFO: renamed from: t */
    public static final String f65563t = "android.resource";

    /* JADX INFO: renamed from: b */
    public final Context f65564b;

    /* JADX INFO: renamed from: c */
    public final List<qdh> f65565c;

    /* JADX INFO: renamed from: d */
    public final gh3 f65566d;

    /* JADX INFO: renamed from: e */
    @hib
    public gh3 f65567e;

    /* JADX INFO: renamed from: f */
    @hib
    public gh3 f65568f;

    /* JADX INFO: renamed from: g */
    @hib
    public gh3 f65569g;

    /* JADX INFO: renamed from: h */
    @hib
    public gh3 f65570h;

    /* JADX INFO: renamed from: i */
    @hib
    public gh3 f65571i;

    /* JADX INFO: renamed from: j */
    @hib
    public gh3 f65572j;

    /* JADX INFO: renamed from: k */
    @hib
    public gh3 f65573k;

    /* JADX INFO: renamed from: l */
    @hib
    public gh3 f65574l;

    /* JADX INFO: renamed from: nt3$a */
    public static final class C10051a implements gh3.InterfaceC6313a {

        /* JADX INFO: renamed from: a */
        public final Context f65575a;

        /* JADX INFO: renamed from: b */
        public final gh3.InterfaceC6313a f65576b;

        /* JADX INFO: renamed from: c */
        @hib
        public qdh f65577c;

        public C10051a(Context context) {
            this(context, new vv3.C14271b());
        }

        @op1
        @ovh
        public C10051a setTransferListener(@hib qdh qdhVar) {
            this.f65577c = qdhVar;
            return this;
        }

        public C10051a(Context context, gh3.InterfaceC6313a interfaceC6313a) {
            this.f65575a = context.getApplicationContext();
            this.f65576b = (gh3.InterfaceC6313a) v80.checkNotNull(interfaceC6313a);
        }

        @Override // p000.gh3.InterfaceC6313a
        @ovh
        public nt3 createDataSource() {
            nt3 nt3Var = new nt3(this.f65575a, this.f65576b.createDataSource());
            qdh qdhVar = this.f65577c;
            if (qdhVar != null) {
                nt3Var.addTransferListener(qdhVar);
            }
            return nt3Var;
        }
    }

    @ovh
    public nt3(Context context, boolean z) {
        this(context, null, 8000, 8000, z);
    }

    private void addListenersToDataSource(gh3 gh3Var) {
        for (int i = 0; i < this.f65565c.size(); i++) {
            gh3Var.addTransferListener(this.f65565c.get(i));
        }
    }

    private gh3 getAssetDataSource() {
        if (this.f65568f == null) {
            w80 w80Var = new w80(this.f65564b);
            this.f65568f = w80Var;
            addListenersToDataSource(w80Var);
        }
        return this.f65568f;
    }

    private gh3 getContentDataSource() {
        if (this.f65569g == null) {
            lv2 lv2Var = new lv2(this.f65564b);
            this.f65569g = lv2Var;
            addListenersToDataSource(lv2Var);
        }
        return this.f65569g;
    }

    private gh3 getDataSchemeDataSource() {
        if (this.f65572j == null) {
            dh3 dh3Var = new dh3();
            this.f65572j = dh3Var;
            addListenersToDataSource(dh3Var);
        }
        return this.f65572j;
    }

    private gh3 getFileDataSource() {
        if (this.f65567e == null) {
            ns5 ns5Var = new ns5();
            this.f65567e = ns5Var;
            addListenersToDataSource(ns5Var);
        }
        return this.f65567e;
    }

    private gh3 getRawResourceDataSource() {
        if (this.f65573k == null) {
            xpd xpdVar = new xpd(this.f65564b);
            this.f65573k = xpdVar;
            addListenersToDataSource(xpdVar);
        }
        return this.f65573k;
    }

    private gh3 getRtmpDataSource() {
        if (this.f65570h == null) {
            try {
                gh3 gh3Var = (gh3) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f65570h = gh3Var;
                addListenersToDataSource(gh3Var);
            } catch (ClassNotFoundException unused) {
                xh9.m25148w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f65570h == null) {
                this.f65570h = this.f65566d;
            }
        }
        return this.f65570h;
    }

    private gh3 getUdpDataSource() {
        if (this.f65571i == null) {
            sqh sqhVar = new sqh();
            this.f65571i = sqhVar;
            addListenersToDataSource(sqhVar);
        }
        return this.f65571i;
    }

    private void maybeAddListenerToDataSource(@hib gh3 gh3Var, qdh qdhVar) {
        if (gh3Var != null) {
            gh3Var.addTransferListener(qdhVar);
        }
    }

    @Override // p000.gh3
    @ovh
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f65566d.addTransferListener(qdhVar);
        this.f65565c.add(qdhVar);
        maybeAddListenerToDataSource(this.f65567e, qdhVar);
        maybeAddListenerToDataSource(this.f65568f, qdhVar);
        maybeAddListenerToDataSource(this.f65569g, qdhVar);
        maybeAddListenerToDataSource(this.f65570h, qdhVar);
        maybeAddListenerToDataSource(this.f65571i, qdhVar);
        maybeAddListenerToDataSource(this.f65572j, qdhVar);
        maybeAddListenerToDataSource(this.f65573k, qdhVar);
    }

    @Override // p000.gh3
    @ovh
    public void close() throws IOException {
        gh3 gh3Var = this.f65574l;
        if (gh3Var != null) {
            try {
                gh3Var.close();
            } finally {
                this.f65574l = null;
            }
        }
    }

    @Override // p000.gh3
    @ovh
    public Map<String, List<String>> getResponseHeaders() {
        gh3 gh3Var = this.f65574l;
        return gh3Var == null ? Collections.emptyMap() : gh3Var.getResponseHeaders();
    }

    @Override // p000.gh3
    @hib
    @ovh
    public Uri getUri() {
        gh3 gh3Var = this.f65574l;
        if (gh3Var == null) {
            return null;
        }
        return gh3Var.getUri();
    }

    @Override // p000.gh3
    @ovh
    public long open(xh3 xh3Var) throws IOException {
        v80.checkState(this.f65574l == null);
        String scheme = xh3Var.f97800a.getScheme();
        if (t0i.isLocalFileUri(xh3Var.f97800a)) {
            String path = xh3Var.f97800a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f65574l = getFileDataSource();
            } else {
                this.f65574l = getAssetDataSource();
            }
        } else if ("asset".equals(scheme)) {
            this.f65574l = getAssetDataSource();
        } else if ("content".equals(scheme)) {
            this.f65574l = getContentDataSource();
        } else if ("rtmp".equals(scheme)) {
            this.f65574l = getRtmpDataSource();
        } else if ("udp".equals(scheme)) {
            this.f65574l = getUdpDataSource();
        } else if ("data".equals(scheme)) {
            this.f65574l = getDataSchemeDataSource();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f65574l = getRawResourceDataSource();
        } else {
            this.f65574l = this.f65566d;
        }
        return this.f65574l.open(xh3Var);
    }

    @Override // p000.bh3
    @ovh
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((gh3) v80.checkNotNull(this.f65574l)).read(bArr, i, i2);
    }

    @ovh
    public nt3(Context context, @hib String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    @ovh
    public nt3(Context context, @hib String str, int i, int i2, boolean z) {
        this(context, new vv3.C14271b().setUserAgent(str).setConnectTimeoutMs(i).setReadTimeoutMs(i2).setAllowCrossProtocolRedirects(z).createDataSource());
    }

    @ovh
    public nt3(Context context, gh3 gh3Var) {
        this.f65564b = context.getApplicationContext();
        this.f65566d = (gh3) v80.checkNotNull(gh3Var);
        this.f65565c = new ArrayList();
    }
}
