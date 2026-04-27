package p000;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.C0392R;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class cfg extends a6e implements View.OnClickListener {

    /* JADX INFO: renamed from: i2 */
    public static final boolean f16429i2 = false;

    /* JADX INFO: renamed from: j2 */
    public static final String f16430j2 = "SuggestionsAdapter";

    /* JADX INFO: renamed from: k2 */
    public static final int f16431k2 = 50;

    /* JADX INFO: renamed from: l2 */
    public static final int f16432l2 = 0;

    /* JADX INFO: renamed from: m2 */
    public static final int f16433m2 = 1;

    /* JADX INFO: renamed from: n2 */
    public static final int f16434n2 = 2;

    /* JADX INFO: renamed from: o2 */
    public static final int f16435o2 = -1;

    /* JADX INFO: renamed from: M1 */
    public final WeakHashMap<String, Drawable.ConstantState> f16436M1;

    /* JADX INFO: renamed from: V1 */
    public final int f16437V1;

    /* JADX INFO: renamed from: X */
    public final SearchView f16438X;

    /* JADX INFO: renamed from: Y */
    public final SearchableInfo f16439Y;

    /* JADX INFO: renamed from: Z */
    public final Context f16440Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f16441Z1;

    /* JADX INFO: renamed from: a2 */
    public int f16442a2;

    /* JADX INFO: renamed from: b2 */
    public ColorStateList f16443b2;

    /* JADX INFO: renamed from: c2 */
    public int f16444c2;

    /* JADX INFO: renamed from: d2 */
    public int f16445d2;

    /* JADX INFO: renamed from: e2 */
    public int f16446e2;

    /* JADX INFO: renamed from: f2 */
    public int f16447f2;

    /* JADX INFO: renamed from: g2 */
    public int f16448g2;

    /* JADX INFO: renamed from: h2 */
    public int f16449h2;

    /* JADX INFO: renamed from: cfg$a */
    public static final class C2299a {

        /* JADX INFO: renamed from: a */
        public final TextView f16450a;

        /* JADX INFO: renamed from: b */
        public final TextView f16451b;

        /* JADX INFO: renamed from: c */
        public final ImageView f16452c;

        /* JADX INFO: renamed from: d */
        public final ImageView f16453d;

        /* JADX INFO: renamed from: e */
        public final ImageView f16454e;

        public C2299a(View view) {
            this.f16450a = (TextView) view.findViewById(R.id.text1);
            this.f16451b = (TextView) view.findViewById(R.id.text2);
            this.f16452c = (ImageView) view.findViewById(R.id.icon1);
            this.f16453d = (ImageView) view.findViewById(R.id.icon2);
            this.f16454e = (ImageView) view.findViewById(C0392R.id.edit_query);
        }
    }

    public cfg(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f16441Z1 = false;
        this.f16442a2 = 1;
        this.f16444c2 = -1;
        this.f16445d2 = -1;
        this.f16446e2 = -1;
        this.f16447f2 = -1;
        this.f16448g2 = -1;
        this.f16449h2 = -1;
        this.f16438X = searchView;
        this.f16439Y = searchableInfo;
        this.f16437V1 = searchView.getSuggestionCommitIconResId();
        this.f16440Z = context;
        this.f16436M1 = weakHashMap;
    }

    private Drawable checkIconCache(String str) {
        Drawable.ConstantState constantState = this.f16436M1.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence formatUrl(CharSequence charSequence) {
        if (this.f16443b2 == null) {
            TypedValue typedValue = new TypedValue();
            this.f16440Z.getTheme().resolveAttribute(C0392R.attr.textColorSearchUrl, typedValue, true);
            this.f16443b2 = this.f16440Z.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f16443b2, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable getActivityIcon(ComponentName componentName) {
        PackageManager packageManager = this.f16440Z.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w(f16430j2, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(f16430j2, e.toString());
            return null;
        }
    }

    private Drawable getActivityIconWithCache(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f16436M1.containsKey(strFlattenToShortString)) {
            Drawable activityIcon = getActivityIcon(componentName);
            this.f16436M1.put(strFlattenToShortString, activityIcon != null ? activityIcon.getConstantState() : null);
            return activityIcon;
        }
        Drawable.ConstantState constantState = this.f16436M1.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f16440Z.getResources());
    }

    public static String getColumnString(Cursor cursor, String str) {
        return getStringOrNull(cursor, cursor.getColumnIndex(str));
    }

    private Drawable getDefaultIcon1() {
        Drawable activityIconWithCache = getActivityIconWithCache(this.f16439Y.getSearchActivity());
        return activityIconWithCache != null ? activityIconWithCache : this.f16440Z.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable getDrawable(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m3935d(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f16440Z.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e) {
                    Log.e(f16430j2, "Error closing icon stream for " + uri, e);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w(f16430j2, "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w(f16430j2, "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    private Drawable getDrawableFromResourceValue(String str) {
        if (str == null || str.isEmpty() || a43.f347l.equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f16440Z.getPackageName() + pj4.f71071b + i;
            Drawable drawableCheckIconCache = checkIconCache(str2);
            if (drawableCheckIconCache != null) {
                return drawableCheckIconCache;
            }
            Drawable drawable = lx2.getDrawable(this.f16440Z, i);
            storeInIconCache(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w(f16430j2, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableCheckIconCache2 = checkIconCache(str);
            if (drawableCheckIconCache2 != null) {
                return drawableCheckIconCache2;
            }
            Drawable drawable2 = getDrawable(Uri.parse(str));
            storeInIconCache(str, drawable2);
            return drawable2;
        }
    }

    private Drawable getIcon1(Cursor cursor) {
        int i = this.f16447f2;
        if (i == -1) {
            return null;
        }
        Drawable drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(i));
        return drawableFromResourceValue != null ? drawableFromResourceValue : getDefaultIcon1();
    }

    private Drawable getIcon2(Cursor cursor) {
        int i = this.f16448g2;
        if (i == -1) {
            return null;
        }
        return getDrawableFromResourceValue(cursor.getString(i));
    }

    private static String getStringOrNull(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(f16430j2, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void storeInIconCache(String str, Drawable drawable) {
        if (drawable != null) {
            this.f16436M1.put(str, drawable.getConstantState());
        }
    }

    private void updateSpinnerState(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p000.ha3
    public void bindView(View view, Context context, Cursor cursor) {
        C2299a c2299a = (C2299a) view.getTag();
        int i = this.f16449h2;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c2299a.f16450a != null) {
            setViewText(c2299a.f16450a, getStringOrNull(cursor, this.f16444c2));
        }
        if (c2299a.f16451b != null) {
            String stringOrNull = getStringOrNull(cursor, this.f16446e2);
            CharSequence url = stringOrNull != null ? formatUrl(stringOrNull) : getStringOrNull(cursor, this.f16445d2);
            if (TextUtils.isEmpty(url)) {
                TextView textView = c2299a.f16450a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c2299a.f16450a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c2299a.f16450a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c2299a.f16450a.setMaxLines(1);
                }
            }
            setViewText(c2299a.f16451b, url);
        }
        ImageView imageView = c2299a.f16452c;
        if (imageView != null) {
            setViewDrawable(imageView, getIcon1(cursor), 4);
        }
        ImageView imageView2 = c2299a.f16453d;
        if (imageView2 != null) {
            setViewDrawable(imageView2, getIcon2(cursor), 8);
        }
        int i3 = this.f16442a2;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c2299a.f16454e.setVisibility(8);
            return;
        }
        c2299a.f16454e.setVisibility(0);
        c2299a.f16454e.setTag(c2299a.f16450a.getText());
        c2299a.f16454e.setOnClickListener(this);
    }

    @Override // p000.ha3, p000.xa3.InterfaceC15012a
    public void changeCursor(Cursor cursor) {
        if (this.f16441Z1) {
            Log.w(f16430j2, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f16444c2 = cursor.getColumnIndex("suggest_text_1");
                this.f16445d2 = cursor.getColumnIndex("suggest_text_2");
                this.f16446e2 = cursor.getColumnIndex("suggest_text_2_url");
                this.f16447f2 = cursor.getColumnIndex("suggest_icon_1");
                this.f16448g2 = cursor.getColumnIndex("suggest_icon_2");
                this.f16449h2 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(f16430j2, "error changing cursor and caching columns", e);
        }
    }

    public void close() {
        changeCursor(null);
        this.f16441Z1 = true;
    }

    @Override // p000.ha3, p000.xa3.InterfaceC15012a
    public CharSequence convertToString(Cursor cursor) {
        String columnString;
        String columnString2;
        if (cursor == null) {
            return null;
        }
        String columnString3 = getColumnString(cursor, "suggest_intent_query");
        if (columnString3 != null) {
            return columnString3;
        }
        if (this.f16439Y.shouldRewriteQueryFromData() && (columnString2 = getColumnString(cursor, "suggest_intent_data")) != null) {
            return columnString2;
        }
        if (!this.f16439Y.shouldRewriteQueryFromText() || (columnString = getColumnString(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return columnString;
    }

    /* JADX INFO: renamed from: d */
    public Drawable m3935d(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f16440Z.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX INFO: renamed from: e */
    public Cursor m3936e(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f16440Z.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p000.ha3, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(f16430j2, "Search suggestions cursor threw exception.", e);
            View viewNewDropDownView = newDropDownView(this.f16440Z, getCursor(), viewGroup);
            if (viewNewDropDownView != null) {
                ((C2299a) viewNewDropDownView.getTag()).f16450a.setText(e.toString());
            }
            return viewNewDropDownView;
        }
    }

    public int getQueryRefinement() {
        return this.f16442a2;
    }

    @Override // p000.ha3, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(f16430j2, "Search suggestions cursor threw exception.", e);
            View viewNewView = newView(this.f16440Z, getCursor(), viewGroup);
            if (viewNewView != null) {
                ((C2299a) viewNewView.getTag()).f16450a.setText(e.toString());
            }
            return viewNewView;
        }
    }

    @Override // p000.ha3, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // p000.a6e, p000.ha3
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new C2299a(viewNewView));
        ((ImageView) viewNewView.findViewById(C0392R.id.edit_query)).setImageResource(this.f16437V1);
        return viewNewView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f16438X.m1151y((CharSequence) tag);
        }
    }

    @Override // p000.ha3, p000.xa3.InterfaceC15012a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f16438X.getVisibility() == 0 && this.f16438X.getWindowVisibility() == 0) {
            try {
                Cursor cursorM3936e = m3936e(this.f16439Y, string, 50);
                if (cursorM3936e != null) {
                    cursorM3936e.getCount();
                    return cursorM3936e;
                }
            } catch (RuntimeException e) {
                Log.w(f16430j2, "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public void setQueryRefinement(int i) {
        this.f16442a2 = i;
    }
}
