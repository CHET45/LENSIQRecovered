package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
@e0g(parameters = 0)
public final class rw4 {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C12326a f79916f = new C12326a(null);

    /* JADX INFO: renamed from: g */
    public static final int f79917g = 8;

    /* JADX INFO: renamed from: h */
    public static final int f79918h = -1;

    /* JADX INFO: renamed from: a */
    @yfb
    public final jic f79919a;

    /* JADX INFO: renamed from: b */
    public int f79920b;

    /* JADX INFO: renamed from: c */
    public int f79921c;

    /* JADX INFO: renamed from: d */
    public int f79922d;

    /* JADX INFO: renamed from: e */
    public int f79923e;

    /* JADX INFO: renamed from: rw4$a */
    public static final class C12326a {
        public /* synthetic */ C12326a(jt3 jt3Var) {
            this();
        }

        private C12326a() {
        }
    }

    public /* synthetic */ rw4(C9041lz c9041lz, long j, jt3 jt3Var) {
        this(c9041lz, j);
    }

    private final void setSelectionEnd(int i) {
        if (i >= 0) {
            this.f79921c = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
    }

    private final void setSelectionStart(int i) {
        if (i >= 0) {
            this.f79920b = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.f79922d, this.f79923e, "");
        this.f79922d = -1;
        this.f79923e = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.f79922d = -1;
        this.f79923e = -1;
    }

    public final void delete$ui_text_release(int i, int i2) {
        long jTextRange = kvg.TextRange(i, i2);
        this.f79919a.replace(i, i2, "");
        long jM32339updateRangeAfterDeletepWDy79M = sw4.m32339updateRangeAfterDeletepWDy79M(kvg.TextRange(this.f79920b, this.f79921c), jTextRange);
        setSelectionStart(jvg.m30591getMinimpl(jM32339updateRangeAfterDeletepWDy79M));
        setSelectionEnd(jvg.m30590getMaximpl(jM32339updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long jM32339updateRangeAfterDeletepWDy79M2 = sw4.m32339updateRangeAfterDeletepWDy79M(kvg.TextRange(this.f79922d, this.f79923e), jTextRange);
            if (jvg.m30587getCollapsedimpl(jM32339updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.f79922d = jvg.m30591getMinimpl(jM32339updateRangeAfterDeletepWDy79M2);
                this.f79923e = jvg.m30590getMaximpl(jM32339updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int i) {
        return this.f79919a.get(i);
    }

    @gib
    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final jvg m32221getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return jvg.m30581boximpl(kvg.TextRange(this.f79922d, this.f79923e));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.f79923e;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.f79922d;
    }

    public final int getCursor$ui_text_release() {
        int i = this.f79920b;
        int i2 = this.f79921c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.f79919a.getLength();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m32222getSelectiond9O1mEE$ui_text_release() {
        return kvg.TextRange(this.f79920b, this.f79921c);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.f79921c;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.f79920b;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.f79922d != -1;
    }

    public final void replace$ui_text_release(int i, int i2, @yfb C9041lz c9041lz) {
        replace$ui_text_release(i, i2, c9041lz.getText());
    }

    public final void setComposition$ui_text_release(int i, int i2) {
        if (i < 0 || i > this.f79919a.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f79919a.getLength());
        }
        if (i2 < 0 || i2 > this.f79919a.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f79919a.getLength());
        }
        if (i < i2) {
            this.f79922d = i;
            this.f79923e = i2;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
    }

    public final void setCursor$ui_text_release(int i) {
        setSelection$ui_text_release(i, i);
    }

    public final void setSelection$ui_text_release(int i, int i2) {
        if (i < 0 || i > this.f79919a.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f79919a.getLength());
        }
        if (i2 < 0 || i2 > this.f79919a.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f79919a.getLength());
        }
        if (i <= i2) {
            setSelectionStart(i);
            setSelectionEnd(i2);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
    }

    @yfb
    public final C9041lz toAnnotatedString$ui_text_release() {
        return new C9041lz(toString(), null, null, 6, null);
    }

    @yfb
    public String toString() {
        return this.f79919a.toString();
    }

    public /* synthetic */ rw4(String str, long j, jt3 jt3Var) {
        this(str, j);
    }

    public final void replace$ui_text_release(int i, int i2, @yfb String str) {
        if (i < 0 || i > this.f79919a.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f79919a.getLength());
        }
        if (i2 < 0 || i2 > this.f79919a.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f79919a.getLength());
        }
        if (i <= i2) {
            this.f79919a.replace(i, i2, str);
            setSelectionStart(str.length() + i);
            setSelectionEnd(i + str.length());
            this.f79922d = -1;
            this.f79923e = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
    }

    private rw4(C9041lz c9041lz, long j) {
        this.f79919a = new jic(c9041lz.getText());
        this.f79920b = jvg.m30591getMinimpl(j);
        this.f79921c = jvg.m30590getMaximpl(j);
        this.f79922d = -1;
        this.f79923e = -1;
        int iM30591getMinimpl = jvg.m30591getMinimpl(j);
        int iM30590getMaximpl = jvg.m30590getMaximpl(j);
        if (iM30591getMinimpl >= 0 && iM30591getMinimpl <= c9041lz.length()) {
            if (iM30590getMaximpl < 0 || iM30590getMaximpl > c9041lz.length()) {
                throw new IndexOutOfBoundsException("end (" + iM30590getMaximpl + ") offset is outside of text region " + c9041lz.length());
            }
            if (iM30591getMinimpl <= iM30590getMaximpl) {
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + iM30591getMinimpl + " > " + iM30590getMaximpl);
        }
        throw new IndexOutOfBoundsException("start (" + iM30591getMinimpl + ") offset is outside of text region " + c9041lz.length());
    }

    private rw4(String str, long j) {
        this(new C9041lz(str, null, null, 6, null), j, (jt3) null);
    }
}
