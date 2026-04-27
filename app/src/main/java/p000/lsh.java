package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 1)
public final class lsh {

    /* JADX INFO: renamed from: b */
    public static final int f58652b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final wsg f58653a;

    public lsh(@yfb wsg wsgVar) {
        this.f58653a = wsgVar;
    }

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }

    public final void clearHistory() {
        this.f58653a.getTextUndoManager$foundation_release().clearHistory();
    }

    public final boolean getCanRedo() {
        return this.f58653a.getTextUndoManager$foundation_release().getCanRedo();
    }

    public final boolean getCanUndo() {
        return this.f58653a.getTextUndoManager$foundation_release().getCanUndo();
    }

    public final void redo() {
        this.f58653a.getTextUndoManager$foundation_release().redo(this.f58653a);
    }

    public final void undo() {
        this.f58653a.getTextUndoManager$foundation_release().undo(this.f58653a);
    }
}
