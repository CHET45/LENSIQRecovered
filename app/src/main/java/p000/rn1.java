package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p000.q42;
import p000.yya;

/* JADX INFO: loaded from: classes7.dex */
@dy1
@uw7
public final class rn1 {

    /* JADX INFO: renamed from: k */
    public static final rn1 f78745k;

    /* JADX INFO: renamed from: a */
    @eib
    public final sj3 f78746a;

    /* JADX INFO: renamed from: b */
    @eib
    public final Executor f78747b;

    /* JADX INFO: renamed from: c */
    @eib
    public final String f78748c;

    /* JADX INFO: renamed from: d */
    @eib
    public final pn1 f78749d;

    /* JADX INFO: renamed from: e */
    @eib
    public final String f78750e;

    /* JADX INFO: renamed from: f */
    public final Object[][] f78751f;

    /* JADX INFO: renamed from: g */
    public final List<q42.AbstractC11305a> f78752g;

    /* JADX INFO: renamed from: h */
    @eib
    public final Boolean f78753h;

    /* JADX INFO: renamed from: i */
    @eib
    public final Integer f78754i;

    /* JADX INFO: renamed from: j */
    @eib
    public final Integer f78755j;

    /* JADX INFO: renamed from: rn1$b */
    public static class C12164b {

        /* JADX INFO: renamed from: a */
        public sj3 f78756a;

        /* JADX INFO: renamed from: b */
        public Executor f78757b;

        /* JADX INFO: renamed from: c */
        public String f78758c;

        /* JADX INFO: renamed from: d */
        public pn1 f78759d;

        /* JADX INFO: renamed from: e */
        public String f78760e;

        /* JADX INFO: renamed from: f */
        public Object[][] f78761f;

        /* JADX INFO: renamed from: g */
        public List<q42.AbstractC11305a> f78762g;

        /* JADX INFO: renamed from: h */
        public Boolean f78763h;

        /* JADX INFO: renamed from: i */
        public Integer f78764i;

        /* JADX INFO: renamed from: j */
        public Integer f78765j;

        /* JADX INFO: Access modifiers changed from: private */
        public rn1 build() {
            return new rn1(this);
        }
    }

    /* JADX INFO: renamed from: rn1$c */
    public static final class C12165c<T> {

        /* JADX INFO: renamed from: a */
        public final String f78766a;

        /* JADX INFO: renamed from: b */
        public final T f78767b;

        private C12165c(String str, T t) {
            this.f78766a = str;
            this.f78767b = t;
        }

        public static <T> C12165c<T> create(String str) {
            v7d.checkNotNull(str, "debugString");
            return new C12165c<>(str, null);
        }

        public static <T> C12165c<T> createWithDefault(String str, T t) {
            v7d.checkNotNull(str, "debugString");
            return new C12165c<>(str, t);
        }

        @lg5("https://github.com/grpc/grpc-java/issues/1869")
        @Deprecated
        /* JADX INFO: renamed from: of */
        public static <T> C12165c<T> m21436of(String str, T t) {
            v7d.checkNotNull(str, "debugString");
            return new C12165c<>(str, t);
        }

        public T getDefault() {
            return this.f78767b;
        }

        public String toString() {
            return this.f78766a;
        }
    }

    static {
        C12164b c12164b = new C12164b();
        c12164b.f78761f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        c12164b.f78762g = Collections.emptyList();
        f78745k = c12164b.build();
    }

    private static C12164b toBuilder(rn1 rn1Var) {
        C12164b c12164b = new C12164b();
        c12164b.f78756a = rn1Var.f78746a;
        c12164b.f78757b = rn1Var.f78747b;
        c12164b.f78758c = rn1Var.f78748c;
        c12164b.f78759d = rn1Var.f78749d;
        c12164b.f78760e = rn1Var.f78750e;
        c12164b.f78761f = rn1Var.f78751f;
        c12164b.f78762g = rn1Var.f78752g;
        c12164b.f78763h = rn1Var.f78753h;
        c12164b.f78764i = rn1Var.f78754i;
        c12164b.f78765j = rn1Var.f78755j;
        return c12164b;
    }

