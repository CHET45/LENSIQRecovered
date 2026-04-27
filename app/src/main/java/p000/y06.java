package p000;

import java.util.Iterator;
import java.util.Map;
import p000.b2i;

/* JADX INFO: loaded from: classes5.dex */
public class y06 {

    /* JADX INFO: renamed from: a */
    public static final int f99813a = 5;

    /* JADX INFO: renamed from: b */
    public static final int f99814b = 5;

    /* JADX INFO: renamed from: c */
    public static final int f99815c = 10;

    /* JADX INFO: renamed from: d */
    public static final int f99816d = 13;

    /* JADX INFO: renamed from: e */
    public static final int f99817e = 15;

    /* JADX INFO: renamed from: f */
    public static final int f99818f = 20;

    /* JADX INFO: renamed from: g */
    public static final int f99819g = 25;

    /* JADX INFO: renamed from: h */
    public static final int f99820h = 30;

    /* JADX INFO: renamed from: i */
    public static final int f99821i = 37;

    /* JADX INFO: renamed from: j */
    public static final int f99822j = 45;

    /* JADX INFO: renamed from: k */
    public static final int f99823k = 50;

    /* JADX INFO: renamed from: l */
    public static final int f99824l = 53;

    /* JADX INFO: renamed from: m */
    public static final int f99825m = 55;

    /* JADX INFO: renamed from: n */
    public static final int f99826n = 60;

    /* JADX INFO: renamed from: o */
    public static final int f99827o = 2;

    /* JADX INFO: renamed from: p */
    public static final y06 f99828p = new y06();

    /* JADX INFO: renamed from: y06$a */
    public static /* synthetic */ class C15363a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99829a;

        static {
            int[] iArr = new int[b2i.EnumC1713c.values().length];
            f99829a = iArr;
            try {
                iArr[b2i.EnumC1713c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99829a[b2i.EnumC1713c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99829a[b2i.EnumC1713c.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99829a[b2i.EnumC1713c.INTEGER_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99829a[b2i.EnumC1713c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99829a[b2i.EnumC1713c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99829a[b2i.EnumC1713c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f99829a[b2i.EnumC1713c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f99829a[b2i.EnumC1713c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f99829a[b2i.EnumC1713c.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f99829a[b2i.EnumC1713c.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private y06() {
    }

    private void writeIndexArray(o70 o70Var, rd4 rd4Var) {
        writeValueTypeLabel(rd4Var, 50);
        Iterator<b2i> it = o70Var.getValuesList().iterator();
        while (it.hasNext()) {
            writeIndexValueAux(it.next(), rd4Var);
        }
    }

    private void writeIndexEntityRef(String str, rd4 rd4Var) {
        writeValueTypeLabel(rd4Var, 37);
        s6e s6eVarFromString = s6e.fromString(str);
        int length = s6eVarFromString.length();
        for (int i = 5; i < length; i++) {
            String segment = s6eVarFromString.getSegment(i);
            writeValueTypeLabel(rd4Var, 60);
            writeUnlabeledIndexString(segment, rd4Var);
        }
    }

    private void writeIndexMap(mt9 mt9Var, rd4 rd4Var) {
        writeValueTypeLabel(rd4Var, 55);
        for (Map.Entry<String, b2i> entry : mt9Var.getFieldsMap().entrySet()) {
            String key = entry.getKey();
            b2i value = entry.getValue();
            writeIndexString(key, rd4Var);
            writeIndexValueAux(value, rd4Var);
        }
    }

    private void writeIndexString(String str, rd4 rd4Var) {
        writeValueTypeLabel(rd4Var, 25);
        writeUnlabeledIndexString(str, rd4Var);
    }

    private void writeIndexValueAux(b2i b2iVar, rd4 rd4Var) {
        switch (C15363a.f99829a[b2iVar.getValueTypeCase().ordinal()]) {
            case 1:
                writeValueTypeLabel(rd4Var, 5);
                return;
            case 2:
                writeValueTypeLabel(rd4Var, 10);
                rd4Var.writeLong(b2iVar.getBooleanValue() ? 1L : 0L);
                return;
            case 3:
                double doubleValue = b2iVar.getDoubleValue();
                if (Double.isNaN(doubleValue)) {
                    writeValueTypeLabel(rd4Var, 13);
                    return;
                }
                writeValueTypeLabel(rd4Var, 15);
                if (doubleValue == -0.0d) {
                    rd4Var.writeDouble(0.0d);
                    return;
                } else {
                    rd4Var.writeDouble(doubleValue);
                    return;
                }
            case 4:
                writeValueTypeLabel(rd4Var, 15);
                rd4Var.writeDouble(b2iVar.getIntegerValue());
                return;
            case 5:
                f2h timestampValue = b2iVar.getTimestampValue();
                writeValueTypeLabel(rd4Var, 20);
                rd4Var.writeLong(timestampValue.getSeconds());
                rd4Var.writeLong(timestampValue.getNanos());
                return;
            case 6:
                writeIndexString(b2iVar.getStringValue(), rd4Var);
                writeTruncationMarker(rd4Var);
                return;
            case 7:
                writeValueTypeLabel(rd4Var, 30);
                rd4Var.writeBytes(b2iVar.getBytesValue());
                writeTruncationMarker(rd4Var);
                return;
            case 8:
                writeIndexEntityRef(b2iVar.getReferenceValue(), rd4Var);
                return;
            case 9:
                ju8 geoPointValue = b2iVar.getGeoPointValue();
                writeValueTypeLabel(rd4Var, 45);
                rd4Var.writeDouble(geoPointValue.getLatitude());
                rd4Var.writeDouble(geoPointValue.getLongitude());
                return;
            case 10:
                if (s2i.isMaxValue(b2iVar)) {
                    writeValueTypeLabel(rd4Var, Integer.MAX_VALUE);
                    return;
                } else if (s2i.isVectorValue(b2iVar)) {
                    writeIndexVector(b2iVar.getMapValue(), rd4Var);
                    return;
                } else {
                    writeIndexMap(b2iVar.getMapValue(), rd4Var);
                    writeTruncationMarker(rd4Var);
                    return;
                }
            case 11:
                writeIndexArray(b2iVar.getArrayValue(), rd4Var);
                writeTruncationMarker(rd4Var);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + b2iVar.getValueTypeCase());
        }
    }

    private void writeIndexVector(mt9 mt9Var, rd4 rd4Var) {
        Map<String, b2i> fieldsMap = mt9Var.getFieldsMap();
        writeValueTypeLabel(rd4Var, 53);
        int valuesCount = fieldsMap.get("value").getArrayValue().getValuesCount();
        writeValueTypeLabel(rd4Var, 15);
        rd4Var.writeLong(valuesCount);
        writeIndexString("value", rd4Var);
        writeIndexValueAux(fieldsMap.get("value"), rd4Var);
    }

    private void writeTruncationMarker(rd4 rd4Var) {
        rd4Var.writeLong(2L);
    }

    private void writeUnlabeledIndexString(String str, rd4 rd4Var) {
        rd4Var.writeString(str);
    }

    private void writeValueTypeLabel(rd4 rd4Var, int i) {
        rd4Var.writeLong(i);
    }

    public void writeIndexValue(b2i b2iVar, rd4 rd4Var) {
        writeIndexValueAux(b2iVar, rd4Var);
        rd4Var.writeInfinity();
    }
}
