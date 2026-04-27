package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class br8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zq8 f14596a = new C2021a();

    /* JADX INFO: renamed from: br8$a */
    public static final class C2021a implements zq8 {
        @Override // p000.zq8
        @gib
        /* JADX INFO: renamed from: map-ZmokQxo */
        public hq8 mo27875mapZmokQxo(@yfb KeyEvent keyEvent) {
            hq8 hq8Var = null;
            if (oq8.m31592isShiftPressedZmokQxo(keyEvent) && oq8.m31589isAltPressedZmokQxo(keyEvent)) {
                long jM31586getKeyZmokQxo = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32008getDirectionLeftEK5gGoQ())) {
                    hq8Var = hq8.SELECT_LINE_LEFT;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32009getDirectionRightEK5gGoQ())) {
                    hq8Var = hq8.SELECT_LINE_RIGHT;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32010getDirectionUpEK5gGoQ())) {
                    hq8Var = hq8.SELECT_HOME;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32007getDirectionDownEK5gGoQ())) {
                    hq8Var = hq8.SELECT_END;
                }
            } else if (oq8.m31589isAltPressedZmokQxo(keyEvent)) {
                long jM31586getKeyZmokQxo2 = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var2 = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32008getDirectionLeftEK5gGoQ())) {
                    hq8Var = hq8.LINE_LEFT;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32009getDirectionRightEK5gGoQ())) {
                    hq8Var = hq8.LINE_RIGHT;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32010getDirectionUpEK5gGoQ())) {
                    hq8Var = hq8.HOME;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32007getDirectionDownEK5gGoQ())) {
                    hq8Var = hq8.END;
                }
            }
            return hq8Var == null ? ar8.getDefaultKeyMapping().mo27875mapZmokQxo(keyEvent) : hq8Var;
        }
    }

    @yfb
    public static final zq8 getPlatformDefaultKeyMapping() {
        return f14596a;
    }
}
