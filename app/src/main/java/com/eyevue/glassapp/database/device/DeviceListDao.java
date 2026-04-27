package com.eyevue.glassapp.database.device;

import java.util.List;
import p000.dwh;
import p000.old;
import p000.txh;
import p000.we3;

/* JADX INFO: loaded from: classes4.dex */
@we3
public interface DeviceListDao {
    @old("DELETE FROM DeviceList")
    void deleteAll();

    @old("DELETE FROM DeviceList WHERE mac =:mac ")
    void deleteByMac(String mac);

    @old("SELECT * FROM DeviceList ORDER BY updateTime DESC")
    List<DeviceInfoBean> getAll();

    @old("SELECT * FROM DeviceList WHERE mac= :mac LIMIT 1")
    DeviceInfoBean getDeviceByMac(String mac);

    @old("SELECT * FROM DeviceList ORDER BY updateTime DESC LIMIT 1")
    DeviceInfoBean getLatestOne();

    @txh
    long insert(DeviceInfoBean message);

    @dwh
    int update(DeviceInfoBean deviceInfoBean);

    @old("UPDATE DeviceList SET updateTime = :updateTime  WHERE mac = :mac")
    void updateTime(String mac, long updateTime);
}
