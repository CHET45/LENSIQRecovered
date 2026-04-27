package p000;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1158q;
import androidx.work.C1507b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p000.oqi;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
public final class qqi implements pqi {

    /* JADX INFO: renamed from: a */
    public final uae f75152a;

    /* JADX INFO: renamed from: b */
    public final l35<oqi> f75153b;

    /* JADX INFO: renamed from: c */
    public final caf f75154c;

    /* JADX INFO: renamed from: d */
    public final caf f75155d;

    /* JADX INFO: renamed from: e */
    public final caf f75156e;

    /* JADX INFO: renamed from: f */
    public final caf f75157f;

    /* JADX INFO: renamed from: g */
    public final caf f75158g;

    /* JADX INFO: renamed from: h */
    public final caf f75159h;

    /* JADX INFO: renamed from: i */
    public final caf f75160i;

    /* JADX INFO: renamed from: j */
    public final caf f75161j;

    /* JADX INFO: renamed from: qqi$a */
    public class CallableC11589a implements Callable<List<String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xae f75162a;

        public CallableC11589a(final xae val$_statement) {
            this.f75162a = val$_statement;
        }

        public void finalize() {
            this.f75162a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<String> call() throws Exception {
            qqi.this.f75152a.beginTransaction();
            try {
                Cursor cursorQuery = pe3.query(qqi.this.f75152a, this.f75162a, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(cursorQuery.getString(0));
                    }
                    qqi.this.f75152a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                qqi.this.f75152a.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: qqi$b */
    public class CallableC11590b implements Callable<List<oqi.C10507c>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xae f75164a;

        public CallableC11590b(final xae val$_statement) {
            this.f75164a = val$_statement;
        }

        public void finalize() {
            this.f75164a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<oqi.C10507c> call() throws Exception {
            qqi.this.f75152a.beginTransaction();
            try {
                Cursor cursorQuery = pe3.query(qqi.this.f75152a, this.f75164a, true, null);
                try {
                    int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    x60 x60Var = new x60();
                    x60 x60Var2 = new x60();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) x60Var.get(string)) == null) {
                                x60Var.put(string, new ArrayList());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) x60Var2.get(string2)) == null) {
                                x60Var2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    qqi.this.__fetchRelationshipWorkTagAsjavaLangString(x60Var);
                    qqi.this.__fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) x60Var.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) x60Var2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        oqi.C10507c c10507c = new oqi.C10507c();
                        c10507c.f68357a = cursorQuery.getString(columnIndexOrThrow);
                        c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        c10507c.f68360d = cursorQuery.getInt(columnIndexOrThrow4);
                        c10507c.f68361e = arrayList2;
                        c10507c.f68362f = arrayList3;
                        arrayList.add(c10507c);
                    }
                    qqi.this.f75152a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                qqi.this.f75152a.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: qqi$c */
    public class CallableC11591c implements Callable<List<oqi.C10507c>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xae f75166a;

        public CallableC11591c(final xae val$_statement) {
            this.f75166a = val$_statement;
        }

