package p000;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class q97 extends n97 {

    /* JADX INFO: renamed from: f */
    public static final int f73691f = 8;

    /* JADX INFO: renamed from: d */
    @yfb
    public final CharSequence f73692d;

    /* JADX INFO: renamed from: e */
    public final BreakIterator f73693e;

    public q97(@yfb CharSequence charSequence) {
        this.f73692d = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f73693e = characterInstance;
    }

    @Override // p000.n97
    public int next(int i) {
        return this.f73693e.following(i);
    }

    @Override // p000.n97
    public int previous(int i) {
        return this.f73693e.preceding(i);
    }
}
