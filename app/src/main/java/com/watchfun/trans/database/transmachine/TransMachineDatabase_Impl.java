package com.watchfun.trans.database.transmachine;

import androidx.appcompat.widget.C0546a;
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
import p000.uah;
import p000.vae;
import p000.vah;
import p000.wae;
import p000.wfg;
import p000.xfg;
import p000.zi0;

/* JADX INFO: loaded from: classes6.dex */
public final class TransMachineDatabase_Impl extends TransMachineDatabase {

    /* JADX INFO: renamed from: c */
    public volatile uah f25322c;

    /* JADX INFO: renamed from: com.watchfun.trans.database.transmachine.TransMachineDatabase_Impl$a */
    public class C4040a extends wae.AbstractC14529b {
        public C4040a(int version) {
            super(version);
        }

        @Override // p000.wae.AbstractC14529b
        public void createAllTables(wfg _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `transMachineMsg` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `result` TEXT, `transResult` TEXT, `type` INTEGER NOT NULL, `multipleOptions` INTEGER NOT NULL, `voicePath` TEXT, `voiceTime` INTEGER NOT NULL, `messageTime` INTEGER NOT NULL, `isPause` INTEGER NOT NULL, `voiceName` TEXT, `isGptOrXF` INTEGER NOT NULL, `isLangCode` TEXT, `sourceLanguage` TEXT, `transLanguage` TEXT, `isLanguageChange` INTEGER NOT NULL)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `transMachineRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `date` TEXT, `time` INTEGER NOT NULL, `sourcePcmPath` TEXT, `sourceVoicePath` TEXT, `transVoicePath` TEXT, `messageListJson` TEXT, `duration` INTEGER NOT NULL)");
            _db.execSQL(vae.f90482g);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd910e6494fb170581c5661f83921a2f5')");
        }

        @Override // p000.wae.AbstractC14529b
        public void dropAllTables(wfg _db) {
            _db.execSQL("DROP TABLE IF EXISTS `transMachineMsg`");
            _db.execSQL("DROP TABLE IF EXISTS `transMachineRecord`");
            if (((uae) TransMachineDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) TransMachineDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) TransMachineDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onCreate(wfg _db) {
            if (((uae) TransMachineDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) TransMachineDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) TransMachineDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onOpen(wfg _db) {
            ((uae) TransMachineDatabase_Impl.this).mDatabase = _db;
            TransMachineDatabase_Impl.this.internalInitInvalidationTracker(_db);
            if (((uae) TransMachineDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) TransMachineDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) TransMachineDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(15);
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
            map.put("sourceLanguage", new flg.C5880a("sourceLanguage", "TEXT", false, 0, null, 1));
            map.put("transLanguage", new flg.C5880a("transLanguage", "TEXT", false, 0, null, 1));
            map.put("isLanguageChange", new flg.C5880a("isLanguageChange", "INTEGER", true, 0, null, 1));
            flg flgVar = new flg("transMachineMsg", map, new HashSet(0), new HashSet(0));
            flg flgVar2 = flg.read(_db, "transMachineMsg");
            if (!flgVar.equals(flgVar2)) {
                return new wae.C14530c(false, "transMachineMsg(com.watchfun.trans.database.transmachine.TransMachineMessage).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
            }
            HashMap map2 = new HashMap(9);
            map2.put("id", new flg.C5880a("id", "INTEGER", true, 1, null, 1));
            map2.put("name", new flg.C5880a("name", "TEXT", false, 0, null, 1));
            map2.put("date", new flg.C5880a("date", "TEXT", false, 0, null, 1));
            map2.put(C0546a.f3357s, new flg.C5880a(C0546a.f3357s, "INTEGER", true, 0, null, 1));
            map2.put("sourcePcmPath", new flg.C5880a("sourcePcmPath", "TEXT", false, 0, null, 1));
            map2.put("sourceVoicePath", new flg.C5880a("sourceVoicePath", "TEXT", false, 0, null, 1));
            map2.put("transVoicePath", new flg.C5880a("transVoicePath", "TEXT", false, 0, null, 1));
            map2.put("messageListJson", new flg.C5880a("messageListJson", "TEXT", false, 0, null, 1));
            map2.put("duration", new flg.C5880a("duration", "INTEGER", true, 0, null, 1));
            flg flgVar3 = new flg("transMachineRecord", map2, new HashSet(0), new HashSet(0));
            flg flgVar4 = flg.read(_db, "transMachineRecord");
            if (flgVar3.equals(flgVar4)) {
                return new wae.C14530c(true, null);
            }
            return new wae.C14530c(false, "transMachineRecord(com.watchfun.trans.database.transmachine.TransMachineRecord).\n Expected:\n" + flgVar3 + "\n Found:\n" + flgVar4);
        }
    }

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `transMachineMsg`");
            writableDatabase.execSQL("DELETE FROM `transMachineRecord`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "transMachineMsg", "transMachineRecord");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 configuration) {
        return configuration.f64638c.create(xfg.C15047b.builder(configuration.f64636a).name(configuration.f64637b).callback(new wae(configuration, new C4040a(1), "d910e6494fb170581c5661f83921a2f5", "9969699a00e1912c2ee47a03805c732a")).build());
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
        map.put(uah.class, vah.getRequiredConverters());
        return map;
    }

    @Override // com.watchfun.trans.database.transmachine.TransMachineDatabase
    public uah messageDao() {
        uah uahVar;
        if (this.f25322c != null) {
            return this.f25322c;
        }
        synchronized (this) {
            try {
                if (this.f25322c == null) {
                    this.f25322c = new vah(this);
                }
                uahVar = this.f25322c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uahVar;
    }
}
