package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000.b2i;

/* JADX INFO: loaded from: classes5.dex */
public class s2i {

    /* JADX INFO: renamed from: A */
    public static b2i f80452A = null;

    /* JADX INFO: renamed from: B */
    public static b2i f80453B = null;

    /* JADX INFO: renamed from: C */
    public static b2i f80454C = null;

    /* JADX INFO: renamed from: D */
    public static b2i f80455D = null;

    /* JADX INFO: renamed from: E */
    public static b2i f80456E = null;

    /* JADX INFO: renamed from: a */
    public static final String f80457a = "__type__";

    /* JADX INFO: renamed from: b */
    public static final b2i f80458b = b2i.newBuilder().setDoubleValue(Double.NaN).build();

    /* JADX INFO: renamed from: c */
    public static final b2i f80459c;

    /* JADX INFO: renamed from: d */
    public static final b2i f80460d;

    /* JADX INFO: renamed from: e */
    public static final b2i f80461e;

    /* JADX INFO: renamed from: f */
    public static final b2i f80462f;

    /* JADX INFO: renamed from: g */
    public static final b2i f80463g;

    /* JADX INFO: renamed from: h */
    public static final String f80464h = "value";

    /* JADX INFO: renamed from: i */
    public static final b2i f80465i;

    /* JADX INFO: renamed from: j */
    public static final int f80466j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f80467k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f80468l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f80469m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f80470n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f80471o = 5;

    /* JADX INFO: renamed from: p */
    public static final int f80472p = 6;

    /* JADX INFO: renamed from: q */
    public static final int f80473q = 7;

    /* JADX INFO: renamed from: r */
    public static final int f80474r = 8;

    /* JADX INFO: renamed from: s */
    public static final int f80475s = 9;

    /* JADX INFO: renamed from: t */
    public static final int f80476t = 10;

    /* JADX INFO: renamed from: u */
    public static final int f80477u = 11;

    /* JADX INFO: renamed from: v */
    public static final int f80478v = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: w */
    public static b2i f80479w;

    /* JADX INFO: renamed from: x */
    public static b2i f80480x;

    /* JADX INFO: renamed from: y */
    public static b2i f80481y;

    /* JADX INFO: renamed from: z */
    public static b2i f80482z;

    /* JADX INFO: renamed from: s2i$a */
    public static /* synthetic */ class C12414a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80483a;

