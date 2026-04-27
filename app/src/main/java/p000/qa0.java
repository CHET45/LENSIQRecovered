package p000;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qa0<D> extends tc9<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile qa0<D>.RunnableC11395a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile qa0<D>.RunnableC11395a mTask;
    long mUpdateThrottle;

    /* JADX INFO: renamed from: qa0$a */
    public final class RunnableC11395a extends axa<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: M1 */
        public boolean f73727M1;

        /* JADX INFO: renamed from: Z */
        public final CountDownLatch f73729Z = new CountDownLatch(1);

        public RunnableC11395a() {
        }

        @Override // p000.axa
        /* JADX INFO: renamed from: d */
        public void mo2727d(D d) {
            try {
                qa0.this.dispatchOnCancelled(this, d);
            } finally {
                this.f73729Z.countDown();
            }
        }

        @Override // p000.axa
        /* JADX INFO: renamed from: e */
        public void mo2728e(D d) {
            try {
                qa0.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.f73729Z.countDown();
            }
        }

        @Override // p000.axa
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public D mo2724a(Void... voidArr) {
            try {
                return (D) qa0.this.onLoadInBackground();
            } catch (b6c e) {
                if (isCancelled()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f73727M1 = false;
            qa0.this.executePendingTask();
        }

        public void waitForLoader() {
            try {
                this.f73729Z.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public qa0(@efb Context context) {
        this(context, axa.f12115M);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(qa0<D>.RunnableC11395a runnableC11395a, D d) {
        onCanceled(d);
        if (this.mCancellingTask == runnableC11395a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(qa0<D>.RunnableC11395a runnableC11395a, D d) {
        if (this.mTask != runnableC11395a) {
            dispatchOnCancelled(runnableC11395a, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    @Override // p000.tc9
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f73727M1);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f73727M1);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            e1h.formatDuration(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            e1h.formatDuration(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f73727M1) {
            this.mTask.f73727M1 = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.executeOnExecutor(this.mExecutor, null);
        } else {
            this.mTask.f73727M1 = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    @hib
    public abstract D loadInBackground();

    @Override // p000.tc9
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f73727M1) {
                this.mTask.f73727M1 = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f73727M1) {
            this.mTask.f73727M1 = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zCancel = this.mTask.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    public void onCanceled(@hib D d) {
    }

    @Override // p000.tc9
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC11395a();
        executePendingTask();
    }

    @hib
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void waitForLoader() {
        qa0<D>.RunnableC11395a runnableC11395a = this.mTask;
        if (runnableC11395a != null) {
            runnableC11395a.waitForLoader();
        }
    }

    private qa0(@efb Context context, @efb Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
