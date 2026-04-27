package p000;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p000.kx7;
import p000.nfa;

/* JADX INFO: loaded from: classes3.dex */
public final class nfa {

    /* JADX INFO: renamed from: i */
    public static final String f64296i = "";

    /* JADX INFO: renamed from: j */
    public static final nfa f64297j = new C9851c().build();

    /* JADX INFO: renamed from: k */
    public static final String f64298k = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: l */
    public static final String f64299l = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: m */
    public static final String f64300m = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: n */
    public static final String f64301n = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: o */
    public static final String f64302o = t0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: p */
    public static final String f64303p = t0i.intToStringMaxRadix(5);

    /* JADX INFO: renamed from: a */
    public final String f64304a;

    /* JADX INFO: renamed from: b */
    @hib
    public final C9856h f64305b;

    /* JADX INFO: renamed from: c */
    @hib
    @ovh
    @Deprecated
    public final C9856h f64306c;

    /* JADX INFO: renamed from: d */
    public final C9855g f64307d;

    /* JADX INFO: renamed from: e */
    public final hga f64308e;

    /* JADX INFO: renamed from: f */
    public final C9852d f64309f;

    /* JADX INFO: renamed from: g */
    @ovh
    @Deprecated
    public final C9853e f64310g;

    /* JADX INFO: renamed from: h */
    public final C9857i f64311h;

    /* JADX INFO: renamed from: nfa$b */
    public static final class C9850b {

        /* JADX INFO: renamed from: c */
        public static final String f64312c = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: a */
        public final Uri f64313a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Object f64314b;

        /* JADX INFO: renamed from: nfa$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f64315a;

            /* JADX INFO: renamed from: b */
            @hib
            public Object f64316b;

            public a(Uri uri) {
                this.f64315a = uri;
            }

            public C9850b build() {
                return new C9850b(this);
            }

            @op1
            public a setAdTagUri(Uri uri) {
                this.f64315a = uri;
                return this;
            }

            @op1
            public a setAdsId(@hib Object obj) {
                this.f64316b = obj;
                return this;
            }
        }

