package p000;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableDoubleState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* JADX INFO: renamed from: be */
/* JADX INFO: loaded from: classes.dex */
public final class C1851be {

    /* JADX INFO: renamed from: a */
    public static final boolean f13463a = false;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final fx8 f13464b = hz8.lazy(a.f13467a);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f13465c = "ComposeInternal";

    /* JADX INFO: renamed from: d */
    public static final long f13466d;

    /* JADX INFO: renamed from: be$a */
    public static final class a extends tt8 implements ny6<rya> {

        /* JADX INFO: renamed from: a */
        public static final a f13467a = new a();

        public a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final rya invoke() {
            return Looper.getMainLooper() != null ? et3.f33995a : jse.f51733a;
        }
    }

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f13466d = id;
    }

    @yfb
    public static final u4b createSnapshotMutableDoubleState(double d) {
        return new ParcelableSnapshotMutableDoubleState(d);
    }

    @yfb
    public static final b5b createSnapshotMutableFloatState(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    @yfb
    public static final k5b createSnapshotMutableIntState(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    @yfb
    public static final w5b createSnapshotMutableLongState(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    @yfb
    public static final <T> ptf<T> createSnapshotMutableState(T t, @yfb qtf<T> qtfVar) {
        return new ParcelableSnapshotMutableState(t, qtfVar);
    }

    @yfb
    public static final rya getDefaultMonotonicFrameClock() {
        return (rya) f13464b.getValue();
    }

    @q64(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }

    public static final long getMainThreadId() {
        return f13466d;
    }

    public static final void logError(@yfb String str, @yfb Throwable th) {
        Log.e(f13465c, str, th);
    }
}
