package p000;

/* JADX INFO: loaded from: classes5.dex */
public class lva implements m0g {

    /* JADX INFO: renamed from: a */
    public final int f58886a;

    /* JADX INFO: renamed from: b */
    public final m0g[] f58887b;

    /* JADX INFO: renamed from: c */
    public final mva f58888c;

    public lva(int i, m0g... m0gVarArr) {
        this.f58886a = i;
        this.f58887b = m0gVarArr;
        this.f58888c = new mva(i);
    }

    @Override // p000.m0g
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f58886a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (m0g m0gVar : this.f58887b) {
            if (trimmedStackTrace.length <= this.f58886a) {
                break;
            }
            trimmedStackTrace = m0gVar.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > this.f58886a ? this.f58888c.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}
