package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yxb {

    /* JADX INFO: renamed from: a */
    public static final int f103248a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f103249b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f103250c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f103251d = 5;

    /* JADX INFO: renamed from: e */
    public static final int f103252e = 6;

    /* JADX INFO: renamed from: f */
    public static final int f103253f = 15;

    /* JADX INFO: renamed from: yxb$b */
    public static final class C15870b {

        /* JADX INFO: renamed from: b */
        public static final int f103254b = 4;

        /* JADX INFO: renamed from: c */
        public static final int f103255c = 0;

        /* JADX INFO: renamed from: d */
        public static final int f103256d = 2;

        /* JADX INFO: renamed from: e */
        public static final int f103257e = 3;

        /* JADX INFO: renamed from: a */
        public final boolean f103258a;

        private C15870b(C15873e c15873e, C15872d c15872d) throws C15871c {
            int i = c15872d.f103259a;
            v80.checkArgument(i == 6 || i == 3);
            byte[] bArr = new byte[Math.min(4, c15872d.f103260b.remaining())];
            c15872d.f103260b.asReadOnlyBuffer().get(bArr);
            hhc hhcVar = new hhc(bArr);
            yxb.throwWhenFeatureRequired(c15873e.f103261a);
            if (hhcVar.readBit()) {
                this.f103258a = false;
                return;
            }
            int bits = hhcVar.readBits(2);
            boolean bit = hhcVar.readBit();
            yxb.throwWhenFeatureRequired(c15873e.f103262b);
            if (!bit) {
                this.f103258a = true;
                return;
            }
            boolean bit2 = (bits == 3 || bits == 0) ? true : hhcVar.readBit();
            hhcVar.skipBit();
            yxb.throwWhenFeatureRequired(!c15873e.f103264d);
            if (hhcVar.readBit()) {
                yxb.throwWhenFeatureRequired(!c15873e.f103265e);
                hhcVar.skipBit();
            }
            yxb.throwWhenFeatureRequired(c15873e.f103263c);
            if (bits != 3) {
                hhcVar.skipBit();
            }
            hhcVar.skipBits(c15873e.f103266f);
            if (bits != 2 && bits != 0 && !bit2) {
                hhcVar.skipBits(3);
            }
            this.f103258a = ((bits == 3 || bits == 0) ? 255 : hhcVar.readBits(8)) != 0;
        }

        @hib
        public static C15870b parse(C15873e c15873e, C15872d c15872d) {
            try {
                return new C15870b(c15873e, c15872d);
            } catch (C15871c unused) {
                return null;
            }
        }

        public boolean isDependedOn() {
            return this.f103258a;
        }
    }

    /* JADX INFO: renamed from: yxb$c */
    public static class C15871c extends Exception {
        private C15871c() {
        }
    }

    /* JADX INFO: renamed from: yxb$d */
    public static final class C15872d {

        /* JADX INFO: renamed from: a */
        public final int f103259a;

        /* JADX INFO: renamed from: b */
        public final ByteBuffer f103260b;

        private C15872d(int i, ByteBuffer byteBuffer) {
            this.f103259a = i;
            this.f103260b = byteBuffer;
        }
    }

    /* JADX INFO: renamed from: yxb$e */
    public static final class C15873e {

        /* JADX INFO: renamed from: a */
        public final boolean f103261a;

        /* JADX INFO: renamed from: b */
        public final boolean f103262b;

        /* JADX INFO: renamed from: c */
        public final boolean f103263c;

        /* JADX INFO: renamed from: d */
        public final boolean f103264d;

        /* JADX INFO: renamed from: e */
        public final boolean f103265e;

        /* JADX INFO: renamed from: f */
        public final int f103266f;

        /* JADX INFO: renamed from: g */
        public final int f103267g;

        /* JADX INFO: renamed from: h */
        public final int f103268h;

        /* JADX INFO: renamed from: i */
        public final int f103269i;

        /* JADX INFO: renamed from: j */
        public final boolean f103270j;

        /* JADX INFO: renamed from: k */
        public final int f103271k;

        /* JADX INFO: renamed from: l */
        public final boolean f103272l;

        /* JADX INFO: renamed from: m */
        public final boolean f103273m;

        /* JADX INFO: renamed from: n */
        public final boolean f103274n;

        /* JADX INFO: renamed from: o */
        public final boolean f103275o;

        /* JADX INFO: renamed from: p */
        public final boolean f103276p;

        /* JADX INFO: renamed from: q */
        public final int f103277q;

        /* JADX INFO: renamed from: r */
        public final byte f103278r;

        /* JADX INFO: renamed from: s */
        public final byte f103279s;

        /* JADX INFO: renamed from: t */
        public final byte f103280t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private C15873e(C15872d c15872d) throws C15871c {
            int bits;
            int bits2;
            boolean bit;
            ?? r8;
            v80.checkArgument(c15872d.f103259a == 1);
            byte[] bArr = new byte[c15872d.f103260b.remaining()];
            c15872d.f103260b.asReadOnlyBuffer().get(bArr);
            hhc hhcVar = new hhc(bArr);
            this.f103267g = hhcVar.readBits(3);
            hhcVar.skipBit();
            boolean bit2 = hhcVar.readBit();
            this.f103261a = bit2;
            if (bit2) {
                bits2 = hhcVar.readBits(5);
                this.f103262b = false;
                this.f103270j = false;
                r8 = 0;
                bits = 0;
            } else {
                if (hhcVar.readBit()) {
                    skipTimingInfo(hhcVar);
                    boolean bit3 = hhcVar.readBit();
                    this.f103262b = bit3;
                    if (bit3) {
                        hhcVar.skipBits(47);
                    }
                } else {
                    this.f103262b = false;
                }
                this.f103270j = hhcVar.readBit();
                int bits3 = hhcVar.readBits(5);
                int bits4 = 0;
                int i = 0;
                boolean z = false;
                bits = 0;
                while (i <= bits3) {
                    hhcVar.skipBits(12);
                    if (i == 0) {
                        bits4 = hhcVar.readBits(5);
                        bit = z;
                        if (bits4 > 7) {
                            bit = hhcVar.readBit();
                        }
                    } else {
                        bit = z;
                        if (hhcVar.readBits(5) > 7) {
                            hhcVar.skipBit();
                            bit = z;
                        }
                    }
                    if (this.f103262b) {
                        hhcVar.skipBit();
                    }
                    if (this.f103270j && hhcVar.readBit()) {
                        if (i == 0) {
                            bits = hhcVar.readBits(4);
                        } else {
                            hhcVar.skipBits(4);
                        }
                    }
                    i++;
                    z = bit;
                }
                bits2 = bits4;
                r8 = z;
            }
            int bits5 = hhcVar.readBits(4);
            int bits6 = hhcVar.readBits(4);
            hhcVar.skipBits(bits5 + 1);
            hhcVar.skipBits(bits6 + 1);
            if (this.f103261a) {
                this.f103263c = false;
            } else {
                this.f103263c = hhcVar.readBit();
            }
            if (this.f103263c) {
                hhcVar.skipBits(4);
                hhcVar.skipBits(3);
            }
            hhcVar.skipBits(3);
            if (this.f103261a) {
                this.f103265e = true;
                this.f103264d = true;
                this.f103266f = 0;
            } else {
                hhcVar.skipBits(4);
                boolean bit4 = hhcVar.readBit();
                if (bit4) {
                    hhcVar.skipBits(2);
                }
                if (hhcVar.readBit()) {
                    this.f103264d = true;
                } else {
                    this.f103264d = hhcVar.readBit();
                }
                if (!this.f103264d || hhcVar.readBit()) {
                    this.f103265e = true;
                } else {
                    this.f103265e = hhcVar.readBit();
                }
                if (bit4) {
                    this.f103266f = hhcVar.readBits(3) + 1;
                } else {
                    this.f103266f = 0;
                }
            }
            this.f103268h = bits2;
            this.f103269i = r8;
            this.f103271k = bits;
            hhcVar.skipBits(3);
            boolean bit5 = hhcVar.readBit();
            this.f103272l = bit5;
            if (this.f103267g == 2 && bit5) {
                this.f103273m = hhcVar.readBit();
            } else {
                this.f103273m = false;
            }
            if (this.f103267g != 1) {
                this.f103274n = hhcVar.readBit();
            } else {
                this.f103274n = false;
            }
            if (hhcVar.readBit()) {
                this.f103278r = (byte) hhcVar.readBits(8);
                this.f103279s = (byte) hhcVar.readBits(8);
                this.f103280t = (byte) hhcVar.readBits(8);
            } else {
                this.f103278r = (byte) 0;
                this.f103279s = (byte) 0;
                this.f103280t = (byte) 0;
            }
            if (this.f103274n) {
                hhcVar.skipBit();
                this.f103275o = false;
                this.f103276p = false;
                this.f103277q = 0;
            } else if (this.f103278r == 1 && this.f103279s == 13 && this.f103280t == 0) {
                this.f103275o = false;
                this.f103276p = false;
                this.f103277q = 0;
            } else {
                hhcVar.skipBit();
                int i2 = this.f103267g;
                if (i2 == 0) {
                    this.f103275o = true;
                    this.f103276p = true;
                } else if (i2 == 1) {
                    this.f103275o = false;
                    this.f103276p = false;
                } else if (this.f103273m) {
                    boolean bit6 = hhcVar.readBit();
                    this.f103275o = bit6;
                    if (bit6) {
                        this.f103276p = hhcVar.readBit();
                    } else {
                        this.f103276p = false;
                    }
                } else {
                    this.f103275o = true;
                    this.f103276p = false;
                }
                if (this.f103275o && this.f103276p) {
                    this.f103277q = hhcVar.readBits(2);
                } else {
                    this.f103277q = 0;
                }
            }
            hhcVar.skipBit();
        }

        @hib
        public static C15873e parse(C15872d c15872d) {
            try {
                return new C15873e(c15872d);
            } catch (C15871c unused) {
                return null;
            }
        }

        private static void skipTimingInfo(hhc hhcVar) {
            hhcVar.skipBits(64);
            if (hhcVar.readBit()) {
                yxb.skipUvlc(hhcVar);
            }
        }
    }

    private yxb() {
    }

    private static int leb128(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b = byteBuffer.get();
            i |= (b & 127) << (i2 * 7);
            if ((b & 128) == 0) {
                break;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipUvlc(hhc hhcVar) {
        int i = 0;
        while (!hhcVar.readBit()) {
            i++;
        }
        if (i < 32) {
            hhcVar.skipBits(i);
        }
    }

    public static List<C15872d> split(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b = byteBufferAsReadOnlyBuffer.get();
            int i = (b >> 3) & 15;
            if (((b >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iLeb128 = ((b >> 1) & 1) != 0 ? leb128(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iLeb128);
            arrayList.add(new C15872d(i, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iLeb128);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwWhenFeatureRequired(boolean z) throws C15871c {
        if (z) {
            throw new C15871c();
        }
    }
}
