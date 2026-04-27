package p000;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1158q;
import androidx.work.C1507b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p000.oqi;

/* JADX INFO: loaded from: classes3.dex */
public final class cqd implements bqd {

    /* JADX INFO: renamed from: a */
    public final uae f27104a;

    /* JADX INFO: renamed from: cqd$a */
    public class CallableC4466a implements Callable<List<oqi.C10507c>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zfg f27105a;

        public CallableC4466a(final zfg val$_internalQuery) {
            this.f27105a = val$_internalQuery;
        }

        @Override // java.util.concurrent.Callable
        public List<oqi.C10507c> call() throws Exception {
            Cursor cursorQuery = pe3.query(cqd.this.f27104a, this.f27105a, true, null);
            try {
                int columnIndex = bb3.getColumnIndex(cursorQuery, "id");
                int columnIndex2 = bb3.getColumnIndex(cursorQuery, "state");
                int columnIndex3 = bb3.getColumnIndex(cursorQuery, "output");
                int columnIndex4 = bb3.getColumnIndex(cursorQuery, "run_attempt_count");
                x60 x60Var = new x60();
                x60 x60Var2 = new x60();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string = cursorQuery.getString(columnIndex);
                        if (((ArrayList) x60Var.get(string)) == null) {
                            x60Var.put(string, new ArrayList());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string2 = cursorQuery.getString(columnIndex);
                        if (((ArrayList) x60Var2.get(string2)) == null) {
                            x60Var2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                cqd.this.__fetchRelationshipWorkTagAsjavaLangString(x60Var);
                cqd.this.__fetchRelationshipWorkProgressAsandroidxWorkData(x60Var2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList arrayList2 = !cursorQuery.isNull(columnIndex) ? (ArrayList) x60Var.get(cursorQuery.getString(columnIndex)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorQuery.isNull(columnIndex) ? (ArrayList) x60Var2.get(cursorQuery.getString(columnIndex)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    oqi.C10507c c10507c = new oqi.C10507c();
                    if (columnIndex != -1) {
                        c10507c.f68357a = cursorQuery.getString(columnIndex);
                    }
                    if (columnIndex2 != -1) {
                        c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndex2));
                    }
                    if (columnIndex3 != -1) {
                        c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndex3));
                    }
                    if (columnIndex4 != -1) {
                        c10507c.f68360d = cursorQuery.getInt(columnIndex4);
                    }
                    c10507c.f68361e = arrayList2;
                    c10507c.f68362f = arrayList3;
                    arrayList.add(c10507c);
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public cqd(uae __db) {
        this.f27104a = __db;
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
        Cursor cursorQuery = pe3.query(this.f27104a, xaeVarAcquire, false, null);
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
        Cursor cursorQuery = pe3.query(this.f27104a, xaeVarAcquire, false, null);
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

    @Override // p000.bqd
    public List<oqi.C10507c> getWorkInfoPojos(final zfg query) {
        this.f27104a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f27104a, query, true, null);
        try {
            int columnIndex = bb3.getColumnIndex(cursorQuery, "id");
            int columnIndex2 = bb3.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = bb3.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = bb3.getColumnIndex(cursorQuery, "run_attempt_count");
            x60<String, ArrayList<String>> x60Var = new x60<>();
            x60<String, ArrayList<C1507b>> x60Var2 = new x60<>();
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex)) {
                    String string = cursorQuery.getString(columnIndex);
                    if (x60Var.get(string) == null) {
                        x60Var.put(string, new ArrayList<>());
                    }
                }
                if (!cursorQuery.isNull(columnIndex)) {
                    String string2 = cursorQuery.getString(columnIndex);
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
                ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndex) ? x60Var.get(cursorQuery.getString(columnIndex)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<C1507b> arrayList3 = !cursorQuery.isNull(columnIndex) ? x60Var2.get(cursorQuery.getString(columnIndex)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                oqi.C10507c c10507c = new oqi.C10507c();
                if (columnIndex != -1) {
                    c10507c.f68357a = cursorQuery.getString(columnIndex);
                }
                if (columnIndex2 != -1) {
                    c10507c.f68358b = vqi.intToState(cursorQuery.getInt(columnIndex2));
                }
                if (columnIndex3 != -1) {
                    c10507c.f68359c = C1507b.fromByteArray(cursorQuery.getBlob(columnIndex3));
                }
                if (columnIndex4 != -1) {
                    c10507c.f68360d = cursorQuery.getInt(columnIndex4);
                }
                c10507c.f68361e = arrayList2;
                c10507c.f68362f = arrayList3;
                arrayList.add(c10507c);
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // p000.bqd
    public AbstractC1158q<List<oqi.C10507c>> getWorkInfoPojosLiveData(final zfg query) {
        return this.f27104a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new CallableC4466a(query));
    }
}
