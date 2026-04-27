package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,343:1\n75#2:344\n108#2,2:345\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n*L\n268#1:344\n268#1:345,2\n*E\n"})
@e0g(parameters = 1)
public final class qic implements g48 {

    /* JADX INFO: renamed from: d */
    public static final int f74537d = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<bth> f74538b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final k5b f74539c = etf.mutableIntStateOf(-1);

    public qic(@yfb ny6<bth> ny6Var) {
        this.f74538b = ny6Var;
    }

    private final void setRevealCodepointIndex(int i) {
        this.f74539c.setIntValue(i);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.f74539c.getIntValue();
    }

    @yfb
    public final ny6<bth> getScheduleHide() {
        return this.f74538b;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    @Override // p000.g48
    public void transformInput(@yfb hrg hrgVar) {
        if (hrgVar.getChanges().getChangeCount() != 1 || jvg.m30589getLengthimpl(hrgVar.getChanges().mo30108getRangejx7JFs(0)) != 1 || jvg.m30589getLengthimpl(hrgVar.getChanges().mo30107getOriginalRangejx7JFs(0)) != 0 || hrgVar.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int iM30591getMinimpl = jvg.m30591getMinimpl(hrgVar.getChanges().mo30108getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation_release() != iM30591getMinimpl) {
            this.f74538b.invoke();
            setRevealCodepointIndex(iM30591getMinimpl);
        }
    }
}
