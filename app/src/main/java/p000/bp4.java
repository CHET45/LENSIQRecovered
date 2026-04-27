package p000;

/* JADX INFO: loaded from: classes.dex */
public interface bp4 {
    @yfb
    default vq1 getCanvas() {
        return new uz4();
    }

    @yfb
    default c64 getDensity() {
        return cp4.getDefaultDensity();
    }

    @gib
    default u97 getGraphicsLayer() {
        return null;
    }

    @yfb
    default ov8 getLayoutDirection() {
        return ov8.Ltr;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    long mo28019getSizeNHjbRc();

    @yfb
    tp4 getTransform();

    default void setCanvas(@yfb vq1 vq1Var) {
    }

    default void setDensity(@yfb c64 c64Var) {
    }

    default void setGraphicsLayer(@gib u97 u97Var) {
    }

    default void setLayoutDirection(@yfb ov8 ov8Var) {
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    void mo28020setSizeuvyYCjk(long j);
}
