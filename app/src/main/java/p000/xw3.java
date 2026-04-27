package p000;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p000.InterfaceC13540uh;
import p000.e52;
import p000.gh3;
import p000.gof;
import p000.gue;
import p000.h62;
import p000.hfd;
import p000.nfa;
import p000.nt3;
import p000.peg;
import p000.rj5;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
public final class xw3 implements loa {

    /* JADX INFO: renamed from: q */
    public static final String f99533q = "DMediaSourceFactory";

    /* JADX INFO: renamed from: c */
    public final C15328b f99534c;

    /* JADX INFO: renamed from: d */
    public gh3.InterfaceC6313a f99535d;

    /* JADX INFO: renamed from: e */
    public peg.InterfaceC10936a f99536e;

    /* JADX INFO: renamed from: f */
    @hib
    public una.InterfaceC13611a f99537f;

    /* JADX INFO: renamed from: g */
    @hib
    public jj5 f99538g;

    /* JADX INFO: renamed from: h */
    @hib
    public InterfaceC13540uh.b f99539h;

    /* JADX INFO: renamed from: i */
    @hib
    public InterfaceC6849hh f99540i;

    /* JADX INFO: renamed from: j */
    @hib
    public hc9 f99541j;

    /* JADX INFO: renamed from: k */
    public long f99542k;

    /* JADX INFO: renamed from: l */
    public long f99543l;

    /* JADX INFO: renamed from: m */
    public long f99544m;

    /* JADX INFO: renamed from: n */
    public float f99545n;

    /* JADX INFO: renamed from: o */
    public float f99546o;

    /* JADX INFO: renamed from: p */
    public boolean f99547p;

    /* JADX INFO: renamed from: xw3$a */
    @ovh
    @Deprecated
    public interface InterfaceC15327a extends InterfaceC13540uh.b {
    }

    /* JADX INFO: renamed from: xw3$b */
    public static final class C15328b {

        /* JADX INFO: renamed from: a */
        public final ik5 f99548a;

        /* JADX INFO: renamed from: d */
        public gh3.InterfaceC6313a f99551d;

        /* JADX INFO: renamed from: f */
        public peg.InterfaceC10936a f99553f;

        /* JADX INFO: renamed from: g */
        public int f99554g;

        /* JADX INFO: renamed from: h */
        @hib
        public h62.InterfaceC6721c f99555h;

        /* JADX INFO: renamed from: i */
        @hib
        public sr4 f99556i;

        /* JADX INFO: renamed from: j */
        @hib
        public hc9 f99557j;

        /* JADX INFO: renamed from: b */
        public final Map<Integer, lfg<una.InterfaceC13611a>> f99549b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final Map<Integer, una.InterfaceC13611a> f99550c = new HashMap();

        /* JADX INFO: renamed from: e */
        public boolean f99552e = true;

