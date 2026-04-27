package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p000.flg;
import p000.ymh;

/* JADX INFO: loaded from: classes3.dex */
public final class glg {
    private static final Map<String, flg.C5880a> readColumns(wfg wfgVar, String str) {
        Cursor cursorQuery = wfgVar.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorQuery.getColumnCount() <= 0) {
                Map<String, flg.C5880a> mapEmptyMap = xt9.emptyMap();
                u52.closeFinally(cursorQuery, null);
                return mapEmptyMap;
            }
            int columnIndex = cursorQuery.getColumnIndex("name");
            int columnIndex2 = cursorQuery.getColumnIndex("type");
            int columnIndex3 = cursorQuery.getColumnIndex("notnull");
            int columnIndex4 = cursorQuery.getColumnIndex("pk");
            int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
            Map mapCreateMapBuilder = wt9.createMapBuilder();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndex);
                String string2 = cursorQuery.getString(columnIndex2);
                boolean z = cursorQuery.getInt(columnIndex3) != 0;
                int i = cursorQuery.getInt(columnIndex4);
                String string3 = cursorQuery.getString(columnIndex5);
                md8.checkNotNullExpressionValue(string, "name");
                md8.checkNotNullExpressionValue(string2, "type");
                mapCreateMapBuilder.put(string, new flg.C5880a(string, string2, z, i, string3, 2));
            }
            Map<String, flg.C5880a> mapBuild = wt9.build(mapCreateMapBuilder);
            u52.closeFinally(cursorQuery, null);
            return mapBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u52.closeFinally(cursorQuery, th);
                throw th2;
            }
        }
    }

    private static final List<flg.C5884e> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(ymh.InterfaceC15729h.f102263c);
        int columnIndex4 = cursor.getColumnIndex("to");
        List listCreateListBuilder = k82.createListBuilder();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            md8.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            md8.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            listCreateListBuilder.add(new flg.C5884e(i, i2, string, string2));
        }
        return v82.sorted(k82.build(listCreateListBuilder));
    }

    private static final Set<flg.C5883d> readForeignKeys(wfg wfgVar, String str) {
        Cursor cursorQuery = wfgVar.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("id");
            int columnIndex2 = cursorQuery.getColumnIndex("seq");
            int columnIndex3 = cursorQuery.getColumnIndex("table");
            int columnIndex4 = cursorQuery.getColumnIndex("on_delete");
            int columnIndex5 = cursorQuery.getColumnIndex("on_update");
            List<flg.C5884e> foreignKeyFieldMappings = readForeignKeyFieldMappings(cursorQuery);
            cursorQuery.moveToPosition(-1);
            Set setCreateSetBuilder = v6f.createSetBuilder();
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.getInt(columnIndex2) == 0) {
                    int i = cursorQuery.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<flg.C5884e> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((flg.C5884e) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (flg.C5884e c5884e : arrayList3) {
                        arrayList.add(c5884e.getFrom());
                        arrayList2.add(c5884e.getTo());
                    }
                    String string = cursorQuery.getString(columnIndex3);
                    md8.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorQuery.getString(columnIndex4);
                    md8.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorQuery.getString(columnIndex5);
                    md8.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    setCreateSetBuilder.add(new flg.C5883d(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<flg.C5883d> setBuild = v6f.build(setCreateSetBuilder);
            u52.closeFinally(cursorQuery, null);
            return setBuild;
        } finally {
        }
    }

    private static final flg.C5885f readIndex(wfg wfgVar, String str, boolean z) {
        Cursor cursorQuery = wfgVar.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            int columnIndex4 = cursorQuery.getColumnIndex(g55.f38798g);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        int i = cursorQuery.getInt(columnIndex);
                        String string = cursorQuery.getString(columnIndex3);
                        String str2 = cursorQuery.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        md8.checkNotNullExpressionValue(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                md8.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List list = v82.toList(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                md8.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                flg.C5885f c5885f = new flg.C5885f(str, z, list, v82.toList(collectionValues2));
                u52.closeFinally(cursorQuery, null);
                return c5885f;
            }
            u52.closeFinally(cursorQuery, null);
            return null;
        } finally {
        }
    }

    private static final Set<flg.C5885f> readIndices(wfg wfgVar, String str) {
        Cursor cursorQuery = wfgVar.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("name");
            int columnIndex2 = cursorQuery.getColumnIndex("origin");
            int columnIndex3 = cursorQuery.getColumnIndex(n35.f63115b);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setCreateSetBuilder = v6f.createSetBuilder();
                while (cursorQuery.moveToNext()) {
                    if (md8.areEqual("c", cursorQuery.getString(columnIndex2))) {
                        String string = cursorQuery.getString(columnIndex);
                        boolean z = true;
                        if (cursorQuery.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        md8.checkNotNullExpressionValue(string, "name");
                        flg.C5885f index = readIndex(wfgVar, string, z);
                        if (index == null) {
                            u52.closeFinally(cursorQuery, null);
                            return null;
                        }
                        setCreateSetBuilder.add(index);
                    }
                }
                Set<flg.C5885f> setBuild = v6f.build(setCreateSetBuilder);
                u52.closeFinally(cursorQuery, null);
                return setBuild;
            }
            u52.closeFinally(cursorQuery, null);
            return null;
        } finally {
        }
    }

    @yfb
    public static final flg readTableInfo(@yfb wfg wfgVar, @yfb String str) {
        md8.checkNotNullParameter(wfgVar, "database");
        md8.checkNotNullParameter(str, "tableName");
        return new flg(str, readColumns(wfgVar, str), readForeignKeys(wfgVar, str), readIndices(wfgVar, str));
    }
}
