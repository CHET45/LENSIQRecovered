package p000;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface jne {
    int getAdvertiseFlags();

    byte[] getBytes();

    @hib
    String getDeviceName();

    SparseArray<byte[]> getManufacturerSpecificData();

    @hib
    byte[] getManufacturerSpecificData(int i);

    Map<ParcelUuid, byte[]> getServiceData();

    @hib
    byte[] getServiceData(ParcelUuid parcelUuid);

    List<ParcelUuid> getServiceSolicitationUuids();

    List<ParcelUuid> getServiceUuids();

    int getTxPowerLevel();
}
