package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class v1h implements fpg {

    /* JADX INFO: renamed from: a */
    public final long f89702a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f89703b;

    /* JADX INFO: renamed from: c */
    public final boolean f89704c;

    /* JADX INFO: renamed from: v1h$a */
    public class C13816a extends f3g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Exception f89705a;

        public C13816a(Exception exc) {
            this.f89705a = exc;
        }

        @Override // p000.f3g
        public void evaluate() throws Throwable {
            throw new RuntimeException("Invalid parameters for Timeout", this.f89705a);
        }
    }

    /* JADX INFO: renamed from: v1h$b */
    public static class C13817b {

        /* JADX INFO: renamed from: a */
        public boolean f89707a = false;

        /* JADX INFO: renamed from: b */
        public long f89708b = 0;

        /* JADX INFO: renamed from: c */
        public TimeUnit f89709c = TimeUnit.SECONDS;

        /* JADX INFO: renamed from: a */
        public boolean m23675a() {
            return this.f89707a;
        }

        /* JADX INFO: renamed from: b */
        public TimeUnit m23676b() {
            return this.f89709c;
        }

        public v1h build() {
            return new v1h(this);
        }

        /* JADX INFO: renamed from: c */
        public long m23677c() {
            return this.f89708b;
        }

        public C13817b withLookingForStuckThread(boolean z) {
            this.f89707a = z;
            return this;
        }

        public C13817b withTimeout(long j, TimeUnit timeUnit) {
            this.f89708b = j;
            this.f89709c = timeUnit;
            return this;
        }
    }

    @Deprecated
    public v1h(int i) {
        this(i, TimeUnit.MILLISECONDS);
    }

    public static C13817b builder() {
        return new C13817b();
    }

    public static v1h millis(long j) {
        return new v1h(j, TimeUnit.MILLISECONDS);
    }

    public static v1h seconds(long j) {
        return new v1h(j, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: a */
    public f3g m23672a(f3g f3gVar) throws Exception {
        return bp5.builder().withTimeout(this.f89702a, this.f89703b).withLookingForStuckThread(this.f89704c).build(f3gVar);
    }

    @Override // p000.fpg
    public f3g apply(f3g f3gVar, j74 j74Var) {
        try {
            return m23672a(f3gVar);
        } catch (Exception e) {
            return new C13816a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23673b() {
        return this.f89704c;
    }

    /* JADX INFO: renamed from: c */
    public final long m23674c(TimeUnit timeUnit) {
        return timeUnit.convert(this.f89702a, this.f89703b);
    }

    public v1h(long j, TimeUnit timeUnit) {
        this.f89702a = j;
        this.f89703b = timeUnit;
        this.f89704c = false;
    }

    public v1h(C13817b c13817b) {
        this.f89702a = c13817b.m23677c();
        this.f89703b = c13817b.m23676b();
        this.f89704c = c13817b.m23675a();
    }
}