        public void finalize() {
            this.f75166a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<oqi.C10507c> call() throws Exception {
            qqi.this.f75152a.beginTransaction();
            try {
                Cursor cursorQuery = pe3.query(qqi.this.f75152a, this.f75166a, true, null);
                try {
                    int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    x60 x60Var = new x60();
                    x60 x60Var2 = new x60();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) x60Var.get(string)) == null) {
                                x60Var.put(string, new ArrayList());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) x60Var2.get(string2)) == null) {
                                x60Var2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    qqi.this.__fetchRelationshipWorkTagAsjavaLangString(x60Var);
                    qqi.this.__fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) x60Var.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) x60Var2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        oqi.C10507c c10507c = new oqi.C10507c();
                        c10507c.f68357a = cursorQuery.getString(columnIndexOrThrow);
                        c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        c10507c.f68360d = cursorQuery.getInt(columnIndexOrThrow4);
                        c10507c.f68361e = arrayList2;
                        c10507c.f68362f = arrayList3;
                        arrayList.add(c10507c);
                    }
                    qqi.this.f75152a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                qqi.this.f75152a.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: qqi$d */
    public class CallableC11592d implements Callable<List<oqi.C10507c>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xae f75168a;

        public CallableC11592d(final xae val$_statement) {
            this.f75168a = val$_statement;
        }

        public void finalize() {
            this.f75168a.release();
        }

        @Override // java.util.concurrent.Callable
        public List<oqi.C10507c> call() throws Exception {
            qqi.this.f75152a.beginTransaction();
            try {
                Cursor cursorQuery = pe3.query(qqi.this.f75152a, this.f75168a, true, null);
                try {
                    int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    x60 x60Var = new x60();
                    x60 x60Var2 = new x60();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) x60Var.get(string)) == null) {
                                x60Var.put(string, new ArrayList());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (((ArrayList) x60Var2.get(string2)) == null) {
                                x60Var2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    qqi.this.__fetchRelationshipWorkTagAsjavaLangString(x60Var);
                    qqi.this.__fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) x60Var.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? (ArrayList) x60Var2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        oqi.C10507c c10507c = new oqi.C10507c();
                        c10507c.f68357a = cursorQuery.getString(columnIndexOrThrow);
                        c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        c10507c.f68360d = cursorQuery.getInt(columnIndexOrThrow4);
                        c10507c.f68361e = arrayList2;
                        c10507c.f68362f = arrayList3;
                        arrayList.add(c10507c);
                    }
                    qqi.this.f75152a.setTransactionSuccessful();
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } finally {
                qqi.this.f75152a.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: qqi$e */
    public class CallableC11593e implements Callable<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xae f75170a;

        public CallableC11593e(final xae val$_statement) {
            this.f75170a = val$_statement;
        }

        public void finalize() {
            this.f75170a.release();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = pe3.query(qqi.this.f75152a, this.f75170a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: qqi$f */
    public class C11594f extends l35<oqi> {
        public C11594f(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, oqi oqiVar) throws Throwable {
            String str = oqiVar.f68337a;
            if (str == null) {
                bggVar.bindNull(1);
            } else {
                bggVar.bindString(1, str);
            }
            bggVar.bindLong(2, vqi.stateToInt(oqiVar.f68338b));
            String str2 = oqiVar.f68339c;
            if (str2 == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, str2);
            }
            String str3 = oqiVar.f68340d;
            if (str3 == null) {
                bggVar.bindNull(4);
            } else {
                bggVar.bindString(4, str3);
            }
            byte[] byteArrayInternal = C1507b.toByteArrayInternal(oqiVar.f68341e);
            if (byteArrayInternal == null) {
                bggVar.bindNull(5);
            } else {
                bggVar.bindBlob(5, byteArrayInternal);
            }
            byte[] byteArrayInternal2 = C1507b.toByteArrayInternal(oqiVar.f68342f);
            if (byteArrayInternal2 == null) {
                bggVar.bindNull(6);
            } else {
                bggVar.bindBlob(6, byteArrayInternal2);
            }
            bggVar.bindLong(7, oqiVar.f68343g);
            bggVar.bindLong(8, oqiVar.f68344h);
            bggVar.bindLong(9, oqiVar.f68345i);
            bggVar.bindLong(10, oqiVar.f68347k);
            bggVar.bindLong(11, vqi.backoffPolicyToInt(oqiVar.f68348l));
            bggVar.bindLong(12, oqiVar.f68349m);
            bggVar.bindLong(13, oqiVar.f68350n);
            bggVar.bindLong(14, oqiVar.f68351o);
            bggVar.bindLong(15, oqiVar.f68352p);
            bggVar.bindLong(16, oqiVar.f68353q ? 1L : 0L);
            bggVar.bindLong(17, vqi.outOfQuotaPolicyToInt(oqiVar.f68354r));
            lu2 lu2Var = oqiVar.f68346j;
            if (lu2Var == null) {
                bggVar.bindNull(18);
                bggVar.bindNull(19);
                bggVar.bindNull(20);
                bggVar.bindNull(21);
                bggVar.bindNull(22);
                bggVar.bindNull(23);
                bggVar.bindNull(24);
                bggVar.bindNull(25);
                return;
            }
            bggVar.bindLong(18, vqi.networkTypeToInt(lu2Var.getRequiredNetworkType()));
            bggVar.bindLong(19, lu2Var.requiresCharging() ? 1L : 0L);
            bggVar.bindLong(20, lu2Var.requiresDeviceIdle() ? 1L : 0L);
            bggVar.bindLong(21, lu2Var.requiresBatteryNotLow() ? 1L : 0L);
            bggVar.bindLong(22, lu2Var.requiresStorageNotLow() ? 1L : 0L);
            bggVar.bindLong(23, lu2Var.getTriggerContentUpdateDelay());
            bggVar.bindLong(24, lu2Var.getTriggerMaxContentDelay());
            byte[] bArrContentUriTriggersToByteArray = vqi.contentUriTriggersToByteArray(lu2Var.getContentUriTriggers());
            if (bArrContentUriTriggersToByteArray == null) {
                bggVar.bindNull(25);
            } else {
                bggVar.bindBlob(25, bArrContentUriTriggersToByteArray);
            }
        }
    }

    /* JADX INFO: renamed from: qqi$g */
    public class C11595g extends caf {
        public C11595g(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: qqi$h */
    public class C11596h extends caf {
        public C11596h(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: qqi$i */
    public class C11597i extends caf {
        public C11597i(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: qqi$j */
    public class C11598j extends caf {
        public C11598j(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: qqi$k */
    public class C11599k extends caf {
        public C11599k(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: qqi$l */
    public class C11600l extends caf {
        public C11600l(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: qqi$m */
    public class C11601m extends caf {
        public C11601m(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: qqi$n */
    public class C11602n extends caf {
        public C11602n(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public qqi(uae __db) {
        this.f75152a = __db;
        this.f75153b = new C11594f(__db);
        this.f75154c = new C11595g(__db);
        this.f75155d = new C11596h(__db);
        this.f75156e = new C11597i(__db);
        this.f75157f = new C11598j(__db);
        this.f75158g = new C11599k(__db);
        this.f75159h = new C11600l(__db);
        this.f75160i = new C11601m(__db);
        this.f75161j = new C11602n(__db);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(final x60<String, ArrayList<C1507b>> _map) {
        ArrayList<C1507b> arrayList;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            x60<String, ArrayList<C1507b>> x60Var = new x60<>(999);
            int size = _map.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                x60Var.put(_map.keyAt(i), _map.valueAt(i));
                i++;
                i2++;
                if (i2 == 999) {
                    __fetchRelationshipWorkProgressAsandroidxWorkData(x60Var);
                    x60Var = new x60<>(999);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(x60Var);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = k8g.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        k8g.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(c0b.f15434d);
        xae xaeVarAcquire = xae.acquire(sbNewStringBuilder.toString(), size2);
        int i3 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                xaeVarAcquire.bindNull(i3);
            } else {
                xaeVarAcquire.bindString(i3, str);
            }
            i3++;
        }
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            int columnIndex = bb3.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex) && (arrayList = _map.get(cursorQuery.getString(columnIndex))) != null) {
                    arrayList.add(C1507b.fromByteArray(cursorQuery.getBlob(0)));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(final x60<String, ArrayList<String>> _map) {
        ArrayList<String> arrayList;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            x60<String, ArrayList<String>> x60Var = new x60<>(999);
            int size = _map.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                x60Var.put(_map.keyAt(i), _map.valueAt(i));
                i++;
                i2++;
                if (i2 == 999) {
                    __fetchRelationshipWorkTagAsjavaLangString(x60Var);
                    x60Var = new x60<>(999);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(x60Var);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = k8g.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        k8g.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(c0b.f15434d);
        xae xaeVarAcquire = xae.acquire(sbNewStringBuilder.toString(), size2);
        int i3 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                xaeVarAcquire.bindNull(i3);
            } else {
                xaeVarAcquire.bindString(i3, str);
            }
            i3++;
        }
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            int columnIndex = bb3.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex) && (arrayList = _map.get(cursorQuery.getString(columnIndex))) != null) {
                    arrayList.add(cursorQuery.getString(0));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    @Override // p000.pqi
    public void delete(final String id) {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75154c.acquire();
        if (id == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, id);
        }
        this.f75152a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
        } finally {
            this.f75152a.endTransaction();
            this.f75154c.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public List<oqi> getAllEligibleWorkSpecsForScheduling(final int maxLimit) throws Throwable {
        xae xaeVar;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        xae xaeVarAcquire = xae.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        xaeVarAcquire.bindLong(1, maxLimit);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = bb3.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = bb3.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = bb3.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = bb3.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = bb3.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i2 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i3 = columnIndexOrThrow11;
                lu2 lu2Var = new lu2();
                int i4 = columnIndexOrThrow;
                lu2Var.setRequiredNetworkType(vqi.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                lu2Var.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                lu2Var.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                lu2Var.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                lu2Var.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                lu2Var.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                lu2Var.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                lu2Var.setContentUriTriggers(vqi.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                oqi oqiVar = new oqi(string, string2);
                oqiVar.f68338b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                oqiVar.f68340d = cursorQuery.getString(columnIndexOrThrow12);
                oqiVar.f68341e = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i7 = i;
                oqiVar.f68342f = C1507b.fromByteArray(cursorQuery.getBlob(i7));
                i = i7;
                int i8 = columnIndexOrThrow15;
                oqiVar.f68343g = cursorQuery.getLong(i8);
                int i9 = columnIndexOrThrow12;
                int i10 = columnIndexOrThrow16;
                oqiVar.f68344h = cursorQuery.getLong(i10);
                int i11 = columnIndexOrThrow4;
                int i12 = columnIndexOrThrow17;
                oqiVar.f68345i = cursorQuery.getLong(i12);
                int i13 = columnIndexOrThrow18;
                oqiVar.f68347k = cursorQuery.getInt(i13);
                int i14 = columnIndexOrThrow19;
                oqiVar.f68348l = vqi.intToBackoffPolicy(cursorQuery.getInt(i14));
                columnIndexOrThrow17 = i12;
                int i15 = columnIndexOrThrow20;
                oqiVar.f68349m = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow21;
                oqiVar.f68350n = cursorQuery.getLong(i16);
                columnIndexOrThrow21 = i16;
                int i17 = columnIndexOrThrow22;
                oqiVar.f68351o = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow23;
                oqiVar.f68352p = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow24;
                oqiVar.f68353q = cursorQuery.getInt(i19) != 0;
                int i20 = columnIndexOrThrow25;
                oqiVar.f68354r = vqi.intToOutOfQuotaPolicy(cursorQuery.getInt(i20));
                oqiVar.f68346j = lu2Var;
                arrayList.add(oqiVar);
                columnIndexOrThrow25 = i20;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow12 = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow23 = i18;
                columnIndexOrThrow9 = i2;
                columnIndexOrThrow11 = i3;
                columnIndexOrThrow = i4;
                columnIndexOrThrow24 = i19;
                columnIndexOrThrow22 = i17;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow20 = i15;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow19 = i14;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.pqi
    public List<String> getAllUnfinishedWork() {
        xae xaeVarAcquire = xae.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public List<String> getAllWorkSpecIds() {
        xae xaeVarAcquire = xae.acquire("SELECT id FROM workspec", 0);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public AbstractC1158q<List<String>> getAllWorkSpecIdsLiveData() {
        return this.f75152a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new CallableC11589a(xae.acquire("SELECT id FROM workspec", 0)));
    }

    @Override // p000.pqi
    public List<oqi> getEligibleWorkForScheduling(final int schedulerLimit) throws Throwable {
        xae xaeVar;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        xae xaeVarAcquire = xae.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        xaeVarAcquire.bindLong(1, schedulerLimit);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = bb3.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = bb3.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = bb3.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = bb3.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = bb3.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i2 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i3 = columnIndexOrThrow11;
                lu2 lu2Var = new lu2();
                int i4 = columnIndexOrThrow;
                lu2Var.setRequiredNetworkType(vqi.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                lu2Var.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                lu2Var.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                lu2Var.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                lu2Var.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                lu2Var.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                lu2Var.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                lu2Var.setContentUriTriggers(vqi.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                oqi oqiVar = new oqi(string, string2);
                oqiVar.f68338b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                oqiVar.f68340d = cursorQuery.getString(columnIndexOrThrow12);
                oqiVar.f68341e = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i7 = i;
                oqiVar.f68342f = C1507b.fromByteArray(cursorQuery.getBlob(i7));
                i = i7;
                int i8 = columnIndexOrThrow15;
                oqiVar.f68343g = cursorQuery.getLong(i8);
                int i9 = columnIndexOrThrow12;
                int i10 = columnIndexOrThrow16;
                oqiVar.f68344h = cursorQuery.getLong(i10);
                int i11 = columnIndexOrThrow4;
                int i12 = columnIndexOrThrow17;
                oqiVar.f68345i = cursorQuery.getLong(i12);
                int i13 = columnIndexOrThrow18;
                oqiVar.f68347k = cursorQuery.getInt(i13);
                int i14 = columnIndexOrThrow19;
                oqiVar.f68348l = vqi.intToBackoffPolicy(cursorQuery.getInt(i14));
                columnIndexOrThrow17 = i12;
                int i15 = columnIndexOrThrow20;
                oqiVar.f68349m = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow21;
                oqiVar.f68350n = cursorQuery.getLong(i16);
                columnIndexOrThrow21 = i16;
                int i17 = columnIndexOrThrow22;
                oqiVar.f68351o = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow23;
                oqiVar.f68352p = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow24;
                oqiVar.f68353q = cursorQuery.getInt(i19) != 0;
                int i20 = columnIndexOrThrow25;
                oqiVar.f68354r = vqi.intToOutOfQuotaPolicy(cursorQuery.getInt(i20));
                oqiVar.f68346j = lu2Var;
                arrayList.add(oqiVar);
                columnIndexOrThrow25 = i20;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow12 = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow23 = i18;
                columnIndexOrThrow9 = i2;
                columnIndexOrThrow11 = i3;
                columnIndexOrThrow = i4;
                columnIndexOrThrow24 = i19;
                columnIndexOrThrow22 = i17;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow20 = i15;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow19 = i14;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.pqi
    public List<C1507b> getInputsFromPrerequisites(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(C1507b.fromByteArray(cursorQuery.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public List<oqi> getRecentlyCompletedWork(final long startingAt) throws Throwable {
        xae xaeVar;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        xae xaeVarAcquire = xae.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        xaeVarAcquire.bindLong(1, startingAt);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = bb3.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = bb3.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = bb3.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = bb3.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = bb3.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i2 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i3 = columnIndexOrThrow11;
                lu2 lu2Var = new lu2();
                int i4 = columnIndexOrThrow;
                lu2Var.setRequiredNetworkType(vqi.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                lu2Var.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                lu2Var.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                lu2Var.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                lu2Var.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                lu2Var.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                lu2Var.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                lu2Var.setContentUriTriggers(vqi.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                oqi oqiVar = new oqi(string, string2);
                oqiVar.f68338b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                oqiVar.f68340d = cursorQuery.getString(columnIndexOrThrow12);
                oqiVar.f68341e = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i7 = i;
                oqiVar.f68342f = C1507b.fromByteArray(cursorQuery.getBlob(i7));
                int i8 = columnIndexOrThrow15;
                i = i7;
                oqiVar.f68343g = cursorQuery.getLong(i8);
                int i9 = columnIndexOrThrow12;
                int i10 = columnIndexOrThrow16;
                oqiVar.f68344h = cursorQuery.getLong(i10);
                int i11 = columnIndexOrThrow4;
                int i12 = columnIndexOrThrow17;
                oqiVar.f68345i = cursorQuery.getLong(i12);
                int i13 = columnIndexOrThrow18;
                oqiVar.f68347k = cursorQuery.getInt(i13);
                int i14 = columnIndexOrThrow19;
                oqiVar.f68348l = vqi.intToBackoffPolicy(cursorQuery.getInt(i14));
                columnIndexOrThrow17 = i12;
                int i15 = columnIndexOrThrow20;
                oqiVar.f68349m = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow21;
                oqiVar.f68350n = cursorQuery.getLong(i16);
                columnIndexOrThrow21 = i16;
                int i17 = columnIndexOrThrow22;
                oqiVar.f68351o = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow23;
                oqiVar.f68352p = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow24;
                oqiVar.f68353q = cursorQuery.getInt(i19) != 0;
                int i20 = columnIndexOrThrow25;
                oqiVar.f68354r = vqi.intToOutOfQuotaPolicy(cursorQuery.getInt(i20));
                oqiVar.f68346j = lu2Var;
                arrayList.add(oqiVar);
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow25 = i20;
                columnIndexOrThrow12 = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow23 = i18;
                columnIndexOrThrow9 = i2;
                columnIndexOrThrow11 = i3;
                columnIndexOrThrow = i4;
                columnIndexOrThrow24 = i19;
                columnIndexOrThrow22 = i17;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow20 = i15;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow19 = i14;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.pqi
    public List<oqi> getRunningWork() throws Throwable {
        xae xaeVar;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        xae xaeVarAcquire = xae.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = bb3.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = bb3.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = bb3.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = bb3.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = bb3.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i2 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i3 = columnIndexOrThrow11;
                lu2 lu2Var = new lu2();
                int i4 = columnIndexOrThrow;
                lu2Var.setRequiredNetworkType(vqi.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                lu2Var.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                lu2Var.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                lu2Var.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                lu2Var.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                lu2Var.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                lu2Var.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                lu2Var.setContentUriTriggers(vqi.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                oqi oqiVar = new oqi(string, string2);
                oqiVar.f68338b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                oqiVar.f68340d = cursorQuery.getString(columnIndexOrThrow12);
                oqiVar.f68341e = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i7 = i;
                oqiVar.f68342f = C1507b.fromByteArray(cursorQuery.getBlob(i7));
                i = i7;
                int i8 = columnIndexOrThrow15;
                oqiVar.f68343g = cursorQuery.getLong(i8);
                int i9 = columnIndexOrThrow13;
                int i10 = columnIndexOrThrow16;
                oqiVar.f68344h = cursorQuery.getLong(i10);
                int i11 = columnIndexOrThrow4;
                int i12 = columnIndexOrThrow17;
                oqiVar.f68345i = cursorQuery.getLong(i12);
                int i13 = columnIndexOrThrow18;
                oqiVar.f68347k = cursorQuery.getInt(i13);
                int i14 = columnIndexOrThrow19;
                oqiVar.f68348l = vqi.intToBackoffPolicy(cursorQuery.getInt(i14));
                columnIndexOrThrow17 = i12;
                int i15 = columnIndexOrThrow20;
                oqiVar.f68349m = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow21;
                oqiVar.f68350n = cursorQuery.getLong(i16);
                columnIndexOrThrow21 = i16;
                int i17 = columnIndexOrThrow22;
                oqiVar.f68351o = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow23;
                oqiVar.f68352p = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow24;
                oqiVar.f68353q = cursorQuery.getInt(i19) != 0;
                int i20 = columnIndexOrThrow25;
                oqiVar.f68354r = vqi.intToOutOfQuotaPolicy(cursorQuery.getInt(i20));
                oqiVar.f68346j = lu2Var;
                arrayList.add(oqiVar);
                columnIndexOrThrow25 = i20;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow13 = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow23 = i18;
                columnIndexOrThrow9 = i2;
                columnIndexOrThrow11 = i3;
                columnIndexOrThrow = i4;
                columnIndexOrThrow24 = i19;
                columnIndexOrThrow22 = i17;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow20 = i15;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow19 = i14;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.pqi
    public AbstractC1158q<Long> getScheduleRequestedAtLiveData(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        return this.f75152a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new CallableC11593e(xaeVarAcquire));
    }

    @Override // p000.pqi
    public List<oqi> getScheduledWork() throws Throwable {
        xae xaeVar;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        xae xaeVarAcquire = xae.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = bb3.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = bb3.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = bb3.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = bb3.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = bb3.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            int i = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i2 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i3 = columnIndexOrThrow11;
                lu2 lu2Var = new lu2();
                int i4 = columnIndexOrThrow;
                lu2Var.setRequiredNetworkType(vqi.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                lu2Var.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                lu2Var.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                lu2Var.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                lu2Var.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                lu2Var.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                lu2Var.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                lu2Var.setContentUriTriggers(vqi.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                oqi oqiVar = new oqi(string, string2);
                oqiVar.f68338b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                oqiVar.f68340d = cursorQuery.getString(columnIndexOrThrow12);
                oqiVar.f68341e = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                int i7 = i;
                oqiVar.f68342f = C1507b.fromByteArray(cursorQuery.getBlob(i7));
                i = i7;
                int i8 = columnIndexOrThrow15;
                oqiVar.f68343g = cursorQuery.getLong(i8);
                int i9 = columnIndexOrThrow13;
                int i10 = columnIndexOrThrow16;
                oqiVar.f68344h = cursorQuery.getLong(i10);
                int i11 = columnIndexOrThrow4;
                int i12 = columnIndexOrThrow17;
                oqiVar.f68345i = cursorQuery.getLong(i12);
                int i13 = columnIndexOrThrow18;
                oqiVar.f68347k = cursorQuery.getInt(i13);
                int i14 = columnIndexOrThrow19;
                oqiVar.f68348l = vqi.intToBackoffPolicy(cursorQuery.getInt(i14));
                columnIndexOrThrow17 = i12;
                int i15 = columnIndexOrThrow20;
                oqiVar.f68349m = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow21;
                oqiVar.f68350n = cursorQuery.getLong(i16);
                columnIndexOrThrow21 = i16;
                int i17 = columnIndexOrThrow22;
                oqiVar.f68351o = cursorQuery.getLong(i17);
                int i18 = columnIndexOrThrow23;
                oqiVar.f68352p = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow24;
                oqiVar.f68353q = cursorQuery.getInt(i19) != 0;
                int i20 = columnIndexOrThrow25;
                oqiVar.f68354r = vqi.intToOutOfQuotaPolicy(cursorQuery.getInt(i20));
                oqiVar.f68346j = lu2Var;
                arrayList.add(oqiVar);
                columnIndexOrThrow25 = i20;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow13 = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow23 = i18;
                columnIndexOrThrow9 = i2;
                columnIndexOrThrow11 = i3;
                columnIndexOrThrow = i4;
                columnIndexOrThrow24 = i19;
                columnIndexOrThrow22 = i17;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow20 = i15;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow19 = i14;
            }
            cursorQuery.close();
            xaeVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.pqi
    public tpi.EnumC13161a getState(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? vqi.intToState(cursorQuery.getInt(0)) : null;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public List<String> getUnfinishedWorkWithName(final String name) {
        xae xaeVarAcquire = xae.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, name);
        }
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public List<String> getUnfinishedWorkWithTag(final String tag) {
        xae xaeVarAcquire = xae.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, tag);
        }
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public oqi getWorkSpec(final String id) throws Throwable {
        xae xaeVar;
        oqi oqiVar;
        xae xaeVarAcquire = xae.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
            xaeVar = xaeVarAcquire;
            try {
                int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = bb3.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = bb3.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = bb3.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = bb3.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = bb3.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    lu2 lu2Var = new lu2();
                    lu2Var.setRequiredNetworkType(vqi.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    lu2Var.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    lu2Var.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    lu2Var.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    lu2Var.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    lu2Var.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    lu2Var.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    lu2Var.setContentUriTriggers(vqi.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    oqi oqiVar2 = new oqi(string, string2);
                    oqiVar2.f68338b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    oqiVar2.f68340d = cursorQuery.getString(columnIndexOrThrow12);
                    oqiVar2.f68341e = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    oqiVar2.f68342f = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow14));
                    oqiVar2.f68343g = cursorQuery.getLong(columnIndexOrThrow15);
                    oqiVar2.f68344h = cursorQuery.getLong(columnIndexOrThrow16);
                    oqiVar2.f68345i = cursorQuery.getLong(columnIndexOrThrow17);
                    oqiVar2.f68347k = cursorQuery.getInt(columnIndexOrThrow18);
                    oqiVar2.f68348l = vqi.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow19));
                    oqiVar2.f68349m = cursorQuery.getLong(columnIndexOrThrow20);
                    oqiVar2.f68350n = cursorQuery.getLong(columnIndexOrThrow21);
                    oqiVar2.f68351o = cursorQuery.getLong(columnIndexOrThrow22);
                    oqiVar2.f68352p = cursorQuery.getLong(columnIndexOrThrow23);
                    oqiVar2.f68353q = cursorQuery.getInt(columnIndexOrThrow24) != 0;
                    oqiVar2.f68354r = vqi.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow25));
                    oqiVar2.f68346j = lu2Var;
                    oqiVar = oqiVar2;
                } else {
                    oqiVar = null;
                }
                cursorQuery.close();
                xaeVar.release();
                return oqiVar;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                xaeVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xaeVar = xaeVarAcquire;
        }
    }

    @Override // p000.pqi
    public List<oqi.C10506b> getWorkSpecIdAndStatesForName(final String name) {
        xae xaeVarAcquire = xae.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, name);
        }
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                oqi.C10506b c10506b = new oqi.C10506b();
                c10506b.f68355a = cursorQuery.getString(columnIndexOrThrow);
                c10506b.f68356b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                arrayList.add(c10506b);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public oqi[] getWorkSpecs(final List<String> ids) throws Throwable {
        xae xaeVar;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        StringBuilder sbNewStringBuilder = k8g.newStringBuilder();
        sbNewStringBuilder.append("SELECT ");
        sbNewStringBuilder.append("*");
        sbNewStringBuilder.append(" FROM workspec WHERE id IN (");
        int size = ids.size();
        k8g.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(c0b.f15434d);
        xae xaeVarAcquire = xae.acquire(sbNewStringBuilder.toString(), size);
        int i = 1;
        for (String str : ids) {
            if (str == null) {
                xaeVarAcquire.bindNull(i);
            } else {
                xaeVarAcquire.bindString(i, str);
            }
            i++;
        }
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
            columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            columnIndexOrThrow12 = bb3.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            columnIndexOrThrow13 = bb3.getColumnIndexOrThrow(cursorQuery, "input");
            columnIndexOrThrow14 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
            xaeVar = xaeVarAcquire;
        } catch (Throwable th) {
            th = th;
            xaeVar = xaeVarAcquire;
        }
        try {
            int columnIndexOrThrow15 = bb3.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow16 = bb3.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow17 = bb3.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow18 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow19 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow20 = bb3.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow21 = bb3.getColumnIndexOrThrow(cursorQuery, "period_start_time");
            int columnIndexOrThrow22 = bb3.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            int columnIndexOrThrow23 = bb3.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
            int columnIndexOrThrow24 = bb3.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
            int columnIndexOrThrow25 = bb3.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
            oqi[] oqiVarArr = new oqi[cursorQuery.getCount()];
            int i2 = 0;
            while (cursorQuery.moveToNext()) {
                oqi[] oqiVarArr2 = oqiVarArr;
                String string = cursorQuery.getString(columnIndexOrThrow9);
                int i3 = columnIndexOrThrow9;
                String string2 = cursorQuery.getString(columnIndexOrThrow11);
                int i4 = columnIndexOrThrow11;
                lu2 lu2Var = new lu2();
                int i5 = columnIndexOrThrow;
                lu2Var.setRequiredNetworkType(vqi.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                lu2Var.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                lu2Var.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                lu2Var.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                lu2Var.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                int i6 = columnIndexOrThrow2;
                int i7 = columnIndexOrThrow3;
                lu2Var.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                lu2Var.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                lu2Var.setContentUriTriggers(vqi.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                oqi oqiVar = new oqi(string, string2);
                oqiVar.f68338b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                oqiVar.f68340d = cursorQuery.getString(columnIndexOrThrow12);
                oqiVar.f68341e = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                oqiVar.f68342f = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow14));
                int i8 = columnIndexOrThrow14;
                int i9 = columnIndexOrThrow15;
                oqiVar.f68343g = cursorQuery.getLong(i9);
                columnIndexOrThrow15 = i9;
                int i10 = columnIndexOrThrow16;
                oqiVar.f68344h = cursorQuery.getLong(i10);
                int i11 = columnIndexOrThrow12;
                int i12 = columnIndexOrThrow17;
                oqiVar.f68345i = cursorQuery.getLong(i12);
                int i13 = columnIndexOrThrow18;
                oqiVar.f68347k = cursorQuery.getInt(i13);
                int i14 = columnIndexOrThrow19;
                oqiVar.f68348l = vqi.intToBackoffPolicy(cursorQuery.getInt(i14));
                columnIndexOrThrow17 = i12;
                int i15 = columnIndexOrThrow20;
                oqiVar.f68349m = cursorQuery.getLong(i15);
                int i16 = columnIndexOrThrow21;
                oqiVar.f68350n = cursorQuery.getLong(i16);
                columnIndexOrThrow21 = i16;
                int i17 = columnIndexOrThrow22;
                oqiVar.f68351o = cursorQuery.getLong(i17);
                columnIndexOrThrow22 = i17;
                int i18 = columnIndexOrThrow23;
                oqiVar.f68352p = cursorQuery.getLong(i18);
                int i19 = columnIndexOrThrow24;
                oqiVar.f68353q = cursorQuery.getInt(i19) != 0;
                int i20 = columnIndexOrThrow25;
                oqiVar.f68354r = vqi.intToOutOfQuotaPolicy(cursorQuery.getInt(i20));
                oqiVar.f68346j = lu2Var;
                oqiVarArr2[i2] = oqiVar;
                i2++;
                columnIndexOrThrow25 = i20;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow23 = i18;
                oqiVarArr = oqiVarArr2;
                columnIndexOrThrow9 = i3;
                columnIndexOrThrow11 = i4;
                columnIndexOrThrow = i5;
                columnIndexOrThrow24 = i19;
                columnIndexOrThrow14 = i8;
                columnIndexOrThrow3 = i7;
                columnIndexOrThrow20 = i15;
                columnIndexOrThrow12 = i11;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow19 = i14;
            }
            oqi[] oqiVarArr3 = oqiVarArr;
            cursorQuery.close();
            xaeVar.release();
            return oqiVarArr3;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery.close();
            xaeVar.release();
            throw th;
        }
    }

    @Override // p000.pqi
    public oqi.C10507c getWorkStatusPojoForId(String str) {
        xae xaeVarAcquire = xae.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (str == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, str);
        }
        this.f75152a.assertNotSuspendingTransaction();
        this.f75152a.beginTransaction();
        try {
            oqi.C10507c c10507c = null;
            Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, true, null);
            try {
                int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                x60<String, ArrayList<String>> x60Var = new x60<>();
                x60<String, ArrayList<C1507b>> x60Var2 = new x60<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var.get(string) == null) {
                            x60Var.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var2.get(string2) == null) {
                            x60Var2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(x60Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                if (cursorQuery.moveToFirst()) {
                    ArrayList<String> arrayList = !cursorQuery.isNull(columnIndexOrThrow) ? x60Var.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<C1507b> arrayList2 = cursorQuery.isNull(columnIndexOrThrow) ? null : x60Var2.get(cursorQuery.getString(columnIndexOrThrow));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    oqi.C10507c c10507c2 = new oqi.C10507c();
                    c10507c2.f68357a = cursorQuery.getString(columnIndexOrThrow);
                    c10507c2.f68358b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    c10507c2.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    c10507c2.f68360d = cursorQuery.getInt(columnIndexOrThrow4);
                    c10507c2.f68361e = arrayList;
                    c10507c2.f68362f = arrayList2;
                    c10507c = c10507c2;
                }
                this.f75152a.setTransactionSuccessful();
                cursorQuery.close();
                xaeVarAcquire.release();
                return c10507c;
            } catch (Throwable th) {
                cursorQuery.close();
                xaeVarAcquire.release();
                throw th;
            }
        } finally {
            this.f75152a.endTransaction();
        }
    }

    @Override // p000.pqi
    public List<oqi.C10507c> getWorkStatusPojoForIds(final List<String> ids) {
        StringBuilder sbNewStringBuilder = k8g.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        k8g.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(c0b.f15434d);
        xae xaeVarAcquire = xae.acquire(sbNewStringBuilder.toString(), size);
        int i = 1;
        for (String str : ids) {
            if (str == null) {
                xaeVarAcquire.bindNull(i);
            } else {
                xaeVarAcquire.bindString(i, str);
            }
            i++;
        }
        this.f75152a.assertNotSuspendingTransaction();
        this.f75152a.beginTransaction();
        try {
            Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, true, null);
            try {
                int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                x60<String, ArrayList<String>> x60Var = new x60<>();
                x60<String, ArrayList<C1507b>> x60Var2 = new x60<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var.get(string) == null) {
                            x60Var.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var2.get(string2) == null) {
                            x60Var2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(x60Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? x60Var.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<C1507b> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? x60Var2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    oqi.C10507c c10507c = new oqi.C10507c();
                    c10507c.f68357a = cursorQuery.getString(columnIndexOrThrow);
                    c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    c10507c.f68360d = cursorQuery.getInt(columnIndexOrThrow4);
                    c10507c.f68361e = arrayList2;
                    c10507c.f68362f = arrayList3;
                    arrayList.add(c10507c);
                }
                this.f75152a.setTransactionSuccessful();
                cursorQuery.close();
                xaeVarAcquire.release();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                xaeVarAcquire.release();
                throw th;
            }
        } finally {
            this.f75152a.endTransaction();
        }
    }

    @Override // p000.pqi
    public List<oqi.C10507c> getWorkStatusPojoForName(final String name) {
        xae xaeVarAcquire = xae.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, name);
        }
        this.f75152a.assertNotSuspendingTransaction();
        this.f75152a.beginTransaction();
        try {
            Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, true, null);
            try {
                int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                x60<String, ArrayList<String>> x60Var = new x60<>();
                x60<String, ArrayList<C1507b>> x60Var2 = new x60<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var.get(string) == null) {
                            x60Var.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var2.get(string2) == null) {
                            x60Var2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(x60Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? x60Var.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<C1507b> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? x60Var2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    oqi.C10507c c10507c = new oqi.C10507c();
                    c10507c.f68357a = cursorQuery.getString(columnIndexOrThrow);
                    c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    c10507c.f68360d = cursorQuery.getInt(columnIndexOrThrow4);
                    c10507c.f68361e = arrayList2;
                    c10507c.f68362f = arrayList3;
                    arrayList.add(c10507c);
                }
                this.f75152a.setTransactionSuccessful();
                cursorQuery.close();
                xaeVarAcquire.release();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                xaeVarAcquire.release();
                throw th;
            }
        } finally {
            this.f75152a.endTransaction();
        }
    }

    @Override // p000.pqi
    public List<oqi.C10507c> getWorkStatusPojoForTag(final String tag) {
        xae xaeVarAcquire = xae.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, tag);
        }
        this.f75152a.assertNotSuspendingTransaction();
        this.f75152a.beginTransaction();
        try {
            Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, true, null);
            try {
                int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                x60<String, ArrayList<String>> x60Var = new x60<>();
                x60<String, ArrayList<C1507b>> x60Var2 = new x60<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var.get(string) == null) {
                            x60Var.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (x60Var2.get(string2) == null) {
                            x60Var2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(x60Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? x60Var.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<C1507b> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? x60Var2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    oqi.C10507c c10507c = new oqi.C10507c();
                    c10507c.f68357a = cursorQuery.getString(columnIndexOrThrow);
                    c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    c10507c.f68360d = cursorQuery.getInt(columnIndexOrThrow4);
                    c10507c.f68361e = arrayList2;
                    c10507c.f68362f = arrayList3;
                    arrayList.add(c10507c);
                }
                this.f75152a.setTransactionSuccessful();
                cursorQuery.close();
                xaeVarAcquire.release();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                xaeVarAcquire.release();
                throw th;
            }
        } finally {
            this.f75152a.endTransaction();
        }
    }

    @Override // p000.pqi
    public AbstractC1158q<List<oqi.C10507c>> getWorkStatusPojoLiveDataForIds(final List<String> ids) {
        StringBuilder sbNewStringBuilder = k8g.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        k8g.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(c0b.f15434d);
        xae xaeVarAcquire = xae.acquire(sbNewStringBuilder.toString(), size);
        int i = 1;
        for (String str : ids) {
            if (str == null) {
                xaeVarAcquire.bindNull(i);
            } else {
                xaeVarAcquire.bindString(i, str);
            }
            i++;
        }
        return this.f75152a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new CallableC11590b(xaeVarAcquire));
    }

    @Override // p000.pqi
    public AbstractC1158q<List<oqi.C10507c>> getWorkStatusPojoLiveDataForName(final String name) {
        xae xaeVarAcquire = xae.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, name);
        }
        return this.f75152a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new CallableC11592d(xaeVarAcquire));
    }

    @Override // p000.pqi
    public AbstractC1158q<List<oqi.C10507c>> getWorkStatusPojoLiveDataForTag(final String tag) {
        xae xaeVarAcquire = xae.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, tag);
        }
        return this.f75152a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new CallableC11591c(xaeVarAcquire));
    }

    @Override // p000.pqi
    public boolean hasUnfinishedWork() {
        boolean z = false;
        xae xaeVarAcquire = xae.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f75152a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f75152a, xaeVarAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.pqi
    public int incrementWorkSpecRunAttemptCount(final String id) {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75157f.acquire();
        if (id == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, id);
        }
        this.f75152a.beginTransaction();
        try {
            int iExecuteUpdateDelete = bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f75152a.endTransaction();
            this.f75157f.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public void insertWorkSpec(final oqi workSpec) {
        this.f75152a.assertNotSuspendingTransaction();
        this.f75152a.beginTransaction();
        try {
            this.f75153b.insert(workSpec);
            this.f75152a.setTransactionSuccessful();
        } finally {
            this.f75152a.endTransaction();
        }
    }

    @Override // p000.pqi
    public int markWorkSpecScheduled(final String id, final long startTime) {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75159h.acquire();
        bggVarAcquire.bindLong(1, startTime);
        if (id == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, id);
        }
        this.f75152a.beginTransaction();
        try {
            int iExecuteUpdateDelete = bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f75152a.endTransaction();
            this.f75159h.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75161j.acquire();
        this.f75152a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
        } finally {
            this.f75152a.endTransaction();
            this.f75161j.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public int resetScheduledState() {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75160i.acquire();
        this.f75152a.beginTransaction();
        try {
            int iExecuteUpdateDelete = bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f75152a.endTransaction();
            this.f75160i.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public int resetWorkSpecRunAttemptCount(final String id) {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75158g.acquire();
        if (id == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, id);
        }
        this.f75152a.beginTransaction();
        try {
            int iExecuteUpdateDelete = bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f75152a.endTransaction();
            this.f75158g.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public void setOutput(final String id, final C1507b output) throws Throwable {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75155d.acquire();
        byte[] byteArrayInternal = C1507b.toByteArrayInternal(output);
        if (byteArrayInternal == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindBlob(1, byteArrayInternal);
        }
        if (id == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, id);
        }
        this.f75152a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
        } finally {
            this.f75152a.endTransaction();
            this.f75155d.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public void setPeriodStartTime(final String id, final long periodStartTime) {
        this.f75152a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f75156e.acquire();
        bggVarAcquire.bindLong(1, periodStartTime);
        if (id == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, id);
        }
        this.f75152a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
        } finally {
            this.f75152a.endTransaction();
            this.f75156e.release(bggVarAcquire);
        }
    }

    @Override // p000.pqi
    public int setState(final tpi.EnumC13161a state, final String... ids) {
        this.f75152a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = k8g.newStringBuilder();
        sbNewStringBuilder.append("UPDATE workspec SET state=");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE id IN (");
        k8g.appendPlaceholders(sbNewStringBuilder, ids.length);
        sbNewStringBuilder.append(c0b.f15434d);
        bgg bggVarCompileStatement = this.f75152a.compileStatement(sbNewStringBuilder.toString());
        bggVarCompileStatement.bindLong(1, vqi.stateToInt(state));
        int i = 2;
        for (String str : ids) {
            if (str == null) {
                bggVarCompileStatement.bindNull(i);
            } else {
                bggVarCompileStatement.bindString(i, str);
            }
            i++;
        }
        this.f75152a.beginTransaction();
        try {
            int iExecuteUpdateDelete = bggVarCompileStatement.executeUpdateDelete();
            this.f75152a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f75152a.endTransaction();
        }
    }
}
