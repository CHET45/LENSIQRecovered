package p000;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "CursorUtil")
@p7e({p7e.EnumC10826a.f69936c})
public final class bb3 {

    /* JADX INFO: renamed from: bb3$a */
    public static final class C1819a extends CursorWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f13221a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int[] f13222b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1819a(Cursor cursor, String[] strArr, int[] iArr) {
            super(cursor);
            this.f13221a = strArr;
            this.f13222b = iArr;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public int getColumnIndex(@yfb String str) {
            md8.checkNotNullParameter(str, "columnName");
            String[] strArr = this.f13221a;
            int[] iArr = this.f13222b;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                if (h9g.equals(strArr[i], str, true)) {
                    return iArr[i2];
                }
                i++;
                i2 = i3;
            }
            return super.getColumnIndex(str);
        }
    }

    @yfb
    public static final Cursor copyAndClose(@yfb Cursor cursor) {
        md8.checkNotNullParameter(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor.getString(i);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = cursor.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            u52.closeFinally(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        return -1;
    }

    public static final int getColumnIndex(@yfb Cursor cursor, @yfb String str) {
        md8.checkNotNullParameter(cursor, "c");
        md8.checkNotNullParameter(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(cursor, str);
    }

    public static final int getColumnIndexOrThrow(@yfb Cursor cursor, @yfb String str) {
        String strJoinToString$default;
        md8.checkNotNullParameter(cursor, "c");
        md8.checkNotNullParameter(str, "name");
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            md8.checkNotNullExpressionValue(columnNames, "c.columnNames");
            strJoinToString$default = e80.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (qy6) null, 63, (Object) null);
        } catch (Exception unused) {
            strJoinToString$default = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strJoinToString$default);
    }

    public static final <R> R useCursor(@yfb Cursor cursor, @yfb qy6<? super Cursor, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cursor, "<this>");
        md8.checkNotNullParameter(qy6Var, "block");
        try {
            R rInvoke = qy6Var.invoke(cursor);
            o28.finallyStart(1);
            u52.closeFinally(cursor, null);
            o28.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }

    @yfb
    public static final Cursor wrapMappedColumns(@yfb Cursor cursor, @yfb String[] strArr, @yfb int[] iArr) {
        md8.checkNotNullParameter(cursor, "cursor");
        md8.checkNotNullParameter(strArr, "columnNames");
        md8.checkNotNullParameter(iArr, "mapping");
        if (strArr.length == iArr.length) {
            return new C1819a(cursor, strArr, iArr);
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }

    @fdi(otherwise = 2)
    public static final int findColumnIndexBySuffix(@yfb String[] strArr, @yfb String str) {
        md8.checkNotNullParameter(strArr, "columnNames");
        md8.checkNotNullParameter(str, "name");
        String str2 = a18.f100c + str;
        String str3 = a18.f100c + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            int i3 = i2 + 1;
            if (str4.length() >= str.length() + 2) {
                if (h9g.endsWith$default(str4, str2, false, 2, null)) {
                    return i2;
                }
                if (str4.charAt(0) == '`' && h9g.endsWith$default(str4, str3, false, 2, null)) {
                    return i2;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }
}
