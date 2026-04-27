package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface drb<T> extends List<T> {

    /* JADX INFO: renamed from: drb$a */
    public static abstract class AbstractC4925a<T extends drb> {
        public abstract void onChanged(T sender);

        public abstract void onItemRangeChanged(T sender, int positionStart, int itemCount);

        public abstract void onItemRangeInserted(T sender, int positionStart, int itemCount);

        public abstract void onItemRangeMoved(T sender, int fromPosition, int toPosition, int itemCount);

        public abstract void onItemRangeRemoved(T sender, int positionStart, int itemCount);
    }

    void addOnListChangedCallback(AbstractC4925a<? extends drb<T>> callback);

    void removeOnListChangedCallback(AbstractC4925a<? extends drb<T>> callback);
}
