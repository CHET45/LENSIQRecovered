package com.watchfun.aichat.database;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.d27;
import p000.e27;
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
public final class GPTMessageDatabase_Impl extends GPTMessageDatabase {

    /* JADX INFO: renamed from: b */
    public volatile d27 f25034b;

    /* JADX INFO: renamed from: com.watchfun.aichat.database.GPTMessageDatabase_Impl$a */
    public class C3995a extends wae.AbstractC14529b {
        public C3995a(int i) {
            super(i);
        }

        @Override // p000.wae.AbstractC14529b
        public void createAllTables(wfg wfgVar) {
            wfgVar.execSQL("CREATE TABLE IF NOT EXISTS `gptAiChat` (`id` INTEGER NOT NULL, `defaultCharacters` TEXT, `reasoningResult` TEXT, `result` TEXT, `type` INTEGER NOT NULL, `multipleOptions` INTEGER NOT NULL, `voicePath` TEXT, `msgId` TEXT NOT NULL, `voiceTime` INTEGER NOT NULL, `messageTime` INTEGER NOT NULL, `isPause` INTEGER NOT NULL, PRIMARY KEY(`id`, `msgId`))");
            wfgVar.execSQL(vae.f90482g);
            wfgVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '217cfabaa270a3429bc4ebb61568052a')");
        }

        @Override // p000.wae.AbstractC14529b
        public void dropAllTables(wfg wfgVar) {
            wfgVar.execSQL("DROP TABLE IF EXISTS `gptAiChat`");
            if (((uae) GPTMessageDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) GPTMessageDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) GPTMessageDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(wfgVar);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onCreate(wfg wfgVar) {
            if (((uae) GPTMessageDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) GPTMessageDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) GPTMessageDatabase_Impl.this).mCallbacks.get(i)).onCreate(wfgVar);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onOpen(wfg wfgVar) {
            ((uae) GPTMessageDatabase_Impl.this).mDatabase = wfgVar;
            GPTMessageDatabase_Impl.this.internalInitInvalidationTracker(wfgVar);
            if (((uae) GPTMessageDatabase_Impl.this).mCallbacks != null) {
                int size = ((uae) GPTMessageDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((uae.AbstractC13433b) ((uae) GPTMessageDatabase_Impl.this).mCallbacks.get(i)).onOpen(wfgVar);
                }
            }
        }

        @Override // p000.wae.AbstractC14529b
        public void onPostMigrate(wfg wfgVar) {
        }

        @Override // p000.wae.AbstractC14529b
        public void onPreMigrate(wfg wfgVar) {
            pe3.dropFtsSyncTriggers(wfgVar);
        }

        @Override // p000.wae.AbstractC14529b
        public wae.C14530c onValidateSchema(wfg wfgVar) {
            HashMap map = new HashMap(11);
            map.put("id", new flg.C5880a("id", "INTEGER", true, 1, null, 1));
            map.put("defaultCharacters", new flg.C5880a("defaultCharacters", "TEXT", false, 0, null, 1));
            map.put("reasoningResult", new flg.C5880a("reasoningResult", "TEXT", false, 0, null, 1));
            map.put("result", new flg.C5880a("result", "TEXT", false, 0, null, 1));
            map.put("type", new flg.C5880a("type", "INTEGER", true, 0, null, 1));
            map.put("multipleOptions", new flg.C5880a("multipleOptions", "INTEGER", true, 0, null, 1));
            map.put("voicePath", new flg.C5880a("voicePath", "TEXT", false, 0, null, 1));
            map.put("msgId", new flg.C5880a("msgId", "TEXT", true, 2, null, 1));
            map.put("voiceTime", new flg.C5880a("voiceTime", "INTEGER", true, 0, null, 1));
            map.put("messageTime", new flg.C5880a("messageTime", "INTEGER", true, 0, null, 1));
            map.put("isPause", new flg.C5880a("isPause", "INTEGER", true, 0, null, 1));
            flg flgVar = new flg("gptAiChat", map, new HashSet(0), new HashSet(0));
            flg flgVar2 = flg.read(wfgVar, "gptAiChat");
            if (flgVar.equals(flgVar2)) {
                return new wae.C14530c(true, null);
            }
            return new wae.C14530c(false, "gptAiChat(com.watchfun.aichat.database.GPTAiMessage).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
        }
    }

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `gptAiChat`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "gptAiChat");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 ni3Var) {
        return ni3Var.f64638c.create(xfg.C15047b.builder(ni3Var.f64636a).name(ni3Var.f64637b).callback(new wae(ni3Var, new C3995a(1), "217cfabaa270a3429bc4ebb61568052a", "a37789a390d2d0c37567d13296c0814c")).build());
    }

    @Override // p000.uae
    public List<ova> getAutoMigrations(@efb Map<Class<? extends zi0>, zi0> map) {
        return Arrays.asList(new ova[0]);
    }

    @Override // p000.uae
    public Set<Class<? extends zi0>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // p000.uae
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(d27.class, e27.getRequiredConverters());
        return map;
    }

    @Override // com.watchfun.aichat.database.GPTMessageDatabase
    public d27 messageDao() {
        d27 d27Var;
        if (this.f25034b != null) {
            return this.f25034b;
        }
        synchronized (this) {
            try {
                if (this.f25034b == null) {
                    this.f25034b = new e27(this);
                }
                d27Var = this.f25034b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d27Var;
    }
}
