package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/foundation/text/input/internal/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
@e0g(parameters = 0)
public final class qw4 {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C11722a f75972h = new C11722a(null);

    /* JADX INFO: renamed from: i */
    public static final int f75973i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f75974j = -1;

    /* JADX INFO: renamed from: a */
    @yfb
    public final iic f75975a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yt1 f75976b;

    /* JADX INFO: renamed from: c */
    public int f75977c;

    /* JADX INFO: renamed from: d */
    public int f75978d;

    /* JADX INFO: renamed from: e */
    @gib
    public scc<itg, jvg> f75979e;

    /* JADX INFO: renamed from: f */
    public int f75980f;

    /* JADX INFO: renamed from: g */
    public int f75981g;

    /* JADX INFO: renamed from: qw4$a */
    public static final class C11722a {
        public /* synthetic */ C11722a(jt3 jt3Var) {
            this();
        }

        private C11722a() {
        }
    }

    public /* synthetic */ qw4(C9041lz c9041lz, long j, jt3 jt3Var) {
        this(c9041lz, j);
    }

    private final void checkRange(int i, int i2) {
        if (i < 0 || i > this.f75975a.length()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f75975a.length());
        }
        if (i2 < 0 || i2 > this.f75975a.length()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f75975a.length());
        }
    }

    private final void setSelectionEnd(int i) {
        if (i >= 0) {
            this.f75978d = i;
            this.f75979e = null;
        } else {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
        }
    }

    private final void setSelectionStart(int i) {
        if (i >= 0) {
            this.f75977c = i;
            this.f75979e = null;
        } else {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
        }
    }

    public final void clearHighlight() {
        this.f75979e = null;
    }

    public final void commitComposition() {
        this.f75980f = -1;
        this.f75981g = -1;
    }

    public final void delete(int i, int i2) {
        checkRange(i, i2);
        long jTextRange = kvg.TextRange(i, i2);
        this.f75976b.trackChange(i, i2, 0);
        iic.replace$default(this.f75975a, jvg.m30591getMinimpl(jTextRange), jvg.m30590getMaximpl(jTextRange), "", 0, 0, 24, null);
        long jM32441updateRangeAfterDeletepWDy79M = tw4.m32441updateRangeAfterDeletepWDy79M(kvg.TextRange(this.f75977c, this.f75978d), jTextRange);
        setSelectionStart(jvg.m30593getStartimpl(jM32441updateRangeAfterDeletepWDy79M));
        setSelectionEnd(jvg.m30588getEndimpl(jM32441updateRangeAfterDeletepWDy79M));
        if (hasComposition()) {
            long jM32441updateRangeAfterDeletepWDy79M2 = tw4.m32441updateRangeAfterDeletepWDy79M(kvg.TextRange(this.f75980f, this.f75981g), jTextRange);
            if (jvg.m30587getCollapsedimpl(jM32441updateRangeAfterDeletepWDy79M2)) {
                commitComposition();
            } else {
                this.f75980f = jvg.m30591getMinimpl(jM32441updateRangeAfterDeletepWDy79M2);
                this.f75981g = jvg.m30590getMaximpl(jM32441updateRangeAfterDeletepWDy79M2);
            }
        }
        this.f75979e = null;
    }

    public final char get(int i) {
        return this.f75975a.charAt(i);
    }

    @yfb
    public final yt1 getChangeTracker() {
        return this.f75976b;
    }

    @gib
    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final jvg m32032getCompositionMzsxiRA() {
        if (hasComposition()) {
            return jvg.m30581boximpl(kvg.TextRange(this.f75980f, this.f75981g));
        }
        return null;
    }

    public final int getCompositionEnd() {
        return this.f75981g;
    }

    public final int getCompositionStart() {
        return this.f75980f;
    }

    public final int getCursor() {
        int i = this.f75977c;
        int i2 = this.f75978d;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    @gib
    public final scc<itg, jvg> getHighlight() {
        return this.f75979e;
    }

    public final int getLength() {
        return this.f75975a.length();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m32033getSelectiond9O1mEE() {
        return kvg.TextRange(this.f75977c, this.f75978d);
    }

    public final int getSelectionEnd() {
        return this.f75978d;
    }

    public final int getSelectionStart() {
        return this.f75977c;
    }

    public final boolean hasComposition() {
        return this.f75980f != -1;
    }

    public final void replace(int i, int i2, @yfb CharSequence charSequence) {
        checkRange(i, i2);
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == this.f75975a.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        int i5 = iMax;
        while (i5 > iMin && length > i3 && charSequence.charAt(length - 1) == this.f75975a.charAt(i5 - 1)) {
            length--;
            i5--;
        }
        this.f75976b.trackChange(i4, i5, length - i3);
        iic.replace$default(this.f75975a, iMin, iMax, charSequence, 0, 0, 24, null);
        setSelectionStart(charSequence.length() + iMin);
        setSelectionEnd(iMin + charSequence.length());
        this.f75980f = -1;
        this.f75981g = -1;
        this.f75979e = null;
    }

    public final void setComposition(int i, int i2) {
        if (i < 0 || i > this.f75975a.length()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f75975a.length());
        }
        if (i2 < 0 || i2 > this.f75975a.length()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f75975a.length());
        }
        if (i < i2) {
            this.f75980f = i;
            this.f75981g = i2;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
    }

    public final void setCursor(int i) {
        setSelection(i, i);
    }

    public final void setHighlight(@gib scc<itg, jvg> sccVar) {
        this.f75979e = sccVar;
    }

    /* JADX INFO: renamed from: setHighlight-K7f2yys, reason: not valid java name */
    public final void m32034setHighlightK7f2yys(int i, int i2, int i3) {
        if (i2 < i3) {
            this.f75979e = new scc<>(itg.m30393boximpl(i), jvg.m30581boximpl(kvg.TextRange(kpd.coerceIn(i2, 0, getLength()), kpd.coerceIn(i3, 0, getLength()))));
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
    }

    public final void setSelection(int i, int i2) {
        int iCoerceIn = kpd.coerceIn(i, 0, getLength());
        int iCoerceIn2 = kpd.coerceIn(i2, 0, getLength());
        setSelectionStart(iCoerceIn);
        setSelectionEnd(iCoerceIn2);
    }

    @yfb
    public final C9041lz toAnnotatedString() {
        return new C9041lz(toString(), null, null, 6, null);
    }

    @yfb
    public String toString() {
        return this.f75975a.toString();
    }

    public /* synthetic */ qw4(String str, long j, jt3 jt3Var) {
        this(str, j);
    }

    private qw4(C9041lz c9041lz, long j) {
        this.f75975a = new iic(c9041lz.getText());
        this.f75976b = new yt1(null, 1, 0 == true ? 1 : 0);
        this.f75977c = jvg.m30593getStartimpl(j);
        this.f75978d = jvg.m30588getEndimpl(j);
        this.f75980f = -1;
        this.f75981g = -1;
        checkRange(jvg.m30593getStartimpl(j), jvg.m30588getEndimpl(j));
    }

    private qw4(String str, long j) {
        this(new C9041lz(str, null, null, 6, null), j, (jt3) null);
    }
}
