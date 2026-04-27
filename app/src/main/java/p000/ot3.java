package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.aw3;
import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ot3 implements ih3 {

    /* JADX INFO: renamed from: m */
    public static final String f68633m = "DefaultDataSource";

    /* JADX INFO: renamed from: n */
    public static final String f68634n = "asset";

    /* JADX INFO: renamed from: o */
    public static final String f68635o = "content";

    /* JADX INFO: renamed from: p */
    public static final String f68636p = "rtmp";

    /* JADX INFO: renamed from: q */
    public static final String f68637q = "udp";

    /* JADX INFO: renamed from: r */
    public static final String f68638r = "data";

    /* JADX INFO: renamed from: s */
    public static final String f68639s = "rawresource";

    /* JADX INFO: renamed from: t */
    public static final String f68640t = "android.resource";

    /* JADX INFO: renamed from: b */
    public final Context f68641b;

    /* JADX INFO: renamed from: c */
    public final List<pdh> f68642c;

    /* JADX INFO: renamed from: d */
    public final ih3 f68643d;

    /* JADX INFO: renamed from: e */
    @hib
    public ih3 f68644e;

    /* JADX INFO: renamed from: f */
    @hib
    public ih3 f68645f;

    /* JADX INFO: renamed from: g */
    @hib
    public ih3 f68646g;

    /* JADX INFO: renamed from: h */
    @hib
    public ih3 f68647h;

    /* JADX INFO: renamed from: i */
    @hib
    public ih3 f68648i;

    /* JADX INFO: renamed from: j */
    @hib
    public ih3 f68649j;

    /* JADX INFO: renamed from: k */
    @hib
    public ih3 f68650k;

    /* JADX INFO: renamed from: l */
    @hib
    public ih3 f68651l;

    /* JADX INFO: renamed from: ot3$a */
    public static final class C10647a implements ih3.InterfaceC7283a {

        /* JADX INFO: renamed from: a */
        public final Context f68652a;

        /* JADX INFO: renamed from: b */
        public final ih3.InterfaceC7283a f68653b;

        /* JADX INFO: renamed from: c */
        @hib
        public pdh f68654c;

        public C10647a(Context context) {
            this(context, new aw3.C1623b());
        }

        @op1
        public C10647a setTransferListener(@hib pdh pdhVar) {
            this.f68654c = pdhVar;
            return this;
        }

        public C10647a(Context context, ih3.InterfaceC7283a interfaceC7283a) {
            this.f68652a = context.getApplicationContext();
            this.f68653b = interfaceC7283a;
        }

        @Override // p000.ih3.InterfaceC7283a
        public ot3 createDataSource() {
            ot3 ot3Var = new ot3(this.f68652a, this.f68653b.createDataSource());
            pdh pdhVar = this.f68654c;
            if (pdhVar != null) {
                ot3Var.addTransferListener(pdhVar);
            }
            return ot3Var;
        }
    }

    public ot3(Context context, boolean z) {
        this(context, null, 8000, 8000, z);
    }

    private void addListenersToDataSource(ih3 ih3Var) {
        for (int i = 0; i < this.f68642c.size(); i++) {
            ih3Var.addTransferListener(this.f68642c.get(i));
        }
    }

    private ih3 getAssetDataSource() {
        if (this.f68645f == null) {
            x80 x80Var = new x80(this.f68641b);
            this.f68645f = x80Var;
            addListenersToDataSource(x80Var);
        }
        return this.f68645f;
    }

    private ih3 getContentDataSource() {
        if (this.f68646g == null) {
            mv2 mv2Var = new mv2(this.f68641b);
            this.f68646g = mv2Var;
            addListenersToDataSource(mv2Var);
        }
        return this.f68646g;
    }

    private ih3 getDataSchemeDataSource() {
        if (this.f68649j == null) {
            ch3 ch3Var = new ch3();
            this.f68649j = ch3Var;
            addListenersToDataSource(ch3Var);
        }
        return this.f68649j;
    }

    private ih3 getFileDataSource() {
        if (this.f68644e == null) {
            os5 os5Var = new os5();
            this.f68644e = os5Var;
            addListenersToDataSource(os5Var);
        }
        return this.f68644e;
    }

    private ih3 getRawResourceDataSource() {
        if (this.f68650k == null) {
            ypd ypdVar = new ypd(this.f68641b);
            this.f68650k = ypdVar;
            addListenersToDataSource(ypdVar);
        }
        return this.f68650k;
    }

    private ih3 getRtmpDataSource() {
        if (this.f68647h == null) {
            try {
                ih3 ih3Var = (ih3) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f68647h = ih3Var;
                addListenersToDataSource(ih3Var);
            } catch (ClassNotFoundException unused) {
                yh9.m25919w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f68647h == null) {
                this.f68647h = this.f68643d;
            }
        }
        return this.f68647h;
    }

    private ih3 getUdpDataSource() {
        if (this.f68648i == null) {
            tqh tqhVar = new tqh();
            this.f68648i = tqhVar;
            addListenersToDataSource(tqhVar);
        }
        return this.f68648i;
    }

    private void maybeAddListenerToDataSource(@hib ih3 ih3Var, pdh pdhVar) {
        if (ih3Var != null) {
            ih3Var.addTransferListener(pdhVar);
        }
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f68643d.addTransferListener(pdhVar);
        this.f68642c.add(pdhVar);
        maybeAddListenerToDataSource(this.f68644e, pdhVar);
        maybeAddListenerToDataSource(this.f68645f, pdhVar);
        maybeAddListenerToDataSource(this.f68646g, pdhVar);
        maybeAddListenerToDataSource(this.f68647h, pdhVar);
        maybeAddListenerToDataSource(this.f68648i, pdhVar);
        maybeAddListenerToDataSource(this.f68649j, pdhVar);
        maybeAddListenerToDataSource(this.f68650k, pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws IOException {
        ih3 ih3Var = this.f68651l;
        if (ih3Var != null) {
            try {
                ih3Var.close();
            } finally {
                this.f68651l = null;
            }
        }
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        ih3 ih3Var = this.f68651l;
        return ih3Var == null ? Collections.emptyMap() : ih3Var.getResponseHeaders();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        ih3 ih3Var = this.f68651l;
        if (ih3Var == null) {
            return null;
        }
        return ih3Var.getUri();
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        u80.checkState(this.f68651l == null);
        String scheme = yh3Var.f101485a.getScheme();
        if (x0i.isLocalFileUri(yh3Var.f101485a)) {
            String path = yh3Var.f101485a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f68651l = getFileDataSource();
            } else {
                this.f68651l = getAssetDataSource();
            }
        } else if ("asset".equals(scheme)) {
            this.f68651l = getAssetDataSource();
        } else if ("content".equals(scheme)) {
            this.f68651l = getContentDataSource();
        } else if ("rtmp".equals(scheme)) {
            this.f68651l = getRtmpDataSource();
        } else if ("udp".equals(scheme)) {
            this.f68651l = getUdpDataSource();
        } else if ("data".equals(scheme)) {
            this.f68651l = getDataSchemeDataSource();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f68651l = getRawResourceDataSource();
        } else {
            this.f68651l = this.f68643d;
        }
        return this.f68651l.open(yh3Var);
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((ih3) u80.checkNotNull(this.f68651l)).read(bArr, i, i2);
    }

    public ot3(Context context, @hib String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    public ot3(Context context, @hib String str, int i, int i2, boolean z) {
        this(context, new aw3.C1623b().setUserAgent(str).setConnectTimeoutMs(i).setReadTimeoutMs(i2).setAllowCrossProtocolRedirects(z).createDataSource());
    }

    public ot3(Context context, ih3 ih3Var) {
        this.f68641b = context.getApplicationContext();
        this.f68643d = (ih3) u80.checkNotNull(ih3Var);
        this.f68642c = new ArrayList();
    }
}