        public C15328b(ik5 ik5Var, peg.InterfaceC10936a interfaceC10936a) {
            this.f99548a = ik5Var;
            this.f99553f = interfaceC10936a;
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ una.InterfaceC13611a lambda$loadSupplier$4(gh3.InterfaceC6313a interfaceC6313a) {
            return new hfd.C6836b(interfaceC6313a, this.f99548a);
        }

        private lfg<una.InterfaceC13611a> loadSupplier(int i) throws ClassNotFoundException {
            lfg<una.InterfaceC13611a> lfgVar;
            lfg<una.InterfaceC13611a> lfgVar2;
            lfg<una.InterfaceC13611a> lfgVar3 = this.f99549b.get(Integer.valueOf(i));
            if (lfgVar3 != null) {
                return lfgVar3;
            }
            final gh3.InterfaceC6313a interfaceC6313a = (gh3.InterfaceC6313a) v80.checkNotNull(this.f99551d);
            if (i == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(una.InterfaceC13611a.class);
                lfgVar = new lfg() { // from class: zw3
                    @Override // p000.lfg
                    public final Object get() {
                        return xw3.m25505c(clsAsSubclass, interfaceC6313a);
                    }
                };
            } else if (i == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(una.InterfaceC13611a.class);
                lfgVar = new lfg() { // from class: bx3
                    @Override // p000.lfg
                    public final Object get() {
                        return xw3.m25505c(clsAsSubclass2, interfaceC6313a);
                    }
                };
            } else {
                if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(una.InterfaceC13611a.class);
                        lfgVar2 = new lfg() { // from class: fx3
                            @Override // p000.lfg
                            public final Object get() {
                                return xw3.m25504b(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i);
                        }
                        lfgVar2 = new lfg() { // from class: hx3
                            @Override // p000.lfg
                            public final Object get() {
                                return this.f45183a.lambda$loadSupplier$4(interfaceC6313a);
                            }
                        };
                    }
                    this.f99549b.put(Integer.valueOf(i), lfgVar2);
                    return lfgVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(una.InterfaceC13611a.class);
                lfgVar = new lfg() { // from class: dx3
                    @Override // p000.lfg
                    public final Object get() {
                        return xw3.m25505c(clsAsSubclass4, interfaceC6313a);
                    }
                };
            }
            lfgVar2 = lfgVar;
            this.f99549b.put(Integer.valueOf(i), lfgVar2);
            return lfgVar2;
        }

        @op1
        @hib
        private lfg<una.InterfaceC13611a> maybeLoadSupplier(int i) {
            try {
                return loadSupplier(i);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public una.InterfaceC13611a getMediaSourceFactory(int i) throws ClassNotFoundException {
            una.InterfaceC13611a interfaceC13611a = this.f99550c.get(Integer.valueOf(i));
            if (interfaceC13611a != null) {
                return interfaceC13611a;
            }
            una.InterfaceC13611a interfaceC13611a2 = loadSupplier(i).get();
            h62.InterfaceC6721c interfaceC6721c = this.f99555h;
            if (interfaceC6721c != null) {
                interfaceC13611a2.setCmcdConfigurationFactory(interfaceC6721c);
            }
            sr4 sr4Var = this.f99556i;
            if (sr4Var != null) {
                interfaceC13611a2.setDrmSessionManagerProvider(sr4Var);
            }
            hc9 hc9Var = this.f99557j;
            if (hc9Var != null) {
                interfaceC13611a2.setLoadErrorHandlingPolicy(hc9Var);
            }
            interfaceC13611a2.setSubtitleParserFactory(this.f99553f);
            interfaceC13611a2.experimentalParseSubtitlesDuringExtraction(this.f99552e);
            interfaceC13611a2.experimentalSetCodecsToParseWithinGopSampleDependencies(this.f99554g);
            this.f99550c.put(Integer.valueOf(i), interfaceC13611a2);
            return interfaceC13611a2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return rd8.toArray(this.f99549b.keySet());
        }

        public void setCmcdConfigurationFactory(h62.InterfaceC6721c interfaceC6721c) {
            this.f99555h = interfaceC6721c;
            Iterator<una.InterfaceC13611a> it = this.f99550c.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(interfaceC6721c);
            }
        }

        public void setCodecsToParseWithinGopSampleDependencies(int i) {
            this.f99554g = i;
            this.f99548a.experimentalSetCodecsToParseWithinGopSampleDependencies(i);
        }

        public void setDataSourceFactory(gh3.InterfaceC6313a interfaceC6313a) {
            if (interfaceC6313a != this.f99551d) {
                this.f99551d = interfaceC6313a;
                this.f99549b.clear();
                this.f99550c.clear();
            }
        }

        public void setDrmSessionManagerProvider(sr4 sr4Var) {
            this.f99556i = sr4Var;
            Iterator<una.InterfaceC13611a> it = this.f99550c.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(sr4Var);
            }
        }

        public void setJpegExtractorFlags(int i) {
            ik5 ik5Var = this.f99548a;
            if (ik5Var instanceof cv3) {
                ((cv3) ik5Var).setJpegExtractorFlags(i);
            }
        }

        public void setLoadErrorHandlingPolicy(hc9 hc9Var) {
            this.f99557j = hc9Var;
            Iterator<una.InterfaceC13611a> it = this.f99550c.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(hc9Var);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z) {
            this.f99552e = z;
            this.f99548a.experimentalSetTextTrackTranscodingEnabled(z);
            Iterator<una.InterfaceC13611a> it = this.f99550c.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z);
            }
        }

