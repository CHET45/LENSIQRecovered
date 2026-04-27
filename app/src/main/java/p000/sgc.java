package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class sgc {

    /* JADX INFO: renamed from: sgc$a */
    public static class C12571a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: a */
        public final tgc<T> f81738a;

        public C12571a(tgc<T> tgcVar) {
            this.f81738a = tgcVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f81738a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.f81738a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f81738a.createFromParcel(parcel, classLoader);
        }
    }

    private sgc() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> newCreator(tgc<T> tgcVar) {
        return new C12571a(tgcVar);
    }
}
