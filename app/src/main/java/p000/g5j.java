package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.GithubAuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public final class g5j implements Parcelable.Creator<GithubAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GithubAuthCredential createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 1) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GithubAuthCredential(strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GithubAuthCredential[] newArray(int i) {
        return new GithubAuthCredential[i];
    }
}
