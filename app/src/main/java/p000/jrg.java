package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class jrg implements CharSequence {

    /* JADX INFO: renamed from: e */
    public static final int f51634e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f51635a;

    /* JADX INFO: renamed from: b */
    public final long f51636b;

    /* JADX INFO: renamed from: c */
    @gib
    public final jvg f51637c;

    /* JADX INFO: renamed from: d */
    @gib
    public final scc<itg, jvg> f51638d;

    public /* synthetic */ jrg(CharSequence charSequence, long j, jvg jvgVar, scc sccVar, jt3 jt3Var) {
        this(charSequence, j, jvgVar, sccVar);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public final boolean contentEquals(@yfb CharSequence charSequence) {
        return h9g.contentEquals(this.f51635a, charSequence);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jrg.class != obj.getClass()) {
            return false;
        }
        jrg jrgVar = (jrg) obj;
        return jvg.m30586equalsimpl0(this.f51636b, jrgVar.f51636b) && md8.areEqual(this.f51637c, jrgVar.f51637c) && md8.areEqual(this.f51638d, jrgVar.f51638d) && contentEquals(jrgVar.f51635a);
    }

    public char get(int i) {
        return this.f51635a.charAt(i);
    }

    @gib
    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final jvg m30567getCompositionMzsxiRA() {
        return this.f51637c;
    }

    @gib
    public final scc<itg, jvg> getHighlight() {
        return this.f51638d;
    }

    public int getLength() {
        return this.f51635a.length();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m30568getSelectiond9O1mEE() {
        return this.f51636b;
    }

    @yfb
    public final CharSequence getText() {
        return this.f51635a;
    }

    public int hashCode() {
        int iHashCode = ((this.f51635a.hashCode() * 31) + jvg.m30594hashCodeimpl(this.f51636b)) * 31;
        jvg jvgVar = this.f51637c;
        int iM30594hashCodeimpl = (iHashCode + (jvgVar != null ? jvg.m30594hashCodeimpl(jvgVar.m30597unboximpl()) : 0)) * 31;
        scc<itg, jvg> sccVar = this.f51638d;
        return iM30594hashCodeimpl + (sccVar != null ? sccVar.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final boolean shouldShowSelection() {
        return this.f51638d == null;
    }

    @Override // java.lang.CharSequence
    @yfb
    public CharSequence subSequence(int i, int i2) {
        return this.f51635a.subSequence(i, i2);
    }

    public final void toCharArray(@yfb char[] cArr, int i, int i2, int i3) {
        e3h.toCharArray(this.f51635a, cArr, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @yfb
    public String toString() {
        return this.f51635a.toString();
    }

    private jrg(CharSequence charSequence, long j, jvg jvgVar, scc<itg, jvg> sccVar) {
        this.f51635a = charSequence instanceof jrg ? ((jrg) charSequence).f51635a : charSequence;
        this.f51636b = kvg.m30778coerceIn8ffj60Q(j, 0, charSequence.length());
        this.f51637c = jvgVar != null ? jvg.m30581boximpl(kvg.m30778coerceIn8ffj60Q(jvgVar.m30597unboximpl(), 0, charSequence.length())) : null;
        this.f51638d = sccVar != null ? scc.copy$default(sccVar, null, jvg.m30581boximpl(kvg.m30778coerceIn8ffj60Q(sccVar.getSecond().m30597unboximpl(), 0, charSequence.length())), 1, null) : null;
    }

    public /* synthetic */ jrg(String str, long j, jvg jvgVar, scc sccVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? jvg.f52112b.m30598getZerod9O1mEE() : j, (i & 4) != 0 ? null : jvgVar, (i & 8) != 0 ? null : sccVar, null);
    }
}
