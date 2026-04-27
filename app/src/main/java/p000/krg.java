package p000;

/* JADX INFO: loaded from: classes.dex */
public final class krg {
    @yfb
    public static final CharSequence getSelectedText(@yfb jrg jrgVar) {
        return jrgVar.subSequence(jvg.m30591getMinimpl(jrgVar.m30568getSelectiond9O1mEE()), jvg.m30590getMaximpl(jrgVar.m30568getSelectiond9O1mEE()));
    }

    @yfb
    public static final CharSequence getTextAfterSelection(@yfb jrg jrgVar, int i) {
        return jrgVar.subSequence(jvg.m30590getMaximpl(jrgVar.m30568getSelectiond9O1mEE()), Math.min(jvg.m30590getMaximpl(jrgVar.m30568getSelectiond9O1mEE()) + i, jrgVar.length()));
    }

    @yfb
    public static final CharSequence getTextBeforeSelection(@yfb jrg jrgVar, int i) {
        return jrgVar.subSequence(Math.max(0, jvg.m30591getMinimpl(jrgVar.m30568getSelectiond9O1mEE()) - i), jvg.m30591getMinimpl(jrgVar.m30568getSelectiond9O1mEE()));
    }
}
