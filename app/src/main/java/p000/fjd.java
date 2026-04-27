package p000;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class fjd {

    /* JADX INFO: renamed from: a */
    public static final String f36867a = "PsshAtomUtil";

    /* JADX INFO: renamed from: fjd$a */
    public static class C5855a {

        /* JADX INFO: renamed from: a */
        public final UUID f36868a;

        /* JADX INFO: renamed from: b */
        public final int f36869b;

        /* JADX INFO: renamed from: c */
        public final byte[] f36870c;

        public C5855a(UUID uuid, int i, byte[] bArr) {
            this.f36868a = uuid;
            this.f36869b = i;
            this.f36870c = bArr;
        }
    }

    private fjd() {
    }

    public static byte[] buildPsshAtom(UUID uuid, @hib byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    @hib
    private static C5855a parsePsshAtom(byte[] bArr) {
        ihc ihcVar = new ihc(bArr);
        if (ihcVar.limit() < 32) {
            return null;
        }
        ihcVar.setPosition(0);
        if (ihcVar.readInt() != ihcVar.bytesLeft() + 4 || ihcVar.readInt() != 1886614376) {
            return null;
        }
        int fullAtomVersion = ib0.parseFullAtomVersion(ihcVar.readInt());
        if (fullAtomVersion > 1) {
            yh9.m25919w("PsshAtomUtil", "Unsupported pssh version: " + fullAtomVersion);
            return null;
        }
        UUID uuid = new UUID(ihcVar.readLong(), ihcVar.readLong());
        if (fullAtomVersion == 1) {
            ihcVar.skipBytes(ihcVar.readUnsignedIntToInt() * 16);
        }
        int unsignedIntToInt = ihcVar.readUnsignedIntToInt();
        if (unsignedIntToInt != ihcVar.bytesLeft()) {
            return null;
        }
        byte[] bArr2 = new byte[unsignedIntToInt];
        ihcVar.readBytes(bArr2, 0, unsignedIntToInt);
        return new C5855a(uuid, fullAtomVersion, bArr2);
    }

    @hib
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        C5855a psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        if (uuid.equals(psshAtom.f36868a)) {
            return psshAtom.f36870c;
        }
        yh9.m25919w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + psshAtom.f36868a + ".");
        return null;
    }

    @hib
    public static UUID parseUuid(byte[] bArr) {
        C5855a psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        return psshAtom.f36868a;
    }

    public static int parseVersion(byte[] bArr) {
        C5855a psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return -1;
        }
        return psshAtom.f36869b;
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
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }
}
