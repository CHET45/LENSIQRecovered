package p000;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ugc {
    public static final /* synthetic */ <T extends Parcelable> Parcelable.Creator<T> parcelableCreator() throws IllegalAccessException {
        md8.reifiedOperationMarker(4, "T");
        Object obj = Parcelable.class.getDeclaredField("CREATOR").get(null);
        Parcelable.Creator<T> creator = obj instanceof Parcelable.Creator ? (Parcelable.Creator) obj : null;
        if (creator != null) {
            return creator;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not access CREATOR field in class ");
        md8.reifiedOperationMarker(4, "T");
        sb.append(vvd.getOrCreateKotlinClass(Parcelable.class).getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