        public void setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
            this.f99553f = interfaceC10936a;
            this.f99548a.setSubtitleParserFactory(interfaceC10936a);
            Iterator<una.InterfaceC13611a> it = this.f99550c.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(interfaceC10936a);
            }
        }
    }

    /* JADX INFO: renamed from: xw3$c */
    public static final class C15329c implements xj5 {

        /* JADX INFO: renamed from: d */
        public final C1213a f99558d;

        public C15329c(C1213a c1213a) {
            this.f99558d = c1213a;
        }

        @Override // p000.xj5
        public void init(bk5 bk5Var) {
            q6h q6hVarTrack = bk5Var.track(0, 3);
            bk5Var.seekMap(new gue.C6549b(-9223372036854775807L));
            bk5Var.endTracks();
            q6hVarTrack.format(this.f99558d.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(this.f99558d.f8291o).build());
        }

        @Override // p000.xj5
        public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
            return ak5Var.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // p000.xj5
        public void release() {
        }

        @Override // p000.xj5
        public void seek(long j, long j2) {
        }

        @Override // p000.xj5
        public boolean sniff(ak5 ak5Var) {
            return true;
        }
    }

    public xw3(Context context) {
        this(new nt3.C10051a(context));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ una.InterfaceC13611a m25504b(Class cls) {
        return newInstance(cls);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ una.InterfaceC13611a m25505c(Class cls, gh3.InterfaceC6313a interfaceC6313a) {
        return newInstance(cls, interfaceC6313a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xj5[] lambda$createMediaSource$0(C1213a c1213a) {
        return new xj5[]{this.f99536e.supportsFormat(c1213a) ? new geg(this.f99536e.create(c1213a), null) : new C15329c(c1213a)};
    }

    private static una maybeClipMediaSource(nfa nfaVar, una unaVar) {
        nfa.C9852d c9852d = nfaVar.f64309f;
        return (c9852d.f64341b == 0 && c9852d.f64343d == Long.MIN_VALUE && !c9852d.f64345f) ? unaVar : new e52.C5119b(unaVar).setStartPositionUs(nfaVar.f64309f.f64341b).setEndPositionUs(nfaVar.f64309f.f64343d).setEnableInitialDiscontinuity(!nfaVar.f64309f.f64346g).setAllowDynamicClippingUpdates(nfaVar.f64309f.f64344e).setRelativeToDefaultPosition(nfaVar.f64309f.f64345f).setAllowUnseekableMedia(nfaVar.f64309f.f64347h).build();
    }

    private una maybeWrapWithAdsMediaSource(nfa nfaVar, una unaVar) {
        v80.checkNotNull(nfaVar.f64305b);
        nfa.C9850b c9850b = nfaVar.f64305b.f64409d;
        if (c9850b == null) {
            return unaVar;
        }
        InterfaceC13540uh.b bVar = this.f99539h;
        InterfaceC6849hh interfaceC6849hh = this.f99540i;
        if (bVar == null || interfaceC6849hh == null) {
            xh9.m25148w("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return unaVar;
        }
        InterfaceC13540uh adsLoader = bVar.getAdsLoader(c9850b);
        if (adsLoader == null) {
            xh9.m25148w("DMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
            return unaVar;
        }
        xh3 xh3Var = new xh3(c9850b.f64313a);
        Object obj = c9850b.f64314b;
        return new C2317ci(unaVar, xh3Var, obj != null ? obj : kx7.m15113of((Uri) nfaVar.f64304a, nfaVar.f64305b.f64406a, c9850b.f64313a), this, adsLoader, interfaceC6849hh, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static una.InterfaceC13611a newInstance(Class<? extends una.InterfaceC13611a> cls, gh3.InterfaceC6313a interfaceC6313a) {
        try {
            return cls.getConstructor(gh3.InterfaceC6313a.class).newInstance(interfaceC6313a);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @op1
    public xw3 clearLocalAdInsertionComponents() {
        this.f99539h = null;
        this.f99540i = null;
        return this;
    }

    @Override // p000.una.InterfaceC13611a
    @ovh
    public una createMediaSource(nfa nfaVar) {
        v80.checkNotNull(nfaVar.f64305b);
        String scheme = nfaVar.f64305b.f64406a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((una.InterfaceC13611a) v80.checkNotNull(this.f99537f)).createMediaSource(nfaVar);
        }
        if (Objects.equals(nfaVar.f64305b.f64407b, rva.f79796U0)) {
            return new rj5.C12117b(t0i.msToUs(nfaVar.f64305b.f64415j), (jj5) v80.checkNotNull(this.f99538g)).createMediaSource(nfaVar);
        }
        nfa.C9856h c9856h = nfaVar.f64305b;
        int iInferContentTypeForUriAndMimeType = t0i.inferContentTypeForUriAndMimeType(c9856h.f64406a, c9856h.f64407b);
        if (nfaVar.f64305b.f64415j != -9223372036854775807L) {
            this.f99534c.setJpegExtractorFlags(1);
        }
        try {
            una.InterfaceC13611a mediaSourceFactory = this.f99534c.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
            nfa.C9855g.a aVarBuildUpon = nfaVar.f64307d.buildUpon();
            if (nfaVar.f64307d.f64388a == -9223372036854775807L) {
                aVarBuildUpon.setTargetOffsetMs(this.f99542k);
            }
            if (nfaVar.f64307d.f64391d == -3.4028235E38f) {
                aVarBuildUpon.setMinPlaybackSpeed(this.f99545n);
            }
            if (nfaVar.f64307d.f64392e == -3.4028235E38f) {
                aVarBuildUpon.setMaxPlaybackSpeed(this.f99546o);
            }
            if (nfaVar.f64307d.f64389b == -9223372036854775807L) {
                aVarBuildUpon.setMinOffsetMs(this.f99543l);
            }
            if (nfaVar.f64307d.f64390c == -9223372036854775807L) {
                aVarBuildUpon.setMaxOffsetMs(this.f99544m);
            }
            nfa.C9855g c9855gBuild = aVarBuildUpon.build();
            if (!c9855gBuild.equals(nfaVar.f64307d)) {
                nfaVar = nfaVar.buildUpon().setLiveConfiguration(c9855gBuild).build();
            }
            una unaVarCreateMediaSource = mediaSourceFactory.createMediaSource(nfaVar);
            kx7<nfa.C9859k> kx7Var = ((nfa.C9856h) t0i.castNonNull(nfaVar.f64305b)).f64412g;
            if (!kx7Var.isEmpty()) {
                una[] unaVarArr = new una[kx7Var.size() + 1];
                unaVarArr[0] = unaVarCreateMediaSource;
                for (int i = 0; i < kx7Var.size(); i++) {
                    if (this.f99547p) {
                        final C1213a c1213aBuild = new C1213a.b().setSampleMimeType(kx7Var.get(i).f64434b).setLanguage(kx7Var.get(i).f64435c).setSelectionFlags(kx7Var.get(i).f64436d).setRoleFlags(kx7Var.get(i).f64437e).setLabel(kx7Var.get(i).f64438f).setId(kx7Var.get(i).f64439g).build();
                        hfd.C6836b c6836b = new hfd.C6836b(this.f99535d, new ik5() { // from class: ww3
                            @Override // p000.ik5
                            public final xj5[] createExtractors() {
                                return this.f95593b.lambda$createMediaSource$0(c1213aBuild);
                            }
                        });
                        if (this.f99536e.supportsFormat(c1213aBuild)) {
                            c1213aBuild = c1213aBuild.buildUpon().setSampleMimeType(rva.f79794T0).setCodecs(c1213aBuild.f8291o).setCueReplacementBehavior(this.f99536e.getCueReplacementBehavior(c1213aBuild)).build();
                        }
                        hfd.C6836b c6836bM12352c = c6836b.m12352c(0, c1213aBuild);
                        hc9 hc9Var = this.f99541j;
                        if (hc9Var != null) {
                            c6836bM12352c.setLoadErrorHandlingPolicy(hc9Var);
                        }
                        unaVarArr[i + 1] = c6836bM12352c.createMediaSource(nfa.fromUri(kx7Var.get(i).f64433a.toString()));
                    } else {
                        gof.C6450b c6450b = new gof.C6450b(this.f99535d);
                        hc9 hc9Var2 = this.f99541j;
                        if (hc9Var2 != null) {
                            c6450b.setLoadErrorHandlingPolicy(hc9Var2);
                        }
                        unaVarArr[i + 1] = c6450b.createMediaSource(kx7Var.get(i), -9223372036854775807L);
                    }
                }
                unaVarCreateMediaSource = new zra(unaVarArr);
            }
            return maybeWrapWithAdsMediaSource(nfaVar, maybeClipMediaSource(nfaVar, unaVarCreateMediaSource));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p000.una.InterfaceC13611a
    @ovh
    public int[] getSupportedTypes() {
        return this.f99534c.getSupportedTypes();
    }

    @op1
    @ovh
    @Deprecated
    public xw3 setAdViewProvider(@hib InterfaceC6849hh interfaceC6849hh) {
        this.f99540i = interfaceC6849hh;
        return this;
    }

    @op1
    @ovh
    @Deprecated
    public xw3 setAdsLoaderProvider(@hib InterfaceC13540uh.b bVar) {
        this.f99539h = bVar;
        return this;
    }

    @op1
    public xw3 setDataSourceFactory(gh3.InterfaceC6313a interfaceC6313a) {
        this.f99535d = interfaceC6313a;
        this.f99534c.setDataSourceFactory(interfaceC6313a);
        return this;
    }

    @op1
    @ovh
    public xw3 setExternalImageLoader(@hib jj5 jj5Var) {
        this.f99538g = jj5Var;
        return this;
    }

    @op1
    @ovh
    public xw3 setLiveMaxOffsetMs(long j) {
        this.f99544m = j;
        return this;
    }

    @op1
    @ovh
    public xw3 setLiveMaxSpeed(float f) {
        this.f99546o = f;
        return this;
    }

    @op1
    @ovh
    public xw3 setLiveMinOffsetMs(long j) {
        this.f99543l = j;
        return this;
    }

    @op1
    @ovh
    public xw3 setLiveMinSpeed(float f) {
        this.f99545n = f;
        return this;
    }

    @op1
    @ovh
    public xw3 setLiveTargetOffsetMs(long j) {
        this.f99542k = j;
        return this;
    }

    @op1
    public xw3 setLocalAdInsertionComponents(InterfaceC13540uh.b bVar, InterfaceC6849hh interfaceC6849hh) {
        this.f99539h = (InterfaceC13540uh.b) v80.checkNotNull(bVar);
        this.f99540i = (InterfaceC6849hh) v80.checkNotNull(interfaceC6849hh);
        return this;
    }

    @op1
    public xw3 setServerSideAdInsertionMediaSourceFactory(@hib una.InterfaceC13611a interfaceC13611a) {
        this.f99537f = interfaceC13611a;
        return this;
    }

    @ovh
    public xw3(Context context, ik5 ik5Var) {
        this(new nt3.C10051a(context), ik5Var);
    }

    @Override // p000.una.InterfaceC13611a
    @op1
    @ovh
    @Deprecated
    public xw3 experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.f99547p = z;
        this.f99534c.setParseSubtitlesDuringExtraction(z);
        return this;
    }

    @Override // p000.una.InterfaceC13611a
    @op1
    @ovh
    public xw3 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        this.f99534c.setCodecsToParseWithinGopSampleDependencies(i);
        return this;
    }

    @Override // p000.una.InterfaceC13611a
    @op1
    @ovh
    public xw3 setCmcdConfigurationFactory(h62.InterfaceC6721c interfaceC6721c) {
        this.f99534c.setCmcdConfigurationFactory((h62.InterfaceC6721c) v80.checkNotNull(interfaceC6721c));
        return this;
    }

    @Override // p000.una.InterfaceC13611a
    @op1
    @ovh
    public xw3 setDrmSessionManagerProvider(sr4 sr4Var) {
        this.f99534c.setDrmSessionManagerProvider((sr4) v80.checkNotNull(sr4Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // p000.una.InterfaceC13611a
    @op1
    @ovh
    public xw3 setLoadErrorHandlingPolicy(hc9 hc9Var) {
        this.f99541j = (hc9) v80.checkNotNull(hc9Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f99534c.setLoadErrorHandlingPolicy(hc9Var);
        return this;
    }

    @Override // p000.una.InterfaceC13611a
    @op1
    @ovh
    public xw3 setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
        this.f99536e = (peg.InterfaceC10936a) v80.checkNotNull(interfaceC10936a);
        this.f99534c.setSubtitleParserFactory(interfaceC10936a);
        return this;
    }

    @ovh
    public xw3(gh3.InterfaceC6313a interfaceC6313a) {
        this(interfaceC6313a, new cv3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static una.InterfaceC13611a newInstance(Class<? extends una.InterfaceC13611a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @ovh
    public xw3(gh3.InterfaceC6313a interfaceC6313a, ik5 ik5Var) {
        this.f99535d = interfaceC6313a;
        oz3 oz3Var = new oz3();
        this.f99536e = oz3Var;
        C15328b c15328b = new C15328b(ik5Var, oz3Var);
        this.f99534c = c15328b;
        c15328b.setDataSourceFactory(interfaceC6313a);
        this.f99542k = -9223372036854775807L;
        this.f99543l = -9223372036854775807L;
        this.f99544m = -9223372036854775807L;
        this.f99545n = -3.4028235E38f;
        this.f99546o = -3.4028235E38f;
        this.f99547p = true;
    }
}
