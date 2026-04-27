package com.eyevue.glassapp.database.alarmclock;

import com.eyevue.glassapp.services.AlarmReceiver;
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
public final class AlarmClockMessageDatabase_Impl extends AlarmClockMessageDatabase {
    private volatile AlarmClockMessageDao _alarmClockMessageDao;

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `AlarmClock`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "AlarmClock");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 configuration) {
        return configuration.f64638c.create(xfg.C15047b.builder(configuration.f64636a).name(configuration.f64637b).callback(new wae(configuration, new wae.AbstractC14529b(1) { // from class: com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDatabase_Impl.1
            @Override // p000.wae.AbstractC14529b
            public void createAllTables(wfg _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `AlarmClock` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `alarmDescription` TEXT, `alarmTitle` TEXT, `alarmTime` INTEGER NOT NULL, `alarmRepeat` INTEGER NOT NULL, `isSyncCalendar` INTEGER NOT NULL, `isOutOfTime` INTEGER NOT NULL, `isOpen` INTEGER NOT NULL, `createTime` INTEGER NOT NULL, `calendarId` INTEGER NOT NULL)");
                _db.execSQL(vae.f90482g);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '33255e174dae91d48dac91a94b855e3a')");
            }

            @Override // p000.wae.AbstractC14529b
            public void dropAllTables(wfg _db) {
                _db.execSQL("DROP TABLE IF EXISTS `AlarmClock`");
                if (((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onCreate(wfg _db) {
                if (((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onOpen(wfg _db) {
                ((uae) AlarmClockMessageDatabase_Impl.this).mDatabase = _db;
                AlarmClockMessageDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) AlarmClockMessageDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
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
                HashMap map = new HashMap(10);
                map.put("id", new flg.C5880a("id", "INTEGER", true, 1, null, 1));
                map.put("alarmDescription", new flg.C5880a("alarmDescription", "TEXT", false, 0, null, 1));
                map.put("alarmTitle", new flg.C5880a("alarmTitle", "TEXT", false, 0, null, 1));
                map.put("alarmTime", new flg.C5880a("alarmTime", "INTEGER", true, 0, null, 1));
                map.put("alarmRepeat", new flg.C5880a("alarmRepeat", "INTEGER", true, 0, null, 1));
                map.put("isSyncCalendar", new flg.C5880a("isSyncCalendar", "INTEGER", true, 0, null, 1));
                map.put("isOutOfTime", new flg.C5880a("isOutOfTime", "INTEGER", true, 0, null, 1));
                map.put("isOpen", new flg.C5880a("isOpen", "INTEGER", true, 0, null, 1));
                map.put("createTime", new flg.C5880a("createTime", "INTEGER", true, 0, null, 1));
                map.put(AlarmReceiver.f18301e, new flg.C5880a(AlarmReceiver.f18301e, "INTEGER", true, 0, null, 1));
                flg flgVar = new flg("AlarmClock", map, new HashSet(0), new HashSet(0));
                flg flgVar2 = flg.read(_db, "AlarmClock");
                if (flgVar.equals(flgVar2)) {
                    return new wae.C14530c(true, null);
                }
                return new wae.C14530c(false, "AlarmClock(com.eyevue.glassapp.database.alarmclock.AlarmClockMessage).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
            }
        }, "33255e174dae91d48dac91a94b855e3a", "1e45769704f951988a6fd711727c737b")).build());
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
        map.put(AlarmClockMessageDao.class, AlarmClockMessageDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDatabase
    public AlarmClockMessageDao messageDao() {
        AlarmClockMessageDao alarmClockMessageDao;
        if (this._alarmClockMessageDao != null) {
            return this._alarmClockMessageDao;
        }
        synchronized (this) {
            try {
                if (this._alarmClockMessageDao == null) {
                    this._alarmClockMessageDao = new AlarmClockMessageDao_Impl(this);
                }
                alarmClockMessageDao = this._alarmClockMessageDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return alarmClockMessageDao;
    }
}
