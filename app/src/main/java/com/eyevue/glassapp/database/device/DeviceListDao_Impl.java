package com.eyevue.glassapp.database.device;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.bb3;
import p000.bgg;
import p000.caf;
import p000.k35;
import p000.l35;
import p000.m35;
import p000.pe3;
import p000.uae;
import p000.xae;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceListDao_Impl implements DeviceListDao {
    private final uae __db;
    private final caf __preparedStmtOfDeleteAll;
    private final caf __preparedStmtOfDeleteByMac;
    private final caf __preparedStmtOfUpdateTime;
    private final k35<DeviceInfoBean> __updateAdapterOfDeviceInfoBean;
    private final m35<DeviceInfoBean> __upsertionAdapterOfDeviceInfoBean;

    public DeviceListDao_Impl(uae __db) {
        this.__db = __db;
        this.__updateAdapterOfDeviceInfoBean = new k35<DeviceInfoBean>(__db) { // from class: com.eyevue.glassapp.database.device.DeviceListDao_Impl.1
            @Override // p000.k35, p000.caf
            public String createQuery() {
                return "UPDATE OR ABORT `DeviceList` SET `name` = ?,`mac` = ?,`projectFunctionType` = ?,`projectCompatibleSdk` = ?,`updateTime` = ? WHERE `mac` = ?";
            }

            @Override // p000.k35
            public void bind(bgg stmt, DeviceInfoBean value) {
                if (value.getName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getName());
                }
                if (value.getMac() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMac());
                }
                if (value.getProjectFunctionType() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getProjectFunctionType());
                }
                if (value.getProjectCompatibleSdk() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getProjectCompatibleSdk());
                }
                stmt.bindLong(5, value.getUpdateTime());
                if (value.getMac() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getMac());
                }
            }
        };
        this.__preparedStmtOfUpdateTime = new caf(__db) { // from class: com.eyevue.glassapp.database.device.DeviceListDao_Impl.2
            @Override // p000.caf
            public String createQuery() {
                return "UPDATE DeviceList SET updateTime = ?  WHERE mac = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new caf(__db) { // from class: com.eyevue.glassapp.database.device.DeviceListDao_Impl.3
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM DeviceList";
            }
        };
        this.__preparedStmtOfDeleteByMac = new caf(__db) { // from class: com.eyevue.glassapp.database.device.DeviceListDao_Impl.4
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM DeviceList WHERE mac =? ";
            }
        };
        this.__upsertionAdapterOfDeviceInfoBean = new m35<>(new l35<DeviceInfoBean>(__db) { // from class: com.eyevue.glassapp.database.device.DeviceListDao_Impl.5
            @Override // p000.caf
            public String createQuery() {
                return "INSERT INTO `DeviceList` (`name`,`mac`,`projectFunctionType`,`projectCompatibleSdk`,`updateTime`) VALUES (?,?,?,?,?)";
            }

            @Override // p000.l35
            public void bind(bgg stmt, DeviceInfoBean value) {
                if (value.getName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getName());
                }
                if (value.getMac() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMac());
                }
                if (value.getProjectFunctionType() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getProjectFunctionType());
                }
                if (value.getProjectCompatibleSdk() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getProjectCompatibleSdk());
                }
                stmt.bindLong(5, value.getUpdateTime());
            }
        }, new k35<DeviceInfoBean>(__db) { // from class: com.eyevue.glassapp.database.device.DeviceListDao_Impl.6
            @Override // p000.k35, p000.caf
            public String createQuery() {
                return "UPDATE `DeviceList` SET `name` = ?,`mac` = ?,`projectFunctionType` = ?,`projectCompatibleSdk` = ?,`updateTime` = ? WHERE `mac` = ?";
            }

            @Override // p000.k35
            public void bind(bgg stmt, DeviceInfoBean value) {
                if (value.getName() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getName());
                }
                if (value.getMac() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMac());
                }
                if (value.getProjectFunctionType() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getProjectFunctionType());
                }
                if (value.getProjectCompatibleSdk() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getProjectCompatibleSdk());
                }
                stmt.bindLong(5, value.getUpdateTime());
                if (value.getMac() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getMac());
                }
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public void deleteByMac(final String mac) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteByMac.acquire();
        if (mac == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, mac);
        }
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByMac.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public List<DeviceInfoBean> getAll() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM DeviceList ORDER BY updateTime DESC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "mac");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "projectFunctionType");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "projectCompatibleSdk");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "updateTime");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                DeviceInfoBean deviceInfoBean = new DeviceInfoBean(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                deviceInfoBean.setUpdateTime(cursorQuery.getLong(columnIndexOrThrow5));
                arrayList.add(deviceInfoBean);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public DeviceInfoBean getDeviceByMac(String str) {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM DeviceList WHERE mac= ? LIMIT 1", 1);
        if (str == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        DeviceInfoBean deviceInfoBean = null;
        String string = null;
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "mac");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "projectFunctionType");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "projectCompatibleSdk");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "updateTime");
            if (cursorQuery.moveToFirst()) {
                String string2 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                String string3 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                String string4 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                if (!cursorQuery.isNull(columnIndexOrThrow4)) {
                    string = cursorQuery.getString(columnIndexOrThrow4);
                }
                DeviceInfoBean deviceInfoBean2 = new DeviceInfoBean(string2, string3, string4, string);
                deviceInfoBean2.setUpdateTime(cursorQuery.getLong(columnIndexOrThrow5));
                deviceInfoBean = deviceInfoBean2;
            }
            return deviceInfoBean;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public DeviceInfoBean getLatestOne() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM DeviceList ORDER BY updateTime DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        DeviceInfoBean deviceInfoBean = null;
        String string = null;
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "mac");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "projectFunctionType");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "projectCompatibleSdk");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "updateTime");
            if (cursorQuery.moveToFirst()) {
                String string2 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                String string3 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                String string4 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                if (!cursorQuery.isNull(columnIndexOrThrow4)) {
                    string = cursorQuery.getString(columnIndexOrThrow4);
                }
                DeviceInfoBean deviceInfoBean2 = new DeviceInfoBean(string2, string3, string4, string);
                deviceInfoBean2.setUpdateTime(cursorQuery.getLong(columnIndexOrThrow5));
                deviceInfoBean = deviceInfoBean2;
            }
            return deviceInfoBean;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public long insert(final DeviceInfoBean message) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jUpsertAndReturnId = this.__upsertionAdapterOfDeviceInfoBean.upsertAndReturnId(message);
            this.__db.setTransactionSuccessful();
            return jUpsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public int update(final DeviceInfoBean deviceInfoBean) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int iHandle = this.__updateAdapterOfDeviceInfoBean.handle(deviceInfoBean);
            this.__db.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.eyevue.glassapp.database.device.DeviceListDao
    public void updateTime(final String mac, final long updateTime) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfUpdateTime.acquire();
        bggVarAcquire.bindLong(1, updateTime);
        if (mac == null) {
            bggVarAcquire.bindNull(2);
        } else {
            bggVarAcquire.bindString(2, mac);
        }
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateTime.release(bggVarAcquire);
        }
    }
}
