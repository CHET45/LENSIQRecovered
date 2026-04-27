package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u3h {

    /* JADX INFO: renamed from: a */
    @efb
    public final byte[] f86739a;

    /* JADX INFO: renamed from: b */
    @hib
    public String f86740b;

    /* JADX INFO: renamed from: c */
    @hib
    public List<byte[]> f86741c;

    private u3h(@efb byte[] bArr) {
        this.f86739a = bArr;
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static u3h m23091b(String str, List<byte[]> list) throws IOException {
        return new u3h(createToken(str, list), str, list);
    }

    @efb
    /* JADX INFO: renamed from: c */
    public static u3h m23092c(@efb byte[] bArr) {
        return new u3h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    @efb
    private static byte[] createToken(@efb String str, @efb List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: t3h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return u3h.compareByteArrays((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private void parseIfNeeded() throws IOException {
        if (this.f86740b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f86739a));
        this.f86740b = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        this.f86741c = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInputStream.readInt();
            byte[] bArr = new byte[i3];
            if (dataInputStream.read(bArr) != i3) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.f86741c.add(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u3h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f86739a, ((u3h) obj).f86739a);
    }

    @efb
    public byte[] getFingerprint(int i) throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.f86741c;
        if (list != null) {
            return Arrays.copyOf(list.get(i), this.f86741c.get(i).length);
        }
        throw new IllegalStateException();
    }

    public int getFingerprintCount() throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.f86741c;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @efb
    public String getPackageName() throws IOException {
        parseIfNeeded();
        String str = this.f86740b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f86739a);
    }

    @efb
    public byte[] serialize() {
        byte[] bArr = this.f86739a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private u3h(@efb byte[] bArr, @efb String str, @efb List<byte[]> list) {
        this.f86739a = bArr;
        this.f86740b = str;
        this.f86741c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.f86741c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
