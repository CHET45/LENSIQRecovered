package com.watchfun.trans.database.freedomTalk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.bx6;
import p000.cx6;
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

/* JADX INFO: loaded from: classes6.dex */
public final class FreedomTalkDatabase_Impl extends FreedomTalkDatabase {

    /* JADX INFO: renamed from: b */
    public volatile bx6 f25312b;

    /* JADX INFO: renamed from: com.watchfun.trans.database.freedomTalk.FreedomTalkDatabase_Impl$a */
    public class C4037a extends wae.AbstractC14529b {
        public C4037a(int version) {
            super(version);
        }

        @Override // p000.wae.AbstractC14529b
        public void createAllTables(wfg _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `freedomTalkAi` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `result` TEXT, `transResult` TEXT, `type` INTEGER NOT NULL, `multipleOptions` INTEGER NOT NULL, `voicePath` TEXT, `voiceTime` INTEGER NOT NULL, `messageTime` INTEGER NOT NULL, `isPause` INTEGER NOT NULL, `voiceName` TEXT, `isGptOrXF` INTEGER NOT NULL, `isLangCode` TEXT)");
            _db.execSQL(vae.f90482g);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e2d7b1d9f21cb886cfdad1d2b64d59e8')");
        }

        @Override // p000.wae.AbstractC14529b
        public void dropAllTables(wfg _db) {
            _db.execSQL("DROP TABLE IF EXISTS `freedomTalkAi`");
            if (((uae) FreedomTalkDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) FreedomTalkDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) FreedomTalkDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onCreate(wfg _db) {
            if (((uae) FreedomTalkDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) FreedomTalkDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) FreedomTalkDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onOpen(wfg _db) {
            ((uae) FreedomTalkDatabase_Impl.this).mDatabase = _db;
            FreedomTalkDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (((uae) FreedomTalkDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) FreedomTalkDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) FreedomTalkDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
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
            map.put("id", new flg.C5880a("id", "INTEGER", true, 1, null, 1));
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
            flg flgVar = new flg("freedomTalkAi", map, new HashSet(0), new HashSet(0));
            flg flgVar2 = flg.read(_db, "freedomTalkAi");
            if (flgVar.equals(flgVar2)) {
                return new wae.C14530c(true, null);
            }
            return new wae.C14530c(false, "freedomTalkAi(com.watchfun.trans.database.freedomTalk.FreedomTalkMessage).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
        }
    }

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `freedomTalkAi`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "freedomTalkAi");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 configuration) {
        return configuration.f64638c.create(xfg.C15047b.builder(configuration.f64636a).name(configuration.f64637b).callback(new wae(configuration, new C4037a(1), "e2d7b1d9f21cb886cfdad1d2b64d59e8", "80d117ec8aba24cb210052f1b0dab57a")).build());
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
        map.put(bx6.class, cx6.getRequiredConverters());
        return map;
    }

    @Override // com.watchfun.trans.database.freedomTalk.FreedomTalkDatabase
    public bx6 messageDao() {
        bx6 bx6Var;
        if (this.f25312b != null) {
            return this.f25312b;
        }
        synchronized (this) {
            try {
                if (this.f25312b == null) {
                    this.f25312b = new cx6(this);
                }
                bx6Var = this.f25312b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bx6Var;
    }
}
