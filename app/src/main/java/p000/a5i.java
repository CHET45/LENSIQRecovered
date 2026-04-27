package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p000.a77;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class a5i extends z4i {

    /* JADX INFO: renamed from: B */
    public static final boolean f469B = false;

    /* JADX INFO: renamed from: C */
    public static final String f470C = "VersionedParcelParcel";

    /* JADX INFO: renamed from: A */
    public int f471A;

    /* JADX INFO: renamed from: t */
    public final SparseIntArray f472t;

    /* JADX INFO: renamed from: u */
    public final Parcel f473u;

    /* JADX INFO: renamed from: v */
    public final int f474v;

    /* JADX INFO: renamed from: w */
    public final int f475w;

    /* JADX INFO: renamed from: x */
    public final String f476x;

    /* JADX INFO: renamed from: y */
    public int f477y;

    /* JADX INFO: renamed from: z */
    public int f478z;

    public a5i(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new x60(), new x60(), new x60());
    }

    @Override // p000.z4i
    /* JADX INFO: renamed from: a */
    public z4i mo160a() {
        Parcel parcel = this.f473u;
        int iDataPosition = parcel.dataPosition();
        int i = this.f478z;
        if (i == this.f474v) {
            i = this.f475w;
        }
        return new a5i(parcel, iDataPosition, i, this.f476x + a77.C0077a.f542d, this.f104176a, this.f104177b, this.f104178c);
    }

    @Override // p000.z4i
    public void closeField() {
        int i = this.f477y;
        if (i >= 0) {
            int i2 = this.f472t.get(i);
            int iDataPosition = this.f473u.dataPosition();
            this.f473u.setDataPosition(i2);
            this.f473u.writeInt(iDataPosition - i2);
            this.f473u.setDataPosition(iDataPosition);
        }
    }

    @Override // p000.z4i
    /* JADX INFO: renamed from: e */
    public CharSequence mo161e() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f473u);
    }

    @Override // p000.z4i
    /* JADX INFO: renamed from: o */
    public void mo162o(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f473u, 0);
    }

    @Override // p000.z4i
    public boolean readBoolean() {
        return this.f473u.readInt() != 0;
    }

    @Override // p000.z4i
    public Bundle readBundle() {
        return this.f473u.readBundle(getClass().getClassLoader());
    }

    @Override // p000.z4i
    public byte[] readByteArray() {
        int i = this.f473u.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f473u.readByteArray(bArr);
        return bArr;
    }

    @Override // p000.z4i
    public double readDouble() {
        return this.f473u.readDouble();
    }

    @Override // p000.z4i
    public boolean readField(int i) {
        while (this.f478z < this.f475w) {
            int i2 = this.f471A;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f473u.setDataPosition(this.f478z);
            int i3 = this.f473u.readInt();
            this.f471A = this.f473u.readInt();
            this.f478z += i3;
        }
        return this.f471A == i;
    }

    @Override // p000.z4i
    public float readFloat() {
        return this.f473u.readFloat();
    }

    @Override // p000.z4i
    public int readInt() {
        return this.f473u.readInt();
    }

    @Override // p000.z4i
    public long readLong() {
        return this.f473u.readLong();
    }

    @Override // p000.z4i
    public <T extends Parcelable> T readParcelable() {
        return (T) this.f473u.readParcelable(getClass().getClassLoader());
    }

    @Override // p000.z4i
    public String readString() {
        return this.f473u.readString();
    }

    @Override // p000.z4i
    public IBinder readStrongBinder() {
        return this.f473u.readStrongBinder();
    }

    @Override // p000.z4i
    public void setOutputField(int i) {
        closeField();
        this.f477y = i;
        this.f472t.put(i, this.f473u.dataPosition());
        writeInt(0);
        writeInt(i);
    }

    @Override // p000.z4i
    public void writeBoolean(boolean z) {
        this.f473u.writeInt(z ? 1 : 0);
    }

    @Override // p000.z4i
    public void writeBundle(Bundle bundle) {
        this.f473u.writeBundle(bundle);
    }

    @Override // p000.z4i
    public void writeByteArray(byte[] bArr) {
        if (bArr == null) {
            this.f473u.writeInt(-1);
        } else {
            this.f473u.writeInt(bArr.length);
            this.f473u.writeByteArray(bArr);
        }
    }

    @Override // p000.z4i
    public void writeDouble(double d) {
        this.f473u.writeDouble(d);
    }

    @Override // p000.z4i
    public void writeFloat(float f) {
        this.f473u.writeFloat(f);
    }

    @Override // p000.z4i
    public void writeInt(int i) {
        this.f473u.writeInt(i);
    }

    @Override // p000.z4i
    public void writeLong(long j) {
        this.f473u.writeLong(j);
    }

    @Override // p000.z4i
    public void writeParcelable(Parcelable parcelable) {
        this.f473u.writeParcelable(parcelable, 0);
    }

    @Override // p000.z4i
    public void writeString(String str) {
        this.f473u.writeString(str);
    }

    @Override // p000.z4i
    public void writeStrongBinder(IBinder iBinder) {
        this.f473u.writeStrongBinder(iBinder);
    }

    @Override // p000.z4i
    public void writeStrongInterface(IInterface iInterface) {
        this.f473u.writeStrongInterface(iInterface);
    }

    private a5i(Parcel parcel, int i, int i2, String str, x60<String, Method> x60Var, x60<String, Method> x60Var2, x60<String, Class> x60Var3) {
        super(x60Var, x60Var2, x60Var3);
        this.f472t = new SparseIntArray();
        this.f477y = -1;
        this.f471A = -1;
        this.f473u = parcel;
        this.f474v = i;
        this.f475w = i2;
        this.f478z = i;
        this.f476x = str;
    }

    @Override // p000.z4i
    public void writeByteArray(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f473u.writeInt(bArr.length);
            this.f473u.writeByteArray(bArr, i, i2);
        } else {
            this.f473u.writeInt(-1);
        }
    }
}
