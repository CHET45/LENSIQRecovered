package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.fta;
import p000.yya;

/* JADX INFO: loaded from: classes7.dex */
@dy1
@uw7
public final class n4g {

    /* JADX INFO: renamed from: d */
    public static final List<n4g> f63257d = buildStatusList();

    /* JADX INFO: renamed from: e */
    public static final n4g f63258e = EnumC9694b.OK.toStatus();

    /* JADX INFO: renamed from: f */
    public static final n4g f63259f = EnumC9694b.CANCELLED.toStatus();

    /* JADX INFO: renamed from: g */
    public static final n4g f63260g = EnumC9694b.UNKNOWN.toStatus();

    /* JADX INFO: renamed from: h */
    public static final n4g f63261h = EnumC9694b.INVALID_ARGUMENT.toStatus();

    /* JADX INFO: renamed from: i */
    public static final n4g f63262i = EnumC9694b.DEADLINE_EXCEEDED.toStatus();

    /* JADX INFO: renamed from: j */
    public static final n4g f63263j = EnumC9694b.NOT_FOUND.toStatus();

    /* JADX INFO: renamed from: k */
    public static final n4g f63264k = EnumC9694b.ALREADY_EXISTS.toStatus();

    /* JADX INFO: renamed from: l */
    public static final n4g f63265l = EnumC9694b.PERMISSION_DENIED.toStatus();

    /* JADX INFO: renamed from: m */
    public static final n4g f63266m = EnumC9694b.UNAUTHENTICATED.toStatus();

    /* JADX INFO: renamed from: n */
    public static final n4g f63267n = EnumC9694b.RESOURCE_EXHAUSTED.toStatus();

    /* JADX INFO: renamed from: o */
    public static final n4g f63268o = EnumC9694b.FAILED_PRECONDITION.toStatus();

    /* JADX INFO: renamed from: p */
    public static final n4g f63269p = EnumC9694b.ABORTED.toStatus();

    /* JADX INFO: renamed from: q */
    public static final n4g f63270q = EnumC9694b.OUT_OF_RANGE.toStatus();

    /* JADX INFO: renamed from: r */
    public static final n4g f63271r = EnumC9694b.UNIMPLEMENTED.toStatus();

    /* JADX INFO: renamed from: s */
    public static final n4g f63272s = EnumC9694b.INTERNAL.toStatus();

    /* JADX INFO: renamed from: t */
    public static final n4g f63273t = EnumC9694b.UNAVAILABLE.toStatus();

    /* JADX INFO: renamed from: u */
    public static final n4g f63274u = EnumC9694b.DATA_LOSS.toStatus();

    /* JADX INFO: renamed from: v */
    public static final fta.AbstractC5971i<n4g> f63275v;

    /* JADX INFO: renamed from: w */
    public static final fta.InterfaceC5975m<String> f63276w;

    /* JADX INFO: renamed from: x */
    public static final fta.AbstractC5971i<String> f63277x;

    /* JADX INFO: renamed from: a */
    public final EnumC9694b f63278a;

    /* JADX INFO: renamed from: b */
    public final String f63279b;

    /* JADX INFO: renamed from: c */
    public final Throwable f63280c;

    /* JADX INFO: renamed from: n4g$b */
    public enum EnumC9694b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: a */
        public final int f63299a;

        /* JADX INFO: renamed from: b */
        public final byte[] f63300b;

        EnumC9694b(int i) {
            this.f63299a = i;
            this.f63300b = Integer.toString(i).getBytes(yw1.f103174a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] valueAscii() {
            return this.f63300b;
        }

        public n4g toStatus() {
            return (n4g) n4g.f63257d.get(this.f63299a);
        }

        public int value() {
            return this.f63299a;
        }
    }

    /* JADX INFO: renamed from: n4g$c */
    public static final class C9695c implements fta.InterfaceC5975m<n4g> {
        private C9695c() {
        }

        @Override // p000.fta.InterfaceC5975m
        public n4g parseAsciiString(byte[] bArr) {
            return n4g.fromCodeValue(bArr);
        }

        @Override // p000.fta.InterfaceC5975m
        public byte[] toAsciiString(n4g n4gVar) {
            return n4gVar.getCode().valueAscii();
        }
    }

    /* JADX INFO: renamed from: n4g$d */
    public static final class C9696d implements fta.InterfaceC5975m<String> {

        /* JADX INFO: renamed from: a */
        public static final byte[] f63301a = {48, 49, 50, 51, 52, 53, 54, 55, 56, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};

        private C9696d() {
        }

