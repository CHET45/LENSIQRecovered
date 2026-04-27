package com.watchfun.trans.database.p011ai;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.efb;
import p000.esa;
import p000.flg;
import p000.fsa;
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

/* JADX INFO: loaded from: classes6.dex */
public final class MyMessageDatabase_Impl extends MyMessageDatabase {

    /* JADX INFO: renamed from: a */
    public volatile esa f25309a;

    /* JADX INFO: renamed from: com.watchfun.trans.database.ai.MyMessageDatabase_Impl$a */
    public class C4036a extends wae.AbstractC14529b {
        public C4036a(int version) {
            super(version);
        }

        @Override // p000.wae.AbstractC14529b
        public void createAllTables(wfg _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `chatAiNew` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `result` TEXT, `type` INTEGER NOT NULL, `multipleOptions` INTEGER NOT NULL, `voicePath` TEXT, `voiceTime` INTEGER NOT NULL, `messageTime` INTEGER NOT NULL, `isPause` INTEGER NOT NULL)");
            _db.execSQL(vae.f90482g);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a7697841b34f841f7a5404b4e1a53427')");
        }

        @Override // p000.wae.AbstractC14529b
        public void dropAllTables(wfg _db) {
            _db.execSQL("DROP TABLE IF EXISTS `chatAiNew`");
            if (((uae) MyMessageDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) MyMessageDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) MyMessageDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onCreate(wfg _db) {
            if (((uae) MyMessageDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) MyMessageDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) MyMessageDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onOpen(wfg _db) {
            ((uae) MyMessageDatabase_Impl.this).mDatabase = _db;
            MyMessageDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (((uae) MyMessageDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) MyMessageDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) MyMessageDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(8);
            map.put("id", new flg.C5880a("id", "INTEGER", true, 1, null, 1));
            map.put("result", new flg.C5880a("result", "TEXT", false, 0, null, 1));
            map.put("type", new flg.C5880a("type", "INTEGER", true, 0, null, 1));
            map.put("multipleOptions", new flg.C5880a("multipleOptions", "INTEGER", true, 0, null, 1));
            map.put("voicePath", new flg.C5880a("voicePath", "TEXT", false, 0, null, 1));
            map.put("voiceTime", new flg.C5880a("voiceTime", "INTEGER", true, 0, null, 1));
            map.put("messageTime", new flg.C5880a("messageTime", "INTEGER", true, 0, null, 1));
            map.put("isPause", new flg.C5880a("isPause", "INTEGER", true, 0, null, 1));
            flg flgVar = new flg("chatAiNew", map, new HashSet(0), new HashSet(0));
            flg flgVar2 = flg.read(_db, "chatAiNew");
            if (flgVar.equals(flgVar2)) {
                return new wae.C14530c(true, null);
            }
            return new wae.C14530c(false, "chatAiNew(com.watchfun.trans.database.ai.AiMessage).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
        }
    }

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `chatAiNew`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "chatAiNew");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 configuration) {
        return configuration.f64638c.create(xfg.C15047b.builder(configuration.f64636a).name(configuration.f64637b).callback(new wae(configuration, new C4036a(1), "a7697841b34f841f7a5404b4e1a53427", "c70ba5cbac4aa8d0d518a8cd7057f25c")).build());
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
        map.put(esa.class, fsa.getRequiredConverters());
        return map;
    }

    @Override // com.watchfun.trans.database.p011ai.MyMessageDatabase
    public esa messageDao() {
        esa esaVar;
        if (this.f25309a != null) {
            return this.f25309a;
        }
        synchronized (this) {
            try {
                if (this.f25309a == null) {
                    this.f25309a = new fsa(this);
                }
                esaVar = this.f25309a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return esaVar;
    }
}
