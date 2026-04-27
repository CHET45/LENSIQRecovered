package p000;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class kne implements jne {

    /* JADX INFO: renamed from: a */
    public final int f54806a;

    /* JADX INFO: renamed from: b */
    @hib
    public final List<ParcelUuid> f54807b;

    /* JADX INFO: renamed from: c */
    @hib
    public final List<ParcelUuid> f54808c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<byte[]> f54809d;

    /* JADX INFO: renamed from: e */
    public final Map<ParcelUuid, byte[]> f54810e;

    /* JADX INFO: renamed from: f */
    public final int f54811f;

    /* JADX INFO: renamed from: g */
    public final String f54812g;

    /* JADX INFO: renamed from: h */
    public final byte[] f54813h;

    public kne(@hib List<ParcelUuid> list, @hib List<ParcelUuid> list2, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.f54807b = list;
        this.f54808c = list2;
        this.f54809d = sparseArray;
        this.f54810e = map;
        this.f54812g = str;
        this.f54806a = i;
        this.f54811f = i2;
        this.f54813h = bArr;
    }

    @Override // p000.jne
    public int getAdvertiseFlags() {
        return this.f54806a;
    }

    @Override // p000.jne
    public byte[] getBytes() {
        return this.f54813h;
    }

    @Override // p000.jne
    @hib
    public String getDeviceName() {
        return this.f54812g;
    }

    @Override // p000.jne
    public SparseArray<byte[]> getManufacturerSpecificData() {
        return this.f54809d;
    }

    @Override // p000.jne
    public Map<ParcelUuid, byte[]> getServiceData() {
        return this.f54810e;
    }

    @Override // p000.jne
    @hib
    public List<ParcelUuid> getServiceSolicitationUuids() {
        return this.f54808c;
    }

    @Override // p000.jne
    @hib
    public List<ParcelUuid> getServiceUuids() {
        return this.f54807b;
    }

    @Override // p000.jne
    public int getTxPowerLevel() {
        return this.f54811f;
    }

    @Override // p000.jne
    @hib
    public byte[] getManufacturerSpecificData(int i) {
        return this.f54809d.get(i);
    }

    @Override // p000.jne
    @hib
    public byte[] getServiceData(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return this.f54810e.get(parcelUuid);
    }
}
