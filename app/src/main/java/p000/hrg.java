package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,548:1\n1#2:549\n505#3,43:550\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n181#1:550,43\n*E\n"})
@e0g(parameters = 0)
public final class hrg implements Appendable {

    /* JADX INFO: renamed from: f */
    public static final int f44663f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final jrg f44664a;

    /* JADX INFO: renamed from: b */
    @gib
    public final ozb f44665b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final iic f44666c;

    /* JADX INFO: renamed from: d */
    @gib
    public yt1 f44667d;

    /* JADX INFO: renamed from: e */
    public long f44668e;

    /* JADX INFO: renamed from: hrg$a */
    @ah5
    public interface InterfaceC6984a {
        int getChangeCount();

        /* JADX INFO: renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo30107getOriginalRangejx7JFs(int i);

        /* JADX INFO: renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo30108getRangejx7JFs(int i);
    }

    public hrg(@yfb jrg jrgVar, @gib yt1 yt1Var, @yfb jrg jrgVar2, @gib ozb ozbVar) {
        this.f44664a = jrgVar2;
        this.f44665b = ozbVar;
        this.f44666c = new iic(jrgVar);
        this.f44667d = yt1Var != null ? new yt1(yt1Var) : null;
        this.f44668e = jrgVar.m30568getSelectiond9O1mEE();
    }

    private final void clearChangeList() {
        getChangeTracker().clearChanges();
    }

    private final yt1 getChangeTracker() {
        yt1 yt1Var = this.f44667d;
        if (yt1Var != null) {
            return yt1Var;
        }
        yt1 yt1Var2 = new yt1(null, 1, 0 == true ? 1 : 0);
        this.f44667d = yt1Var2;
        return yt1Var2;
    }

    @ah5
    public static /* synthetic */ void getChanges$annotations() {
    }

