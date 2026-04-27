package com.eyevue.glassapp.database.aichat;

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
public final class AiChatMessageDatabase_Impl extends AiChatMessageDatabase {
    private volatile AiChatMessageDao _aiChatMessageDao;

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `AiChat`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "AiChat");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 configuration) {
        return configuration.f64638c.create(xfg.C15047b.builder(configuration.f64636a).name(configuration.f64637b).callback(new wae(configuration, new wae.AbstractC14529b(1) { // from class: com.eyevue.glassapp.database.aichat.AiChatMessageDatabase_Impl.1
            @Override // p000.wae.AbstractC14529b
            public void createAllTables(wfg _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `AiChat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `msgId` TEXT, `msgType` INTEGER NOT NULL, `messageTime` INTEGER NOT NULL, `content` TEXT, `voicePath` TEXT, `imagePath` TEXT)");
                _db.execSQL(vae.f90482g);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '47ad3e8cc849f9b2ceff0566aa684282')");
            }

            @Override // p000.wae.AbstractC14529b
            public void dropAllTables(wfg _db) {
                _db.execSQL("DROP TABLE IF EXISTS `AiChat`");
                if (((uae) AiChatMessageDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) AiChatMessageDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) AiChatMessageDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onCreate(wfg _db) {
                if (((uae) AiChatMessageDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) AiChatMessageDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) AiChatMessageDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onOpen(wfg _db) {
                ((uae) AiChatMessageDatabase_Impl.this).mDatabase = _db;
                AiChatMessageDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (((uae) AiChatMessageDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) AiChatMessageDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) AiChatMessageDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
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
                HashMap map = new HashMap(7);
                map.put("id", new flg.C5880a("id", "INTEGER", true, 1, null, 1));
                map.put("msgId", new flg.C5880a("msgId", "TEXT", false, 0, null, 1));
                map.put("msgType", new flg.C5880a("msgType", "INTEGER", true, 0, null, 1));
                map.put("messageTime", new flg.C5880a("messageTime", "INTEGER", true, 0, null, 1));
                map.put("content", new flg.C5880a("content", "TEXT", false, 0, null, 1));
                map.put("voicePath", new flg.C5880a("voicePath", "TEXT", false, 0, null, 1));
                map.put("imagePath", new flg.C5880a("imagePath", "TEXT", false, 0, null, 1));
                flg flgVar = new flg("AiChat", map, new HashSet(0), new HashSet(0));
                flg flgVar2 = flg.read(_db, "AiChat");
                if (flgVar.equals(flgVar2)) {
                    return new wae.C14530c(true, null);
                }
                return new wae.C14530c(false, "AiChat(com.eyevue.glassapp.database.aichat.AiChatMessage).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
            }
        }, "47ad3e8cc849f9b2ceff0566aa684282", "f89df65324adcd0ef579ea6e670801bf")).build());
    }

    @Override // p000.uae
    public List<ova> getAutoMigrations(@efb Map<Class<? extends zi0>, zi0> autoMigrationSpecsMap) {
        return Arrays.asList(new ova[0]);
    }

    @Override // p000.uae
    public Set<Class<? extends zi0>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // p000.uae
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(AiChatMessageDao.class, AiChatMessageDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.eyevue.glassapp.database.aichat.AiChatMessageDatabase
    public AiChatMessageDao messageDao() {
        AiChatMessageDao aiChatMessageDao;
        if (this._aiChatMessageDao != null) {
            return this._aiChatMessageDao;
        }
        synchronized (this) {
            try {
                if (this._aiChatMessageDao == null) {
                    this._aiChatMessageDao = new AiChatMessageDao_Impl(this);
                }
                aiChatMessageDao = this._aiChatMessageDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aiChatMessageDao;
    }
}
