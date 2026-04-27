package p000;

import com.google.firebase.Timestamp;
import p000.mt9;

/* JADX INFO: loaded from: classes5.dex */
public final class b4f {

    /* JADX INFO: renamed from: a */
    public static final String f12679a = "server_timestamp";

    /* JADX INFO: renamed from: b */
    public static final String f12680b = "__type__";

    /* JADX INFO: renamed from: c */
    public static final String f12681c = "__previous_value__";

    /* JADX INFO: renamed from: d */
    public static final String f12682d = "__local_write_time__";

    private b4f() {
    }

    public static f2h getLocalWriteTime(b2i b2iVar) {
        return b2iVar.getMapValue().getFieldsOrThrow(f12682d).getTimestampValue();
    }

    @hib
    public static b2i getPreviousValue(b2i b2iVar) {
        b2i fieldsOrDefault = b2iVar.getMapValue().getFieldsOrDefault(f12681c, null);
        return isServerTimestamp(fieldsOrDefault) ? getPreviousValue(fieldsOrDefault) : fieldsOrDefault;
    }

    public static boolean isServerTimestamp(@hib b2i b2iVar) {
        b2i fieldsOrDefault = b2iVar != null ? b2iVar.getMapValue().getFieldsOrDefault("__type__", null) : null;
        return fieldsOrDefault != null && f12679a.equals(fieldsOrDefault.getStringValue());
    }

    public static b2i valueOf(Timestamp timestamp, @hib b2i b2iVar) {
        b2i b2iVarBuild = b2i.newBuilder().setStringValue(f12679a).build();
        mt9.C9519b c9519bPutFields = mt9.newBuilder().putFields("__type__", b2iVarBuild).putFields(f12682d, b2i.newBuilder().setTimestampValue(f2h.newBuilder().setSeconds(timestamp.getSeconds()).setNanos(timestamp.getNanoseconds())).build());
        if (isServerTimestamp(b2iVar)) {
            b2iVar = getPreviousValue(b2iVar);
        }
        if (b2iVar != null) {
            c9519bPutFields.putFields(f12681c, b2iVar);
        }
        return b2i.newBuilder().setMapValue(c9519bPutFields).build();
    }
}
