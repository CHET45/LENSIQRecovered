package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,176:1\n288#2,15:177\n288#2,15:192\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n*L\n115#1:177,15\n125#1:192,15\n*E\n"})
public final class iwg {
    public static final void redo(@yfb wsg wsgVar, @yfb hwg hwgVar) {
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(hwgVar.getIndex(), hwgVar.getIndex() + hwgVar.getPreText().length(), hwgVar.getPostText());
        mainBuffer$foundation_release.setSelection(jvg.m30593getStartimpl(hwgVar.m30142getPostSelectiond9O1mEE()), jvg.m30588getEndimpl(hwgVar.m30142getPostSelectiond9O1mEE()));
        wsgVar.updateValueAndNotifyListeners(wsgVar.getValue$foundation_release(), new jrg(wsgVar.getMainBuffer$foundation_release().toString(), wsgVar.getMainBuffer$foundation_release().m32033getSelectiond9O1mEE(), wsgVar.getMainBuffer$foundation_release().m32032getCompositionMzsxiRA(), null, 8, null), true);
    }

    public static final void undo(@yfb wsg wsgVar, @yfb hwg hwgVar) {
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        qw4 mainBuffer$foundation_release = wsgVar.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(hwgVar.getIndex(), hwgVar.getIndex() + hwgVar.getPostText().length(), hwgVar.getPreText());
        mainBuffer$foundation_release.setSelection(jvg.m30593getStartimpl(hwgVar.m30143getPreSelectiond9O1mEE()), jvg.m30588getEndimpl(hwgVar.m30143getPreSelectiond9O1mEE()));
        wsgVar.updateValueAndNotifyListeners(wsgVar.getValue$foundation_release(), new jrg(wsgVar.getMainBuffer$foundation_release().toString(), wsgVar.getMainBuffer$foundation_release().m32033getSelectiond9O1mEE(), wsgVar.getMainBuffer$foundation_release().m32032getCompositionMzsxiRA(), null, 8, null), true);
    }
}
