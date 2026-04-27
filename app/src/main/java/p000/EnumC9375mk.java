package p000;

/* JADX INFO: renamed from: mk */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC9375mk implements nt2 {
    EVENT_UNKNOWN(0),
    EVENT_START(1),
    EVENT_END(2),
    EVENT_TIMEOUT(3),
    EVENT_PROGRESS(4),
    EVENT_NULL(10),
    EVENT_INIT(11),
    EVENT_CONNECTING(12),
    EVENT_CONN_TIMEOUT(13),
    EVENT_FAILED(14),
    EVENT_CONNECTED(15),
    EVENT_ERROR(16),
    EVENT_DISCONNECTED(17),
    EVENT_CLOSING(18),
    EVENT_CLOSED(19),
    EVENT_RESPONDING(20),
    EVENT_RESPONSE_TIMEOUT(21),
    EVENT_DESTROYED(22),
    EVENT_DISCARDED(23),
    EVENT_QUEUE_CONGESTION(24),
    EVENT_VAD_BEGIN(30),
    EVENT_VAD_END(31),
    EVENT_VAD_SILENCE(32);


    /* JADX INFO: renamed from: a */
    public final int f61220a;

    EnumC9375mk(int i) {
        this.f61220a = i;
    }

    public static EnumC9375mk valueOf(int i) {
        for (EnumC9375mk enumC9375mk : values()) {
            if (i == enumC9375mk.f61220a) {
                return enumC9375mk;
            }
        }
        return null;
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f61220a;
    }
}
