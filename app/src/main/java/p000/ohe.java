package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.a65;
import p000.ei9;
import p000.f42;
import p000.p7e;
import p000.vhg;

/* JADX INFO: loaded from: classes4.dex */
@qpf
@xqi
public class ohe implements t65, vhg, b42 {

    /* JADX INFO: renamed from: C */
    public static final int f67645C = 50;

    /* JADX INFO: renamed from: F */
    public static final q15 f67646F = q15.m19986of("proto");

    /* JADX INFO: renamed from: f */
    public static final String f67647f = "SQLiteEventStore";

    /* JADX INFO: renamed from: m */
    public static final int f67648m = 16;

    /* JADX INFO: renamed from: a */
    public final fqe f67649a;

    /* JADX INFO: renamed from: b */
    public final g52 f67650b;

    /* JADX INFO: renamed from: c */
    public final g52 f67651c;

    /* JADX INFO: renamed from: d */
    public final u65 f67652d;

    /* JADX INFO: renamed from: e */
    public final gid<String> f67653e;

    /* JADX INFO: renamed from: ohe$b */
    public interface InterfaceC10379b<T, U> {
        U apply(T t);
    }

    /* JADX INFO: renamed from: ohe$c */
    public static class C10380c {

        /* JADX INFO: renamed from: a */
        public final String f67654a;

        /* JADX INFO: renamed from: b */
        public final String f67655b;

        private C10380c(String str, String str2) {
            this.f67654a = str;
            this.f67655b = str2;
        }
    }

    /* JADX INFO: renamed from: ohe$d */
    public interface InterfaceC10381d<T> {
        T produce();
    }

    @a28
    public ohe(@ehi g52 g52Var, @pya g52 g52Var2, u65 u65Var, fqe fqeVar, @v8b("PACKAGE_NAME") gid<String> gidVar) {
        this.f67649a = fqeVar;
        this.f67650b = g52Var;
        this.f67651c = g52Var2;
        this.f67652d = u65Var;
        this.f67653e = gidVar;
    }

