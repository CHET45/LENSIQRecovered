package p000;

import android.graphics.Path;
import p000.vic;

/* JADX INFO: renamed from: ku */
/* JADX INFO: loaded from: classes.dex */
public final class C8522ku {

    /* JADX INFO: renamed from: ku$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55317a;

        static {
            int[] iArr = new int[vic.EnumC14096c.values().length];
            try {
                iArr[vic.EnumC14096c.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vic.EnumC14096c.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55317a = iArr;
        }
    }

    @yfb
    public static final vic Path() {
        return new C4947du(null, 1, 0 == true ? 1 : 0);
    }

    @yfb
    public static final Path asAndroidPath(@yfb vic vicVar) {
        if (vicVar instanceof C4947du) {
            return ((C4947du) vicVar).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @yfb
    public static final vic asComposePath(@yfb Path path) {
        return new C4947du(path);
    }

    public static final void throwIllegalStateException(@yfb String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction toPlatformPathDirection(vic.EnumC14096c enumC14096c) {
        int i = a.f55317a[enumC14096c.ordinal()];
        if (i == 1) {
            return Path.Direction.CCW;
        }
        if (i == 2) {
            return Path.Direction.CW;
        }
        throw new ceb();
    }
}
