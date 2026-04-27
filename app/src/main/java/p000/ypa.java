package p000;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import p000.mx7;
import p000.xj8;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tw7
@nx4
public final class ypa {

    /* JADX INFO: renamed from: l */
    public static final String f102562l = "application";

    /* JADX INFO: renamed from: m */
    public static final String f102565m = "audio";

    /* JADX INFO: renamed from: n */
    public static final String f102568n = "image";

    /* JADX INFO: renamed from: o */
    public static final String f102571o = "text";

    /* JADX INFO: renamed from: p */
    public static final String f102574p = "video";

    /* JADX INFO: renamed from: r */
    public static final String f102580r = "*";

    /* JADX INFO: renamed from: a */
    public final String f102607a;

    /* JADX INFO: renamed from: b */
    public final String f102608b;

    /* JADX INFO: renamed from: c */
    public final mx7<String, String> f102609c;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public String f102610d;

    /* JADX INFO: renamed from: e */
    @ez8
    public int f102611e;

    /* JADX INFO: renamed from: f */
    @wx1
    @ez8
    public z6c<Charset> f102612f;

    /* JADX INFO: renamed from: g */
    public static final String f102547g = "charset";

    /* JADX INFO: renamed from: h */
    public static final mx7<String, String> f102550h = mx7.m17656of(f102547g, i80.toLowerCase(yw1.f103176c.name()));

    /* JADX INFO: renamed from: i */
    public static final yv1 f102553i = yv1.ascii().and(yv1.javaIsoControl().negate()).and(yv1.isNot(' ')).and(yv1.noneOf("()<>@,;:\\\"/[]?="));

    /* JADX INFO: renamed from: j */
    public static final yv1 f102556j = yv1.ascii().and(yv1.noneOf("\"\\\r"));

    /* JADX INFO: renamed from: k */
    public static final yv1 f102559k = yv1.anyOf(" \t\r\n");

    /* JADX INFO: renamed from: s */
    public static final Map<ypa, ypa> f102583s = tt9.newHashMap();

    /* JADX INFO: renamed from: t */
    public static final ypa f102586t = createConstant("*", "*");

    /* JADX INFO: renamed from: u */
    public static final ypa f102589u = createConstant("text", "*");

    /* JADX INFO: renamed from: v */
    public static final ypa f102592v = createConstant("image", "*");

    /* JADX INFO: renamed from: w */
    public static final ypa f102595w = createConstant("audio", "*");

    /* JADX INFO: renamed from: x */
    public static final ypa f102598x = createConstant("video", "*");

    /* JADX INFO: renamed from: y */
    public static final ypa f102601y = createConstant("application", "*");

    /* JADX INFO: renamed from: q */
    public static final String f102577q = "font";

    /* JADX INFO: renamed from: z */
    public static final ypa f102604z = createConstant(f102577q, "*");

    /* JADX INFO: renamed from: A */
    public static final ypa f102478A = createConstantUtf8("text", "cache-manifest");

    /* JADX INFO: renamed from: B */
    public static final ypa f102481B = createConstantUtf8("text", "css");

    /* JADX INFO: renamed from: C */
    public static final ypa f102484C = createConstantUtf8("text", "csv");

    /* JADX INFO: renamed from: D */
    public static final ypa f102487D = createConstantUtf8("text", "html");

    /* JADX INFO: renamed from: E */
    public static final ypa f102490E = createConstantUtf8("text", "calendar");

    /* JADX INFO: renamed from: F */
    public static final ypa f102493F = createConstantUtf8("text", "plain");

    /* JADX INFO: renamed from: G */
    public static final ypa f102495G = createConstantUtf8("text", "javascript");

    /* JADX INFO: renamed from: H */
    public static final ypa f102497H = createConstantUtf8("text", "tab-separated-values");

    /* JADX INFO: renamed from: I */
    public static final ypa f102499I = createConstantUtf8("text", "vcard");

    /* JADX INFO: renamed from: J */
    public static final ypa f102501J = createConstantUtf8("text", "vnd.wap.wml");

