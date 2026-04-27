package p000;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000.aga;
import p000.gh1;
import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class aga implements gh1 {

    /* JADX INFO: renamed from: F */
    public static final String f1435F = "";

    /* JADX INFO: renamed from: H */
    public static final aga f1436H = new C0235c().build();

    /* JADX INFO: renamed from: L */
    public static final String f1437L = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: M */
    public static final String f1438M = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: N */
    public static final String f1439N = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: Q */
    public static final String f1440Q = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: X */
    public static final String f1441X = x0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: Y */
    public static final String f1442Y = x0i.intToStringMaxRadix(5);

    /* JADX INFO: renamed from: Z */
    public static final gh1.InterfaceC6311a<aga> f1443Z = new gh1.InterfaceC6311a() { // from class: mfa
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return aga.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: C */
    public final C0241i f1444C;

    /* JADX INFO: renamed from: a */
    public final String f1445a;

    /* JADX INFO: renamed from: b */
    @hib
    public final C0240h f1446b;

    /* JADX INFO: renamed from: c */
    @hib
    @Deprecated
    public final C0240h f1447c;

    /* JADX INFO: renamed from: d */
    public final C0239g f1448d;

    /* JADX INFO: renamed from: e */
    public final iga f1449e;

    /* JADX INFO: renamed from: f */
    public final C0236d f1450f;

    /* JADX INFO: renamed from: m */
    @Deprecated
    public final C0237e f1451m;

    /* JADX INFO: renamed from: aga$b */
    public static final class C0234b implements gh1 {

        /* JADX INFO: renamed from: c */
        public static final String f1452c = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: d */
        public static final gh1.InterfaceC6311a<C0234b> f1453d = new gh1.InterfaceC6311a() { // from class: ofa
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return aga.C0234b.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f1454a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Object f1455b;

        /* JADX INFO: renamed from: aga$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f1456a;

            /* JADX INFO: renamed from: b */
            @hib
            public Object f1457b;

            public a(Uri uri) {
                this.f1456a = uri;
            }

            public C0234b build() {
                return new C0234b(this);
            }

            @op1
            public a setAdTagUri(Uri uri) {
                this.f1456a = uri;
                return this;
            }

            @op1
            public a setAdsId(@hib Object obj) {
                this.f1457b = obj;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0234b fromBundle(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f1452c);
            u80.checkNotNull(uri);
            return new a(uri).build();
        }

        public a buildUpon() {
            return new a(this.f1454a).setAdsId(this.f1455b);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0234b)) {
                return false;
            }
            C0234b c0234b = (C0234b) obj;
            return this.f1454a.equals(c0234b.f1454a) && x0i.areEqual(this.f1455b, c0234b.f1455b);
        }

        public int hashCode() {
            int iHashCode = this.f1454a.hashCode() * 31;
            Object obj = this.f1455b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f1452c, this.f1454a);
            return bundle;
        }

        private C0234b(a aVar) {
            this.f1454a = aVar.f1456a;
            this.f1455b = aVar.f1457b;
        }
    }

    /* JADX INFO: renamed from: aga$c */
    public static final class C0235c {

        /* JADX INFO: renamed from: a */
        @hib
        public String f1458a;

        /* JADX INFO: renamed from: b */
        @hib
        public Uri f1459b;

        /* JADX INFO: renamed from: c */
        @hib
        public String f1460c;

        /* JADX INFO: renamed from: d */
        public C0236d.a f1461d;

        /* JADX INFO: renamed from: e */
        public C0238f.a f1462e;

        /* JADX INFO: renamed from: f */
        public List<StreamKey> f1463f;

        /* JADX INFO: renamed from: g */
        @hib
        public String f1464g;

        /* JADX INFO: renamed from: h */
        public kx7<C0243k> f1465h;

        /* JADX INFO: renamed from: i */
        @hib
        public C0234b f1466i;

        /* JADX INFO: renamed from: j */
        @hib
        public Object f1467j;

        /* JADX INFO: renamed from: k */
        @hib
        public iga f1468k;

        /* JADX INFO: renamed from: l */
        public C0239g.a f1469l;

        /* JADX INFO: renamed from: m */
        public C0241i f1470m;

        public aga build() {
            C0240h c0240h;
            u80.checkState(this.f1462e.f1510b == null || this.f1462e.f1509a != null);
            Uri uri = this.f1459b;
            if (uri != null) {
                c0240h = new C0240h(uri, this.f1460c, this.f1462e.f1509a != null ? this.f1462e.build() : null, this.f1466i, this.f1463f, this.f1464g, this.f1465h, this.f1467j);
            } else {
                c0240h = null;
            }
            String str = this.f1458a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C0237e c0237eBuildClippingProperties = this.f1461d.buildClippingProperties();
            C0239g c0239gBuild = this.f1469l.build();
            iga igaVar = this.f1468k;
            if (igaVar == null) {
                igaVar = iga.f46799B3;
            }
            return new aga(str2, c0237eBuildClippingProperties, c0240h, c0239gBuild, igaVar, this.f1470m);
        }

        @op1
        @Deprecated
        public C0235c setAdTagUri(@hib String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        @op1
        public C0235c setAdsConfiguration(@hib C0234b c0234b) {
            this.f1466i = c0234b;
            return this;
        }

        @op1
        @Deprecated
        public C0235c setClipEndPositionMs(long j) {
            this.f1461d.setEndPositionMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setClipRelativeToDefaultPosition(boolean z) {
            this.f1461d.setRelativeToDefaultPosition(z);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setClipRelativeToLiveWindow(boolean z) {
            this.f1461d.setRelativeToLiveWindow(z);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setClipStartPositionMs(@h78(from = 0) long j) {
            this.f1461d.setStartPositionMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setClipStartsAtKeyFrame(boolean z) {
            this.f1461d.setStartsAtKeyFrame(z);
            return this;
        }

        @op1
        public C0235c setClippingConfiguration(C0236d c0236d) {
            this.f1461d = c0236d.buildUpon();
            return this;
        }

        @op1
        public C0235c setCustomCacheKey(@hib String str) {
            this.f1464g = str;
            return this;
        }

        @op1
        public C0235c setDrmConfiguration(@hib C0238f c0238f) {
            this.f1462e = c0238f != null ? c0238f.buildUpon() : new C0238f.a();
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmForceDefaultLicenseUri(boolean z) {
            this.f1462e.setForceDefaultLicenseUri(z);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmKeySetId(@hib byte[] bArr) {
            this.f1462e.setKeySetId(bArr);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmLicenseRequestHeaders(@hib Map<String, String> map) {
            C0238f.a aVar = this.f1462e;
            if (map == null) {
                map = ox7.m19076of();
            }
            aVar.setLicenseRequestHeaders(map);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmLicenseUri(@hib Uri uri) {
            this.f1462e.setLicenseUri(uri);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmMultiSession(boolean z) {
            this.f1462e.setMultiSession(z);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmPlayClearContentWithoutKey(boolean z) {
            this.f1462e.setPlayClearContentWithoutKey(z);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmSessionForClearPeriods(boolean z) {
            this.f1462e.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmSessionForClearTypes(@hib List<Integer> list) {
            C0238f.a aVar = this.f1462e;
            if (list == null) {
                list = kx7.m15110of();
            }
            aVar.setForcedSessionTrackTypes(list);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setDrmUuid(@hib UUID uuid) {
            this.f1462e.setNullableScheme(uuid);
            return this;
        }

        @op1
        public C0235c setLiveConfiguration(C0239g c0239g) {
            this.f1469l = c0239g.buildUpon();
            return this;
        }

        @op1
        @Deprecated
        public C0235c setLiveMaxOffsetMs(long j) {
            this.f1469l.setMaxOffsetMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setLiveMaxPlaybackSpeed(float f) {
            this.f1469l.setMaxPlaybackSpeed(f);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setLiveMinOffsetMs(long j) {
            this.f1469l.setMinOffsetMs(j);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setLiveMinPlaybackSpeed(float f) {
            this.f1469l.setMinPlaybackSpeed(f);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setLiveTargetOffsetMs(long j) {
            this.f1469l.setTargetOffsetMs(j);
            return this;
        }

        @op1
        public C0235c setMediaId(String str) {
            this.f1458a = (String) u80.checkNotNull(str);
            return this;
        }

        @op1
        public C0235c setMediaMetadata(iga igaVar) {
            this.f1468k = igaVar;
            return this;
        }

        @op1
        public C0235c setMimeType(@hib String str) {
            this.f1460c = str;
            return this;
        }

        @op1
        public C0235c setRequestMetadata(C0241i c0241i) {
            this.f1470m = c0241i;
            return this;
        }

        @op1
        public C0235c setStreamKeys(@hib List<StreamKey> list) {
            this.f1463f = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        @op1
        public C0235c setSubtitleConfigurations(List<C0243k> list) {
            this.f1465h = kx7.copyOf((Collection) list);
            return this;
        }

        @op1
        @Deprecated
        public C0235c setSubtitles(@hib List<C0242j> list) {
            this.f1465h = list != null ? kx7.copyOf((Collection) list) : kx7.m15110of();
            return this;
        }

        @op1
        public C0235c setTag(@hib Object obj) {
            this.f1467j = obj;
            return this;
        }

        @op1
        public C0235c setUri(@hib String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public C0235c() {
            this.f1461d = new C0236d.a();
            this.f1462e = new C0238f.a();
            this.f1463f = Collections.emptyList();
            this.f1465h = kx7.m15110of();
            this.f1469l = new C0239g.a();
            this.f1470m = C0241i.f1552d;
        }

        @op1
        @Deprecated
        public C0235c setAdTagUri(@hib Uri uri) {
            return setAdTagUri(uri, null);
        }

        @op1
        @Deprecated
        public C0235c setDrmLicenseUri(@hib String str) {
            this.f1462e.setLicenseUri(str);
            return this;
        }

        @op1
        public C0235c setUri(@hib Uri uri) {
            this.f1459b = uri;
            return this;
        }

        @op1
        @Deprecated
        public C0235c setAdTagUri(@hib Uri uri, @hib Object obj) {
            this.f1466i = uri != null ? new C0234b.a(uri).setAdsId(obj).build() : null;
            return this;
        }

        private C0235c(aga agaVar) {
            C0238f.a aVar;
            this();
            this.f1461d = agaVar.f1450f.buildUpon();
            this.f1458a = agaVar.f1445a;
            this.f1468k = agaVar.f1449e;
            this.f1469l = agaVar.f1448d.buildUpon();
            this.f1470m = agaVar.f1444C;
            C0240h c0240h = agaVar.f1446b;
            if (c0240h != null) {
                this.f1464g = c0240h.f1549f;
                this.f1460c = c0240h.f1545b;
                this.f1459b = c0240h.f1544a;
                this.f1463f = c0240h.f1548e;
                this.f1465h = c0240h.f1550m;
                this.f1467j = c0240h.f1543F;
                C0238f c0238f = c0240h.f1546c;
                if (c0238f != null) {
                    aVar = c0238f.buildUpon();
                } else {
                    aVar = new C0238f.a();
                }
                this.f1462e = aVar;
                this.f1466i = c0240h.f1547d;
            }
        }
    }

    /* JADX INFO: renamed from: aga$d */
    public static class C0236d implements gh1 {

        /* JADX INFO: renamed from: a */
        @h78(from = 0)
        public final long f1478a;

        /* JADX INFO: renamed from: b */
        public final long f1479b;

        /* JADX INFO: renamed from: c */
        public final boolean f1480c;

        /* JADX INFO: renamed from: d */
        public final boolean f1481d;

        /* JADX INFO: renamed from: e */
        public final boolean f1482e;

        /* JADX INFO: renamed from: f */
        public static final C0236d f1476f = new a().build();

        /* JADX INFO: renamed from: m */
        public static final String f1477m = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: C */
        public static final String f1471C = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: F */
        public static final String f1472F = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: H */
        public static final String f1473H = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: L */
        public static final String f1474L = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: M */
        public static final gh1.InterfaceC6311a<C0237e> f1475M = new gh1.InterfaceC6311a() { // from class: pfa
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return aga.C0236d.lambda$static$0(bundle);
            }
        };

        /* JADX INFO: renamed from: aga$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f1483a;

            /* JADX INFO: renamed from: b */
            public long f1484b;

            /* JADX INFO: renamed from: c */
            public boolean f1485c;

            /* JADX INFO: renamed from: d */
            public boolean f1486d;

            /* JADX INFO: renamed from: e */
            public boolean f1487e;

            public C0236d build() {
                return buildClippingProperties();
            }

            @Deprecated
            public C0237e buildClippingProperties() {
                return new C0237e(this);
            }

            @op1
            public a setEndPositionMs(long j) {
                u80.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.f1484b = j;
                return this;
            }

            @op1
            public a setRelativeToDefaultPosition(boolean z) {
                this.f1486d = z;
                return this;
            }

            @op1
            public a setRelativeToLiveWindow(boolean z) {
                this.f1485c = z;
                return this;
            }

            @op1
            public a setStartPositionMs(@h78(from = 0) long j) {
                u80.checkArgument(j >= 0);
                this.f1483a = j;
                return this;
            }

            @op1
            public a setStartsAtKeyFrame(boolean z) {
                this.f1487e = z;
                return this;
            }

            public a() {
                this.f1484b = Long.MIN_VALUE;
            }

            private a(C0236d c0236d) {
                this.f1483a = c0236d.f1478a;
                this.f1484b = c0236d.f1479b;
                this.f1485c = c0236d.f1480c;
                this.f1486d = c0236d.f1481d;
                this.f1487e = c0236d.f1482e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C0237e lambda$static$0(Bundle bundle) {
            a aVar = new a();
            String str = f1477m;
            C0236d c0236d = f1476f;
            return aVar.setStartPositionMs(bundle.getLong(str, c0236d.f1478a)).setEndPositionMs(bundle.getLong(f1471C, c0236d.f1479b)).setRelativeToLiveWindow(bundle.getBoolean(f1472F, c0236d.f1480c)).setRelativeToDefaultPosition(bundle.getBoolean(f1473H, c0236d.f1481d)).setStartsAtKeyFrame(bundle.getBoolean(f1474L, c0236d.f1482e)).buildClippingProperties();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0236d)) {
                return false;
            }
            C0236d c0236d = (C0236d) obj;
            return this.f1478a == c0236d.f1478a && this.f1479b == c0236d.f1479b && this.f1480c == c0236d.f1480c && this.f1481d == c0236d.f1481d && this.f1482e == c0236d.f1482e;
        }

        public int hashCode() {
            long j = this.f1478a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f1479b;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f1480c ? 1 : 0)) * 31) + (this.f1481d ? 1 : 0)) * 31) + (this.f1482e ? 1 : 0);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f1478a;
            C0236d c0236d = f1476f;
            if (j != c0236d.f1478a) {
                bundle.putLong(f1477m, j);
            }
            long j2 = this.f1479b;
            if (j2 != c0236d.f1479b) {
                bundle.putLong(f1471C, j2);
            }
            boolean z = this.f1480c;
            if (z != c0236d.f1480c) {
                bundle.putBoolean(f1472F, z);
            }
            boolean z2 = this.f1481d;
            if (z2 != c0236d.f1481d) {
                bundle.putBoolean(f1473H, z2);
            }
            boolean z3 = this.f1482e;
            if (z3 != c0236d.f1482e) {
                bundle.putBoolean(f1474L, z3);
            }
            return bundle;
        }

        private C0236d(a aVar) {
            this.f1478a = aVar.f1483a;
            this.f1479b = aVar.f1484b;
            this.f1480c = aVar.f1485c;
            this.f1481d = aVar.f1486d;
            this.f1482e = aVar.f1487e;
        }
    }

    /* JADX INFO: renamed from: aga$e */
    @Deprecated
    public static final class C0237e extends C0236d {

        /* JADX INFO: renamed from: N */
        public static final C0237e f1488N = new C0236d.a().buildClippingProperties();

        private C0237e(C0236d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: aga$f */
    public static final class C0238f implements gh1 {

        /* JADX INFO: renamed from: C */
        public final boolean f1498C;

        /* JADX INFO: renamed from: F */
        @Deprecated
        public final kx7<Integer> f1499F;

        /* JADX INFO: renamed from: H */
        public final kx7<Integer> f1500H;

        /* JADX INFO: renamed from: L */
        @hib
        public final byte[] f1501L;

        /* JADX INFO: renamed from: a */
        public final UUID f1502a;

        /* JADX INFO: renamed from: b */
        @Deprecated
        public final UUID f1503b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Uri f1504c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public final ox7<String, String> f1505d;

        /* JADX INFO: renamed from: e */
        public final ox7<String, String> f1506e;

        /* JADX INFO: renamed from: f */
        public final boolean f1507f;

        /* JADX INFO: renamed from: m */
        public final boolean f1508m;

        /* JADX INFO: renamed from: M */
        public static final String f1489M = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: N */
        public static final String f1491N = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: Q */
        public static final String f1492Q = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: X */
        public static final String f1494X = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: Y */
        public static final String f1495Y = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: Z */
        public static final String f1496Z = x0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: M1 */
        public static final String f1490M1 = x0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: V1 */
        public static final String f1493V1 = x0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: Z1 */
        public static final gh1.InterfaceC6311a<C0238f> f1497Z1 = new gh1.InterfaceC6311a() { // from class: qfa
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return aga.C0238f.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: aga$f$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @hib
            public UUID f1509a;

            /* JADX INFO: renamed from: b */
            @hib
            public Uri f1510b;

            /* JADX INFO: renamed from: c */
            public ox7<String, String> f1511c;

            /* JADX INFO: renamed from: d */
            public boolean f1512d;

            /* JADX INFO: renamed from: e */
            public boolean f1513e;

            /* JADX INFO: renamed from: f */
            public boolean f1514f;

            /* JADX INFO: renamed from: g */
            public kx7<Integer> f1515g;

            /* JADX INFO: renamed from: h */
            @hib
            public byte[] f1516h;

            /* JADX INFO: Access modifiers changed from: private */
            @op1
            @Deprecated
            public a setNullableScheme(@hib UUID uuid) {
                this.f1509a = uuid;
                return this;
            }

            public C0238f build() {
                return new C0238f(this);
            }

            @op1
            @Deprecated
            @p28(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            public a forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            @op1
            public a setForceDefaultLicenseUri(boolean z) {
                this.f1514f = z;
                return this;
            }

            @op1
            public a setForceSessionsForAudioAndVideoTracks(boolean z) {
                setForcedSessionTrackTypes(z ? kx7.m15112of(2, 1) : kx7.m15110of());
                return this;
            }

            @op1
            public a setForcedSessionTrackTypes(List<Integer> list) {
                this.f1515g = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setKeySetId(@hib byte[] bArr) {
                this.f1516h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            @op1
            public a setLicenseRequestHeaders(Map<String, String> map) {
                this.f1511c = ox7.copyOf((Map) map);
                return this;
            }

            @op1
            public a setLicenseUri(@hib Uri uri) {
                this.f1510b = uri;
                return this;
            }

            @op1
            public a setMultiSession(boolean z) {
                this.f1512d = z;
                return this;
            }

            @op1
            public a setPlayClearContentWithoutKey(boolean z) {
                this.f1513e = z;
                return this;
            }

            @op1
            public a setScheme(UUID uuid) {
                this.f1509a = uuid;
                return this;
            }

            @op1
            public a setLicenseUri(@hib String str) {
                this.f1510b = str == null ? null : Uri.parse(str);
                return this;
            }

            public a(UUID uuid) {
                this.f1509a = uuid;
                this.f1511c = ox7.m19076of();
                this.f1515g = kx7.m15110of();
            }

            @Deprecated
            private a() {
                this.f1511c = ox7.m19076of();
                this.f1515g = kx7.m15110of();
            }

            private a(C0238f c0238f) {
                this.f1509a = c0238f.f1502a;
                this.f1510b = c0238f.f1504c;
                this.f1511c = c0238f.f1506e;
                this.f1512d = c0238f.f1507f;
                this.f1513e = c0238f.f1508m;
                this.f1514f = c0238f.f1498C;
                this.f1515g = c0238f.f1500H;
                this.f1516h = c0238f.f1501L;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0238f fromBundle(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) u80.checkNotNull(bundle.getString(f1489M)));
            Uri uri = (Uri) bundle.getParcelable(f1491N);
            ox7<String, String> ox7VarBundleToStringImmutableMap = ih1.bundleToStringImmutableMap(ih1.getBundleWithDefault(bundle, f1492Q, Bundle.EMPTY));
            boolean z = bundle.getBoolean(f1494X, false);
            boolean z2 = bundle.getBoolean(f1495Y, false);
            boolean z3 = bundle.getBoolean(f1496Z, false);
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) ih1.getIntegerArrayListWithDefault(bundle, f1490M1, new ArrayList()));
            return new a(uuidFromString).setLicenseUri(uri).setLicenseRequestHeaders(ox7VarBundleToStringImmutableMap).setMultiSession(z).setForceDefaultLicenseUri(z3).setPlayClearContentWithoutKey(z2).setForcedSessionTrackTypes(kx7VarCopyOf).setKeySetId(bundle.getByteArray(f1493V1)).build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0238f)) {
                return false;
            }
            C0238f c0238f = (C0238f) obj;
            return this.f1502a.equals(c0238f.f1502a) && x0i.areEqual(this.f1504c, c0238f.f1504c) && x0i.areEqual(this.f1506e, c0238f.f1506e) && this.f1507f == c0238f.f1507f && this.f1498C == c0238f.f1498C && this.f1508m == c0238f.f1508m && this.f1500H.equals(c0238f.f1500H) && Arrays.equals(this.f1501L, c0238f.f1501L);
        }

        @hib
        public byte[] getKeySetId() {
            byte[] bArr = this.f1501L;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.f1502a.hashCode() * 31;
            Uri uri = this.f1504c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f1506e.hashCode()) * 31) + (this.f1507f ? 1 : 0)) * 31) + (this.f1498C ? 1 : 0)) * 31) + (this.f1508m ? 1 : 0)) * 31) + this.f1500H.hashCode()) * 31) + Arrays.hashCode(this.f1501L);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f1489M, this.f1502a.toString());
            Uri uri = this.f1504c;
            if (uri != null) {
                bundle.putParcelable(f1491N, uri);
            }
            if (!this.f1506e.isEmpty()) {
                bundle.putBundle(f1492Q, ih1.stringMapToBundle(this.f1506e));
            }
            boolean z = this.f1507f;
            if (z) {
                bundle.putBoolean(f1494X, z);
            }
            boolean z2 = this.f1508m;
            if (z2) {
                bundle.putBoolean(f1495Y, z2);
            }
            boolean z3 = this.f1498C;
            if (z3) {
                bundle.putBoolean(f1496Z, z3);
            }
            if (!this.f1500H.isEmpty()) {
                bundle.putIntegerArrayList(f1490M1, new ArrayList<>(this.f1500H));
            }
            byte[] bArr = this.f1501L;
            if (bArr != null) {
                bundle.putByteArray(f1493V1, bArr);
            }
            return bundle;
        }

        private C0238f(a aVar) {
            u80.checkState((aVar.f1514f && aVar.f1510b == null) ? false : true);
            UUID uuid = (UUID) u80.checkNotNull(aVar.f1509a);
            this.f1502a = uuid;
            this.f1503b = uuid;
            this.f1504c = aVar.f1510b;
            this.f1505d = aVar.f1511c;
            this.f1506e = aVar.f1511c;
            this.f1507f = aVar.f1512d;
            this.f1498C = aVar.f1514f;
            this.f1508m = aVar.f1513e;
            this.f1499F = aVar.f1515g;
            this.f1500H = aVar.f1515g;
            this.f1501L = aVar.f1516h != null ? Arrays.copyOf(aVar.f1516h, aVar.f1516h.length) : null;
        }
    }

    /* JADX INFO: renamed from: aga$g */
    public static final class C0239g implements gh1 {

        /* JADX INFO: renamed from: a */
        public final long f1524a;

        /* JADX INFO: renamed from: b */
        public final long f1525b;

        /* JADX INFO: renamed from: c */
        public final long f1526c;

        /* JADX INFO: renamed from: d */
        public final float f1527d;

        /* JADX INFO: renamed from: e */
        public final float f1528e;

        /* JADX INFO: renamed from: f */
        public static final C0239g f1522f = new a().build();

        /* JADX INFO: renamed from: m */
        public static final String f1523m = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: C */
        public static final String f1517C = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: F */
        public static final String f1518F = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: H */
        public static final String f1519H = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: L */
        public static final String f1520L = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: M */
        public static final gh1.InterfaceC6311a<C0239g> f1521M = new gh1.InterfaceC6311a() { // from class: rfa
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return aga.C0239g.lambda$static$0(bundle);
            }
        };

        /* JADX INFO: renamed from: aga$g$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f1529a;

            /* JADX INFO: renamed from: b */
            public long f1530b;

            /* JADX INFO: renamed from: c */
            public long f1531c;

            /* JADX INFO: renamed from: d */
            public float f1532d;

            /* JADX INFO: renamed from: e */
            public float f1533e;

            public C0239g build() {
                return new C0239g(this);
            }

            @op1
            public a setMaxOffsetMs(long j) {
                this.f1531c = j;
                return this;
            }

            @op1
            public a setMaxPlaybackSpeed(float f) {
                this.f1533e = f;
                return this;
            }

            @op1
            public a setMinOffsetMs(long j) {
                this.f1530b = j;
                return this;
            }

            @op1
            public a setMinPlaybackSpeed(float f) {
                this.f1532d = f;
                return this;
            }

            @op1
            public a setTargetOffsetMs(long j) {
                this.f1529a = j;
                return this;
            }

            public a() {
                this.f1529a = -9223372036854775807L;
                this.f1530b = -9223372036854775807L;
                this.f1531c = -9223372036854775807L;
                this.f1532d = -3.4028235E38f;
                this.f1533e = -3.4028235E38f;
            }

            private a(C0239g c0239g) {
                this.f1529a = c0239g.f1524a;
                this.f1530b = c0239g.f1525b;
                this.f1531c = c0239g.f1526c;
                this.f1532d = c0239g.f1527d;
                this.f1533e = c0239g.f1528e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C0239g lambda$static$0(Bundle bundle) {
            String str = f1523m;
            C0239g c0239g = f1522f;
            return new C0239g(bundle.getLong(str, c0239g.f1524a), bundle.getLong(f1517C, c0239g.f1525b), bundle.getLong(f1518F, c0239g.f1526c), bundle.getFloat(f1519H, c0239g.f1527d), bundle.getFloat(f1520L, c0239g.f1528e));
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0239g)) {
                return false;
            }
            C0239g c0239g = (C0239g) obj;
            return this.f1524a == c0239g.f1524a && this.f1525b == c0239g.f1525b && this.f1526c == c0239g.f1526c && this.f1527d == c0239g.f1527d && this.f1528e == c0239g.f1528e;
        }

        public int hashCode() {
            long j = this.f1524a;
            long j2 = this.f1525b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f1526c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f1527d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f1528e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f1524a;
            C0239g c0239g = f1522f;
            if (j != c0239g.f1524a) {
                bundle.putLong(f1523m, j);
            }
            long j2 = this.f1525b;
            if (j2 != c0239g.f1525b) {
                bundle.putLong(f1517C, j2);
            }
            long j3 = this.f1526c;
            if (j3 != c0239g.f1526c) {
                bundle.putLong(f1518F, j3);
            }
            float f = this.f1527d;
            if (f != c0239g.f1527d) {
                bundle.putFloat(f1519H, f);
            }
            float f2 = this.f1528e;
            if (f2 != c0239g.f1528e) {
                bundle.putFloat(f1520L, f2);
            }
            return bundle;
        }

        private C0239g(a aVar) {
            this(aVar.f1529a, aVar.f1530b, aVar.f1531c, aVar.f1532d, aVar.f1533e);
        }

        @Deprecated
        public C0239g(long j, long j2, long j3, float f, float f2) {
            this.f1524a = j;
            this.f1525b = j2;
            this.f1526c = j3;
            this.f1527d = f;
            this.f1528e = f2;
        }
    }

    /* JADX INFO: renamed from: aga$h */
    public static final class C0240h implements gh1 {

        /* JADX INFO: renamed from: H */
        public static final String f1534H = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: L */
        public static final String f1535L = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: M */
        public static final String f1536M = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: N */
        public static final String f1537N = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: Q */
        public static final String f1538Q = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: X */
        public static final String f1539X = x0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: Y */
        public static final String f1540Y = x0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: Z */
        public static final gh1.InterfaceC6311a<C0240h> f1541Z = new gh1.InterfaceC6311a() { // from class: sfa
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return aga.C0240h.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: C */
        @Deprecated
        public final List<C0242j> f1542C;

        /* JADX INFO: renamed from: F */
        @hib
        public final Object f1543F;

        /* JADX INFO: renamed from: a */
        public final Uri f1544a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f1545b;

        /* JADX INFO: renamed from: c */
        @hib
        public final C0238f f1546c;

        /* JADX INFO: renamed from: d */
        @hib
        public final C0234b f1547d;

        /* JADX INFO: renamed from: e */
        public final List<StreamKey> f1548e;

        /* JADX INFO: renamed from: f */
        @hib
        public final String f1549f;

        /* JADX INFO: renamed from: m */
        public final kx7<C0243k> f1550m;

        /* JADX INFO: Access modifiers changed from: private */
        public static C0240h fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f1536M);
            C0238f c0238f = bundle2 == null ? null : (C0238f) C0238f.f1497Z1.fromBundle(bundle2);
            Bundle bundle3 = bundle.getBundle(f1537N);
            C0234b c0234b = bundle3 != null ? (C0234b) C0234b.f1453d.fromBundle(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1538Q);
            kx7 kx7VarM15110of = parcelableArrayList == null ? kx7.m15110of() : ih1.fromBundleList(new gh1.InterfaceC6311a() { // from class: ufa
                @Override // p000.gh1.InterfaceC6311a
                public final gh1 fromBundle(Bundle bundle4) {
                    return StreamKey.fromBundle(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f1540Y);
            return new C0240h((Uri) u80.checkNotNull((Uri) bundle.getParcelable(f1534H)), bundle.getString(f1535L), c0238f, c0234b, kx7VarM15110of, bundle.getString(f1539X), parcelableArrayList2 == null ? kx7.m15110of() : ih1.fromBundleList(C0243k.f1569X, parcelableArrayList2), null);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0240h)) {
                return false;
            }
            C0240h c0240h = (C0240h) obj;
            return this.f1544a.equals(c0240h.f1544a) && x0i.areEqual(this.f1545b, c0240h.f1545b) && x0i.areEqual(this.f1546c, c0240h.f1546c) && x0i.areEqual(this.f1547d, c0240h.f1547d) && this.f1548e.equals(c0240h.f1548e) && x0i.areEqual(this.f1549f, c0240h.f1549f) && this.f1550m.equals(c0240h.f1550m) && x0i.areEqual(this.f1543F, c0240h.f1543F);
        }

        public int hashCode() {
            int iHashCode = this.f1544a.hashCode() * 31;
            String str = this.f1545b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C0238f c0238f = this.f1546c;
            int iHashCode3 = (iHashCode2 + (c0238f == null ? 0 : c0238f.hashCode())) * 31;
            C0234b c0234b = this.f1547d;
            int iHashCode4 = (((iHashCode3 + (c0234b == null ? 0 : c0234b.hashCode())) * 31) + this.f1548e.hashCode()) * 31;
            String str2 = this.f1549f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f1550m.hashCode()) * 31;
            Object obj = this.f1543F;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f1534H, this.f1544a);
            String str = this.f1545b;
            if (str != null) {
                bundle.putString(f1535L, str);
            }
            C0238f c0238f = this.f1546c;
            if (c0238f != null) {
                bundle.putBundle(f1536M, c0238f.toBundle());
            }
            C0234b c0234b = this.f1547d;
            if (c0234b != null) {
                bundle.putBundle(f1537N, c0234b.toBundle());
            }
            if (!this.f1548e.isEmpty()) {
                bundle.putParcelableArrayList(f1538Q, ih1.toBundleArrayList(this.f1548e));
            }
            String str2 = this.f1549f;
            if (str2 != null) {
                bundle.putString(f1539X, str2);
            }
            if (!this.f1550m.isEmpty()) {
                bundle.putParcelableArrayList(f1540Y, ih1.toBundleArrayList(this.f1550m));
            }
            return bundle;
        }

        private C0240h(Uri uri, @hib String str, @hib C0238f c0238f, @hib C0234b c0234b, List<StreamKey> list, @hib String str2, kx7<C0243k> kx7Var, @hib Object obj) {
            this.f1544a = uri;
            this.f1545b = str;
            this.f1546c = c0238f;
            this.f1547d = c0234b;
            this.f1548e = list;
            this.f1549f = str2;
            this.f1550m = kx7Var;
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i = 0; i < kx7Var.size(); i++) {
                c8541aBuilder.add(kx7Var.get(i).buildUpon().buildSubtitle());
            }
            this.f1542C = c8541aBuilder.build();
            this.f1543F = obj;
        }
    }

    /* JADX INFO: renamed from: aga$i */
    public static final class C0241i implements gh1 {

        /* JADX INFO: renamed from: a */
        @hib
        public final Uri f1556a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f1557b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Bundle f1558c;

        /* JADX INFO: renamed from: d */
        public static final C0241i f1552d = new a().build();

        /* JADX INFO: renamed from: e */
        public static final String f1553e = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: f */
        public static final String f1554f = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: m */
        public static final String f1555m = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: C */
        public static final gh1.InterfaceC6311a<C0241i> f1551C = new gh1.InterfaceC6311a() { // from class: yfa
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return aga.C0241i.lambda$static$0(bundle);
            }
        };

        /* JADX INFO: renamed from: aga$i$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @hib
            public Uri f1559a;

            /* JADX INFO: renamed from: b */
            @hib
            public String f1560b;

            /* JADX INFO: renamed from: c */
            @hib
            public Bundle f1561c;

            public C0241i build() {
                return new C0241i(this);
            }

            @op1
            public a setExtras(@hib Bundle bundle) {
                this.f1561c = bundle;
                return this;
            }

            @op1
            public a setMediaUri(@hib Uri uri) {
                this.f1559a = uri;
                return this;
            }

            @op1
            public a setSearchQuery(@hib String str) {
                this.f1560b = str;
                return this;
            }

            public a() {
            }

            private a(C0241i c0241i) {
                this.f1559a = c0241i.f1556a;
                this.f1560b = c0241i.f1557b;
                this.f1561c = c0241i.f1558c;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C0241i lambda$static$0(Bundle bundle) {
            return new a().setMediaUri((Uri) bundle.getParcelable(f1553e)).setSearchQuery(bundle.getString(f1554f)).setExtras(bundle.getBundle(f1555m)).build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0241i)) {
                return false;
            }
            C0241i c0241i = (C0241i) obj;
            return x0i.areEqual(this.f1556a, c0241i.f1556a) && x0i.areEqual(this.f1557b, c0241i.f1557b);
        }

        public int hashCode() {
            Uri uri = this.f1556a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f1557b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f1556a;
            if (uri != null) {
                bundle.putParcelable(f1553e, uri);
            }
            String str = this.f1557b;
            if (str != null) {
                bundle.putString(f1554f, str);
            }
            Bundle bundle2 = this.f1558c;
            if (bundle2 != null) {
                bundle.putBundle(f1555m, bundle2);
            }
            return bundle;
        }

        private C0241i(a aVar) {
            this.f1556a = aVar.f1559a;
            this.f1557b = aVar.f1560b;
            this.f1558c = aVar.f1561c;
        }
    }

    /* JADX INFO: renamed from: aga$j */
    @Deprecated
    public static final class C0242j extends C0243k {
        @Deprecated
        public C0242j(Uri uri, String str, @hib String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public C0242j(Uri uri, String str, @hib String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @Deprecated
        public C0242j(Uri uri, String str, @hib String str2, int i, int i2, @hib String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        private C0242j(C0243k.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static aga fromBundle(Bundle bundle) {
        String str = (String) u80.checkNotNull(bundle.getString(f1437L, ""));
        Bundle bundle2 = bundle.getBundle(f1438M);
        C0239g c0239g = bundle2 == null ? C0239g.f1522f : (C0239g) C0239g.f1521M.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(f1439N);
        iga igaVar = bundle3 == null ? iga.f46799B3 : (iga) iga.f46867j4.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(f1440Q);
        C0237e c0237e = bundle4 == null ? C0237e.f1488N : (C0237e) C0236d.f1475M.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(f1441X);
        C0241i c0241i = bundle5 == null ? C0241i.f1552d : (C0241i) C0241i.f1551C.fromBundle(bundle5);
        Bundle bundle6 = bundle.getBundle(f1442Y);
        return new aga(str, c0237e, bundle6 == null ? null : (C0240h) C0240h.f1541Z.fromBundle(bundle6), c0239g, igaVar, c0241i);
    }

    public static aga fromUri(String str) {
        return new C0235c().setUri(str).build();
    }

    private Bundle toBundle(boolean z) {
        C0240h c0240h;
        Bundle bundle = new Bundle();
        if (!this.f1445a.equals("")) {
            bundle.putString(f1437L, this.f1445a);
        }
        if (!this.f1448d.equals(C0239g.f1522f)) {
            bundle.putBundle(f1438M, this.f1448d.toBundle());
        }
        if (!this.f1449e.equals(iga.f46799B3)) {
            bundle.putBundle(f1439N, this.f1449e.toBundle());
        }
        if (!this.f1450f.equals(C0236d.f1476f)) {
            bundle.putBundle(f1440Q, this.f1450f.toBundle());
        }
        if (!this.f1444C.equals(C0241i.f1552d)) {
            bundle.putBundle(f1441X, this.f1444C.toBundle());
        }
        if (z && (c0240h = this.f1446b) != null) {
            bundle.putBundle(f1442Y, c0240h.toBundle());
        }
        return bundle;
    }

    public C0235c buildUpon() {
        return new C0235c();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aga)) {
            return false;
        }
        aga agaVar = (aga) obj;
        return x0i.areEqual(this.f1445a, agaVar.f1445a) && this.f1450f.equals(agaVar.f1450f) && x0i.areEqual(this.f1446b, agaVar.f1446b) && x0i.areEqual(this.f1448d, agaVar.f1448d) && x0i.areEqual(this.f1449e, agaVar.f1449e) && x0i.areEqual(this.f1444C, agaVar.f1444C);
    }

    public int hashCode() {
        int iHashCode = this.f1445a.hashCode() * 31;
        C0240h c0240h = this.f1446b;
        return ((((((((iHashCode + (c0240h != null ? c0240h.hashCode() : 0)) * 31) + this.f1448d.hashCode()) * 31) + this.f1450f.hashCode()) * 31) + this.f1449e.hashCode()) * 31) + this.f1444C.hashCode();
    }

    public Bundle toBundleIncludeLocalConfiguration() {
        return toBundle(true);
    }

    /* JADX INFO: renamed from: aga$k */
    public static class C0243k implements gh1 {

        /* JADX INFO: renamed from: C */
        public static final String f1562C = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: F */
        public static final String f1563F = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: H */
        public static final String f1564H = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: L */
        public static final String f1565L = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: M */
        public static final String f1566M = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: N */
        public static final String f1567N = x0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: Q */
        public static final String f1568Q = x0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: X */
        public static final gh1.InterfaceC6311a<C0243k> f1569X = new gh1.InterfaceC6311a() { // from class: zfa
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return aga.C0243k.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f1570a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f1571b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f1572c;

        /* JADX INFO: renamed from: d */
        public final int f1573d;

        /* JADX INFO: renamed from: e */
        public final int f1574e;

        /* JADX INFO: renamed from: f */
        @hib
        public final String f1575f;

        /* JADX INFO: renamed from: m */
        @hib
        public final String f1576m;

        /* JADX INFO: renamed from: aga$k$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f1577a;

            /* JADX INFO: renamed from: b */
            @hib
            public String f1578b;

            /* JADX INFO: renamed from: c */
            @hib
            public String f1579c;

            /* JADX INFO: renamed from: d */
            public int f1580d;

            /* JADX INFO: renamed from: e */
            public int f1581e;

            /* JADX INFO: renamed from: f */
            @hib
            public String f1582f;

            /* JADX INFO: renamed from: g */
            @hib
            public String f1583g;

            /* JADX INFO: Access modifiers changed from: private */
            public C0242j buildSubtitle() {
                return new C0242j(this);
            }

            public C0243k build() {
                return new C0243k(this);
            }

            @op1
            public a setId(@hib String str) {
                this.f1583g = str;
                return this;
            }

            @op1
            public a setLabel(@hib String str) {
                this.f1582f = str;
                return this;
            }

            @op1
            public a setLanguage(@hib String str) {
                this.f1579c = str;
                return this;
            }

            @op1
            public a setMimeType(@hib String str) {
                this.f1578b = str;
                return this;
            }

            @op1
            public a setRoleFlags(int i) {
                this.f1581e = i;
                return this;
            }

            @op1
            public a setSelectionFlags(int i) {
                this.f1580d = i;
                return this;
            }

            @op1
            public a setUri(Uri uri) {
                this.f1577a = uri;
                return this;
            }

            public a(Uri uri) {
                this.f1577a = uri;
            }

            private a(C0243k c0243k) {
                this.f1577a = c0243k.f1570a;
                this.f1578b = c0243k.f1571b;
                this.f1579c = c0243k.f1572c;
                this.f1580d = c0243k.f1573d;
                this.f1581e = c0243k.f1574e;
                this.f1582f = c0243k.f1575f;
                this.f1583g = c0243k.f1576m;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0243k fromBundle(Bundle bundle) {
            Uri uri = (Uri) u80.checkNotNull((Uri) bundle.getParcelable(f1562C));
            String string = bundle.getString(f1563F);
            String string2 = bundle.getString(f1564H);
            int i = bundle.getInt(f1565L, 0);
            int i2 = bundle.getInt(f1566M, 0);
            String string3 = bundle.getString(f1567N);
            return new a(uri).setMimeType(string).setLanguage(string2).setSelectionFlags(i).setRoleFlags(i2).setLabel(string3).setId(bundle.getString(f1568Q)).build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0243k)) {
                return false;
            }
            C0243k c0243k = (C0243k) obj;
            return this.f1570a.equals(c0243k.f1570a) && x0i.areEqual(this.f1571b, c0243k.f1571b) && x0i.areEqual(this.f1572c, c0243k.f1572c) && this.f1573d == c0243k.f1573d && this.f1574e == c0243k.f1574e && x0i.areEqual(this.f1575f, c0243k.f1575f) && x0i.areEqual(this.f1576m, c0243k.f1576m);
        }

        public int hashCode() {
            int iHashCode = this.f1570a.hashCode() * 31;
            String str = this.f1571b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f1572c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f1573d) * 31) + this.f1574e) * 31;
            String str3 = this.f1575f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f1576m;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f1562C, this.f1570a);
            String str = this.f1571b;
            if (str != null) {
                bundle.putString(f1563F, str);
            }
            String str2 = this.f1572c;
            if (str2 != null) {
                bundle.putString(f1564H, str2);
            }
            int i = this.f1573d;
            if (i != 0) {
                bundle.putInt(f1565L, i);
            }
            int i2 = this.f1574e;
            if (i2 != 0) {
                bundle.putInt(f1566M, i2);
            }
            String str3 = this.f1575f;
            if (str3 != null) {
                bundle.putString(f1567N, str3);
            }
            String str4 = this.f1576m;
            if (str4 != null) {
                bundle.putString(f1568Q, str4);
            }
            return bundle;
        }

        private C0243k(Uri uri, String str, @hib String str2, int i, int i2, @hib String str3, @hib String str4) {
            this.f1570a = uri;
            this.f1571b = str;
            this.f1572c = str2;
            this.f1573d = i;
            this.f1574e = i2;
            this.f1575f = str3;
            this.f1576m = str4;
        }

        private C0243k(a aVar) {
            this.f1570a = aVar.f1577a;
            this.f1571b = aVar.f1578b;
            this.f1572c = aVar.f1579c;
            this.f1573d = aVar.f1580d;
            this.f1574e = aVar.f1581e;
            this.f1575f = aVar.f1582f;
            this.f1576m = aVar.f1583g;
        }
    }

    private aga(String str, C0237e c0237e, @hib C0240h c0240h, C0239g c0239g, iga igaVar, C0241i c0241i) {
        this.f1445a = str;
        this.f1446b = c0240h;
        this.f1447c = c0240h;
        this.f1448d = c0239g;
        this.f1449e = igaVar;
        this.f1450f = c0237e;
        this.f1451m = c0237e;
        this.f1444C = c0241i;
    }

    public static aga fromUri(Uri uri) {
        return new C0235c().setUri(uri).build();
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        return toBundle(false);
    }
}
