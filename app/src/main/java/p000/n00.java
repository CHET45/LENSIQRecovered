package p000;

import java.time.Duration;
import p000.a32;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
public final class n00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final n00 f62879a = new n00();

    private n00() {
    }

    public final long toMillis(@yfb Duration duration) {
        md8.checkNotNullParameter(duration, a32.C0034g.f248b);
        return duration.toMillis();
    }
}