    @fdi
    /* JADX INFO: renamed from: D */
    public static <T> T m18679D(Cursor cursor, InterfaceC10379b<Cursor, T> interfaceC10379b) {
        try {
            return interfaceC10379b.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private ei9.EnumC5322b convertToReason(int i) {
        ei9.EnumC5322b enumC5322b = ei9.EnumC5322b.REASON_UNKNOWN;
        if (i == enumC5322b.getNumber()) {
            return enumC5322b;
        }
        ei9.EnumC5322b enumC5322b2 = ei9.EnumC5322b.MESSAGE_TOO_OLD;
        if (i == enumC5322b2.getNumber()) {
            return enumC5322b2;
        }
        ei9.EnumC5322b enumC5322b3 = ei9.EnumC5322b.CACHE_FULL;
        if (i == enumC5322b3.getNumber()) {
            return enumC5322b3;
        }
        ei9.EnumC5322b enumC5322b4 = ei9.EnumC5322b.PAYLOAD_TOO_BIG;
        if (i == enumC5322b4.getNumber()) {
            return enumC5322b4;
        }
        ei9.EnumC5322b enumC5322b5 = ei9.EnumC5322b.MAX_RETRIES_REACHED;
        if (i == enumC5322b5.getNumber()) {
            return enumC5322b5;
        }
        ei9.EnumC5322b enumC5322b6 = ei9.EnumC5322b.INVALID_PAYLOD;
        if (i == enumC5322b6.getNumber()) {
            return enumC5322b6;
        }
        ei9.EnumC5322b enumC5322b7 = ei9.EnumC5322b.SERVER_ERROR;
        if (i == enumC5322b7.getNumber()) {
            return enumC5322b7;
        }
        tj9.m22693d(f67647f, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return enumC5322b;
    }

    private void ensureBeginTransaction(final SQLiteDatabase sQLiteDatabase) {
        retryIfDbLocked(new InterfaceC10381d() { // from class: ghe
            @Override // p000.ohe.InterfaceC10381d
            public final Object produce() {
                return ohe.lambda$ensureBeginTransaction$24(sQLiteDatabase);
            }
        }, new InterfaceC10379b() { // from class: hhe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$ensureBeginTransaction$25((Throwable) obj);
            }
        });
    }

    private long ensureTransportContext(SQLiteDatabase sQLiteDatabase, chh chhVar) {
        Long transportContextId = getTransportContextId(sQLiteDatabase, chhVar);
        if (transportContextId != null) {
            return transportContextId.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", chhVar.getBackendName());
        contentValues.put("priority", Integer.valueOf(gcd.toInt(chhVar.getPriority())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (chhVar.getExtras() != null) {
            contentValues.put("extras", Base64.encodeToString(chhVar.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private n77 getGlobalMetrics() {
        return n77.newBuilder().setStorageMetrics(i5g.newBuilder().setCurrentCacheSizeBytes(m18706A()).setMaxCacheSizeBytes(u65.f86875f.mo22066f()).build()).build();
    }

    private long getPageCount() {
        return m18707B().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long getPageSize() {
        return m18707B().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f1h getTimeWindow() {
        final long time = this.f67650b.getTime();
        return (f1h) m18708C(new InterfaceC10379b() { // from class: che
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$getTimeWindow$22(time, (SQLiteDatabase) obj);
            }
        });
    }

    @hib
    private Long getTransportContextId(SQLiteDatabase sQLiteDatabase, chh chhVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(chhVar.getBackendName(), String.valueOf(gcd.toInt(chhVar.getPriority()))));
        if (chhVar.getExtras() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(chhVar.getExtras(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m18679D(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new InterfaceC10379b() { // from class: oge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$getTransportContextId$2((Cursor) obj);
            }
        });
    }

    private boolean isStorageAtLimit() {
        return getPageCount() * getPageSize() >= this.f67652d.mo22066f();
    }

    private List<gqc> join(List<gqc> list, Map<Long, Set<C10380c>> map) {
        ListIterator<gqc> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            gqc next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.getId()))) {
                a65.AbstractC0073a builder = next.getEvent().toBuilder();
                for (C10380c c10380c : map.get(Long.valueOf(next.getId()))) {
                    builder.addMetadata(c10380c.f67654a, c10380c.f67655b);
                }
                listIterator.set(gqc.create(next.getId(), next.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$cleanUp$11(Cursor cursor) {
        while (cursor.moveToNext()) {
            recordLogEventDropped(cursor.getInt(0), ei9.EnumC5322b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$cleanUp$12(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m18679D(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC10379b() { // from class: fhe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f36605a.lambda$cleanUp$11((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$clearDb$13(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$ensureBeginTransaction$24(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$ensureBeginTransaction$25(Throwable th) {
        throw new uhg("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase lambda$getDb$0(Throwable th) {
        throw new uhg("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getNextCallTime$5(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f1h lambda$getTimeWindow$21(long j, Cursor cursor) {
        cursor.moveToNext();
        return f1h.newBuilder().setStartMs(cursor.getLong(0)).setEndMs(j).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f1h lambda$getTimeWindow$22(final long j, SQLiteDatabase sQLiteDatabase) {
        return (f1h) m18679D(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC10379b() { // from class: ehe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$getTimeWindow$21(j, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getTransportContextId$2(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasPendingEventsFor$6(chh chhVar, SQLiteDatabase sQLiteDatabase) {
        Long transportContextId = getTransportContextId(sQLiteDatabase, chhVar);
        return transportContextId == null ? Boolean.FALSE : (Boolean) m18679D(m18707B().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{transportContextId.toString()}), new InterfaceC10379b() { // from class: ihe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$loadActiveContexts$10(SQLiteDatabase sQLiteDatabase) {
        return (List) m18679D(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new InterfaceC10379b() { // from class: zge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$loadActiveContexts$9((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$loadActiveContexts$9(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(chh.builder().setBackendName(cursor.getString(1)).setPriority(gcd.valueOf(cursor.getInt(2))).setExtras(maybeBase64Decode(cursor.getString(3))).build());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$loadBatch$8(chh chhVar, SQLiteDatabase sQLiteDatabase) {
        List<gqc> listLoadEvents = loadEvents(sQLiteDatabase, chhVar, this.f67652d.mo22064d());
        for (acd acdVar : acd.values()) {
            if (acdVar != chhVar.getPriority()) {
                int iMo22064d = this.f67652d.mo22064d() - listLoadEvents.size();
                if (iMo22064d <= 0) {
                    break;
                }
                listLoadEvents.addAll(loadEvents(sQLiteDatabase, chhVar.withPriority(acdVar), iMo22064d));
            }
        }
        return join(listLoadEvents, loadMetadata(sQLiteDatabase, listLoadEvents));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f42 lambda$loadClientMetrics$19(Map map, f42.C5588a c5588a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            ei9.EnumC5322b enumC5322bConvertToReason = convertToReason(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(ei9.newBuilder().setReason(enumC5322bConvertToReason).setEventsDroppedCount(j).build());
        }
        populateLogSourcesMetrics(c5588a, map);
        return c5588a.setWindow(getTimeWindow()).setGlobalMetrics(getGlobalMetrics()).setAppNamespace(this.f67653e.get()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f42 lambda$loadClientMetrics$20(String str, final Map map, final f42.C5588a c5588a, SQLiteDatabase sQLiteDatabase) {
        return (f42) m18679D(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC10379b() { // from class: sge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f81739a.lambda$loadClientMetrics$19(map, c5588a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadEvents$14(List list, chh chhVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            a65.AbstractC0073a uptimeMillis = a65.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
            if (z) {
                uptimeMillis.setEncodedPayload(new k15(toEncoding(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                uptimeMillis.setEncodedPayload(new k15(toEncoding(cursor.getString(4)), readPayload(j)));
            }
            if (!cursor.isNull(6)) {
                uptimeMillis.setCode(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                uptimeMillis.setProductId(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                uptimeMillis.setPseudonymousId(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                uptimeMillis.setExperimentIdsClear(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                uptimeMillis.setExperimentIdsEncrypted(cursor.getBlob(11));
            }
            list.add(gqc.create(j, chhVar, uptimeMillis.build()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$loadMetadata$16(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new C10380c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$persist$1(a65 a65Var, chh chhVar, SQLiteDatabase sQLiteDatabase) {
        if (isStorageAtLimit()) {
            recordLogEventDropped(1L, ei9.EnumC5322b.CACHE_FULL, a65Var.getTransportName());
            return -1L;
        }
        long jEnsureTransportContext = ensureTransportContext(sQLiteDatabase, chhVar);
        int iMo22065e = this.f67652d.mo22065e();
        byte[] bytes = a65Var.getEncodedPayload().getBytes();
        boolean z = bytes.length <= iMo22065e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jEnsureTransportContext));
        contentValues.put("transport_name", a65Var.getTransportName());
        contentValues.put("timestamp_ms", Long.valueOf(a65Var.getEventMillis()));
        contentValues.put("uptime_ms", Long.valueOf(a65Var.getUptimeMillis()));
        contentValues.put("payload_encoding", a65Var.getEncodedPayload().getEncoding().getName());
        contentValues.put(g55.f38796e, a65Var.getCode());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bytes : new byte[0]);
        contentValues.put("product_id", a65Var.getProductId());
        contentValues.put("pseudonymous_id", a65Var.getPseudonymousId());
        contentValues.put("experiment_ids_clear_blob", a65Var.getExperimentIdsClear());
        contentValues.put("experiment_ids_encrypted_blob", a65Var.getExperimentIdsEncrypted());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(((double) bytes.length) / ((double) iMo22065e));
            for (int i = 1; i <= iCeil; i++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bytes, (i - 1) * iMo22065e, Math.min(i * iMo22065e, bytes.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : a65Var.getMetadata().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$readPayload$15(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$recordFailure$3(Cursor cursor) {
        while (cursor.moveToNext()) {
            recordLogEventDropped(cursor.getInt(0), ei9.EnumC5322b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$recordFailure$4(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m18679D(sQLiteDatabase.rawQuery(str2, null), new InterfaceC10379b() { // from class: nhe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f64557a.lambda$recordFailure$3((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$recordLogEventDropped$17(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$recordLogEventDropped$18(String str, ei9.EnumC5322b enumC5322b, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m18679D(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC5322b.getNumber())}), new InterfaceC10379b() { // from class: pge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$recordLogEventDropped$17((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC5322b.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC5322b.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$recordNextCallTime$7(long j, chh chhVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{chhVar.getBackendName(), String.valueOf(gcd.toInt(chhVar.getPriority()))}) < 1) {
            contentValues.put("backend_name", chhVar.getBackendName());
            contentValues.put("priority", Integer.valueOf(gcd.toInt(chhVar.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$resetClientMetrics$23(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f67650b.getTime()).execute();
        return null;
    }

    private List<gqc> loadEvents(SQLiteDatabase sQLiteDatabase, final chh chhVar, int i) {
        final ArrayList arrayList = new ArrayList();
        Long transportContextId = getTransportContextId(sQLiteDatabase, chhVar);
        if (transportContextId == null) {
            return arrayList;
        }
        m18679D(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", g55.f38796e, "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{transportContextId.toString()}, null, null, null, String.valueOf(i)), new InterfaceC10379b() { // from class: nge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f64475a.lambda$loadEvents$14(arrayList, chhVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<C10380c>> loadMetadata(SQLiteDatabase sQLiteDatabase, List<gqc> list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getId());
            if (i < list.size() - 1) {
                sb.append(C4584d2.f28238g);
            }
        }
        sb.append(')');
        m18679D(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new InterfaceC10379b() { // from class: vge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$loadMetadata$16(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] maybeBase64Decode(@hib String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void populateLogSourcesMetrics(f42.C5588a c5588a, Map<String, List<ei9>> map) {
        for (Map.Entry<String, List<ei9>> entry : map.entrySet()) {
            c5588a.addLogSourceMetrics(ri9.newBuilder().setLogSource(entry.getKey()).setLogEventDroppedList(entry.getValue()).build());
        }
    }

    private byte[] readPayload(long j) {
        return (byte[]) m18679D(m18707B().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new InterfaceC10379b() { // from class: ahe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$readPayload$15((Cursor) obj);
            }
        });
    }

    private <T> T retryIfDbLocked(InterfaceC10381d<T> interfaceC10381d, InterfaceC10379b<Throwable, T> interfaceC10379b) {
        long time = this.f67651c.getTime();
        while (true) {
            try {
                return interfaceC10381d.produce();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f67651c.getTime() >= ((long) this.f67652d.mo22062b()) + time) {
                    return interfaceC10379b.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static q15 toEncoding(@hib String str) {
        return str == null ? f67646F : q15.m19986of(str);
    }

    private static String toIdList(Iterable<gqc> iterable) {
        StringBuilder sb = new StringBuilder(c0b.f15433c);
        Iterator<gqc> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getId());
            if (it.hasNext()) {
                sb.append(C4584d2.f28238g);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @fdi
    /* JADX INFO: renamed from: A */
    public long m18706A() {
        return getPageCount() * getPageSize();
    }

    @fdi
    /* JADX INFO: renamed from: B */
    public SQLiteDatabase m18707B() {
        final fqe fqeVar = this.f67649a;
        Objects.requireNonNull(fqeVar);
        return (SQLiteDatabase) retryIfDbLocked(new InterfaceC10381d() { // from class: lhe
            @Override // p000.ohe.InterfaceC10381d
            public final Object produce() {
                return fqeVar.getWritableDatabase();
            }
        }, new InterfaceC10379b() { // from class: mhe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$getDb$0((Throwable) obj);
            }
        });
    }

    @fdi
    /* JADX INFO: renamed from: C */
    public <T> T m18708C(InterfaceC10379b<SQLiteDatabase, T> interfaceC10379b) {
        SQLiteDatabase sQLiteDatabaseM18707B = m18707B();
        sQLiteDatabaseM18707B.beginTransaction();
        try {
            T tApply = interfaceC10379b.apply(sQLiteDatabaseM18707B);
            sQLiteDatabaseM18707B.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseM18707B.endTransaction();
        }
    }

    @Override // p000.t65
    public int cleanUp() {
        final long time = this.f67650b.getTime() - this.f67652d.mo22063c();
        return ((Integer) m18708C(new InterfaceC10379b() { // from class: wge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f94212a.lambda$cleanUp$12(time, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @p7e({p7e.EnumC10826a.f69938e})
    public void clearDb() {
        m18708C(new InterfaceC10379b() { // from class: jhe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$clearDb$13((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f67649a.close();
    }

    @Override // p000.t65
    public long getNextCallTime(chh chhVar) {
        return ((Long) m18679D(m18707B().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{chhVar.getBackendName(), String.valueOf(gcd.toInt(chhVar.getPriority()))}), new InterfaceC10379b() { // from class: dhe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$getNextCallTime$5((Cursor) obj);
            }
        })).longValue();
    }

    @Override // p000.t65
    public boolean hasPendingEventsFor(final chh chhVar) {
        return ((Boolean) m18708C(new InterfaceC10379b() { // from class: rge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f78245a.lambda$hasPendingEventsFor$6(chhVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // p000.t65
    public Iterable<chh> loadActiveContexts() {
        return (Iterable) m18708C(new InterfaceC10379b() { // from class: bhe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$loadActiveContexts$10((SQLiteDatabase) obj);
            }
        });
    }

    @Override // p000.t65
    public Iterable<gqc> loadBatch(final chh chhVar) {
        return (Iterable) m18708C(new InterfaceC10379b() { // from class: khe
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f54153a.lambda$loadBatch$8(chhVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p000.b42
    public f42 loadClientMetrics() {
        final f42.C5588a c5588aNewBuilder = f42.newBuilder();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (f42) m18708C(new InterfaceC10379b() { // from class: mge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f60970a.lambda$loadClientMetrics$20(str, map, c5588aNewBuilder, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p000.t65
    @hib
    public gqc persist(final chh chhVar, final a65 a65Var) {
        tj9.m22695d(f67647f, "Storing event with priority=%s, name=%s for destination %s", chhVar.getPriority(), a65Var.getTransportName(), chhVar.getBackendName());
        long jLongValue = ((Long) m18708C(new InterfaceC10379b() { // from class: qge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f74391a.lambda$persist$1(a65Var, chhVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return gqc.create(jLongValue, chhVar, a65Var);
    }

    @Override // p000.t65
    public void recordFailure(Iterable<gqc> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + toIdList(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m18708C(new InterfaceC10379b() { // from class: xge
                @Override // p000.ohe.InterfaceC10379b
                public final Object apply(Object obj) {
                    return this.f97729a.lambda$recordFailure$4(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // p000.b42
    public void recordLogEventDropped(final long j, final ei9.EnumC5322b enumC5322b, final String str) {
        m18708C(new InterfaceC10379b() { // from class: yge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$recordLogEventDropped$18(str, enumC5322b, j, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p000.t65
    public void recordNextCallTime(final chh chhVar, final long j) {
        m18708C(new InterfaceC10379b() { // from class: tge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return ohe.lambda$recordNextCallTime$7(j, chhVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p000.t65
    public void recordSuccess(Iterable<gqc> iterable) {
        if (iterable.iterator().hasNext()) {
            m18707B().compileStatement("DELETE FROM events WHERE _id in " + toIdList(iterable)).execute();
        }
    }

    @Override // p000.b42
    public void resetClientMetrics() {
        m18708C(new InterfaceC10379b() { // from class: uge
            @Override // p000.ohe.InterfaceC10379b
            public final Object apply(Object obj) {
                return this.f87988a.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
            }
        });
    }

    @Override // p000.vhg
    public <T> T runCriticalSection(vhg.InterfaceC14075a<T> interfaceC14075a) {
        SQLiteDatabase sQLiteDatabaseM18707B = m18707B();
        ensureBeginTransaction(sQLiteDatabaseM18707B);
        try {
            T tExecute = interfaceC14075a.execute();
            sQLiteDatabaseM18707B.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseM18707B.endTransaction();
        }
    }
}
