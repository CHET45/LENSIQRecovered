package com.watchfun.voicenotes.database;

import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.voicenotes.CommonWebViewActivity;
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
import p000.xs1;
import p000.zi0;

/* JADX INFO: loaded from: classes7.dex */
public final class VoiceNotesDatabase_Impl extends VoiceNotesDatabase {
    private volatile VoiceNotesDao _voiceNotesDao;

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `voicenotes`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "voicenotes");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 ni3Var) {
        return ni3Var.f64638c.create(xfg.C15047b.builder(ni3Var.f64636a).name(ni3Var.f64637b).callback(new wae(ni3Var, new wae.AbstractC14529b(2) { // from class: com.watchfun.voicenotes.database.VoiceNotesDatabase_Impl.1
            @Override // p000.wae.AbstractC14529b
            public void createAllTables(wfg wfgVar) {
                wfgVar.execSQL("CREATE TABLE IF NOT EXISTS `voicenotes` (`mid` INTEGER PRIMARY KEY AUTOINCREMENT, `id` TEXT, `meetingType` INTEGER NOT NULL, `device` INTEGER NOT NULL, `downloadStatus` INTEGER NOT NULL, `downloadPos` INTEGER NOT NULL, `fileCrc` TEXT, `fileSize` INTEGER NOT NULL, `title` TEXT, `content` TEXT, `recordPath` TEXT, `language` TEXT, `meetingStatus` INTEGER NOT NULL, `memberNum` INTEGER NOT NULL, `recordTime` INTEGER NOT NULL, `createTime` TEXT, `endTime` TEXT, `createById` TEXT)");
                wfgVar.execSQL(vae.f90482g);
                wfgVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd26957eabff51c8c099e700ef880cce8')");
            }

            @Override // p000.wae.AbstractC14529b
            public void dropAllTables(wfg wfgVar) {
                wfgVar.execSQL("DROP TABLE IF EXISTS `voicenotes`");
                if (((uae) VoiceNotesDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) VoiceNotesDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) VoiceNotesDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(wfgVar);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onCreate(wfg wfgVar) {
                if (((uae) VoiceNotesDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) VoiceNotesDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) VoiceNotesDatabase_Impl.this).mCallbacks.get(i)).onCreate(wfgVar);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onOpen(wfg wfgVar) {
                ((uae) VoiceNotesDatabase_Impl.this).mDatabase = wfgVar;
                VoiceNotesDatabase_Impl.this.internalInitInvalidationTracker(wfgVar);
                if (((uae) VoiceNotesDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) VoiceNotesDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) VoiceNotesDatabase_Impl.this).mCallbacks.get(i)).onOpen(wfgVar);
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
                HashMap map = new HashMap(18);
                map.put("mid", new flg.C5880a("mid", "INTEGER", false, 1, null, 1));
                map.put("id", new flg.C5880a("id", "TEXT", false, 0, null, 1));
                map.put("meetingType", new flg.C5880a("meetingType", "INTEGER", true, 0, null, 1));
                map.put(xs1.f99118w, new flg.C5880a(xs1.f99118w, "INTEGER", true, 0, null, 1));
                map.put("downloadStatus", new flg.C5880a("downloadStatus", "INTEGER", true, 0, null, 1));
                map.put("downloadPos", new flg.C5880a("downloadPos", "INTEGER", true, 0, null, 1));
                map.put("fileCrc", new flg.C5880a("fileCrc", "TEXT", false, 0, null, 1));
                map.put("fileSize", new flg.C5880a("fileSize", "INTEGER", true, 0, null, 1));
                map.put(CommonWebViewActivity.f26185L, new flg.C5880a(CommonWebViewActivity.f26185L, "TEXT", false, 0, null, 1));
                map.put("content", new flg.C5880a("content", "TEXT", false, 0, null, 1));
                map.put("recordPath", new flg.C5880a("recordPath", "TEXT", false, 0, null, 1));
                map.put(BaseCallActivity.f25142j2, new flg.C5880a(BaseCallActivity.f25142j2, "TEXT", false, 0, null, 1));
                map.put("meetingStatus", new flg.C5880a("meetingStatus", "INTEGER", true, 0, null, 1));
                map.put("memberNum", new flg.C5880a("memberNum", "INTEGER", true, 0, null, 1));
                map.put("recordTime", new flg.C5880a("recordTime", "INTEGER", true, 0, null, 1));
                map.put("createTime", new flg.C5880a("createTime", "TEXT", false, 0, null, 1));
                map.put("endTime", new flg.C5880a("endTime", "TEXT", false, 0, null, 1));
                map.put("createById", new flg.C5880a("createById", "TEXT", false, 0, null, 1));
                flg flgVar = new flg("voicenotes", map, new HashSet(0), new HashSet(0));
                flg flgVar2 = flg.read(wfgVar, "voicenotes");
                if (flgVar.equals(flgVar2)) {
                    return new wae.C14530c(true, null);
                }
                return new wae.C14530c(false, "voicenotes(com.watchfun.voicenotes.database.VoiceNotesBean).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
            }
        }, "d26957eabff51c8c099e700ef880cce8", "a966003b914a2d82fe8d4b088aeb6b3c")).build());
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
        map.put(VoiceNotesDao.class, VoiceNotesDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.watchfun.voicenotes.database.VoiceNotesDatabase
    public VoiceNotesDao messageDao() {
        VoiceNotesDao voiceNotesDao;
        if (this._voiceNotesDao != null) {
            return this._voiceNotesDao;
        }
        synchronized (this) {
            try {
                if (this._voiceNotesDao == null) {
                    this._voiceNotesDao = new VoiceNotesDao_Impl(this);
                }
                voiceNotesDao = this._voiceNotesDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return voiceNotesDao;
    }
}