    /* JADX INFO: renamed from: a */
    public Boolean m21433a() {
        return this.f78753h;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1767")
    @eib
    public String getAuthority() {
        return this.f78748c;
    }

    @eib
    public String getCompressor() {
        return this.f78750e;
    }

    @eib
    public pn1 getCredentials() {
        return this.f78749d;
    }

    @eib
    public sj3 getDeadline() {
        return this.f78746a;
    }

    @eib
    public Executor getExecutor() {
        return this.f78747b;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2563")
    @eib
    public Integer getMaxInboundMessageSize() {
        return this.f78754i;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2563")
    @eib
    public Integer getMaxOutboundMessageSize() {
        return this.f78755j;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1869")
    public <T> T getOption(C12165c<T> c12165c) {
        v7d.checkNotNull(c12165c, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f78751f;
            if (i >= objArr.length) {
                return (T) c12165c.f78767b;
            }
            if (c12165c.equals(objArr[i][0])) {
                return (T) this.f78751f[i][1];
            }
            i++;
        }
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2861")
    public List<q42.AbstractC11305a> getStreamTracerFactories() {
        return this.f78752g;
    }

    public boolean isWaitForReady() {
        return Boolean.TRUE.equals(this.f78753h);
    }

    public String toString() {
        yya.C15889b c15889bAdd = yya.toStringHelper(this).add("deadline", this.f78746a).add("authority", this.f78748c).add("callCredentials", this.f78749d);
        Executor executor = this.f78747b;
        return c15889bAdd.add("executor", executor != null ? executor.getClass() : null).add("compressorName", this.f78750e).add("customOptions", Arrays.deepToString(this.f78751f)).add("waitForReady", isWaitForReady()).add("maxInboundMessageSize", this.f78754i).add("maxOutboundMessageSize", this.f78755j).add("streamTracerFactories", this.f78752g).toString();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1767")
    public rn1 withAuthority(@eib String str) {
        C12164b builder = toBuilder(this);
        builder.f78758c = str;
        return builder.build();
    }

    public rn1 withCallCredentials(@eib pn1 pn1Var) {
        C12164b builder = toBuilder(this);
        builder.f78759d = pn1Var;
        return builder.build();
    }

    public rn1 withCompression(@eib String str) {
        C12164b builder = toBuilder(this);
        builder.f78760e = str;
        return builder.build();
    }

    public rn1 withDeadline(@eib sj3 sj3Var) {
        C12164b builder = toBuilder(this);
        builder.f78756a = sj3Var;
        return builder.build();
    }

    public rn1 withDeadlineAfter(long j, TimeUnit timeUnit) {
        return withDeadline(sj3.after(j, timeUnit));
    }

    public rn1 withExecutor(@eib Executor executor) {
        C12164b builder = toBuilder(this);
        builder.f78757b = executor;
        return builder.build();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2563")
    public rn1 withMaxInboundMessageSize(int i) {
        v7d.checkArgument(i >= 0, "invalid maxsize %s", i);
        C12164b builder = toBuilder(this);
        builder.f78764i = Integer.valueOf(i);
        return builder.build();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2563")
    public rn1 withMaxOutboundMessageSize(int i) {
        v7d.checkArgument(i >= 0, "invalid maxsize %s", i);
        C12164b builder = toBuilder(this);
        builder.f78765j = Integer.valueOf(i);
        return builder.build();
    }

    public <T> rn1 withOption(C12165c<T> c12165c, T t) {
        v7d.checkNotNull(c12165c, "key");
        v7d.checkNotNull(t, "value");
        C12164b builder = toBuilder(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f78751f;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (c12165c.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f78751f.length + (i == -1 ? 1 : 0), 2);
        builder.f78761f = objArr2;
        Object[][] objArr3 = this.f78751f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            builder.f78761f[this.f78751f.length] = new Object[]{c12165c, t};
        } else {
            builder.f78761f[i] = new Object[]{c12165c, t};
        }
        return builder.build();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2861")
    public rn1 withStreamTracerFactory(q42.AbstractC11305a abstractC11305a) {
        ArrayList arrayList = new ArrayList(this.f78752g.size() + 1);
        arrayList.addAll(this.f78752g);
        arrayList.add(abstractC11305a);
        C12164b builder = toBuilder(this);
        builder.f78762g = Collections.unmodifiableList(arrayList);
        return builder.build();
    }

    public rn1 withWaitForReady() {
        C12164b builder = toBuilder(this);
        builder.f78763h = Boolean.TRUE;
        return builder.build();
    }

    public rn1 withoutWaitForReady() {
        C12164b builder = toBuilder(this);
        builder.f78763h = Boolean.FALSE;
        return builder.build();
    }

    private rn1(C12164b c12164b) {
        this.f78746a = c12164b.f78756a;
        this.f78747b = c12164b.f78757b;
        this.f78748c = c12164b.f78758c;
        this.f78749d = c12164b.f78759d;
        this.f78750e = c12164b.f78760e;
        this.f78751f = c12164b.f78761f;
        this.f78752g = c12164b.f78762g;
        this.f78753h = c12164b.f78763h;
        this.f78754i = c12164b.f78764i;
        this.f78755j = c12164b.f78765j;
    }
}
