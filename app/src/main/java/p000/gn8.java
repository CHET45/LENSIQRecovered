package p000;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class gn8 {
    public static final int findFollowingBreak(@yfb String str, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int findPrecedingBreak(@yfb String str, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
