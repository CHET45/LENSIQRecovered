package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import p000.tc9;

/* JADX INFO: loaded from: classes3.dex */
public class za3 extends qa0<Cursor> {

    /* JADX INFO: renamed from: a */
    public final tc9<Cursor>.C12981a f104542a;

    /* JADX INFO: renamed from: b */
    public Uri f104543b;

    /* JADX INFO: renamed from: c */
    public String[] f104544c;

    /* JADX INFO: renamed from: d */
    public String f104545d;

    /* JADX INFO: renamed from: e */
    public String[] f104546e;

    /* JADX INFO: renamed from: f */
    public String f104547f;

    /* JADX INFO: renamed from: g */
    public Cursor f104548g;

    /* JADX INFO: renamed from: h */
    public pq1 f104549h;

    public za3(@efb Context context) {
        super(context);
        this.f104542a = new tc9.C12981a();
    }

    @Override // p000.qa0
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                pq1 pq1Var = this.f104549h;
                if (pq1Var != null) {
                    pq1Var.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.qa0, p000.tc9
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f104543b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f104544c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f104545d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f104546e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f104547f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f104548g);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    @hib
    public String[] getProjection() {
        return this.f104544c;
    }

    @hib
    public String getSelection() {
        return this.f104545d;
    }

    @hib
    public String[] getSelectionArgs() {
        return this.f104546e;
    }

    @hib
    public String getSortOrder() {
        return this.f104547f;
    }

    @efb
    public Uri getUri() {
        return this.f104543b;
    }

    @Override // p000.tc9
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f104548g;
        if (cursor != null && !cursor.isClosed()) {
            this.f104548g.close();
        }
        this.f104548g = null;
    }

    @Override // p000.tc9
    public void onStartLoading() {
        Cursor cursor = this.f104548g;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f104548g == null) {
            forceLoad();
        }
    }

    @Override // p000.tc9
    public void onStopLoading() {
        cancelLoad();
    }

    public void setProjection(@hib String[] strArr) {
        this.f104544c = strArr;
    }

    public void setSelection(@hib String str) {
        this.f104545d = str;
    }

    public void setSelectionArgs(@hib String[] strArr) {
        this.f104546e = strArr;
    }

    public void setSortOrder(@hib String str) {
        this.f104547f = str;
    }

    public void setUri(@efb Uri uri) {
        this.f104543b = uri;
    }

    @Override // p000.tc9
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f104548g;
        this.f104548g = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.qa0
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new b6c();
            }
            this.f104549h = new pq1();
        }
        try {
            Cursor cursorQuery = vw2.query(getContext().getContentResolver(), this.f104543b, this.f104544c, this.f104545d, this.f104546e, this.f104547f, this.f104549h);
            if (cursorQuery != null) {
                try {
                    cursorQuery.getCount();
                    cursorQuery.registerContentObserver(this.f104542a);
                } catch (RuntimeException e) {
                    cursorQuery.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f104549h = null;
            }
            return cursorQuery;
        } catch (Throwable th) {
            synchronized (this) {
                this.f104549h = null;
                throw th;
            }
        }
    }

    @Override // p000.qa0
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public za3(@efb Context context, @efb Uri uri, @hib String[] strArr, @hib String str, @hib String[] strArr2, @hib String str2) {
        super(context);
        this.f104542a = new tc9.C12981a();
        this.f104543b = uri;
        this.f104544c = strArr;
        this.f104545d = str;
        this.f104546e = strArr2;
        this.f104547f = str2;
    }
}
