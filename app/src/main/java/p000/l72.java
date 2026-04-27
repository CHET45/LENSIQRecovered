package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.hpi;
import p000.os9;
import p000.rsi;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class l72 implements rsi {

    /* JADX INFO: renamed from: a */
    public final j72 f56389a;

    /* JADX INFO: renamed from: l72$a */
    public static /* synthetic */ class C8651a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56390a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f56390a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44484H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44483F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44500m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44493Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44490V1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44491X.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44482C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44498e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44487M1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44494Z1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44499f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56390a[hpi.EnumC6968b.f44485L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private l72(j72 output) {
        j72 j72Var = (j72) w98.m24433b(output, "output");
        this.f56389a = j72Var;
        j72Var.f49665a = this;
    }

    public static l72 forCodedOutput(j72 output) {
        l72 l72Var = output.f49665a;
        return l72Var != null ? l72Var : new l72(output);
    }

    private <V> void writeDeterministicBooleanMapEntry(int fieldNumber, boolean key, V value, os9.C10633b<Boolean, V> metadata) throws IOException {
        this.f56389a.writeTag(fieldNumber, 2);
        this.f56389a.writeUInt32NoTag(os9.m18968a(metadata, Boolean.valueOf(key), value));
        os9.m18971e(this.f56389a, metadata, Boolean.valueOf(key), value);
    }

    private <V> void writeDeterministicIntegerMap(int fieldNumber, os9.C10633b<Integer, V> metadata, Map<Integer, V> map) throws IOException {
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
            this.f56389a.writeTag(fieldNumber, 2);
            this.f56389a.writeUInt32NoTag(os9.m18968a(metadata, Integer.valueOf(i3), v));
            os9.m18971e(this.f56389a, metadata, Integer.valueOf(i3), v);
        }
    }

    private <V> void writeDeterministicLongMap(int fieldNumber, os9.C10633b<Long, V> metadata, Map<Long, V> map) throws IOException {
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
            this.f56389a.writeTag(fieldNumber, 2);
            this.f56389a.writeUInt32NoTag(os9.m18968a(metadata, Long.valueOf(j), v));
            os9.m18971e(this.f56389a, metadata, Long.valueOf(j), v);
        }
    }

    private <K, V> void writeDeterministicMap(int fieldNumber, os9.C10633b<K, V> metadata, Map<K, V> map) throws IOException {
        switch (C8651a.f56390a[metadata.f68567a.ordinal()]) {
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
                throw new IllegalArgumentException("does not support key type: " + metadata.f68567a);
        }
    }

    private <V> void writeDeterministicStringMap(int fieldNumber, os9.C10633b<String, V> metadata, Map<String, V> map) throws IOException {
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
            this.f56389a.writeTag(fieldNumber, 2);
            this.f56389a.writeUInt32NoTag(os9.m18968a(metadata, str, v));
            os9.m18971e(this.f56389a, metadata, str, v);
        }
    }

    private void writeLazyString(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            this.f56389a.writeString(fieldNumber, (String) value);
        } else {
            this.f56389a.writeBytes(fieldNumber, (vj1) value);
        }
    }

    @Override // p000.rsi
    public rsi.EnumC12268a fieldOrder() {
        return rsi.EnumC12268a.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.f56389a.getTotalBytesWritten();
    }

    @Override // p000.rsi
    public void writeBool(int fieldNumber, boolean value) throws IOException {
        this.f56389a.writeBool(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeBoolList(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeBool(fieldNumber, value.get(i).booleanValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeBoolSizeNoTag += j72.computeBoolSizeNoTag(value.get(i2).booleanValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeBoolNoTag(value.get(i).booleanValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeBytes(int fieldNumber, vj1 value) throws IOException {
        this.f56389a.writeBytes(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeBytesList(int fieldNumber, List<vj1> value) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            this.f56389a.writeBytes(fieldNumber, value.get(i));
        }
    }

    @Override // p000.rsi
    public void writeDouble(int fieldNumber, double value) throws IOException {
        this.f56389a.writeDouble(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeDoubleList(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeDouble(fieldNumber, value.get(i).doubleValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeDoubleSizeNoTag += j72.computeDoubleSizeNoTag(value.get(i2).doubleValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeDoubleNoTag(value.get(i).doubleValue());
            i++;
        }
    }

    @Override // p000.rsi
    @Deprecated
    public void writeEndGroup(int fieldNumber) throws IOException {
        this.f56389a.writeTag(fieldNumber, 4);
    }

    @Override // p000.rsi
    public void writeEnum(int fieldNumber, int value) throws IOException {
        this.f56389a.writeEnum(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeEnumList(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeEnum(fieldNumber, value.get(i).intValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeEnumSizeNoTag += j72.computeEnumSizeNoTag(value.get(i2).intValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeEnumNoTag(value.get(i).intValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeFixed32(int fieldNumber, int value) throws IOException {
        this.f56389a.writeFixed32(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeFixed32(fieldNumber, value.get(i).intValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeFixed32SizeNoTag += j72.computeFixed32SizeNoTag(value.get(i2).intValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeFixed32NoTag(value.get(i).intValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeFixed64(int fieldNumber, long value) throws IOException {
        this.f56389a.writeFixed64(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeFixed64(fieldNumber, value.get(i).longValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeFixed64SizeNoTag += j72.computeFixed64SizeNoTag(value.get(i2).longValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeFixed64NoTag(value.get(i).longValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeFloat(int fieldNumber, float value) throws IOException {
        this.f56389a.writeFloat(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeFloatList(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeFloat(fieldNumber, value.get(i).floatValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeFloatSizeNoTag += j72.computeFloatSizeNoTag(value.get(i2).floatValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeFloatNoTag(value.get(i).floatValue());
            i++;
        }
    }

    @Override // p000.rsi
    @Deprecated
    public void writeGroup(int fieldNumber, Object value) throws IOException {
        this.f56389a.writeGroup(fieldNumber, (qsa) value);
    }

    @Override // p000.rsi
    @Deprecated
    public void writeGroupList(int fieldNumber, List<?> value) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i));
        }
    }

    @Override // p000.rsi
    public void writeInt32(int fieldNumber, int value) throws IOException {
        this.f56389a.writeInt32(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeInt32(fieldNumber, value.get(i).intValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeInt32SizeNoTag += j72.computeInt32SizeNoTag(value.get(i2).intValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeInt32NoTag(value.get(i).intValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeInt64(int fieldNumber, long value) throws IOException {
        this.f56389a.writeInt64(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeInt64(fieldNumber, value.get(i).longValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeInt64SizeNoTag += j72.computeInt64SizeNoTag(value.get(i2).longValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeInt64NoTag(value.get(i).longValue());
            i++;
        }
    }

    @Override // p000.rsi
    public <K, V> void writeMap(int fieldNumber, os9.C10633b<K, V> metadata, Map<K, V> map) throws IOException {
        if (this.f56389a.m13766i()) {
            writeDeterministicMap(fieldNumber, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f56389a.writeTag(fieldNumber, 2);
            this.f56389a.writeUInt32NoTag(os9.m18968a(metadata, entry.getKey(), entry.getValue()));
            os9.m18971e(this.f56389a, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.rsi
    public void writeMessage(int fieldNumber, Object value) throws IOException {
        this.f56389a.writeMessage(fieldNumber, (qsa) value);
    }

    @Override // p000.rsi
    public void writeMessageList(int fieldNumber, List<?> value) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i));
        }
    }

    @Override // p000.rsi
    public final void writeMessageSetItem(int fieldNumber, Object value) throws IOException {
        if (value instanceof vj1) {
            this.f56389a.writeRawMessageSetExtension(fieldNumber, (vj1) value);
        } else {
            this.f56389a.writeMessageSetExtension(fieldNumber, (qsa) value);
        }
    }

    @Override // p000.rsi
    public void writeSFixed32(int fieldNumber, int value) throws IOException {
        this.f56389a.writeSFixed32(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeSFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeSFixed32(fieldNumber, value.get(i).intValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSFixed32SizeNoTag += j72.computeSFixed32SizeNoTag(value.get(i2).intValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeSFixed32NoTag(value.get(i).intValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeSFixed64(int fieldNumber, long value) throws IOException {
        this.f56389a.writeSFixed64(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeSFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeSFixed64(fieldNumber, value.get(i).longValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSFixed64SizeNoTag += j72.computeSFixed64SizeNoTag(value.get(i2).longValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeSFixed64NoTag(value.get(i).longValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeSInt32(int fieldNumber, int value) throws IOException {
        this.f56389a.writeSInt32(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeSInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeSInt32(fieldNumber, value.get(i).intValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSInt32SizeNoTag += j72.computeSInt32SizeNoTag(value.get(i2).intValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeSInt32NoTag(value.get(i).intValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeSInt64(int fieldNumber, long value) throws IOException {
        this.f56389a.writeSInt64(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeSInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeSInt64(fieldNumber, value.get(i).longValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeSInt64SizeNoTag += j72.computeSInt64SizeNoTag(value.get(i2).longValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeSInt64NoTag(value.get(i).longValue());
            i++;
        }
    }

    @Override // p000.rsi
    @Deprecated
    public void writeStartGroup(int fieldNumber) throws IOException {
        this.f56389a.writeTag(fieldNumber, 3);
    }

    @Override // p000.rsi
    public void writeString(int fieldNumber, String value) throws IOException {
        this.f56389a.writeString(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeStringList(int fieldNumber, List<String> value) throws IOException {
        int i = 0;
        if (!(value instanceof e39)) {
            while (i < value.size()) {
                this.f56389a.writeString(fieldNumber, value.get(i));
                i++;
            }
        } else {
            e39 e39Var = (e39) value;
            while (i < value.size()) {
                writeLazyString(fieldNumber, e39Var.getRaw(i));
                i++;
            }
        }
    }

    @Override // p000.rsi
    public void writeUInt32(int fieldNumber, int value) throws IOException {
        this.f56389a.writeUInt32(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeUInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeUInt32(fieldNumber, value.get(i).intValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeUInt32SizeNoTag += j72.computeUInt32SizeNoTag(value.get(i2).intValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeUInt32NoTag(value.get(i).intValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeUInt64(int fieldNumber, long value) throws IOException {
        this.f56389a.writeUInt64(fieldNumber, value);
    }

    @Override // p000.rsi
    public void writeUInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i = 0;
        if (!packed) {
            while (i < value.size()) {
                this.f56389a.writeUInt64(fieldNumber, value.get(i).longValue());
                i++;
            }
            return;
        }
        this.f56389a.writeTag(fieldNumber, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < value.size(); i2++) {
            iComputeUInt64SizeNoTag += j72.computeUInt64SizeNoTag(value.get(i2).longValue());
        }
        this.f56389a.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i < value.size()) {
            this.f56389a.writeUInt64NoTag(value.get(i).longValue());
            i++;
        }
    }

    @Override // p000.rsi
    public void writeGroup(int fieldNumber, Object value, tpe schema) throws IOException {
        this.f56389a.m13767m(fieldNumber, (qsa) value, schema);
    }

    @Override // p000.rsi
    public void writeMessage(int fieldNumber, Object value, tpe schema) throws IOException {
        this.f56389a.mo13769o(fieldNumber, (qsa) value, schema);
    }

    @Override // p000.rsi
    public void writeGroupList(int fieldNumber, List<?> value, tpe schema) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i), schema);
        }
    }

    @Override // p000.rsi
    public void writeMessageList(int fieldNumber, List<?> value, tpe schema) throws IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i), schema);
        }
    }
}
