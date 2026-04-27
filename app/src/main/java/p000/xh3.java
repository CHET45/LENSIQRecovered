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

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xh3 {

    /* JADX INFO: renamed from: l */
    public static final int f97793l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f97794m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f97795n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f97796o = 8;

    /* JADX INFO: renamed from: p */
    public static final int f97797p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f97798q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f97799r = 3;

    /* JADX INFO: renamed from: a */
    public final Uri f97800a;

    /* JADX INFO: renamed from: b */
    public final long f97801b;

    /* JADX INFO: renamed from: c */
    public final int f97802c;

    /* JADX INFO: renamed from: d */
    @hib
    public final byte[] f97803d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f97804e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final long f97805f;

    /* JADX INFO: renamed from: g */
    public final long f97806g;

    /* JADX INFO: renamed from: h */
    public final long f97807h;

    /* JADX INFO: renamed from: i */
    @hib
    public final String f97808i;

    /* JADX INFO: renamed from: j */
    public final int f97809j;

    /* JADX INFO: renamed from: k */
    @hib
    public final Object f97810k;

    /* JADX INFO: renamed from: xh3$b */
    public static final class C15067b {

        /* JADX INFO: renamed from: a */
        @hib
        public Uri f97811a;

        /* JADX INFO: renamed from: b */
        public long f97812b;

        /* JADX INFO: renamed from: c */
        public int f97813c;

        /* JADX INFO: renamed from: d */
        @hib
        public byte[] f97814d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f97815e;

        /* JADX INFO: renamed from: f */
        public long f97816f;

        /* JADX INFO: renamed from: g */
        public long f97817g;

        /* JADX INFO: renamed from: h */
        @hib
        public String f97818h;

        /* JADX INFO: renamed from: i */
        public int f97819i;

        /* JADX INFO: renamed from: j */
        @hib
        public Object f97820j;

        public xh3 build() {
            v80.checkStateNotNull(this.f97811a, "The uri must be set.");
            return new xh3(this.f97811a, this.f97812b, this.f97813c, this.f97814d, this.f97815e, this.f97816f, this.f97817g, this.f97818h, this.f97819i, this.f97820j);
        }

        @op1
        public C15067b setCustomData(@hib Object obj) {
            this.f97820j = obj;
            return this;
        }

        @op1
        public C15067b setFlags(int i) {
            this.f97819i = i;
            return this;
        }

        @op1
        public C15067b setHttpBody(@hib byte[] bArr) {
            this.f97814d = bArr;
            return this;
        }

        @op1
        public C15067b setHttpMethod(int i) {
            this.f97813c = i;
            return this;
        }

        @op1
        public C15067b setHttpRequestHeaders(Map<String, String> map) {
            this.f97815e = map;
            return this;
        }

        @op1
        public C15067b setKey(@hib String str) {
            this.f97818h = str;
            return this;
        }

        @op1
        public C15067b setLength(long j) {
            this.f97817g = j;
            return this;
        }

        @op1
        public C15067b setPosition(long j) {
            this.f97816f = j;
            return this;
        }

        @op1
        public C15067b setUri(String str) {
            this.f97811a = Uri.parse(str);
            return this;
        }

        @op1
        public C15067b setUriPositionOffset(long j) {
            this.f97812b = j;
            return this;
        }

        public C15067b() {
            this.f97813c = 1;
            this.f97815e = Collections.emptyMap();
            this.f97817g = -1L;
        }

        @op1
        public C15067b setUri(Uri uri) {
            this.f97811a = uri;
            return this;
        }

        private C15067b(xh3 xh3Var) {
            this.f97811a = xh3Var.f97800a;
            this.f97812b = xh3Var.f97801b;
            this.f97813c = xh3Var.f97802c;
            this.f97814d = xh3Var.f97803d;
            this.f97815e = xh3Var.f97804e;
            this.f97816f = xh3Var.f97806g;
            this.f97817g = xh3Var.f97807h;
            this.f97818h = xh3Var.f97808i;
            this.f97819i = xh3Var.f97809j;
            this.f97820j = xh3Var.f97810k;
        }
    }

    /* JADX INFO: renamed from: xh3$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15068c {
    }

    /* JADX INFO: renamed from: xh3$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15069d {
    }

    static {
        dga.registerModule("media3.datasource");
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

    public C15067b buildUpon() {
        return new C15067b();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.f97802c);
    }

    public boolean isFlagSet(int i) {
        return (this.f97809j & i) == i;
    }

    public xh3 subrange(long j) {
        long j2 = this.f97807h;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + C2473f.f17566z + this.f97800a + ", " + this.f97806g + ", " + this.f97807h + ", " + this.f97808i + ", " + this.f97809j + "]";
    }

    public xh3 withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f97804e);
        map2.putAll(map);
        return new xh3(this.f97800a, this.f97801b, this.f97802c, this.f97803d, map2, this.f97806g, this.f97807h, this.f97808i, this.f97809j, this.f97810k);
    }

    public xh3 withRequestHeaders(Map<String, String> map) {
        return new xh3(this.f97800a, this.f97801b, this.f97802c, this.f97803d, map, this.f97806g, this.f97807h, this.f97808i, this.f97809j, this.f97810k);
    }

    public xh3 withUri(Uri uri) {
        return new xh3(uri, this.f97801b, this.f97802c, this.f97803d, this.f97804e, this.f97806g, this.f97807h, this.f97808i, this.f97809j, this.f97810k);
    }

    public xh3(Uri uri) {
        this(uri, 0L, -1L);
    }

    public xh3 subrange(long j, long j2) {
        return (j == 0 && this.f97807h == j2) ? this : new xh3(this.f97800a, this.f97801b, this.f97802c, this.f97803d, this.f97804e, this.f97806g + j, j2, this.f97808i, this.f97809j, this.f97810k);
    }

    public xh3(Uri uri, long j, long j2) {
        this(uri, j, j2, null);
    }

    @Deprecated
    public xh3(Uri uri, long j, long j2, @hib String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, str, 0, null);
    }

    private xh3(Uri uri, long j, int i, @hib byte[] bArr, Map<String, String> map, long j2, long j3, @hib String str, int i2, @hib Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        v80.checkArgument(j4 >= 0);
        v80.checkArgument(j2 >= 0);
        v80.checkArgument(j3 > 0 || j3 == -1);
        this.f97800a = (Uri) v80.checkNotNull(uri);
        this.f97801b = j;
        this.f97802c = i;
        this.f97803d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f97804e = Collections.unmodifiableMap(new HashMap(map));
        this.f97806g = j2;
        this.f97805f = j4;
        this.f97807h = j3;
        this.f97808i = str;
        this.f97809j = i2;
        this.f97810k = obj;
    }
}
