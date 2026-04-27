package p000;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ebc {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable = new DataSetObservable();
    private DataSetObserver mViewPagerObserver;

    public void destroyItem(@efb ViewGroup viewGroup, int i, @efb Object obj) {
        destroyItem((View) viewGroup, i, obj);
    }

    public void finishUpdate(@efb ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    public abstract int getCount();

    public int getItemPosition(@efb Object obj) {
        return -1;
    }

    @hib
    public CharSequence getPageTitle(int i) {
        return null;
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    @efb
    public Object instantiateItem(@efb ViewGroup viewGroup, int i) {
        return instantiateItem((View) viewGroup, i);
    }

    public abstract boolean isViewFromObject(@efb View view, @efb Object obj);

    public void notifyDataSetChanged() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.mViewPagerObserver;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(@efb DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public void restoreState(@hib Parcelable parcelable, @hib ClassLoader classLoader) {
    }

    @hib
    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(@efb ViewGroup viewGroup, int i, @efb Object obj) {
        setPrimaryItem((View) viewGroup, i, obj);
    }

    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    public void startUpdate(@efb ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }

    public void unregisterDataSetObserver(@efb DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }

    @Deprecated
    public void destroyItem(@efb View view, int i, @efb Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    @Deprecated
    public void finishUpdate(@efb View view) {
    }

    @efb
    @Deprecated
    public Object instantiateItem(@efb View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void setPrimaryItem(@efb View view, int i, @efb Object obj) {
    }

    @Deprecated
    public void startUpdate(@efb View view) {
    }
}
