package p000;

import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class nne {

    /* JADX INFO: renamed from: a */
    public static final int f65102a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f65103b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f65104c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f65105d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f65106e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f65107f = 6;

    /* JADX INFO: renamed from: g */
    public static final int f65108g = 7;

    /* JADX INFO: renamed from: h */
    public static final int f65109h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f65110i = 9;

    /* JADX INFO: renamed from: j */
    public static final int f65111j = 10;

    /* JADX INFO: renamed from: k */
    public static final int f65112k = 22;

    /* JADX INFO: renamed from: l */
    public static final int f65113l = 32;

    /* JADX INFO: renamed from: m */
    public static final int f65114m = 33;

    /* JADX INFO: renamed from: n */
    public static final int f65115n = 20;

    /* JADX INFO: renamed from: o */
    public static final int f65116o = 31;

    /* JADX INFO: renamed from: p */
    public static final int f65117p = 21;

    /* JADX INFO: renamed from: q */
    public static final int f65118q = 255;

    /* JADX INFO: renamed from: r */
    public static final UUID f65119r = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: s */
    public static final int f65120s = 2;

    /* JADX INFO: renamed from: t */
    public static final int f65121t = 4;

    /* JADX INFO: renamed from: u */
    public static final int f65122u = 16;

    @b28
    public nne() {
    }

    private byte[] extractBytes(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    private int parseServiceSolicitationUuid(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(parseUuidFrom(extractBytes(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private int parseServiceUuid(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(parseUuidFrom(extractBytes(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static ParcelUuid parseUuidFrom(byte[] bArr) {
        long j;
        if (bArr == null) {
            throw new IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
        } else {
            j = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
        }
        UUID uuid = f65119r;
        return new ParcelUuid(new UUID(uuid.getMostSignificantBits() + (j << 32), uuid.getLeastSignificantBits()));
    }

    public List<UUID> extractUUIDs(byte[] bArr) {
        List<ParcelUuid> serviceUuids = parseFromBytes(bArr).getServiceUuids();
        if (serviceUuids == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ParcelUuid> it = serviceUuids.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUuid());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    @p000.p7e({p000.p7e.EnumC10826a.f69935b})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.jne parseFromBytes(byte[] r18) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nne.parseFromBytes(byte[]):jne");
    }
}
