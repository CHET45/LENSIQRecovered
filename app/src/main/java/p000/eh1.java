package p000;

import android.util.Base64;
import androidx.constraintlayout.widget.C0901d;
import androidx.lifecycle.C1171x;
import com.google.firebase.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.b2i;
import p000.fr5;
import p000.mt9;
import p000.n7c;
import p000.nld;
import p000.o70;
import p000.ymh;

/* JADX INFO: loaded from: classes5.dex */
public class eh1 {

    /* JADX INFO: renamed from: c */
    public static final long f32967c = 1000;

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f32968a;

    /* JADX INFO: renamed from: b */
    public final nyd f32969b;

    public eh1(nyd nydVar) {
        this.f32969b = nydVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f32968a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(jzh.f52305a));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void decodeArrayValue(b2i.C1712b c1712b, @hib JSONArray jSONArray) throws JSONException {
        o70.C10211b c10211bNewBuilder = o70.newBuilder();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                c10211bNewBuilder.addValues(decodeValue(jSONArray.getJSONObject(i)));
            }
        }
        c1712b.setArrayValue(c10211bNewBuilder);
    }

    private th1 decodeBundledQuery(JSONObject jSONObject) throws JSONException {
        String string;
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        verifyNoSelect(jSONObject2);
        s6e s6eVarDecodeName = decodeName(jSONObject.getString(C0901d.f6975V1));
        JSONArray jSONArray = jSONObject2.getJSONArray(ymh.InterfaceC15729h.f102263c);
        verifyCollectionSelector(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.optBoolean("allDescendants", false)) {
            string = jSONObject3.getString("collectionId");
        } else {
            s6eVarDecodeName = s6eVarDecodeName.append(jSONObject3.getString("collectionId"));
            string = null;
        }
        s6e s6eVar = s6eVarDecodeName;
        String str = string;
        List<su5> listDecodeWhere = decodeWhere(jSONObject2.optJSONObject("where"));
        List<n7c> listDecodeOrderBy = decodeOrderBy(jSONObject2.optJSONArray("orderBy"));
        gc1 gc1VarDecodeStartAtBound = decodeStartAtBound(jSONObject2.optJSONObject("startAt"));
        gc1 gc1VarDecodeEndAtBound = decodeEndAtBound(jSONObject2.optJSONObject("endAt"));
        verifyNoOffset(jSONObject2);
        return new th1(new nld(s6eVar, str, listDecodeWhere, listDecodeOrderBy, decodeLimit(jSONObject2), nld.EnumC9924a.LIMIT_TO_FIRST, gc1VarDecodeStartAtBound, gc1VarDecodeEndAtBound).toTarget(), decodeLimitType(jSONObject));
    }

    private void decodeCompositeFilter(List<su5> list, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.getString("op").equals("AND")) {
            throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filters");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                decodeFilter(list, jSONArrayOptJSONArray.getJSONObject(i));
            }
        }
    }

    private gc1 decodeEndAtBound(@hib JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new gc1(decodePosition(jSONObject), !jSONObject.optBoolean("before", false));
    }

    private void decodeFieldFilter(List<su5> list, JSONObject jSONObject) throws JSONException {
        list.add(fr5.create(decodeFieldReference(jSONObject.getJSONObject("field")), decodeFieldFilterOperator(jSONObject.getString("op")), decodeValue(jSONObject.getJSONObject("value"))));
    }

    private fr5.EnumC5939b decodeFieldFilterOperator(String str) {
        return fr5.EnumC5939b.valueOf(str);
    }

    private wr5 decodeFieldReference(JSONObject jSONObject) throws JSONException {
        return wr5.fromServerFormat(jSONObject.getString("fieldPath"));
    }

    private void decodeFilter(List<su5> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("compositeFilter")) {
            decodeCompositeFilter(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            decodeFieldFilter(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            decodeUnaryFilter(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void decodeGeoPoint(b2i.C1712b c1712b, JSONObject jSONObject) {
        c1712b.setGeoPointValue(ju8.newBuilder().setLatitude(jSONObject.optDouble("latitude")).setLongitude(jSONObject.optDouble("longitude")));
    }

    private int decodeLimit(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("limit");
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("value", -1) : jSONObject.optInt("limit", -1);
    }

    private nld.EnumC9924a decodeLimitType(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("limitType", "FIRST");
        if (strOptString.equals("FIRST")) {
            return nld.EnumC9924a.LIMIT_TO_FIRST;
        }
        if (strOptString.equals("LAST")) {
            return nld.EnumC9924a.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + strOptString);
    }

    private void decodeMapValue(b2i.C1712b c1712b, @hib JSONObject jSONObject) throws JSONException {
        mt9.C9519b c9519bNewBuilder = mt9.newBuilder();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c9519bNewBuilder.putFields(next, decodeValue(jSONObject.getJSONObject(next)));
            }
        }
        c1712b.setMapValue(c9519bNewBuilder);
    }

    private s6e decodeName(String str) {
        s6e s6eVarFromString = s6e.fromString(str);
        if (this.f32969b.isLocalResourceName(s6eVarFromString)) {
            return s6eVarFromString.popFirst(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    private List<n7c> decodeOrderBy(@hib JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(n7c.getInstance(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? n7c.EnumC9722a.ASCENDING : n7c.EnumC9722a.DESCENDING, decodeFieldReference(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    private List<b2i> decodePosition(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C1171x.f7958g);
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(decodeValue(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        return arrayList;
    }

    private euf decodeSnapshotVersion(Object obj) throws JSONException {
        return new euf(decodeTimestamp(obj));
    }

    private gc1 decodeStartAtBound(@hib JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new gc1(decodePosition(jSONObject), jSONObject.optBoolean("before", false));
    }

    private Timestamp decodeTimestamp(JSONObject jSONObject) {
        return new Timestamp(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private static long decodeTimezoneOffset(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf != -1) {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    private void decodeUnaryFilter(List<su5> list, JSONObject jSONObject) throws JSONException {
        wr5 wr5VarDecodeFieldReference;
        String string;
        wr5VarDecodeFieldReference = decodeFieldReference(jSONObject.getJSONObject("field"));
        string = jSONObject.getString("op");
        string.hashCode();
        switch (string) {
            case "IS_NAN":
                list.add(fr5.create(wr5VarDecodeFieldReference, fr5.EnumC5939b.EQUAL, s2i.f80458b));
                return;
            case "IS_NULL":
                list.add(fr5.create(wr5VarDecodeFieldReference, fr5.EnumC5939b.EQUAL, s2i.f80459c));
                return;
            case "IS_NOT_NAN":
                list.add(fr5.create(wr5VarDecodeFieldReference, fr5.EnumC5939b.NOT_EQUAL, s2i.f80458b));
                return;
            case "IS_NOT_NULL":
                list.add(fr5.create(wr5VarDecodeFieldReference, fr5.EnumC5939b.NOT_EQUAL, s2i.f80459c));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    private b2i decodeValue(JSONObject jSONObject) throws JSONException {
        b2i.C1712b c1712bNewBuilder = b2i.newBuilder();
        if (jSONObject.has("nullValue")) {
            c1712bNewBuilder.setNullValue(bib.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            c1712bNewBuilder.setBooleanValue(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            c1712bNewBuilder.setIntegerValue(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            c1712bNewBuilder.setDoubleValue(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            decodeTimestamp(c1712bNewBuilder, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            c1712bNewBuilder.setStringValue(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            c1712bNewBuilder.setBytesValue(vj1.copyFrom(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            c1712bNewBuilder.setReferenceValue(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            decodeGeoPoint(c1712bNewBuilder, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            decodeArrayValue(c1712bNewBuilder, jSONObject.getJSONObject("arrayValue").optJSONArray(C1171x.f7958g));
        } else {
            if (!jSONObject.has("mapValue")) {
                throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
            }
            decodeMapValue(c1712bNewBuilder, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
        return c1712bNewBuilder.build();
    }

    private List<su5> decodeWhere(@hib JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            decodeFilter(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int parseNanos(String str) {
        int iCharAt = 0;
        for (int i = 0; i < 9; i++) {
            iCharAt *= 10;
            if (i < str.length()) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                iCharAt += str.charAt(i) - '0';
            }
        }
        return iCharAt;
    }

    private void verifyCollectionSelector(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void verifyNoOffset(JSONObject jSONObject) {
        if (jSONObject.has(ymh.InterfaceC15724c.f102156R)) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void verifyNoSelect(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    /* JADX INFO: renamed from: a */
    public qg1 m9950a(JSONObject jSONObject) throws JSONException {
        ci4 ci4VarFromPath = ci4.fromPath(decodeName(jSONObject.getString("name")));
        euf eufVarDecodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("updateTime"));
        b2i.C1712b c1712bNewBuilder = b2i.newBuilder();
        decodeMapValue(c1712bNewBuilder, jSONObject.getJSONObject("fields"));
        return new qg1(t4b.newFoundDocument(ci4VarFromPath, eufVarDecodeSnapshotVersion, nkb.fromMap(c1712bNewBuilder.getMapValue().getFieldsMap())));
    }

    public ah1 decodeBundleMetadata(JSONObject jSONObject) throws JSONException {
        return new ah1(jSONObject.getString("id"), jSONObject.getInt("version"), decodeSnapshotVersion(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public nh1 decodeBundledDocumentMetadata(JSONObject jSONObject) throws JSONException {
        ci4 ci4VarFromPath = ci4.fromPath(decodeName(jSONObject.getString("name")));
        euf eufVarDecodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("readTime"));
        boolean zOptBoolean = jSONObject.optBoolean("exists", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        return new nh1(ci4VarFromPath, eufVarDecodeSnapshotVersion, zOptBoolean, arrayList);
    }

    public c9b decodeNamedQuery(JSONObject jSONObject) throws JSONException {
        return new c9b(jSONObject.getString("name"), decodeBundledQuery(jSONObject.getJSONObject("bundledQuery")), decodeSnapshotVersion(jSONObject.get("readTime")));
    }

    private Timestamp decodeTimestamp(String str) {
        try {
            int iIndexOf = str.indexOf(84);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: " + str);
            }
            int iIndexOf2 = str.indexOf(90, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(43, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(45, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            int nanos = 0;
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = "";
            int iIndexOf3 = strSubstring.indexOf(46);
            if (iIndexOf3 != -1) {
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                strSubstring2 = strSubstring.substring(iIndexOf3 + 1);
                strSubstring = strSubstring3;
            }
            long time = this.f32968a.parse(strSubstring).getTime() / 1000;
            if (!strSubstring2.isEmpty()) {
                nanos = parseNanos(strSubstring2);
            }
            if (str.charAt(iIndexOf2) != 'Z') {
                long jDecodeTimezoneOffset = decodeTimezoneOffset(str.substring(iIndexOf2 + 1));
                time = str.charAt(iIndexOf2) == '+' ? time - jDecodeTimezoneOffset : time + jDecodeTimezoneOffset;
            } else if (str.length() != iIndexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(iIndexOf2) + "\"");
            }
            return new Timestamp(time, nanos);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Failed to parse timestamp", e);
        }
    }

    private Timestamp decodeTimestamp(Object obj) throws JSONException {
        if (obj instanceof String) {
            return decodeTimestamp((String) obj);
        }
        if (obj instanceof JSONObject) {
            return decodeTimestamp((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private void decodeTimestamp(b2i.C1712b c1712b, Object obj) throws JSONException {
        Timestamp timestampDecodeTimestamp = decodeTimestamp(obj);
        c1712b.setTimestampValue(f2h.newBuilder().setSeconds(timestampDecodeTimestamp.getSeconds()).setNanos(timestampDecodeTimestamp.getNanoseconds()));
    }
}
