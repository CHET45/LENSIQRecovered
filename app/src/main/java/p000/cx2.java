package p000;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes.dex */
public final class cx2 {
    @yfb
    public static final ContentValues contentValuesOf(@yfb scc<String, ? extends Object>... sccVarArr) {
        ContentValues contentValues = new ContentValues(sccVarArr.length);
        for (scc<String, ? extends Object> sccVar : sccVarArr) {
            String strComponent1 = sccVar.component1();
            Object objComponent2 = sccVar.component2();
            if (objComponent2 == null) {
                contentValues.putNull(strComponent1);
            } else if (objComponent2 instanceof String) {
                contentValues.put(strComponent1, (String) objComponent2);
            } else if (objComponent2 instanceof Integer) {
                contentValues.put(strComponent1, (Integer) objComponent2);
            } else if (objComponent2 instanceof Long) {
                contentValues.put(strComponent1, (Long) objComponent2);
            } else if (objComponent2 instanceof Boolean) {
                contentValues.put(strComponent1, (Boolean) objComponent2);
            } else if (objComponent2 instanceof Float) {
                contentValues.put(strComponent1, (Float) objComponent2);
            } else if (objComponent2 instanceof Double) {
                contentValues.put(strComponent1, (Double) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                contentValues.put(strComponent1, (byte[]) objComponent2);
            } else if (objComponent2 instanceof Byte) {
                contentValues.put(strComponent1, (Byte) objComponent2);
            } else {
                if (!(objComponent2 instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + strComponent1 + '\"');
                }
                contentValues.put(strComponent1, (Short) objComponent2);
            }
        }
        return contentValues;
    }
}
