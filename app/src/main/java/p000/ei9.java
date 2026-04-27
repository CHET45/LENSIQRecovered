package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class ei9 {

    /* JADX INFO: renamed from: c */
    public static final ei9 f33080c = new C5321a().build();

    /* JADX INFO: renamed from: a */
    public final long f33081a;

    /* JADX INFO: renamed from: b */
    public final EnumC5322b f33082b;

    /* JADX INFO: renamed from: ei9$a */
    public static final class C5321a {

        /* JADX INFO: renamed from: a */
        public long f33083a = 0;

        /* JADX INFO: renamed from: b */
        public EnumC5322b f33084b = EnumC5322b.REASON_UNKNOWN;

        public ei9 build() {
            return new ei9(this.f33083a, this.f33084b);
        }

        public C5321a setEventsDroppedCount(long j) {
            this.f33083a = j;
            return this;
        }

        public C5321a setReason(EnumC5322b enumC5322b) {
            this.f33084b = enumC5322b;
            return this;
        }
    }

    /* JADX INFO: renamed from: ei9$b */
    public enum EnumC5322b implements ehd {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a */
        public final int f33093a;

        EnumC5322b(int i) {
            this.f33093a = i;
        }

        @Override // p000.ehd
        public int getNumber() {
            return this.f33093a;
        }
    }

    public ei9(long j, EnumC5322b enumC5322b) {
        this.f33081a = j;
        this.f33082b = enumC5322b;
    }

    public static ei9 getDefaultInstance() {
        return f33080c;
    }

    public static C5321a newBuilder() {
        return new C5321a();
    }

    @jhd(tag = 1)
    public long getEventsDroppedCount() {
        return this.f33081a;
    }

    @jhd(tag = 3)
    public EnumC5322b getReason() {
        return this.f33082b;
    }
}