        static {
            int[] iArr = new int[b2i.EnumC1713c.values().length];
            f80483a = iArr;
            try {
                iArr[b2i.EnumC1713c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80483a[b2i.EnumC1713c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80483a[b2i.EnumC1713c.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80483a[b2i.EnumC1713c.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80483a[b2i.EnumC1713c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f80483a[b2i.EnumC1713c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f80483a[b2i.EnumC1713c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f80483a[b2i.EnumC1713c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f80483a[b2i.EnumC1713c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f80483a[b2i.EnumC1713c.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f80483a[b2i.EnumC1713c.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        b2i b2iVarBuild = b2i.newBuilder().setNullValue(bib.NULL_VALUE).build();
        f80459c = b2iVarBuild;
        f80460d = b2iVarBuild;
        b2i b2iVarBuild2 = b2i.newBuilder().setStringValue("__max__").build();
        f80461e = b2iVarBuild2;
        f80462f = b2i.newBuilder().setMapValue(mt9.newBuilder().putFields("__type__", b2iVarBuild2)).build();
        b2i b2iVarBuild3 = b2i.newBuilder().setStringValue("__vector__").build();
        f80463g = b2iVarBuild3;
        f80465i = b2i.newBuilder().setMapValue(mt9.newBuilder().putFields("__type__", b2iVarBuild3).putFields("value", b2i.newBuilder().setArrayValue(o70.newBuilder()).build())).build();
        f80479w = b2i.newBuilder().setBooleanValue(false).build();
        f80480x = b2i.newBuilder().setDoubleValue(Double.NaN).build();
        f80481y = b2i.newBuilder().setTimestampValue(f2h.newBuilder().setSeconds(Long.MIN_VALUE)).build();
        f80482z = b2i.newBuilder().setStringValue("").build();
        f80452A = b2i.newBuilder().setBytesValue(vj1.f91344e).build();
        f80453B = refValue(qi3.f74488d, ci4.empty());
        f80454C = b2i.newBuilder().setGeoPointValue(ju8.newBuilder().setLatitude(-90.0d).setLongitude(-180.0d)).build();
        f80455D = b2i.newBuilder().setArrayValue(o70.getDefaultInstance()).build();
        f80456E = b2i.newBuilder().setMapValue(mt9.getDefaultInstance()).build();
    }

    private static boolean arrayEquals(b2i b2iVar, b2i b2iVar2) {
        o70 arrayValue = b2iVar.getArrayValue();
        o70 arrayValue2 = b2iVar2.getArrayValue();
        if (arrayValue.getValuesCount() != arrayValue2.getValuesCount()) {
            return false;
        }
        for (int i = 0; i < arrayValue.getValuesCount(); i++) {
            if (!equals(arrayValue.getValues(i), arrayValue2.getValues(i))) {
                return false;
            }
        }
        return true;
    }

    public static String canonicalId(b2i b2iVar) {
        StringBuilder sb = new StringBuilder();
        canonifyValue(sb, b2iVar);
        return sb.toString();
    }

    private static void canonifyArray(StringBuilder sb, o70 o70Var) {
        sb.append("[");
        for (int i = 0; i < o70Var.getValuesCount(); i++) {
            canonifyValue(sb, o70Var.getValues(i));
            if (i != o70Var.getValuesCount() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    private static void canonifyGeoPoint(StringBuilder sb, ju8 ju8Var) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(ju8Var.getLatitude()), Double.valueOf(ju8Var.getLongitude())));
    }

    private static void canonifyObject(StringBuilder sb, mt9 mt9Var) {
        ArrayList<String> arrayList = new ArrayList(mt9Var.getFieldsMap().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z = true;
        for (String str : arrayList) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(g1i.f38277c);
            canonifyValue(sb, mt9Var.getFieldsOrThrow(str));
        }
        sb.append("}");
    }

    private static void canonifyReference(StringBuilder sb, b2i b2iVar) {
        r80.hardAssert(isReferenceValue(b2iVar), "Value should be a ReferenceValue", new Object[0]);
        sb.append(ci4.fromName(b2iVar.getReferenceValue()));
    }

    private static void canonifyTimestamp(StringBuilder sb, f2h f2hVar) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(f2hVar.getSeconds()), Integer.valueOf(f2hVar.getNanos())));
    }

    private static void canonifyValue(StringBuilder sb, b2i b2iVar) {
        switch (C12414a.f80483a[b2iVar.getValueTypeCase().ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(b2iVar.getBooleanValue());
                return;
            case 3:
                sb.append(b2iVar.getIntegerValue());
                return;
            case 4:
                sb.append(b2iVar.getDoubleValue());
                return;
            case 5:
                canonifyTimestamp(sb, b2iVar.getTimestampValue());
                return;
            case 6:
                sb.append(b2iVar.getStringValue());
                return;
            case 7:
                sb.append(r0i.toDebugString(b2iVar.getBytesValue()));
                return;
            case 8:
                canonifyReference(sb, b2iVar);
                return;
            case 9:
                canonifyGeoPoint(sb, b2iVar.getGeoPointValue());
                return;
            case 10:
                canonifyArray(sb, b2iVar.getArrayValue());
                return;
            case 11:
                canonifyObject(sb, b2iVar.getMapValue());
                return;
            default:
                throw r80.fail("Invalid value type: " + b2iVar.getValueTypeCase(), new Object[0]);
        }
    }

    public static int compare(b2i b2iVar, b2i b2iVar2) {
        int iTypeOrder = typeOrder(b2iVar);
        int iTypeOrder2 = typeOrder(b2iVar2);
        if (iTypeOrder != iTypeOrder2) {
            return Integer.compare(iTypeOrder, iTypeOrder2);
        }
        if (iTypeOrder != Integer.MAX_VALUE) {
            switch (iTypeOrder) {
                case 0:
                    break;
                case 1:
                    return r0i.compareBooleans(b2iVar.getBooleanValue(), b2iVar2.getBooleanValue());
                case 2:
                    return compareNumbers(b2iVar, b2iVar2);
                case 3:
                    return compareTimestamps(b2iVar.getTimestampValue(), b2iVar2.getTimestampValue());
                case 4:
                    return compareTimestamps(b4f.getLocalWriteTime(b2iVar), b4f.getLocalWriteTime(b2iVar2));
                case 5:
                    return r0i.compareUtf8Strings(b2iVar.getStringValue(), b2iVar2.getStringValue());
                case 6:
                    return r0i.compareByteStrings(b2iVar.getBytesValue(), b2iVar2.getBytesValue());
                case 7:
                    return compareReferences(b2iVar.getReferenceValue(), b2iVar2.getReferenceValue());
                case 8:
                    return compareGeoPoints(b2iVar.getGeoPointValue(), b2iVar2.getGeoPointValue());
                case 9:
                    return compareArrays(b2iVar.getArrayValue(), b2iVar2.getArrayValue());
                case 10:
                    return compareVectors(b2iVar.getMapValue(), b2iVar2.getMapValue());
                case 11:
                    return compareMaps(b2iVar.getMapValue(), b2iVar2.getMapValue());
                default:
                    throw r80.fail("Invalid value type: " + iTypeOrder, new Object[0]);
            }
        }
        return 0;
    }

    private static int compareArrays(o70 o70Var, o70 o70Var2) {
        int iMin = Math.min(o70Var.getValuesCount(), o70Var2.getValuesCount());
        for (int i = 0; i < iMin; i++) {
            int iCompare = compare(o70Var.getValues(i), o70Var2.getValues(i));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(o70Var.getValuesCount(), o70Var2.getValuesCount());
    }

    private static int compareGeoPoints(ju8 ju8Var, ju8 ju8Var2) {
        int iCompareDoubles = r0i.compareDoubles(ju8Var.getLatitude(), ju8Var2.getLatitude());
        return iCompareDoubles == 0 ? r0i.compareDoubles(ju8Var.getLongitude(), ju8Var2.getLongitude()) : iCompareDoubles;
    }

    private static int compareMaps(mt9 mt9Var, mt9 mt9Var2) {
        Iterator it = new TreeMap(mt9Var.getFieldsMap()).entrySet().iterator();
        Iterator it2 = new TreeMap(mt9Var2.getFieldsMap()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iCompareUtf8Strings = r0i.compareUtf8Strings((String) entry.getKey(), (String) entry2.getKey());
            if (iCompareUtf8Strings != 0) {
                return iCompareUtf8Strings;
            }
            int iCompare = compare((b2i) entry.getValue(), (b2i) entry2.getValue());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return r0i.compareBooleans(it.hasNext(), it2.hasNext());
    }

    private static int compareNumbers(b2i b2iVar, b2i b2iVar2) {
        b2i.EnumC1713c valueTypeCase = b2iVar.getValueTypeCase();
        b2i.EnumC1713c enumC1713c = b2i.EnumC1713c.DOUBLE_VALUE;
        if (valueTypeCase == enumC1713c) {
            double doubleValue = b2iVar.getDoubleValue();
            if (b2iVar2.getValueTypeCase() == enumC1713c) {
                return r0i.compareDoubles(doubleValue, b2iVar2.getDoubleValue());
            }
            if (b2iVar2.getValueTypeCase() == b2i.EnumC1713c.INTEGER_VALUE) {
                return r0i.compareMixed(doubleValue, b2iVar2.getIntegerValue());
            }
        } else {
            b2i.EnumC1713c valueTypeCase2 = b2iVar.getValueTypeCase();
            b2i.EnumC1713c enumC1713c2 = b2i.EnumC1713c.INTEGER_VALUE;
            if (valueTypeCase2 == enumC1713c2) {
                long integerValue = b2iVar.getIntegerValue();
                if (b2iVar2.getValueTypeCase() == enumC1713c2) {
                    return Long.compare(integerValue, b2iVar2.getIntegerValue());
                }
                if (b2iVar2.getValueTypeCase() == enumC1713c) {
                    return r0i.compareMixed(b2iVar2.getDoubleValue(), integerValue) * (-1);
                }
            }
        }
        throw r80.fail("Unexpected values: %s vs %s", b2iVar, b2iVar2);
    }

    private static int compareReferences(String str, String str2) {
        String[] strArrSplit = str.split(pj4.f71071b, -1);
        String[] strArrSplit2 = str2.split(pj4.f71071b, -1);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = strArrSplit[i].compareTo(strArrSplit2[i]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.compare(strArrSplit.length, strArrSplit2.length);
    }

    private static int compareTimestamps(f2h f2hVar, f2h f2hVar2) {
        int iCompare = Long.compare(f2hVar.getSeconds(), f2hVar2.getSeconds());
        return iCompare != 0 ? iCompare : Integer.compare(f2hVar.getNanos(), f2hVar2.getNanos());
    }

    private static int compareVectors(mt9 mt9Var, mt9 mt9Var2) {
        Map<String, b2i> fieldsMap = mt9Var.getFieldsMap();
        Map<String, b2i> fieldsMap2 = mt9Var2.getFieldsMap();
        o70 arrayValue = fieldsMap.get("value").getArrayValue();
        o70 arrayValue2 = fieldsMap2.get("value").getArrayValue();
        int iCompare = Integer.compare(arrayValue.getValuesCount(), arrayValue2.getValuesCount());
        return iCompare != 0 ? iCompare : compareArrays(arrayValue, arrayValue2);
    }

    public static boolean contains(p70 p70Var, b2i b2iVar) {
        Iterator<b2i> it = p70Var.getValuesList().iterator();
        while (it.hasNext()) {
            if (equals(it.next(), b2iVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean equals(b2i b2iVar, b2i b2iVar2) {
        int iTypeOrder;
        if (b2iVar == b2iVar2) {
            return true;
        }
        if (b2iVar == null || b2iVar2 == null || (iTypeOrder = typeOrder(b2iVar)) != typeOrder(b2iVar2)) {
            return false;
        }
        if (iTypeOrder == 2) {
            return numberEquals(b2iVar, b2iVar2);
        }
        if (iTypeOrder == 4) {
            return b4f.getLocalWriteTime(b2iVar).equals(b4f.getLocalWriteTime(b2iVar2));
        }
        if (iTypeOrder == Integer.MAX_VALUE) {
            return true;
        }
        switch (iTypeOrder) {
            case 9:
                return arrayEquals(b2iVar, b2iVar2);
            case 10:
            case 11:
                return objectEquals(b2iVar, b2iVar2);
            default:
                return b2iVar.equals(b2iVar2);
        }
    }

    public static b2i getLowerBound(b2i b2iVar) {
        switch (C12414a.f80483a[b2iVar.getValueTypeCase().ordinal()]) {
            case 1:
                return f80459c;
            case 2:
                return f80479w;
            case 3:
            case 4:
                return f80480x;
            case 5:
                return f80481y;
            case 6:
                return f80482z;
            case 7:
                return f80452A;
            case 8:
                return f80453B;
            case 9:
                return f80454C;
            case 10:
                return f80455D;
            case 11:
                return isVectorValue(b2iVar) ? f80465i : f80456E;
            default:
                throw new IllegalArgumentException("Unknown value type: " + b2iVar.getValueTypeCase());
        }
    }

    public static b2i getUpperBound(b2i b2iVar) {
        switch (C12414a.f80483a[b2iVar.getValueTypeCase().ordinal()]) {
            case 1:
                return f80479w;
            case 2:
                return f80480x;
            case 3:
            case 4:
                return f80481y;
            case 5:
                return f80482z;
            case 6:
                return f80452A;
            case 7:
                return f80453B;
            case 8:
                return f80454C;
            case 9:
                return f80455D;
            case 10:
                return f80465i;
            case 11:
                return isVectorValue(b2iVar) ? f80456E : f80462f;
            default:
                throw new IllegalArgumentException("Unknown value type: " + b2iVar.getValueTypeCase());
        }
    }

    public static boolean isArray(@hib b2i b2iVar) {
        return b2iVar != null && b2iVar.getValueTypeCase() == b2i.EnumC1713c.ARRAY_VALUE;
    }

    public static boolean isDouble(@hib b2i b2iVar) {
        return b2iVar != null && b2iVar.getValueTypeCase() == b2i.EnumC1713c.DOUBLE_VALUE;
    }

    public static boolean isInteger(@hib b2i b2iVar) {
        return b2iVar != null && b2iVar.getValueTypeCase() == b2i.EnumC1713c.INTEGER_VALUE;
    }

    public static boolean isMapValue(@hib b2i b2iVar) {
        return b2iVar != null && b2iVar.getValueTypeCase() == b2i.EnumC1713c.MAP_VALUE;
    }

    public static boolean isMaxValue(b2i b2iVar) {
        return f80461e.equals(b2iVar.getMapValue().getFieldsMap().get("__type__"));
    }

    public static boolean isNanValue(@hib b2i b2iVar) {
        return b2iVar != null && Double.isNaN(b2iVar.getDoubleValue());
    }

    public static boolean isNullValue(@hib b2i b2iVar) {
        return b2iVar != null && b2iVar.getValueTypeCase() == b2i.EnumC1713c.NULL_VALUE;
    }

    public static boolean isNumber(@hib b2i b2iVar) {
        return isInteger(b2iVar) || isDouble(b2iVar);
    }

    public static boolean isReferenceValue(@hib b2i b2iVar) {
        return b2iVar != null && b2iVar.getValueTypeCase() == b2i.EnumC1713c.REFERENCE_VALUE;
    }

    public static boolean isVectorValue(b2i b2iVar) {
        return f80463g.equals(b2iVar.getMapValue().getFieldsMap().get("__type__"));
    }

    public static int lowerBoundCompare(b2i b2iVar, boolean z, b2i b2iVar2, boolean z2) {
        int iCompare = compare(b2iVar, b2iVar2);
        if (iCompare != 0) {
            return iCompare;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : 1;
        }
        return -1;
    }

    private static boolean numberEquals(b2i b2iVar, b2i b2iVar2) {
        b2i.EnumC1713c valueTypeCase = b2iVar.getValueTypeCase();
        b2i.EnumC1713c enumC1713c = b2i.EnumC1713c.INTEGER_VALUE;
        if (valueTypeCase == enumC1713c && b2iVar2.getValueTypeCase() == enumC1713c) {
            return b2iVar.getIntegerValue() == b2iVar2.getIntegerValue();
        }
        b2i.EnumC1713c valueTypeCase2 = b2iVar.getValueTypeCase();
        b2i.EnumC1713c enumC1713c2 = b2i.EnumC1713c.DOUBLE_VALUE;
        return valueTypeCase2 == enumC1713c2 && b2iVar2.getValueTypeCase() == enumC1713c2 && Double.doubleToLongBits(b2iVar.getDoubleValue()) == Double.doubleToLongBits(b2iVar2.getDoubleValue());
    }

    private static boolean objectEquals(b2i b2iVar, b2i b2iVar2) {
        mt9 mapValue = b2iVar.getMapValue();
        mt9 mapValue2 = b2iVar2.getMapValue();
        if (mapValue.getFieldsCount() != mapValue2.getFieldsCount()) {
            return false;
        }
        for (Map.Entry<String, b2i> entry : mapValue.getFieldsMap().entrySet()) {
            if (!equals(entry.getValue(), mapValue2.getFieldsMap().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static b2i refValue(qi3 qi3Var, ci4 ci4Var) {
        return b2i.newBuilder().setReferenceValue(String.format("projects/%s/databases/%s/documents/%s", qi3Var.getProjectId(), qi3Var.getDatabaseId(), ci4Var.toString())).build();
    }

    public static int typeOrder(b2i b2iVar) {
        switch (C12414a.f80483a[b2iVar.getValueTypeCase().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (b4f.isServerTimestamp(b2iVar)) {
                    return 4;
                }
                if (isMaxValue(b2iVar)) {
                    return Integer.MAX_VALUE;
                }
                return isVectorValue(b2iVar) ? 10 : 11;
            default:
                throw r80.fail("Invalid value type: " + b2iVar.getValueTypeCase(), new Object[0]);
        }
    }

    public static int upperBoundCompare(b2i b2iVar, boolean z, b2i b2iVar2, boolean z2) {
        int iCompare = compare(b2iVar, b2iVar2);
        if (iCompare != 0) {
            return iCompare;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : -1;
        }
        return 1;
    }
}
