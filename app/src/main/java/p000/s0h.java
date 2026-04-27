package p000;

import android.os.SystemClock;
import p000.bt4;

/* JADX INFO: loaded from: classes5.dex */
public final class s0h implements r0h {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final s0h f80352a = new s0h();

    private s0h() {
    }

    @Override // p000.r0h
    @yfb
    public wzg currentTime() {
        return new wzg(System.currentTimeMillis());
    }

    @Override // p000.r0h
    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc */
    public long mo32071elapsedRealtimeUwyO8pc() {
        bt4.C2044a c2044a = bt4.f14711b;
        return ft4.toDuration(SystemClock.elapsedRealtime(), lt4.f58683d);
    }
}
