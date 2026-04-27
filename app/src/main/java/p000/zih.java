package p000;

import java.util.Stack;

/* JADX INFO: loaded from: classes5.dex */
public class zih {

    /* JADX INFO: renamed from: a */
    public final String f105202a;

    /* JADX INFO: renamed from: b */
    public final String f105203b;

    /* JADX INFO: renamed from: c */
    public final StackTraceElement[] f105204c;

    /* JADX INFO: renamed from: d */
    @hib
    public final zih f105205d;

    private zih(String str, String str2, StackTraceElement[] stackTraceElementArr, @hib zih zihVar) {
        this.f105202a = str;
        this.f105203b = str2;
        this.f105204c = stackTraceElementArr;
        this.f105205d = zihVar;
    }

    public static zih makeTrimmedThrowableData(Throwable th, m0g m0gVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        zih zihVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            zihVar = new zih(th2.getLocalizedMessage(), th2.getClass().getName(), m0gVar.getTrimmedStackTrace(th2.getStackTrace()), zihVar);
        }
        return zihVar;
    }
}
