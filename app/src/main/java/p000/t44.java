package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class t44 implements suf {

    /* JADX INFO: renamed from: b */
    public static final int f83678b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final stg f83679a;

    public t44(@yfb stg stgVar) {
        this.f83679a = stgVar;
    }

    @yfb
    public final stg getTextInputService() {
        return this.f83679a;
    }

    @Override // p000.suf
    public void hide() {
        this.f83679a.hideSoftwareKeyboard();
    }

    @Override // p000.suf
    public void show() {
        this.f83679a.showSoftwareKeyboard();
    }
}
