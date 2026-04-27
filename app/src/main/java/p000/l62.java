package p000;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C1213a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import p000.ox7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class l62 {

    /* JADX INFO: renamed from: f */
    public static final String f56257f = "d";

    /* JADX INFO: renamed from: g */
    public static final String f56258g = "h";

    /* JADX INFO: renamed from: h */
    public static final String f56259h = "s";

    /* JADX INFO: renamed from: i */
    public static final String f56260i = "v";

    /* JADX INFO: renamed from: j */
    public static final String f56261j = "l";

    /* JADX INFO: renamed from: k */
    public static final String f56262k = "i";

    /* JADX INFO: renamed from: l */
    public static final String f56263l = "a";

    /* JADX INFO: renamed from: m */
    public static final String f56264m = "v";

    /* JADX INFO: renamed from: n */
    public static final String f56265n = "av";

    /* JADX INFO: renamed from: o */
    public static final String f56266o = "m";

    /* JADX INFO: renamed from: p */
    public static final xj8 f56267p = xj8.m25235on(",");

    /* JADX INFO: renamed from: a */
    public final C8631b f56268a;

    /* JADX INFO: renamed from: b */
    public final C8632c f56269b;

    /* JADX INFO: renamed from: c */
    public final C8633d f56270c;

    /* JADX INFO: renamed from: d */
    public final C8634e f56271d;

    /* JADX INFO: renamed from: e */
    public final int f56272e;

    /* JADX INFO: renamed from: l62$b */
    public static final class C8631b {

        /* JADX INFO: renamed from: a */
        public final int f56273a;

        /* JADX INFO: renamed from: b */
        public final int f56274b;

        /* JADX INFO: renamed from: c */
        public final long f56275c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f56276d;

        /* JADX INFO: renamed from: e */
        public final kx7<String> f56277e;

        /* JADX INFO: renamed from: l62$b$a */
        public static final class a {

            /* JADX INFO: renamed from: d */
            @hib
            public String f56281d;

            /* JADX INFO: renamed from: a */
            public int f56278a = -2147483647;

            /* JADX INFO: renamed from: b */
            public int f56279b = -2147483647;

            /* JADX INFO: renamed from: c */
            public long f56280c = -9223372036854775807L;

            /* JADX INFO: renamed from: e */
            public kx7<String> f56282e = kx7.m15110of();

            public C8631b build() {
                return new C8631b(this);
            }

            @op1
            public a setBitrateKbps(int i) {
                v80.checkArgument(i >= 0 || i == -2147483647);
                this.f56278a = i;
                return this;
            }

            @op1
            public a setCustomDataList(List<String> list) {
                this.f56282e = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setObjectDurationMs(long j) {
                v80.checkArgument(j >= 0 || j == -9223372036854775807L);
                this.f56280c = j;
                return this;
            }

            @op1
            public a setObjectType(@hib String str) {
                this.f56281d = str;
                return this;
            }

            @op1
            public a setTopBitrateKbps(int i) {
                v80.checkArgument(i >= 0 || i == -2147483647);
                this.f56279b = i;
                return this;
            }
        }

        public void populateCmcdDataMap(r60<String, String> r60Var) {
            ArrayList arrayList = new ArrayList();
            if (this.f56273a != -2147483647) {
                arrayList.add("br=" + this.f56273a);
            }
            if (this.f56274b != -2147483647) {
                arrayList.add("tb=" + this.f56274b);
            }
            if (this.f56275c != -9223372036854775807L) {
                arrayList.add("d=" + this.f56275c);
            }
            if (!TextUtils.isEmpty(this.f56276d)) {
                arrayList.add("ot=" + this.f56276d);
            }
            arrayList.addAll(this.f56277e);
            if (arrayList.isEmpty()) {
                return;
            }
            r60Var.putAll("CMCD-Object", arrayList);
        }

        private C8631b(a aVar) {
            this.f56273a = aVar.f56278a;
            this.f56274b = aVar.f56279b;
            this.f56275c = aVar.f56280c;
            this.f56276d = aVar.f56281d;
            this.f56277e = aVar.f56282e;
        }
    }

    /* JADX INFO: renamed from: l62$c */
    public static final class C8632c {

        /* JADX INFO: renamed from: a */
        public final long f56283a;

        /* JADX INFO: renamed from: b */
        public final long f56284b;

        /* JADX INFO: renamed from: c */
        public final long f56285c;

        /* JADX INFO: renamed from: d */
        public final boolean f56286d;

        /* JADX INFO: renamed from: e */
        @hib
        public final String f56287e;

        /* JADX INFO: renamed from: f */
        @hib
        public final String f56288f;

        /* JADX INFO: renamed from: g */
        public final kx7<String> f56289g;

        /* JADX INFO: renamed from: l62$c$a */
        public static final class a {

            /* JADX INFO: renamed from: d */
            public boolean f56293d;

            /* JADX INFO: renamed from: e */
            @hib
            public String f56294e;

            /* JADX INFO: renamed from: f */
            @hib
            public String f56295f;

            /* JADX INFO: renamed from: a */
            public long f56290a = -9223372036854775807L;

            /* JADX INFO: renamed from: b */
            public long f56291b = -2147483647L;

            /* JADX INFO: renamed from: c */
            public long f56292c = -9223372036854775807L;

            /* JADX INFO: renamed from: g */
            public kx7<String> f56296g = kx7.m15110of();

            public C8632c build() {
                return new C8632c(this);
            }

            @op1
            public a setBufferLengthMs(long j) {
                if (j == -9223372036854775807L) {
                    this.f56290a = j;
                } else {
                    if (j < 0) {
                        throw new IllegalArgumentException();
                    }
                    this.f56290a = ((j + 50) / 100) * 100;
                }
                return this;
            }

            @op1
            public a setCustomDataList(List<String> list) {
                this.f56296g = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setDeadlineMs(long j) {
                if (j == -9223372036854775807L) {
                    this.f56292c = j;
                } else {
                    if (j < 0) {
                        throw new IllegalArgumentException();
                    }
                    this.f56292c = ((j + 50) / 100) * 100;
                }
                return this;
            }

            @op1
            public a setMeasuredThroughputInKbps(long j) {
                if (j == -2147483647L) {
                    this.f56291b = j;
                } else {
                    if (j < 0) {
                        throw new IllegalArgumentException();
                    }
                    this.f56291b = ((j + 50) / 100) * 100;
                }
                return this;
            }

            @op1
            public a setNextObjectRequest(@hib String str) {
                this.f56294e = str == null ? null : Uri.encode(str);
                return this;
            }

            @op1
            public a setNextRangeRequest(@hib String str) {
                this.f56295f = str;
                return this;
            }

            @op1
            public a setStartup(boolean z) {
                this.f56293d = z;
                return this;
            }
        }

        public void populateCmcdDataMap(r60<String, String> r60Var) {
            ArrayList arrayList = new ArrayList();
            if (this.f56283a != -9223372036854775807L) {
                arrayList.add("bl=" + this.f56283a);
            }
            if (this.f56284b != -2147483647L) {
                arrayList.add("mtp=" + this.f56284b);
            }
            if (this.f56285c != -9223372036854775807L) {
                arrayList.add("dl=" + this.f56285c);
            }
            if (this.f56286d) {
                arrayList.add(h62.f42464z);
            }
            if (!TextUtils.isEmpty(this.f56287e)) {
                arrayList.add(t0i.formatInvariant("%s=\"%s\"", h62.f42439A, this.f56287e));
            }
            if (!TextUtils.isEmpty(this.f56288f)) {
                arrayList.add(t0i.formatInvariant("%s=\"%s\"", h62.f42440B, this.f56288f));
            }
            arrayList.addAll(this.f56289g);
            if (arrayList.isEmpty()) {
                return;
            }
            r60Var.putAll("CMCD-Request", arrayList);
        }

        private C8632c(a aVar) {
            this.f56283a = aVar.f56290a;
            this.f56284b = aVar.f56291b;
            this.f56285c = aVar.f56292c;
            this.f56286d = aVar.f56293d;
            this.f56287e = aVar.f56294e;
            this.f56288f = aVar.f56295f;
            this.f56289g = aVar.f56296g;
        }
    }

    /* JADX INFO: renamed from: l62$d */
    public static final class C8633d {

        /* JADX INFO: renamed from: g */
        public static final int f56297g = 1;

        /* JADX INFO: renamed from: a */
        @hib
        public final String f56298a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f56299b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f56300c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f56301d;

        /* JADX INFO: renamed from: e */
        public final float f56302e;

        /* JADX INFO: renamed from: f */
        public final kx7<String> f56303f;

        /* JADX INFO: renamed from: l62$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @hib
            public String f56304a;

            /* JADX INFO: renamed from: b */
            @hib
            public String f56305b;

            /* JADX INFO: renamed from: c */
            @hib
            public String f56306c;

            /* JADX INFO: renamed from: d */
            @hib
            public String f56307d;

            /* JADX INFO: renamed from: e */
            public float f56308e = -3.4028235E38f;

            /* JADX INFO: renamed from: f */
            public kx7<String> f56309f = kx7.m15110of();

            public C8633d build() {
                return new C8633d(this);
            }

            @op1
            public a setContentId(@hib String str) {
                v80.checkArgument(str == null || str.length() <= 64);
                this.f56304a = str;
                return this;
            }

            @op1
            public a setCustomDataList(List<String> list) {
                this.f56309f = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setPlaybackRate(float f) {
                v80.checkArgument(f > 0.0f || f == -3.4028235E38f);
                this.f56308e = f;
                return this;
            }

            @op1
            public a setSessionId(@hib String str) {
                v80.checkArgument(str == null || str.length() <= 64);
                this.f56305b = str;
                return this;
            }

            @op1
            public a setStreamType(@hib String str) {
                this.f56307d = str;
                return this;
            }

            @op1
            public a setStreamingFormat(@hib String str) {
                this.f56306c = str;
                return this;
            }
        }

        public void populateCmcdDataMap(r60<String, String> r60Var) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f56298a)) {
                arrayList.add(t0i.formatInvariant("%s=\"%s\"", "cid", this.f56298a));
            }
            if (!TextUtils.isEmpty(this.f56299b)) {
                arrayList.add(t0i.formatInvariant("%s=\"%s\"", "sid", this.f56299b));
            }
            if (!TextUtils.isEmpty(this.f56300c)) {
                arrayList.add("sf=" + this.f56300c);
            }
            if (!TextUtils.isEmpty(this.f56301d)) {
                arrayList.add("st=" + this.f56301d);
            }
            float f = this.f56302e;
            if (f != -3.4028235E38f && f != 1.0f) {
                arrayList.add(t0i.formatInvariant("%s=%.2f", h62.f42463y, Float.valueOf(f)));
            }
            arrayList.addAll(this.f56303f);
            if (arrayList.isEmpty()) {
                return;
            }
            r60Var.putAll("CMCD-Session", arrayList);
        }

        private C8633d(a aVar) {
            this.f56298a = aVar.f56304a;
            this.f56299b = aVar.f56305b;
            this.f56300c = aVar.f56306c;
            this.f56301d = aVar.f56307d;
            this.f56302e = aVar.f56308e;
            this.f56303f = aVar.f56309f;
        }
    }

    /* JADX INFO: renamed from: l62$e */
    public static final class C8634e {

        /* JADX INFO: renamed from: a */
        public final int f56310a;

        /* JADX INFO: renamed from: b */
        public final boolean f56311b;

        /* JADX INFO: renamed from: c */
        public final kx7<String> f56312c;

        /* JADX INFO: renamed from: l62$e$a */
        public static final class a {

            /* JADX INFO: renamed from: b */
            public boolean f56314b;

            /* JADX INFO: renamed from: a */
            public int f56313a = -2147483647;

            /* JADX INFO: renamed from: c */
            public kx7<String> f56315c = kx7.m15110of();

            public C8634e build() {
                return new C8634e(this);
            }

            @op1
            public a setBufferStarvation(boolean z) {
                this.f56314b = z;
                return this;
            }

            @op1
            public a setCustomDataList(List<String> list) {
                this.f56315c = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setMaximumRequestedThroughputKbps(int i) {
                v80.checkArgument(i >= 0 || i == -2147483647);
                if (i != -2147483647) {
                    i = ((i + 50) / 100) * 100;
                }
                this.f56313a = i;
                return this;
            }
        }

        public void populateCmcdDataMap(r60<String, String> r60Var) {
            ArrayList arrayList = new ArrayList();
            if (this.f56310a != -2147483647) {
                arrayList.add("rtp=" + this.f56310a);
            }
            if (this.f56311b) {
                arrayList.add(h62.f42461w);
            }
            arrayList.addAll(this.f56312c);
            if (arrayList.isEmpty()) {
                return;
            }
            r60Var.putAll("CMCD-Status", arrayList);
        }

        private C8634e(a aVar) {
            this.f56310a = aVar.f56313a;
            this.f56311b = aVar.f56314b;
            this.f56312c = aVar.f56315c;
        }
    }

    /* JADX INFO: renamed from: l62$f */
    public static final class C8635f {

        /* JADX INFO: renamed from: m */
        public static final Pattern f56316m = Pattern.compile(".*-.*");

        /* JADX INFO: renamed from: a */
        public final h62 f56317a;

        /* JADX INFO: renamed from: b */
        public final String f56318b;

        /* JADX INFO: renamed from: c */
        @hib
        public of5 f56319c;

        /* JADX INFO: renamed from: f */
        @hib
        public Boolean f56322f;

        /* JADX INFO: renamed from: g */
        public boolean f56323g;

        /* JADX INFO: renamed from: h */
        public boolean f56324h;

        /* JADX INFO: renamed from: j */
        @hib
        public String f56326j;

        /* JADX INFO: renamed from: k */
        @hib
        public String f56327k;

        /* JADX INFO: renamed from: l */
        @hib
        public String f56328l;

        /* JADX INFO: renamed from: d */
        public long f56320d = -9223372036854775807L;

        /* JADX INFO: renamed from: e */
        public float f56321e = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public long f56325i = -9223372036854775807L;

        public C8635f(h62 h62Var, String str) {
            this.f56317a = h62Var;
            this.f56318b = str;
        }

        @hib
        private static String getObjectTypeFromFormat(C1213a c1213a) {
            String audioMediaMimeType = rva.getAudioMediaMimeType(c1213a.f8287k);
            String videoMediaMimeType = rva.getVideoMediaMimeType(c1213a.f8287k);
            if (audioMediaMimeType != null && videoMediaMimeType != null) {
                return "av";
            }
            int trackType = rva.getTrackType(c1213a.f8291o);
            if (trackType == -1) {
                trackType = rva.getTrackType(c1213a.f8290n);
            }
            if (trackType == 1) {
                return "a";
            }
            if (trackType == 2) {
                return "v";
            }
            return null;
        }

        private static boolean isManifestObjectType(@hib String str) {
            return Objects.equals(str, "m");
        }

        private static boolean isMediaObjectType(@hib String str) {
            return Objects.equals(str, "a") || Objects.equals(str, "v") || Objects.equals(str, "av");
        }

        private void validateCustomDataListFormat(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                v80.checkState(f56316m.matcher(t0i.split(it.next(), "=")[0]).matches());
            }
        }

        public l62 createCmcdData() {
            int iCeilDivide;
            int requestedMaximumThroughputKbps;
            int iCeilDivide2;
            boolean zIsManifestObjectType = isManifestObjectType(this.f56326j);
            if (!zIsManifestObjectType) {
                v80.checkStateNotNull(this.f56319c, "Track selection must be set");
            }
            if (this.f56326j == null) {
                this.f56326j = getObjectTypeFromFormat(((of5) v80.checkNotNull(this.f56319c)).getSelectedFormat());
            }
            boolean zIsMediaObjectType = isMediaObjectType(this.f56326j);
            if (zIsMediaObjectType) {
                v80.checkState(this.f56320d != -9223372036854775807L, "Buffered duration must be set");
                v80.checkState(this.f56325i != -9223372036854775807L, "Chunk duration must be set");
            }
            mx7<String, String> customData = this.f56317a.f42467c.getCustomData();
            quh<String> it = customData.keySet().iterator();
            while (it.hasNext()) {
                validateCustomDataListFormat(customData.get(it.next()));
            }
            if (zIsManifestObjectType) {
                iCeilDivide = -2147483647;
                requestedMaximumThroughputKbps = -2147483647;
                iCeilDivide2 = -2147483647;
            } else {
                of5 of5Var = (of5) v80.checkNotNull(this.f56319c);
                int iMax = of5Var.getSelectedFormat().f8286j;
                iCeilDivide = t0i.ceilDivide(iMax, 1000);
                h6h trackGroup = of5Var.getTrackGroup();
                for (int i = 0; i < trackGroup.f42518a; i++) {
                    iMax = Math.max(iMax, trackGroup.getFormat(i).f8286j);
                }
                iCeilDivide2 = t0i.ceilDivide(iMax, 1000);
                jCeilDivide = of5Var.getLatestBitrateEstimate() != -2147483647L ? t0i.ceilDivide(of5Var.getLatestBitrateEstimate(), 1000L) : -2147483647L;
                requestedMaximumThroughputKbps = this.f56317a.f42467c.getRequestedMaximumThroughputKbps(iCeilDivide);
            }
            C8631b.a aVar = new C8631b.a();
            if (this.f56317a.isBitrateLoggingAllowed()) {
                aVar.setBitrateKbps(iCeilDivide);
            }
            if (this.f56317a.isTopBitrateLoggingAllowed()) {
                aVar.setTopBitrateKbps(iCeilDivide2);
            }
            if (zIsMediaObjectType && this.f56317a.isObjectDurationLoggingAllowed()) {
                aVar.setObjectDurationMs(t0i.usToMs(this.f56325i));
            }
            if (this.f56317a.isObjectTypeLoggingAllowed()) {
                aVar.setObjectType(this.f56326j);
            }
            if (customData.containsKey("CMCD-Object")) {
                aVar.setCustomDataList(customData.get("CMCD-Object"));
            }
            C8632c.a aVar2 = new C8632c.a();
            if (zIsMediaObjectType) {
                if (this.f56317a.isBufferLengthLoggingAllowed()) {
                    aVar2.setBufferLengthMs(t0i.usToMs(this.f56320d));
                }
                if (this.f56317a.isDeadlineLoggingAllowed()) {
                    aVar2.setDeadlineMs(t0i.usToMs((long) (this.f56320d / this.f56321e)));
                }
            }
            if (this.f56317a.isMeasuredThroughputLoggingAllowed()) {
                aVar2.setMeasuredThroughputInKbps(jCeilDivide);
            }
            if (this.f56317a.isStartupLoggingAllowed()) {
                aVar2.setStartup(this.f56323g || this.f56324h);
            }
            if (this.f56317a.isNextObjectRequestLoggingAllowed()) {
                aVar2.setNextObjectRequest(this.f56327k);
            }
            if (this.f56317a.isNextRangeRequestLoggingAllowed()) {
                aVar2.setNextRangeRequest(this.f56328l);
            }
            if (customData.containsKey("CMCD-Request")) {
                aVar2.setCustomDataList(customData.get("CMCD-Request"));
            }
            C8633d.a aVar3 = new C8633d.a();
            if (this.f56317a.isContentIdLoggingAllowed()) {
                aVar3.setContentId(this.f56317a.f42466b);
            }
            if (this.f56317a.isSessionIdLoggingAllowed()) {
                aVar3.setSessionId(this.f56317a.f42465a);
            }
            if (this.f56317a.isStreamingFormatLoggingAllowed()) {
                aVar3.setStreamingFormat(this.f56318b);
            }
            if (this.f56322f != null && this.f56317a.isStreamTypeLoggingAllowed()) {
                aVar3.setStreamType(((Boolean) v80.checkNotNull(this.f56322f)).booleanValue() ? "l" : "v");
            }
            if (this.f56317a.isPlaybackRateLoggingAllowed()) {
                aVar3.setPlaybackRate(this.f56321e);
            }
            if (customData.containsKey("CMCD-Session")) {
                aVar3.setCustomDataList(customData.get("CMCD-Session"));
            }
            C8634e.a aVar4 = new C8634e.a();
            if (this.f56317a.isMaximumRequestThroughputLoggingAllowed()) {
                aVar4.setMaximumRequestedThroughputKbps(requestedMaximumThroughputKbps);
            }
            if (this.f56317a.isBufferStarvationLoggingAllowed()) {
                aVar4.setBufferStarvation(this.f56323g);
            }
            if (customData.containsKey("CMCD-Status")) {
                aVar4.setCustomDataList(customData.get("CMCD-Status"));
            }
            return new l62(aVar.build(), aVar2.build(), aVar3.build(), aVar4.build(), this.f56317a.f42468d);
        }

        @op1
        public C8635f setBufferedDurationUs(long j) {
            v80.checkArgument(j >= 0);
            this.f56320d = j;
            return this;
        }

        @op1
        public C8635f setChunkDurationUs(long j) {
            v80.checkArgument(j >= 0);
            this.f56325i = j;
            return this;
        }

        @op1
        public C8635f setDidRebuffer(boolean z) {
            this.f56323g = z;
            return this;
        }

        @op1
        public C8635f setIsBufferEmpty(boolean z) {
            this.f56324h = z;
            return this;
        }

        @op1
        public C8635f setIsLive(boolean z) {
            this.f56322f = Boolean.valueOf(z);
            return this;
        }

        @op1
        public C8635f setNextObjectRequest(@hib String str) {
            this.f56327k = str;
            return this;
        }

        @op1
        public C8635f setNextRangeRequest(@hib String str) {
            this.f56328l = str;
            return this;
        }

        @op1
        public C8635f setObjectType(@hib String str) {
            this.f56326j = str;
            return this;
        }

        @op1
        public C8635f setPlaybackRate(float f) {
            v80.checkArgument(f == -3.4028235E38f || f > 0.0f);
            this.f56321e = f;
            return this;
        }

        @op1
        public C8635f setTrackSelection(of5 of5Var) {
            this.f56319c = of5Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: l62$g */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8636g {
    }

    /* JADX INFO: renamed from: l62$h */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8637h {
    }

    /* JADX INFO: renamed from: l62$i */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8638i {
    }

    @yx1
    public static xh3 removeFromDataSpec(xh3 xh3Var) {
        if (xh3Var.f97800a.getQueryParameter(h62.f42448j) != null) {
            xh3Var = xh3Var.withUri(removeFromUri(xh3Var.f97800a));
        }
        if (!xh3Var.f97804e.containsKey("CMCD-Object") && !xh3Var.f97804e.containsKey("CMCD-Request") && !xh3Var.f97804e.containsKey("CMCD-Status") && !xh3Var.f97804e.containsKey("CMCD-Session")) {
            return xh3Var;
        }
        ox7.C10705d c10705dBuilder = ox7.builder();
        for (Map.Entry<String, String> entry : xh3Var.f97804e.entrySet()) {
            if (!entry.getKey().equals("CMCD-Object") && !entry.getKey().equals("CMCD-Request") && !entry.getKey().equals("CMCD-Status") && !entry.getKey().equals("CMCD-Session")) {
                c10705dBuilder.put(entry);
            }
        }
        return xh3Var.withRequestHeaders(c10705dBuilder.buildOrThrow());
    }

    @yx1
    public static Uri removeFromUri(Uri uri) {
        return uri.getQueryParameter(h62.f42448j) != null ? cyh.removeQueryParameter(uri, h62.f42448j) : uri;
    }

    @yx1
    public xh3 addToDataSpec(xh3 xh3Var) {
        r60<String, String> r60VarCreate = r60.create();
        this.f56268a.populateCmcdDataMap(r60VarCreate);
        this.f56269b.populateCmcdDataMap(r60VarCreate);
        this.f56270c.populateCmcdDataMap(r60VarCreate);
        this.f56271d.populateCmcdDataMap(r60VarCreate);
        if (this.f56272e != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = r60VarCreate.asMap().values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) it.next());
            }
            Collections.sort(arrayList);
            return xh3Var.buildUpon().setUri(xh3Var.f97800a.buildUpon().appendQueryParameter(h62.f42448j, f56267p.join(arrayList)).build()).build();
        }
        ox7.C10705d c10705dBuilder = ox7.builder();
        for (String str : r60VarCreate.keySet()) {
            List list = r60VarCreate.get((Object) str);
            Collections.sort(list);
            c10705dBuilder.put(str, f56267p.join(list));
        }
        return xh3Var.withAdditionalHeaders(c10705dBuilder.buildOrThrow());
    }

    private l62(C8631b c8631b, C8632c c8632c, C8633d c8633d, C8634e c8634e, int i) {
        this.f56268a = c8631b;
        this.f56269b = c8632c;
        this.f56270c = c8633d;
        this.f56271d = c8634e;
        this.f56272e = i;
    }
}
