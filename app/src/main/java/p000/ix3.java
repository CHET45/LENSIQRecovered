package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.InterfaceC14066vh;
import p000.aga;
import p000.gfd;
import p000.hue;
import p000.ih3;
import p000.iof;
import p000.k62;
import p000.kq6;
import p000.ot3;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ix3 implements moa {

    /* JADX INFO: renamed from: o */
    public static final String f48740o = "DMediaSourceFactory";

    /* JADX INFO: renamed from: c */
    public final C7648b f48741c;

    /* JADX INFO: renamed from: d */
    public ih3.InterfaceC7283a f48742d;

    /* JADX INFO: renamed from: e */
    @hib
    public vna.InterfaceC14174a f48743e;

    /* JADX INFO: renamed from: f */
    @hib
    public InterfaceC14066vh.b f48744f;

    /* JADX INFO: renamed from: g */
    @hib
    public InterfaceC6309gh f48745g;

    /* JADX INFO: renamed from: h */
    @hib
    public ic9 f48746h;

    /* JADX INFO: renamed from: i */
    public long f48747i;

    /* JADX INFO: renamed from: j */
    public long f48748j;

    /* JADX INFO: renamed from: k */
    public long f48749k;

    /* JADX INFO: renamed from: l */
    public float f48750l;

    /* JADX INFO: renamed from: m */
    public float f48751m;

    /* JADX INFO: renamed from: n */
    public boolean f48752n;

    /* JADX INFO: renamed from: ix3$a */
    @Deprecated
    public interface InterfaceC7647a extends InterfaceC14066vh.b {
    }

    /* JADX INFO: renamed from: ix3$b */
    public static final class C7648b {

        /* JADX INFO: renamed from: a */
        public final hk5 f48753a;

        /* JADX INFO: renamed from: b */
        public final Map<Integer, lfg<vna.InterfaceC14174a>> f48754b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final Set<Integer> f48755c = new HashSet();

        /* JADX INFO: renamed from: d */
        public final Map<Integer, vna.InterfaceC14174a> f48756d = new HashMap();

        /* JADX INFO: renamed from: e */
        public ih3.InterfaceC7283a f48757e;

        /* JADX INFO: renamed from: f */
        @hib
        public k62.InterfaceC8208b f48758f;

        /* JADX INFO: renamed from: g */
        @hib
        public rr4 f48759g;

        /* JADX INFO: renamed from: h */
        @hib
        public ic9 f48760h;

        public C7648b(hk5 hk5Var) {
            this.f48753a = hk5Var;
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ vna.InterfaceC14174a lambda$maybeLoadSupplier$4(ih3.InterfaceC7283a interfaceC7283a) {
            return new gfd.C6285b(interfaceC7283a, this.f48753a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
        @p000.hib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private p000.lfg<p000.vna.InterfaceC14174a> maybeLoadSupplier(int r5) {
            /*
                r4 = this;
                java.util.Map<java.lang.Integer, lfg<vna$a>> r0 = r4.f48754b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L19
                java.util.Map<java.lang.Integer, lfg<vna$a>> r0 = r4.f48754b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r0.get(r5)
                lfg r5 = (p000.lfg) r5
                return r5
            L19:
                ih3$a r0 = r4.f48757e
                java.lang.Object r0 = p000.u80.checkNotNull(r0)
                ih3$a r0 = (p000.ih3.InterfaceC7283a) r0
                java.lang.Class<vna$a> r1 = p000.vna.InterfaceC14174a.class
                r2 = 0
                if (r5 == 0) goto L6b
                r3 = 1
                if (r5 == r3) goto L5b
                r3 = 2
                if (r5 == r3) goto L4a
                r3 = 3
                if (r5 == r3) goto L3a
                r1 = 4
                if (r5 == r1) goto L33
                goto L7b
            L33:
                gx3 r1 = new gx3     // Catch: java.lang.ClassNotFoundException -> L7b
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
            L38:
                r2 = r1
                goto L7b
            L3a:
                java.lang.String r0 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7b
                ex3 r1 = new ex3     // Catch: java.lang.ClassNotFoundException -> L7b
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                goto L38
            L4a:
                java.lang.String r3 = "com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7b
                cx3 r3 = new cx3     // Catch: java.lang.ClassNotFoundException -> L7b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
            L59:
                r2 = r3
                goto L7b
            L5b:
                java.lang.String r3 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7b
                ax3 r3 = new ax3     // Catch: java.lang.ClassNotFoundException -> L7b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                goto L59
            L6b:
                java.lang.String r3 = "com.google.android.exoplayer2.source.dash.DashMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L7b
                yw3 r3 = new yw3     // Catch: java.lang.ClassNotFoundException -> L7b
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                goto L59
            L7b:
                java.util.Map<java.lang.Integer, lfg<vna$a>> r0 = r4.f48754b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0.put(r1, r2)
                if (r2 == 0) goto L8f
                java.util.Set<java.lang.Integer> r0 = r4.f48755c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.add(r5)
            L8f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ix3.C7648b.maybeLoadSupplier(int):lfg");
        }

        @hib
        public vna.InterfaceC14174a getMediaSourceFactory(int i) {
            vna.InterfaceC14174a interfaceC14174a = this.f48756d.get(Integer.valueOf(i));
            if (interfaceC14174a != null) {
                return interfaceC14174a;
            }
            lfg<vna.InterfaceC14174a> lfgVarMaybeLoadSupplier = maybeLoadSupplier(i);
            if (lfgVarMaybeLoadSupplier == null) {
                return null;
            }
            vna.InterfaceC14174a interfaceC14174a2 = lfgVarMaybeLoadSupplier.get();
            k62.InterfaceC8208b interfaceC8208b = this.f48758f;
            if (interfaceC8208b != null) {
                interfaceC14174a2.setCmcdConfigurationFactory(interfaceC8208b);
            }
            rr4 rr4Var = this.f48759g;
            if (rr4Var != null) {
                interfaceC14174a2.setDrmSessionManagerProvider(rr4Var);
            }
            ic9 ic9Var = this.f48760h;
            if (ic9Var != null) {
                interfaceC14174a2.setLoadErrorHandlingPolicy(ic9Var);
            }
            this.f48756d.put(Integer.valueOf(i), interfaceC14174a2);
            return interfaceC14174a2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return rd8.toArray(this.f48755c);
        }

        public void setCmcdConfigurationFactory(k62.InterfaceC8208b interfaceC8208b) {
            this.f48758f = interfaceC8208b;
            Iterator<vna.InterfaceC14174a> it = this.f48756d.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(interfaceC8208b);
            }
        }

        public void setDataSourceFactory(ih3.InterfaceC7283a interfaceC7283a) {
            if (interfaceC7283a != this.f48757e) {
                this.f48757e = interfaceC7283a;
                this.f48754b.clear();
                this.f48756d.clear();
            }
        }

        public void setDrmSessionManagerProvider(rr4 rr4Var) {
            this.f48759g = rr4Var;
            Iterator<vna.InterfaceC14174a> it = this.f48756d.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(rr4Var);
            }
        }

        public void setLoadErrorHandlingPolicy(ic9 ic9Var) {
            this.f48760h = ic9Var;
            Iterator<vna.InterfaceC14174a> it = this.f48756d.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(ic9Var);
            }
        }
    }

    /* JADX INFO: renamed from: ix3$c */
    public static final class C7649c implements yj5 {

        /* JADX INFO: renamed from: d */
        public final kq6 f48761d;

        public C7649c(kq6 kq6Var) {
            this.f48761d = kq6Var;
        }

        @Override // p000.yj5
        public void init(ck5 ck5Var) {
            r6h r6hVarTrack = ck5Var.track(0, 3);
            ck5Var.seekMap(new hue.C7024b(-9223372036854775807L));
            ck5Var.endTracks();
            r6hVarTrack.format(this.f48761d.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(this.f48761d.f54989M).build());
        }

        @Override // p000.yj5
        public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
            return zj5Var.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // p000.yj5
        public void release() {
        }

        @Override // p000.yj5
        public void seek(long j, long j2) {
        }

        @Override // p000.yj5
        public boolean sniff(zj5 zj5Var) {
            return true;
        }
    }

    public ix3(Context context) {
        this(new ot3.C10647a(context));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ vna.InterfaceC14174a m13506b(Class cls) {
        return newInstance(cls);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ vna.InterfaceC14174a m13507c(Class cls, ih3.InterfaceC7283a interfaceC7283a) {
        return newInstance(cls, interfaceC7283a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$createMediaSource$0(kq6 kq6Var) {
        eeg eegVar = eeg.f32770a;
        return new yj5[]{eegVar.supportsFormat(kq6Var) ? new heg(eegVar.createDecoder(kq6Var), kq6Var) : new C7649c(kq6Var)};
    }

    private static vna maybeClipMediaSource(aga agaVar, vna vnaVar) {
        aga.C0236d c0236d = agaVar.f1450f;
        if (c0236d.f1478a == 0 && c0236d.f1479b == Long.MIN_VALUE && !c0236d.f1481d) {
            return vnaVar;
        }
        long jMsToUs = x0i.msToUs(agaVar.f1450f.f1478a);
        long jMsToUs2 = x0i.msToUs(agaVar.f1450f.f1479b);
        aga.C0236d c0236d2 = agaVar.f1450f;
        return new f52(vnaVar, jMsToUs, jMsToUs2, !c0236d2.f1482e, c0236d2.f1480c, c0236d2.f1481d);
    }

    private vna maybeWrapWithAdsMediaSource(aga agaVar, vna vnaVar) {
        u80.checkNotNull(agaVar.f1446b);
        aga.C0234b c0234b = agaVar.f1446b.f1547d;
        if (c0234b == null) {
            return vnaVar;
        }
        InterfaceC14066vh.b bVar = this.f48744f;
        InterfaceC6309gh interfaceC6309gh = this.f48745g;
        if (bVar == null || interfaceC6309gh == null) {
            yh9.m25919w("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return vnaVar;
        }
        InterfaceC14066vh adsLoader = bVar.getAdsLoader(c0234b);
        if (adsLoader == null) {
            yh9.m25919w("DMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
            return vnaVar;
        }
        yh3 yh3Var = new yh3(c0234b.f1454a);
        Object obj = c0234b.f1455b;
        return new C7909ji(vnaVar, yh3Var, obj != null ? obj : kx7.m15113of((Uri) agaVar.f1445a, agaVar.f1446b.f1544a, c0234b.f1454a), this, adsLoader, interfaceC6309gh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vna.InterfaceC14174a newInstance(Class<? extends vna.InterfaceC14174a> cls, ih3.InterfaceC7283a interfaceC7283a) {
        try {
            return cls.getConstructor(ih3.InterfaceC7283a.class).newInstance(interfaceC7283a);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @op1
    public ix3 clearLocalAdInsertionComponents() {
        this.f48744f = null;
        this.f48745g = null;
        return this;
    }

    @Override // p000.vna.InterfaceC14174a
    public vna createMediaSource(aga agaVar) {
        u80.checkNotNull(agaVar.f1446b);
        String scheme = agaVar.f1446b.f1544a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((vna.InterfaceC14174a) u80.checkNotNull(this.f48743e)).createMediaSource(agaVar);
        }
        aga.C0240h c0240h = agaVar.f1446b;
        int iInferContentTypeForUriAndMimeType = x0i.inferContentTypeForUriAndMimeType(c0240h.f1544a, c0240h.f1545b);
        vna.InterfaceC14174a mediaSourceFactory = this.f48741c.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
        u80.checkStateNotNull(mediaSourceFactory, "No suitable media source factory found for content type: " + iInferContentTypeForUriAndMimeType);
        aga.C0239g.a aVarBuildUpon = agaVar.f1448d.buildUpon();
        if (agaVar.f1448d.f1524a == -9223372036854775807L) {
            aVarBuildUpon.setTargetOffsetMs(this.f48747i);
        }
        if (agaVar.f1448d.f1527d == -3.4028235E38f) {
            aVarBuildUpon.setMinPlaybackSpeed(this.f48750l);
        }
        if (agaVar.f1448d.f1528e == -3.4028235E38f) {
            aVarBuildUpon.setMaxPlaybackSpeed(this.f48751m);
        }
        if (agaVar.f1448d.f1525b == -9223372036854775807L) {
            aVarBuildUpon.setMinOffsetMs(this.f48748j);
        }
        if (agaVar.f1448d.f1526c == -9223372036854775807L) {
            aVarBuildUpon.setMaxOffsetMs(this.f48749k);
        }
        aga.C0239g c0239gBuild = aVarBuildUpon.build();
        if (!c0239gBuild.equals(agaVar.f1448d)) {
            agaVar = agaVar.buildUpon().setLiveConfiguration(c0239gBuild).build();
        }
        vna vnaVarCreateMediaSource = mediaSourceFactory.createMediaSource(agaVar);
        kx7<aga.C0243k> kx7Var = ((aga.C0240h) x0i.castNonNull(agaVar.f1446b)).f1550m;
        if (!kx7Var.isEmpty()) {
            vna[] vnaVarArr = new vna[kx7Var.size() + 1];
            vnaVarArr[0] = vnaVarCreateMediaSource;
            for (int i = 0; i < kx7Var.size(); i++) {
                if (this.f48752n) {
                    final kq6 kq6VarBuild = new kq6.C8497b().setSampleMimeType(kx7Var.get(i).f1571b).setLanguage(kx7Var.get(i).f1572c).setSelectionFlags(kx7Var.get(i).f1573d).setRoleFlags(kx7Var.get(i).f1574e).setLabel(kx7Var.get(i).f1575f).setId(kx7Var.get(i).f1576m).build();
                    gfd.C6285b c6285b = new gfd.C6285b(this.f48742d, new hk5() { // from class: vw3
                        @Override // p000.hk5
                        public final yj5[] createExtractors() {
                            return ix3.lambda$createMediaSource$0(kq6VarBuild);
                        }
                    });
                    ic9 ic9Var = this.f48746h;
                    if (ic9Var != null) {
                        c6285b.setLoadErrorHandlingPolicy(ic9Var);
                    }
                    vnaVarArr[i + 1] = c6285b.createMediaSource(aga.fromUri(kx7Var.get(i).f1570a.toString()));
                } else {
                    iof.C7546b c7546b = new iof.C7546b(this.f48742d);
                    ic9 ic9Var2 = this.f48746h;
                    if (ic9Var2 != null) {
                        c7546b.setLoadErrorHandlingPolicy(ic9Var2);
                    }
                    vnaVarArr[i + 1] = c7546b.createMediaSource(kx7Var.get(i), -9223372036854775807L);
                }
            }
            vnaVarCreateMediaSource = new asa(vnaVarArr);
        }
        return maybeWrapWithAdsMediaSource(agaVar, maybeClipMediaSource(agaVar, vnaVarCreateMediaSource));
    }

    @op1
    public ix3 experimentalUseProgressiveMediaSourceForSubtitles(boolean z) {
        this.f48752n = z;
        return this;
    }

    @Override // p000.vna.InterfaceC14174a
    public int[] getSupportedTypes() {
        return this.f48741c.getSupportedTypes();
    }

    @op1
    @Deprecated
    public ix3 setAdViewProvider(@hib InterfaceC6309gh interfaceC6309gh) {
        this.f48745g = interfaceC6309gh;
        return this;
    }

    @op1
    @Deprecated
    public ix3 setAdsLoaderProvider(@hib InterfaceC14066vh.b bVar) {
        this.f48744f = bVar;
        return this;
    }

    @op1
    public ix3 setDataSourceFactory(ih3.InterfaceC7283a interfaceC7283a) {
        this.f48742d = interfaceC7283a;
        this.f48741c.setDataSourceFactory(interfaceC7283a);
        return this;
    }

    @op1
    public ix3 setLiveMaxOffsetMs(long j) {
        this.f48749k = j;
        return this;
    }

    @op1
    public ix3 setLiveMaxSpeed(float f) {
        this.f48751m = f;
        return this;
    }

    @op1
    public ix3 setLiveMinOffsetMs(long j) {
        this.f48748j = j;
        return this;
    }

    @op1
    public ix3 setLiveMinSpeed(float f) {
        this.f48750l = f;
        return this;
    }

    @op1
    public ix3 setLiveTargetOffsetMs(long j) {
        this.f48747i = j;
        return this;
    }

    @op1
    public ix3 setLocalAdInsertionComponents(InterfaceC14066vh.b bVar, InterfaceC6309gh interfaceC6309gh) {
        this.f48744f = (InterfaceC14066vh.b) u80.checkNotNull(bVar);
        this.f48745g = (InterfaceC6309gh) u80.checkNotNull(interfaceC6309gh);
        return this;
    }

    @op1
    public ix3 setServerSideAdInsertionMediaSourceFactory(@hib vna.InterfaceC14174a interfaceC14174a) {
        this.f48743e = interfaceC14174a;
        return this;
    }

    public ix3(Context context, hk5 hk5Var) {
        this(new ot3.C10647a(context), hk5Var);
    }

    @Override // p000.vna.InterfaceC14174a
    @op1
    public ix3 setCmcdConfigurationFactory(k62.InterfaceC8208b interfaceC8208b) {
        this.f48741c.setCmcdConfigurationFactory((k62.InterfaceC8208b) u80.checkNotNull(interfaceC8208b));
        return this;
    }

    @Override // p000.vna.InterfaceC14174a
    @op1
    public ix3 setDrmSessionManagerProvider(rr4 rr4Var) {
        this.f48741c.setDrmSessionManagerProvider((rr4) u80.checkNotNull(rr4Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // p000.vna.InterfaceC14174a
    @op1
    public ix3 setLoadErrorHandlingPolicy(ic9 ic9Var) {
        this.f48746h = (ic9) u80.checkNotNull(ic9Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f48741c.setLoadErrorHandlingPolicy(ic9Var);
        return this;
    }

    public ix3(ih3.InterfaceC7283a interfaceC7283a) {
        this(interfaceC7283a, new dv3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vna.InterfaceC14174a newInstance(Class<? extends vna.InterfaceC14174a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public ix3(ih3.InterfaceC7283a interfaceC7283a, hk5 hk5Var) {
        this.f48742d = interfaceC7283a;
        C7648b c7648b = new C7648b(hk5Var);
        this.f48741c = c7648b;
        c7648b.setDataSourceFactory(interfaceC7283a);
        this.f48747i = -9223372036854775807L;
        this.f48748j = -9223372036854775807L;
        this.f48749k = -9223372036854775807L;
        this.f48750l = -3.4028235E38f;
        this.f48751m = -3.4028235E38f;
    }
}
