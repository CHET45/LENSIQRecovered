package p000;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ejd {

    /* JADX INFO: renamed from: a */
    public static final String f33207a = "PsshAtomUtil";

    /* JADX INFO: renamed from: ejd$a */
    public static final class C5345a {

        /* JADX INFO: renamed from: a */
        public final UUID f33208a;

        /* JADX INFO: renamed from: b */
        public final int f33209b;

        /* JADX INFO: renamed from: c */
        public final byte[] f33210c;

        /* JADX INFO: renamed from: d */
        @hib
        public final UUID[] f33211d;

        public C5345a(UUID uuid, int i, byte[] bArr, @hib UUID[] uuidArr) {
            this.f33208a = uuid;
            this.f33209b = i;
            this.f33210c = bArr;
            this.f33211d = uuidArr;
        }
    }

    private ejd() {
    }

    public static byte[] buildPsshAtom(UUID uuid, @hib byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    @hib
    public static C5345a parsePsshAtom(byte[] bArr) {
        UUID[] uuidArr;
        jhc jhcVar = new jhc(bArr);
        if (jhcVar.limit() < 32) {
            return null;
        }
        jhcVar.setPosition(0);
        int iBytesLeft = jhcVar.bytesLeft();
        int i = jhcVar.readInt();
        if (i != iBytesLeft) {
            xh9.m25148w("PsshAtomUtil", "Advertised atom size (" + i + ") does not match buffer size: " + iBytesLeft);
            return null;
        }
        int i2 = jhcVar.readInt();
        if (i2 != 1886614376) {
            xh9.m25148w("PsshAtomUtil", "Atom type is not pssh: " + i2);
            return null;
        }
        int fullBoxVersion = rc1.parseFullBoxVersion(jhcVar.readInt());
        if (fullBoxVersion > 1) {
            xh9.m25148w("PsshAtomUtil", "Unsupported pssh version: " + fullBoxVersion);
            return null;
        }
        UUID uuid = new UUID(jhcVar.readLong(), jhcVar.readLong());
        if (fullBoxVersion == 1) {
            int unsignedIntToInt = jhcVar.readUnsignedIntToInt();
            uuidArr = new UUID[unsignedIntToInt];
            for (int i3 = 0; i3 < unsignedIntToInt; i3++) {
                uuidArr[i3] = new UUID(jhcVar.readLong(), jhcVar.readLong());
            }
        } else {
            uuidArr = null;
        }
        int unsignedIntToInt2 = jhcVar.readUnsignedIntToInt();
        int iBytesLeft2 = jhcVar.bytesLeft();
        if (unsignedIntToInt2 == iBytesLeft2) {
            byte[] bArr2 = new byte[unsignedIntToInt2];
            jhcVar.readBytes(bArr2, 0, unsignedIntToInt2);
            return new C5345a(uuid, fullBoxVersion, bArr2, uuidArr);
        }
        xh9.m25148w("PsshAtomUtil", "Atom data size (" + unsignedIntToInt2 + ") does not match the bytes left: " + iBytesLeft2);
        return null;
    }

    @hib
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        C5345a psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        if (uuid.equals(psshAtom.f33208a)) {
            return psshAtom.f33210c;
        }
        xh9.m25148w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + psshAtom.f33208a + ".");
        return null;
    }

    @hib
    public static UUID parseUuid(byte[] bArr) {
        C5345a psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        return psshAtom.f33208a;
    }

    public static int parseVersion(byte[] bArr) {
        C5345a psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return -1;
        }
        return psshAtom.f33209b;
    }

    public static byte[] buildPsshAtom(UUID uuid, @hib UUID[] uuidArr, @hib byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }
}
