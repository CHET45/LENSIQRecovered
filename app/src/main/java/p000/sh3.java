package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class sh3 extends IOException {

    /* JADX INFO: renamed from: b */
    @ovh
    @Deprecated
    public static final int f81769b = 2008;

    /* JADX INFO: renamed from: a */
    public final int f81770a;

    @ovh
    public sh3(int i) {
        this.f81770a = i;
    }

    @ovh
    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof sh3) && ((sh3) cause).f81770a == 2008) {
                return true;
            }
        }
        return false;
    }

    @ovh
    public sh3(@hib Throwable th, int i) {
        super(th);
        this.f81770a = i;
    }

    @ovh
    public sh3(@hib String str, int i) {
        super(str);
        this.f81770a = i;
    }

    @ovh
    public sh3(@hib String str, @hib Throwable th, int i) {
        super(str, th);
        this.f81770a = i;
    }
}
