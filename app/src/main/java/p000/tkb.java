package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface tkb {

    /* JADX INFO: renamed from: tkb$a */
    public static abstract class AbstractC13084a {
        public abstract void onPropertyChanged(tkb sender, int propertyId);
    }

    void addOnPropertyChangedCallback(AbstractC13084a callback);

    void removeOnPropertyChangedCallback(AbstractC13084a callback);
}
