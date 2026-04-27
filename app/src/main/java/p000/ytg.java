package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,375:1\n180#1,5:376\n180#1,5:381\n180#1,5:386\n180#1,5:391\n180#1,5:396\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n199#1:376,5\n223#1:381,5\n252#1:386,5\n272#1:391,5\n289#1:396,5\n*E\n"})
@e0g(parameters = 0)
@q64(message = "Use PlatformTextInputModifierNode instead.")
public final class ytg {

    /* JADX INFO: renamed from: c */
    public static final int f102972c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final stg f102973a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final wxc f102974b;

    public ytg(@yfb stg stgVar, @yfb wxc wxcVar) {
        this.f102973a = stgVar;
        this.f102974b = wxcVar;
    }

    private final boolean ensureOpenSession(ny6<bth> ny6Var) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            ny6Var.invoke();
        }
        return zIsOpen;
    }

    public final void dispose() {
        this.f102973a.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f102974b.hideSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean isOpen() {
        return md8.areEqual(this.f102973a.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(@yfb rud rudVar) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f102974b.notifyFocusedRect(rudVar);
        }
        return zIsOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f102974b.showSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean updateState(@gib zsg zsgVar, @yfb zsg zsgVar2) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f102974b.updateState(zsgVar, zsgVar2);
        }
        return zIsOpen;
    }

    public final boolean updateTextLayoutResult(@yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb qy6<? super x3a, bth> qy6Var, @yfb rud rudVar, @yfb rud rudVar2) {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f102974b.updateTextLayoutResult(zsgVar, nzbVar, hugVar, qy6Var, rudVar, rudVar2);
        }
        return zIsOpen;
    }
}
