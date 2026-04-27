package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class tc9<D> {
    Context mContext;
    int mId;
    InterfaceC12983c<D> mListener;
    InterfaceC12982b<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    /* JADX INFO: renamed from: tc9$a */
    public final class C12981a extends ContentObserver {
        public C12981a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            tc9.this.onContentChanged();
        }
    }

    /* JADX INFO: renamed from: tc9$b */
    public interface InterfaceC12982b<D> {
        void onLoadCanceled(@efb tc9<D> tc9Var);
    }

    /* JADX INFO: renamed from: tc9$c */
    public interface InterfaceC12983c<D> {
        void onLoadComplete(@efb tc9<D> tc9Var, @hib D d);
    }

    public tc9(@efb Context context) {
        this.mContext = context.getApplicationContext();
    }

    @ir9
    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    @ir9
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @efb
    public String dataToString(@hib D d) {
        StringBuilder sb = new StringBuilder(64);
        nk3.buildShortClassTag(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @ir9
    public void deliverCancellation() {
        InterfaceC12982b<D> interfaceC12982b = this.mOnLoadCanceledListener;
        if (interfaceC12982b != null) {
            interfaceC12982b.onLoadCanceled(this);
        }
    }

    @ir9
    public void deliverResult(@hib D d) {
        InterfaceC12983c<D> interfaceC12983c = this.mListener;
        if (interfaceC12983c != null) {
            interfaceC12983c.onLoadComplete(this, d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    @ir9
    public void forceLoad() {
        onForceLoad();
    }

    @efb
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    @ir9
    public void onAbandon() {
    }

    @ir9
    public boolean onCancelLoad() {
        return false;
    }

    @ir9
    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    @ir9
    public void onForceLoad() {
    }

    @ir9
    public void onReset() {
    }

    @ir9
    public void onStartLoading() {
    }

    @ir9
    public void onStopLoading() {
    }

    @ir9
    public void registerListener(int i, @efb InterfaceC12983c<D> interfaceC12983c) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC12983c;
        this.mId = i;
    }

    @ir9
    public void registerOnLoadCanceledListener(@efb InterfaceC12982b<D> interfaceC12982b) {
        if (this.mOnLoadCanceledListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mOnLoadCanceledListener = interfaceC12982b;
    }

    @ir9
    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    @ir9
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    @ir9
    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        nk3.buildShortClassTag(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    @ir9
    public void unregisterListener(@efb InterfaceC12983c<D> interfaceC12983c) {
        InterfaceC12983c<D> interfaceC12983c2 = this.mListener;
        if (interfaceC12983c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC12983c2 != interfaceC12983c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    @ir9
    public void unregisterOnLoadCanceledListener(@efb InterfaceC12982b<D> interfaceC12982b) {
        InterfaceC12982b<D> interfaceC12982b2 = this.mOnLoadCanceledListener;
        if (interfaceC12982b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC12982b2 != interfaceC12982b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mOnLoadCanceledListener = null;
    }
}
