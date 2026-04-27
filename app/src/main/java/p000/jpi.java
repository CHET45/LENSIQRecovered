package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jpi {
    public static final int getWordEnd(@yfb kpi kpiVar, int i) {
        int punctuationEnd = kpiVar.isAfterPunctuation(kpiVar.nextBoundary(i)) ? kpiVar.getPunctuationEnd(i) : kpiVar.getNextWordEndOnTwoWordBoundary(i);
        return punctuationEnd == -1 ? i : punctuationEnd;
    }

    public static final int getWordStart(@yfb kpi kpiVar, int i) {
        int punctuationBeginning = kpiVar.isOnPunctuation(kpiVar.prevBoundary(i)) ? kpiVar.getPunctuationBeginning(i) : kpiVar.getPrevWordBeginningOnTwoWordsBoundary(i);
        return punctuationBeginning == -1 ? i : punctuationBeginning;
    }
}
