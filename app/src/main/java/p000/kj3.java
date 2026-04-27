package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.at4;
import p000.g1h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class kj3 extends v27<kj3, C8388b> implements lj3 {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final kj3 DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile uhc<kj3> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    /* JADX INFO: renamed from: kj3$a */
    public static /* synthetic */ class C8387a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54250a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f54250a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54250a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54250a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54250a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54250a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54250a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54250a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: kj3$b */
    public static final class C8388b extends v27.AbstractC13823b<kj3, C8388b> implements lj3 {
        public /* synthetic */ C8388b(C8387a c8387a) {
            this();
        }

        public C8388b clearDay() {
            m23743e();
            ((kj3) this.f89756b).clearDay();
            return this;
        }

        public C8388b clearHours() {
            m23743e();
            ((kj3) this.f89756b).clearHours();
            return this;
        }

        public C8388b clearMinutes() {
            m23743e();
            ((kj3) this.f89756b).clearMinutes();
            return this;
        }

        public C8388b clearMonth() {
            m23743e();
            ((kj3) this.f89756b).clearMonth();
            return this;
        }

        public C8388b clearNanos() {
            m23743e();
            ((kj3) this.f89756b).clearNanos();
            return this;
        }

        public C8388b clearSeconds() {
            m23743e();
            ((kj3) this.f89756b).clearSeconds();
            return this;
        }

        public C8388b clearTimeOffset() {
            m23743e();
            ((kj3) this.f89756b).clearTimeOffset();
            return this;
        }

        public C8388b clearTimeZone() {
            m23743e();
            ((kj3) this.f89756b).clearTimeZone();
            return this;
        }

        public C8388b clearUtcOffset() {
            m23743e();
            ((kj3) this.f89756b).clearUtcOffset();
            return this;
        }

        public C8388b clearYear() {
            m23743e();
            ((kj3) this.f89756b).clearYear();
            return this;
        }

        @Override // p000.lj3
        public int getDay() {
            return ((kj3) this.f89756b).getDay();
        }

        @Override // p000.lj3
        public int getHours() {
            return ((kj3) this.f89756b).getHours();
        }

        @Override // p000.lj3
        public int getMinutes() {
            return ((kj3) this.f89756b).getMinutes();
        }

        @Override // p000.lj3
        public int getMonth() {
            return ((kj3) this.f89756b).getMonth();
        }

        @Override // p000.lj3
        public int getNanos() {
            return ((kj3) this.f89756b).getNanos();
        }

        @Override // p000.lj3
        public int getSeconds() {
            return ((kj3) this.f89756b).getSeconds();
        }

        @Override // p000.lj3
        public EnumC8389c getTimeOffsetCase() {
            return ((kj3) this.f89756b).getTimeOffsetCase();
        }

        @Override // p000.lj3
        public g1h getTimeZone() {
            return ((kj3) this.f89756b).getTimeZone();
        }

        @Override // p000.lj3
        public at4 getUtcOffset() {
            return ((kj3) this.f89756b).getUtcOffset();
        }

        @Override // p000.lj3
        public int getYear() {
            return ((kj3) this.f89756b).getYear();
        }

        @Override // p000.lj3
        public boolean hasTimeZone() {
            return ((kj3) this.f89756b).hasTimeZone();
        }

        @Override // p000.lj3
        public boolean hasUtcOffset() {
            return ((kj3) this.f89756b).hasUtcOffset();
        }

        public C8388b mergeTimeZone(g1h g1hVar) {
            m23743e();
            ((kj3) this.f89756b).mergeTimeZone(g1hVar);
            return this;
        }

        public C8388b mergeUtcOffset(at4 at4Var) {
            m23743e();
            ((kj3) this.f89756b).mergeUtcOffset(at4Var);
            return this;
        }

        public C8388b setDay(int i) {
            m23743e();
            ((kj3) this.f89756b).setDay(i);
            return this;
        }

        public C8388b setHours(int i) {
            m23743e();
            ((kj3) this.f89756b).setHours(i);
            return this;
        }

        public C8388b setMinutes(int i) {
            m23743e();
            ((kj3) this.f89756b).setMinutes(i);
            return this;
        }

        public C8388b setMonth(int i) {
            m23743e();
            ((kj3) this.f89756b).setMonth(i);
            return this;
        }

        public C8388b setNanos(int i) {
            m23743e();
            ((kj3) this.f89756b).setNanos(i);
            return this;
        }

        public C8388b setSeconds(int i) {
            m23743e();
            ((kj3) this.f89756b).setSeconds(i);
            return this;
        }

        public C8388b setTimeZone(g1h g1hVar) {
            m23743e();
            ((kj3) this.f89756b).setTimeZone(g1hVar);
            return this;
        }

        public C8388b setUtcOffset(at4 at4Var) {
            m23743e();
            ((kj3) this.f89756b).setUtcOffset(at4Var);
            return this;
        }

        public C8388b setYear(int i) {
            m23743e();
            ((kj3) this.f89756b).setYear(i);
            return this;
        }

        private C8388b() {
            super(kj3.DEFAULT_INSTANCE);
        }

        public C8388b setTimeZone(g1h.C6091b c6091b) {
            m23743e();
            ((kj3) this.f89756b).setTimeZone(c6091b.build());
            return this;
        }

        public C8388b setUtcOffset(at4.C1602b c1602b) {
            m23743e();
            ((kj3) this.f89756b).setUtcOffset(c1602b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: kj3$c */
    public enum EnumC8389c {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f54255a;

        EnumC8389c(int i) {
            this.f54255a = i;
        }

        public static EnumC8389c forNumber(int i) {
            if (i == 0) {
                return TIMEOFFSET_NOT_SET;
            }
            if (i == 8) {
                return UTC_OFFSET;
            }
            if (i != 9) {
                return null;
            }
            return TIME_ZONE;
        }

        public int getNumber() {
            return this.f54255a;
        }

        @Deprecated
        public static EnumC8389c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        kj3 kj3Var = new kj3();
        DEFAULT_INSTANCE = kj3Var;
        v27.m23715h0(kj3.class, kj3Var);
    }

    private kj3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinutes() {
        this.minutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonth() {
        this.month_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    public static kj3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeZone(g1h g1hVar) {
        g1hVar.getClass();
        if (this.timeOffsetCase_ != 9 || this.timeOffset_ == g1h.getDefaultInstance()) {
            this.timeOffset_ = g1hVar;
        } else {
            this.timeOffset_ = g1h.newBuilder((g1h) this.timeOffset_).mergeFrom(g1hVar).buildPartial();
        }
        this.timeOffsetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUtcOffset(at4 at4Var) {
        at4Var.getClass();
        if (this.timeOffsetCase_ != 8 || this.timeOffset_ == at4.getDefaultInstance()) {
            this.timeOffset_ = at4Var;
        } else {
            this.timeOffset_ = at4.newBuilder((at4) this.timeOffset_).mergeFrom(at4Var).buildPartial();
        }
        this.timeOffsetCase_ = 8;
    }

    public static C8388b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static kj3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (kj3) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static kj3 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (kj3) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<kj3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i) {
        this.day_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(int i) {
        this.hours_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinutes(int i) {
        this.minutes_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonth(int i) {
        this.month_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(int i) {
        this.seconds_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(g1h g1hVar) {
        g1hVar.getClass();
        this.timeOffset_ = g1hVar;
        this.timeOffsetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtcOffset(at4 at4Var) {
        at4Var.getClass();
        this.timeOffset_ = at4Var;
        this.timeOffsetCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(int i) {
        this.year_ = i;
    }

    @Override // p000.lj3
    public int getDay() {
        return this.day_;
    }

    @Override // p000.lj3
    public int getHours() {
        return this.hours_;
    }

    @Override // p000.lj3
    public int getMinutes() {
        return this.minutes_;
    }

    @Override // p000.lj3
    public int getMonth() {
        return this.month_;
    }

    @Override // p000.lj3
    public int getNanos() {
        return this.nanos_;
    }

    @Override // p000.lj3
    public int getSeconds() {
        return this.seconds_;
    }

    @Override // p000.lj3
    public EnumC8389c getTimeOffsetCase() {
        return EnumC8389c.forNumber(this.timeOffsetCase_);
    }

    @Override // p000.lj3
    public g1h getTimeZone() {
        return this.timeOffsetCase_ == 9 ? (g1h) this.timeOffset_ : g1h.getDefaultInstance();
    }

    @Override // p000.lj3
    public at4 getUtcOffset() {
        return this.timeOffsetCase_ == 8 ? (at4) this.timeOffset_ : at4.getDefaultInstance();
    }

    @Override // p000.lj3
    public int getYear() {
        return this.year_;
    }

    @Override // p000.lj3
    public boolean hasTimeZone() {
        return this.timeOffsetCase_ == 9;
    }

    @Override // p000.lj3
    public boolean hasUtcOffset() {
        return this.timeOffsetCase_ == 8;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8387a c8387a = null;
        switch (C8387a.f54250a[enumC13830i.ordinal()]) {
            case 1:
                return new kj3();
            case 2:
                return new C8388b(c8387a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", at4.class, g1h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<kj3> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (kj3.class) {
                        try {
                            c13824c = PARSER;
                            if (c13824c == null) {
                                c13824c = new v27.C13824c<>(DEFAULT_INSTANCE);
                                PARSER = c13824c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13824c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C8388b newBuilder(kj3 kj3Var) {
        return DEFAULT_INSTANCE.m23739o(kj3Var);
    }

    public static kj3 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kj3) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kj3 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (kj3) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static kj3 parseFrom(vj1 vj1Var) throws ce8 {
        return (kj3) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static kj3 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (kj3) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static kj3 parseFrom(byte[] bArr) throws ce8 {
        return (kj3) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static kj3 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (kj3) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static kj3 parseFrom(InputStream inputStream) throws IOException {
        return (kj3) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static kj3 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kj3) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kj3 parseFrom(f72 f72Var) throws IOException {
        return (kj3) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static kj3 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (kj3) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
