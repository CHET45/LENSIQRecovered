package p000;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* JADX INFO: renamed from: n7 */
/* JADX INFO: loaded from: classes3.dex */
public class C9716n7 {

    /* JADX INFO: renamed from: a */
    public final AccessibilityRecord f63426a;

    @Deprecated
    public C9716n7(Object obj) {
        this.f63426a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static C9716n7 obtain(C9716n7 c9716n7) {
        return new C9716n7(AccessibilityRecord.obtain(c9716n7.f63426a));
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9716n7)) {
            return false;
        }
        C9716n7 c9716n7 = (C9716n7) obj;
        AccessibilityRecord accessibilityRecord = this.f63426a;
        return accessibilityRecord == null ? c9716n7.f63426a == null : accessibilityRecord.equals(c9716n7.f63426a);
    }

    @Deprecated
    public int getAddedCount() {
        return this.f63426a.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.f63426a.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.f63426a.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.f63426a.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.f63426a.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.f63426a.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.f63426a;
    }

    @Deprecated
    public int getItemCount() {
        return this.f63426a.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.f63426a);
    }

    @Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.f63426a);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.f63426a.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.f63426a.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.f63426a.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.f63426a.getScrollY();
    }

    @igg({"KotlinPropertyAccess"})
    @Deprecated
    public C6730h7 getSource() {
        return C6730h7.m12171b(this.f63426a.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        return this.f63426a.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.f63426a.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.f63426a.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f63426a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.f63426a.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.f63426a.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.f63426a.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.f63426a.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.f63426a.isScrollable();
    }

    @Deprecated
    public void recycle() {
        this.f63426a.recycle();
    }

    @Deprecated
    public void setAddedCount(int i) {
        this.f63426a.setAddedCount(i);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        this.f63426a.setBeforeText(charSequence);
    }

    @Deprecated
    public void setChecked(boolean z) {
        this.f63426a.setChecked(z);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        this.f63426a.setClassName(charSequence);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        this.f63426a.setContentDescription(charSequence);
    }

    @Deprecated
    public void setCurrentItemIndex(int i) {
        this.f63426a.setCurrentItemIndex(i);
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.f63426a.setEnabled(z);
    }

    @Deprecated
    public void setFromIndex(int i) {
        this.f63426a.setFromIndex(i);
    }

    @Deprecated
    public void setFullScreen(boolean z) {
        this.f63426a.setFullScreen(z);
    }

    @Deprecated
    public void setItemCount(int i) {
        this.f63426a.setItemCount(i);
    }

    @Deprecated
    public void setMaxScrollX(int i) {
        setMaxScrollX(this.f63426a, i);
    }

    @Deprecated
    public void setMaxScrollY(int i) {
        setMaxScrollY(this.f63426a, i);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        this.f63426a.setParcelableData(parcelable);
    }

    @Deprecated
    public void setPassword(boolean z) {
        this.f63426a.setPassword(z);
    }

    @Deprecated
    public void setRemovedCount(int i) {
        this.f63426a.setRemovedCount(i);
    }

    @Deprecated
    public void setScrollX(int i) {
        this.f63426a.setScrollX(i);
    }

    @Deprecated
    public void setScrollY(int i) {
        this.f63426a.setScrollY(i);
    }

    @Deprecated
    public void setScrollable(boolean z) {
        this.f63426a.setScrollable(z);
    }

    @igg({"KotlinPropertyAccess"})
    @Deprecated
    public void setSource(View view) {
        this.f63426a.setSource(view);
    }

    @Deprecated
    public void setToIndex(int i) {
        this.f63426a.setToIndex(i);
    }

    public static int getMaxScrollX(@efb AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int getMaxScrollY(@efb AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static C9716n7 obtain() {
        return new C9716n7(AccessibilityRecord.obtain());
    }

    public static void setMaxScrollX(@efb AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void setMaxScrollY(@efb AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    @Deprecated
    public void setSource(View view, int i) {
        setSource(this.f63426a, view, i);
    }

    public static void setSource(@efb AccessibilityRecord accessibilityRecord, @hib View view, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
