package p000;

import java.io.IOException;
import java.util.Arrays;
import p000.rsi;

/* JADX INFO: loaded from: classes4.dex */
public final class tth {

    /* JADX INFO: renamed from: f */
    public static final int f85918f = 8;

    /* JADX INFO: renamed from: g */
    public static final tth f85919g = new tth(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f85920a;

    /* JADX INFO: renamed from: b */
    public int[] f85921b;

    /* JADX INFO: renamed from: c */
    public Object[] f85922c;

    /* JADX INFO: renamed from: d */
    public int f85923d;

    /* JADX INFO: renamed from: e */
    public boolean f85924e;

    private tth() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int minCapacity) {
        int[] iArr = this.f85921b;
        if (minCapacity > iArr.length) {
            int i = this.f85920a;
            int i2 = i + (i / 2);
            if (i2 >= minCapacity) {
                minCapacity = i2;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.f85921b = Arrays.copyOf(iArr, minCapacity);
            this.f85922c = Arrays.copyOf(this.f85922c, minCapacity);
        }
    }

    /* JADX INFO: renamed from: f */
    public static tth m22835f(tth first, tth second) {
        int i = first.f85920a + second.f85920a;
        int[] iArrCopyOf = Arrays.copyOf(first.f85921b, i);
        System.arraycopy(second.f85921b, 0, iArrCopyOf, first.f85920a, second.f85920a);
        Object[] objArrCopyOf = Arrays.copyOf(first.f85922c, i);
        System.arraycopy(second.f85922c, 0, objArrCopyOf, first.f85920a, second.f85920a);
        return new tth(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: g */
    public static tth m22836g() {
        return new tth();
    }

    public static tth getDefaultInstance() {
        return f85919g;
    }

    private static int hashCode(int[] tags, int count) {
        int i = 17;
        for (int i2 = 0; i2 < count; i2++) {
            i = (i * 31) + tags[i2];
        }
        return i;
    }

    private tth mergeFrom(final f72 input) throws IOException {
        int tag;
        do {
            tag = input.readTag();
            if (tag == 0) {
                break;
            }
        } while (m22838b(tag, input));
        return this;
    }

    private static boolean objectsEquals(Object[] objects1, Object[] objects2, int count) {
        for (int i = 0; i < count; i++) {
            if (!objects1[i].equals(objects2[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] tags1, int[] tags2, int count) {
        for (int i = 0; i < count; i++) {
            if (tags1[i] != tags2[i]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int tag, Object object, rsi writer) throws IOException {
        int tagFieldNumber = hpi.getTagFieldNumber(tag);
        int tagWireType = hpi.getTagWireType(tag);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (vj1) object);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(ce8.m3922e());
            }
            writer.writeFixed32(tagFieldNumber, ((Integer) object).intValue());
        } else if (writer.fieldOrder() == rsi.EnumC12268a.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((tth) object).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((tth) object).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m22837a() {
        if (!this.f85924e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m22838b(final int tag, final f72 input) throws IOException {
        m22837a();
        int tagFieldNumber = hpi.getTagFieldNumber(tag);
        int tagWireType = hpi.getTagWireType(tag);
        if (tagWireType == 0) {
            m22843i(tag, Long.valueOf(input.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            m22843i(tag, Long.valueOf(input.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            m22843i(tag, input.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            tth tthVar = new tth();
            tthVar.mergeFrom(input);
            input.checkLastTagWas(hpi.m12536a(tagFieldNumber, 4));
            m22843i(tag, tthVar);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw ce8.m3922e();
        }
        m22843i(tag, Integer.valueOf(input.readFixed32()));
        return true;
    }

    @pp1
    /* JADX INFO: renamed from: c */
    public tth m22839c(tth other) {
        if (other.equals(getDefaultInstance())) {
            return this;
        }
        m22837a();
        int i = this.f85920a + other.f85920a;
        ensureCapacity(i);
        System.arraycopy(other.f85921b, 0, this.f85921b, this.f85920a, other.f85920a);
        System.arraycopy(other.f85922c, 0, this.f85922c, this.f85920a, other.f85920a);
        this.f85920a = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public tth m22840d(final int fieldNumber, final vj1 value) {
        m22837a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m22843i(hpi.m12536a(fieldNumber, 2), value);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public tth m22841e(int fieldNumber, int value) {
        m22837a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m22843i(hpi.m12536a(fieldNumber, 0), Long.valueOf(value));
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tth)) {
            return false;
        }
        tth tthVar = (tth) obj;
        int i = this.f85920a;
        return i == tthVar.f85920a && tagsEquals(this.f85921b, tthVar.f85921b, i) && objectsEquals(this.f85922c, tthVar.f85922c, this.f85920a);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i = this.f85923d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f85920a; i3++) {
            int i4 = this.f85921b[i3];
            int tagFieldNumber = hpi.getTagFieldNumber(i4);
            int tagWireType = hpi.getTagWireType(i4);
            if (tagWireType == 0) {
                iComputeUInt64Size = j72.computeUInt64Size(tagFieldNumber, ((Long) this.f85922c[i3]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = j72.computeFixed64Size(tagFieldNumber, ((Long) this.f85922c[i3]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = j72.computeBytesSize(tagFieldNumber, (vj1) this.f85922c[i3]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (j72.computeTagSize(tagFieldNumber) * 2) + ((tth) this.f85922c[i3]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(ce8.m3922e());
                }
                iComputeUInt64Size = j72.computeFixed32Size(tagFieldNumber, ((Integer) this.f85922c[i3]).intValue());
            }
            i2 += iComputeUInt64Size;
        }
        this.f85923d = i2;
        return i2;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.f85923d;
        if (i != -1) {
            return i;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i2 = 0; i2 < this.f85920a; i2++) {
            iComputeRawMessageSetExtensionSize += j72.computeRawMessageSetExtensionSize(hpi.getTagFieldNumber(this.f85921b[i2]), (vj1) this.f85922c[i2]);
        }
        this.f85923d = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    /* JADX INFO: renamed from: h */
    public final void m22842h(StringBuilder buffer, int indent) {
        for (int i = 0; i < this.f85920a; i++) {
            tsa.m22764a(buffer, indent, String.valueOf(hpi.getTagFieldNumber(this.f85921b[i])), this.f85922c[i]);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m22843i(int tag, Object value) {
        m22837a();
        ensureCapacity(this.f85920a + 1);
        int[] iArr = this.f85921b;
        int i = this.f85920a;
        iArr[i] = tag;
        this.f85922c[i] = value;
        this.f85920a = i + 1;
    }

    /* JADX INFO: renamed from: j */
    public void m22844j(rsi writer) throws IOException {
        if (writer.fieldOrder() == rsi.EnumC12268a.DESCENDING) {
            for (int i = this.f85920a - 1; i >= 0; i--) {
                writer.writeMessageSetItem(hpi.getTagFieldNumber(this.f85921b[i]), this.f85922c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f85920a; i2++) {
            writer.writeMessageSetItem(hpi.getTagFieldNumber(this.f85921b[i2]), this.f85922c[i2]);
        }
    }

    public void makeImmutable() {
        if (this.f85924e) {
            this.f85924e = false;
        }
    }

    public void writeAsMessageSetTo(j72 output) throws IOException {
        for (int i = 0; i < this.f85920a; i++) {
            output.writeRawMessageSetExtension(hpi.getTagFieldNumber(this.f85921b[i]), (vj1) this.f85922c[i]);
        }
    }

    public void writeTo(j72 output) throws IOException {
        for (int i = 0; i < this.f85920a; i++) {
            int i2 = this.f85921b[i];
            int tagFieldNumber = hpi.getTagFieldNumber(i2);
            int tagWireType = hpi.getTagWireType(i2);
            if (tagWireType == 0) {
                output.writeUInt64(tagFieldNumber, ((Long) this.f85922c[i]).longValue());
            } else if (tagWireType == 1) {
                output.writeFixed64(tagFieldNumber, ((Long) this.f85922c[i]).longValue());
            } else if (tagWireType == 2) {
                output.writeBytes(tagFieldNumber, (vj1) this.f85922c[i]);
            } else if (tagWireType == 3) {
                output.writeTag(tagFieldNumber, 3);
                ((tth) this.f85922c[i]).writeTo(output);
                output.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw ce8.m3922e();
                }
                output.writeFixed32(tagFieldNumber, ((Integer) this.f85922c[i]).intValue());
            }
        }
    }

    private tth(int count, int[] tags, Object[] objects, boolean isMutable) {
        this.f85923d = -1;
        this.f85920a = count;
        this.f85921b = tags;
        this.f85922c = objects;
        this.f85924e = isMutable;
    }

    private static int hashCode(Object[] objects, int count) {
        int iHashCode = 17;
        for (int i = 0; i < count; i++) {
            iHashCode = (iHashCode * 31) + objects[i].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i = this.f85920a;
        return ((((527 + i) * 31) + hashCode(this.f85921b, i)) * 31) + hashCode(this.f85922c, this.f85920a);
    }

    public void writeTo(rsi writer) throws IOException {
        if (this.f85920a == 0) {
            return;
        }
        if (writer.fieldOrder() == rsi.EnumC12268a.ASCENDING) {
            for (int i = 0; i < this.f85920a; i++) {
                writeField(this.f85921b[i], this.f85922c[i], writer);
            }
            return;
        }
        for (int i2 = this.f85920a - 1; i2 >= 0; i2--) {
            writeField(this.f85921b[i2], this.f85922c[i2], writer);
        }
    }
}
