package com.eyevue.glassapp.database.device;

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
public final class DeviceListDatabase_Impl extends DeviceListDatabase {
    private volatile DeviceListDao _deviceListDao;

    @Override // p000.uae
    public void clearAllTables() {
        super.assertNotMainThread();
        wfg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `DeviceList`");
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
        return new ke8(this, new HashMap(0), new HashMap(0), "DeviceList");
    }

    @Override // p000.uae
    public xfg createOpenHelper(ni3 configuration) {
        return configuration.f64638c.create(xfg.C15047b.builder(configuration.f64636a).name(configuration.f64637b).callback(new wae(configuration, new wae.AbstractC14529b(1) { // from class: com.eyevue.glassapp.database.device.DeviceListDatabase_Impl.1
            @Override // p000.wae.AbstractC14529b
            public void createAllTables(wfg _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `DeviceList` (`name` TEXT, `mac` TEXT NOT NULL, `projectFunctionType` TEXT, `projectCompatibleSdk` TEXT, `updateTime` INTEGER NOT NULL, PRIMARY KEY(`mac`))");
                _db.execSQL(vae.f90482g);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c425d41bdeb4202b0d9f924f98b836c')");
            }

            @Override // p000.wae.AbstractC14529b
            public void dropAllTables(wfg _db) {
                _db.execSQL("DROP TABLE IF EXISTS `DeviceList`");
                if (((uae) DeviceListDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) DeviceListDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) DeviceListDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onCreate(wfg _db) {
                if (((uae) DeviceListDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) DeviceListDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) DeviceListDatabase_Impl.this).mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // p000.wae.AbstractC14529b
            public void onOpen(wfg _db) {
                ((uae) DeviceListDatabase_Impl.this).mDatabase = _db;
                DeviceListDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (((uae) DeviceListDatabase_Impl.this).mCallbacks != null) {
                    int size = ((uae) DeviceListDatabase_Impl.this).mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((uae.AbstractC13433b) ((uae) DeviceListDatabase_Impl.this).mCallbacks.get(i)).onOpen(_db);
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
                HashMap map = new HashMap(5);
                map.put("name", new flg.C5880a("name", "TEXT", false, 0, null, 1));
                map.put("mac", new flg.C5880a("mac", "TEXT", true, 1, null, 1));
                map.put("projectFunctionType", new flg.C5880a("projectFunctionType", "TEXT", false, 0, null, 1));
                map.put("projectCompatibleSdk", new flg.C5880a("projectCompatibleSdk", "TEXT", false, 0, null, 1));
                map.put("updateTime", new flg.C5880a("updateTime", "INTEGER", true, 0, null, 1));
                flg flgVar = new flg("DeviceList", map, new HashSet(0), new HashSet(0));
                flg flgVar2 = flg.read(_db, "DeviceList");
                if (flgVar.equals(flgVar2)) {
                    return new wae.C14530c(true, null);
                }
                return new wae.C14530c(false, "DeviceList(com.eyevue.glassapp.database.device.DeviceInfoBean).\n Expected:\n" + flgVar + "\n Found:\n" + flgVar2);
            }
        }, "6c425d41bdeb4202b0d9f924f98b836c", "4a69202da5c8b9b3ab53ca212f4f16d6")).build());
    }

    @Override // p000.uae
    public List<ova> getAutoMigrations(@efb Map<Class<? extends zi0>, zi0> autoMigrationSpecsMap) {
        return Arrays.asList(new ova[0]);
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDatabase
    public DeviceListDao getDeviceListDao() {
        DeviceListDao deviceListDao;
        if (this._deviceListDao != null) {
            return this._deviceListDao;
        }
        synchronized (this) {
            try {
                if (this._deviceListDao == null) {
                    this._deviceListDao = new DeviceListDao_Impl(this);
                }
                deviceListDao = this._deviceListDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceListDao;
    }

    @Override // p000.uae
    public Set<Class<? extends zi0>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // p000.uae
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(DeviceListDao.class, DeviceListDao_Impl.getRequiredConverters());
        return map;
    }
}