        @ovh
        public static C9850b fromBundle(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f64312c);
            v80.checkNotNull(uri);
            return new a(uri).build();
        }

        public a buildUpon() {
            return new a(this.f64313a).setAdsId(this.f64314b);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9850b)) {
                return false;
            }
            C9850b c9850b = (C9850b) obj;
            return this.f64313a.equals(c9850b.f64313a) && Objects.equals(this.f64314b, c9850b.f64314b);
        }

        public int hashCode() {
            int iHashCode = this.f64313a.hashCode() * 31;
            Object obj = this.f64314b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f64312c, this.f64313a);
            return bundle;
        }

        private C9850b(a aVar) {
            this.f64313a = aVar.f64315a;
            this.f64314b = aVar.f64316b;
        }
    }

    /* JADX INFO: renamed from: nfa$c */
    public static final class C9851c {

        /* JADX INFO: renamed from: a */
        @hib
        public String f64317a;

        /* JADX INFO: renamed from: b */
        @hib
        public Uri f64318b;

        /* JADX INFO: renamed from: c */
        @hib
        public String f64319c;

        /* JADX INFO: renamed from: d */
        public C9852d.a f64320d;

        /* JADX INFO: renamed from: e */
        public C9854f.a f64321e;

        /* JADX INFO: renamed from: f */
        public List<StreamKey> f64322f;

        /* JADX INFO: renamed from: g */
        @hib
        public String f64323g;

        /* JADX INFO: renamed from: h */
        public kx7<C9859k> f64324h;

        /* JADX INFO: renamed from: i */
        @hib
        public C9850b f64325i;

        /* JADX INFO: renamed from: j */
        @hib
        public Object f64326j;

        /* JADX INFO: renamed from: k */
        public long f64327k;

        /* JADX INFO: renamed from: l */
        @hib
        public hga f64328l;

        /* JADX INFO: renamed from: m */
        public C9855g.a f64329m;

        /* JADX INFO: renamed from: n */
        public C9857i f64330n;

        public nfa build() {
            C9856h c9856h;
            v80.checkState(this.f64321e.f64375b == null || this.f64321e.f64374a != null);
            Uri uri = this.f64318b;
            if (uri != null) {
                c9856h = new C9856h(uri, this.f64319c, this.f64321e.f64374a != null ? this.f64321e.build() : null, this.f64325i, this.f64322f, this.f64323g, this.f64324h, this.f64326j, this.f64327k);
            } else {
                c9856h = null;
            }
            String str = this.f64317a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C9853e c9853eBuildClippingProperties = this.f64320d.buildClippingProperties();
            C9855g c9855gBuild = this.f64329m.build();
            hga hgaVar = this.f64328l;
            if (hgaVar == null) {
                hgaVar = hga.f43470X0;
            }
            return new nfa(str2, c9853eBuildClippingProperties, c9856h, c9855gBuild, hgaVar, this.f64330n);
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setAdTagUri(@hib String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        @op1
        public C9851c setAdsConfiguration(@hib C9850b c9850b) {
            this.f64325i = c9850b;
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setClipEndPositionMs(long j) {
            this.f64320d.setEndPositionMs(j);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setClipRelativeToDefaultPosition(boolean z) {
            this.f64320d.setRelativeToDefaultPosition(z);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setClipRelativeToLiveWindow(boolean z) {
            this.f64320d.setRelativeToLiveWindow(z);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setClipStartPositionMs(@h78(from = 0) long j) {
            this.f64320d.setStartPositionMs(j);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setClipStartsAtKeyFrame(boolean z) {
            this.f64320d.setStartsAtKeyFrame(z);
            return this;
        }

        @op1
        public C9851c setClippingConfiguration(C9852d c9852d) {
            this.f64320d = c9852d.buildUpon();
            return this;
        }

        @op1
        @ovh
        public C9851c setCustomCacheKey(@hib String str) {
            this.f64323g = str;
            return this;
        }

        @op1
        public C9851c setDrmConfiguration(@hib C9854f c9854f) {
            this.f64321e = c9854f != null ? c9854f.buildUpon() : new C9854f.a();
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmForceDefaultLicenseUri(boolean z) {
            this.f64321e.setForceDefaultLicenseUri(z);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmKeySetId(@hib byte[] bArr) {
            this.f64321e.setKeySetId(bArr);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmLicenseRequestHeaders(@hib Map<String, String> map) {
            C9854f.a aVar = this.f64321e;
            if (map == null) {
                map = ox7.m19076of();
            }
            aVar.setLicenseRequestHeaders(map);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmLicenseUri(@hib Uri uri) {
            this.f64321e.setLicenseUri(uri);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmMultiSession(boolean z) {
            this.f64321e.setMultiSession(z);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmPlayClearContentWithoutKey(boolean z) {
            this.f64321e.setPlayClearContentWithoutKey(z);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmSessionForClearPeriods(boolean z) {
            this.f64321e.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmSessionForClearTypes(@hib List<Integer> list) {
            C9854f.a aVar = this.f64321e;
            if (list == null) {
                list = kx7.m15110of();
            }
            aVar.setForcedSessionTrackTypes(list);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmUuid(@hib UUID uuid) {
            this.f64321e.setNullableScheme(uuid);
            return this;
        }

        @op1
        @ovh
        public C9851c setImageDurationMs(long j) {
            v80.checkArgument(j > 0 || j == -9223372036854775807L);
            this.f64327k = j;
            return this;
        }

        @op1
        public C9851c setLiveConfiguration(C9855g c9855g) {
            this.f64329m = c9855g.buildUpon();
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setLiveMaxOffsetMs(long j) {
            this.f64329m.setMaxOffsetMs(j);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setLiveMaxPlaybackSpeed(float f) {
            this.f64329m.setMaxPlaybackSpeed(f);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setLiveMinOffsetMs(long j) {
            this.f64329m.setMinOffsetMs(j);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setLiveMinPlaybackSpeed(float f) {
            this.f64329m.setMinPlaybackSpeed(f);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setLiveTargetOffsetMs(long j) {
            this.f64329m.setTargetOffsetMs(j);
            return this;
        }

        @op1
        public C9851c setMediaId(String str) {
            this.f64317a = (String) v80.checkNotNull(str);
            return this;
        }

        @op1
        public C9851c setMediaMetadata(hga hgaVar) {
            this.f64328l = hgaVar;
            return this;
        }

        @op1
        public C9851c setMimeType(@hib String str) {
            this.f64319c = str;
            return this;
        }

        @op1
        public C9851c setRequestMetadata(C9857i c9857i) {
            this.f64330n = c9857i;
            return this;
        }

        @op1
        @ovh
        public C9851c setStreamKeys(@hib List<StreamKey> list) {
            this.f64322f = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        @op1
        public C9851c setSubtitleConfigurations(List<C9859k> list) {
            this.f64324h = kx7.copyOf((Collection) list);
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setSubtitles(@hib List<C9858j> list) {
            this.f64324h = list != null ? kx7.copyOf((Collection) list) : kx7.m15110of();
            return this;
        }

        @op1
        public C9851c setTag(@hib Object obj) {
            this.f64326j = obj;
            return this;
        }

        @op1
        public C9851c setUri(@hib String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public C9851c() {
            this.f64320d = new C9852d.a();
            this.f64321e = new C9854f.a();
            this.f64322f = Collections.emptyList();
            this.f64324h = kx7.m15110of();
            this.f64329m = new C9855g.a();
            this.f64330n = C9857i.f64416d;
            this.f64327k = -9223372036854775807L;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setAdTagUri(@hib Uri uri) {
            return setAdTagUri(uri, null);
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setDrmLicenseUri(@hib String str) {
            this.f64321e.setLicenseUri(str);
            return this;
        }

        @op1
        public C9851c setUri(@hib Uri uri) {
            this.f64318b = uri;
            return this;
        }

        @op1
        @ovh
        @Deprecated
        public C9851c setAdTagUri(@hib Uri uri, @hib Object obj) {
            this.f64325i = uri != null ? new C9850b.a(uri).setAdsId(obj).build() : null;
            return this;
        }

        private C9851c(nfa nfaVar) {
            C9854f.a aVar;
            this();
            this.f64320d = nfaVar.f64309f.buildUpon();
            this.f64317a = nfaVar.f64304a;
            this.f64328l = nfaVar.f64308e;
            this.f64329m = nfaVar.f64307d.buildUpon();
            this.f64330n = nfaVar.f64311h;
            C9856h c9856h = nfaVar.f64305b;
            if (c9856h != null) {
                this.f64323g = c9856h.f64411f;
                this.f64319c = c9856h.f64407b;
                this.f64318b = c9856h.f64406a;
                this.f64322f = c9856h.f64410e;
                this.f64324h = c9856h.f64412g;
                this.f64326j = c9856h.f64414i;
                C9854f c9854f = c9856h.f64408c;
                if (c9854f != null) {
                    aVar = c9854f.buildUpon();
                } else {
                    aVar = new C9854f.a();
                }
                this.f64321e = aVar;
                this.f64325i = c9856h.f64409d;
                this.f64327k = c9856h.f64415j;
            }
        }
    }

    /* JADX INFO: renamed from: nfa$d */
    public static class C9852d {

        /* JADX INFO: renamed from: i */
        public static final C9852d f64331i = new a().build();

        /* JADX INFO: renamed from: j */
        public static final String f64332j = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: k */
        public static final String f64333k = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: l */
        public static final String f64334l = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: m */
        public static final String f64335m = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: n */
        public static final String f64336n = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: o */
        @fdi
        public static final String f64337o = t0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: p */
        @fdi
        public static final String f64338p = t0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: q */
        public static final String f64339q = t0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: a */
        @h78(from = 0)
        public final long f64340a;

        /* JADX INFO: renamed from: b */
        @h78(from = 0)
        @ovh
        public final long f64341b;

        /* JADX INFO: renamed from: c */
        public final long f64342c;

        /* JADX INFO: renamed from: d */
        @ovh
        public final long f64343d;

        /* JADX INFO: renamed from: e */
        public final boolean f64344e;

        /* JADX INFO: renamed from: f */
        public final boolean f64345f;

        /* JADX INFO: renamed from: g */
        public final boolean f64346g;

        /* JADX INFO: renamed from: h */
        @ovh
        public final boolean f64347h;

        /* JADX INFO: renamed from: nfa$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f64348a;

            /* JADX INFO: renamed from: b */
            public long f64349b;

            /* JADX INFO: renamed from: c */
            public boolean f64350c;

            /* JADX INFO: renamed from: d */
            public boolean f64351d;

            /* JADX INFO: renamed from: e */
            public boolean f64352e;

            /* JADX INFO: renamed from: f */
            public boolean f64353f;

            public C9852d build() {
                return new C9852d(this);
            }

            @ovh
            @Deprecated
            public C9853e buildClippingProperties() {
                return new C9853e(this);
            }

            @op1
            @ovh
            public a setAllowUnseekableMedia(boolean z) {
                this.f64353f = z;
                return this;
            }

            @op1
            public a setEndPositionMs(long j) {
                return setEndPositionUs(t0i.msToUs(j));
            }

            @op1
            @ovh
            public a setEndPositionUs(long j) {
                v80.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.f64349b = j;
                return this;
            }

            @op1
            public a setRelativeToDefaultPosition(boolean z) {
                this.f64351d = z;
                return this;
            }

            @op1
            public a setRelativeToLiveWindow(boolean z) {
                this.f64350c = z;
                return this;
            }

            @op1
            public a setStartPositionMs(@h78(from = 0) long j) {
                return setStartPositionUs(t0i.msToUs(j));
            }

            @op1
            @ovh
            public a setStartPositionUs(@h78(from = 0) long j) {
                v80.checkArgument(j >= 0);
                this.f64348a = j;
                return this;
            }

            @op1
            public a setStartsAtKeyFrame(boolean z) {
                this.f64352e = z;
                return this;
            }

            public a() {
                this.f64349b = Long.MIN_VALUE;
            }

            private a(C9852d c9852d) {
                this.f64348a = c9852d.f64341b;
                this.f64349b = c9852d.f64343d;
                this.f64350c = c9852d.f64344e;
                this.f64351d = c9852d.f64345f;
                this.f64352e = c9852d.f64346g;
                this.f64353f = c9852d.f64347h;
            }
        }

        @ovh
        public static C9853e fromBundle(Bundle bundle) {
            a aVar = new a();
            String str = f64332j;
            C9852d c9852d = f64331i;
            a allowUnseekableMedia = aVar.setStartPositionMs(bundle.getLong(str, c9852d.f64340a)).setEndPositionMs(bundle.getLong(f64333k, c9852d.f64342c)).setRelativeToLiveWindow(bundle.getBoolean(f64334l, c9852d.f64344e)).setRelativeToDefaultPosition(bundle.getBoolean(f64335m, c9852d.f64345f)).setStartsAtKeyFrame(bundle.getBoolean(f64336n, c9852d.f64346g)).setAllowUnseekableMedia(bundle.getBoolean(f64339q, c9852d.f64347h));
            long j = bundle.getLong(f64337o, c9852d.f64341b);
            if (j != c9852d.f64341b) {
                allowUnseekableMedia.setStartPositionUs(j);
            }
            long j2 = bundle.getLong(f64338p, c9852d.f64343d);
            if (j2 != c9852d.f64343d) {
                allowUnseekableMedia.setEndPositionUs(j2);
            }
            return allowUnseekableMedia.buildClippingProperties();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9852d)) {
                return false;
            }
            C9852d c9852d = (C9852d) obj;
            return this.f64341b == c9852d.f64341b && this.f64343d == c9852d.f64343d && this.f64344e == c9852d.f64344e && this.f64345f == c9852d.f64345f && this.f64346g == c9852d.f64346g && this.f64347h == c9852d.f64347h;
        }

        public int hashCode() {
            long j = this.f64341b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f64343d;
            return ((((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f64344e ? 1 : 0)) * 31) + (this.f64345f ? 1 : 0)) * 31) + (this.f64346g ? 1 : 0)) * 31) + (this.f64347h ? 1 : 0);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f64340a;
            C9852d c9852d = f64331i;
            if (j != c9852d.f64340a) {
                bundle.putLong(f64332j, j);
            }
            long j2 = this.f64342c;
            if (j2 != c9852d.f64342c) {
                bundle.putLong(f64333k, j2);
            }
            long j3 = this.f64341b;
            if (j3 != c9852d.f64341b) {
                bundle.putLong(f64337o, j3);
            }
            long j4 = this.f64343d;
            if (j4 != c9852d.f64343d) {
                bundle.putLong(f64338p, j4);
            }
            boolean z = this.f64344e;
            if (z != c9852d.f64344e) {
                bundle.putBoolean(f64334l, z);
            }
            boolean z2 = this.f64345f;
            if (z2 != c9852d.f64345f) {
                bundle.putBoolean(f64335m, z2);
            }
            boolean z3 = this.f64346g;
            if (z3 != c9852d.f64346g) {
                bundle.putBoolean(f64336n, z3);
            }
            boolean z4 = this.f64347h;
            if (z4 != c9852d.f64347h) {
                bundle.putBoolean(f64339q, z4);
            }
            return bundle;
        }

        private C9852d(a aVar) {
            this.f64340a = t0i.usToMs(aVar.f64348a);
            this.f64342c = t0i.usToMs(aVar.f64349b);
            this.f64341b = aVar.f64348a;
            this.f64343d = aVar.f64349b;
            this.f64344e = aVar.f64350c;
            this.f64345f = aVar.f64351d;
            this.f64346g = aVar.f64352e;
            this.f64347h = aVar.f64353f;
        }
    }

    /* JADX INFO: renamed from: nfa$e */
    @ovh
    @Deprecated
    public static final class C9853e extends C9852d {

        /* JADX INFO: renamed from: r */
        public static final C9853e f64354r = new C9852d.a().buildClippingProperties();

        private C9853e(C9852d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: nfa$f */
    public static final class C9854f {

        /* JADX INFO: renamed from: l */
        public static final String f64355l = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: m */
        public static final String f64356m = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: n */
        public static final String f64357n = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: o */
        public static final String f64358o = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: p */
        @fdi
        public static final String f64359p = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: q */
        public static final String f64360q = t0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: r */
        public static final String f64361r = t0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: s */
        public static final String f64362s = t0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: a */
        public final UUID f64363a;

        /* JADX INFO: renamed from: b */
        @ovh
        @Deprecated
        public final UUID f64364b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Uri f64365c;

        /* JADX INFO: renamed from: d */
        @ovh
        @Deprecated
        public final ox7<String, String> f64366d;

        /* JADX INFO: renamed from: e */
        public final ox7<String, String> f64367e;

        /* JADX INFO: renamed from: f */
        public final boolean f64368f;

        /* JADX INFO: renamed from: g */
        public final boolean f64369g;

        /* JADX INFO: renamed from: h */
        public final boolean f64370h;

        /* JADX INFO: renamed from: i */
        @ovh
        @Deprecated
        public final kx7<Integer> f64371i;

        /* JADX INFO: renamed from: j */
        public final kx7<Integer> f64372j;

        /* JADX INFO: renamed from: k */
        @hib
        public final byte[] f64373k;

        /* JADX INFO: renamed from: nfa$f$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @hib
            public UUID f64374a;

            /* JADX INFO: renamed from: b */
            @hib
            public Uri f64375b;

            /* JADX INFO: renamed from: c */
            public ox7<String, String> f64376c;

            /* JADX INFO: renamed from: d */
            public boolean f64377d;

            /* JADX INFO: renamed from: e */
            public boolean f64378e;

            /* JADX INFO: renamed from: f */
            public boolean f64379f;

            /* JADX INFO: renamed from: g */
            public kx7<Integer> f64380g;

            /* JADX INFO: renamed from: h */
            @hib
            public byte[] f64381h;

            /* JADX INFO: Access modifiers changed from: private */
            @op1
            @Deprecated
            public a setNullableScheme(@hib UUID uuid) {
                this.f64374a = uuid;
                return this;
            }

            public C9854f build() {
                return new C9854f(this);
            }

            @Deprecated
            @p28(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @op1
            @ovh
            public a forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            @op1
            public a setForceDefaultLicenseUri(boolean z) {
                this.f64379f = z;
                return this;
            }

            @op1
            public a setForceSessionsForAudioAndVideoTracks(boolean z) {
                setForcedSessionTrackTypes(z ? kx7.m15112of(2, 1) : kx7.m15110of());
                return this;
            }

            @op1
            public a setForcedSessionTrackTypes(List<Integer> list) {
                this.f64380g = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setKeySetId(@hib byte[] bArr) {
                this.f64381h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            @op1
            public a setLicenseRequestHeaders(Map<String, String> map) {
                this.f64376c = ox7.copyOf((Map) map);
                return this;
            }

            @op1
            public a setLicenseUri(@hib Uri uri) {
                this.f64375b = uri;
                return this;
            }

            @op1
            public a setMultiSession(boolean z) {
                this.f64377d = z;
                return this;
            }

            @op1
            public a setPlayClearContentWithoutKey(boolean z) {
                this.f64378e = z;
                return this;
            }

            @op1
            public a setScheme(UUID uuid) {
                this.f64374a = uuid;
                return this;
            }

            @op1
            public a setLicenseUri(@hib String str) {
                this.f64375b = str == null ? null : Uri.parse(str);
                return this;
            }

            public a(UUID uuid) {
                this();
                this.f64374a = uuid;
            }

            @Deprecated
            private a() {
                this.f64376c = ox7.m19076of();
                this.f64378e = true;
                this.f64380g = kx7.m15110of();
            }

            private a(C9854f c9854f) {
                this.f64374a = c9854f.f64363a;
                this.f64375b = c9854f.f64365c;
                this.f64376c = c9854f.f64367e;
                this.f64377d = c9854f.f64368f;
                this.f64378e = c9854f.f64369g;
                this.f64379f = c9854f.f64370h;
                this.f64380g = c9854f.f64372j;
                this.f64381h = c9854f.f64373k;
            }
        }

        @ovh
        public static C9854f fromBundle(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) v80.checkNotNull(bundle.getString(f64355l)));
            Uri uri = (Uri) bundle.getParcelable(f64356m);
            ox7<String, String> ox7VarBundleToStringImmutableMap = og1.bundleToStringImmutableMap(og1.getBundleWithDefault(bundle, f64357n, Bundle.EMPTY));
            boolean z = bundle.getBoolean(f64358o, false);
            boolean z2 = bundle.getBoolean(f64359p, false);
            boolean z3 = bundle.getBoolean(f64360q, false);
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) og1.getIntegerArrayListWithDefault(bundle, f64361r, new ArrayList()));
            return new a(uuidFromString).setLicenseUri(uri).setLicenseRequestHeaders(ox7VarBundleToStringImmutableMap).setMultiSession(z).setForceDefaultLicenseUri(z3).setPlayClearContentWithoutKey(z2).setForcedSessionTrackTypes(kx7VarCopyOf).setKeySetId(bundle.getByteArray(f64362s)).build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9854f)) {
                return false;
            }
            C9854f c9854f = (C9854f) obj;
            return this.f64363a.equals(c9854f.f64363a) && Objects.equals(this.f64365c, c9854f.f64365c) && Objects.equals(this.f64367e, c9854f.f64367e) && this.f64368f == c9854f.f64368f && this.f64370h == c9854f.f64370h && this.f64369g == c9854f.f64369g && this.f64372j.equals(c9854f.f64372j) && Arrays.equals(this.f64373k, c9854f.f64373k);
        }

        @hib
        public byte[] getKeySetId() {
            byte[] bArr = this.f64373k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.f64363a.hashCode() * 31;
            Uri uri = this.f64365c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f64367e.hashCode()) * 31) + (this.f64368f ? 1 : 0)) * 31) + (this.f64370h ? 1 : 0)) * 31) + (this.f64369g ? 1 : 0)) * 31) + this.f64372j.hashCode()) * 31) + Arrays.hashCode(this.f64373k);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f64355l, this.f64363a.toString());
            Uri uri = this.f64365c;
            if (uri != null) {
                bundle.putParcelable(f64356m, uri);
            }
            if (!this.f64367e.isEmpty()) {
                bundle.putBundle(f64357n, og1.stringMapToBundle(this.f64367e));
            }
            boolean z = this.f64368f;
            if (z) {
                bundle.putBoolean(f64358o, z);
            }
            boolean z2 = this.f64369g;
            if (z2) {
                bundle.putBoolean(f64359p, z2);
            }
            boolean z3 = this.f64370h;
            if (z3) {
                bundle.putBoolean(f64360q, z3);
            }
            if (!this.f64372j.isEmpty()) {
                bundle.putIntegerArrayList(f64361r, new ArrayList<>(this.f64372j));
            }
            byte[] bArr = this.f64373k;
            if (bArr != null) {
                bundle.putByteArray(f64362s, bArr);
            }
            return bundle;
        }

        private C9854f(a aVar) {
            v80.checkState((aVar.f64379f && aVar.f64375b == null) ? false : true);
            UUID uuid = (UUID) v80.checkNotNull(aVar.f64374a);
            this.f64363a = uuid;
            this.f64364b = uuid;
            this.f64365c = aVar.f64375b;
            this.f64366d = aVar.f64376c;
            this.f64367e = aVar.f64376c;
            this.f64368f = aVar.f64377d;
            this.f64370h = aVar.f64379f;
            this.f64369g = aVar.f64378e;
            this.f64371i = aVar.f64380g;
            this.f64372j = aVar.f64380g;
            this.f64373k = aVar.f64381h != null ? Arrays.copyOf(aVar.f64381h, aVar.f64381h.length) : null;
        }
    }

    /* JADX INFO: renamed from: nfa$g */
    public static final class C9855g {

        /* JADX INFO: renamed from: f */
        public static final C9855g f64382f = new a().build();

        /* JADX INFO: renamed from: g */
        public static final String f64383g = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: h */
        public static final String f64384h = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: i */
        public static final String f64385i = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: j */
        public static final String f64386j = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: k */
        public static final String f64387k = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: a */
        public final long f64388a;

        /* JADX INFO: renamed from: b */
        public final long f64389b;

        /* JADX INFO: renamed from: c */
        public final long f64390c;

        /* JADX INFO: renamed from: d */
        public final float f64391d;

        /* JADX INFO: renamed from: e */
        public final float f64392e;

        /* JADX INFO: renamed from: nfa$g$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f64393a;

            /* JADX INFO: renamed from: b */
            public long f64394b;

            /* JADX INFO: renamed from: c */
            public long f64395c;

            /* JADX INFO: renamed from: d */
            public float f64396d;

            /* JADX INFO: renamed from: e */
            public float f64397e;

            public C9855g build() {
                return new C9855g(this);
            }

            @op1
            public a setMaxOffsetMs(long j) {
                this.f64395c = j;
                return this;
            }

            @op1
            public a setMaxPlaybackSpeed(float f) {
                this.f64397e = f;
                return this;
            }

            @op1
            public a setMinOffsetMs(long j) {
                this.f64394b = j;
                return this;
            }

            @op1
            public a setMinPlaybackSpeed(float f) {
                this.f64396d = f;
                return this;
            }

            @op1
            public a setTargetOffsetMs(long j) {
                this.f64393a = j;
                return this;
            }

            public a() {
                this.f64393a = -9223372036854775807L;
                this.f64394b = -9223372036854775807L;
                this.f64395c = -9223372036854775807L;
                this.f64396d = -3.4028235E38f;
                this.f64397e = -3.4028235E38f;
            }

            private a(C9855g c9855g) {
                this.f64393a = c9855g.f64388a;
                this.f64394b = c9855g.f64389b;
                this.f64395c = c9855g.f64390c;
                this.f64396d = c9855g.f64391d;
                this.f64397e = c9855g.f64392e;
            }
        }

        @ovh
        public static C9855g fromBundle(Bundle bundle) {
            a aVar = new a();
            String str = f64383g;
            C9855g c9855g = f64382f;
            return aVar.setTargetOffsetMs(bundle.getLong(str, c9855g.f64388a)).setMinOffsetMs(bundle.getLong(f64384h, c9855g.f64389b)).setMaxOffsetMs(bundle.getLong(f64385i, c9855g.f64390c)).setMinPlaybackSpeed(bundle.getFloat(f64386j, c9855g.f64391d)).setMaxPlaybackSpeed(bundle.getFloat(f64387k, c9855g.f64392e)).build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9855g)) {
                return false;
            }
            C9855g c9855g = (C9855g) obj;
            return this.f64388a == c9855g.f64388a && this.f64389b == c9855g.f64389b && this.f64390c == c9855g.f64390c && this.f64391d == c9855g.f64391d && this.f64392e == c9855g.f64392e;
        }

        public int hashCode() {
            long j = this.f64388a;
            long j2 = this.f64389b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f64390c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f64391d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f64392e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f64388a;
            C9855g c9855g = f64382f;
            if (j != c9855g.f64388a) {
                bundle.putLong(f64383g, j);
            }
            long j2 = this.f64389b;
            if (j2 != c9855g.f64389b) {
                bundle.putLong(f64384h, j2);
            }
            long j3 = this.f64390c;
            if (j3 != c9855g.f64390c) {
                bundle.putLong(f64385i, j3);
            }
            float f = this.f64391d;
            if (f != c9855g.f64391d) {
                bundle.putFloat(f64386j, f);
            }
            float f2 = this.f64392e;
            if (f2 != c9855g.f64392e) {
                bundle.putFloat(f64387k, f2);
            }
            return bundle;
        }

        private C9855g(a aVar) {
            this(aVar.f64393a, aVar.f64394b, aVar.f64395c, aVar.f64396d, aVar.f64397e);
        }

        @ovh
        @Deprecated
        public C9855g(long j, long j2, long j3, float f, float f2) {
            this.f64388a = j;
            this.f64389b = j2;
            this.f64390c = j3;
            this.f64391d = f;
            this.f64392e = f2;
        }
    }

    /* JADX INFO: renamed from: nfa$h */
    public static final class C9856h {

        /* JADX INFO: renamed from: k */
        public static final String f64398k = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: l */
        public static final String f64399l = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: m */
        public static final String f64400m = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: n */
        public static final String f64401n = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: o */
        public static final String f64402o = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: p */
        public static final String f64403p = t0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: q */
        public static final String f64404q = t0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: r */
        public static final String f64405r = t0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: a */
        public final Uri f64406a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f64407b;

        /* JADX INFO: renamed from: c */
        @hib
        public final C9854f f64408c;

        /* JADX INFO: renamed from: d */
        @hib
        public final C9850b f64409d;

        /* JADX INFO: renamed from: e */
        @ovh
        public final List<StreamKey> f64410e;

        /* JADX INFO: renamed from: f */
        @hib
        @ovh
        public final String f64411f;

        /* JADX INFO: renamed from: g */
        public final kx7<C9859k> f64412g;

        /* JADX INFO: renamed from: h */
        @ovh
        @Deprecated
        public final List<C9858j> f64413h;

        /* JADX INFO: renamed from: i */
        @hib
        public final Object f64414i;

        /* JADX INFO: renamed from: j */
        @ovh
        public final long f64415j;

        @ovh
        public static C9856h fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f64400m);
            C9854f c9854fFromBundle = bundle2 == null ? null : C9854f.fromBundle(bundle2);
            Bundle bundle3 = bundle.getBundle(f64401n);
            C9850b c9850bFromBundle = bundle3 != null ? C9850b.fromBundle(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f64402o);
            kx7 kx7VarM15110of = parcelableArrayList == null ? kx7.m15110of() : og1.fromBundleList(new lz6() { // from class: wfa
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return StreamKey.fromBundle((Bundle) obj);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f64404q);
            return new C9856h((Uri) v80.checkNotNull((Uri) bundle.getParcelable(f64398k)), bundle.getString(f64399l), c9854fFromBundle, c9850bFromBundle, kx7VarM15110of, bundle.getString(f64403p), parcelableArrayList2 == null ? kx7.m15110of() : og1.fromBundleList(new lz6() { // from class: xfa
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return nfa.C9859k.fromBundle((Bundle) obj);
                }
            }, parcelableArrayList2), null, bundle.getLong(f64405r, -9223372036854775807L));
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9856h)) {
                return false;
            }
            C9856h c9856h = (C9856h) obj;
            return this.f64406a.equals(c9856h.f64406a) && Objects.equals(this.f64407b, c9856h.f64407b) && Objects.equals(this.f64408c, c9856h.f64408c) && Objects.equals(this.f64409d, c9856h.f64409d) && this.f64410e.equals(c9856h.f64410e) && Objects.equals(this.f64411f, c9856h.f64411f) && this.f64412g.equals(c9856h.f64412g) && Objects.equals(this.f64414i, c9856h.f64414i) && this.f64415j == c9856h.f64415j;
        }

        public int hashCode() {
            int iHashCode = this.f64406a.hashCode() * 31;
            String str = this.f64407b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C9854f c9854f = this.f64408c;
            int iHashCode3 = (iHashCode2 + (c9854f == null ? 0 : c9854f.hashCode())) * 31;
            C9850b c9850b = this.f64409d;
            int iHashCode4 = (((iHashCode3 + (c9850b == null ? 0 : c9850b.hashCode())) * 31) + this.f64410e.hashCode()) * 31;
            String str2 = this.f64411f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f64412g.hashCode()) * 31;
            Object obj = this.f64414i;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f64415j);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f64398k, this.f64406a);
            String str = this.f64407b;
            if (str != null) {
                bundle.putString(f64399l, str);
            }
            C9854f c9854f = this.f64408c;
            if (c9854f != null) {
                bundle.putBundle(f64400m, c9854f.toBundle());
            }
            C9850b c9850b = this.f64409d;
            if (c9850b != null) {
                bundle.putBundle(f64401n, c9850b.toBundle());
            }
            if (!this.f64410e.isEmpty()) {
                bundle.putParcelableArrayList(f64402o, og1.toBundleArrayList(this.f64410e, new lz6() { // from class: tfa
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return ((StreamKey) obj).toBundle();
                    }
                }));
            }
            String str2 = this.f64411f;
            if (str2 != null) {
                bundle.putString(f64403p, str2);
            }
            if (!this.f64412g.isEmpty()) {
                bundle.putParcelableArrayList(f64404q, og1.toBundleArrayList(this.f64412g, new lz6() { // from class: vfa
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return ((nfa.C9859k) obj).toBundle();
                    }
                }));
            }
            long j = this.f64415j;
            if (j != -9223372036854775807L) {
                bundle.putLong(f64405r, j);
            }
            return bundle;
        }

        private C9856h(Uri uri, @hib String str, @hib C9854f c9854f, @hib C9850b c9850b, List<StreamKey> list, @hib String str2, kx7<C9859k> kx7Var, @hib Object obj, long j) {
            this.f64406a = uri;
            this.f64407b = rva.normalizeMimeType(str);
            this.f64408c = c9854f;
            this.f64409d = c9850b;
            this.f64410e = list;
            this.f64411f = str2;
            this.f64412g = kx7Var;
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i = 0; i < kx7Var.size(); i++) {
                c8541aBuilder.add(kx7Var.get(i).buildUpon().buildSubtitle());
            }
            this.f64413h = c8541aBuilder.build();
            this.f64414i = obj;
            this.f64415j = j;
        }
    }

    /* JADX INFO: renamed from: nfa$i */
    public static final class C9857i {

        /* JADX INFO: renamed from: d */
        public static final C9857i f64416d = new a().build();

        /* JADX INFO: renamed from: e */
        public static final String f64417e = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: f */
        public static final String f64418f = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: g */
        public static final String f64419g = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: a */
        @hib
        public final Uri f64420a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f64421b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Bundle f64422c;

        /* JADX INFO: renamed from: nfa$i$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @hib
            public Uri f64423a;

            /* JADX INFO: renamed from: b */
            @hib
            public String f64424b;

            /* JADX INFO: renamed from: c */
            @hib
            public Bundle f64425c;

            public C9857i build() {
                return new C9857i(this);
            }

            @op1
            public a setExtras(@hib Bundle bundle) {
                this.f64425c = bundle;
                return this;
            }

            @op1
            public a setMediaUri(@hib Uri uri) {
                this.f64423a = uri;
                return this;
            }

            @op1
            public a setSearchQuery(@hib String str) {
                this.f64424b = str;
                return this;
            }

            public a() {
            }

            private a(C9857i c9857i) {
                this.f64423a = c9857i.f64420a;
                this.f64424b = c9857i.f64421b;
                this.f64425c = c9857i.f64422c;
            }
        }

        @ovh
        public static C9857i fromBundle(Bundle bundle) {
            return new a().setMediaUri((Uri) bundle.getParcelable(f64417e)).setSearchQuery(bundle.getString(f64418f)).setExtras(bundle.getBundle(f64419g)).build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9857i)) {
                return false;
            }
            C9857i c9857i = (C9857i) obj;
            if (Objects.equals(this.f64420a, c9857i.f64420a) && Objects.equals(this.f64421b, c9857i.f64421b)) {
                if ((this.f64422c == null) == (c9857i.f64422c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f64420a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f64421b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f64422c != null ? 1 : 0);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f64420a;
            if (uri != null) {
                bundle.putParcelable(f64417e, uri);
            }
            String str = this.f64421b;
            if (str != null) {
                bundle.putString(f64418f, str);
            }
            Bundle bundle2 = this.f64422c;
            if (bundle2 != null) {
                bundle.putBundle(f64419g, bundle2);
            }
            return bundle;
        }

        private C9857i(a aVar) {
            this.f64420a = aVar.f64423a;
            this.f64421b = aVar.f64424b;
            this.f64422c = aVar.f64425c;
        }
    }

    /* JADX INFO: renamed from: nfa$j */
    @ovh
    @Deprecated
    public static final class C9858j extends C9859k {
        @ovh
        @Deprecated
        public C9858j(Uri uri, String str, @hib String str2) {
            this(uri, str, str2, 0);
        }

        @ovh
        @Deprecated
        public C9858j(Uri uri, String str, @hib String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @ovh
        @Deprecated
        public C9858j(Uri uri, String str, @hib String str2, int i, int i2, @hib String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        private C9858j(C9859k.a aVar) {
            super(aVar);
        }
    }

    @ovh
    public static nfa fromBundle(Bundle bundle) {
        String str = (String) v80.checkNotNull(bundle.getString(f64298k, ""));
        Bundle bundle2 = bundle.getBundle(f64299l);
        C9855g c9855gFromBundle = bundle2 == null ? C9855g.f64382f : C9855g.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(f64300m);
        hga hgaVarFromBundle = bundle3 == null ? hga.f43470X0 : hga.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(f64301n);
        C9853e c9853eFromBundle = bundle4 == null ? C9853e.f64354r : C9852d.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(f64302o);
        C9857i c9857iFromBundle = bundle5 == null ? C9857i.f64416d : C9857i.fromBundle(bundle5);
        Bundle bundle6 = bundle.getBundle(f64303p);
        return new nfa(str, c9853eFromBundle, bundle6 == null ? null : C9856h.fromBundle(bundle6), c9855gFromBundle, hgaVarFromBundle, c9857iFromBundle);
    }

    public static nfa fromUri(String str) {
        return new C9851c().setUri(str).build();
    }

    @ovh
    private Bundle toBundle(boolean z) {
        C9856h c9856h;
        Bundle bundle = new Bundle();
        if (!this.f64304a.equals("")) {
            bundle.putString(f64298k, this.f64304a);
        }
        if (!this.f64307d.equals(C9855g.f64382f)) {
            bundle.putBundle(f64299l, this.f64307d.toBundle());
        }
        if (!this.f64308e.equals(hga.f43470X0)) {
            bundle.putBundle(f64300m, this.f64308e.toBundle());
        }
        if (!this.f64309f.equals(C9852d.f64331i)) {
            bundle.putBundle(f64301n, this.f64309f.toBundle());
        }
        if (!this.f64311h.equals(C9857i.f64416d)) {
            bundle.putBundle(f64302o, this.f64311h.toBundle());
        }
        if (z && (c9856h = this.f64305b) != null) {
            bundle.putBundle(f64303p, c9856h.toBundle());
        }
        return bundle;
    }

    public C9851c buildUpon() {
        return new C9851c();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfa)) {
            return false;
        }
        nfa nfaVar = (nfa) obj;
        return Objects.equals(this.f64304a, nfaVar.f64304a) && this.f64309f.equals(nfaVar.f64309f) && Objects.equals(this.f64305b, nfaVar.f64305b) && Objects.equals(this.f64307d, nfaVar.f64307d) && Objects.equals(this.f64308e, nfaVar.f64308e) && Objects.equals(this.f64311h, nfaVar.f64311h);
    }

    public int hashCode() {
        int iHashCode = this.f64304a.hashCode() * 31;
        C9856h c9856h = this.f64305b;
        return ((((((((iHashCode + (c9856h != null ? c9856h.hashCode() : 0)) * 31) + this.f64307d.hashCode()) * 31) + this.f64309f.hashCode()) * 31) + this.f64308e.hashCode()) * 31) + this.f64311h.hashCode();
    }

    @ovh
    public Bundle toBundleIncludeLocalConfiguration() {
        return toBundle(true);
    }

    /* JADX INFO: renamed from: nfa$k */
    public static class C9859k {

        /* JADX INFO: renamed from: h */
        public static final String f64426h = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: i */
        public static final String f64427i = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: j */
        public static final String f64428j = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: k */
        public static final String f64429k = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: l */
        public static final String f64430l = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: m */
        public static final String f64431m = t0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: n */
        public static final String f64432n = t0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: a */
        public final Uri f64433a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f64434b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f64435c;

        /* JADX INFO: renamed from: d */
        public final int f64436d;

        /* JADX INFO: renamed from: e */
        public final int f64437e;

        /* JADX INFO: renamed from: f */
        @hib
        public final String f64438f;

        /* JADX INFO: renamed from: g */
        @hib
        public final String f64439g;

        /* JADX INFO: renamed from: nfa$k$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f64440a;

            /* JADX INFO: renamed from: b */
            @hib
            public String f64441b;

            /* JADX INFO: renamed from: c */
            @hib
            public String f64442c;

            /* JADX INFO: renamed from: d */
            public int f64443d;

            /* JADX INFO: renamed from: e */
            public int f64444e;

            /* JADX INFO: renamed from: f */
            @hib
            public String f64445f;

            /* JADX INFO: renamed from: g */
            @hib
            public String f64446g;

            /* JADX INFO: Access modifiers changed from: private */
            public C9858j buildSubtitle() {
                return new C9858j(this);
            }

            public C9859k build() {
                return new C9859k(this);
            }

            @op1
            public a setId(@hib String str) {
                this.f64446g = str;
                return this;
            }

            @op1
            public a setLabel(@hib String str) {
                this.f64445f = str;
                return this;
            }

            @op1
            public a setLanguage(@hib String str) {
                this.f64442c = str;
                return this;
            }

            @op1
            public a setMimeType(@hib String str) {
                this.f64441b = rva.normalizeMimeType(str);
                return this;
            }

            @op1
            public a setRoleFlags(int i) {
                this.f64444e = i;
                return this;
            }

            @op1
            public a setSelectionFlags(int i) {
                this.f64443d = i;
                return this;
            }

            @op1
            public a setUri(Uri uri) {
                this.f64440a = uri;
                return this;
            }

            public a(Uri uri) {
                this.f64440a = uri;
            }

            private a(C9859k c9859k) {
                this.f64440a = c9859k.f64433a;
                this.f64441b = c9859k.f64434b;
                this.f64442c = c9859k.f64435c;
                this.f64443d = c9859k.f64436d;
                this.f64444e = c9859k.f64437e;
                this.f64445f = c9859k.f64438f;
                this.f64446g = c9859k.f64439g;
            }
        }

        @ovh
        public static C9859k fromBundle(Bundle bundle) {
            Uri uri = (Uri) v80.checkNotNull((Uri) bundle.getParcelable(f64426h));
            String string = bundle.getString(f64427i);
            String string2 = bundle.getString(f64428j);
            int i = bundle.getInt(f64429k, 0);
            int i2 = bundle.getInt(f64430l, 0);
            String string3 = bundle.getString(f64431m);
            return new a(uri).setMimeType(string).setLanguage(string2).setSelectionFlags(i).setRoleFlags(i2).setLabel(string3).setId(bundle.getString(f64432n)).build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9859k)) {
                return false;
            }
            C9859k c9859k = (C9859k) obj;
            return this.f64433a.equals(c9859k.f64433a) && Objects.equals(this.f64434b, c9859k.f64434b) && Objects.equals(this.f64435c, c9859k.f64435c) && this.f64436d == c9859k.f64436d && this.f64437e == c9859k.f64437e && Objects.equals(this.f64438f, c9859k.f64438f) && Objects.equals(this.f64439g, c9859k.f64439g);
        }

        public int hashCode() {
            int iHashCode = this.f64433a.hashCode() * 31;
            String str = this.f64434b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f64435c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f64436d) * 31) + this.f64437e) * 31;
            String str3 = this.f64438f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f64439g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f64426h, this.f64433a);
            String str = this.f64434b;
            if (str != null) {
                bundle.putString(f64427i, str);
            }
            String str2 = this.f64435c;
            if (str2 != null) {
                bundle.putString(f64428j, str2);
            }
            int i = this.f64436d;
            if (i != 0) {
                bundle.putInt(f64429k, i);
            }
            int i2 = this.f64437e;
            if (i2 != 0) {
                bundle.putInt(f64430l, i2);
            }
            String str3 = this.f64438f;
            if (str3 != null) {
                bundle.putString(f64431m, str3);
            }
            String str4 = this.f64439g;
            if (str4 != null) {
                bundle.putString(f64432n, str4);
            }
            return bundle;
        }

        private C9859k(Uri uri, String str, @hib String str2, int i, int i2, @hib String str3, @hib String str4) {
            this.f64433a = uri;
            this.f64434b = rva.normalizeMimeType(str);
            this.f64435c = str2;
            this.f64436d = i;
            this.f64437e = i2;
            this.f64438f = str3;
            this.f64439g = str4;
        }

        private C9859k(a aVar) {
            this.f64433a = aVar.f64440a;
            this.f64434b = aVar.f64441b;
            this.f64435c = aVar.f64442c;
            this.f64436d = aVar.f64443d;
            this.f64437e = aVar.f64444e;
            this.f64438f = aVar.f64445f;
            this.f64439g = aVar.f64446g;
        }
    }

    private nfa(String str, C9853e c9853e, @hib C9856h c9856h, C9855g c9855g, hga hgaVar, C9857i c9857i) {
        this.f64304a = str;
        this.f64305b = c9856h;
        this.f64306c = c9856h;
        this.f64307d = c9855g;
        this.f64308e = hgaVar;
        this.f64309f = c9853e;
        this.f64310g = c9853e;
        this.f64311h = c9857i;
    }

    public static nfa fromUri(Uri uri) {
        return new C9851c().setUri(uri).build();
    }

    @ovh
    public Bundle toBundle() {
        return toBundle(false);
    }
}
