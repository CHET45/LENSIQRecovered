package p000;

/* JADX INFO: loaded from: classes7.dex */
public class q4g extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* JADX INFO: renamed from: a */
    public final n4g f73196a;

    /* JADX INFO: renamed from: b */
    public final fta f73197b;

    /* JADX INFO: renamed from: c */
    public final boolean f73198c;

    public q4g(n4g n4gVar) {
        this(n4gVar, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f73198c ? super.fillInStackTrace() : this;
    }

    public final n4g getStatus() {
        return this.f73196a;
    }

    public final fta getTrailers() {
        return this.f73197b;
    }

    public q4g(n4g n4gVar, @eib fta ftaVar) {
        this(n4gVar, ftaVar, true);
    }

    public q4g(n4g n4gVar, @eib fta ftaVar, boolean z) {
        super(n4g.m17780c(n4gVar), n4gVar.getCause());
        this.f73196a = n4gVar;
        this.f73197b = ftaVar;
        this.f73198c = z;
        fillInStackTrace();
    }
}
