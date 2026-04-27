package p000;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,422:1\n1#2:423\n1627#3,6:424\n1627#3,6:430\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n281#1:424,6\n320#1:430,6\n*E\n"})
@e0g(parameters = 0)
public final class qv8 {

    /* JADX INFO: renamed from: g */
    public static final int f75899g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Layout f75900a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<Integer> f75901b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<Bidi> f75902c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final boolean[] f75903d;

    /* JADX INFO: renamed from: e */
    @gib
    public char[] f75904e;

    /* JADX INFO: renamed from: f */
    public final int f75905f;

    /* JADX INFO: renamed from: qv8$a */
    @e0g(parameters = 1)
    public static final class C11711a {

        /* JADX INFO: renamed from: d */
        public static final int f75906d = 0;

        /* JADX INFO: renamed from: a */
        public final int f75907a;

        /* JADX INFO: renamed from: b */
        public final int f75908b;

        /* JADX INFO: renamed from: c */
        public final boolean f75909c;

        public C11711a(int i, int i2, boolean z) {
            this.f75907a = i;
            this.f75908b = i2;
            this.f75909c = z;
        }

        public static /* synthetic */ C11711a copy$default(C11711a c11711a, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = c11711a.f75907a;
            }
            if ((i3 & 2) != 0) {
                i2 = c11711a.f75908b;
            }
            if ((i3 & 4) != 0) {
                z = c11711a.f75909c;
            }
            return c11711a.copy(i, i2, z);
        }

        public final int component1() {
            return this.f75907a;
        }

        public final int component2() {
            return this.f75908b;
        }

        public final boolean component3() {
            return this.f75909c;
        }

