package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public abstract class f69 {

    /* JADX INFO: renamed from: a */
    public StringBuilder f35485a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public boolean f35486b;

    @op1
    private boolean finishLine(boolean sawNewline) throws IOException {
        mo10674c(this.f35485a.toString(), this.f35486b ? sawNewline ? "\r\n" : eu9.f34034d : sawNewline ? "\n" : "");
        this.f35485a = new StringBuilder();
        this.f35486b = false;
        return sawNewline;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10672a(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f35486b
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L1a
            if (r9 <= 0) goto L1a
            char r0 = r7[r8]
            if (r0 != r2) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r0 = r6.finishLine(r0)
            if (r0 == 0) goto L1a
            int r0 = r8 + 1
            goto L1b
        L1a:
            r0 = r8
        L1b:
            int r8 = r8 + r9
            r9 = r0
        L1d:
            if (r0 >= r8) goto L53
            char r4 = r7[r0]
            if (r4 == r2) goto L46
            r5 = 13
            if (r4 == r5) goto L28
            goto L51
        L28:
            java.lang.StringBuilder r4 = r6.f35485a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.f35486b = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L43
            char r4 = r7[r9]
            if (r4 != r2) goto L3b
            r4 = r3
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r4 = r6.finishLine(r4)
            if (r4 == 0) goto L43
            r0 = r9
        L43:
            int r9 = r0 + 1
            goto L51
        L46:
            java.lang.StringBuilder r4 = r6.f35485a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.finishLine(r3)
            goto L43
        L51:
            int r0 = r0 + r3
            goto L1d
        L53:
            java.lang.StringBuilder r0 = r6.f35485a
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f69.m10672a(char[], int, int):void");
    }

    /* JADX INFO: renamed from: b */
    public void m10673b() throws IOException {
        if (this.f35486b || this.f35485a.length() > 0) {
            finishLine(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10674c(String line, String end) throws IOException;
}
