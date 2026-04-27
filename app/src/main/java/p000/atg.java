package p000;

/* JADX INFO: loaded from: classes.dex */
public final class atg {
    @yfb
    public static final C9041lz getSelectedText(@yfb zsg zsgVar) {
        return zsgVar.getAnnotatedString().m30925subSequence5zctL8(zsgVar.m33527getSelectiond9O1mEE());
    }

    @yfb
    public static final C9041lz getTextAfterSelection(@yfb zsg zsgVar, int i) {
        return zsgVar.getAnnotatedString().subSequence(jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()), Math.min(jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()) + i, zsgVar.getText().length()));
    }

    @yfb
    public static final C9041lz getTextBeforeSelection(@yfb zsg zsgVar, int i) {
        return zsgVar.getAnnotatedString().subSequence(Math.max(0, jvg.m30591getMinimpl(zsgVar.m33527getSelectiond9O1mEE()) - i), jvg.m30591getMinimpl(zsgVar.m33527getSelectiond9O1mEE()));
    }
}
