package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class xn0 {

    /* JADX INFO: renamed from: xn0$a */
    public enum EnumC15205a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static xn0 fatalError() {
        return new jj0(EnumC15205a.FATAL_ERROR, -1L);
    }

    public static xn0 invalidPayload() {
        return new jj0(EnumC15205a.INVALID_PAYLOAD, -1L);
    }

    /* JADX INFO: renamed from: ok */
    public static xn0 m25330ok(long j) {
        return new jj0(EnumC15205a.OK, j);
    }

    public static xn0 transientError() {
        return new jj0(EnumC15205a.TRANSIENT_ERROR, -1L);
    }

    public abstract long getNextRequestWaitMillis();

    public abstract EnumC15205a getStatus();
}