    private final void onTextWillChange(int i, int i2, int i3) {
        int i4;
        getChangeTracker().trackChange(i, i2, i3);
        ozb ozbVar = this.f44665b;
        if (ozbVar != null) {
            ozbVar.recordEditOperation(i, i2, i3);
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int iM30591getMinimpl = jvg.m30591getMinimpl(m30104getSelectiond9O1mEE());
        int iM30590getMaximpl = jvg.m30590getMaximpl(m30104getSelectiond9O1mEE());
        if (iM30590getMaximpl < iMin) {
            return;
        }
        if (iM30591getMinimpl <= iMin && iMax <= iM30590getMaximpl) {
            i4 = i3 - (iMax - iMin);
            if (iM30591getMinimpl == iM30590getMaximpl) {
                iM30591getMinimpl += i4;
            }
            iMin = iM30590getMaximpl + i4;
        } else if (iM30591getMinimpl > iMin && iM30590getMaximpl < iMax) {
            iMin += i3;
            iM30591getMinimpl = iMin;
        } else if (iM30591getMinimpl >= iMax) {
            i4 = i3 - (iMax - iMin);
            iM30591getMinimpl += i4;
            iMin = iM30590getMaximpl + i4;
        } else if (iMin < iM30591getMinimpl) {
            iM30591getMinimpl = iMin + i3;
            i4 = i3 - (iMax - iMin);
            iMin = iM30590getMaximpl + i4;
        }
        this.f44668e = kvg.TextRange(iM30591getMinimpl, iMin);
    }

    public static /* synthetic */ void replace$foundation_release$default(hrg hrgVar, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        hrgVar.replace$foundation_release(i, i2, charSequence, i6, i4);
    }

    private final void requireValidIndex(int i, boolean z, boolean z2) {
        int i2 = z ? 0 : -1;
        int length = z2 ? getLength() : getLength() + 1;
        if (i2 > i || i >= length) {
            throw new IllegalArgumentException(("Expected " + i + " to be in [" + i2 + ", " + length + ')').toString());
        }
    }

    /* JADX INFO: renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m30101requireValidRange5zctL8(long j) {
        long jTextRange = kvg.TextRange(0, getLength());
        if (jvg.m30583contains5zctL8(jTextRange, j)) {
            return;
        }
        throw new IllegalArgumentException(("Expected " + ((Object) jvg.m30596toStringimpl(j)) + " to be in " + ((Object) jvg.m30596toStringimpl(jTextRange))).toString());
    }

    /* JADX INFO: renamed from: toTextFieldCharSequence-udt6zUU$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ jrg m30102toTextFieldCharSequenceudt6zUU$foundation_release$default(hrg hrgVar, long j, jvg jvgVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = hrgVar.m30104getSelectiond9O1mEE();
        }
        if ((i & 2) != 0) {
            jvgVar = null;
        }
        return hrgVar.m30106toTextFieldCharSequenceudt6zUU$foundation_release(j, jvgVar);
    }

    @Override // java.lang.Appendable
    @yfb
    public Appendable append(@gib CharSequence charSequence) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), charSequence.length());
            iic iicVar = this.f44666c;
            iic.replace$default(iicVar, iicVar.length(), this.f44666c.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    @yfb
    public final CharSequence asCharSequence() {
        return this.f44666c;
    }

    public final char charAt(int i) {
        return this.f44666c.charAt(i);
    }

    @yfb
    public final InterfaceC6984a getChanges() {
        return getChangeTracker();
    }

    public final int getLength() {
        return this.f44666c.length();
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m30103getOriginalSelectiond9O1mEE() {
        return this.f44664a.m30568getSelectiond9O1mEE();
    }

    @yfb
    public final CharSequence getOriginalText() {
        return this.f44664a.getText();
    }

    @yfb
    public final jrg getOriginalValue$foundation_release() {
        return this.f44664a;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m30104getSelectiond9O1mEE() {
        return this.f44668e;
    }

    @xn8(name = "hasSelection")
    public final boolean hasSelection() {
        return !jvg.m30587getCollapsedimpl(m30104getSelectiond9O1mEE());
    }

    public final void placeCursorAfterCharAt(int i) {
        requireValidIndex(i, false, true);
        this.f44668e = kvg.TextRange(kpd.coerceAtMost(i + 1, getLength()));
    }

    public final void placeCursorBeforeCharAt(int i) {
        requireValidIndex(i, true, false);
        this.f44668e = kvg.TextRange(i);
    }

    public final void replace(int i, int i2, @yfb CharSequence charSequence) {
        replace$foundation_release(i, i2, charSequence, 0, charSequence.length());
    }

    public final void replace$foundation_release(int i, int i2, @yfb CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            throw new IllegalArgumentException(("Expected start=" + i + " <= end=" + i2).toString());
        }
        if (i3 <= i4) {
            onTextWillChange(i, i2, i4 - i3);
            this.f44666c.replace(i, i2, charSequence, i3, i4);
            return;
        }
        throw new IllegalArgumentException(("Expected textStart=" + i3 + " <= textEnd=" + i4).toString());
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.f44664a.toString());
        m30105setSelection5zctL8(this.f44664a.m30568getSelectiond9O1mEE());
        clearChangeList();
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m30105setSelection5zctL8(long j) {
        m30101requireValidRange5zctL8(j);
        this.f44668e = j;
    }

    public final void setTextIfChanged$foundation_release(@yfb CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        int i4;
        iic iicVar = this.f44666c;
        int length = iicVar.length();
        int length2 = charSequence.length();
        boolean z = false;
        if (iicVar.length() <= 0 || charSequence.length() <= 0) {
            i = length;
            i2 = length2;
            i3 = 0;
            i4 = 0;
        } else {
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (iicVar.charAt(i5) == charSequence.charAt(i6)) {
                        i5++;
                        i6++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    if (iicVar.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z2 = true;
                    }
                }
                if (i5 >= length || i6 >= length2 || (z && z2)) {
                    break;
                }
            }
            i = length;
            i2 = length2;
            i3 = i5;
            i4 = i6;
        }
        if (i3 < i || i4 < i2) {
            replace$foundation_release(i3, i, charSequence, i4, i2);
        }
    }

    @yfb
    public String toString() {
        return this.f44666c.toString();
    }

    @yfb
    /* JADX INFO: renamed from: toTextFieldCharSequence-udt6zUU$foundation_release, reason: not valid java name */
    public final jrg m30106toTextFieldCharSequenceudt6zUU$foundation_release(long j, @gib jvg jvgVar) {
        return new jrg(this.f44666c.toString(), j, jvgVar, null, 8, null);
    }

    @Override // java.lang.Appendable
    @yfb
    public Appendable append(@gib CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), i2 - i);
            iic iicVar = this.f44666c;
            iic.replace$default(iicVar, iicVar.length(), this.f44666c.length(), charSequence.subSequence(i, i2), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @yfb
    public Appendable append(char c) {
        onTextWillChange(getLength(), getLength(), 1);
        iic iicVar = this.f44666c;
        iic.replace$default(iicVar, iicVar.length(), this.f44666c.length(), String.valueOf(c), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ hrg(jrg jrgVar, yt1 yt1Var, jrg jrgVar2, ozb ozbVar, int i, jt3 jt3Var) {
        this(jrgVar, (i & 2) != 0 ? null : yt1Var, (i & 4) != 0 ? jrgVar : jrgVar2, (i & 8) != 0 ? null : ozbVar);
    }
}