    /* JADX INFO: renamed from: K */
    public static final ypa f102503K = createConstantUtf8("text", "xml");

    /* JADX INFO: renamed from: L */
    public static final ypa f102505L = createConstantUtf8("text", "vtt");

    /* JADX INFO: renamed from: M */
    public static final ypa f102507M = createConstant("image", "bmp");

    /* JADX INFO: renamed from: N */
    public static final ypa f102509N = createConstant("image", "x-canon-crw");

    /* JADX INFO: renamed from: O */
    public static final ypa f102511O = createConstant("image", "gif");

    /* JADX INFO: renamed from: P */
    public static final ypa f102513P = createConstant("image", "vnd.microsoft.icon");

    /* JADX INFO: renamed from: Q */
    public static final ypa f102515Q = createConstant("image", "jpeg");

    /* JADX INFO: renamed from: R */
    public static final ypa f102517R = createConstant("image", "png");

    /* JADX INFO: renamed from: S */
    public static final ypa f102519S = createConstant("image", "vnd.adobe.photoshop");

    /* JADX INFO: renamed from: T */
    public static final ypa f102521T = createConstantUtf8("image", "svg+xml");

    /* JADX INFO: renamed from: U */
    public static final ypa f102523U = createConstant("image", "tiff");

    /* JADX INFO: renamed from: V */
    public static final ypa f102525V = createConstant("image", "webp");

    /* JADX INFO: renamed from: W */
    public static final ypa f102527W = createConstant("image", "heif");

    /* JADX INFO: renamed from: X */
    public static final ypa f102529X = createConstant("image", "jp2");

    /* JADX INFO: renamed from: Y */
    public static final ypa f102531Y = createConstant("audio", "mp4");

    /* JADX INFO: renamed from: Z */
    public static final ypa f102533Z = createConstant("audio", "mpeg");

    /* JADX INFO: renamed from: a0 */
    public static final ypa f102535a0 = createConstant("audio", "ogg");

    /* JADX INFO: renamed from: b0 */
    public static final ypa f102537b0 = createConstant("audio", "webm");

    /* JADX INFO: renamed from: c0 */
    public static final ypa f102539c0 = createConstant("audio", "l16");

    /* JADX INFO: renamed from: d0 */
    public static final ypa f102541d0 = createConstant("audio", "l24");

    /* JADX INFO: renamed from: e0 */
    public static final ypa f102543e0 = createConstant("audio", "basic");

    /* JADX INFO: renamed from: f0 */
    public static final ypa f102545f0 = createConstant("audio", "aac");

    /* JADX INFO: renamed from: g0 */
    public static final ypa f102548g0 = createConstant("audio", "vorbis");

    /* JADX INFO: renamed from: h0 */
    public static final ypa f102551h0 = createConstant("audio", "x-ms-wma");

    /* JADX INFO: renamed from: i0 */
    public static final ypa f102554i0 = createConstant("audio", "x-ms-wax");

    /* JADX INFO: renamed from: j0 */
    public static final ypa f102557j0 = createConstant("audio", "vnd.rn-realaudio");

    /* JADX INFO: renamed from: k0 */
    public static final ypa f102560k0 = createConstant("audio", "vnd.wave");

    /* JADX INFO: renamed from: l0 */
    public static final ypa f102563l0 = createConstant("video", "mp4");

    /* JADX INFO: renamed from: m0 */
    public static final ypa f102566m0 = createConstant("video", "mpeg");

    /* JADX INFO: renamed from: n0 */
    public static final ypa f102569n0 = createConstant("video", "ogg");

    /* JADX INFO: renamed from: o0 */
    public static final ypa f102572o0 = createConstant("video", "quicktime");

    /* JADX INFO: renamed from: p0 */
    public static final ypa f102575p0 = createConstant("video", "webm");

    /* JADX INFO: renamed from: q0 */
    public static final ypa f102578q0 = createConstant("video", "x-ms-wmv");