        @yfb
        public final C11711a copy(int i, int i2, boolean z) {
            return new C11711a(i, i2, z);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11711a)) {
                return false;
            }
            C11711a c11711a = (C11711a) obj;
            return this.f75907a == c11711a.f75907a && this.f75908b == c11711a.f75908b && this.f75909c == c11711a.f75909c;
        }

        public final int getEnd() {
            return this.f75908b;
        }

        public final int getStart() {
            return this.f75907a;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f75907a) * 31) + Integer.hashCode(this.f75908b)) * 31) + Boolean.hashCode(this.f75909c);
        }

        public final boolean isRtl() {
            return this.f75909c;
        }

        @yfb
        public String toString() {
            return "BidiRun(start=" + this.f75907a + ", end=" + this.f75908b + ", isRtl=" + this.f75909c + ')';
        }
    }

    public qv8(@yfb Layout layout) {
        this.f75900a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iIndexOf$default = m9g.indexOf$default(this.f75900a.getText(), '\n', length, false, 4, (Object) null);
            length = iIndexOf$default < 0 ? this.f75900a.getText().length() : iIndexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f75900a.getText().length());
        this.f75901b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f75902c = arrayList2;
        this.f75903d = new boolean[this.f75901b.size()];
        this.f75905f = this.f75901b.size();
    }

    private final float getDownstreamHorizontal(int i, boolean z) {
        int iCoerceAtMost = kpd.coerceAtMost(i, this.f75900a.getLineEnd(this.f75900a.getLineForOffset(i)));
        return z ? this.f75900a.getPrimaryHorizontal(iCoerceAtMost) : this.f75900a.getSecondaryHorizontal(iCoerceAtMost);
    }

    public static /* synthetic */ int getParagraphForOffset$default(qv8 qv8Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return qv8Var.getParagraphForOffset(i, z);
    }

    private final int lineEndToVisibleEnd(int i, int i2) {
        while (i > i2 && isLineEndSpace(this.f75900a.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f75903d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.f75902c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.f75901b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.f75901b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f75904e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.f75900a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List<java.text.Bidi> r3 = r11.f75902c
            r3.set(r12, r0)
            boolean[] r3 = r11.f75903d
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.f75904e
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.f75904e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qv8.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        int iLineEndToVisibleEnd = i;
        if (!z2) {
            return getDownstreamHorizontal(i, z);
        }
        int lineForOffset = kv8.getLineForOffset(this.f75900a, iLineEndToVisibleEnd, z2);
        int lineStart = this.f75900a.getLineStart(lineForOffset);
        int lineEnd = this.f75900a.getLineEnd(lineForOffset);
        if (iLineEndToVisibleEnd != lineStart && iLineEndToVisibleEnd != lineEnd) {
            return getDownstreamHorizontal(i, z);
        }
        if (iLineEndToVisibleEnd == 0 || iLineEndToVisibleEnd == this.f75900a.getText().length()) {
            return getDownstreamHorizontal(i, z);
        }
        int paragraphForOffset = getParagraphForOffset(iLineEndToVisibleEnd, z2);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        int iLineEndToVisibleEnd2 = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i2 = lineStart - paragraphStart;
        int i3 = iLineEndToVisibleEnd2 - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(i2, i3) : null;
        boolean z3 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f75900a.isRtlCharAt(lineStart);
            if (z || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (iLineEndToVisibleEnd == lineStart) {
                z3 = zIsRtlParagraph;
            } else if (!zIsRtlParagraph) {
                z3 = true;
            }
            Layout layout = this.f75900a;
            return z3 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C11711a[] c11711aArr = new C11711a[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            c11711aArr[i4] = new C11711a(bidiCreateLineBidi.getRunStart(i4) + lineStart, bidiCreateLineBidi.getRunLimit(i4) + lineStart, bidiCreateLineBidi.getRunLevel(i4) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i5 = 0; i5 < runCount2; i5++) {
            bArr[i5] = (byte) bidiCreateLineBidi.getRunLevel(i5);
        }
        Bidi.reorderVisually(bArr, 0, c11711aArr, 0, runCount);
        int i6 = -1;
        if (iLineEndToVisibleEnd == lineStart) {
            int i7 = 0;
            while (true) {
                if (i7 >= runCount) {
                    break;
                }
                if (c11711aArr[i7].getStart() == iLineEndToVisibleEnd) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            C11711a c11711a = c11711aArr[i6];
            if (z || zIsRtlParagraph == c11711a.isRtl()) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            return (i6 == 0 && zIsRtlParagraph) ? this.f75900a.getLineLeft(lineForOffset) : (i6 != e80.getLastIndex(c11711aArr) || zIsRtlParagraph) ? zIsRtlParagraph ? this.f75900a.getPrimaryHorizontal(c11711aArr[i6 - 1].getStart()) : this.f75900a.getPrimaryHorizontal(c11711aArr[i6 + 1].getStart()) : this.f75900a.getLineRight(lineForOffset);
        }
        if (iLineEndToVisibleEnd > iLineEndToVisibleEnd2) {
            iLineEndToVisibleEnd = lineEndToVisibleEnd(iLineEndToVisibleEnd, lineStart);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= runCount) {
                break;
            }
            if (c11711aArr[i8].getEnd() == iLineEndToVisibleEnd) {
                i6 = i8;
                break;
            }
            i8++;
        }
        C11711a c11711a2 = c11711aArr[i6];
        if (!z && zIsRtlParagraph != c11711a2.isRtl()) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        return (i6 == 0 && zIsRtlParagraph) ? this.f75900a.getLineLeft(lineForOffset) : (i6 != e80.getLastIndex(c11711aArr) || zIsRtlParagraph) ? zIsRtlParagraph ? this.f75900a.getPrimaryHorizontal(c11711aArr[i6 - 1].getEnd()) : this.f75900a.getPrimaryHorizontal(c11711aArr[i6 + 1].getEnd()) : this.f75900a.getLineRight(lineForOffset);
    }

    @yfb
    public final Layout getLayout() {
        return this.f75900a;
    }

    @yfb
    public final C11711a[] getLineBidiRuns$ui_text_release(int i) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.f75900a.getLineStart(i);
        int lineEnd = this.f75900a.getLineEnd(i);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        int i2 = lineStart - paragraphStart;
        int i3 = lineEnd - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (bidiAnalyzeBidi == null || (bidiCreateLineBidi = bidiAnalyzeBidi.createLineBidi(i2, i3)) == null) {
            return new C11711a[]{new C11711a(lineStart, lineEnd, this.f75900a.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C11711a[] c11711aArr = new C11711a[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            int runStart = bidiCreateLineBidi.getRunStart(i4) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i4) + lineStart;
            boolean z = true;
            if (bidiCreateLineBidi.getRunLevel(i4) % 2 != 1) {
                z = false;
            }
            c11711aArr[i4] = new C11711a(runStart, runLimit, z);
        }
        return c11711aArr;
    }

    public final int getLineVisibleEnd(int i) {
        return lineEndToVisibleEnd(this.f75900a.getLineEnd(i), this.f75900a.getLineStart(i));
    }

    public final int getParagraphCount() {
        return this.f75905f;
    }

    public final int getParagraphEnd(@h78(from = 0) int i) {
        return this.f75901b.get(i).intValue();
    }

    public final int getParagraphForOffset(@h78(from = 0) int i, boolean z) {
        int iBinarySearch$default = l82.binarySearch$default(this.f75901b, Integer.valueOf(i), 0, 0, 6, (Object) null);
        int i2 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.f75901b.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int getParagraphStart(@h78(from = 0) int i) {
        if (i == 0) {
            return 0;
        }
        return this.f75901b.get(i - 1).intValue();
    }

    public final boolean isLineEndSpace(char c) {
        return c == ' ' || c == '\n' || c == 5760 || (md8.compare((int) c, 8192) >= 0 && md8.compare((int) c, 8202) <= 0 && c != 8199) || c == 8287 || c == 12288;
    }

    public final boolean isRtlParagraph(@h78(from = 0) int i) {
        return this.f75900a.getParagraphDirection(this.f75900a.getLineForOffset(getParagraphStart(i))) == -1;
    }
}
