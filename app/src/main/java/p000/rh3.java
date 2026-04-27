package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class rh3 extends IOException {

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f78291b = 2008;

    /* JADX INFO: renamed from: a */
    public final int f78292a;

    public rh3(int i) {
        this.f78292a = i;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof rh3) && ((rh3) cause).f78292a == 2008) {
                return true;
            }
        }
        return false;
    }

    public rh3(@hib Throwable th, int i) {
        super(th);
        this.f78292a = i;
    }

    public rh3(@hib String str, int i) {
        super(str);
        this.f78292a = i;
    }

    public rh3(@hib String str, @hib Throwable th, int i) {
        super(str, th);
        this.f78292a = i;
    }
}
