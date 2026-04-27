package p000;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.ox7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m62 {

    /* JADX INFO: renamed from: h */
    public static final String f59957h = "d";

    /* JADX INFO: renamed from: i */
    public static final String f59958i = "h";

    /* JADX INFO: renamed from: j */
    public static final String f59959j = "s";

    /* JADX INFO: renamed from: k */
    public static final String f59960k = "v";

    /* JADX INFO: renamed from: l */
    public static final String f59961l = "l";

    /* JADX INFO: renamed from: m */
    public static final String f59962m = "i";

    /* JADX INFO: renamed from: n */
    public static final String f59963n = "a";

    /* JADX INFO: renamed from: o */
    public static final String f59964o = "v";

    /* JADX INFO: renamed from: p */
    public static final String f59965p = "av";

    /* JADX INFO: renamed from: a */
    public final k62 f59966a;

    /* JADX INFO: renamed from: b */
    public final pf5 f59967b;

    /* JADX INFO: renamed from: c */
    public final long f59968c;

    /* JADX INFO: renamed from: d */
    public final String f59969d;

    /* JADX INFO: renamed from: e */
    public final boolean f59970e;

    /* JADX INFO: renamed from: f */
    public long f59971f;

    /* JADX INFO: renamed from: g */
    @hib
    public String f59972g;

    /* JADX INFO: renamed from: m62$b */
    public static final class C9153b {

        /* JADX INFO: renamed from: a */
        public final int f59973a;

        /* JADX INFO: renamed from: b */
        public final int f59974b;

        /* JADX INFO: renamed from: c */
        public final long f59975c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f59976d;

        /* JADX INFO: renamed from: e */
        @hib
        public final String f59977e;

        /* JADX INFO: renamed from: m62$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public int f59978a = -2147483647;

            /* JADX INFO: renamed from: b */
            public int f59979b = -2147483647;

            /* JADX INFO: renamed from: c */
            public long f59980c = -9223372036854775807L;

            /* JADX INFO: renamed from: d */
            @hib
            public String f59981d;

            /* JADX INFO: renamed from: e */
            @hib
            public String f59982e;

            public C9153b build() {
                return new C9153b(this);
            }

            @op1
            public a setBitrateKbps(int i) {
                this.f59978a = i;
                return this;
            }

            @op1
            public a setCustomData(@hib String str) {
                this.f59982e = str;
                return this;
            }

            @op1
            public a setObjectDurationMs(long j) {
                u80.checkArgument(j >= 0);
                this.f59980c = j;
                return this;
            }

            @op1
            public a setObjectType(@hib String str) {
                this.f59981d = str;
                return this;
            }

            @op1
            public a setTopBitrateKbps(int i) {
                this.f59979b = i;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ox7.C10705d<String, String> c10705d) {
            StringBuilder sb = new StringBuilder();
            int i = this.f59973a;
            if (i != -2147483647) {
                sb.append(x0i.formatInvariant("%s=%d,", "br", Integer.valueOf(i)));
            }
            int i2 = this.f59974b;
            if (i2 != -2147483647) {
                sb.append(x0i.formatInvariant("%s=%d,", "tb", Integer.valueOf(i2)));
            }
            long j = this.f59975c;
            if (j != -9223372036854775807L) {
                sb.append(x0i.formatInvariant("%s=%d,", "d", Long.valueOf(j)));
            }
            if (!TextUtils.isEmpty(this.f59976d)) {
                sb.append(x0i.formatInvariant("%s=%s,", "ot", this.f59976d));
            }
            if (!TextUtils.isEmpty(this.f59977e)) {
                sb.append(x0i.formatInvariant("%s,", this.f59977e));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            c10705d.put("CMCD-Object", sb.toString());
        }

        private C9153b(a aVar) {
            this.f59973a = aVar.f59978a;
            this.f59974b = aVar.f59979b;
            this.f59975c = aVar.f59980c;
            this.f59976d = aVar.f59981d;
            this.f59977e = aVar.f59982e;
        }
    }

    /* JADX INFO: renamed from: m62$c */
    public static final class C9154c {

        /* JADX INFO: renamed from: a */
        public final long f59983a;

        /* JADX INFO: renamed from: b */
        public final long f59984b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f59985c;

        /* JADX INFO: renamed from: m62$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f59986a = -9223372036854775807L;

            /* JADX INFO: renamed from: b */
            public long f59987b = Long.MIN_VALUE;

            /* JADX INFO: renamed from: c */
            @hib
            public String f59988c;

            public C9154c build() {
                return new C9154c(this);
            }

            @op1
            public a setBufferLengthMs(long j) {
                u80.checkArgument(j >= 0);
                this.f59986a = ((j + 50) / 100) * 100;
                return this;
            }

            @op1
            public a setCustomData(@hib String str) {
                this.f59988c = str;
                return this;
            }

            @op1
            public a setMeasuredThroughputInKbps(long j) {
                u80.checkArgument(j >= 0);
                this.f59987b = ((j + 50) / 100) * 100;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ox7.C10705d<String, String> c10705d) {
            StringBuilder sb = new StringBuilder();
            long j = this.f59983a;
            if (j != -9223372036854775807L) {
                sb.append(x0i.formatInvariant("%s=%d,", "bl", Long.valueOf(j)));
            }
            long j2 = this.f59984b;
            if (j2 != Long.MIN_VALUE) {
                sb.append(x0i.formatInvariant("%s=%d,", "mtp", Long.valueOf(j2)));
            }
            if (!TextUtils.isEmpty(this.f59985c)) {
                sb.append(x0i.formatInvariant("%s,", this.f59985c));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            c10705d.put("CMCD-Request", sb.toString());
        }

        private C9154c(a aVar) {
            this.f59983a = aVar.f59986a;
            this.f59984b = aVar.f59987b;
            this.f59985c = aVar.f59988c;
        }
    }

    /* JADX INFO: renamed from: m62$d */
    public static final class C9155d {

        /* JADX INFO: renamed from: f */
        public static final int f59989f = 1;

        /* JADX INFO: renamed from: a */
        @hib
        public final String f59990a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f59991b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f59992c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f59993d;

        /* JADX INFO: renamed from: e */
        @hib
        public final String f59994e;

        /* JADX INFO: renamed from: m62$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @hib
            public String f59995a;

            /* JADX INFO: renamed from: b */
            @hib
            public String f59996b;

            /* JADX INFO: renamed from: c */
            @hib
            public String f59997c;

            /* JADX INFO: renamed from: d */
            @hib
            public String f59998d;

            /* JADX INFO: renamed from: e */
            @hib
            public String f59999e;

            public C9155d build() {
                return new C9155d(this);
            }

            @op1
            public a setContentId(@hib String str) {
                u80.checkArgument(str == null || str.length() <= 64);
                this.f59995a = str;
                return this;
            }

            @op1
            public a setCustomData(@hib String str) {
                this.f59999e = str;
                return this;
            }

            @op1
            public a setSessionId(@hib String str) {
                u80.checkArgument(str == null || str.length() <= 64);
                this.f59996b = str;
                return this;
            }

            @op1
            public a setStreamType(@hib String str) {
                this.f59998d = str;
                return this;
            }

            @op1
            public a setStreamingFormat(@hib String str) {
                this.f59997c = str;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ox7.C10705d<String, String> c10705d) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f59990a)) {
                sb.append(x0i.formatInvariant("%s=\"%s\",", "cid", this.f59990a));
            }
            if (!TextUtils.isEmpty(this.f59991b)) {
                sb.append(x0i.formatInvariant("%s=\"%s\",", "sid", this.f59991b));
            }
            if (!TextUtils.isEmpty(this.f59992c)) {
                sb.append(x0i.formatInvariant("%s=%s,", "sf", this.f59992c));
            }
            if (!TextUtils.isEmpty(this.f59993d)) {
                sb.append(x0i.formatInvariant("%s=%s,", "st", this.f59993d));
            }
            if (!TextUtils.isEmpty(this.f59994e)) {
                sb.append(x0i.formatInvariant("%s,", this.f59994e));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            c10705d.put("CMCD-Session", sb.toString());
        }

        private C9155d(a aVar) {
            this.f59990a = aVar.f59995a;
            this.f59991b = aVar.f59996b;
            this.f59992c = aVar.f59997c;
            this.f59993d = aVar.f59998d;
            this.f59994e = aVar.f59999e;
        }
    }

    /* JADX INFO: renamed from: m62$e */
    public static final class C9156e {

        /* JADX INFO: renamed from: a */
        public final int f60000a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f60001b;

        /* JADX INFO: renamed from: m62$e$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public int f60002a = -2147483647;

            /* JADX INFO: renamed from: b */
            @hib
            public String f60003b;

            public C9156e build() {
                return new C9156e(this);
            }

            @op1
            public a setCustomData(@hib String str) {
                this.f60003b = str;
                return this;
            }

            @op1
            public a setMaximumRequestedThroughputKbps(int i) {
                u80.checkArgument(i == -2147483647 || i >= 0);
                if (i != -2147483647) {
                    i = ((i + 50) / 100) * 100;
                }
                this.f60002a = i;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ox7.C10705d<String, String> c10705d) {
            StringBuilder sb = new StringBuilder();
            int i = this.f60000a;
            if (i != -2147483647) {
                sb.append(x0i.formatInvariant("%s=%d,", "rtp", Integer.valueOf(i)));
            }
            if (!TextUtils.isEmpty(this.f60001b)) {
                sb.append(x0i.formatInvariant("%s,", this.f60001b));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            c10705d.put("CMCD-Status", sb.toString());
        }

        private C9156e(a aVar) {
            this.f60000a = aVar.f60002a;
            this.f60001b = aVar.f60003b;
        }
    }

    /* JADX INFO: renamed from: m62$f */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9157f {
    }

    /* JADX INFO: renamed from: m62$g */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9158g {
    }

    /* JADX INFO: renamed from: m62$h */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9159h {
    }

    public m62(k62 k62Var, pf5 pf5Var, long j, String str, boolean z) {
        u80.checkArgument(j >= 0);
        this.f59966a = k62Var;
        this.f59967b = pf5Var;
        this.f59968c = j;
        this.f59969d = str;
        this.f59970e = z;
        this.f59971f = -9223372036854775807L;
    }

    private boolean getIsInitSegment() {
        String str = this.f59972g;
        return str != null && str.equals("i");
    }

    @hib
    public static String getObjectType(pf5 pf5Var) {
        u80.checkArgument(pf5Var != null);
        int trackType = sva.getTrackType(pf5Var.getSelectedFormat().f54989M);
        if (trackType == -1) {
            trackType = sva.getTrackType(pf5Var.getSelectedFormat().f54988L);
        }
        if (trackType == 1) {
            return "a";
        }
        if (trackType == 2) {
            return "v";
        }
        return null;
    }

    public ox7<String, String> createHttpRequestHeaders() {
        ox7<String, String> customData = this.f59966a.f52639c.getCustomData();
        int iCeilDivide = x0i.ceilDivide(this.f59967b.getSelectedFormat().f54985C, 1000);
        C9153b.a customData2 = new C9153b.a().setCustomData(customData.get("CMCD-Object"));
        if (!getIsInitSegment()) {
            if (this.f59966a.isBitrateLoggingAllowed()) {
                customData2.setBitrateKbps(iCeilDivide);
            }
            if (this.f59966a.isTopBitrateLoggingAllowed()) {
                g6h trackGroup = this.f59967b.getTrackGroup();
                int iMax = this.f59967b.getSelectedFormat().f54985C;
                for (int i = 0; i < trackGroup.f38907a; i++) {
                    iMax = Math.max(iMax, trackGroup.getFormat(i).f54985C);
                }
                customData2.setTopBitrateKbps(x0i.ceilDivide(iMax, 1000));
            }
            if (this.f59966a.isObjectDurationLoggingAllowed()) {
                long j = this.f59971f;
                if (j != -9223372036854775807L) {
                    customData2.setObjectDurationMs(j / 1000);
                }
            }
        }
        if (this.f59966a.isObjectTypeLoggingAllowed()) {
            customData2.setObjectType(this.f59972g);
        }
        C9154c.a customData3 = new C9154c.a().setCustomData(customData.get("CMCD-Request"));
        if (!getIsInitSegment() && this.f59966a.isBufferLengthLoggingAllowed()) {
            customData3.setBufferLengthMs(this.f59968c / 1000);
        }
        if (this.f59966a.isMeasuredThroughputLoggingAllowed() && this.f59967b.getLatestBitrateEstimate() != Long.MIN_VALUE) {
            customData3.setMeasuredThroughputInKbps(x0i.ceilDivide(this.f59967b.getLatestBitrateEstimate(), 1000L));
        }
        C9155d.a customData4 = new C9155d.a().setCustomData(customData.get("CMCD-Session"));
        if (this.f59966a.isContentIdLoggingAllowed()) {
            customData4.setContentId(this.f59966a.f52638b);
        }
        if (this.f59966a.isSessionIdLoggingAllowed()) {
            customData4.setSessionId(this.f59966a.f52637a);
        }
        if (this.f59966a.isStreamingFormatLoggingAllowed()) {
            customData4.setStreamingFormat(this.f59969d);
        }
        if (this.f59966a.isStreamTypeLoggingAllowed()) {
            customData4.setStreamType(this.f59970e ? "l" : "v");
        }
        C9156e.a customData5 = new C9156e.a().setCustomData(customData.get("CMCD-Status"));
        if (this.f59966a.isMaximumRequestThroughputLoggingAllowed()) {
            customData5.setMaximumRequestedThroughputKbps(this.f59966a.f52639c.getRequestedMaximumThroughputKbps(iCeilDivide));
        }
        ox7.C10705d<String, String> c10705dBuilder = ox7.builder();
        customData2.build().populateHttpRequestHeaders(c10705dBuilder);
        customData3.build().populateHttpRequestHeaders(c10705dBuilder);
        customData4.build().populateHttpRequestHeaders(c10705dBuilder);
        customData5.build().populateHttpRequestHeaders(c10705dBuilder);
        return c10705dBuilder.buildOrThrow();
    }

    @op1
    public m62 setChunkDurationUs(long j) {
        u80.checkArgument(j >= 0);
        this.f59971f = j;
        return this;
    }

    @op1
    public m62 setObjectType(@hib String str) {
        this.f59972g = str;
        return this;
    }
}
