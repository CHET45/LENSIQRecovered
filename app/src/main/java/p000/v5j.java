package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p024firebaseauthapi.zzaiz;
import com.google.firebase.auth.TotpMultiFactorInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class v5j implements Parcelable.Creator<TotpMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        zzaiz zzaizVar = null;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 2) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                j = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzaizVar = (zzaiz) SafeParcelReader.createParcelable(parcel, header, zzaiz.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new TotpMultiFactorInfo(strCreateString, strCreateString2, j, zzaizVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo[] newArray(int i) {
        return new TotpMultiFactorInfo[i];
    }
}