    /* JADX INFO: renamed from: r0 */
    public static final ypa f102581r0 = createConstant("video", "x-flv");

    /* JADX INFO: renamed from: s0 */
    public static final ypa f102584s0 = createConstant("video", "3gpp");

    /* JADX INFO: renamed from: t0 */
    public static final ypa f102587t0 = createConstant("video", "3gpp2");

    /* JADX INFO: renamed from: u0 */
    public static final ypa f102590u0 = createConstantUtf8("application", "xml");

    /* JADX INFO: renamed from: v0 */
    public static final ypa f102593v0 = createConstantUtf8("application", "atom+xml");

    /* JADX INFO: renamed from: w0 */
    public static final ypa f102596w0 = createConstant("application", "x-bzip2");

    /* JADX INFO: renamed from: x0 */
    public static final ypa f102599x0 = createConstantUtf8("application", "dart");

    /* JADX INFO: renamed from: y0 */
    public static final ypa f102602y0 = createConstant("application", "vnd.apple.pkpass");

    /* JADX INFO: renamed from: z0 */
    public static final ypa f102605z0 = createConstant("application", "vnd.ms-fontobject");

    /* JADX INFO: renamed from: A0 */
    public static final ypa f102479A0 = createConstant("application", "epub+zip");

    /* JADX INFO: renamed from: B0 */
    public static final ypa f102482B0 = createConstant("application", "x-www-form-urlencoded");

    /* JADX INFO: renamed from: C0 */
    public static final ypa f102485C0 = createConstant("application", "pkcs12");

    /* JADX INFO: renamed from: D0 */
    public static final ypa f102488D0 = createConstant("application", "binary");

    /* JADX INFO: renamed from: E0 */
    public static final ypa f102491E0 = createConstant("application", "geo+json");

    /* JADX INFO: renamed from: F0 */
    public static final ypa f102494F0 = createConstant("application", "x-gzip");

    /* JADX INFO: renamed from: G0 */
    public static final ypa f102496G0 = createConstant("application", "hal+json");

    /* JADX INFO: renamed from: H0 */
    public static final ypa f102498H0 = createConstantUtf8("application", "javascript");

    /* JADX INFO: renamed from: I0 */
    public static final ypa f102500I0 = createConstant("application", "jose");

    /* JADX INFO: renamed from: J0 */
    public static final ypa f102502J0 = createConstant("application", "jose+json");

    /* JADX INFO: renamed from: K0 */
    public static final ypa f102504K0 = createConstantUtf8("application", "json");

    /* JADX INFO: renamed from: L0 */
    public static final ypa f102506L0 = createConstant("application", "jwt");

    /* JADX INFO: renamed from: M0 */
    public static final ypa f102508M0 = createConstantUtf8("application", "manifest+json");

    /* JADX INFO: renamed from: N0 */
    public static final ypa f102510N0 = createConstant("application", "vnd.google-earth.kml+xml");

    /* JADX INFO: renamed from: O0 */
    public static final ypa f102512O0 = createConstant("application", "vnd.google-earth.kmz");

    /* JADX INFO: renamed from: P0 */
    public static final ypa f102514P0 = createConstant("application", "mbox");

    /* JADX INFO: renamed from: Q0 */
    public static final ypa f102516Q0 = createConstant("application", "x-apple-aspen-config");

    /* JADX INFO: renamed from: R0 */
    public static final ypa f102518R0 = createConstant("application", "vnd.ms-excel");

    /* JADX INFO: renamed from: S0 */
    public static final ypa f102520S0 = createConstant("application", "vnd.ms-outlook");

    /* JADX INFO: renamed from: T0 */
    public static final ypa f102522T0 = createConstant("application", "vnd.ms-powerpoint");

    /* JADX INFO: renamed from: U0 */
    public static final ypa f102524U0 = createConstant("application", "msword");

    /* JADX INFO: renamed from: V0 */
    public static final ypa f102526V0 = createConstant("application", "dash+xml");

    /* JADX INFO: renamed from: W0 */
    public static final ypa f102528W0 = createConstant("application", "wasm");

