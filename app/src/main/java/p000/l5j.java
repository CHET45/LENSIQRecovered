package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzal;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class l5j implements Parcelable.Creator<zzal> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        zzam zzamVar = null;
        String strCreateString = null;
        zze zzeVar = null;
        zzaf zzafVar = null;
        ArrayList arrayListCreateTypedList2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    zzamVar = (zzam) SafeParcelReader.createParcelable(parcel, header, zzam.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, header, zze.CREATOR);
                    break;
                case 5:
                    zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, header, zzaf.CREATOR);
                    break;
                case 6:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, TotpMultiFactorInfo.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzal(arrayListCreateTypedList, zzamVar, strCreateString, zzeVar, zzafVar, arrayListCreateTypedList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i) {
        return new zzal[i];
    }
}
