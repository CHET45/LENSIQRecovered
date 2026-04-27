package p000;

import android.net.Uri;
import com.blankj.utilcode.util.C2473f;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yh3 {

    /* JADX INFO: renamed from: l */
    public static final int f101478l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f101479m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f101480n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f101481o = 8;

    /* JADX INFO: renamed from: p */
    public static final int f101482p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f101483q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f101484r = 3;

    /* JADX INFO: renamed from: a */
    public final Uri f101485a;

    /* JADX INFO: renamed from: b */
    public final long f101486b;

    /* JADX INFO: renamed from: c */
    public final int f101487c;

    /* JADX INFO: renamed from: d */
    @hib
    public final byte[] f101488d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f101489e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final long f101490f;

    /* JADX INFO: renamed from: g */
    public final long f101491g;

    /* JADX INFO: renamed from: h */
    public final long f101492h;

    /* JADX INFO: renamed from: i */
    @hib
    public final String f101493i;

    /* JADX INFO: renamed from: j */
    public final int f101494j;

    /* JADX INFO: renamed from: k */
    @hib
    public final Object f101495k;

    /* JADX INFO: renamed from: yh3$b */
    public static final class C15662b {

        /* JADX INFO: renamed from: a */
        @hib
        public Uri f101496a;

        /* JADX INFO: renamed from: b */
        public long f101497b;

        /* JADX INFO: renamed from: c */
        public int f101498c;

        /* JADX INFO: renamed from: d */
        @hib
        public byte[] f101499d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f101500e;

        /* JADX INFO: renamed from: f */
        public long f101501f;

        /* JADX INFO: renamed from: g */
        public long f101502g;

        /* JADX INFO: renamed from: h */
        @hib
        public String f101503h;

        /* JADX INFO: renamed from: i */
        public int f101504i;

        /* JADX INFO: renamed from: j */
        @hib
        public Object f101505j;

        public yh3 build() {
            u80.checkStateNotNull(this.f101496a, "The uri must be set.");
            return new yh3(this.f101496a, this.f101497b, this.f101498c, this.f101499d, this.f101500e, this.f101501f, this.f101502g, this.f101503h, this.f101504i, this.f101505j);
        }

        @op1
        public C15662b setCustomData(@hib Object obj) {
            this.f101505j = obj;
            return this;
        }

        @op1
        public C15662b setFlags(int i) {
            this.f101504i = i;
            return this;
        }

        @op1
        public C15662b setHttpBody(@hib byte[] bArr) {
            this.f101499d = bArr;
            return this;
        }

        @op1
        public C15662b setHttpMethod(int i) {
            this.f101498c = i;
            return this;
        }

        @op1
        public C15662b setHttpRequestHeaders(Map<String, String> map) {
            this.f101500e = map;
            return this;
        }

        @op1
        public C15662b setKey(@hib String str) {
            this.f101503h = str;
            return this;
        }

        @op1
        public C15662b setLength(long j) {
            this.f101502g = j;
            return this;
        }

        @op1
        public C15662b setPosition(long j) {
            this.f101501f = j;
            return this;
        }

        @op1
        public C15662b setUri(String str) {
            this.f101496a = Uri.parse(str);
            return this;
        }

        @op1
        public C15662b setUriPositionOffset(long j) {
            this.f101497b = j;
            return this;
        }

        public C15662b() {
            this.f101498c = 1;
            this.f101500e = Collections.emptyMap();
            this.f101502g = -1L;
        }

        @op1
        public C15662b setUri(Uri uri) {
            this.f101496a = uri;
            return this;
        }

        private C15662b(yh3 yh3Var) {
            this.f101496a = yh3Var.f101485a;
            this.f101497b = yh3Var.f101486b;
            this.f101498c = yh3Var.f101487c;
            this.f101499d = yh3Var.f101488d;
            this.f101500e = yh3Var.f101489e;
            this.f101501f = yh3Var.f101491g;
            this.f101502g = yh3Var.f101492h;
            this.f101503h = yh3Var.f101493i;
            this.f101504i = yh3Var.f101494j;
            this.f101505j = yh3Var.f101495k;
        }
    }

    /* JADX INFO: renamed from: yh3$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15663c {
    }

    /* JADX INFO: renamed from: yh3$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15664d {
    }

    static {
        lf5.registerModule("goog.exo.datasource");
    }

    public static String getStringForHttpMethod(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public C15662b buildUpon() {
        return new C15662b();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.f101487c);
    }

    public boolean isFlagSet(int i) {
        return (this.f101494j & i) == i;
    }

    public yh3 subrange(long j) {
        long j2 = this.f101492h;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + C2473f.f17566z + this.f101485a + ", " + this.f101491g + ", " + this.f101492h + ", " + this.f101493i + ", " + this.f101494j + "]";
    }

    public yh3 withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f101489e);
        map2.putAll(map);
        return new yh3(this.f101485a, this.f101486b, this.f101487c, this.f101488d, map2, this.f101491g, this.f101492h, this.f101493i, this.f101494j, this.f101495k);
    }

    public yh3 withRequestHeaders(Map<String, String> map) {
        return new yh3(this.f101485a, this.f101486b, this.f101487c, this.f101488d, map, this.f101491g, this.f101492h, this.f101493i, this.f101494j, this.f101495k);
    }

    public yh3 withUri(Uri uri) {
        return new yh3(uri, this.f101486b, this.f101487c, this.f101488d, this.f101489e, this.f101491g, this.f101492h, this.f101493i, this.f101494j, this.f101495k);
    }

    public yh3(Uri uri) {
        this(uri, 0L, -1L);
    }

    public yh3 subrange(long j, long j2) {
        return (j == 0 && this.f101492h == j2) ? this : new yh3(this.f101485a, this.f101486b, this.f101487c, this.f101488d, this.f101489e, this.f101491g + j, j2, this.f101493i, this.f101494j, this.f101495k);
    }

    public yh3(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    @Deprecated
    public yh3(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    @Deprecated
    public yh3(Uri uri, long j, long j2, @hib String str) {
        this(uri, j, j, j2, str, 0);
    }

    @Deprecated
    public yh3(Uri uri, long j, long j2, @hib String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    @Deprecated
    public yh3(Uri uri, long j, long j2, @hib String str, int i, Map<String, String> map) {
        this(uri, 1, null, j, j, j2, str, i, map);
    }

    @Deprecated
    public yh3(Uri uri, long j, long j2, long j3, @hib String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    @Deprecated
    public yh3(Uri uri, @hib byte[] bArr, long j, long j2, long j3, @hib String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    @Deprecated
    public yh3(Uri uri, int i, @hib byte[] bArr, long j, long j2, long j3, @hib String str, int i2) {
        this(uri, i, bArr, j, j2, j3, str, i2, Collections.emptyMap());
    }

    @Deprecated
    public yh3(Uri uri, int i, @hib byte[] bArr, long j, long j2, long j3, @hib String str, int i2, Map<String, String> map) {
        this(uri, j - j2, i, bArr, map, j2, j3, str, i2, null);
    }

    private yh3(Uri uri, long j, int i, @hib byte[] bArr, Map<String, String> map, long j2, long j3, @hib String str, int i2, @hib Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        u80.checkArgument(j4 >= 0);
        u80.checkArgument(j2 >= 0);
        u80.checkArgument(j3 > 0 || j3 == -1);
        this.f101485a = uri;
        this.f101486b = j;
        this.f101487c = i;
        this.f101488d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f101489e = Collections.unmodifiableMap(new HashMap(map));
        this.f101491g = j2;
        this.f101490f = j4;
        this.f101492h = j3;
        this.f101493i = str;
        this.f101494j = i2;
        this.f101495k = obj;
    }
}
