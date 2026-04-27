package p000;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface tgc<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
