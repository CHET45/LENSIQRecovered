package p000;

/* JADX INFO: loaded from: classes7.dex */
public class v4g extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* JADX INFO: renamed from: a */
    public final n4g f89979a;

    /* JADX INFO: renamed from: b */
    public final fta f89980b;

    /* JADX INFO: renamed from: c */
    public final boolean f89981c;

    public v4g(n4g n4gVar) {
        this(n4gVar, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f89981c ? super.fillInStackTrace() : this;
    }

    public final n4g getStatus() {
        return this.f89979a;
    }

    @eib
    public final fta getTrailers() {
        return this.f89980b;
    }

    public v4g(n4g n4gVar, @eib fta ftaVar) {
        this(n4gVar, ftaVar, true);
    }

    public v4g(n4g n4gVar, @eib fta ftaVar, boolean z) {
        super(n4g.m17780c(n4gVar), n4gVar.getCause());
        this.f89979a = n4gVar;
        this.f89980b = ftaVar;
        this.f89981c = z;
        fillInStackTrace();
    }
}
