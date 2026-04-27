package p000;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class u43 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13356a f86755a;

    /* JADX INFO: renamed from: b */
    public final q7f f86756b;

    /* JADX INFO: renamed from: c */
    public final Thread.UncaughtExceptionHandler f86757c;

    /* JADX INFO: renamed from: d */
    public final r33 f86758d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f86759e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u43$a */
    public interface InterfaceC13356a {
        void onUncaughtException(q7f q7fVar, Thread thread, Throwable th);
    }

    public u43(InterfaceC13356a interfaceC13356a, q7f q7fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, r33 r33Var) {
        this.f86755a = interfaceC13356a;
        this.f86756b = q7fVar;
        this.f86757c = uncaughtExceptionHandler;
        this.f86758d = r33Var;
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            ej9.getLogger().m10063e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            ej9.getLogger().m10063e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f86758d.hasCrashDataForCurrentSession()) {
            return true;
        }
        ej9.getLogger().m10061d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m23093a() {
        return this.f86759e.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Completed exception processing, but no default exception handler."
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f86759e
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.shouldRecordUncaughtException(r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 == 0) goto L1d
            u43$a r4 = r7.f86755a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            q7f r5 = r7.f86756b     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r4.onUncaughtException(r5, r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L26
        L19:
            r4 = move-exception
            goto L56
        L1b:
            r4 = move-exception
            goto L47
        L1d:
            ej9 r4 = p000.ej9.getLogger()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r5 = "Uncaught exception will not be recorded by Crashlytics."
            r4.m10061d(r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L26:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f86757c
            if (r4 == 0) goto L37
        L2a:
            ej9 r0 = p000.ej9.getLogger()
            r0.m10061d(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f86757c
            r0.uncaughtException(r8, r9)
            goto L41
        L37:
            ej9 r8 = p000.ej9.getLogger()
            r8.m10061d(r0)
            java.lang.System.exit(r3)
        L41:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f86759e
            r8.set(r2)
            goto L55
        L47:
            ej9 r5 = p000.ej9.getLogger()     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = "An error occurred in the uncaught exception handler"
            r5.m10064e(r6, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f86757c
            if (r4 == 0) goto L37
            goto L2a
        L55:
            return
        L56:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.f86757c
            if (r5 == 0) goto L67
            ej9 r0 = p000.ej9.getLogger()
            r0.m10061d(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f86757c
            r0.uncaughtException(r8, r9)
            goto L71
        L67:
            ej9 r8 = p000.ej9.getLogger()
            r8.m10061d(r0)
            java.lang.System.exit(r3)
        L71:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f86759e
            r8.set(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u43.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
