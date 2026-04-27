package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class j2d {

    /* JADX INFO: renamed from: d */
    public static final int f49427d = 8;

    /* JADX INFO: renamed from: a */
    public final long f49428a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<k2d> f49429b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final MotionEvent f49430c;

    public j2d(long j, @yfb List<k2d> list, @yfb MotionEvent motionEvent) {
        this.f49428a = j;
        this.f49429b = list;
        this.f49430c = motionEvent;
    }

    @yfb
    public final MotionEvent getMotionEvent() {
        return this.f49430c;
    }

    @yfb
    public final List<k2d> getPointers() {
        return this.f49429b;
    }

    public final long getUptime() {
        return this.f49428a;
    }
}