        private static boolean isEscapingChar(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        private static String parseAsciiStringSlow(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == 37 && i + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, yw1.f103174a), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                        byteBufferAllocate.put(bArr[i]);
                        i++;
                    }
                }
                byteBufferAllocate.put(bArr[i]);
                i++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), yw1.f103176c);
        }

        private static byte[] toAsciiStringSlow(byte[] bArr, int i) {
            byte[] bArr2 = new byte[((bArr.length - i) * 3) + i];
            if (i != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            int i2 = i;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (isEscapingChar(b)) {
                    bArr2[i2] = 37;
                    byte[] bArr3 = f63301a;
                    bArr2[i2 + 1] = bArr3[(b >> 4) & 15];
                    bArr2[i2 + 2] = bArr3[b & 15];
                    i2 += 3;
                } else {
                    bArr2[i2] = b;
                    i2++;
                }
                i++;
            }
            return Arrays.copyOf(bArr2, i2);
        }

        @Override // p000.fta.InterfaceC5975m
        public String parseAsciiString(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    return parseAsciiStringSlow(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // p000.fta.InterfaceC5975m
        public byte[] toAsciiString(String str) {
            byte[] bytes = str.getBytes(yw1.f103176c);
            for (int i = 0; i < bytes.length; i++) {
                if (isEscapingChar(bytes[i])) {
                    return toAsciiStringSlow(bytes, i);
                }
            }
            return bytes;
        }
    }

    static {
        f63275v = fta.AbstractC5971i.m11173d("grpc-status", false, new C9695c());
        C9696d c9696d = new C9696d();
        f63276w = c9696d;
        f63277x = fta.AbstractC5971i.m11173d("grpc-message", false, c9696d);
    }

    private n4g(EnumC9694b enumC9694b) {
        this(enumC9694b, null, null);
    }

    private static List<n4g> buildStatusList() {
        TreeMap treeMap = new TreeMap();
        for (EnumC9694b enumC9694b : EnumC9694b.values()) {
            n4g n4gVar = (n4g) treeMap.put(Integer.valueOf(enumC9694b.value()), new n4g(enumC9694b));
            if (n4gVar != null) {
                throw new IllegalStateException("Code value duplication between " + n4gVar.getCode().name() + " & " + enumC9694b.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* JADX INFO: renamed from: c */
    public static String m17780c(n4g n4gVar) {
        if (n4gVar.f63279b == null) {
            return n4gVar.f63278a.toString();
        }
        return n4gVar.f63278a + ": " + n4gVar.f63279b;
    }

    public static n4g fromCode(EnumC9694b enumC9694b) {
        return enumC9694b.toStatus();
    }

    public static n4g fromCodeValue(int i) {
        if (i >= 0) {
            List<n4g> list = f63257d;
            if (i < list.size()) {
                return list.get(i);
            }
        }
        return f63260g.withDescription("Unknown code " + i);
    }

    private static n4g fromCodeValueSlow(byte[] bArr) {
        int i;
        byte b;
        int length = bArr.length;
        char c = 1;
        if (length != 1) {
            i = (length == 2 && (b = bArr[0]) >= 48 && b <= 57) ? (b - 48) * 10 : 0;
            return f63260g.withDescription("Unknown code " + new String(bArr, yw1.f103174a));
        }
        c = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            List<n4g> list = f63257d;
            if (i2 < list.size()) {
                return list.get(i2);
            }
        }
        return f63260g.withDescription("Unknown code " + new String(bArr, yw1.f103174a));
    }

    public static n4g fromThrowable(Throwable th) {
        for (Throwable cause = (Throwable) v7d.checkNotNull(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof q4g) {
                return ((q4g) cause).getStatus();
            }
            if (cause instanceof v4g) {
                return ((v4g) cause).getStatus();
            }
        }
        return f63260g.withCause(th);
    }

    @eib
    public static fta trailersFromThrowable(Throwable th) {
        for (Throwable cause = (Throwable) v7d.checkNotNull(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof q4g) {
                return ((q4g) cause).getTrailers();
            }
            if (cause instanceof v4g) {
                return ((v4g) cause).getTrailers();
            }
        }
        return null;
    }

    public q4g asException() {
        return new q4g(this);
    }

    public v4g asRuntimeException() {
        return new v4g(this);
    }

    public n4g augmentDescription(String str) {
        if (str == null) {
            return this;
        }
        if (this.f63279b == null) {
            return new n4g(this.f63278a, str, this.f63280c);
        }
        return new n4g(this.f63278a, this.f63279b + "\n" + str, this.f63280c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @eib
    public Throwable getCause() {
        return this.f63280c;
    }

    public EnumC9694b getCode() {
        return this.f63278a;
    }

    @eib
    public String getDescription() {
        return this.f63279b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isOk() {
        return EnumC9694b.OK == this.f63278a;
    }

    public String toString() {
        yya.C15889b c15889bAdd = yya.toStringHelper(this).add(g55.f38796e, this.f63278a.name()).add("description", this.f63279b);
        Throwable th = this.f63280c;
        Object stackTraceAsString = th;
        if (th != null) {
            stackTraceAsString = bzg.getStackTraceAsString(th);
        }
        return c15889bAdd.add("cause", stackTraceAsString).toString();
    }

    public n4g withCause(Throwable th) {
        return okb.equal(this.f63280c, th) ? this : new n4g(this.f63278a, this.f63279b, th);
    }

    public n4g withDescription(String str) {
        return okb.equal(this.f63279b, str) ? this : new n4g(this.f63278a, str, this.f63280c);
    }

    private n4g(EnumC9694b enumC9694b, @eib String str, @eib Throwable th) {
        this.f63278a = (EnumC9694b) v7d.checkNotNull(enumC9694b, g55.f38796e);
        this.f63279b = str;
        this.f63280c = th;
    }

    public q4g asException(@eib fta ftaVar) {
        return new q4g(this, ftaVar);
    }

    public v4g asRuntimeException(@eib fta ftaVar) {
        return new v4g(this, ftaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n4g fromCodeValue(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f63258e;
        }
        return fromCodeValueSlow(bArr);
    }
}
