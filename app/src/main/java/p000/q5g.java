package p000;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class q5g implements n15<InputStream> {

    /* JADX INFO: renamed from: b */
    public static final String f73291b = "StreamEncoder";

    /* JADX INFO: renamed from: a */
    public final z60 f73292a;

    public q5g(z60 z60Var) {
        this.f73292a = z60Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|31|3|(5:38|4|(1:6)(1:40)|30|19)|10|28|11|12|30|19|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p000.n15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean encode(@p000.efb java.io.InputStream r4, @p000.efb java.io.File r5, @p000.efb p000.i7c r6) throws java.lang.Throwable {
        /*
            r3 = this;
            z60 r6 = r3.f73292a
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r6 = r6.get(r0, r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
        L13:
            int r5 = r4.read(r6)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r1 = -1
            if (r5 == r1) goto L23
            r2.write(r6, r0, r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            goto L13
        L1e:
            r4 = move-exception
            r1 = r2
            goto L43
        L21:
            r1 = r2
            goto L32
        L23:
            r2.close()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r2.close()     // Catch: java.io.IOException -> L29
        L29:
            z60 r4 = r3.f73292a
            r4.put(r6)
            r0 = 1
            goto L42
        L30:
            r4 = move-exception
            goto L43
        L32:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            android.util.Log.isLoggable(r4, r5)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.io.IOException -> L3d
        L3d:
            z60 r4 = r3.f73292a
            r4.put(r6)
        L42:
            return r0
        L43:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L48
        L48:
            z60 r5 = r3.f73292a
            r5.put(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q5g.encode(java.io.InputStream, java.io.File, i7c):boolean");
    }
}
