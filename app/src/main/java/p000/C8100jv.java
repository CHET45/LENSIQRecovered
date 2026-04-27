package p000;

/* JADX INFO: renamed from: jv */
/* JADX INFO: loaded from: classes.dex */
public final class C8100jv {

    /* JADX INFO: renamed from: jv$a */
    public static final class a extends gsg {
        @Override // p000.gsg
        public void update(@yfb jeh jehVar, @yfb rsg rsgVar, @yfb lug lugVar, boolean z) {
        }
    }

    @yfb
    @igg({"ModifierFactoryExtensionFunction", "ModifierFactoryReturnType"})
    public static final gsg textFieldMagnifierNode(@yfb jeh jehVar, @yfb rsg rsgVar, @yfb lug lugVar, boolean z) {
        return vq9.isPlatformMagnifierSupported$default(0, 1, null) ? new hsg(jehVar, rsgVar, lugVar, z) : new a();
    }
}
