package p000;

import android.graphics.Outline;

/* JADX INFO: loaded from: classes.dex */
@c5e(30)
@dwf({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/OutlineVerificationHelper\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,1023:1\n38#2,5:1024\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/OutlineVerificationHelper\n*L\n1020#1:1024,5\n*E\n"})
public final class s8c {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final s8c f80950a = new s8c();

    private s8c() {
    }

    @ih4
    public final void setPath(@yfb Outline outline, @yfb vic vicVar) {
        if (!(vicVar instanceof C4947du)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C4947du) vicVar).getInternalPath());
    }
}
