package p000;

/* JADX INFO: loaded from: classes8.dex */
public class sdg implements uj9 {

    /* JADX INFO: renamed from: a */
    public k49 f81490a;

    /* JADX INFO: renamed from: b */
    public du9 f81491b;

    /* JADX INFO: renamed from: c */
    public String f81492c;

    /* JADX INFO: renamed from: d */
    public qdg f81493d;

    /* JADX INFO: renamed from: e */
    public String f81494e;

    /* JADX INFO: renamed from: f */
    public String f81495f;

    /* JADX INFO: renamed from: g */
    public Object[] f81496g;

    /* JADX INFO: renamed from: h */
    public long f81497h;

    /* JADX INFO: renamed from: i */
    public Throwable f81498i;

    @Override // p000.uj9
    public Object[] getArgumentArray() {
        return this.f81496g;
    }

    @Override // p000.uj9
    public k49 getLevel() {
        return this.f81490a;
    }

    public qdg getLogger() {
        return this.f81493d;
    }

    @Override // p000.uj9
    public String getLoggerName() {
        return this.f81492c;
    }

    @Override // p000.uj9
    public du9 getMarker() {
        return this.f81491b;
    }

    @Override // p000.uj9
    public String getMessage() {
        return this.f81495f;
    }

    @Override // p000.uj9
    public String getThreadName() {
        return this.f81494e;
    }

    @Override // p000.uj9
    public Throwable getThrowable() {
        return this.f81498i;
    }

    @Override // p000.uj9
    public long getTimeStamp() {
        return this.f81497h;
    }

    public void setArgumentArray(Object[] objArr) {
        this.f81496g = objArr;
    }

    public void setLevel(k49 k49Var) {
        this.f81490a = k49Var;
    }

    public void setLogger(qdg qdgVar) {
        this.f81493d = qdgVar;
    }

    public void setLoggerName(String str) {
        this.f81492c = str;
    }

    public void setMarker(du9 du9Var) {
        this.f81491b = du9Var;
    }

    public void setMessage(String str) {
        this.f81495f = str;
    }

    public void setThreadName(String str) {
        this.f81494e = str;
    }

    public void setThrowable(Throwable th) {
        this.f81498i = th;
    }

    public void setTimeStamp(long j) {
        this.f81497h = j;
    }
}
