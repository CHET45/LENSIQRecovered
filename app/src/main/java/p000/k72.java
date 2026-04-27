package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.gpi;
import p000.ns9;
import p000.qsi;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class k72 implements qsi {

    /* JADX INFO: renamed from: a */
    public final i72 f52716a;

    /* JADX INFO: renamed from: k72$a */
    public static /* synthetic */ class C8221a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52717a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f52717a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40750H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40749F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40766m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40759Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40756V1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40757X.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40748C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40764e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40753M1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40760Z1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40765f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f52717a[gpi.EnumC6460b.f40751L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private k72(i72 output) {
        i72 i72Var = (i72) v98.m23882b(output, "output");
        this.f52716a = i72Var;
        i72Var.f45870a = this;
    }

    public static k72 forCodedOutput(i72 output) {
        k72 k72Var = output.f45870a;
        return k72Var != null ? k72Var : new k72(output);
    }

    private void writeBoolListInternal(int fieldNumber, sa1 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeBool(fieldNumber, value.getBoolean(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeBoolSizeNoTag += i72.computeBoolSizeNoTag(value.getBoolean(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeBoolNoTag(value.getBoolean(i));
            i++;
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int fieldNumber, boolean key, V value, ns9.C10042b<Boolean, V> metadata) throws IOException {
        this.f52716a.writeTag(fieldNumber, 2);
        this.f52716a.writeUInt32NoTag(ns9.m18107a(metadata, Boolean.valueOf(key), value));
        ns9.m18110e(this.f52716a, metadata, Boolean.valueOf(key), value);
    }

    private <V> void writeDeterministicIntegerMap(int fieldNumber, ns9.C10042b<Integer, V> metadata, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        Arrays.sort(iArr);
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iArr[i2];
            V v = map.get(Integer.valueOf(i3));
            this.f52716a.writeTag(fieldNumber, 2);
            this.f52716a.writeUInt32NoTag(ns9.m18107a(metadata, Integer.valueOf(i3), v));
            ns9.m18110e(this.f52716a, metadata, Integer.valueOf(i3), v);
        }
    }

    private <V> void writeDeterministicLongMap(int fieldNumber, ns9.C10042b<Long, V> metadata, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        Arrays.sort(jArr);
        for (int i2 = 0; i2 < size; i2++) {
            long j = jArr[i2];
            V v = map.get(Long.valueOf(j));
            this.f52716a.writeTag(fieldNumber, 2);
            this.f52716a.writeUInt32NoTag(ns9.m18107a(metadata, Long.valueOf(j), v));
            ns9.m18110e(this.f52716a, metadata, Long.valueOf(j), v);
        }
    }

    private <K, V> void writeDeterministicMap(int fieldNumber, ns9.C10042b<K, V> metadata, Map<K, V> map) throws IOException {
        switch (C8221a.f52717a[metadata.f65506a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, false, v, metadata);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, true, v2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(fieldNumber, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(fieldNumber, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(fieldNumber, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.f65506a);
        }
    }

    private <V> void writeDeterministicStringMap(int fieldNumber, ns9.C10042b<String, V> metadata, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next();
            i++;
        }
        Arrays.sort(strArr);
        for (int i2 = 0; i2 < size; i2++) {
            String str = strArr[i2];
            V v = map.get(str);
            this.f52716a.writeTag(fieldNumber, 2);
            this.f52716a.writeUInt32NoTag(ns9.m18107a(metadata, str, v));
            ns9.m18110e(this.f52716a, metadata, str, v);
        }
    }

    private void writeDoubleListInternal(int fieldNumber, vj4 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeDouble(fieldNumber, value.getDouble(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeDoubleSizeNoTag += i72.computeDoubleSizeNoTag(value.getDouble(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeDoubleNoTag(value.getDouble(i));
            i++;
        }
    }

    private void writeEnumListInternal(int fieldNumber, c68 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeEnum(fieldNumber, value.getInt(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeEnumSizeNoTag += i72.computeEnumSizeNoTag(value.getInt(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeEnumNoTag(value.getInt(i));
            i++;
        }
    }

    private void writeFixed32ListInternal(int fieldNumber, c68 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeFixed32(fieldNumber, value.getInt(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeFixed32SizeNoTag += i72.computeFixed32SizeNoTag(value.getInt(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeFixed32NoTag(value.getInt(i));
            i++;
        }
    }

    private void writeFixed64ListInternal(int fieldNumber, sk9 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeFixed64(fieldNumber, value.getLong(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeFixed64SizeNoTag += i72.computeFixed64SizeNoTag(value.getLong(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeFixed64NoTag(value.getLong(i));
            i++;
        }
    }

    private void writeFloatListInternal(int fieldNumber, b46 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeFloat(fieldNumber, value.getFloat(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeFloatSizeNoTag += i72.computeFloatSizeNoTag(value.getFloat(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeFloatNoTag(value.getFloat(i));
            i++;
        }
    }

    private void writeInt32ListInternal(int fieldNumber, c68 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeInt32(fieldNumber, value.getInt(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeInt32SizeNoTag += i72.computeInt32SizeNoTag(value.getInt(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeInt32NoTag(value.getInt(i));
            i++;
        }
    }

    private void writeInt64ListInternal(int fieldNumber, sk9 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeInt64(fieldNumber, value.getLong(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeInt64SizeNoTag += i72.computeInt64SizeNoTag(value.getLong(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeInt64NoTag(value.getLong(i));
            i++;
        }
    }

    private void writeLazyString(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            this.f52716a.writeString(fieldNumber, (String) value);
        } else {
            this.f52716a.writeBytes(fieldNumber, (wj1) value);
        }
    }

    private void writeSFixed32ListInternal(int fieldNumber, c68 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeSFixed32(fieldNumber, value.getInt(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSFixed32SizeNoTag += i72.computeSFixed32SizeNoTag(value.getInt(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeSFixed32NoTag(value.getInt(i));
            i++;
        }
    }

    private void writeSFixed64ListInternal(int fieldNumber, sk9 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeSFixed64(fieldNumber, value.getLong(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSFixed64SizeNoTag += i72.computeSFixed64SizeNoTag(value.getLong(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeSFixed64NoTag(value.getLong(i));
            i++;
        }
    }

    private void writeSInt32ListInternal(int fieldNumber, c68 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeSInt32(fieldNumber, value.getInt(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSInt32SizeNoTag += i72.computeSInt32SizeNoTag(value.getInt(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeSInt32NoTag(value.getInt(i));
            i++;
        }
    }

    private void writeSInt64ListInternal(int fieldNumber, sk9 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeSInt64(fieldNumber, value.getLong(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSInt64SizeNoTag += i72.computeSInt64SizeNoTag(value.getLong(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeSInt64NoTag(value.getLong(i));
            i++;
        }
    }

    private void writeUInt32ListInternal(int fieldNumber, c68 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeUInt32(fieldNumber, value.getInt(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeUInt32SizeNoTag += i72.computeUInt32SizeNoTag(value.getInt(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeUInt32NoTag(value.getInt(i));
            i++;
        }
    }

    private void writeUInt64ListInternal(int fieldNumber, sk9 value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f52716a.writeUInt64(fieldNumber, value.getLong(i));
                i++;
            }
            return;
        }
        this.f52716a.writeTag(fieldNumber, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeUInt64SizeNoTag += i72.computeUInt64SizeNoTag(value.getLong(i2));
        }
        this.f52716a.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i < value.size()) {
            this.f52716a.writeUInt64NoTag(value.getLong(i));
            i++;
        }
    }

    @Override // p000.qsi
    public qsi.EnumC11672a fieldOrder() {
        return qsi.EnumC11672a.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.f52716a.getTotalBytesWritten();
    }

    @Override // p000.qsi
    public void writeBool(int fieldNumber, boolean value) throws IOException {
        this.f52716a.writeBool(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeBoolList(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        if (value instanceof sa1) {
            writeBoolListInternal(fieldNumber, (sa1) value, packed);
        } else {
            writeBoolListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeBytes(int fieldNumber, wj1 value) throws IOException {
        this.f52716a.writeBytes(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeBytesList(int fieldNumber, List<wj1> value) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            this.f52716a.writeBytes(fieldNumber, value.get(i));
        }
    }

    @Override // p000.qsi
    public void writeDouble(int fieldNumber, double value) throws IOException {
        this.f52716a.writeDouble(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeDoubleList(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        if (value instanceof vj4) {
            writeDoubleListInternal(fieldNumber, (vj4) value, packed);
        } else {
            writeDoubleListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    @Deprecated
    public void writeEndGroup(int fieldNumber) throws IOException {
        this.f52716a.writeTag(fieldNumber, 4);
    }

    @Override // p000.qsi
    public void writeEnum(int fieldNumber, int value) throws IOException {
        this.f52716a.writeEnum(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeEnumList(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof c68) {
            writeEnumListInternal(fieldNumber, (c68) value, packed);
        } else {
            writeEnumListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeFixed32(int fieldNumber, int value) throws IOException {
        this.f52716a.writeFixed32(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof c68) {
            writeFixed32ListInternal(fieldNumber, (c68) value, packed);
        } else {
            writeFixed32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeFixed64(int fieldNumber, long value) throws IOException {
        this.f52716a.writeFixed64(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof sk9) {
            writeFixed64ListInternal(fieldNumber, (sk9) value, packed);
        } else {
            writeFixed64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeFloat(int fieldNumber, float value) throws IOException {
        this.f52716a.writeFloat(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeFloatList(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        if (value instanceof b46) {
            writeFloatListInternal(fieldNumber, (b46) value, packed);
        } else {
            writeFloatListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    @Deprecated
    public void writeGroup(int fieldNumber, Object value) throws IOException {
        this.f52716a.writeGroup(fieldNumber, (psa) value);
    }

    @Override // p000.qsi
    @Deprecated
    public void writeGroupList(int fieldNumber, List<?> value) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i));
        }
    }

    @Override // p000.qsi
    public void writeInt32(int fieldNumber, int value) throws IOException {
        this.f52716a.writeInt32(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof c68) {
            writeInt32ListInternal(fieldNumber, (c68) value, packed);
        } else {
            writeInt32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeInt64(int fieldNumber, long value) throws IOException {
        this.f52716a.writeInt64(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof sk9) {
            writeInt64ListInternal(fieldNumber, (sk9) value, packed);
        } else {
            writeInt64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public <K, V> void writeMap(int fieldNumber, ns9.C10042b<K, V> metadata, Map<K, V> map) throws IOException {
        if (this.f52716a.m12834i()) {
            writeDeterministicMap(fieldNumber, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f52716a.writeTag(fieldNumber, 2);
            this.f52716a.writeUInt32NoTag(ns9.m18107a(metadata, entry.getKey(), entry.getValue()));
            ns9.m18110e(this.f52716a, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.qsi
    public void writeMessage(int fieldNumber, Object value) throws IOException {
        this.f52716a.writeMessage(fieldNumber, (psa) value);
    }

    @Override // p000.qsi
    public void writeMessageList(int fieldNumber, List<?> value) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i));
        }
    }

    @Override // p000.qsi
    public final void writeMessageSetItem(int fieldNumber, Object value) throws IOException {
        if (value instanceof wj1) {
            this.f52716a.writeRawMessageSetExtension(fieldNumber, (wj1) value);
        } else {
            this.f52716a.writeMessageSetExtension(fieldNumber, (psa) value);
        }
    }

    @Override // p000.qsi
    public void writeSFixed32(int fieldNumber, int value) throws IOException {
        this.f52716a.writeSFixed32(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeSFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof c68) {
            writeSFixed32ListInternal(fieldNumber, (c68) value, packed);
        } else {
            writeSFixed32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeSFixed64(int fieldNumber, long value) throws IOException {
        this.f52716a.writeSFixed64(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeSFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof sk9) {
            writeSFixed64ListInternal(fieldNumber, (sk9) value, packed);
        } else {
            writeSFixed64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeSInt32(int fieldNumber, int value) throws IOException {
        this.f52716a.writeSInt32(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeSInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof c68) {
            writeSInt32ListInternal(fieldNumber, (c68) value, packed);
        } else {
            writeSInt32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeSInt64(int fieldNumber, long value) throws IOException {
        this.f52716a.writeSInt64(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeSInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof sk9) {
            writeSInt64ListInternal(fieldNumber, (sk9) value, packed);
        } else {
            writeSInt64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    @Deprecated
    public void writeStartGroup(int fieldNumber) throws IOException {
        this.f52716a.writeTag(fieldNumber, 3);
    }

    @Override // p000.qsi
    public void writeString(int fieldNumber, String value) throws IOException {
        this.f52716a.writeString(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeStringList(int fieldNumber, List<String> value) throws IOException {
        int i = 0;
        if (!(value instanceof f39)) {
            while (i < value.size()) {
                this.f52716a.writeString(fieldNumber, value.get(i));
                i++;
            }
        } else {
            f39 f39Var = (f39) value;
            while (i < value.size()) {
                writeLazyString(fieldNumber, f39Var.getRaw(i));
                i++;
            }
        }
    }

    @Override // p000.qsi
    public void writeUInt32(int fieldNumber, int value) throws IOException {
        this.f52716a.writeUInt32(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeUInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof c68) {
            writeUInt32ListInternal(fieldNumber, (c68) value, packed);
        } else {
            writeUInt32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeUInt64(int fieldNumber, long value) throws IOException {
        this.f52716a.writeUInt64(fieldNumber, value);
    }

    @Override // p000.qsi
    public void writeUInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof sk9) {
            writeUInt64ListInternal(fieldNumber, (sk9) value, packed);
        } else {
            writeUInt64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // p000.qsi
    public void writeGroup(int fieldNumber, Object value, upe schema) throws IOException {
        this.f52716a.m12835m(fieldNumber, (psa) value, schema);
    }

    @Override // p000.qsi
    public void writeMessage(int fieldNumber, Object value, upe schema) throws IOException {
        this.f52716a.mo12837o(fieldNumber, (psa) value, schema);
    }

    @Override // p000.qsi
    public void writeGroupList(int fieldNumber, List<?> value, upe schema) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i), schema);
        }
    }

    @Override // p000.qsi
    public void writeMessageList(int fieldNumber, List<?> value, upe schema) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i), schema);
        }
    }

    private void writeBoolListInternal(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeBoolSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeBoolSizeNoTag += i72.computeBoolSizeNoTag(value.get(i2).booleanValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeBoolSizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeBoolNoTag(value.get(i).booleanValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeBool(fieldNumber, value.get(i).booleanValue());
            i++;
        }
    }

    private void writeDoubleListInternal(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeDoubleSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeDoubleSizeNoTag += i72.computeDoubleSizeNoTag(value.get(i2).doubleValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeDoubleSizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeDoubleNoTag(value.get(i).doubleValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeDouble(fieldNumber, value.get(i).doubleValue());
            i++;
        }
    }

    private void writeEnumListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeEnumSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeEnumSizeNoTag += i72.computeEnumSizeNoTag(value.get(i2).intValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeEnumSizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeEnumNoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeEnum(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    private void writeFixed32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeFixed32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFixed32SizeNoTag += i72.computeFixed32SizeNoTag(value.get(i2).intValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeFixed32SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeFixed32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeFixed32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    private void writeFixed64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeFixed64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFixed64SizeNoTag += i72.computeFixed64SizeNoTag(value.get(i2).longValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeFixed64SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeFixed64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeFixed64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    private void writeFloatListInternal(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeFloatSizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeFloatSizeNoTag += i72.computeFloatSizeNoTag(value.get(i2).floatValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeFloatSizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeFloatNoTag(value.get(i).floatValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeFloat(fieldNumber, value.get(i).floatValue());
            i++;
        }
    }

    private void writeInt32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeInt32SizeNoTag += i72.computeInt32SizeNoTag(value.get(i2).intValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeInt32SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    private void writeInt64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeInt64SizeNoTag += i72.computeInt64SizeNoTag(value.get(i2).longValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeInt64SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    private void writeSFixed32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeSFixed32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSFixed32SizeNoTag += i72.computeSFixed32SizeNoTag(value.get(i2).intValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeSFixed32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeSFixed32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    private void writeSFixed64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeSFixed64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSFixed64SizeNoTag += i72.computeSFixed64SizeNoTag(value.get(i2).longValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeSFixed64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeSFixed64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    private void writeSInt64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeSInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSInt64SizeNoTag += i72.computeSInt64SizeNoTag(value.get(i2).longValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeSInt64SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeSInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeSInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    private void writeUInt64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeUInt64SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeUInt64SizeNoTag += i72.computeUInt64SizeNoTag(value.get(i2).longValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeUInt64SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeUInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeUInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    public void writeSInt32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeSInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeSInt32SizeNoTag += i72.computeSInt32SizeNoTag(value.get(i2).intValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeSInt32SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeSInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeSInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    public void writeUInt32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (packed) {
            this.f52716a.writeTag(fieldNumber, 2);
            int iComputeUInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < value.size(); i2++) {
                iComputeUInt32SizeNoTag += i72.computeUInt32SizeNoTag(value.get(i2).intValue());
            }
            this.f52716a.writeUInt32NoTag(iComputeUInt32SizeNoTag);
            while (i < value.size()) {
                this.f52716a.writeUInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.f52716a.writeUInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }
}
