package com.eyevue.glassapp.database.realtimetranslation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.efb;
import p000.flg;
import p000.ke8;
import p000.ni3;
import p000.ova;
import p000.pe3;
import p000.uae;
import p000.vae;
import p000.wae;
import p000.wfg;
import p000.xfg;
import p000.zi0;

/* JADX INFO: loaded from: classes4.dex */
public final class RealTimeDatabase_Impl extends RealTimeDatabase {
    private volatile RealTimeMessageDao _realTimeMessageDao;

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `realtimeMessageTb`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // p000.uae
    public ke8 createInvalidationTracker() {
        return new ke8(this, new HashMap(0), new HashMap(0), "realtimeMessageTb");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 configuration) {
        return configuration.f64638c.create(xfg.C15047b.builder(configuration.f64636a).name(configuration.f64637b).callback(new wae(configuration, new wae.AbstractC14529b(1) { // from class: com.eyevue.glassapp.database.realtimetranslation.RealTimeDatabase_Impl.1
            @Override // p000.wae.AbstractC14529b
            public void createAllTables(wfg _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `realtimeMessageTb` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `result` TEXT, `transResult` TEXT, `type` INTEGER NOT NULL, `multipleOptions` INTEGER NOT NULL, `voicePath` TEXT, `voiceTime` INTEGER NOT NULL, `messageTime` INTEGER NOT NULL, `isPause` INTEGER NOT NULL, `voiceName` TEXT, `isGptOrXF` INTEGER NOT NULL, `isLangCode` TEXT)");
                _db.execSQL(vae.f90482g);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '156675a2796f140d9214f8b99b4dd463')");
            }

            @Override // p000.wae.AbstractC14529b
            public void dropAllTables(wfg _db) {
                _db.execSQL("DROP TABLE IF EXISTS `realtimeMessageTb`");
                if (((uae) RealTimeDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) RealTimeDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) RealTimeDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onCreate(wfg _db) {
                if (((uae) RealTimeDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) RealTimeDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) RealTimeDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onOpen(wfg _db) {
                ((uae) RealTimeDatabase_Impl.this).mDatabase = _db;
                RealTimeDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (((uae) RealTimeDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) RealTimeDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) RealTimeDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onPostMigrate(wfg _db) {
            }

            @Override // p000.wae.AbstractC14529b
            public void onPreMigrate(wfg _db) {
                pe3.dropFtsSyncTriggers(_db);
            }

            @Override // p000.wae.AbstractC14529b
            public wae.C14530c onValidateSchema(wfg _db) {
                HashMap map = new HashMap(12);
                map.put("id", new flg.C5880a("id", "INTEGER", false, 1, null, 1));
                map.put("result", new flg.C5880a("result", "TEXT", false, 0, null, 1));
                map.put("transResult", new flg.C5880a("transResult", "TEXT", false, 0, null, 1));
                map.put("type", new flg.C5880a("type", "INTEGER", true, 0, null, 1));
                map.put("multipleOptions", new flg.C5880a("multipleOptions", "INTEGER", true, 0, null, 1));
                map.put("voicePath", new flg.C5880a("voicePath", "TEXT", false, 0, null, 1));
                map.put("voiceTime", new flg.C5880a("voiceTime", "INTEGER", true, 0, null, 1));
                map.put("messageTime", new flg.C5880a("messageTime", "INTEGER", true, 0, null, 1));
                map.put("isPause", new flg.C5880a("isPause", "INTEGER", true, 0, null, 1));
                map.put("voiceName", new flg.C5880a("voiceName", "TEXT", false, 0, null, 1));
                map.put("isGptOrXF", new flg.C5880a("isGptOrXF", "INTEGER", true, 0, null, 1));
                map.put("isLangCode", new flg.C5880a("isLangCode", "TEXT", false, 0, null, 1));
                flg flgVar = new flg("realtimeMessageTb", map, new HashSet(0), new HashSet(0));
                flg flgVar2 = flg.read(_db, "realtimeMessageTb");
                if (flgVar.equals(flgVar2)) {
                    return new wae.C14530c(true, null);
                }
                return new wae.C14530c(false, "realtimeMessageTb(com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageTb).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
            }
        }, "156675a2796f140d9214f8b99b4dd463", "34ed8101bd55535abcf9cace3c01716f")).build());
    }

    @Override // p000.uae
    public List<ova> getAutoMigrations(@efb Map<Class<? extends zi0>, zi0> autoMigrationSpecsMap) {
        return Arrays.asList(new ova[0]);
    }

    @Override // com.eyevue.glassapp.database.realtimetranslation.RealTimeDatabase
    public RealTimeMessageDao getRealTimeMessageDao() {
        RealTimeMessageDao realTimeMessageDao;
        if (this._realTimeMessageDao != null) {
            return this._realTimeMessageDao;
        }
        synchronized (this) {
            try {
                if (this._realTimeMessageDao == null) {
                    this._realTimeMessageDao = new RealTimeMessageDao_Impl(this);
                }
                realTimeMessageDao = this._realTimeMessageDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return realTimeMessageDao;
    }

    @Override // p000.uae
    public Set<Class<? extends zi0>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // p000.uae
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RealTimeMessageDao.class, RealTimeMessageDao_Impl.getRequiredConverters());
        return map;
    }
}
