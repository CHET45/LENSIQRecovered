package p000;

import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@c5e(21)
@p7e({p7e.EnumC10826a.f69935b})
public class mne implements jne {

    /* JADX INFO: renamed from: a */
    public final ScanRecord f61581a;

    /* JADX INFO: renamed from: b */
    public final nne f61582b;

    public mne(ScanRecord scanRecord, nne nneVar) {
        this.f61581a = scanRecord;
        this.f61582b = nneVar;
    }

    @Override // p000.jne
    public int getAdvertiseFlags() {
        return this.f61581a.getAdvertiseFlags();
    }

    @Override // p000.jne
    public byte[] getBytes() {
        return this.f61581a.getBytes();
    }

    @Override // p000.jne
    @hib
    public String getDeviceName() {
        return this.f61581a.getDeviceName();
    }

    @Override // p000.jne
    public SparseArray<byte[]> getManufacturerSpecificData() {
        return this.f61581a.getManufacturerSpecificData();
    }

    @Override // p000.jne
    public Map<ParcelUuid, byte[]> getServiceData() {
        return this.f61581a.getServiceData();
    }

    @Override // p000.jne
    public List<ParcelUuid> getServiceSolicitationUuids() {
        return Build.VERSION.SDK_INT >= 29 ? this.f61581a.getServiceSolicitationUuids() : this.f61582b.parseFromBytes(this.f61581a.getBytes()).getServiceSolicitationUuids();
    }

    @Override // p000.jne
    public List<ParcelUuid> getServiceUuids() {
        return this.f61581a.getServiceUuids();
    }

    @Override // p000.jne
    public int getTxPowerLevel() {
        return this.f61581a.getTxPowerLevel();
    }

    @Override // p000.jne
    @hib
    public byte[] getManufacturerSpecificData(int i) {
        return this.f61581a.getManufacturerSpecificData(i);
    }

    @Override // p000.jne
    @hib
    public byte[] getServiceData(ParcelUuid parcelUuid) {
        return this.f61581a.getServiceData(parcelUuid);
    }
}
