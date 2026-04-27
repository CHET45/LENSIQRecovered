package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import p000.bp7;
import p000.bqg;
import p000.d69;
import p000.htg;

/* JADX INFO: renamed from: cu */
/* JADX INFO: loaded from: classes.dex */
public final class C4501cu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        zwf.setSpan(spannableString, new nz7(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(cug cugVar, int i) {
        int lineCount = cugVar.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (cugVar.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return cugVar.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(yvg yvgVar, boolean z) {
        if (!z || jwg.m30610equalsimpl0(yvgVar.m33443getLetterSpacingXSAIIZE(), kwg.getSp(0)) || jwg.m30610equalsimpl0(yvgVar.m33443getLetterSpacingXSAIIZE(), jwg.f52146b.m30624getUnspecifiedXSAIIZE())) {
            return false;
        }
        int iM33448getTextAligne0LSkKk = yvgVar.m33448getTextAligne0LSkKk();
        bqg.C2006a c2006a = bqg.f14513b;
        return (bqg.m28037equalsimpl0(iM33448getTextAligne0LSkKk, c2006a.m28047getUnspecifiede0LSkKk()) || bqg.m28037equalsimpl0(yvgVar.m33448getTextAligne0LSkKk(), c2006a.m28046getStarte0LSkKk()) || bqg.m28037equalsimpl0(yvgVar.m33448getTextAligne0LSkKk(), c2006a.m28043getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m28549toLayoutAlignaXe7zB0(int i) {
        bqg.C2006a c2006a = bqg.f14513b;
        if (bqg.m28037equalsimpl0(i, c2006a.m28044getLefte0LSkKk())) {
            return 3;
        }
        if (bqg.m28037equalsimpl0(i, c2006a.m28045getRighte0LSkKk())) {
            return 4;
        }
        if (bqg.m28037equalsimpl0(i, c2006a.m28041getCentere0LSkKk())) {
            return 2;
        }
        return (!bqg.m28037equalsimpl0(i, c2006a.m28046getStarte0LSkKk()) && bqg.m28037equalsimpl0(i, c2006a.m28042getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m28550toLayoutBreakStrategyxImikfE(int i) {
        d69.C4631b.a aVar = d69.C4631b.f28532b;
        if (d69.C4631b.m28594equalsimpl0(i, aVar.m28600getSimplefcGXIks())) {
            return 0;
        }
        if (d69.C4631b.m28594equalsimpl0(i, aVar.m28599getHighQualityfcGXIks())) {
            return 1;
        }
        return d69.C4631b.m28594equalsimpl0(i, aVar.m28598getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m28551toLayoutHyphenationFrequency3fSNIE(int i) {
        bp7.C1979a c1979a = bp7.f14380b;
        if (bp7.m28024equalsimpl0(i, c1979a.m28028getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        bp7.m28024equalsimpl0(i, c1979a.m28029getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m28552toLayoutLineBreakStylehpcqdu8(int i) {
        d69.C4632c.a aVar = d69.C4632c.f28538b;
        if (d69.C4632c.m28605equalsimpl0(i, aVar.m28609getDefaultusljTpc())) {
            return 0;
        }
        if (d69.C4632c.m28605equalsimpl0(i, aVar.m28610getLooseusljTpc())) {
            return 1;
        }
        if (d69.C4632c.m28605equalsimpl0(i, aVar.m28611getNormalusljTpc())) {
            return 2;
        }
        return d69.C4632c.m28605equalsimpl0(i, aVar.m28612getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m28553toLayoutLineBreakWordStylewPN0Rpw(int i) {
        d69.C4633d.a aVar = d69.C4633d.f28545b;
        return (!d69.C4633d.m28617equalsimpl0(i, aVar.m28621getDefaultjp8hJ3c()) && d69.C4633d.m28617equalsimpl0(i, aVar.m28622getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m28554toLayoutTextGranularityduNsdkg(int i) {
        htg.C7018a c7018a = htg.f44857b;
        return (!htg.m30121equalsimpl0(i, c7018a.m30125getCharacterDRrd7Zo()) && htg.m30121equalsimpl0(i, c7018a.m30126getWordDRrd7Zo())) ? 1 : 0;
    }
}