    /* JADX INFO: renamed from: X0 */
    public static final ypa f102530X0 = createConstant("application", "x-nacl");

    /* JADX INFO: renamed from: Y0 */
    public static final ypa f102532Y0 = createConstant("application", "x-pnacl");

    /* JADX INFO: renamed from: Z0 */
    public static final ypa f102534Z0 = createConstant("application", "octet-stream");

    /* JADX INFO: renamed from: a1 */
    public static final ypa f102536a1 = createConstant("application", "ogg");

    /* JADX INFO: renamed from: b1 */
    public static final ypa f102538b1 = createConstant("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");

    /* JADX INFO: renamed from: c1 */
    public static final ypa f102540c1 = createConstant("application", "vnd.openxmlformats-officedocument.presentationml.presentation");

    /* JADX INFO: renamed from: d1 */
    public static final ypa f102542d1 = createConstant("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    /* JADX INFO: renamed from: e1 */
    public static final ypa f102544e1 = createConstant("application", "vnd.oasis.opendocument.graphics");

    /* JADX INFO: renamed from: f1 */
    public static final ypa f102546f1 = createConstant("application", "vnd.oasis.opendocument.presentation");

    /* JADX INFO: renamed from: g1 */
    public static final ypa f102549g1 = createConstant("application", "vnd.oasis.opendocument.spreadsheet");

    /* JADX INFO: renamed from: h1 */
    public static final ypa f102552h1 = createConstant("application", "vnd.oasis.opendocument.text");

    /* JADX INFO: renamed from: i1 */
    public static final ypa f102555i1 = createConstantUtf8("application", "opensearchdescription+xml");

    /* JADX INFO: renamed from: j1 */
    public static final ypa f102558j1 = createConstant("application", "pdf");

    /* JADX INFO: renamed from: k1 */
    public static final ypa f102561k1 = createConstant("application", "postscript");

    /* JADX INFO: renamed from: l1 */
    public static final ypa f102564l1 = createConstant("application", "protobuf");

    /* JADX INFO: renamed from: m1 */
    public static final ypa f102567m1 = createConstantUtf8("application", "rdf+xml");

    /* JADX INFO: renamed from: n1 */
    public static final ypa f102570n1 = createConstantUtf8("application", "rtf");

    /* JADX INFO: renamed from: o1 */
    public static final ypa f102573o1 = createConstant("application", "font-sfnt");

    /* JADX INFO: renamed from: p1 */
    public static final ypa f102576p1 = createConstant("application", "x-shockwave-flash");

    /* JADX INFO: renamed from: q1 */
    public static final ypa f102579q1 = createConstant("application", "vnd.sketchup.skp");

    /* JADX INFO: renamed from: r1 */
    public static final ypa f102582r1 = createConstantUtf8("application", "soap+xml");

    /* JADX INFO: renamed from: s1 */
    public static final ypa f102585s1 = createConstant("application", "x-tar");

    /* JADX INFO: renamed from: t1 */
    public static final ypa f102588t1 = createConstant("application", "font-woff");

    /* JADX INFO: renamed from: u1 */
    public static final ypa f102591u1 = createConstant("application", "font-woff2");

    /* JADX INFO: renamed from: v1 */
    public static final ypa f102594v1 = createConstantUtf8("application", "xhtml+xml");

    /* JADX INFO: renamed from: w1 */
    public static final ypa f102597w1 = createConstantUtf8("application", "xrd+xml");

    /* JADX INFO: renamed from: x1 */
    public static final ypa f102600x1 = createConstant("application", ArchiveStreamFactory.ZIP);

    /* JADX INFO: renamed from: y1 */
    public static final ypa f102603y1 = createConstant(f102577q, "collection");

    /* JADX INFO: renamed from: z1 */
    public static final ypa f102606z1 = createConstant(f102577q, "otf");

    /* JADX INFO: renamed from: A1 */
    public static final ypa f102480A1 = createConstant(f102577q, "sfnt");

    /* JADX INFO: renamed from: B1 */
    public static final ypa f102483B1 = createConstant(f102577q, "ttf");

    /* JADX INFO: renamed from: C1 */
    public static final ypa f102486C1 = createConstant(f102577q, "woff");

    /* JADX INFO: renamed from: D1 */
    public static final ypa f102489D1 = createConstant(f102577q, "woff2");

    /* JADX INFO: renamed from: E1 */
    public static final xj8.C15156d f102492E1 = xj8.m25235on("; ").withKeyValueSeparator("=");

    /* JADX INFO: renamed from: ypa$a */
    public static final class C15758a {

        /* JADX INFO: renamed from: a */
        public final String f102613a;

        /* JADX INFO: renamed from: b */
        public int f102614b = 0;

        public C15758a(String input) {
            this.f102613a = input;
        }

        @op1
        /* JADX INFO: renamed from: a */
        public char m26291a(char c) {
            v7d.checkState(m26295e());
            v7d.checkState(m26296f() == c);
            this.f102614b++;
            return c;
        }

        /* JADX INFO: renamed from: b */
        public char m26292b(yv1 matcher) {
            v7d.checkState(m26295e());
            char cM26296f = m26296f();
            v7d.checkState(matcher.matches(cM26296f));
            this.f102614b++;
            return cM26296f;
        }

        /* JADX INFO: renamed from: c */
        public String m26293c(yv1 matcher) {
            int i = this.f102614b;
            String strM26294d = m26294d(matcher);
            v7d.checkState(this.f102614b != i);
            return strM26294d;
        }

        @op1
        /* JADX INFO: renamed from: d */
        public String m26294d(yv1 matcher) {
            v7d.checkState(m26295e());
            int i = this.f102614b;
            this.f102614b = matcher.negate().indexIn(this.f102613a, i);
            return m26295e() ? this.f102613a.substring(i, this.f102614b) : this.f102613a.substring(i);
        }

        /* JADX INFO: renamed from: e */
        public boolean m26295e() {
            int i = this.f102614b;
            return i >= 0 && i < this.f102613a.length();
        }

        /* JADX INFO: renamed from: f */
        public char m26296f() {
            v7d.checkState(m26295e());
            return this.f102613a.charAt(this.f102614b);
        }
    }

    private ypa(String type, String subtype, mx7<String, String> parameters) {
        this.f102607a = type;
        this.f102608b = subtype;
        this.f102609c = parameters;
    }

    private static ypa addKnownType(ypa mediaType) {
        f102583s.put(mediaType, mediaType);
        return mediaType;
    }

    /* JADX INFO: renamed from: b */
    public static ypa m26284b(String subtype) {
        return create("application", subtype);
    }

    /* JADX INFO: renamed from: c */
    public static ypa m26285c(String subtype) {
        return create("audio", subtype);
    }

    private String computeToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f102607a);
        sb.append('/');
        sb.append(this.f102608b);
        if (!this.f102609c.isEmpty()) {
            sb.append("; ");
            f102492E1.appendTo(sb, x3b.transformValues((j99) this.f102609c, new lz6() { // from class: vpa
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return ypa.lambda$computeToString$0((String) obj);
                }
            }).entries());
        }
        return sb.toString();
    }

    private static void consumeSeparator(C15758a tokenizer, char c) {
        yv1 yv1Var = f102559k;
        tokenizer.m26294d(yv1Var);
        tokenizer.m26291a(c);
        tokenizer.m26294d(yv1Var);
    }

    public static ypa create(String type, String subtype) {
        ypa ypaVarCreate = create(type, subtype, mx7.m17655of());
        ypaVarCreate.f102612f = z6c.absent();
        return ypaVarCreate;
    }

    private static ypa createConstant(String type, String subtype) {
        ypa ypaVarAddKnownType = addKnownType(new ypa(type, subtype, mx7.m17655of()));
        ypaVarAddKnownType.f102612f = z6c.absent();
        return ypaVarAddKnownType;
    }

    private static ypa createConstantUtf8(String type, String subtype) {
        ypa ypaVarAddKnownType = addKnownType(new ypa(type, subtype, f102550h));
        ypaVarAddKnownType.f102612f = z6c.m26593of(yw1.f103176c);
        return ypaVarAddKnownType;
    }

    /* JADX INFO: renamed from: d */
    public static ypa m26286d(String subtype) {
        return create(f102577q, subtype);
    }

    /* JADX INFO: renamed from: e */
    public static ypa m26287e(String subtype) {
        return create("image", subtype);
    }

    private static String escapeAndQuote(String value) {
        StringBuilder sb = new StringBuilder(value.length() + 16);
        sb.append('\"');
        for (int i = 0; i < value.length(); i++) {
            char cCharAt = value.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static ypa m26288f(String subtype) {
        return create("text", subtype);
    }

    /* JADX INFO: renamed from: g */
    public static ypa m26289g(String subtype) {
        return create("video", subtype);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$computeToString$0(String str) {
        return (!f102553i.matchesAllOf(str) || str.isEmpty()) ? escapeAndQuote(str) : str;
    }

    private static String normalizeParameterValue(String attribute, String value) {
        v7d.checkNotNull(value);
        v7d.checkArgument(yv1.ascii().matchesAllOf(value), "parameter values must be ASCII: %s", value);
        return f102547g.equals(attribute) ? i80.toLowerCase(value) : value;
    }

    private static String normalizeToken(String token) {
        v7d.checkArgument(f102553i.matchesAllOf(token));
        v7d.checkArgument(!token.isEmpty());
        return i80.toLowerCase(token);
    }

    private Map<String, vx7<String>> parametersAsMap() {
        return tt9.transformValues(this.f102609c.asMap(), new lz6() { // from class: wpa
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return vx7.copyOf((Collection) obj);
            }
        });
    }

    @op1
    public static ypa parse(String input) {
        String strM26293c;
        v7d.checkNotNull(input);
        C15758a c15758a = new C15758a(input);
        try {
            yv1 yv1Var = f102553i;
            String strM26293c2 = c15758a.m26293c(yv1Var);
            consumeSeparator(c15758a, '/');
            String strM26293c3 = c15758a.m26293c(yv1Var);
            mx7.C9581a c9581aBuilder = mx7.builder();
            while (c15758a.m26295e()) {
                consumeSeparator(c15758a, ';');
                yv1 yv1Var2 = f102553i;
                String strM26293c4 = c15758a.m26293c(yv1Var2);
                consumeSeparator(c15758a, '=');
                if ('\"' == c15758a.m26296f()) {
                    c15758a.m26291a('\"');
                    StringBuilder sb = new StringBuilder();
                    while ('\"' != c15758a.m26296f()) {
                        if ('\\' == c15758a.m26296f()) {
                            c15758a.m26291a('\\');
                            sb.append(c15758a.m26292b(yv1.ascii()));
                        } else {
                            sb.append(c15758a.m26293c(f102556j));
                        }
                    }
                    strM26293c = sb.toString();
                    c15758a.m26291a('\"');
                } else {
                    strM26293c = c15758a.m26293c(yv1Var2);
                }
                c9581aBuilder.put(strM26293c4, strM26293c);
            }
            return create(strM26293c2, strM26293c3, c9581aBuilder.build());
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("Could not parse '" + input + "'", e);
        }
    }

    public z6c<Charset> charset() {
        z6c<Charset> z6cVarAbsent = this.f102612f;
        if (z6cVarAbsent == null) {
            z6cVarAbsent = z6c.absent();
            quh<String> it = this.f102609c.get(f102547g).iterator();
            String str = null;
            while (it.hasNext()) {
                String next = it.next();
                if (str == null) {
                    z6cVarAbsent = z6c.m26593of(Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + ", " + next);
                }
            }
            this.f102612f = z6cVarAbsent;
        }
        return z6cVarAbsent;
    }

    public boolean equals(@wx1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ypa)) {
            return false;
        }
        ypa ypaVar = (ypa) obj;
        return this.f102607a.equals(ypaVar.f102607a) && this.f102608b.equals(ypaVar.f102608b) && parametersAsMap().equals(ypaVar.parametersAsMap());
    }

    public boolean hasWildcard() {
        return "*".equals(this.f102607a) || "*".equals(this.f102608b);
    }

    public int hashCode() {
        int i = this.f102611e;
        if (i != 0) {
            return i;
        }
        int iHashCode = okb.hashCode(this.f102607a, this.f102608b, parametersAsMap());
        this.f102611e = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: is */
    public boolean m26290is(ypa mediaTypeRange) {
        return (mediaTypeRange.f102607a.equals("*") || mediaTypeRange.f102607a.equals(this.f102607a)) && (mediaTypeRange.f102608b.equals("*") || mediaTypeRange.f102608b.equals(this.f102608b)) && this.f102609c.entries().containsAll(mediaTypeRange.f102609c.entries());
    }

    public mx7<String, String> parameters() {
        return this.f102609c;
    }

    public String subtype() {
        return this.f102608b;
    }

    public String toString() {
        String str = this.f102610d;
        if (str != null) {
            return str;
        }
        String strComputeToString = computeToString();
        this.f102610d = strComputeToString;
        return strComputeToString;
    }

    public String type() {
        return this.f102607a;
    }

    public ypa withCharset(Charset charset) {
        v7d.checkNotNull(charset);
        ypa ypaVarWithParameter = withParameter(f102547g, charset.name());
        ypaVarWithParameter.f102612f = z6c.m26593of(charset);
        return ypaVarWithParameter;
    }

    public ypa withParameter(String attribute, String value) {
        return withParameters(attribute, dy7.m9576of(value));
    }

    public ypa withParameters(u3b<String, String> parameters) {
        return create(this.f102607a, this.f102608b, parameters);
    }

    public ypa withoutParameters() {
        return this.f102609c.isEmpty() ? this : create(this.f102607a, this.f102608b);
    }

    public ypa withParameters(String attribute, Iterable<String> values) {
        v7d.checkNotNull(attribute);
        v7d.checkNotNull(values);
        String strNormalizeToken = normalizeToken(attribute);
        mx7.C9581a c9581aBuilder = mx7.builder();
        quh<Map.Entry<String, String>> it = this.f102609c.entries().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!strNormalizeToken.equals(key)) {
                c9581aBuilder.put(key, next.getValue());
            }
        }
        Iterator<String> it2 = values.iterator();
        while (it2.hasNext()) {
            c9581aBuilder.put(strNormalizeToken, normalizeParameterValue(strNormalizeToken, it2.next()));
        }
        ypa ypaVar = new ypa(this.f102607a, this.f102608b, c9581aBuilder.build());
        if (!strNormalizeToken.equals(f102547g)) {
            ypaVar.f102612f = this.f102612f;
        }
        return (ypa) yya.firstNonNull(f102583s.get(ypaVar), ypaVar);
    }

    private static ypa create(String type, String subtype, u3b<String, String> parameters) {
        v7d.checkNotNull(type);
        v7d.checkNotNull(subtype);
        v7d.checkNotNull(parameters);
        String strNormalizeToken = normalizeToken(type);
        String strNormalizeToken2 = normalizeToken(subtype);
        v7d.checkArgument(!"*".equals(strNormalizeToken) || "*".equals(strNormalizeToken2), "A wildcard type cannot be used with a non-wildcard subtype");
        mx7.C9581a c9581aBuilder = mx7.builder();
        for (Map.Entry<String, String> entry : parameters.entries()) {
            String strNormalizeToken3 = normalizeToken(entry.getKey());
            c9581aBuilder.put(strNormalizeToken3, normalizeParameterValue(strNormalizeToken3, entry.getValue()));
        }
        ypa ypaVar = new ypa(strNormalizeToken, strNormalizeToken2, c9581aBuilder.build());
        return (ypa) yya.firstNonNull(f102583s.get(ypaVar), ypaVar);
    }
}
