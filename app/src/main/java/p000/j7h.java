package p000;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p000.gh1;
import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class j7h implements gh1 {

    /* JADX INFO: renamed from: A2 */
    public static final String f49719A2;

    /* JADX INFO: renamed from: B2 */
    public static final String f49720B2;

    /* JADX INFO: renamed from: C2 */
    public static final String f49721C2;

    /* JADX INFO: renamed from: D2 */
    public static final String f49722D2;

    /* JADX INFO: renamed from: E2 */
    public static final String f49723E2;

    /* JADX INFO: renamed from: F2 */
    public static final String f49724F2;

    /* JADX INFO: renamed from: G2 */
    public static final String f49725G2;

    /* JADX INFO: renamed from: H2 */
    public static final String f49726H2;

    /* JADX INFO: renamed from: I2 */
    public static final int f49727I2 = 1000;

    /* JADX INFO: renamed from: J2 */
    @Deprecated
    public static final gh1.InterfaceC6311a<j7h> f49728J2;

    /* JADX INFO: renamed from: g2 */
    public static final j7h f49729g2;

    /* JADX INFO: renamed from: h2 */
    @Deprecated
    public static final j7h f49730h2;

    /* JADX INFO: renamed from: i2 */
    public static final String f49731i2;

    /* JADX INFO: renamed from: j2 */
    public static final String f49732j2;

    /* JADX INFO: renamed from: k2 */
    public static final String f49733k2;

    /* JADX INFO: renamed from: l2 */
    public static final String f49734l2;

    /* JADX INFO: renamed from: m2 */
    public static final String f49735m2;

    /* JADX INFO: renamed from: n2 */
    public static final String f49736n2;

    /* JADX INFO: renamed from: o2 */
    public static final String f49737o2;

    /* JADX INFO: renamed from: p2 */
    public static final String f49738p2;

    /* JADX INFO: renamed from: q2 */
    public static final String f49739q2;

    /* JADX INFO: renamed from: r2 */
    public static final String f49740r2;

    /* JADX INFO: renamed from: s2 */
    public static final String f49741s2;

    /* JADX INFO: renamed from: t2 */
    public static final String f49742t2;

    /* JADX INFO: renamed from: u2 */
    public static final String f49743u2;

    /* JADX INFO: renamed from: v2 */
    public static final String f49744v2;

    /* JADX INFO: renamed from: w2 */
    public static final String f49745w2;

    /* JADX INFO: renamed from: x2 */
    public static final String f49746x2;

    /* JADX INFO: renamed from: y2 */
    public static final String f49747y2;

    /* JADX INFO: renamed from: z2 */
    public static final String f49748z2;

    /* JADX INFO: renamed from: C */
    public final int f49749C;

    /* JADX INFO: renamed from: F */
    public final int f49750F;

    /* JADX INFO: renamed from: H */
    public final int f49751H;

    /* JADX INFO: renamed from: L */
    public final boolean f49752L;

    /* JADX INFO: renamed from: M */
    public final kx7<String> f49753M;

    /* JADX INFO: renamed from: M1 */
    public final kx7<String> f49754M1;

    /* JADX INFO: renamed from: N */
    public final int f49755N;

    /* JADX INFO: renamed from: Q */
    public final kx7<String> f49756Q;

    /* JADX INFO: renamed from: V1 */
    public final kx7<String> f49757V1;

    /* JADX INFO: renamed from: X */
    public final int f49758X;

    /* JADX INFO: renamed from: Y */
    public final int f49759Y;

    /* JADX INFO: renamed from: Z */
    public final int f49760Z;

    /* JADX INFO: renamed from: Z1 */
    public final int f49761Z1;

    /* JADX INFO: renamed from: a */
    public final int f49762a;

    /* JADX INFO: renamed from: a2 */
    public final int f49763a2;

    /* JADX INFO: renamed from: b */
    public final int f49764b;

    /* JADX INFO: renamed from: b2 */
    public final boolean f49765b2;

    /* JADX INFO: renamed from: c */
    public final int f49766c;

    /* JADX INFO: renamed from: c2 */
    public final boolean f49767c2;

    /* JADX INFO: renamed from: d */
    public final int f49768d;

    /* JADX INFO: renamed from: d2 */
    public final boolean f49769d2;

    /* JADX INFO: renamed from: e */
    public final int f49770e;

    /* JADX INFO: renamed from: e2 */
    public final ox7<g6h, d7h> f49771e2;

    /* JADX INFO: renamed from: f */
    public final int f49772f;

    /* JADX INFO: renamed from: f2 */
    public final dy7<Integer> f49773f2;

    /* JADX INFO: renamed from: m */
    public final int f49774m;

    static {
        j7h j7hVarBuild = new C7775a().build();
        f49729g2 = j7hVarBuild;
        f49730h2 = j7hVarBuild;
        f49731i2 = x0i.intToStringMaxRadix(1);
        f49732j2 = x0i.intToStringMaxRadix(2);
        f49733k2 = x0i.intToStringMaxRadix(3);
        f49734l2 = x0i.intToStringMaxRadix(4);
        f49735m2 = x0i.intToStringMaxRadix(5);
        f49736n2 = x0i.intToStringMaxRadix(6);
        f49737o2 = x0i.intToStringMaxRadix(7);
        f49738p2 = x0i.intToStringMaxRadix(8);
        f49739q2 = x0i.intToStringMaxRadix(9);
        f49740r2 = x0i.intToStringMaxRadix(10);
        f49741s2 = x0i.intToStringMaxRadix(11);
        f49742t2 = x0i.intToStringMaxRadix(12);
        f49743u2 = x0i.intToStringMaxRadix(13);
        f49744v2 = x0i.intToStringMaxRadix(14);
        f49745w2 = x0i.intToStringMaxRadix(15);
        f49746x2 = x0i.intToStringMaxRadix(16);
        f49747y2 = x0i.intToStringMaxRadix(17);
        f49748z2 = x0i.intToStringMaxRadix(18);
        f49719A2 = x0i.intToStringMaxRadix(19);
        f49720B2 = x0i.intToStringMaxRadix(20);
        f49721C2 = x0i.intToStringMaxRadix(21);
        f49722D2 = x0i.intToStringMaxRadix(22);
        f49723E2 = x0i.intToStringMaxRadix(23);
        f49724F2 = x0i.intToStringMaxRadix(24);
        f49725G2 = x0i.intToStringMaxRadix(25);
        f49726H2 = x0i.intToStringMaxRadix(26);
        f49728J2 = new gh1.InterfaceC6311a() { // from class: f7h
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return j7h.fromBundle(bundle);
            }
        };
    }

    public j7h(C7775a c7775a) {
        this.f49762a = c7775a.f49775a;
        this.f49764b = c7775a.f49776b;
        this.f49766c = c7775a.f49777c;
        this.f49768d = c7775a.f49778d;
        this.f49770e = c7775a.f49779e;
        this.f49772f = c7775a.f49780f;
        this.f49774m = c7775a.f49781g;
        this.f49749C = c7775a.f49782h;
        this.f49750F = c7775a.f49783i;
        this.f49751H = c7775a.f49784j;
        this.f49752L = c7775a.f49785k;
        this.f49753M = c7775a.f49786l;
        this.f49755N = c7775a.f49787m;
        this.f49756Q = c7775a.f49788n;
        this.f49758X = c7775a.f49789o;
        this.f49759Y = c7775a.f49790p;
        this.f49760Z = c7775a.f49791q;
        this.f49754M1 = c7775a.f49792r;
        this.f49757V1 = c7775a.f49793s;
        this.f49761Z1 = c7775a.f49794t;
        this.f49763a2 = c7775a.f49795u;
        this.f49765b2 = c7775a.f49796v;
        this.f49767c2 = c7775a.f49797w;
        this.f49769d2 = c7775a.f49798x;
        this.f49771e2 = ox7.copyOf((Map) c7775a.f49799y);
        this.f49773f2 = dy7.copyOf((Collection) c7775a.f49800z);
    }

    public static j7h fromBundle(Bundle bundle) {
        return new C7775a(bundle).build();
    }

    public static j7h getDefaults(Context context) {
        return new C7775a(context).build();
    }

    public C7775a buildUpon() {
        return new C7775a(this);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j7h j7hVar = (j7h) obj;
        return this.f49762a == j7hVar.f49762a && this.f49764b == j7hVar.f49764b && this.f49766c == j7hVar.f49766c && this.f49768d == j7hVar.f49768d && this.f49770e == j7hVar.f49770e && this.f49772f == j7hVar.f49772f && this.f49774m == j7hVar.f49774m && this.f49749C == j7hVar.f49749C && this.f49752L == j7hVar.f49752L && this.f49750F == j7hVar.f49750F && this.f49751H == j7hVar.f49751H && this.f49753M.equals(j7hVar.f49753M) && this.f49755N == j7hVar.f49755N && this.f49756Q.equals(j7hVar.f49756Q) && this.f49758X == j7hVar.f49758X && this.f49759Y == j7hVar.f49759Y && this.f49760Z == j7hVar.f49760Z && this.f49754M1.equals(j7hVar.f49754M1) && this.f49757V1.equals(j7hVar.f49757V1) && this.f49761Z1 == j7hVar.f49761Z1 && this.f49763a2 == j7hVar.f49763a2 && this.f49765b2 == j7hVar.f49765b2 && this.f49767c2 == j7hVar.f49767c2 && this.f49769d2 == j7hVar.f49769d2 && this.f49771e2.equals(j7hVar.f49771e2) && this.f49773f2.equals(j7hVar.f49773f2);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f49762a + 31) * 31) + this.f49764b) * 31) + this.f49766c) * 31) + this.f49768d) * 31) + this.f49770e) * 31) + this.f49772f) * 31) + this.f49774m) * 31) + this.f49749C) * 31) + (this.f49752L ? 1 : 0)) * 31) + this.f49750F) * 31) + this.f49751H) * 31) + this.f49753M.hashCode()) * 31) + this.f49755N) * 31) + this.f49756Q.hashCode()) * 31) + this.f49758X) * 31) + this.f49759Y) * 31) + this.f49760Z) * 31) + this.f49754M1.hashCode()) * 31) + this.f49757V1.hashCode()) * 31) + this.f49761Z1) * 31) + this.f49763a2) * 31) + (this.f49765b2 ? 1 : 0)) * 31) + (this.f49767c2 ? 1 : 0)) * 31) + (this.f49769d2 ? 1 : 0)) * 31) + this.f49771e2.hashCode()) * 31) + this.f49773f2.hashCode();
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f49736n2, this.f49762a);
        bundle.putInt(f49737o2, this.f49764b);
        bundle.putInt(f49738p2, this.f49766c);
        bundle.putInt(f49739q2, this.f49768d);
        bundle.putInt(f49740r2, this.f49770e);
        bundle.putInt(f49741s2, this.f49772f);
        bundle.putInt(f49742t2, this.f49774m);
        bundle.putInt(f49743u2, this.f49749C);
        bundle.putInt(f49744v2, this.f49750F);
        bundle.putInt(f49745w2, this.f49751H);
        bundle.putBoolean(f49746x2, this.f49752L);
        bundle.putStringArray(f49747y2, (String[]) this.f49753M.toArray(new String[0]));
        bundle.putInt(f49725G2, this.f49755N);
        bundle.putStringArray(f49731i2, (String[]) this.f49756Q.toArray(new String[0]));
        bundle.putInt(f49732j2, this.f49758X);
        bundle.putInt(f49748z2, this.f49759Y);
        bundle.putInt(f49719A2, this.f49760Z);
        bundle.putStringArray(f49720B2, (String[]) this.f49754M1.toArray(new String[0]));
        bundle.putStringArray(f49733k2, (String[]) this.f49757V1.toArray(new String[0]));
        bundle.putInt(f49734l2, this.f49761Z1);
        bundle.putInt(f49726H2, this.f49763a2);
        bundle.putBoolean(f49735m2, this.f49765b2);
        bundle.putBoolean(f49721C2, this.f49767c2);
        bundle.putBoolean(f49722D2, this.f49769d2);
        bundle.putParcelableArrayList(f49723E2, ih1.toBundleArrayList(this.f49771e2.values()));
        bundle.putIntArray(f49724F2, rd8.toArray(this.f49773f2));
        return bundle;
    }

    /* JADX INFO: renamed from: j7h$a */
    public static class C7775a {

        /* JADX INFO: renamed from: a */
        public int f49775a;

        /* JADX INFO: renamed from: b */
        public int f49776b;

        /* JADX INFO: renamed from: c */
        public int f49777c;

        /* JADX INFO: renamed from: d */
        public int f49778d;

        /* JADX INFO: renamed from: e */
        public int f49779e;

        /* JADX INFO: renamed from: f */
        public int f49780f;

        /* JADX INFO: renamed from: g */
        public int f49781g;

        /* JADX INFO: renamed from: h */
        public int f49782h;

        /* JADX INFO: renamed from: i */
        public int f49783i;

        /* JADX INFO: renamed from: j */
        public int f49784j;

        /* JADX INFO: renamed from: k */
        public boolean f49785k;

        /* JADX INFO: renamed from: l */
        public kx7<String> f49786l;

        /* JADX INFO: renamed from: m */
        public int f49787m;

        /* JADX INFO: renamed from: n */
        public kx7<String> f49788n;

        /* JADX INFO: renamed from: o */
        public int f49789o;

        /* JADX INFO: renamed from: p */
        public int f49790p;

        /* JADX INFO: renamed from: q */
        public int f49791q;

        /* JADX INFO: renamed from: r */
        public kx7<String> f49792r;

        /* JADX INFO: renamed from: s */
        public kx7<String> f49793s;

        /* JADX INFO: renamed from: t */
        public int f49794t;

        /* JADX INFO: renamed from: u */
        public int f49795u;

        /* JADX INFO: renamed from: v */
        public boolean f49796v;

        /* JADX INFO: renamed from: w */
        public boolean f49797w;

        /* JADX INFO: renamed from: x */
        public boolean f49798x;

        /* JADX INFO: renamed from: y */
        public HashMap<g6h, d7h> f49799y;

        /* JADX INFO: renamed from: z */
        public HashSet<Integer> f49800z;

        @Deprecated
        public C7775a() {
            this.f49775a = Integer.MAX_VALUE;
            this.f49776b = Integer.MAX_VALUE;
            this.f49777c = Integer.MAX_VALUE;
            this.f49778d = Integer.MAX_VALUE;
            this.f49783i = Integer.MAX_VALUE;
            this.f49784j = Integer.MAX_VALUE;
            this.f49785k = true;
            this.f49786l = kx7.m15110of();
            this.f49787m = 0;
            this.f49788n = kx7.m15110of();
            this.f49789o = 0;
            this.f49790p = Integer.MAX_VALUE;
            this.f49791q = Integer.MAX_VALUE;
            this.f49792r = kx7.m15110of();
            this.f49793s = kx7.m15110of();
            this.f49794t = 0;
            this.f49795u = 0;
            this.f49796v = false;
            this.f49797w = false;
            this.f49798x = false;
            this.f49799y = new HashMap<>();
            this.f49800z = new HashSet<>();
        }

        @z25({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void init(j7h j7hVar) {
            this.f49775a = j7hVar.f49762a;
            this.f49776b = j7hVar.f49764b;
            this.f49777c = j7hVar.f49766c;
            this.f49778d = j7hVar.f49768d;
            this.f49779e = j7hVar.f49770e;
            this.f49780f = j7hVar.f49772f;
            this.f49781g = j7hVar.f49774m;
            this.f49782h = j7hVar.f49749C;
            this.f49783i = j7hVar.f49750F;
            this.f49784j = j7hVar.f49751H;
            this.f49785k = j7hVar.f49752L;
            this.f49786l = j7hVar.f49753M;
            this.f49787m = j7hVar.f49755N;
            this.f49788n = j7hVar.f49756Q;
            this.f49789o = j7hVar.f49758X;
            this.f49790p = j7hVar.f49759Y;
            this.f49791q = j7hVar.f49760Z;
            this.f49792r = j7hVar.f49754M1;
            this.f49793s = j7hVar.f49757V1;
            this.f49794t = j7hVar.f49761Z1;
            this.f49795u = j7hVar.f49763a2;
            this.f49796v = j7hVar.f49765b2;
            this.f49797w = j7hVar.f49767c2;
            this.f49798x = j7hVar.f49769d2;
            this.f49800z = new HashSet<>(j7hVar.f49773f2);
            this.f49799y = new HashMap<>(j7hVar.f49771e2);
        }

        private static kx7<String> normalizeLanguageCodes(String[] strArr) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (String str : (String[]) u80.checkNotNull(strArr)) {
                c8541aBuilder.add(x0i.normalizeLanguageCode((String) u80.checkNotNull(str)));
            }
            return c8541aBuilder.build();
        }

        @c5e(19)
        /* JADX INFO: renamed from: setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19 */
        private void m13826x58dbf263(Context context) {
            CaptioningManager captioningManager;
            if ((x0i.f95978a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f49794t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f49793s = kx7.m15111of(x0i.getLocaleLanguageTag(locale));
                }
            }
        }

        @op1
        /* JADX INFO: renamed from: A */
        public C7775a mo10475A(j7h j7hVar) {
            init(j7hVar);
            return this;
        }

        @op1
        public C7775a addOverride(d7h d7hVar) {
            this.f49799y.put(d7hVar.f28720a, d7hVar);
            return this;
        }

        public j7h build() {
            return new j7h(this);
        }

        @op1
        public C7775a clearOverride(g6h g6hVar) {
            this.f49799y.remove(g6hVar);
            return this;
        }

        @op1
        public C7775a clearOverrides() {
            this.f49799y.clear();
            return this;
        }

        @op1
        public C7775a clearOverridesOfType(int i) {
            Iterator<d7h> it = this.f49799y.values().iterator();
            while (it.hasNext()) {
                if (it.next().getType() == i) {
                    it.remove();
                }
            }
            return this;
        }

        @op1
        public C7775a clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        @op1
        public C7775a clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        @op1
        @Deprecated
        public C7775a setDisabledTrackTypes(Set<Integer> set) {
            this.f49800z.clear();
            this.f49800z.addAll(set);
            return this;
        }

        @op1
        public C7775a setForceHighestSupportedBitrate(boolean z) {
            this.f49798x = z;
            return this;
        }

        @op1
        public C7775a setForceLowestBitrate(boolean z) {
            this.f49797w = z;
            return this;
        }

        @op1
        public C7775a setIgnoredTextSelectionFlags(int i) {
            this.f49795u = i;
            return this;
        }

        @op1
        public C7775a setMaxAudioBitrate(int i) {
            this.f49791q = i;
            return this;
        }

        @op1
        public C7775a setMaxAudioChannelCount(int i) {
            this.f49790p = i;
            return this;
        }

        @op1
        public C7775a setMaxVideoBitrate(int i) {
            this.f49778d = i;
            return this;
        }

        @op1
        public C7775a setMaxVideoFrameRate(int i) {
            this.f49777c = i;
            return this;
        }

        @op1
        public C7775a setMaxVideoSize(int i, int i2) {
            this.f49775a = i;
            this.f49776b = i2;
            return this;
        }

        @op1
        public C7775a setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        @op1
        public C7775a setMinVideoBitrate(int i) {
            this.f49782h = i;
            return this;
        }

        @op1
        public C7775a setMinVideoFrameRate(int i) {
            this.f49781g = i;
            return this;
        }

        @op1
        public C7775a setMinVideoSize(int i, int i2) {
            this.f49779e = i;
            this.f49780f = i2;
            return this;
        }

        @op1
        public C7775a setOverrideForType(d7h d7hVar) {
            clearOverridesOfType(d7hVar.getType());
            this.f49799y.put(d7hVar.f28720a, d7hVar);
            return this;
        }

        public C7775a setPreferredAudioLanguage(@hib String str) {
            return str == null ? setPreferredAudioLanguages(new String[0]) : setPreferredAudioLanguages(str);
        }

        @op1
        public C7775a setPreferredAudioLanguages(String... strArr) {
            this.f49788n = normalizeLanguageCodes(strArr);
            return this;
        }

        public C7775a setPreferredAudioMimeType(@hib String str) {
            return str == null ? setPreferredAudioMimeTypes(new String[0]) : setPreferredAudioMimeTypes(str);
        }

        @op1
        public C7775a setPreferredAudioMimeTypes(String... strArr) {
            this.f49792r = kx7.copyOf(strArr);
            return this;
        }

        @op1
        public C7775a setPreferredAudioRoleFlags(int i) {
            this.f49789o = i;
            return this;
        }

        public C7775a setPreferredTextLanguage(@hib String str) {
            return str == null ? setPreferredTextLanguages(new String[0]) : setPreferredTextLanguages(str);
        }

        @op1
        public C7775a setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            if (x0i.f95978a >= 19) {
                m13826x58dbf263(context);
            }
            return this;
        }

        @op1
        public C7775a setPreferredTextLanguages(String... strArr) {
            this.f49793s = normalizeLanguageCodes(strArr);
            return this;
        }

        @op1
        public C7775a setPreferredTextRoleFlags(int i) {
            this.f49794t = i;
            return this;
        }

        public C7775a setPreferredVideoMimeType(@hib String str) {
            return str == null ? setPreferredVideoMimeTypes(new String[0]) : setPreferredVideoMimeTypes(str);
        }

        @op1
        public C7775a setPreferredVideoMimeTypes(String... strArr) {
            this.f49786l = kx7.copyOf(strArr);
            return this;
        }

        @op1
        public C7775a setPreferredVideoRoleFlags(int i) {
            this.f49787m = i;
            return this;
        }

        @op1
        public C7775a setSelectUndeterminedTextLanguage(boolean z) {
            this.f49796v = z;
            return this;
        }

        @op1
        public C7775a setTrackTypeDisabled(int i, boolean z) {
            if (z) {
                this.f49800z.add(Integer.valueOf(i));
            } else {
                this.f49800z.remove(Integer.valueOf(i));
            }
            return this;
        }

        @op1
        public C7775a setViewportSize(int i, int i2, boolean z) {
            this.f49783i = i;
            this.f49784j = i2;
            this.f49785k = z;
            return this;
        }

        @op1
        public C7775a setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            Point currentDisplayModeSize = x0i.getCurrentDisplayModeSize(context);
            return setViewportSize(currentDisplayModeSize.x, currentDisplayModeSize.y, z);
        }

        public C7775a(Context context) {
            this();
            setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            setViewportSizeToPhysicalDisplaySize(context, true);
        }

        public C7775a(j7h j7hVar) {
            init(j7hVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C7775a(Bundle bundle) {
            kx7 kx7VarFromBundleList;
            String str = j7h.f49736n2;
            j7h j7hVar = j7h.f49729g2;
            this.f49775a = bundle.getInt(str, j7hVar.f49762a);
            this.f49776b = bundle.getInt(j7h.f49737o2, j7hVar.f49764b);
            this.f49777c = bundle.getInt(j7h.f49738p2, j7hVar.f49766c);
            this.f49778d = bundle.getInt(j7h.f49739q2, j7hVar.f49768d);
            this.f49779e = bundle.getInt(j7h.f49740r2, j7hVar.f49770e);
            this.f49780f = bundle.getInt(j7h.f49741s2, j7hVar.f49772f);
            this.f49781g = bundle.getInt(j7h.f49742t2, j7hVar.f49774m);
            this.f49782h = bundle.getInt(j7h.f49743u2, j7hVar.f49749C);
            this.f49783i = bundle.getInt(j7h.f49744v2, j7hVar.f49750F);
            this.f49784j = bundle.getInt(j7h.f49745w2, j7hVar.f49751H);
            this.f49785k = bundle.getBoolean(j7h.f49746x2, j7hVar.f49752L);
            this.f49786l = kx7.copyOf((String[]) yya.firstNonNull(bundle.getStringArray(j7h.f49747y2), new String[0]));
            this.f49787m = bundle.getInt(j7h.f49725G2, j7hVar.f49755N);
            this.f49788n = normalizeLanguageCodes((String[]) yya.firstNonNull(bundle.getStringArray(j7h.f49731i2), new String[0]));
            this.f49789o = bundle.getInt(j7h.f49732j2, j7hVar.f49758X);
            this.f49790p = bundle.getInt(j7h.f49748z2, j7hVar.f49759Y);
            this.f49791q = bundle.getInt(j7h.f49719A2, j7hVar.f49760Z);
            this.f49792r = kx7.copyOf((String[]) yya.firstNonNull(bundle.getStringArray(j7h.f49720B2), new String[0]));
            this.f49793s = normalizeLanguageCodes((String[]) yya.firstNonNull(bundle.getStringArray(j7h.f49733k2), new String[0]));
            this.f49794t = bundle.getInt(j7h.f49734l2, j7hVar.f49761Z1);
            this.f49795u = bundle.getInt(j7h.f49726H2, j7hVar.f49763a2);
            this.f49796v = bundle.getBoolean(j7h.f49735m2, j7hVar.f49765b2);
            this.f49797w = bundle.getBoolean(j7h.f49721C2, j7hVar.f49767c2);
            this.f49798x = bundle.getBoolean(j7h.f49722D2, j7hVar.f49769d2);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(j7h.f49723E2);
            if (parcelableArrayList == null) {
                kx7VarFromBundleList = kx7.m15110of();
            } else {
                kx7VarFromBundleList = ih1.fromBundleList(d7h.f28719e, parcelableArrayList);
            }
            this.f49799y = new HashMap<>();
            for (int i = 0; i < kx7VarFromBundleList.size(); i++) {
                d7h d7hVar = (d7h) kx7VarFromBundleList.get(i);
                this.f49799y.put(d7hVar.f28720a, d7hVar);
            }
            int[] iArr = (int[]) yya.firstNonNull(bundle.getIntArray(j7h.f49724F2), new int[0]);
            this.f49800z = new HashSet<>();
            for (int i2 : iArr) {
                this.f49800z.add(Integer.valueOf(i2));
            }
        }
    }
}
