package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class vqd extends Thread {

    /* JADX INFO: renamed from: a */
    public final String f92001a;

    /* JADX INFO: renamed from: b */
    public final lp7<byte[]> f92002b;

    /* JADX INFO: renamed from: c */
    public final Handler f92003c = new Handler(Looper.getMainLooper());

    public vqd(String str, lp7<byte[]> lp7Var) {
        this.f92001a = str;
        this.f92002b = lp7Var;
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.f92003c.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x008c -> B:54:0x008c). Please report as a decompilation issue!!! */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file path : "
            r0.append(r1)
            java.lang.String r1 = r6.f92001a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReadFileThread"
            p000.dh8.m9151d(r1, r0)
            java.lang.String r0 = r6.f92001a
            boolean r0 = p000.tt5.checkFileExist(r0)
            if (r0 == 0) goto L9f
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L58 java.io.FileNotFoundException -> L5a java.lang.Throwable -> L72
            java.lang.String r2 = r6.f92001a     // Catch: java.io.IOException -> L58 java.io.FileNotFoundException -> L5a java.lang.Throwable -> L72
            r1.<init>(r2)     // Catch: java.io.IOException -> L58 java.io.FileNotFoundException -> L5a java.lang.Throwable -> L72
            int r0 = r1.available()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            int r2 = r1.read(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            if (r2 < 0) goto L45
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r3, r4, r2)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            r6.m24132b(r3)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            goto L4e
        L3e:
            r0 = move-exception
            goto L94
        L41:
            r0 = move-exception
            goto L54
        L43:
            r0 = move-exception
            goto L77
        L45:
            r0 = 20485(0x5005, float:2.8706E-41)
            cr0 r0 = p000.mjb.buildError(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            r6.m24130b(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L41 java.io.FileNotFoundException -> L43
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L8c
        L52:
            r0 = move-exception
            goto L89
        L54:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L5c
        L58:
            r1 = move-exception
            goto L5c
        L5a:
            r1 = move-exception
            goto L74
        L5c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L72
            r2 = 20486(0x5006, float:2.8707E-41)
            cr0 r1 = p000.mjb.buildError(r2, r1)     // Catch: java.lang.Throwable -> L72
            r6.m24130b(r1)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L8c
            r0.close()     // Catch: java.io.IOException -> L52
            goto L8c
        L72:
            r1 = move-exception
            goto L91
        L74:
            r5 = r1
            r1 = r0
            r0 = r5
        L77:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L8d
            r0 = 20484(0x5004, float:2.8704E-41)
            cr0 r0 = p000.mjb.buildError(r0)     // Catch: java.lang.Throwable -> L8d
            r6.m24130b(r0)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L8c
            r1.close()     // Catch: java.io.IOException -> L52
            goto L8c
        L89:
            r0.printStackTrace()
        L8c:
            return
        L8d:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L91:
            r5 = r1
            r1 = r0
            r0 = r5
        L94:
            if (r1 == 0) goto L9e
            r1.close()     // Catch: java.io.IOException -> L9a
            goto L9e
        L9a:
            r1 = move-exception
            r1.printStackTrace()
        L9e:
            throw r0
        L9f:
            r0 = 4097(0x1001, float:5.741E-42)
            java.lang.String r1 = "File path does not exist."
            cr0 r0 = p000.mjb.buildError(r0, r1)
            r6.m24130b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vqd.run():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m24129a(byte[] bArr) {
        lp7<byte[]> lp7Var = this.f92002b;
        if (lp7Var != null) {
            lp7Var.onSuccess(bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24132b(final byte[] bArr) {
        this.f92003c.post(new Runnable() { // from class: uqd
            @Override // java.lang.Runnable
            public final void run() {
                this.f88813a.m24129a(bArr);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m24130b(final cr0 cr0Var) {
        if (cr0Var == null) {
            return;
        }
        this.f92003c.post(new Runnable() { // from class: tqd
            @Override // java.lang.Runnable
            public final void run() {
                this.f85621a.m24127a(cr0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m24127a(cr0 cr0Var) {
        lp7<byte[]> lp7Var = this.f92002b;
        if (lp7Var != null) {
            lp7Var.onError(cr0Var);
        }
    }
}
