package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface xv8 {
    @yfb
    mv8 getCoordinates();

    @yfb
    c64 getDensity();

    int getHeight();

    @yfb
    ov8 getLayoutDirection();

    @yfb
    List<dxa> getModifierInfo();

    @gib
    xv8 getParentInfo();

    int getSemanticsId();

    @yfb
    u8i getViewConfiguration();

    int getWidth();

    boolean isAttached();

    default boolean isDeactivated() {
        return false;
    }

    boolean isPlaced();
}
