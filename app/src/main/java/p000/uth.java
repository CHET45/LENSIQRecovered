package p000;

import java.io.IOException;
import java.util.Arrays;
import p000.qsi;

/* JADX INFO: loaded from: classes3.dex */
public final class uth {

    /* JADX INFO: renamed from: f */
    public static final int f89139f = 8;

    /* JADX INFO: renamed from: g */
    public static final uth f89140g = new uth(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f89141a;

    /* JADX INFO: renamed from: b */
    public int[] f89142b;

    /* JADX INFO: renamed from: c */
    public Object[] f89143c;

    /* JADX INFO: renamed from: d */
    public int f89144d;

    /* JADX INFO: renamed from: e */
    public boolean f89145e;

    private uth() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int minCapacity) {
        int[] iArr = this.f89142b;
        if (minCapacity > iArr.length) {
            int i = this.f89141a;
            int i2 = i + (i / 2);
            if (i2 >= minCapacity) {
                minCapacity = i2;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.f89142b = Arrays.copyOf(iArr, minCapacity);
            this.f89143c = Arrays.copyOf(this.f89143c, minCapacity);
        }
    }

    /* JADX INFO: renamed from: f */
    public static uth m23569f(uth first, uth second) {
        int i = first.f89141a + second.f89141a;
        int[] iArrCopyOf = Arrays.copyOf(first.f89142b, i);
        System.arraycopy(second.f89142b, 0, iArrCopyOf, first.f89141a, second.f89141a);
        Object[] objArrCopyOf = Arrays.copyOf(first.f89143c, i);
        System.arraycopy(second.f89143c, 0, objArrCopyOf, first.f89141a, second.f89141a);
        return new uth(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: g */
    public static uth m23570g() {
        return new uth();
    }

    public static uth getDefaultInstance() {
        return f89140g;
    }

    private static int hashCode(int[] tags, int count) {
        int i = 17;
        for (int i2 = 0; i2 < count; i2++) {
            i = (i * 31) + tags[i2];
        }
        return i;
    }

    private uth mergeFrom(final e72 input) throws IOException {
        int tag;
        do {
            tag = input.readTag();
            if (tag == 0) {
                break;
            }
        } while (m23572b(tag, input));
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

    private static void writeField(int tag, Object object, qsi writer) throws IOException {
        int tagFieldNumber = gpi.getTagFieldNumber(tag);
        int tagWireType = gpi.getTagWireType(tag);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (wj1) object);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(be8.m3078e());
            }
            writer.writeFixed32(tagFieldNumber, ((Integer) object).intValue());
        } else if (writer.fieldOrder() == qsi.EnumC11672a.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((uth) object).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((uth) object).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23571a() {
        if (!this.f89145e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m23572b(final int tag, final e72 input) throws IOException {
        m23571a();
        int tagFieldNumber = gpi.getTagFieldNumber(tag);
        int tagWireType = gpi.getTagWireType(tag);
        if (tagWireType == 0) {
            m23577i(tag, Long.valueOf(input.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            m23577i(tag, Long.valueOf(input.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            m23577i(tag, input.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            uth uthVar = new uth();
            uthVar.mergeFrom(input);
            input.checkLastTagWas(gpi.m11819a(tagFieldNumber, 4));
            m23577i(tag, uthVar);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw be8.m3078e();
        }
        m23577i(tag, Integer.valueOf(input.readFixed32()));
        return true;
    }

    @qp1
    /* JADX INFO: renamed from: c */
    public uth m23573c(uth other) {
        if (other.equals(getDefaultInstance())) {
            return this;
        }
        m23571a();
        int i = this.f89141a + other.f89141a;
        ensureCapacity(i);
        System.arraycopy(other.f89142b, 0, this.f89142b, this.f89141a, other.f89141a);
        System.arraycopy(other.f89143c, 0, this.f89143c, this.f89141a, other.f89141a);
        this.f89141a = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public uth m23574d(final int fieldNumber, final wj1 value) {
        m23571a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m23577i(gpi.m11819a(fieldNumber, 2), value);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public uth m23575e(int fieldNumber, int value) {
        m23571a();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m23577i(gpi.m11819a(fieldNumber, 0), Long.valueOf(value));
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uth)) {
            return false;
        }
        uth uthVar = (uth) obj;
        int i = this.f89141a;
        return i == uthVar.f89141a && tagsEquals(this.f89142b, uthVar.f89142b, i) && objectsEquals(this.f89143c, uthVar.f89143c, this.f89141a);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i = this.f89144d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f89141a; i3++) {
            int i4 = this.f89142b[i3];
            int tagFieldNumber = gpi.getTagFieldNumber(i4);
            int tagWireType = gpi.getTagWireType(i4);
            if (tagWireType == 0) {
                iComputeUInt64Size = i72.computeUInt64Size(tagFieldNumber, ((Long) this.f89143c[i3]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = i72.computeFixed64Size(tagFieldNumber, ((Long) this.f89143c[i3]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = i72.computeBytesSize(tagFieldNumber, (wj1) this.f89143c[i3]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (i72.computeTagSize(tagFieldNumber) * 2) + ((uth) this.f89143c[i3]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(be8.m3078e());
                }
                iComputeUInt64Size = i72.computeFixed32Size(tagFieldNumber, ((Integer) this.f89143c[i3]).intValue());
            }
            i2 += iComputeUInt64Size;
        }
        this.f89144d = i2;
        return i2;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.f89144d;
        if (i != -1) {
            return i;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i2 = 0; i2 < this.f89141a; i2++) {
            iComputeRawMessageSetExtensionSize += i72.computeRawMessageSetExtensionSize(gpi.getTagFieldNumber(this.f89142b[i2]), (wj1) this.f89143c[i2]);
        }
        this.f89144d = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    /* JADX INFO: renamed from: h */
    public final void m23576h(StringBuilder buffer, int indent) {
        for (int i = 0; i < this.f89141a; i++) {
            usa.m23565a(buffer, indent, String.valueOf(gpi.getTagFieldNumber(this.f89142b[i])), this.f89143c[i]);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m23577i(int tag, Object value) {
        m23571a();
        ensureCapacity(this.f89141a + 1);
        int[] iArr = this.f89142b;
        int i = this.f89141a;
        iArr[i] = tag;
        this.f89143c[i] = value;
        this.f89141a = i + 1;
    }

    /* JADX INFO: renamed from: j */
    public void m23578j(qsi writer) throws IOException {
        if (writer.fieldOrder() == qsi.EnumC11672a.DESCENDING) {
            for (int i = this.f89141a - 1; i >= 0; i--) {
                writer.writeMessageSetItem(gpi.getTagFieldNumber(this.f89142b[i]), this.f89143c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f89141a; i2++) {
            writer.writeMessageSetItem(gpi.getTagFieldNumber(this.f89142b[i2]), this.f89143c[i2]);
        }
    }

    public void makeImmutable() {
        if (this.f89145e) {
            this.f89145e = false;
        }
    }

    public void writeAsMessageSetTo(i72 output) throws IOException {
        for (int i = 0; i < this.f89141a; i++) {
            output.writeRawMessageSetExtension(gpi.getTagFieldNumber(this.f89142b[i]), (wj1) this.f89143c[i]);
        }
    }

    public void writeTo(i72 output) throws IOException {
        for (int i = 0; i < this.f89141a; i++) {
            int i2 = this.f89142b[i];
            int tagFieldNumber = gpi.getTagFieldNumber(i2);
            int tagWireType = gpi.getTagWireType(i2);
            if (tagWireType == 0) {
                output.writeUInt64(tagFieldNumber, ((Long) this.f89143c[i]).longValue());
            } else if (tagWireType == 1) {
                output.writeFixed64(tagFieldNumber, ((Long) this.f89143c[i]).longValue());
            } else if (tagWireType == 2) {
                output.writeBytes(tagFieldNumber, (wj1) this.f89143c[i]);
            } else if (tagWireType == 3) {
                output.writeTag(tagFieldNumber, 3);
                ((uth) this.f89143c[i]).writeTo(output);
                output.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw be8.m3078e();
                }
                output.writeFixed32(tagFieldNumber, ((Integer) this.f89143c[i]).intValue());
            }
        }
    }

    private uth(int count, int[] tags, Object[] objects, boolean isMutable) {
        this.f89144d = -1;
        this.f89141a = count;
        this.f89142b = tags;
        this.f89143c = objects;
        this.f89145e = isMutable;
    }

    private static int hashCode(Object[] objects, int count) {
        int iHashCode = 17;
        for (int i = 0; i < count; i++) {
            iHashCode = (iHashCode * 31) + objects[i].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i = this.f89141a;
        return ((((527 + i) * 31) + hashCode(this.f89142b, i)) * 31) + hashCode(this.f89143c, this.f89141a);
    }

    public void writeTo(qsi writer) throws IOException {
        if (this.f89141a == 0) {
            return;
        }
        if (writer.fieldOrder() == qsi.EnumC11672a.ASCENDING) {
            for (int i = 0; i < this.f89141a; i++) {
                writeField(this.f89142b[i], this.f89143c[i], writer);
            }
            return;
        }
        for (int i2 = this.f89141a - 1; i2 >= 0; i2--) {
            writeField(this.f89142b[i2], this.f89143c[i2], writer);
        }
    }
}
