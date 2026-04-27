package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class gif extends a6e {

    /* JADX INFO: renamed from: M1 */
    public InterfaceC6323a f39876M1;

    /* JADX INFO: renamed from: V1 */
    public InterfaceC6324b f39877V1;

    /* JADX INFO: renamed from: X */
    @p7e({p7e.EnumC10826a.f69935b})
    public int[] f39878X;

    /* JADX INFO: renamed from: Y */
    @p7e({p7e.EnumC10826a.f69935b})
    public int[] f39879Y;

    /* JADX INFO: renamed from: Z */
    public int f39880Z;

    /* JADX INFO: renamed from: Z1 */
    public String[] f39881Z1;

    /* JADX INFO: renamed from: gif$a */
    public interface InterfaceC6323a {
        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: renamed from: gif$b */
    public interface InterfaceC6324b {
        boolean setViewValue(View view, Cursor cursor, int i);
    }

    @Deprecated
    public gif(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f39880Z = -1;
        this.f39879Y = iArr;
        this.f39881Z1 = strArr;
        findColumns(cursor, strArr);
    }

    private void findColumns(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f39878X = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f39878X;
        if (iArr == null || iArr.length != length) {
            this.f39878X = new int[length];
        }
        for (int i = 0; i < length; i++) {
            this.f39878X[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
    }

    @Override // p000.ha3
    public void bindView(View view, Context context, Cursor cursor) {
        InterfaceC6324b interfaceC6324b = this.f39877V1;
        int[] iArr = this.f39879Y;
        int length = iArr.length;
        int[] iArr2 = this.f39878X;
        for (int i = 0; i < length; i++) {
            View viewFindViewById = view.findViewById(iArr[i]);
            if (viewFindViewById != null) {
                if (interfaceC6324b != null ? interfaceC6324b.setViewValue(viewFindViewById, cursor, iArr2[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        setViewText((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        setViewImage((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    public void changeCursorAndColumns(Cursor cursor, String[] strArr, int[] iArr) {
        this.f39881Z1 = strArr;
        this.f39879Y = iArr;
        findColumns(cursor, strArr);
        super.changeCursor(cursor);
    }

    @Override // p000.ha3, p000.xa3.InterfaceC15012a
    public CharSequence convertToString(Cursor cursor) {
        InterfaceC6323a interfaceC6323a = this.f39876M1;
        if (interfaceC6323a != null) {
            return interfaceC6323a.convertToString(cursor);
        }
        int i = this.f39880Z;
        return i > -1 ? cursor.getString(i) : super.convertToString(cursor);
    }

    public InterfaceC6323a getCursorToStringConverter() {
        return this.f39876M1;
    }

    public int getStringConversionColumn() {
        return this.f39880Z;
    }

    public InterfaceC6324b getViewBinder() {
        return this.f39877V1;
    }

    public void setCursorToStringConverter(InterfaceC6323a interfaceC6323a) {
        this.f39876M1 = interfaceC6323a;
    }

    public void setStringConversionColumn(int i) {
        this.f39880Z = i;
    }

    public void setViewBinder(InterfaceC6324b interfaceC6324b) {
        this.f39877V1 = interfaceC6324b;
    }

    public void setViewImage(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void setViewText(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // p000.ha3
    public Cursor swapCursor(Cursor cursor) {
        findColumns(cursor, this.f39881Z1);
        return super.swapCursor(cursor);
    }

    public gif(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f39880Z = -1;
        this.f39879Y = iArr;
        this.f39881Z1 = strArr;
        findColumns(cursor, strArr);
    }
}
